package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mlj extends fkx {

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nry a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nsl b;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nso c;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nte d;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nbi e;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nuc f;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    Map g;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nxl q;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj r;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    omj s;

    public mlj() {
        super("ExpandableTextComponent");
    }

    public static fip aE(fhd fhdVar, omj omjVar, omj omjVar2) {
        return o(mlj.class, "ExpandableTextComponent", fhdVar, 2076732558, new Object[]{fhdVar, omjVar, omjVar2});
    }

    private static final mli aF(fhd fhdVar) {
        return (mli) fhdVar.i().c;
    }

    @Override // defpackage.fgy
    protected final Object A(fip fipVar, Object obj) {
        int i = fipVar.c;
        if (i == -1048037474) {
            gzj.bO((fhd) fipVar.d[0], (isw) obj);
        } else if (i == 2076732558) {
            fiu fiuVar = fipVar.b;
            Object[] objArr = fipVar.d;
            fhd fhdVar = (fhd) objArr[0];
            omj omjVar = (omj) objArr[1];
            omj omjVar2 = (omj) objArr[2];
            mlj mljVar = (mlj) fiuVar;
            mli mliVarAF = aF(fhdVar);
            nry nryVar = mljVar.a;
            nsl nslVar = mljVar.b;
            boolean zBooleanValue = mliVarAF.a.booleanValue();
            if (fhdVar.c != null) {
                fhdVar.x(new aero(0, new Object[0]), "updateState:ExpandableTextComponent.updateExpand");
            }
            ntx ntxVar = nslVar.x;
            nrt nrtVarD = nrv.d();
            nrtVarD.g = ntxVar;
            ntg ntgVar = nslVar.t;
            if (ntgVar != null) {
                nrtVarD.f = ntgVar;
            }
            if (zBooleanValue) {
                if (omjVar2 != null) {
                    nryVar.a(omjVar2.x(), nrtVarD.a()).D();
                }
            } else if (omjVar != null) {
                nryVar.a(omjVar.x(), nrtVarD.a()).D();
            }
        }
        return null;
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        aF(fhdVar).a = Boolean.FALSE;
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        ((mli) fkyVar2).a = ((mli) fkyVar).a;
    }

    @Override // defpackage.fgy
    public final boolean O() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean S() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0123  */
    /* JADX WARN: Code duplicated, block: B:48:0x0145 A[Catch: aiik -> 0x01d1, TryCatch #0 {aiik -> 0x01d1, blocks: (B:46:0x013d, B:48:0x0145, B:49:0x0169), top: B:74:0x013d }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0187  */
    /* JADX WARN: Code duplicated, block: B:55:0x019a  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01da  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.fkx
    protected final fgy aD(fhd fhdVar, int i, int i2) {
        mxc mxcVarJ;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        fgq fgqVar;
        omj omjVar;
        msk mskVarAE;
        aihf aihfVarCreateBuilder;
        boolean z7;
        mli mliVarAF = aF(fhdVar);
        omj omjVar2 = this.s;
        omj omjVar3 = this.r;
        nbi nbiVar = this.e;
        nry nryVar = this.a;
        nxl nxlVar = this.q;
        nsl nslVar = this.b;
        nuc nucVar = this.f;
        nso nsoVar = this.c;
        Map map = this.g;
        nte nteVar = this.d;
        Boolean bool = mliVarAF.a;
        msk mskVarAE2 = msm.aE(fhdVar);
        mskVarAE2.c(nryVar);
        mskVarAE2.j(nxlVar);
        mskVarAE2.f(nteVar);
        mskVarAE2.g(nucVar);
        mskVarAE2.e(nsoVar);
        mskVarAE2.d(nslVar);
        mskVarAE2.i(ket.Q(nbiVar, bool.booleanValue()));
        mskVarAE2.h(map);
        msm msmVarA = mskVarAE2.a();
        fmc fmcVarAE = fmd.aE(fhdVar);
        fmcVarAE.c(msmVarA);
        fmcVarAE.O(1.0f);
        fmd fmdVarA = fmcVarAE.a();
        fgq fgqVarF = fgr.f(fhdVar);
        fgqVarF.f(fmdVarA);
        String strU = null;
        if (bool.booleanValue()) {
            if (nbiVar.r()) {
                mxcVarJ = nbiVar.i();
            } else {
                mxcVarJ = null;
            }
        } else if (nbiVar.s()) {
            mxcVarJ = nbiVar.j();
        } else {
            mxcVarJ = null;
        }
        if (mxcVarJ != null && mxcVarJ.y()) {
            strU = mxcVarJ.u();
        }
        int iA = nbiVar.A() - 1;
        if (iA == 2) {
            z = !bool.booleanValue();
            z2 = (bool.booleanValue() || strU == null) ? false : true;
        } else if (iA != 3) {
            z2 = strU != null;
            z = true;
        } else {
            z2 = strU != null;
            z = false;
        }
        if (!bool.booleanValue() && z2) {
            msk mskVarAE3 = msm.aE(fhdVar);
            mskVarAE3.c(nryVar);
            mskVarAE3.f(nteVar);
            mskVarAE3.j(nxlVar);
            mskVarAE3.g(nucVar);
            mskVarAE3.e(nsoVar);
            mskVarAE3.d(nslVar);
            z3 = z2;
            z4 = z;
            mskVarAE3.i(ket.Q(nbiVar, true));
            mskVarAE3.h(map);
            msm msmVarA2 = mskVarAE3.a();
            fkw fkwVar = new fkw();
            msmVarA2.am(fhdVar, i, 0, fkwVar);
            fkw fkwVar2 = new fkw();
            msmVarA.am(fhdVar, i, 0, fkwVar2);
            if (fkwVar.a == fkwVar2.a && fkwVar.b == fkwVar2.b) {
                z5 = false;
                z6 = false;
            }
            if (z5) {
                mskVarAE = msm.aE(fhdVar);
                mskVarAE.c(nryVar);
                mskVarAE.f(nteVar);
                mskVarAE.j(nxlVar);
                mskVarAE.g(nucVar);
                mskVarAE.e(nsoVar);
                mskVarAE.d(nslVar);
                if (mxcVarJ instanceof ngf) {
                    throw new nud("Unsupported data layer type (FBS is deprecated)");
                }
                try {
                    aihfVarCreateBuilder = asor.a.createBuilder();
                    if (mxcVarJ != null) {
                        askp askpVar = (askp) aihn.parseFrom(askp.a, mxcVarJ.f(), ExtensionRegistryLite.getGeneratedRegistry());
                        aihfVarCreateBuilder.copyOnWrite();
                        asor asorVar = (asor) aihfVarCreateBuilder.instance;
                        askpVar.getClass();
                        asorVar.c = askpVar;
                        asorVar.b |= 1;
                    }
                    mskVarAE.i(nob.aR(((asor) aihfVarCreateBuilder.build()).toByteArray()));
                    mskVarAE.h(map);
                    mskVarAE.O(0.0f);
                    if (nbiVar.v()) {
                        qnl.bx(nbiVar.p(), new mlk(mskVarAE, 1));
                    }
                    if (nbiVar.u()) {
                        z7 = false;
                        qnl.bx(nbiVar.o(), new mlk(mskVarAE, 0));
                    } else {
                        z7 = false;
                    }
                    fkr fkrVarF = fks.f(fhdVar);
                    fkrVarF.f(mskVarAE.a());
                    if (nbiVar.t() || !z6) {
                        omjVar = omjVar2;
                        z7 = z6;
                    } else {
                        omjVar = omjVar2;
                        mskVarAE.q(aE(fhdVar, omjVar, omjVar3));
                    }
                    fgqVar = fgqVarF;
                    fgqVar.j(fkrVarF);
                    z6 = z7;
                } catch (aiik e) {
                    throw new nud("Failed to create ExpandableTextComponent", e);
                }
            } else {
                fgqVar = fgqVarF;
                omjVar = omjVar2;
            }
            if (z6) {
                fgqVar.q(aE(fhdVar, omjVar, omjVar3));
            }
            return fgqVar.a;
        }
        z3 = z2;
        z4 = z;
        z5 = z3;
        z6 = z4;
        if (z5) {
            mskVarAE = msm.aE(fhdVar);
            mskVarAE.c(nryVar);
            mskVarAE.f(nteVar);
            mskVarAE.j(nxlVar);
            mskVarAE.g(nucVar);
            mskVarAE.e(nsoVar);
            mskVarAE.d(nslVar);
            if (mxcVarJ instanceof ngf) {
                throw new nud("Unsupported data layer type (FBS is deprecated)");
            }
            aihfVarCreateBuilder = asor.a.createBuilder();
            if (mxcVarJ != null) {
                askp askpVar2 = (askp) aihn.parseFrom(askp.a, mxcVarJ.f(), ExtensionRegistryLite.getGeneratedRegistry());
                aihfVarCreateBuilder.copyOnWrite();
                asor asorVar2 = (asor) aihfVarCreateBuilder.instance;
                askpVar2.getClass();
                asorVar2.c = askpVar2;
                asorVar2.b |= 1;
            }
            mskVarAE.i(nob.aR(((asor) aihfVarCreateBuilder.build()).toByteArray()));
            mskVarAE.h(map);
            mskVarAE.O(0.0f);
            if (nbiVar.v()) {
                qnl.bx(nbiVar.p(), new mlk(mskVarAE, 1));
            }
            if (nbiVar.u()) {
                z7 = false;
                qnl.bx(nbiVar.o(), new mlk(mskVarAE, 0));
            } else {
                z7 = false;
            }
            fkr fkrVarF2 = fks.f(fhdVar);
            fkrVarF2.f(mskVarAE.a());
            if (nbiVar.t()) {
                omjVar = omjVar2;
                z7 = z6;
            } else {
                omjVar = omjVar2;
                z7 = z6;
            }
            fgqVar = fgqVarF;
            fgqVar.j(fkrVarF2);
            z6 = z7;
        } else {
            fgqVar = fgqVarF;
            omjVar = omjVar2;
        }
        if (z6) {
            fgqVar.q(aE(fhdVar, omjVar, omjVar3));
        }
        return fgqVar.a;
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        return (mlj) super.l();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new mli();
    }
}
