package com.google.mediapipe.framework;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import defpackage.ahxo;
import defpackage.aiik;
import defpackage.axst;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class PacketGetter {
    public static GraphTextureFrame a(Packet packet) {
        return new GraphTextureFrame(nativeGetGpuBuffer(packet.getNativeHandle(), true), packet.a());
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    public static MessageLite b(Packet packet, MessageLite messageLite) throws aiik {
        ProtoUtil$SerializedMessage protoUtil$SerializedMessage = new ProtoUtil$SerializedMessage();
        nativeGetProto(packet.getNativeHandle(), protoUtil$SerializedMessage);
        axst axstVar = ahxo.a;
        String str = (String) ahxo.a.a.get(messageLite.getClass());
        if (protoUtil$SerializedMessage.typeName.equals(str)) {
            return messageLite.getParserForType().h(protoUtil$SerializedMessage.value, ExtensionRegistryLite.getGeneratedRegistry());
        }
        throw new aiik("Message type does not match the expected type. Expected: " + str + " Got: " + protoUtil$SerializedMessage.typeName);
    }

    public static native byte[] nativeGetAudioData(long j);

    private static native long nativeGetGpuBuffer(long j, boolean z);

    public static native int nativeGetMatrixRows(long j);

    private static native void nativeGetProto(long j, ProtoUtil$SerializedMessage protoUtil$SerializedMessage);
}
