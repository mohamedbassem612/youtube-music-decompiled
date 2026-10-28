package defpackage;

import android.os.Handler;
import android.os.Looper;
import j$.time.Duration;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ywu extends IOException {
    public static final Duration a = Duration.ofSeconds(5);
    private final Handler b;
    private boolean c;
    private final Set d;
    private final Runnable e;
    private Duration f;
    private final boolean g;
    private final Supplier h;
    private final long i;
    private final Consumer j;
    private final boolean k;
    private final yvs l;

    public ywu(long j, yvs yvsVar, boolean z, Consumer consumer, boolean z2, Supplier supplier, long j2) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.b = handler;
        this.c = true;
        this.d = new HashSet();
        this.l = yvsVar;
        this.f = Duration.ofMillis(j);
        this.g = z;
        this.k = z2;
        this.h = supplier;
        this.i = j2;
        this.j = consumer;
        ywt ywtVar = new ywt(this, 0);
        this.e = ywtVar;
        if (z2) {
            i(true, j, yvsVar.a(), ((Long) supplier.get()).longValue());
        }
        handler.postDelayed(ywtVar, j);
    }

    private final void i(boolean z, long j, long j2, long j3) {
        this.j.r(new yhz(true != z ? "eblt" : "iblt", "td." + j + ";st." + j2 + ";cp." + j3));
    }

    public final synchronized long a() {
        yvs yvsVar = this.l;
        if (yvsVar == null) {
            return 0L;
        }
        return yvsVar.a();
    }

    public final synchronized long b() {
        return this.f.toMillis();
    }

    public final synchronized void c(Runnable runnable) {
        if (this.c) {
            this.d.add(runnable);
        } else {
            this.b.post(runnable);
        }
    }

    public final synchronized void d() {
        try {
            try {
                if (this.c) {
                    if (!this.g || this.f.equals(Duration.ZERO)) {
                        e();
                        return;
                    }
                    long jLongValue = ((Long) this.h.get()).longValue();
                    long jA = a();
                    if (jA != 0) {
                        long j = this.i;
                        if (jLongValue < jA - j) {
                            Handler handler = this.b;
                            Runnable runnable = this.e;
                            handler.removeCallbacks(runnable);
                            long j2 = (jA - jLongValue) - j;
                            handler.postDelayed(runnable, j2);
                            if (this.k) {
                                i(false, j2, jA, jLongValue);
                                return;
                            }
                        }
                    }
                    e();
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized void e() {
        this.c = false;
        Handler handler = this.b;
        handler.removeCallbacks(this.e);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            handler.post((Runnable) it.next());
        }
    }

    public final synchronized void f() {
        Duration duration = this.f;
        Duration duration2 = a;
        if (duration.compareTo(duration2) > 0) {
            this.f = duration2;
            Handler handler = this.b;
            Runnable runnable = this.e;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, duration2.toMillis());
        }
    }

    public final synchronized boolean g() {
        return this.c;
    }

    public final synchronized boolean h(long j, long j2) {
        yvs yvsVar = this.l;
        if (yvsVar == null) {
            zvp.a(zvn.a, zvm.f, "Null AdBreak Cuepoint in BlockLoadingException when checking to block SABR request");
            return false;
        }
        long j3 = yvsVar.d;
        long jA = yvsVar.a();
        return this.c && ((j > (jA - j2) ? 1 : (j == (jA - j2) ? 0 : -1)) >= 0 && (j > ((j3 + jA) + j2) ? 1 : (j == ((j3 + jA) + j2) ? 0 : -1)) <= 0);
    }
}
