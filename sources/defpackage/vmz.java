package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class vmz implements vob {
    private boolean a;
    public final xgn e;
    public akuj f;
    protected amdd g;

    public vmz(xgn xgnVar) {
        this.e = xgnVar;
    }

    @Override // defpackage.vob
    public void A(akuj akujVar, amdd amddVar, adxd adxdVar) {
        this.f = akujVar;
        this.g = amddVar;
    }

    @Override // defpackage.vob
    public final void B(boolean z) {
        this.a = z;
    }

    @Override // defpackage.vob
    public final boolean D() {
        akuj akujVar = this.f;
        if (akujVar == null || (akujVar.c & Integer.MIN_VALUE) == 0) {
            return false;
        }
        return akujVar.J;
    }

    @Override // defpackage.vob
    public final boolean E() {
        akuj akujVar = this.f;
        if (akujVar == null || (akujVar.c & 1073741824) == 0) {
            return false;
        }
        return akujVar.I;
    }

    @Override // defpackage.vob
    public /* synthetic */ boolean F() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0028  */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.vob
    public final boolean G(int i) {
        akuj akujVar;
        int iBc;
        int iBc2;
        int iBc3;
        akuj akujVar2 = this.f;
        if (akujVar2 == null || (akujVar2.c & 64) == 0) {
            akujVar = this.f;
            if (akujVar == null) {
                return true;
            }
            int i2 = akujVar.p;
            iBc = a.bc(i2);
            if ((iBc != 0 || iBc != 3) && (((iBc2 = a.bc(i2)) == 0 || iBc2 != 4) && ((iBc3 = a.bc(i2)) == 0 || iBc3 != 5 || i != 2))) {
                return true;
            }
        } else {
            akug akugVar = akujVar2.l;
            if (akugVar == null) {
                akugVar = akug.a;
            }
            if ((akugVar.b & 1) == 0) {
                akujVar = this.f;
                if (akujVar == null) {
                    return true;
                }
                int i3 = akujVar.p;
                iBc = a.bc(i3);
                return iBc != 0 ? true : true;
            }
            akug akugVar2 = akujVar2.l;
            if (akugVar2 == null) {
                akugVar2 = akug.a;
            }
            int iAS = a.aS(akugVar2.c);
            if (iAS == 0 || iAS != 3) {
                akujVar = this.f;
                if (akujVar == null) {
                    return true;
                }
                int i4 = akujVar.p;
                iBc = a.bc(i4);
                if (iBc != 0) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.vob
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // defpackage.vob
    public /* synthetic */ boolean I(akuj akujVar, ajwo ajwoVar) {
        return false;
    }

    @Override // defpackage.vob
    public /* synthetic */ boolean J(String str, ajwo ajwoVar) {
        return false;
    }

    @Override // defpackage.vob
    public final boolean K() {
        return this.a;
    }

    @Override // defpackage.vob
    public /* synthetic */ boolean L() {
        return true;
    }

    @Override // defpackage.vob
    public /* synthetic */ void N(akuj akujVar, ajwo ajwoVar, boolean z) {
        I(akujVar, null);
    }

    @Override // defpackage.vob
    public final int O() {
        akuj akujVar = this.f;
        if (akujVar == null || (akujVar.d & 2) == 0) {
            return 2;
        }
        int iBc = a.bc(akujVar.L);
        if (iBc == 0) {
            return 1;
        }
        return iBc;
    }

    @Override // defpackage.vob
    public final int P() {
        akuj akujVar = this.f;
        if (akujVar == null || (akujVar.d & 64) == 0) {
            return 2;
        }
        int iAX = a.aX(akujVar.P);
        if (iAX == 0) {
            return 1;
        }
        return iAX;
    }

    @Override // defpackage.vob
    public final int Q() {
        int iU;
        akuj akujVar = this.f;
        if (akujVar == null || (akujVar.d & 16) == 0 || (iU = atqp.U(akujVar.N)) == 0) {
            return 1;
        }
        return iU;
    }

    @Override // defpackage.vob
    public final int R() {
        int iT;
        akuj akujVar = this.f;
        if (akujVar == null || (akujVar.d & 4) == 0 || (iT = atqp.T(akujVar.M)) == 0) {
            return 1;
        }
        return iT;
    }

    @Override // defpackage.vob
    public final int S() {
        int iAU;
        akuj akujVar = this.f;
        if (akujVar == null || (akujVar.d & 32) == 0 || (iAU = a.aU(akujVar.O)) == 0) {
            return 1;
        }
        return iAU;
    }

    @Override // defpackage.vob
    public /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.vob
    public int j() {
        int iAS;
        akuj akujVar = this.f;
        if (akujVar == null || (iAS = a.aS(akujVar.q)) == 0) {
            return 1;
        }
        return iAS;
    }

    @Override // defpackage.vob
    public final double l() {
        akuj akujVar = this.f;
        if (akujVar == null || (akujVar.c & 134217728) == 0) {
            return 0.34d;
        }
        return akujVar.F;
    }

    @Override // defpackage.vob
    public final double m() {
        akuj akujVar = this.f;
        return (akujVar == null || (akujVar.c & 268435456) == 0) ? l() : akujVar.G;
    }

    @Override // defpackage.vob
    public final double n() {
        akuj akujVar = this.f;
        if (akujVar == null || (akujVar.c & 536870912) == 0) {
            return 1.0d;
        }
        return akujVar.H;
    }

    @Override // defpackage.vob
    public final /* synthetic */ int o(boolean z) {
        return (z && t() == akub.LANDSCAPE_PANEL_OPEN_STYLE_HORIZONTAL) ? 8388613 : 17;
    }

    @Override // defpackage.vob
    public final xgn p() {
        return this.e;
    }

    @Override // defpackage.vob
    public /* synthetic */ adxd q() {
        return null;
    }

    @Override // defpackage.vob
    public final agkz r() {
        akuj akujVar = this.f;
        return (akujVar == null || akujVar.r.size() <= 0) ? vve.a : agkz.n(new aihx(akujVar.r, akuj.a));
    }

    @Override // defpackage.vob
    public final aktz s() {
        akuj akujVar = this.f;
        if (akujVar == null || (akujVar.d & 1) == 0) {
            return aktz.ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_NOOP;
        }
        aktz aktzVarA = aktz.a(akujVar.K);
        return aktzVarA == null ? aktz.ENGAGEMENT_PANEL_OUTSIDE_SCRIM_TAP_BEHAVIOR_UNSPECIFIED : aktzVarA;
    }

    @Override // defpackage.vob
    public final akub t() {
        akuj akujVar = this.f;
        if (akujVar != null) {
            akug akugVar = akujVar.l;
            if (akugVar == null) {
                akugVar = akug.a;
            }
            akub akubVarA = akub.a(akugVar.d);
            if (akubVarA != null) {
                return akubVarA;
            }
        }
        return akub.LANDSCAPE_PANEL_OPEN_STYLE_UNKNOWN;
    }

    @Override // defpackage.vob
    public final akuj u() {
        return this.f;
    }

    @Override // defpackage.vob
    public /* synthetic */ Optional v() {
        return Optional.empty();
    }

    @Override // defpackage.vob
    public String w() {
        akuj akujVar = this.f;
        if (akujVar != null) {
            return tzk.aa(akujVar);
        }
        return null;
    }

    @Override // defpackage.vob
    public void x() {
    }

    @Override // defpackage.vob
    public void y() {
    }

    @Override // defpackage.vob
    public /* synthetic */ void C(boolean z) {
    }

    @Override // defpackage.vob
    public /* synthetic */ void M(akuj akujVar, ajwo ajwoVar) {
    }

    @Override // defpackage.vob
    public /* synthetic */ void z(akuj akujVar, ajwo ajwoVar) {
    }
}
