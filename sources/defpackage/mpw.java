package defpackage;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mpw implements nvr {
    private final boolean a;

    public mpw(agev agevVar) {
        this.a = ((Boolean) agevVar.e(Boolean.FALSE)).booleanValue();
    }

    private final float b(float f, DisplayMetrics displayMetrics) {
        return (!this.a || displayMetrics == null) ? f : TypedValue.applyDimension(1, f, displayMetrics);
    }

    private static int f(int i) {
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 5;
            case 6:
            case 7:
                return 6;
            default:
                return 0;
        }
    }

    @Override // defpackage.nvr
    public final mep a() {
        return ndn.ae;
    }

    @Override // defpackage.nvs
    public final /* synthetic */ void c(fhd fhdVar, nsl nslVar, Object obj, ntq ntqVar) {
        throw null;
    }

    @Override // defpackage.nvs
    public final void d(ntq ntqVar) {
        ntqVar.a().P(1.0f);
    }

    @Override // defpackage.nvs
    public final /* synthetic */ void e(fhd fhdVar, nsl nslVar, String str, Object obj, ntq ntqVar, nru nruVar) {
        int i;
        ndn ndnVar = (ndn) obj;
        fgv fgvVarA = ntqVar.a();
        float fG = ndnVar.g();
        if (fG > 0.0f) {
            fgvVarA.n(fG);
        }
        int i2 = 2;
        if (ndnVar.u() && qnl.by(ndnVar.m())) {
            if (ndnVar.m().i() - 1 != 2) {
                fgvVarA.v(fgvVarA.c.z(ndnVar.m().co()));
            } else {
                fgvVarA.u(ndnVar.m().co() * 100.0f);
            }
        }
        if (ndnVar.w()) {
            fgvVarA.O(ndnVar.h());
        }
        if (ndnVar.x()) {
            fgvVarA.P(ndnVar.i());
        }
        if (ndnVar.M() - 1 != 2) {
            fgvVarA.U(2);
        } else {
            fgvVarA.U(3);
        }
        if (ndnVar.cm()) {
            nal nalVarS = ndnVar.s();
            if (qnl.by(nalVarS)) {
                if (nalVarS.i() - 1 != 2) {
                    fgvVarA.k(nalVarS.co());
                } else {
                    fgvVarA.W(nalVarS.co() * 100.0f);
                }
            }
        }
        if (ndnVar.y()) {
            nal nalVarN = ndnVar.n();
            if (qnl.by(nalVarN)) {
                if (nalVarN.i() - 1 != 2) {
                    fgvVarA.x(nalVarN.co());
                } else {
                    fgvVarA.y(nalVarN.co() * 100.0f);
                }
            }
        }
        if (ndnVar.B()) {
            nal nalVarP = ndnVar.p();
            if (qnl.by(nalVarP)) {
                if (nalVarP.i() - 1 != 2) {
                    int iZ = fgvVarA.c.z(nalVarP.co());
                    fgs fgsVar = (fgs) fgvVarA.b.k().E();
                    fgsVar.a |= 16;
                    fgsVar.f = iZ;
                } else {
                    float fCo = nalVarP.co() * 100.0f;
                    fgs fgsVar2 = (fgs) fgvVarA.b.k().E();
                    fgsVar2.a |= 32;
                    fgsVar2.g = fCo;
                }
            }
        }
        if (ndnVar.A()) {
            nal nalVarO = ndnVar.o();
            if (qnl.by(nalVarO)) {
                if (nalVarO.i() - 1 != 2) {
                    int iZ2 = fgvVarA.c.z(nalVarO.co());
                    fgs fgsVar3 = (fgs) fgvVarA.b.k().E();
                    fgsVar3.a |= SemanticState.ReadOnly;
                    fgsVar3.l = iZ2;
                } else {
                    float fCo2 = nalVarO.co() * 100.0f;
                    fgs fgsVar4 = (fgs) fgvVarA.b.k().E();
                    fgsVar4.a |= SemanticState.Modal;
                    fgsVar4.m = fCo2;
                }
            }
        }
        if (ndnVar.D()) {
            nal nalVarR = ndnVar.r();
            if (qnl.by(nalVarR)) {
                if (nalVarR.i() - 1 != 2) {
                    fgvVarA.C(fgvVarA.c.z(nalVarR.co()));
                } else {
                    fgvVarA.B(nalVarR.co() * 100.0f);
                }
            }
        }
        if (ndnVar.C()) {
            nal nalVarQ = ndnVar.q();
            if (qnl.by(nalVarQ)) {
                if (nalVarQ.i() - 1 != 2) {
                    fgvVarA.R(fgvVarA.c.z(nalVarQ.co()));
                } else {
                    float fCo3 = nalVarQ.co() * 100.0f;
                    fgs fgsVar5 = (fgs) fgvVarA.b.k().E();
                    fgsVar5.a |= SemanticState.LiveRegion;
                    fgsVar5.k = fCo3;
                }
            }
        }
        if (ndnVar.z()) {
            qnl.bx(ndnVar.j(), new mpv(fgvVarA, i2));
        }
        if (ndnVar.F()) {
            qnl.bx(ndnVar.l(), new mlk(fgvVarA, 2));
        }
        int I = ndnVar.I();
        if (I != 1) {
            fgvVarA.l(f(I));
        }
        int i3 = 0;
        if (ndnVar.E()) {
            qnl.bx(ndnVar.k(), new mpv(fgvVarA, i3));
        }
        boolean z = fgvVarA instanceof mjd;
        if (z || (fgvVarA instanceof mmg)) {
            fgvVarA.s();
            int iF = ndnVar.H() != 1 ? f(ndnVar.H()) : 0;
            int iF2 = ndnVar.G() != 1 ? f(ndnVar.G()) : 0;
            int iK = ndnVar.K() - 1;
            if (iK != 0) {
                if (iK != 1) {
                    i3 = iK != 2 ? 3 : 2;
                } else {
                    i3 = 1;
                }
            }
            int iL = ndnVar.L() - 1;
            if (iL == 0 || iL == 1) {
                i = 1;
            } else if (iL == 2) {
                i = 3;
            } else if (iL == 3) {
                i = 2;
            } else if (iL != 4) {
                i = 5;
                if (iL != 5) {
                    i = 6;
                }
            } else {
                i = 4;
            }
            if (z) {
                mjd mjdVar = (mjd) fgvVarA;
                if (iF != 0) {
                    mjdVar.d(iF);
                }
                if (i3 != 0) {
                    mjdVar.h(i3);
                }
                mjdVar.f(i);
                if (iF2 != 0) {
                    mjdVar.c(iF2);
                }
                if (ndnVar.v()) {
                    nbo nboVarT = ndnVar.t();
                    DisplayMetrics displayMetrics = this.a ? fhdVar.a.getResources().getDisplayMetrics() : null;
                    if (nboVarT.al()) {
                        mjdVar.a.f = Float.valueOf(b(nboVarT.ai(), displayMetrics));
                    }
                    if (nboVarT.am()) {
                        mjdVar.a.g = Float.valueOf(b(nboVarT.aj(), displayMetrics));
                    }
                    if (nboVarT.ak()) {
                        mjdVar.a.e = Float.valueOf(b(nboVarT.ah(), displayMetrics));
                    }
                }
            } else {
                mmg mmgVar = (mmg) fgvVarA;
                if (iF != 0) {
                    mmgVar.c(iF);
                }
                if (i3 != 0) {
                    mmgVar.f(i3);
                }
                mmgVar.e(i);
                if (iF2 != 0) {
                    mmgVar.b(iF2);
                }
            }
        }
        int iN = ndnVar.N() - 1;
        if (iN != 1) {
            if (iN == 2) {
                fgvVarA.A(fwl.RTL);
                return;
            } else if (iN != 3 && iN != 4) {
                fgvVarA.A(fwl.INHERIT);
                return;
            }
        }
        fgvVarA.A(fwl.LTR);
    }
}
