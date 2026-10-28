package defpackage;

import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class trd {
    public static final /* synthetic */ int x = 0;
    private static final agrf y = agrf.h("com/google/android/libraries/youtube/common/startup/StartupState");
    private static final agkz z = agkz.s(106, 60, 59, 58);
    private final avmm C;
    private final tqj D;
    private volatile int E;
    private volatile long F;
    private volatile String G;
    public final awly a;
    public final trj b;
    public final agfr c;
    public boolean e;
    public volatile boolean f;
    public volatile int h;
    public volatile boolean j;
    public volatile String k;
    public volatile String l;
    public volatile String m;
    public volatile String n;
    public volatile Boolean q;
    public final List r;
    public volatile aokm s;
    public volatile aokm t;
    public volatile aokm u;
    public volatile tsv w;
    private final ConcurrentLinkedQueue A = new ConcurrentLinkedQueue();
    private final AtomicBoolean B = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public volatile tqw g = new tqw(null);
    public volatile int i = -9999;
    public volatile String o = "";
    public volatile String p = "";
    public volatile agke v = agpi.a;

    public trd(agfr agfrVar, mbc mbcVar, int i, tqj tqjVar) {
        this.D = tqjVar;
        this.c = agfrVar;
        this.E = tzk.v(0, 264, i);
        this.E = tzk.v(this.E, 86, 1);
        this.E = tzk.v(this.E, 148, 0);
        awly awliVar = new awli(Long.valueOf((((long) this.E) << 32) | ((long) this.E)));
        int i2 = tqr.a;
        this.a = tqjVar.a(1073896384) == 2 ? awliVar.az() : awliVar;
        this.b = new trj(mbcVar, (Duration) agfrVar.io(), m(i), tqjVar);
        new awlk();
        this.C = new avmm();
        this.e = false;
        this.f = false;
        this.j = false;
        this.G = "";
        this.F = 0L;
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = "";
        this.r = new ArrayList();
    }

    public static boolean j(int i) {
        return i == 6 || i == 7 || i == 8;
    }

    public static boolean m(int i) {
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public static boolean q(int i) {
        return i != 0;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    private final Long t(int i, int i2) {
        boolean z2;
        String strValueOf;
        int i3;
        int i4;
        int iV;
        tqj tqjVar = this.D;
        if (tqjVar != null) {
            int i5 = tqr.a;
            if (tqjVar.l(1074355139, 1)) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        int i6 = (this.E >> (i & 63)) & ((1 << (i >> 6)) - 1);
        if (z2) {
            i4 = i;
        } else {
            Locale locale = Locale.US;
            if (i == 260) {
                strValueOf = "early type";
                i3 = 260;
            } else {
                if (i == 256) {
                    strValueOf = "final type";
                } else if (i == 209) {
                    strValueOf = "crash";
                } else if (i == 204) {
                    strValueOf = "complete";
                } else if (i == 148) {
                    strValueOf = "first interactive";
                } else {
                    strValueOf = i == 88 ? "startup abandoned" : String.valueOf(i);
                }
                i3 = i;
            }
            String.format(locale, "#### StartupState onNext: key=%s, curValue=%d ,value=%d", strValueOf, Integer.valueOf(i6), Integer.valueOf(i2));
            i4 = i3;
        }
        if (i == 260) {
            if (i6 == 0) {
                p(180);
                iV = tzk.v(this.E, i4, i2);
                if (i4 != 204 && q(i2)) {
                    if (!q(iV & 15)) {
                        iV = tzk.v(iV, SemanticState.Hidden, 1);
                    }
                    if (!q((iV >> 4) & 15)) {
                        iV = tzk.v(iV, 260, iV & 15);
                    }
                } else if (i4 == 260) {
                    if (i2 == 2) {
                        iV = tzk.v(tzk.v(iV, SemanticState.Hidden, 2), 148, 1);
                    } else if (((this.E >> 20) & 3) != 3) {
                        iV = tzk.v(iV, 148, 2);
                    }
                }
                if (this.E != iV) {
                    if (!z2) {
                        long j = iV;
                        int iT = tzk.t(j, 260);
                        int iT2 = tzk.t(j, SemanticState.Hidden);
                        s(iT);
                        s(iT2);
                    }
                    long jW = tzk.w(iV, this.E);
                    this.E = iV;
                    return Long.valueOf(jW);
                }
            }
        } else if (i4 == 256) {
            if (i6 == 0) {
                p(184);
                iV = tzk.v(this.E, i4, i2);
                if (i4 != 204) {
                    if (i4 == 260) {
                        if (i2 == 2) {
                            iV = tzk.v(tzk.v(iV, SemanticState.Hidden, 2), 148, 1);
                        } else if (((this.E >> 20) & 3) != 3) {
                            iV = tzk.v(iV, 148, 2);
                        }
                    }
                } else if (i4 == 260) {
                    if (i2 == 2) {
                        iV = tzk.v(tzk.v(iV, SemanticState.Hidden, 2), 148, 1);
                    } else if (((this.E >> 20) & 3) != 3) {
                        iV = tzk.v(iV, 148, 2);
                    }
                }
                if (this.E != iV) {
                    if (!z2) {
                        long j2 = iV;
                        int iT3 = tzk.t(j2, 260);
                        int iT4 = tzk.t(j2, SemanticState.Hidden);
                        s(iT3);
                        s(iT4);
                    }
                    long jW2 = tzk.w(iV, this.E);
                    this.E = iV;
                    return Long.valueOf(jW2);
                }
            }
        } else if (i4 == 204) {
        }
        return null;
    }

    private final void u() {
        avmm avmmVar = this.C;
        avmmVar.b();
        int i = tqr.a;
        if (this.D.k(1073820301)) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            avmb avmbVar = awlg.b;
            avnn avnnVar = atqp.g;
            timeUnit.getClass();
            avmbVar.getClass();
            avqz avqzVar = new avqz(10L, timeUnit, avmbVar);
            avnn avnnVar2 = atqp.p;
            avmmVar.c(avqzVar.E(new hoi(this, 19)));
        }
    }

    private final void v(int i) {
        tqj tqjVar;
        if (this.f || l()) {
            return;
        }
        if (!z.contains(Integer.valueOf(i))) {
            if (i != 116 || (tqjVar = this.D) == null) {
                return;
            }
            int i2 = tqr.a;
            if (!tqjVar.l(1074814102, 32)) {
                return;
            }
        }
        this.f = true;
    }

    private final synchronized boolean w(int i, int i2) {
        Long lT = t(i, i2);
        if (lT == null) {
            return false;
        }
        this.a.kk(lT);
        if (i == 204 && q(i2)) {
            u();
        }
        return true;
    }

    public final int a(int i) {
        return (this.E >> (i & 63)) & ((1 << (i >> 6)) - 1);
    }

    public final int b() {
        return (this.E >> 12) & 7;
    }

    public final trh c(int i) {
        trj trjVar = this.b;
        if (trjVar.f(i)) {
            return (trh) trjVar.e.get(i);
        }
        return null;
    }

    public final avlb d() {
        return f(new jna(11)).e();
    }

    public final avlr e(final int i) {
        return this.a.K(new avnn() { // from class: trc
            @Override // defpackage.avnn
            public final Object a(Object obj) {
                int i2 = trd.x;
                return Integer.valueOf((((int) (((Long) obj).longValue() & 4294967295L)) >> (i & 63)) & 15);
            }
        }).r();
    }

    public final avmc f(avno avnoVar) {
        return this.a.B(avnoVar).ao();
    }

    public final void g(String str) {
        trj trjVar = this.b;
        long jB = trjVar.g.b();
        trjVar.b(str, jB, jB);
    }

    public final void h() {
        int i = tqr.a;
        trj trjVar = this.b;
        if (trjVar.f.k(1073820301)) {
            trjVar.d = null;
            int i2 = 0;
            while (true) {
                AtomicReferenceArray atomicReferenceArray = trjVar.e;
                if (i2 >= atomicReferenceArray.length()) {
                    break;
                }
                atomicReferenceArray.set(i2, null);
                i2++;
            }
            trjVar.h.clear();
            trj.d(33554432);
        }
        this.C.b();
    }

    public final void i(int i) {
        this.b.h(i);
    }

    public final boolean k() {
        return a(88) == 1;
    }

    public final boolean l() {
        return b() != 0;
    }

    public final boolean n() {
        return (m(a(264)) || l()) ? false : true;
    }

    public final boolean o(int i, int i2) {
        boolean z2;
        int i3 = tqr.a;
        int iA = this.D.a(1073896384);
        if (iA == 0) {
            return w(i, i2);
        }
        if (i != 204) {
            z2 = false;
        } else if (q(i2)) {
            i = 204;
            z2 = true;
        } else {
            i = 204;
            z2 = false;
        }
        synchronized (this) {
            Long lT = t(i, i2);
            if (lT == null) {
                return false;
            }
            if (iA == 1) {
                this.A.add(lT);
                iA = 1;
            }
            if (iA == 1) {
                AtomicBoolean atomicBoolean = this.B;
                if (atomicBoolean.compareAndSet(false, true)) {
                    while (true) {
                        try {
                            ConcurrentLinkedQueue concurrentLinkedQueue = this.A;
                            Long l = (Long) concurrentLinkedQueue.poll();
                            if (l != null) {
                                this.a.kk(l);
                                if (!q(tzk.u(l.longValue(), 204)) && q(tzk.t(l.longValue(), 204))) {
                                    u();
                                }
                            } else {
                                atomicBoolean.set(false);
                                if (concurrentLinkedQueue.isEmpty() || !atomicBoolean.compareAndSet(false, true)) {
                                    break;
                                }
                            }
                        } catch (Throwable th) {
                            this.B.set(false);
                            throw th;
                        }
                    }
                }
            } else if (iA == 2) {
                this.a.kk(lT);
                if (z2) {
                    u();
                }
            } else {
                ((agrc) ((agrc) y.b()).k("com/google/android/libraries/youtube/common/startup/StartupState", "onNextWithoutLockDuringEmission", 1063, "StartupState.java")).u("StartupState: unexpected release lock mode %d", iA);
                this.a.kk(lT);
                if (z2) {
                    u();
                }
            }
            return true;
        }
    }

    public final void p(int i) {
        v(i);
        int i2 = tqr.a;
        if (this.D.k(1073830482)) {
            if (i == 238 || i == 243) {
                this.q = Boolean.TRUE;
            } else if (i == 239 || i == 244 || i == 245 || i == 246) {
                this.q = Boolean.FALSE;
            }
        }
        trj trjVar = this.b;
        if (trjVar.g(i, 32)) {
            trjVar.h(i);
        }
    }

    public final void r(int i) {
        tqj tqjVar = this.D;
        if (tqjVar != null) {
            int i2 = tqr.a;
            if (tqjVar.l(1074814102, 32)) {
                v(i);
            }
        }
        this.b.g(i, 16);
    }

    public static void s(int i) {
    }
}
