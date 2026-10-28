package defpackage;

import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class trj {
    public volatile trh d;
    public final AtomicReferenceArray e;
    public final tqj f;
    public final mbc g;
    private static final agrf i = agrf.h("com/google/android/libraries/youtube/common/startup/StartupTracing");
    public static final ThreadLocal a = new ThreadLocal();
    public static volatile int b = -1;
    public static final int[] c = {0, 32, SemanticState.Focused, SemanticState.Hidden};
    private volatile boolean j = false;
    public final Queue h = new ConcurrentLinkedQueue();

    public trj(mbc mbcVar, Duration duration, boolean z, tqj tqjVar) {
        this.d = null;
        this.g = mbcVar;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(274);
        this.e = atomicReferenceArray;
        if (z) {
            this.d = tri.a;
        } else {
            this.d = new trh(32, (mbc) null, 32);
            trh trhVar = this.d;
            if (duration != null) {
                long millis = duration.toMillis();
                trhVar.g = mbcVar;
                trhVar.a = TimeUnit.MICROSECONDS.convert(millis, TimeUnit.MILLISECONDS);
            } else {
                trhVar.g = mbcVar;
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                long jC = mbcVar.c();
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                trhVar.a = jC / 1000;
            }
            tri.a = this.d;
        }
        this.f = tqjVar;
        atomicReferenceArray.set(32, this.d);
        int i2 = tqr.a;
        if (tqjVar.k(1073820346)) {
            d(33554432);
        } else {
            b |= 33554432;
        }
    }

    public static trh a() {
        return (trh) a.get();
    }

    public static void c(trh trhVar) {
        a.set(trhVar);
    }

    public static void d(int i2) {
        b &= ~i2;
    }

    public static boolean e(int i2) {
        return (b & i2) != 0;
    }

    public final void b(String str, long j, long j2) {
        if (this.d == null || b == 0 || !e(33554432)) {
            return;
        }
        Queue queue = this.h;
        if (queue.size() >= 30) {
            if (this.j) {
                return;
            }
            ((agrc) ((agrc) i.c()).k("com/google/android/libraries/youtube/common/startup/StartupTracing", "addDynamicTimer", 486, "StartupTracing.java")).t("dynamicTimers limit reached, dropping new timers");
            this.j = true;
            return;
        }
        if (str == null || j <= 0 || j2 <= 0 || j2 < j) {
            return;
        }
        trh trhVar = new trh(str, this.g, 32);
        a();
        trhVar.a = TimeUnit.MICROSECONDS.convert(j, TimeUnit.MILLISECONDS);
        tri.a.e(trhVar);
        trhVar.h = new trg(j2);
        queue.offer(trhVar);
    }

    public final boolean f(int i2) {
        return i2 < this.e.length();
    }

    public final boolean g(int i2, int i3) {
        if (f(i2) && this.d != null && b != 0) {
            AtomicReferenceArray atomicReferenceArray = this.e;
            if (atomicReferenceArray.get(i2) == null) {
                trh trhVar = new trh(i2, this.g, i3);
                while (!atomicReferenceArray.compareAndSet(i2, null, trhVar)) {
                    if (atomicReferenceArray.get(i2) != null) {
                    }
                }
                trhVar.f(null);
                return true;
            }
        }
        return false;
    }

    public final void h(int i2) {
        trh trhVar;
        if (!f(i2) || (trhVar = (trh) this.e.get(i2)) == null) {
            return;
        }
        trhVar.g();
    }
}
