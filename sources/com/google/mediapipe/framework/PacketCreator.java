package com.google.mediapipe.framework;

import defpackage.a;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class PacketCreator {
    protected final Graph a;

    public PacketCreator(Graph graph) {
        this.a = graph;
    }

    private native long nativeCreateAudioPacket(long j, byte[] bArr, int i, int i2, int i3);

    private native long nativeCreateAudioPacketDirect(long j, ByteBuffer byteBuffer, int i, int i2);

    private native long nativeCreateGpuBuffer(long j, int i, int i2, int i3, int i4, TextureReleaseCallback textureReleaseCallback, int i5);

    private void releaseWithSyncToken(long j, TextureReleaseCallback textureReleaseCallback) {
        textureReleaseCallback.release(new GraphGlSyncToken(j));
    }

    public final Packet a(ByteBuffer byteBuffer, int i, int i2) {
        int iRemaining = byteBuffer.remaining();
        int i3 = (i * i2) << 1;
        if (i3 != iRemaining) {
            throw new IllegalArgumentException(a.bQ(iRemaining, i3, "Please check the audio data size, has to be num_channels * num_samples * 2 = ", " but was "));
        }
        if (byteBuffer.isDirect()) {
            return Packet.create(nativeCreateAudioPacketDirect(this.a.a(), byteBuffer.slice(), i, i2));
        }
        if (byteBuffer.hasArray()) {
            return Packet.create(nativeCreateAudioPacket(this.a.a(), byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i, i2));
        }
        throw new IllegalArgumentException("Data must be either a direct byte buffer or be backed by a byte array.");
    }

    public final Packet b(TextureFrame textureFrame) {
        return Packet.create(nativeCreateGpuBuffer(this.a.a(), textureFrame.getTextureName(), textureFrame.getWidth(), textureFrame.getHeight(), textureFrame.getFormat(), textureFrame, 0));
    }
}
