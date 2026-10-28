package defpackage;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cas implements cam {
    private final Thread a;
    private final DecoderInputBuffer[] e;
    private final caq[] f;
    private int g;
    private int h;
    private DecoderInputBuffer i;
    private can j;
    private boolean k;
    private boolean l;
    private int m;
    private Executor o;
    private Runnable p;
    private Runnable q;
    private final Object b = new Object();
    private long n = -9223372036854775807L;
    private final ArrayDeque c = new ArrayDeque();
    private final ArrayDeque d = new ArrayDeque();

    protected cas(DecoderInputBuffer[] decoderInputBufferArr, caq[] caqVarArr) {
        this.e = decoderInputBufferArr;
        this.g = decoderInputBufferArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = c();
        }
        this.f = caqVarArr;
        this.h = caqVarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = e();
        }
        car carVar = new car(this);
        this.a = carVar;
        carVar.start();
    }

    private final void l() {
        if (o()) {
            this.b.notify();
        }
    }

    private final void m() throws can {
        can canVar = this.j;
        if (canVar != null) {
            throw canVar;
        }
    }

    private final void n(DecoderInputBuffer decoderInputBuffer, boolean z) {
        decoderInputBuffer.clear();
        int i = this.g;
        this.g = i + 1;
        this.e[i] = decoderInputBuffer;
        Runnable runnable = this.q;
        Executor executor = this.o;
        if (!z || runnable == null || executor == null) {
            return;
        }
        executor.execute(runnable);
    }

    private final boolean o() {
        return !this.c.isEmpty() && this.h > 0;
    }

    protected abstract can a(Throwable th);

    protected abstract can b(DecoderInputBuffer decoderInputBuffer, caq caqVar, boolean z);

    protected abstract DecoderInputBuffer c();

    @Override // defpackage.cam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final DecoderInputBuffer dequeueInputBuffer() {
        DecoderInputBuffer decoderInputBuffer;
        synchronized (this.b) {
            m();
            ahno.O(this.i == null);
            int i = this.g;
            if (i == 0) {
                decoderInputBuffer = null;
            } else {
                DecoderInputBuffer[] decoderInputBufferArr = this.e;
                int i2 = i - 1;
                this.g = i2;
                decoderInputBuffer = decoderInputBufferArr[i2];
            }
            this.i = decoderInputBuffer;
        }
        return decoderInputBuffer;
    }

    protected abstract caq e();

    @Override // defpackage.cam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final caq dequeueOutputBuffer() {
        synchronized (this.b) {
            m();
            ArrayDeque arrayDeque = this.d;
            if (arrayDeque.isEmpty()) {
                return null;
            }
            return (caq) arrayDeque.removeFirst();
        }
    }

    @Override // defpackage.cam
    public final void flush() {
        synchronized (this.b) {
            this.k = true;
            this.m = 0;
            DecoderInputBuffer decoderInputBuffer = this.i;
            if (decoderInputBuffer != null) {
                n(decoderInputBuffer, false);
                this.i = null;
            }
            while (true) {
                ArrayDeque arrayDeque = this.c;
                if (arrayDeque.isEmpty()) {
                    break;
                } else {
                    n((DecoderInputBuffer) arrayDeque.removeFirst(), false);
                }
            }
            while (true) {
                ArrayDeque arrayDeque2 = this.d;
                if (!arrayDeque2.isEmpty()) {
                    ((caq) arrayDeque2.removeFirst()).release();
                }
            }
        }
    }

    @Override // defpackage.cam
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void queueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        synchronized (this.b) {
            m();
            ahno.F(decoderInputBuffer == this.i);
            this.c.addLast(decoderInputBuffer);
            l();
            this.i = null;
        }
    }

    public final void h(caq caqVar) {
        synchronized (this.b) {
            caqVar.clear();
            caq[] caqVarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            caqVarArr[i] = caqVar;
            l();
        }
    }

    protected final void i(int i) {
        DecoderInputBuffer[] decoderInputBufferArr = this.e;
        ahno.O(this.g == decoderInputBufferArr.length);
        for (DecoderInputBuffer decoderInputBuffer : decoderInputBufferArr) {
            decoderInputBuffer.ensureSpaceForWrite(i);
        }
    }

    public final boolean j() {
        can canVarA;
        Object obj = this.b;
        synchronized (obj) {
            while (!this.l && !o()) {
                obj.wait();
            }
            if (this.l) {
                return false;
            }
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) this.c.removeFirst();
            caq[] caqVarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            caq caqVar = caqVarArr[i];
            boolean z = this.k;
            this.k = false;
            if (decoderInputBuffer.isEndOfStream()) {
                caqVar.addFlag(4);
            } else {
                caqVar.timeUs = decoderInputBuffer.timeUs;
                if (decoderInputBuffer.isFirstSample()) {
                    caqVar.addFlag(134217728);
                }
                if (!k(decoderInputBuffer.timeUs)) {
                    caqVar.shouldBeSkipped = true;
                }
                try {
                    canVarA = b(decoderInputBuffer, caqVar, z);
                } catch (OutOfMemoryError e) {
                    canVarA = a(e);
                } catch (RuntimeException e2) {
                    canVarA = a(e2);
                }
                if (canVarA != null) {
                    synchronized (this.b) {
                        this.j = canVarA;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                if (this.k) {
                    caqVar.release();
                } else {
                    boolean z2 = caqVar.shouldBeSkipped;
                    int i2 = this.m;
                    if (z2) {
                        this.m = i2 + 1;
                        caqVar.release();
                    } else {
                        caqVar.skippedOutputBufferCount = i2;
                        this.m = 0;
                        this.d.addLast(caqVar);
                        Runnable runnable = this.p;
                        Executor executor = this.o;
                        if (runnable != null && executor != null) {
                            executor.execute(runnable);
                        }
                    }
                }
                n(decoderInputBuffer, true);
            }
            return true;
        }
    }

    protected final boolean k(long j) {
        boolean z;
        synchronized (this.b) {
            long j2 = this.n;
            z = true;
            if (j2 != -9223372036854775807L && j < j2) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.cam
    public void release() {
        Object obj = this.b;
        synchronized (obj) {
            this.l = true;
            obj.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.cam
    public final void setCallback(cal calVar, Executor executor) {
        synchronized (this.b) {
            this.o = executor;
            this.p = new bkn(calVar, 4);
            this.q = new bkn(calVar, 5);
        }
    }

    @Override // defpackage.cam
    public final void setOutputStartTimeUs(long j) {
        synchronized (this.b) {
            boolean z = true;
            if (this.g != this.e.length && !this.k) {
                z = false;
            }
            ahno.O(z);
            this.n = j;
        }
    }
}
