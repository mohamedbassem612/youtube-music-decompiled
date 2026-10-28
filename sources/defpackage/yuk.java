package defpackage;

import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yuk implements ytq {
    public final /* synthetic */ yul a;

    public yuk(yul yulVar) {
        this.a = yulVar;
    }

    private final void i(ytr ytrVar) {
        yul yulVar = this.a;
        if (yulVar.k()) {
            if (yulVar.j != 0 && yulVar.d != zsf.f) {
                ytrVar.Q(yulVar.j, true == yulVar.c.br() ? 2 : 1);
            }
            yulVar.h(yulVar.i);
            yulVar.d(false);
            if (!yulVar.k) {
                yulVar.u = false;
                return;
            }
            yui yuiVar = yulVar.p;
            if (yuiVar != null && yuiVar.m) {
                yulVar.f(yulVar.h);
                if (yulVar.c.ec()) {
                    yulVar.g(yulVar.l);
                }
            }
            yulVar.b();
        }
    }

    @Override // defpackage.ytq
    public final void a(ytr ytrVar) {
        yul yulVar = this.a;
        yulVar.r = true;
        yulVar.a.n = ytrVar.D();
        i(ytrVar);
    }

    @Override // defpackage.ytq
    public final void b(ytr ytrVar, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        yul yulVar = this.a;
        if (yulVar.b.getMainLooper().getThread() == Thread.currentThread()) {
            zlm zlmVar = yulVar.n;
            if (zlmVar != null) {
                zlmVar.k(i, i2);
            }
        } else {
            yulVar.a.g.post(new yuj(this, i, i2, 0));
        }
        if (yulVar.q) {
            return;
        }
        yulVar.q = true;
        i(ytrVar);
    }

    @Override // defpackage.ytq
    public final void c(int i) {
        int i2;
        if (i > 90 && ((i2 = this.a.a.o) == i || i2 == 100)) {
            i = 100;
        }
        this.a.a.o = i;
    }

    @Override // defpackage.ytq
    public final void d() {
        yul yulVar = this.a;
        yulVar.j = 0L;
        yulVar.s = false;
        yulVar.k = false;
        yulVar.m.g();
        yulVar.a.Q(false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    @Override // defpackage.ytq
    public final boolean e(int i, int i2) {
        boolean z;
        int i3;
        yul yulVar = this.a;
        yui yuiVar = yulVar.p;
        if (yuiVar != null) {
            ((agrc) ((agrc) yuo.a.b()).k("com/google/android/libraries/youtube/media/player/androidframework/AndroidFrameworkPlayerWrapper$MediaPlayerThread$PlayerListener", "onError", 1851, "AndroidFrameworkPlayerWrapper.java")).E("AndroidFwPlayer: error [prepared=%b, what=%d, extra=%d]", Boolean.valueOf(yulVar.r), Integer.valueOf(i), Integer.valueOf(i2));
            long j = yulVar.j;
            yuo yuoVar = yulVar.a;
            int i4 = yuoVar.s.get();
            int i5 = yuoVar.q;
            boolean zH = yuoVar.u.h();
            wgs wgsVar = yuiVar.b;
            if (i == 1) {
                z = true;
            } else if (i == 261) {
                i = 261;
                z = true;
            } else {
                z = false;
            }
            boolean zW = zH | wgsVar.W();
            String strS = "fmt.unplayable";
            String strBQ = null;
            if (z) {
                if (i2 == Integer.MIN_VALUE) {
                    strS = yuo.s(zW, "net.timeout");
                    strBQ = yuo.t(wgsVar);
                } else if (i2 == -1010) {
                    strBQ = yuo.q(wgsVar);
                } else if (i2 != -1007) {
                    switch (i2) {
                        case -1005:
                            strS = yuo.s(zW, "net.closed");
                            strBQ = yuo.t(wgsVar);
                            break;
                        case -1004:
                            strS = yuo.s(zW, "net.timeout");
                            strBQ = yuo.t(wgsVar);
                            break;
                        case -1003:
                            strS = yuo.s(zW, "net.connect");
                            strBQ = yuo.t(wgsVar);
                            break;
                        case -1002:
                            strS = yuo.s(zW, "net.dns");
                            strBQ = yuo.t(wgsVar);
                            break;
                        default:
                            i3 = i;
                            strS = null;
                            break;
                    }
                } else {
                    strBQ = yuo.q(wgsVar);
                    strS = "fmt.decode";
                }
                i3 = i;
            } else {
                i3 = 200;
                if (i == 200) {
                    strBQ = "itag." + wgsVar.e();
                } else {
                    i3 = i;
                    strS = null;
                }
            }
            if (strS == null) {
                strBQ = a.bQ(i2, i3, "w.", ";e.");
                strS = "android.fw";
            }
            zhz zhzVar = new zhz(strS, j, strBQ);
            if (i4 >= i5) {
                zhzVar.o();
            }
            h(zhzVar, i);
        }
        return true;
    }

    @Override // defpackage.ytq
    public final boolean f(int i, int i2) {
        if (i == 701) {
            this.a.d(true);
        } else if (i == 702) {
            this.a.d(false);
        }
        return false;
    }

    @Override // defpackage.ytq
    public final void g() {
        yul yulVar = this.a;
        yuo yuoVar = yulVar.a;
        if (yuoVar.k) {
            yuoVar.k = false;
            if (yulVar.t) {
                return;
            }
            if (!yulVar.s) {
                yulVar.m.m();
            } else {
                yulVar.m.q();
                yulVar.m.s(-1L);
            }
        }
    }

    public final void h(zhz zhzVar, int i) {
        wiu wiuVar;
        zlm zlmVar;
        yul yulVar = this.a;
        yui yuiVar = yulVar.p;
        if (yuiVar != null) {
            ywn ywnVar = yuiVar.g;
            if (ywnVar == null) {
                ywnVar = ywn.b;
            }
            if (!zhzVar.f) {
                yulVar.u = true;
                yulVar.a.s.incrementAndGet();
                if (i == 100 && (zlmVar = yulVar.n) != null) {
                    zlmVar.H();
                }
            } else if (yulVar.c.aj() && (wiuVar = yulVar.o) != null && wiuVar.X().contains(zhzVar.f())) {
                yuo yuoVar = yulVar.a;
                AtomicInteger atomicInteger = yuoVar.t;
                yulVar.u = atomicInteger.get() < yuoVar.r;
                if (yulVar.u) {
                    atomicInteger.incrementAndGet();
                    zhzVar = zhzVar.c(zhu.SAME_CONDITION);
                }
            } else {
                yulVar.u = false;
            }
            ywnVar.k(zhzVar);
            if (!yulVar.u) {
                yuo yuoVar2 = yulVar.a;
                yuoVar2.g.post(new ygz(this, 12));
                yuoVar2.h = false;
            } else {
                yuo yuoVar3 = yulVar.a;
                wgs wgsVar = yuiVar.b;
                long j = yulVar.j;
                if (yulVar.d != zsf.f) {
                    ywnVar = ywn.b;
                }
                yuoVar3.x(wgsVar, j, null, null, null, ywnVar, Optional.empty());
            }
        }
    }
}
