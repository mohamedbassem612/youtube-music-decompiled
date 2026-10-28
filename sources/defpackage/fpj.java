package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpj extends fkx {
    public static final /* synthetic */ int K = 0;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public fpo A;

    @fmt(a = 3)
    @fmu(a = fmv.h)
    int B;

    @fmt(a = 15)
    @fmu(a = fmv.a)
    public foe C;

    @fmt(a = 3)
    @fmu(a = fmv.h)
    int D;
    fiq E;
    fiq F;
    fiq G;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public mhc H;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public ftc I;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public qa J;

    @fmt(a = 3)
    @fmu(a = fmv.h)
    int a;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean b;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean c;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean d;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean e;

    @fmt(a = 10)
    @fmu(a = fmv.a)
    fgy f;

    @fmt(a = 10)
    @fmu(a = fmv.a)
    fgy g;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean q;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean r;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nl s;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nt t;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int u;

    @fmt(a = 3)
    @fmu(a = fmv.h)
    int v;

    @fmt(a = 10)
    @fmu(a = fmv.a)
    fgy w;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean x;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    List y;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int z;

    public fpj() {
        super("RecyclerCollectionComponent");
        this.c = true;
        this.d = true;
        this.r = true;
        this.s = fpm.b;
        this.x = true;
        this.y = Collections.EMPTY_LIST;
        this.z = 0;
        this.A = fpm.a;
    }

    private final fpi aE(fhd fhdVar) {
        return (fpi) fhdVar.i().c;
    }

    @Override // defpackage.fgy
    protected final Object A(fip fipVar, Object obj) {
        foe foeVar;
        int i = fipVar.c;
        if (i != -1873243140) {
            if (i != -1048037474) {
                return null;
            }
            gzj.bO((fhd) fipVar.d[0], (isw) obj);
            return null;
        }
        fiu fiuVar = fipVar.b;
        Object[] objArr = fipVar.d;
        fhd fhdVar = (fhd) objArr[0];
        foq foqVar = (foq) objArr[1];
        boolean z = ((fpj) fiuVar).q;
        fpo fpoVar = fpm.a;
        fgy fgyVar = fhdVar.c;
        if (fgyVar != null) {
        }
        synchronized (foqVar) {
            boolean z2 = foqVar.a;
            foeVar = foqVar.i;
        }
        if (foeVar != null) {
            foqVar.f(foeVar);
        }
        return Boolean.TRUE;
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        fpi fpiVarAE = aE(fhdVar);
        foe foeVar = this.C;
        fpo fpoVar = this.A;
        ftc ftcVar = this.I;
        boolean z = this.b;
        boolean z2 = this.r;
        fpo fpoVar2 = fpm.a;
        fpg fpgVarD = fpoVar.d();
        frj frjVarE = fpoVar.e(fhdVar);
        fss fssVar = new fss();
        fssVar.b = frjVarE;
        fssVar.q = fpgVarD.i;
        fssVar.a = fpgVarD.b;
        frg frgVar = fpgVarD.c;
        boolean z3 = fpgVarD.e;
        fssVar.g = fpgVarD.l;
        List list = fpgVarD.m;
        fssVar.h = null;
        fjf fjfVar = fpgVarD.w;
        boolean z4 = fpgVarD.k;
        boolean z5 = fpgVarD.d;
        fssVar.e = fpgVarD.h;
        fssVar.s = fpgVarD.s;
        fssVar.t = fpgVarD.t;
        fssVar.i = z2;
        fssVar.c = fpgVarD.a;
        fssVar.k = fpgVarD.f;
        boolean z6 = fpgVarD.o;
        fssVar.m = fpgVarD.p;
        fhz fhzVar = fpgVarD.x;
        fro froVar = fpgVarD.g;
        fim fimVar = fpgVarD.u;
        fssVar.o = fpgVarD.v;
        int i = fpgVarD.r;
        if (i != -1) {
            fssVar.b(i);
        }
        fpp fppVar = new fpp(fssVar.a(fhdVar), fpgVarD.j);
        fof fofVar = new fof(fhdVar);
        oq oqVarC = fpoVar.c();
        afwv afwvVar = new afwv(fofVar, fppVar);
        afwvVar.b = foeVar.f;
        fvu fvuVar = fpgVarD.n;
        boolean z7 = fpgVarD.q;
        foq foqVar = new foq(afwvVar);
        if (ftcVar == null) {
            ftcVar = new ftc();
        }
        int iB = fpoVar.b();
        if (iB == Integer.MIN_VALUE) {
            iB = Alert.DURATION_SHOW_INDEFINITELY;
        }
        ftcVar.c = iB;
        afwv afwvVar2 = new afwv(fhdVar, ftcVar);
        foqVar.l = afwvVar2;
        frx frxVar = new frx(foqVar, 1);
        fsy fsyVar = fppVar.a;
        fsyVar.N.a(frxVar);
        fsyVar.A = z;
        fpk fpkVar = fpk.a;
        if (oqVarC != null) {
            fpiVarAE.f = oqVarC;
        }
        fpiVarAE.e = foqVar;
        fpiVarAE.h = afwvVar2;
        fpiVarAE.a = fppVar;
        fpiVarAE.d = fpkVar;
        fpiVarAE.g = ftcVar;
        fpiVarAE.c = frjVarE;
    }

    @Override // defpackage.fgy
    public final void K(fhd fhdVar) {
        fpx fpxVar = aE(fhdVar).a;
        fpo fpoVar = fpm.a;
        fpxVar.ag();
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        fpi fpiVar = (fpi) fkyVar;
        fpi fpiVar2 = (fpi) fkyVar2;
        fpiVar2.a = fpiVar.a;
        fpiVar2.b = fpiVar.b;
        fpiVar2.g = fpiVar.g;
        fpiVar2.c = fpiVar.c;
        fpiVar2.d = fpiVar.d;
        fpiVar2.h = fpiVar.h;
        fpiVar2.e = fpiVar.e;
        fpiVar2.f = fpiVar.f;
    }

    @Override // defpackage.fgy
    public final boolean P() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean S() {
        return true;
    }

    @Override // defpackage.fkx
    protected final fgy aC(fhd fhdVar) {
        boolean z;
        fip fipVar;
        nl luVar;
        fpi fpiVarAE = aE(fhdVar);
        foe foeVar = this.C;
        fgy fgyVar = this.w;
        fgy fgyVar2 = this.f;
        fgy fgyVar3 = this.g;
        List list = this.y;
        boolean z2 = this.d;
        boolean z3 = this.c;
        boolean z4 = this.x;
        qa qaVar = this.J;
        nl nlVar = this.s;
        int i = this.z;
        int i2 = this.v;
        int i3 = this.B;
        int i4 = this.D;
        int i5 = this.a;
        mhc mhcVar = this.H;
        nt ntVar = this.t;
        boolean z5 = this.e;
        fpo fpoVar = this.A;
        int i6 = this.u;
        boolean z6 = fpiVarAE.b;
        ftc ftcVar = fpiVarAE.g;
        frj frjVar = fpiVarAE.c;
        fpk fpkVar = fpiVarAE.d;
        fpx fpxVar = fpiVarAE.a;
        foq foqVar = fpiVarAE.e;
        afwv afwvVar = fpiVarAE.h;
        oq oqVar = fpiVarAE.f;
        fpo fpoVar2 = fpm.a;
        if (fhdVar.c != null) {
            z = false;
            fhdVar.y(new aero(Integer.MIN_VALUE, new Object[]{Boolean.TRUE}));
        } else {
            z = false;
        }
        synchronized (foqVar) {
            boolean z7 = foqVar.a;
            foe foeVar2 = foqVar.i;
            if (foeVar2 == null || foeVar2.h != foeVar.h) {
                foe foeVar3 = foqVar.j;
                if (foeVar3 == null || foeVar3.h != foeVar.h) {
                    foqVar.j = foeVar != null ? foeVar.c(z) : null;
                    ((fpp) foqVar.d.b).a.z();
                    foqVar.j(0, null, null);
                }
            }
        }
        fpk fpkVar2 = fpk.d;
        boolean z8 = fpkVar == fpkVar2 && fgyVar3 == null;
        fpk fpkVar3 = fpk.c;
        if ((fpkVar == fpkVar3 && fgyVar2 == null) || z8) {
            return null;
        }
        boolean z9 = (fpoVar.a() == 0 || z5) ? false : true;
        fru fruVar = new fru(fhdVar, new frw());
        fruVar.c(z2);
        frw frwVar = fruVar.a;
        frwVar.r = i2;
        frwVar.B = i3;
        frwVar.D = i4;
        frwVar.b = i5;
        fruVar.r(z3);
        frwVar.s = z4;
        frwVar.y = -1;
        frwVar.v = i;
        frwVar.x = ftcVar;
        frwVar.z = !z9 ? null : o(fpj.class, "RecyclerCollectionComponent", fhdVar, -1873243140, new Object[]{fhdVar, foqVar});
        frwVar.w = z9;
        frwVar.F = qaVar;
        frwVar.f = fruVar.c.z(0.0f);
        fpl fplVar = new fpl(frjVar);
        if (frwVar.u == Collections.EMPTY_LIST) {
            frwVar.u = new ArrayList();
        }
        frwVar.u.add(fplVar);
        if (list != null) {
            if (frwVar.u.isEmpty()) {
                frwVar.u = list;
            } else {
                frwVar.u.addAll(list);
            }
        }
        frwVar.A = -12425294;
        frwVar.C = oqVar;
        frwVar.E = mhcVar;
        frwVar.t = ntVar;
        frwVar.a = fpxVar;
        fruVar.d.set(0);
        if (fpm.b == nlVar) {
            fipVar = null;
            luVar = new lu((byte[]) null);
        } else {
            fipVar = null;
            luVar = nlVar;
        }
        frwVar.g = luVar;
        fruVar.P(0.0f);
        fruVar.V(fipVar);
        frwVar.q = i6;
        if (!fpxVar.j()) {
            boolean z10 = fpoVar.d().e;
            fruVar.U(3);
            fruVar.T(9, 0);
        }
        int i7 = fgr.g;
        fgq fgqVar = new fgq(fhdVar, new fgr());
        fgqVar.P(0.0f);
        fgqVar.c(2);
        fgqVar.j(fruVar);
        if (fpkVar == fpk.a && fgyVar != null) {
            int i8 = fmd.b;
            fmc fmcVar = new fmc(fhdVar, new fmd());
            fmcVar.c(fgyVar);
            fmcVar.P(0.0f);
            fmcVar.U(3);
            fmcVar.T(9, 0);
            fgqVar.j(fmcVar);
        } else if (fpkVar == fpkVar3) {
            int i9 = fmd.b;
            fmc fmcVar2 = new fmc(fhdVar, new fmd());
            fmcVar2.c(fgyVar2);
            fmcVar2.P(0.0f);
            fmcVar2.U(3);
            fmcVar2.T(9, 0);
            fgqVar.j(fmcVar2);
        } else if (fpkVar == fpkVar2) {
            int i10 = fmd.b;
            fmc fmcVar3 = new fmc(fhdVar, new fmd());
            fmcVar3.c(fgyVar3);
            fmcVar3.P(0.0f);
            fmcVar3.U(3);
            fmcVar3.T(9, 0);
            fgqVar.j(fmcVar3);
        }
        return fgqVar.a;
    }

    @Override // defpackage.fgy
    protected final void ax(fiq fiqVar, Object obj) {
        int i = fiqVar.c;
        if (i == -1505688212) {
            fhd fhdVar = fiqVar.b;
            fpj fpjVar = (fpj) fiqVar.a;
            foq foqVar = fpjVar.aE(fhdVar).e;
            ftc ftcVar = fpjVar.aE(fhdVar).g;
            fpo fpoVar = fpm.a;
            String strC = foqVar.c();
            if (strC != null) {
                fvu fvuVar = foqVar.b;
                foj fojVar = new foj(foqVar, strC);
                if (gzj.aT()) {
                    fojVar.run();
                    return;
                } else {
                    ((fvt) fvuVar).post(fojVar);
                    return;
                }
            }
            return;
        }
        if (i == -1017305181) {
            ftc ftcVar2 = ((fpj) fiqVar.a).aE(fiqVar.b).g;
            fpo fpoVar2 = fpm.a;
            ftcVar2.b();
            return;
        }
        if (i == -238194236) {
            foq foqVar2 = ((fpj) fiqVar.a).aE(fiqVar.b).e;
            fpo fpoVar3 = fpm.a;
            if (foqVar2.g) {
                synchronized (foqVar2) {
                }
            }
        }
    }

    @Override // defpackage.fgy
    public final void az(fhd fhdVar, gat gatVar) {
        fiq fiqVar = this.E;
        if (fiqVar != null) {
            fiqVar.b = fhdVar;
            fiqVar.a = this;
            gatVar.d(fiqVar);
        }
        fiq fiqVar2 = this.F;
        if (fiqVar2 != null) {
            fiqVar2.b = fhdVar;
            fiqVar2.a = this;
            gatVar.d(fiqVar2);
        }
        fiq fiqVar3 = this.G;
        if (fiqVar3 != null) {
            fiqVar3.b = fhdVar;
            fiqVar3.a = this;
            gatVar.d(fiqVar3);
        }
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        fpj fpjVar = (fpj) super.l();
        fgy fgyVar = fpjVar.f;
        fpjVar.f = fgyVar != null ? fgyVar.l() : null;
        fgy fgyVar2 = fpjVar.g;
        fpjVar.g = fgyVar2 != null ? fgyVar2.l() : null;
        fgy fgyVar3 = fpjVar.w;
        fpjVar.w = fgyVar3 != null ? fgyVar3.l() : null;
        foe foeVar = fpjVar.C;
        fpjVar.C = foeVar != null ? foeVar.c(false) : null;
        return fpjVar;
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new fpi();
    }
}
