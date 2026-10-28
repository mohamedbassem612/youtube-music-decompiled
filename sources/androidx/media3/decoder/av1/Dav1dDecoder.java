package androidx.media3.decoder.av1;

import android.os.Process;
import android.view.Surface;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import defpackage.a;
import defpackage.ahno;
import defpackage.bwp;
import defpackage.cal;
import defpackage.cam;
import defpackage.cap;
import defpackage.caq;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class Dav1dDecoder implements cam {
    private static final int DAV1D_DECODE_ONLY = 2;
    private static final int DAV1D_EAGAIN = 3;
    private static final int DAV1D_ERROR = 0;
    private static final int DAV1D_OK = 1;
    private final DecoderInputBuffer[] allInputBuffers;
    private int availableInputBufferCount;
    private final DecoderInputBuffer[] availableInputBuffers;
    private int availableOutputBufferCount;
    private final VideoDecoderOutputBuffer[] availableOutputBuffers;
    private cal callback;
    private volatile long dav1dDecoderContext;
    private final Thread decodeThread;
    private DecoderInputBuffer dequeuedInputBuffer;
    private Dav1dDecoderException exception;
    private Executor executor;
    private boolean flushed;
    private final Object lock;
    private volatile int outputMode;
    private long outputStartTimeUs;
    private final ArrayDeque queuedInputBuffers;
    private final ArrayDeque queuedOutputBuffers;
    private boolean released;
    private int skippedOutputBufferCount;
    private Surface surface;

    public Dav1dDecoder(final int i, int i2, int i3, final int i4, final int i5, final boolean z, final int i6) throws Dav1dDecoderException {
        if (!Dav1dLibrary.isAvailable()) {
            throw new Dav1dDecoderException("Failed to load decoder native library.", -1);
        }
        this.lock = new Object();
        this.outputStartTimeUs = -9223372036854775807L;
        this.queuedInputBuffers = new ArrayDeque();
        this.queuedOutputBuffers = new ArrayDeque();
        this.allInputBuffers = new DecoderInputBuffer[i];
        this.availableInputBuffers = new DecoderInputBuffer[i];
        this.availableInputBufferCount = i;
        for (int i7 = 0; i7 < this.availableInputBufferCount; i7++) {
            this.allInputBuffers[i7] = new DecoderInputBuffer(2);
            this.allInputBuffers[i7].ensureSpaceForWrite(i3);
            this.availableInputBuffers[i7] = this.allInputBuffers[i7];
        }
        this.availableOutputBuffers = new VideoDecoderOutputBuffer[i2];
        this.availableOutputBufferCount = i2;
        for (int i8 = 0; i8 < this.availableOutputBufferCount; i8++) {
            this.availableOutputBuffers[i8] = new VideoDecoderOutputBuffer(new cap() { // from class: androidx.media3.decoder.av1.Dav1dDecoder$$ExternalSyntheticLambda1
                @Override // defpackage.cap
                public final void a(caq caqVar) {
                    this.a.releaseOutputBuffer((VideoDecoderOutputBuffer) caqVar);
                }
            });
        }
        Thread thread = new Thread(this) { // from class: androidx.media3.decoder.av1.Dav1dDecoder.1
            final /* synthetic */ Dav1dDecoder f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("ExoPlayer:Dav1dDecoder");
                this.f = this;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                try {
                    int i9 = i6;
                    if (i9 != -99) {
                        Process.setThreadPriority(i9);
                    }
                    Dav1dDecoder dav1dDecoder = this.f;
                    synchronized (dav1dDecoder.lock) {
                        dav1dDecoder.dav1dDecoderContext = dav1dDecoder.dav1dInit(i4, i5, z, i);
                        if (dav1dDecoder.dav1dCheckError(dav1dDecoder.dav1dDecoderContext) == 0) {
                            dav1dDecoder.exception = new Dav1dDecoderException("Failed to initialize decoder. Error: " + dav1dDecoder.dav1dGetErrorMessage(dav1dDecoder.dav1dDecoderContext), -1);
                            dav1dDecoder.releaseDecoderContext();
                            dav1dDecoder.lock.notify();
                        } else {
                            dav1dDecoder.lock.notify();
                            try {
                                this.f.run();
                            } finally {
                                this.f.releaseDecoderContext();
                            }
                        }
                    }
                } catch (RuntimeException e) {
                    Dav1dDecoder dav1dDecoder2 = this.f;
                    synchronized (dav1dDecoder2.lock) {
                        dav1dDecoder2.exception = new Dav1dDecoderException("Failed to set thread priority", e);
                        dav1dDecoder2.lock.notify();
                    }
                }
            }
        };
        this.decodeThread = thread;
        thread.start();
        synchronized (this.lock) {
            while (this.dav1dDecoderContext == 0 && this.exception == null && !this.released) {
                try {
                    this.lock.wait();
                } catch (InterruptedException e) {
                    this.released = true;
                    this.lock.notifyAll();
                    Thread.currentThread().interrupt();
                    throw new Dav1dDecoderException("Interrupted during initialization", e);
                }
            }
            maybeThrowException();
        }
    }

    private boolean canDecodeInputBuffer() {
        return !this.queuedInputBuffers.isEmpty();
    }

    private boolean canDecodeOutputBuffer() {
        return this.availableOutputBufferCount > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native int dav1dCheckError(long j);

    private native void dav1dClose(long j);

    private native int dav1dDecode(long j, DecoderInputBuffer decoderInputBuffer, int i, int i2, int i3, boolean z, int i4, long j2, int i5);

    private native void dav1dFlush(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native String dav1dGetErrorMessage(long j);

    private native int dav1dGetFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    private native int dav1dGetLastErrorJniStatusCode(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native long dav1dInit(int i, int i2, boolean z, int i3);

    private native void dav1dReleaseFrame(long j, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    private native int dav1dRenderFrame(long j, Surface surface, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    /* JADX WARN: Code duplicated, block: B:100:0x0154 A[Catch: all -> 0x0177, TryCatch #2 {all -> 0x0177, blocks: (B:77:0x00e8, B:79:0x00ec, B:80:0x00f2, B:87:0x011a, B:89:0x0122, B:91:0x0126, B:94:0x0139, B:96:0x014a, B:98:0x014e, B:100:0x0154, B:102:0x0158, B:103:0x015e, B:105:0x0162, B:106:0x0165, B:108:0x0167, B:109:0x0170, B:111:0x0173, B:95:0x0142), top: B:144:0x00e8, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0167 A[Catch: all -> 0x0177, TryCatch #2 {all -> 0x0177, blocks: (B:77:0x00e8, B:79:0x00ec, B:80:0x00f2, B:87:0x011a, B:89:0x0122, B:91:0x0126, B:94:0x0139, B:96:0x014a, B:98:0x014e, B:100:0x0154, B:102:0x0158, B:103:0x015e, B:105:0x0162, B:106:0x0165, B:108:0x0167, B:109:0x0170, B:111:0x0173, B:95:0x0142), top: B:144:0x00e8, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x00f3 A[EDGE_INSN: B:157:0x00f3->B:81:0x00f3 BREAK  A[LOOP:2: B:69:0x00d5->B:110:0x0171], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x015e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e1 A[DONT_INVERT, PHI: r2
      0x00e1: PHI (r2v16 int) = (r2v15 int), (r2v30 int) binds: [B:70:0x00dc, B:72:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e3 A[Catch: Dav1dDecoderException -> 0x0196, OutOfMemoryError -> 0x0199, RuntimeException -> 0x019f, TryCatch #7 {Dav1dDecoderException -> 0x0196, OutOfMemoryError -> 0x0199, RuntimeException -> 0x019f, blocks: (B:48:0x009c, B:49:0x00a9, B:51:0x00ae, B:56:0x00b8, B:60:0x00c7, B:61:0x00c9, B:66:0x00d2, B:69:0x00d5, B:84:0x00f8, B:85:0x00fd, B:86:0x0119, B:74:0x00e3, B:75:0x00e5, B:76:0x00e7, B:114:0x0176, B:117:0x0179, B:118:0x0195, B:54:0x00b4, B:62:0x00ca, B:63:0x00cf, B:77:0x00e8, B:79:0x00ec, B:80:0x00f2, B:87:0x011a, B:89:0x0122, B:91:0x0126, B:94:0x0139, B:96:0x014a, B:98:0x014e, B:100:0x0154, B:102:0x0158, B:103:0x015e, B:105:0x0162, B:106:0x0165, B:108:0x0167, B:109:0x0170, B:111:0x0173, B:95:0x0142), top: B:150:0x009c, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8 A[Catch: Dav1dDecoderException -> 0x0196, OutOfMemoryError -> 0x0199, RuntimeException -> 0x019f, TRY_ENTER, TryCatch #7 {Dav1dDecoderException -> 0x0196, OutOfMemoryError -> 0x0199, RuntimeException -> 0x019f, blocks: (B:48:0x009c, B:49:0x00a9, B:51:0x00ae, B:56:0x00b8, B:60:0x00c7, B:61:0x00c9, B:66:0x00d2, B:69:0x00d5, B:84:0x00f8, B:85:0x00fd, B:86:0x0119, B:74:0x00e3, B:75:0x00e5, B:76:0x00e7, B:114:0x0176, B:117:0x0179, B:118:0x0195, B:54:0x00b4, B:62:0x00ca, B:63:0x00cf, B:77:0x00e8, B:79:0x00ec, B:80:0x00f2, B:87:0x011a, B:89:0x0122, B:91:0x0126, B:94:0x0139, B:96:0x014a, B:98:0x014e, B:100:0x0154, B:102:0x0158, B:103:0x015e, B:105:0x0162, B:106:0x0165, B:108:0x0167, B:109:0x0170, B:111:0x0173, B:95:0x0142), top: B:150:0x009c, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x00fd A[Catch: Dav1dDecoderException -> 0x0196, OutOfMemoryError -> 0x0199, RuntimeException -> 0x019f, TryCatch #7 {Dav1dDecoderException -> 0x0196, OutOfMemoryError -> 0x0199, RuntimeException -> 0x019f, blocks: (B:48:0x009c, B:49:0x00a9, B:51:0x00ae, B:56:0x00b8, B:60:0x00c7, B:61:0x00c9, B:66:0x00d2, B:69:0x00d5, B:84:0x00f8, B:85:0x00fd, B:86:0x0119, B:74:0x00e3, B:75:0x00e5, B:76:0x00e7, B:114:0x0176, B:117:0x0179, B:118:0x0195, B:54:0x00b4, B:62:0x00ca, B:63:0x00cf, B:77:0x00e8, B:79:0x00ec, B:80:0x00f2, B:87:0x011a, B:89:0x0122, B:91:0x0126, B:94:0x0139, B:96:0x014a, B:98:0x014e, B:100:0x0154, B:102:0x0158, B:103:0x015e, B:105:0x0162, B:106:0x0165, B:108:0x0167, B:109:0x0170, B:111:0x0173, B:95:0x0142), top: B:150:0x009c, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x011a A[Catch: all -> 0x0177, TRY_ENTER, TryCatch #2 {all -> 0x0177, blocks: (B:77:0x00e8, B:79:0x00ec, B:80:0x00f2, B:87:0x011a, B:89:0x0122, B:91:0x0126, B:94:0x0139, B:96:0x014a, B:98:0x014e, B:100:0x0154, B:102:0x0158, B:103:0x015e, B:105:0x0162, B:106:0x0165, B:108:0x0167, B:109:0x0170, B:111:0x0173, B:95:0x0142), top: B:144:0x00e8, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0122 A[Catch: all -> 0x0177, TryCatch #2 {all -> 0x0177, blocks: (B:77:0x00e8, B:79:0x00ec, B:80:0x00f2, B:87:0x011a, B:89:0x0122, B:91:0x0126, B:94:0x0139, B:96:0x014a, B:98:0x014e, B:100:0x0154, B:102:0x0158, B:103:0x015e, B:105:0x0162, B:106:0x0165, B:108:0x0167, B:109:0x0170, B:111:0x0173, B:95:0x0142), top: B:144:0x00e8, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0142 A[Catch: all -> 0x0177, TryCatch #2 {all -> 0x0177, blocks: (B:77:0x00e8, B:79:0x00ec, B:80:0x00f2, B:87:0x011a, B:89:0x0122, B:91:0x0126, B:94:0x0139, B:96:0x014a, B:98:0x014e, B:100:0x0154, B:102:0x0158, B:103:0x015e, B:105:0x0162, B:106:0x0165, B:108:0x0167, B:109:0x0170, B:111:0x0173, B:95:0x0142), top: B:144:0x00e8, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x014e A[Catch: all -> 0x0177, TryCatch #2 {all -> 0x0177, blocks: (B:77:0x00e8, B:79:0x00ec, B:80:0x00f2, B:87:0x011a, B:89:0x0122, B:91:0x0126, B:94:0x0139, B:96:0x014a, B:98:0x014e, B:100:0x0154, B:102:0x0158, B:103:0x015e, B:105:0x0162, B:106:0x0165, B:108:0x0167, B:109:0x0170, B:111:0x0173, B:95:0x0142), top: B:144:0x00e8, outer: #7 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x00fd, please report this as an issue */
    private boolean decode() {
        Dav1dDecoderException dav1dDecoderExceptionCreateUnexpectedDecodeException;
        int i;
        int iDav1dGetFrame;
        synchronized (this.lock) {
            if (this.flushed) {
                flushInternal();
            }
            while (!this.released && ((!canDecodeInputBuffer() || !canDecodeOutputBuffer()) && !this.flushed)) {
                this.lock.wait();
            }
            if (this.released) {
                return false;
            }
            if (this.flushed) {
                flushInternal();
            } else {
                DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) this.queuedInputBuffers.removeFirst();
                VideoDecoderOutputBuffer[] videoDecoderOutputBufferArr = this.availableOutputBuffers;
                int i2 = this.availableOutputBufferCount - 1;
                this.availableOutputBufferCount = i2;
                VideoDecoderOutputBuffer videoDecoderOutputBuffer = videoDecoderOutputBufferArr[i2];
                if (decoderInputBuffer.isEndOfStream()) {
                    videoDecoderOutputBuffer.addFlag(4);
                    releaseInputBuffer(decoderInputBuffer);
                    synchronized (this.lock) {
                        if (this.flushed) {
                            videoDecoderOutputBuffer.release();
                            flushInternal();
                        } else {
                            videoDecoderOutputBuffer.skippedOutputBufferCount = this.skippedOutputBufferCount;
                            this.skippedOutputBufferCount = 0;
                            this.queuedOutputBuffers.addLast(videoDecoderOutputBuffer);
                            final cal calVar = this.callback;
                            Executor executor = this.executor;
                            if (calVar != null && executor != null) {
                                executor.execute(new Runnable() { // from class: androidx.media3.decoder.av1.Dav1dDecoder$$ExternalSyntheticLambda0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        calVar.ga();
                                    }
                                });
                            }
                        }
                    }
                } else {
                    boolean z = !isAtLeastOutputStartTimeUs(decoderInputBuffer.timeUs);
                    int i3 = true != decoderInputBuffer.isFirstSample() ? 0 : 134217728;
                    try {
                        ByteBuffer byteBuffer = decoderInputBuffer.data;
                        int i4 = bwp.a;
                        int iPosition = byteBuffer.position();
                        int iRemaining = byteBuffer.remaining();
                        int i5 = 0;
                        while (true) {
                            DecoderInputBuffer[] decoderInputBufferArr = this.allInputBuffers;
                            if (i5 >= decoderInputBufferArr.length) {
                                i = -1;
                                break;
                            }
                            if (decoderInputBufferArr[i5] == decoderInputBuffer) {
                                i = i5;
                                break;
                            }
                            i5++;
                        }
                        int iDav1dDecode = dav1dDecode(this.dav1dDecoderContext, decoderInputBuffer, i, iPosition, iRemaining, z, i3, decoderInputBuffer.timeUs, this.outputMode);
                        if (iDav1dDecode == 0) {
                            throw new Dav1dDecoderException("dav1dDecode error: " + dav1dGetErrorMessage(this.dav1dDecoderContext), -1);
                        }
                        if (iDav1dDecode == 3) {
                            synchronized (this.lock) {
                                try {
                                    this.queuedInputBuffers.addFirst(decoderInputBuffer);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            while (true) {
                                iDav1dGetFrame = dav1dGetFrame(this.dav1dDecoderContext, videoDecoderOutputBuffer);
                                if (iDav1dGetFrame == 1) {
                                    if (iDav1dGetFrame == 2) {
                                        break;
                                    }
                                    iDav1dGetFrame = 2;
                                    if (iDav1dGetFrame == 2) {
                                        videoDecoderOutputBuffer.shouldBeSkipped = true;
                                    }
                                    synchronized (this.lock) {
                                        if (this.flushed) {
                                            videoDecoderOutputBuffer.release();
                                            flushInternal();
                                            break;
                                        }
                                        if (isAtLeastOutputStartTimeUs(videoDecoderOutputBuffer.timeUs)) {
                                            this.skippedOutputBufferCount++;
                                            videoDecoderOutputBuffer.release();
                                        } else {
                                            this.skippedOutputBufferCount++;
                                            videoDecoderOutputBuffer.release();
                                        }
                                        while (true) {
                                            if (!this.released) {
                                                return false;
                                            }
                                            if (canDecodeOutputBuffer()) {
                                                break;
                                                break;
                                            }
                                            this.lock.wait();
                                        }
                                        if (this.flushed) {
                                            flushInternal();
                                        } else {
                                            VideoDecoderOutputBuffer[] videoDecoderOutputBufferArr2 = this.availableOutputBuffers;
                                            int i6 = this.availableOutputBufferCount - 1;
                                            this.availableOutputBufferCount = i6;
                                            videoDecoderOutputBuffer = videoDecoderOutputBufferArr2[i6];
                                        }
                                    }
                                } else {
                                    if (iDav1dGetFrame == 2) {
                                        videoDecoderOutputBuffer.shouldBeSkipped = true;
                                    }
                                    synchronized (this.lock) {
                                        try {
                                            if (this.flushed) {
                                                videoDecoderOutputBuffer.release();
                                                flushInternal();
                                            } else {
                                                if (isAtLeastOutputStartTimeUs(videoDecoderOutputBuffer.timeUs) || videoDecoderOutputBuffer.shouldBeSkipped) {
                                                    this.skippedOutputBufferCount++;
                                                    videoDecoderOutputBuffer.release();
                                                } else {
                                                    videoDecoderOutputBuffer.skippedOutputBufferCount = this.skippedOutputBufferCount;
                                                    this.skippedOutputBufferCount = 0;
                                                    this.queuedOutputBuffers.addLast(videoDecoderOutputBuffer);
                                                    final cal calVar2 = this.callback;
                                                    Executor executor2 = this.executor;
                                                    if (calVar2 != null && executor2 != null) {
                                                        executor2.execute(new Runnable() { // from class: androidx.media3.decoder.av1.Dav1dDecoder$$ExternalSyntheticLambda0
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                calVar2.ga();
                                                            }
                                                        });
                                                    }
                                                }
                                                while (true) {
                                                    if (!this.released) {
                                                        return false;
                                                    }
                                                    if (!canDecodeOutputBuffer() || this.flushed) {
                                                        break;
                                                    }
                                                    this.lock.wait();
                                                }
                                                if (this.flushed) {
                                                    flushInternal();
                                                } else {
                                                    VideoDecoderOutputBuffer[] videoDecoderOutputBufferArr3 = this.availableOutputBuffers;
                                                    int i7 = this.availableOutputBufferCount - 1;
                                                    this.availableOutputBufferCount = i7;
                                                    videoDecoderOutputBuffer = videoDecoderOutputBufferArr3[i7];
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                    break;
                                }
                            }
                            if (iDav1dGetFrame != 0) {
                                throw new Dav1dDecoderException("dav1dGetFrame error: " + dav1dGetErrorMessage(this.dav1dDecoderContext), -1);
                            }
                            dav1dDecoderExceptionCreateUnexpectedDecodeException = null;
                            if (iDav1dGetFrame == 3) {
                                videoDecoderOutputBuffer.release();
                            }
                        } else {
                            while (true) {
                                iDav1dGetFrame = dav1dGetFrame(this.dav1dDecoderContext, videoDecoderOutputBuffer);
                                if (iDav1dGetFrame == 1) {
                                    if (iDav1dGetFrame == 2) {
                                        break;
                                        break;
                                    }
                                    iDav1dGetFrame = 2;
                                    if (iDav1dGetFrame == 2) {
                                        videoDecoderOutputBuffer.shouldBeSkipped = true;
                                    }
                                    synchronized (this.lock) {
                                        if (this.flushed) {
                                            videoDecoderOutputBuffer.release();
                                            flushInternal();
                                            break;
                                        }
                                        if (isAtLeastOutputStartTimeUs(videoDecoderOutputBuffer.timeUs)) {
                                            this.skippedOutputBufferCount++;
                                            videoDecoderOutputBuffer.release();
                                        } else {
                                            this.skippedOutputBufferCount++;
                                            videoDecoderOutputBuffer.release();
                                        }
                                        while (true) {
                                            if (!this.released) {
                                                return false;
                                            }
                                            if (canDecodeOutputBuffer()) {
                                                break;
                                                break;
                                            }
                                            this.lock.wait();
                                        }
                                        if (this.flushed) {
                                            flushInternal();
                                        } else {
                                            VideoDecoderOutputBuffer[] videoDecoderOutputBufferArr4 = this.availableOutputBuffers;
                                            int i8 = this.availableOutputBufferCount - 1;
                                            this.availableOutputBufferCount = i8;
                                            videoDecoderOutputBuffer = videoDecoderOutputBufferArr4[i8];
                                        }
                                    }
                                } else {
                                    if (iDav1dGetFrame == 2) {
                                        videoDecoderOutputBuffer.shouldBeSkipped = true;
                                    }
                                    synchronized (this.lock) {
                                        if (this.flushed) {
                                            videoDecoderOutputBuffer.release();
                                            flushInternal();
                                            break;
                                        }
                                        if (isAtLeastOutputStartTimeUs(videoDecoderOutputBuffer.timeUs)) {
                                            this.skippedOutputBufferCount++;
                                            videoDecoderOutputBuffer.release();
                                        } else {
                                            this.skippedOutputBufferCount++;
                                            videoDecoderOutputBuffer.release();
                                        }
                                        while (true) {
                                            if (!this.released) {
                                                return false;
                                            }
                                            if (canDecodeOutputBuffer()) {
                                                break;
                                                break;
                                            }
                                            this.lock.wait();
                                        }
                                        if (this.flushed) {
                                            flushInternal();
                                        } else {
                                            VideoDecoderOutputBuffer[] videoDecoderOutputBufferArr5 = this.availableOutputBuffers;
                                            int i9 = this.availableOutputBufferCount - 1;
                                            this.availableOutputBufferCount = i9;
                                            videoDecoderOutputBuffer = videoDecoderOutputBufferArr5[i9];
                                        }
                                    }
                                }
                            }
                            if (iDav1dGetFrame != 0) {
                                throw new Dav1dDecoderException("dav1dGetFrame error: " + dav1dGetErrorMessage(this.dav1dDecoderContext), -1);
                            }
                            dav1dDecoderExceptionCreateUnexpectedDecodeException = null;
                            if (iDav1dGetFrame == 3) {
                                videoDecoderOutputBuffer.release();
                            }
                        }
                    } catch (Dav1dDecoderException e) {
                        dav1dDecoderExceptionCreateUnexpectedDecodeException = e;
                    } catch (OutOfMemoryError e2) {
                        dav1dDecoderExceptionCreateUnexpectedDecodeException = createUnexpectedDecodeException(e2);
                    } catch (RuntimeException e3) {
                        dav1dDecoderExceptionCreateUnexpectedDecodeException = createUnexpectedDecodeException(e3);
                    }
                    if (dav1dDecoderExceptionCreateUnexpectedDecodeException != null) {
                        synchronized (this.lock) {
                            this.exception = dav1dDecoderExceptionCreateUnexpectedDecodeException;
                        }
                        return false;
                    }
                }
                releaseUnusedInputBuffers(this.dav1dDecoderContext, this);
            }
            return true;
        }
    }

    private void flushInternal() {
        this.skippedOutputBufferCount = 0;
        DecoderInputBuffer decoderInputBuffer = this.dequeuedInputBuffer;
        if (decoderInputBuffer != null) {
            releaseInputBufferInternal(decoderInputBuffer);
            this.dequeuedInputBuffer = null;
        }
        while (!this.queuedInputBuffers.isEmpty()) {
            releaseInputBufferInternal((DecoderInputBuffer) this.queuedInputBuffers.removeFirst());
        }
        while (!this.queuedOutputBuffers.isEmpty()) {
            ((VideoDecoderOutputBuffer) this.queuedOutputBuffers.removeFirst()).release();
        }
        dav1dFlush(this.dav1dDecoderContext);
        this.flushed = false;
    }

    private void maybeNotifyDecodeLoop() {
        if (canDecodeInputBuffer() || canDecodeOutputBuffer()) {
            this.lock.notify();
        }
    }

    private void maybeThrowException() throws Dav1dDecoderException {
        Dav1dDecoderException dav1dDecoderException = this.exception;
        if (dav1dDecoderException != null) {
            throw dav1dDecoderException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseDecoderContext() {
        long j;
        synchronized (this.lock) {
            if (this.dav1dDecoderContext != 0) {
                j = this.dav1dDecoderContext;
                while (!this.queuedOutputBuffers.isEmpty()) {
                    ((VideoDecoderOutputBuffer) this.queuedOutputBuffers.removeFirst()).release();
                }
                this.dav1dDecoderContext = 0L;
            } else {
                j = 0;
            }
        }
        if (j != 0) {
            releaseUnusedInputBuffers(j, this);
            dav1dClose(j);
        }
    }

    private void releaseInputBuffer(int i) {
        synchronized (this.lock) {
            DecoderInputBuffer decoderInputBuffer = this.allInputBuffers[i];
            if (!this.queuedInputBuffers.contains(decoderInputBuffer)) {
                releaseInputBufferInternal(decoderInputBuffer);
            }
        }
    }

    private void releaseInputBufferInternal(DecoderInputBuffer decoderInputBuffer) {
        decoderInputBuffer.clear();
        int i = this.availableInputBufferCount;
        this.availableInputBufferCount = i + 1;
        this.availableInputBuffers[i] = decoderInputBuffer;
        final cal calVar = this.callback;
        Executor executor = this.executor;
        if (calVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: androidx.media3.decoder.av1.Dav1dDecoder$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                calVar.fZ();
            }
        });
    }

    private void releaseOutputBufferInternal(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        videoDecoderOutputBuffer.clear();
        int i = this.availableOutputBufferCount;
        this.availableOutputBufferCount = i + 1;
        this.availableOutputBuffers[i] = videoDecoderOutputBuffer;
    }

    private native void releaseUnusedInputBuffers(long j, Dav1dDecoder dav1dDecoder);

    /* JADX INFO: Access modifiers changed from: private */
    public void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (decode());
    }

    public Dav1dDecoderException createUnexpectedDecodeException(Throwable th) {
        return new Dav1dDecoderException("Unexpected decode error", th);
    }

    @Override // defpackage.cam
    public final DecoderInputBuffer dequeueInputBuffer() {
        DecoderInputBuffer decoderInputBuffer;
        synchronized (this.lock) {
            maybeThrowException();
            boolean z = true;
            if (this.dequeuedInputBuffer != null && !this.flushed) {
                z = false;
            }
            ahno.O(z);
            int i = this.availableInputBufferCount;
            decoderInputBuffer = null;
            if (i != 0 && !this.flushed) {
                DecoderInputBuffer[] decoderInputBufferArr = this.availableInputBuffers;
                int i2 = i - 1;
                this.availableInputBufferCount = i2;
                decoderInputBuffer = decoderInputBufferArr[i2];
            }
            this.dequeuedInputBuffer = decoderInputBuffer;
        }
        return decoderInputBuffer;
    }

    @Override // defpackage.cam
    public final VideoDecoderOutputBuffer dequeueOutputBuffer() {
        synchronized (this.lock) {
            maybeThrowException();
            if (this.queuedOutputBuffers.isEmpty() || this.flushed) {
                return null;
            }
            return (VideoDecoderOutputBuffer) this.queuedOutputBuffers.removeFirst();
        }
    }

    @Override // defpackage.cam
    public final void flush() {
        synchronized (this.lock) {
            this.flushed = true;
            this.lock.notify();
        }
    }

    @Override // defpackage.cam
    public String getName() {
        return "libdav1d";
    }

    final boolean isAtLeastOutputStartTimeUs(long j) {
        boolean z;
        synchronized (this.lock) {
            long j2 = this.outputStartTimeUs;
            z = true;
            if (j2 != -9223372036854775807L && j < j2) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.cam
    public final void queueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        synchronized (this.lock) {
            maybeThrowException();
            ahno.F(decoderInputBuffer == this.dequeuedInputBuffer);
            this.queuedInputBuffers.addLast(decoderInputBuffer);
            maybeNotifyDecodeLoop();
            this.dequeuedInputBuffer = null;
        }
    }

    @Override // defpackage.cam
    public void release() {
        synchronized (this.lock) {
            this.released = true;
            this.lock.notify();
        }
        try {
            this.decodeThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public void releaseOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        synchronized (this.lock) {
            if (this.dav1dDecoderContext != 0) {
                dav1dReleaseFrame(this.dav1dDecoderContext, videoDecoderOutputBuffer);
            }
            releaseOutputBufferInternal(videoDecoderOutputBuffer);
            maybeNotifyDecodeLoop();
        }
    }

    public void renderToSurface(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) throws Dav1dDecoderException {
        if (this.dav1dDecoderContext == 0) {
            throw new Dav1dDecoderException("Decoder is released.", -1);
        }
        synchronized (this.lock) {
            maybeThrowException();
            if (this.dav1dDecoderContext == 0) {
                throw new Dav1dDecoderException("Decoder is released.", -1);
            }
            if (this.outputMode != 1) {
                throw new Dav1dDecoderException("Unsupported Output Mode.", -1);
            }
            if (surface == null || !surface.isValid()) {
                throw new Dav1dDecoderException("Failed to render output buffer to surface: invalid surface.", -1);
            }
            if (dav1dRenderFrame(this.dav1dDecoderContext, surface, videoDecoderOutputBuffer) != 1) {
                String strDav1dGetErrorMessage = dav1dGetErrorMessage(this.dav1dDecoderContext);
                throw new Dav1dDecoderException(a.ce(strDav1dGetErrorMessage, "Failed to render output buffer to surface. "), dav1dGetLastErrorJniStatusCode(this.dav1dDecoderContext));
            }
        }
    }

    @Override // defpackage.cam
    public final void setCallback(cal calVar, Executor executor) {
        synchronized (this.lock) {
            this.callback = calVar;
            this.executor = executor;
        }
    }

    public void setOutputMode(int i) {
        this.outputMode = i;
    }

    @Override // defpackage.cam
    public final void setOutputStartTimeUs(long j) {
        synchronized (this.lock) {
            this.outputStartTimeUs = j;
        }
    }

    private void releaseInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        synchronized (this.lock) {
            releaseInputBufferInternal(decoderInputBuffer);
        }
    }
}
