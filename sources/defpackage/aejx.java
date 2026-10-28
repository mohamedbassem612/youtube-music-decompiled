package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.system.ErrnoException;
import android.system.Os;
import android.view.Surface;
import j$.util.concurrent.atomic.DesugarAtomicLong;
import j$.util.function.LongUnaryOperator$CC;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aejx implements aejy {
    private MediaCodec a;
    private MediaMuxer b;
    private FileDescriptor d;
    private final mbc f;
    private int c = -1;
    private boolean e = false;
    private final AtomicLong g = new AtomicLong(0);

    public aejx(mbc mbcVar) {
        this.f = mbcVar;
    }

    private final void g(boolean z) {
        MediaCodec mediaCodec = this.a;
        mediaCodec.getClass();
        MediaMuxer mediaMuxer = this.b;
        mediaMuxer.getClass();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        while (true) {
            int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 1000L);
            if (iDequeueOutputBuffer == -1) {
                return;
            }
            if (iDequeueOutputBuffer == -2) {
                if (this.c < 0) {
                    this.c = mediaMuxer.addTrack(mediaCodec.getOutputFormat());
                    mediaMuxer.start();
                    this.e = true;
                }
            } else if (iDequeueOutputBuffer >= 0) {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(iDequeueOutputBuffer);
                if (this.e && bufferInfo.size > 0 && outputBuffer != null) {
                    mediaMuxer.writeSampleData(this.c, outputBuffer, bufferInfo);
                }
                mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((bufferInfo.flags & 4) != 0 && z) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    private final void h(byte[] bArr, int i, boolean z) {
        int iDequeueInputBuffer;
        int iDequeueInputBuffer2;
        int i2;
        ByteBuffer inputBuffer;
        long jC = this.f.c() / 1000;
        MediaCodec mediaCodec = this.a;
        mediaCodec.getClass();
        if (z) {
            while (true) {
                iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(1000L);
                if (iDequeueInputBuffer >= 0) {
                    break;
                } else if (iDequeueInputBuffer == -1) {
                    g(false);
                }
            }
            mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, jC, 4);
        } else {
            while (true) {
                iDequeueInputBuffer2 = mediaCodec.dequeueInputBuffer(1000L);
                if (iDequeueInputBuffer2 >= 0) {
                    inputBuffer = mediaCodec.getInputBuffer(iDequeueInputBuffer2);
                    if (inputBuffer != null) {
                        break;
                    } else {
                        i2 = i;
                    }
                } else {
                    i2 = i;
                    if (iDequeueInputBuffer2 == -1) {
                        g(false);
                    }
                }
                i = i2;
            }
            inputBuffer.clear();
            if (bArr != null) {
                ahno.L(i <= inputBuffer.remaining(), "Input length %s is larger than input buffer size %s", i, inputBuffer.remaining());
                inputBuffer.put(bArr, 0, i);
            }
            mediaCodec.queueInputBuffer(iDequeueInputBuffer2, 0, i, jC, 0);
        }
        g(z);
    }

    @Override // defpackage.aejy
    public final aigj a() {
        int i;
        byte[] bArr;
        int iPread;
        h(null, 0, true);
        aigj aigjVarW = aigj.d;
        try {
            try {
                MediaCodec mediaCodec = this.a;
                mediaCodec.getClass();
                mediaCodec.stop();
                if (this.e) {
                    MediaMuxer mediaMuxer = this.b;
                    mediaMuxer.getClass();
                    mediaMuxer.stop();
                }
                FileDescriptor fileDescriptor = this.d;
                if (fileDescriptor != null) {
                    try {
                        long j = this.g.get();
                        long j2 = Os.fstat(fileDescriptor).st_size;
                        if (j2 > j && (iPread = Os.pread(fileDescriptor, (bArr = new byte[(i = (int) (j2 - j))]), 0, i, j)) > 0) {
                            aigjVarW = aigj.w(bArr, 0, iPread);
                        }
                    } catch (ErrnoException | InterruptedIOException e) {
                        ((agrc) ((agrc) ((agrc) aejz.a.b()).j(e)).k("com/google/android/libraries/youtube/search/voice/StreamingAudioEncoder$OggOpusEncoder", "flushAndStop", 580, "StreamingAudioEncoder.java")).t("Error reading memFd");
                    }
                }
            } catch (RuntimeException e2) {
                ((agrc) ((agrc) ((agrc) aejz.a.b()).j(e2)).k("com/google/android/libraries/youtube/search/voice/StreamingAudioEncoder$OggOpusEncoder", "flushAndStop", 584, "StreamingAudioEncoder.java")).t("Error stopping codec/muxer");
            }
            return aigjVarW;
        } finally {
            MediaCodec mediaCodec2 = this.a;
            if (mediaCodec2 != null) {
                mediaCodec2.release();
                this.a = null;
            }
            MediaMuxer mediaMuxer2 = this.b;
            if (mediaMuxer2 != null) {
                mediaMuxer2.release();
            }
        }
    }

    @Override // defpackage.aejy
    public final FileDescriptor b() {
        return this.d;
    }

    @Override // defpackage.aejy
    public final void c(final long j) {
        DesugarAtomicLong.updateAndGet(this.g, new LongUnaryOperator() { // from class: aejw
            public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
                return LongUnaryOperator$CC.$default$andThen(this, longUnaryOperator);
            }

            @Override // java.util.function.LongUnaryOperator
            public final long applyAsLong(long j2) {
                return Math.max(j2, j);
            }

            public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
                return LongUnaryOperator$CC.$default$compose(this, longUnaryOperator);
            }
        });
    }

    @Override // defpackage.aejy
    public final aigj d(byte[] bArr, int i) {
        h(bArr, i, false);
        return aigj.d;
    }

    @Override // defpackage.aejy
    public final void e(int i, int i2) throws IOException {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "audio/opus");
        mediaFormat.setInteger("sample-rate", i);
        mediaFormat.setInteger("channel-count", 1);
        mediaFormat.setInteger("bitrate", i2 - 1);
        mediaFormat.setInteger("bitrate-mode", 1);
        mediaFormat.setInteger("max-input-size", 7680);
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/opus");
        this.a = mediaCodecCreateEncoderByType;
        mediaCodecCreateEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
        try {
            this.d = Os.memfd_create("in_memory_" + String.valueOf(UUID.randomUUID()), 0);
            this.b = new MediaMuxer(this.d, 4);
            mediaCodecCreateEncoderByType.start();
            this.c = -1;
            this.e = false;
        } catch (ErrnoException e) {
            throw new IOException("Failed to create memfd", e);
        }
    }

    public final void f() {
        FileDescriptor fileDescriptor = this.d;
        if (fileDescriptor != null) {
            try {
                Os.close(fileDescriptor);
            } catch (ErrnoException e) {
                ((agrc) ((agrc) ((agrc) aejz.a.b()).j(e)).k("com/google/android/libraries/youtube/search/voice/StreamingAudioEncoder$OggOpusEncoder", "cleanupResources", 691, "StreamingAudioEncoder.java")).t("Error closing memFd");
            } finally {
                this.d = null;
            }
        }
    }
}
