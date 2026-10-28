package defpackage;

import app.rive.semantics.SemanticState;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zcm {
    private static final btm k = new btm();
    public final zcf a;
    protected final boolean b;
    public int c = 1;
    zgi d;
    public boolean e;
    public volatile boolean f;
    public boolean g;
    public boolean h;
    public final zcn i;
    public volatile zcl j;
    private final btm l;
    private cdy m;
    private Long n;
    private Boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private final boolean s;

    public zcm(zcf zcfVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = zcfVar;
        tqj tqjVar = zcfVar.H.v;
        int i = tqr.a;
        if (tqjVar.l(1075073767, SemanticState.Focused)) {
            this.l = new btm();
        } else {
            this.l = k;
        }
        this.d = zgi.NOT_STARTED;
        this.j = zcl.c;
        long jX = zcfVar.H.x();
        zcn zcnVar = new zcn(zcfVar, jX, scheduledExecutorService);
        this.i = zcnVar;
        this.b = zcfVar.H.j.l(80, 45381673L, false);
        boolean z = jX > 0;
        this.s = z;
        if (z) {
            zcnVar.a(this.d);
        }
    }

    private final long g(cdy cdyVar) {
        return yno.z(i(cdyVar), cdyVar.i);
    }

    private final long h(cdy cdyVar) {
        if (cdyVar != null) {
            btn btnVar = cdyVar.b;
            if (!btnVar.n()) {
                int i = cdyVar.c;
                btm btmVar = this.l;
                btnVar.e(i, btmVar, 0L);
                if (btmVar != null && !btmVar.j) {
                    return bwp.F(yno.z(btmVar.q, btmVar.n));
                }
            }
        }
        return -9223372036854775807L;
    }

    private final long i(cdy cdyVar) {
        btn btnVar = cdyVar.b;
        if (btnVar.n()) {
            return -9223372036854775807L;
        }
        int i = cdyVar.c;
        btm btmVar = this.l;
        btnVar.e(i, btmVar, 0L);
        return bwp.F(btmVar.q);
    }

    private final void j(cdy cdyVar, boolean z, int i) {
        k(yno.z(i(cdyVar), cdyVar.i), z, i, cdyVar);
    }

    /* JADX WARN: Code duplicated, block: B:99:0x01de  */
    private final void k(long j, boolean z, int i, cdy cdyVar) {
        zcf zcfVar;
        zcf zcfVar2 = this.a;
        zfc zfcVar = zcfVar2.x;
        long j2 = zcfVar2.A.h;
        boolean z2 = false;
        if (i == 2) {
            if (z) {
                ywj ywjVar = zcfVar2.b;
                ywjVar.b().ae();
                ywjVar.e();
                e(zgi.BUFFERING);
            } else if (zcfVar2.H.cO() && this.p) {
                ywj ywjVar2 = zcfVar2.b;
                ywjVar2.b().ai();
                ywjVar2.m();
                zfcVar.d();
                e(zgi.PAUSED);
            } else {
                ywj ywjVar3 = zcfVar2.b;
                ywjVar3.b().aj();
                ywjVar3.n();
                e(zgi.PAUSED_BUFFERING);
            }
            yyv yyvVar = zcfVar2.af;
            long jE = yyvVar.d.e();
            wgs wgsVarL = yyvVar.l();
            wgs wgsVarK = yyvVar.k();
            long j3 = wgsVarL != null ? wgsVarL.g : 0L;
            if (wgsVarK != null) {
                j3 += (long) wgsVarK.g;
            }
            if (!zfcVar.d && zfcVar.c && !zfcVar.p && zfcVar.g.ordinal() == 3) {
                long jA = zfcVar.a();
                if (j != -9223372036854775807L && j > r13 && j != zfcVar.b && j3 > r13 && jE != -1 && jE > 0 && jA != Long.MAX_VALUE) {
                    long j4 = zfcVar.o;
                    if (zfcVar.l && zfcVar.h(j, jA + ((j4 * j3) / jE))) {
                        zfcVar.g();
                        yyvVar.af(zcfVar2, appa.SEEK_SOURCE_PEG_TO_LIVE);
                    }
                } else if (zfcVar.l && zfcVar.h(j, jA)) {
                    zfcVar.g();
                    yyvVar.af(zcfVar2, appa.SEEK_SOURCE_PEG_TO_LIVE);
                }
            }
        } else if (i != 3) {
            if (i != 4) {
                zcfVar2.b.b().ao();
            } else {
                ywj ywjVar4 = zcfVar2.b;
                ywjVar4.b().af();
                zcfVar2.af.ag(zcfVar2, false);
                ywjVar4.g();
                e(zgi.ENDED);
            }
        } else if (z) {
            boolean z3 = zfcVar.p;
            zfcVar.p = false;
            if (!zfcVar.d && zfcVar.c && !z3 && zfcVar.g.ordinal() == 3 && zfcVar.m) {
                zfcVar.g();
                zcfVar2.b.b().ah();
                zcfVar2.af.af(zcfVar2, appa.SEEK_SOURCE_PEG_TO_LIVE);
            } else {
                if (!zcfVar2.L || zcfVar2.N) {
                    ywj ywjVar5 = zcfVar2.b;
                    ywjVar5.b().al();
                    ywjVar5.q();
                    e(zgi.PLAYING);
                    zcfVar2.J.a();
                    z2 = true;
                } else {
                    zcfVar2.b.b().ap();
                    zcfVar2.M = true;
                    e(zgi.PAUSED);
                }
                long jH = h(cdyVar);
                if (this.h && (((jH != -9223372036854775807L && j >= jH) || (j2 > 0 && j >= j2)) && (zcfVar = zcfVar2.m) != null)) {
                    zcfVar.L = true;
                }
            }
        } else {
            long jH2 = h(cdyVar);
            if (!this.h || ((jH2 == -9223372036854775807L || j < jH2) && (j2 <= 0 || j < j2))) {
                ywj ywjVar6 = zcfVar2.b;
                ywjVar6.b().ai();
                ywjVar6.m();
                zcfVar2.af.am(zcfVar2);
                zfcVar.d();
                e(zgi.PAUSED);
            } else {
                ywj ywjVar7 = zcfVar2.b;
                ywjVar7.b().ak();
                ywjVar7.g();
                zcfVar2.af.ag(zcfVar2, true);
                e(zgi.ENDED);
            }
        }
        this.f = z2;
    }

    private final void l(boolean z, cdy cdyVar) {
        if (this.p) {
            this.p = false;
            zcf zcfVar = this.a;
            zcfVar.b.w(g(cdyVar), zcfVar.h);
        }
        if (this.r || !z) {
            return;
        }
        this.r = true;
        this.a.af.ad();
    }

    private final void m(cdy cdyVar, boolean z, int i) {
        boolean z2 = this.b;
        if (z2) {
            this.n = Long.valueOf(g(cdyVar));
        } else {
            this.m = cdyVar;
        }
        boolean z3 = this.e;
        if (z3) {
            this.q = true;
        }
        if (!this.p && !z3) {
            if (z2) {
                k(g(cdyVar), z, i, cdyVar);
                return;
            } else {
                j(cdyVar, z, i);
                return;
            }
        }
        zcf zcfVar = this.a;
        if (zcfVar.H.cO() && this.p && !z) {
            k(g(cdyVar), false, i, cdyVar);
        } else {
            zcfVar.b.b().an();
        }
    }

    private final boolean n() {
        Boolean boolValueOf = this.o;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(this.a.af.f.G());
            this.o = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public final void a() {
        if (this.e) {
            this.e = false;
            if (this.p || !this.q) {
                return;
            }
            this.q = false;
            if (this.b) {
                zkf.d(this.n);
                k(this.n.longValue(), n(), this.c, null);
            } else {
                zkf.d(this.m);
                j(this.m, n(), this.c);
            }
        }
    }

    public final void b(cdy cdyVar, int i) {
        boolean zN = n();
        if ((this.c == 2 || this.a.H.de()) && i != 2) {
            this.g = true;
        }
        if (i == 3) {
            l(zN, cdyVar);
        }
        this.c = i;
        m(cdyVar, zN, i);
    }

    public final void c(cdy cdyVar, boolean z, int i) {
        if ((this.c == 2 || this.a.H.de()) && i != 2) {
            this.g = true;
        }
        if (i == 3) {
            l(z, cdyVar);
        }
        this.c = i;
        this.o = Boolean.valueOf(z);
        m(cdyVar, z, i);
    }

    public final void d() {
        this.g = false;
        this.p = true;
        e(zgi.SEEKING);
    }

    public final void e(zgi zgiVar) {
        if (zgiVar != this.d) {
            this.d = zgiVar;
            this.j.a(this.d);
            if (this.s) {
                this.i.a(this.d);
            }
        }
    }

    public final void f(cdy cdyVar, boolean z) {
        if (this.c == 3) {
            l(z, cdyVar);
        }
        this.o = Boolean.valueOf(z);
        int i = this.c;
        if (i != 1) {
            m(cdyVar, z, i);
        }
    }
}
