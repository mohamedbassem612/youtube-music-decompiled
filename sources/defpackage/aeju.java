package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import app.rive.semantics.SemanticState;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aeju implements aejy {
    private boolean a;
    private MediaCodec b;
    private boolean c;
    private boolean d;
    private int e = 1;

    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    private final void f(byte[] bArr, int i, int i2, boolean z, aigi aigiVar) {
        boolean z2;
        MediaCodec mediaCodec;
        int i3;
        long j;
        boolean z3;
        boolean z4;
        int i4 = i2;
        boolean z5 = true;
        ahno.G(i4 <= 4096, "length must be less than or equal to CHUNK_SIZE_BYTES!");
        MediaCodec mediaCodec2 = this.b;
        mediaCodec2.getClass();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        boolean z6 = false;
        while (true) {
            if (!z6) {
                z2 = z;
            } else if (!z) {
                return;
            } else {
                z2 = z5;
            }
            if (z6) {
                mediaCodec = mediaCodec2;
                i3 = -1;
                j = 1000;
                z3 = z6;
            } else {
                if (z2 && this.c) {
                    throw new IllegalStateException("Already flushed!");
                }
                int iDequeueInputBuffer = mediaCodec2.dequeueInputBuffer(1000L);
                if (iDequeueInputBuffer == -1) {
                    mediaCodec = mediaCodec2;
                    i3 = -1;
                    j = 1000;
                    z3 = z6;
                } else if (z2) {
                    mediaCodec2.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                    this.c = z5;
                    mediaCodec = mediaCodec2;
                    i3 = -1;
                    z3 = z5;
                    j = 1000;
                } else {
                    mediaCodec2.getInputBuffer(iDequeueInputBuffer).put(bArr, i, i4);
                    mediaCodec = mediaCodec2;
                    j = 1000;
                    i3 = -1;
                    mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, i4, 0L, 0);
                    z3 = true;
                }
            }
            int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j);
            if (iDequeueOutputBuffer == i3) {
                z4 = true;
            } else if (iDequeueOutputBuffer != -2) {
                z4 = true;
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(iDequeueOutputBuffer);
                byte[] bArr2 = new byte[bufferInfo.size];
                outputBuffer.get(bArr2);
                mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                try {
                    aigiVar.write(bArr2);
                } catch (IOException e) {
                    ((agrc) ((agrc) ((agrc) aejz.a.b()).j(e)).k("com/google/android/libraries/youtube/search/voice/StreamingAudioEncoder$AndroidSystemEncoder", "processAudioBytesInternal", (char) 446, "StreamingAudioEncoder.java")).t("Unable to write bytes into buffer!");
                }
            } else {
                if (this.a) {
                    throw new IllegalStateException("The codec format was unexpectedly changed.");
                }
                z4 = true;
                this.a = true;
            }
            if ((bufferInfo.flags & 4) != 0) {
                if (!z3) {
                    throw new IllegalStateException("Didn't process input yet.");
                }
                return;
            } else {
                mediaCodec2 = mediaCodec;
                bufferInfo = bufferInfo;
                i4 = i2;
                z6 = z3;
                z5 = z4;
            }
        }
    }

    @Override // defpackage.aejy
    public final aigj a() {
        aigj aigjVar = aigj.d;
        aigi aigiVar = new aigi(SemanticState.Focused);
        try {
            f(null, 0, 0, true, aigiVar);
            MediaCodec mediaCodec = this.b;
            mediaCodec.getClass();
            mediaCodec.stop();
        } catch (MediaCodec.CodecException e) {
            ((agrc) ((agrc) ((agrc) aejz.a.b()).j(e)).k("com/google/android/libraries/youtube/search/voice/StreamingAudioEncoder$AndroidSystemEncoder", "flushAndStop", (char) 375, "StreamingAudioEncoder.java")).t("Something went wrong in the underlying codec!");
        }
        MediaCodec mediaCodec2 = this.b;
        mediaCodec2.getClass();
        mediaCodec2.release();
        return aigiVar.b();
    }

    @Override // defpackage.aejy
    public final FileDescriptor b() {
        return null;
    }

    @Override // defpackage.aejy
    public final aigj d(byte[] bArr, int i) {
        aigj aigjVar = aigj.d;
        aigi aigiVar = new aigi(SemanticState.Focused);
        if (!this.d) {
            try {
                int i2 = this.e;
                int i3 = i2 - 1;
                byte[] bytes = null;
                if (i2 == 0) {
                    throw null;
                }
                if (i3 == 0) {
                    throw new IllegalStateException("Trying to make header for unspecified codec!");
                }
                if (i3 == 1) {
                    bytes = "#!AMR-WB\n".getBytes();
                } else if (i3 == 2) {
                    bytes = new byte[0];
                } else if (i3 == 3) {
                    throw new IllegalStateException("Should never happen! Use OggOpusEncoder instead.");
                }
                aigiVar.write(bytes);
                this.d = true;
            } catch (IOException e) {
                ((agrc) ((agrc) ((agrc) aejz.a.b()).j(e)).k("com/google/android/libraries/youtube/search/voice/StreamingAudioEncoder$AndroidSystemEncoder", "processAudioBytes", (char) 352, "StreamingAudioEncoder.java")).t("Unable to write bytes into buffer!");
            }
        }
        int i4 = 0;
        while (i4 < i) {
            int iMin = Math.min(SemanticState.Obscured, i - i4);
            f(bArr, i4, iMin, false, aigiVar);
            i4 += iMin;
        }
        return aigiVar.b();
    }

    @Override // defpackage.aejy
    public final void e(int i, int i2) throws IOException, aejv {
        int iF = aejz.f(i2);
        this.e = iF;
        if (iF == 1 || iF == 4) {
            throw new aejv("Codec not set properly.");
        }
        if (iF == 2) {
            if (i != 16000) {
                throw new aejv("AMR-WB encoder requires a sample rate of 16kHz.");
            }
            iF = 2;
        }
        MediaCodecInfo mediaCodecInfoA = aejz.a(aejz.d(iF));
        if (mediaCodecInfoA == null) {
            throw new aejv("Encoder not found.");
        }
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(mediaCodecInfoA.getName());
        this.b = mediaCodecCreateByCodecName;
        MediaFormat mediaFormat = new MediaFormat();
        int iF2 = aejz.f(i2);
        mediaFormat.setString("mime", aejz.d(iF2));
        mediaFormat.setInteger("sample-rate", i);
        mediaFormat.setInteger("channel-count", 1);
        mediaFormat.setInteger("max-input-size", SemanticState.Obscured);
        if (iF2 != 3) {
            mediaFormat.setInteger("bitrate", i2 - 1);
        }
        mediaCodecCreateByCodecName.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
        mediaCodecCreateByCodecName.start();
        this.d = false;
        this.c = false;
        this.a = false;
    }

    @Override // defpackage.aejy
    public final /* synthetic */ void c(long j) {
    }
}
