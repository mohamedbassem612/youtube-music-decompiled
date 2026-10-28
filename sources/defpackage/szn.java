package defpackage;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class szn {
    public final AtomicReference a;
    public final mbc b;
    public final Executor c;
    public int d;
    public int e;
    Consumer f;
    public volatile boolean g;
    public long h;
    public long i;
    volatile ScheduledFuture j;
    volatile szj k;
    private final ScheduledExecutorService l;
    private long m;
    private long n;

    public szn(mbc mbcVar, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, int i2) {
        if (i >= 1000000) {
            throw new IllegalArgumentException();
        }
        this.b = mbcVar;
        this.l = scheduledExecutorService;
        this.c = executor;
        this.d = i;
        this.e = i2;
        this.a = new AtomicReference(new szk(-1L));
    }

    static final szg g(szg szgVar, long j) {
        szk szkVar = new szk(szgVar.b != -3 ? j + 1073741825 : -3L);
        szkVar.c = true;
        return szkVar;
    }

    static final void i(szg szgVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("12345 {");
        int i = 0;
        while (szgVar != null) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(szgVar.getClass().getSimpleName());
            i++;
            szgVar = szgVar.d;
        }
        StringBuilder sbReplace = sb.replace(0, 5, String.format(Locale.US, "%05d", Integer.valueOf(i)));
        sbReplace.append('}');
        sbReplace.toString();
    }

    final szg a(szg szgVar) {
        szg szgVar2 = null;
        while (szgVar != null) {
            boolean z = szgVar instanceof szh;
            szg szgVar3 = szgVar.d;
            if (!z && (szgVar.b != -3 || (szgVar instanceof szl))) {
                this.m++;
                szgVar.d = szgVar2;
                szgVar2 = szgVar;
            }
            szgVar = szgVar3;
        }
        return szgVar2;
    }

    public final synchronized void b(long j) {
        szj szjVar = this.k;
        if (szjVar != null) {
            ScheduledFuture scheduledFuture = this.j;
            if (szjVar.a == j) {
                this.j = null;
                this.k = null;
            }
        }
    }

    public void c(szg szgVar, long j) {
        AtomicReference atomicReference;
        szg szgVar2;
        boolean zF;
        do {
            atomicReference = this.a;
            szgVar2 = (szg) atomicReference.get();
            zF = f(szgVar, szgVar2, j);
        } while (!a.av(atomicReference, szgVar2, szgVar));
        if (!zF || szgVar.c) {
            return;
        }
        e(szgVar, j);
    }

    public final void d(int i, long j) {
        c(new szh(i), j);
    }

    public synchronized void e(szg szgVar, long j) {
        long j2 = szgVar.b;
        long jMax = Math.max(j2 - j, 0L);
        szj szjVar = this.k;
        if (szjVar != null) {
            if (szjVar.a <= j2) {
                return;
            }
            this.j.cancel(false);
            this.n++;
        }
        szj szjVar2 = new szj(this, j2);
        this.j = this.l.schedule(szjVar2, jMax, TimeUnit.MILLISECONDS);
        this.k = szjVar2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a A[PHI: r0
      0x003a: PHI (r0v5 long) = (r0v3 long), (r0v6 long), (r0v6 long) binds: [B:13:0x0027, B:15:0x002f, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    final boolean f(szg szgVar, szg szgVar2, long j) {
        long jMax = szgVar.a;
        if (jMax > 0) {
            jMax = Math.min(jMax, this.e) + j;
        }
        long j2 = szgVar2.b;
        boolean z = false;
        if (jMax < j2) {
            if (szgVar instanceof szh) {
                jMax = ((long) szgVar.a) + j;
            }
            if (jMax < j2) {
                if (jMax >= 0) {
                    jMax = Math.max(jMax, j);
                    if (jMax == j || jMax < j2 - ((long) this.d)) {
                        z = true;
                    }
                } else {
                    z = true;
                }
            }
            if (true == z) {
                j2 = jMax;
            }
        }
        szgVar.b = j2;
        szgVar.c = szgVar2.c;
        szgVar.d = szgVar2;
        return z;
    }

    public final void h(long j, int i) {
        if (!this.g) {
            long jB = this.b.b();
            c(new szl(i), jB);
            long j2 = jB + j;
            synchronized (this) {
                while (!this.g) {
                    if (j != 0 && jB >= j2) {
                        break;
                    }
                    try {
                        wait(j != 0 ? j2 - jB : 0L);
                        jB = this.b.b();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        boolean z = this.g;
                    }
                }
            }
        }
        boolean z2 = this.g;
    }
}
