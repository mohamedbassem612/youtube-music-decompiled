package defpackage;

import android.os.Process;
import com.google.cardboard.sdk.R;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mcz {
    public final Thread a;
    public int b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public final AtomicLong f;
    private final boolean g;

    public mcz(Thread thread, int i, boolean z, int i2, boolean z2, boolean z3) {
        thread.getClass();
        this.a = thread;
        this.b = i;
        this.c = z2;
        this.g = z3;
        this.d = !z2;
        this.f = new AtomicLong(ksy.aI(z, false, false, i2, -21, -21, 0L));
    }

    private final void e(long j) {
        if (mcy.c(j)) {
            boolean zInterrupted = false;
            while (true) {
                try {
                    LockSupport.park(this);
                    if (!mcy.b(this.f.get())) {
                        break;
                    } else {
                        zInterrupted |= Thread.interrupted();
                    }
                } catch (Throwable th) {
                    if (zInterrupted) {
                        this.a.interrupt();
                    }
                    throw th;
                }
            }
            if (zInterrupted) {
                this.a.interrupt();
            }
        }
    }

    public final void a(int i) {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.f;
            j = atomicLong.get();
            boolean zD = mcy.d(j);
            int iA = mcy.a(j, 2);
            int iA2 = mcy.a(j, 1);
            int iA3 = mcy.a(j, 0);
            boolean zC = mcy.c(j);
            int iF = mcy.f(zD, iA, iA2, iA3);
            if (!zC) {
                throw new IllegalStateException("Unexpected not set, saw " + ("State{started=" + mcy.d(j) + ", setting=" + mcy.c(j) + ", pool=" + mcy.a(j, 2) + ", local=" + mcy.a(j, 1) + ", inherited=" + mcy.a(j, 0) + '}') + ' ' + Long.toBinaryString(j));
            }
            if (!mcy.d(j)) {
                int iA4 = mcq.a(iF);
                if (iA4 != mcq.a(i)) {
                    this.a.setPriority(iA4);
                }
            } else if (iF != i) {
                Process.setThreadPriority(this.b, iF);
                i = iF;
            }
        } while (!atomicLong.compareAndSet(j, mcy.e(j, false, false, false, 0, 0, 0L, 121)));
        if (mcy.b(j)) {
            LockSupport.unpark(this.a);
        }
    }

    public final void b() {
        long j;
        boolean z;
        while (true) {
            AtomicLong atomicLong = this.f;
            j = atomicLong.get();
            boolean zC = mcy.c(j);
            z = this.g;
            long jE = mcy.e(j, false, false, zC & (!z), 0, -21, (8796093022207L & j) + 1, 27);
            if (!mcy.c(j)) {
                if (mcy.f(mcy.d(j), mcy.a(j, 2), mcy.a(j, 1), mcy.a(j, 0)) == mcy.f(mcy.d(jE), mcy.a(jE, 2), mcy.a(jE, 1), mcy.a(jE, 0))) {
                    if (atomicLong.compareAndSet(j, jE)) {
                        break;
                    }
                } else if (atomicLong.compareAndSet(j, mcy.e(jE, false, true, false, 0, 0, 0L, R.styleable.AppCompatTheme_windowMinWidthMinor))) {
                    a(mcy.f(mcy.d(j), mcy.a(j, 2), mcy.a(j, 1), mcy.a(j, 0)));
                    break;
                }
            } else if (atomicLong.compareAndSet(j, jE)) {
                break;
            }
        }
        if (z) {
            return;
        }
        e(j);
    }

    public final void c() {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.f;
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, mcy.e(j, false, false, mcy.c(j), 0, 0, 0L, 122)));
        e(j);
    }

    public final void d() {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.f;
            j = atomicLong.get();
            if (!mcy.b(j)) {
                return;
            }
        } while (!atomicLong.compareAndSet(j, mcy.e(j, false, false, false, 0, 0, 0L, 123)));
    }

    public final String toString() {
        return this.a.getName() + ' ' + this.b;
    }
}
