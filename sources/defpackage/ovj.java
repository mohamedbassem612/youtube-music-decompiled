package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ovj extends qa {
    final /* synthetic */ ovk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovj(ovk ovkVar) {
        super((byte[]) null);
        this.a = ovkVar;
    }

    @Override // defpackage.qa
    public final void A(int i, int i2) {
        ovk ovkVar = this.a;
        ovkVar.q(i, i2);
        ovkVar.r();
    }

    @Override // defpackage.qa
    public final void fQ() {
        ovk ovkVar = this.a;
        ovkVar.m();
        ovkVar.r();
    }

    @Override // defpackage.qa
    public final void fR(int i, int i2, Object obj) {
        ovk ovkVar = this.a;
        ovkVar.q(i, i2);
        ovkVar.r();
    }

    @Override // defpackage.qa
    public final void fS(int i, int i2) {
        int i3;
        ovk ovkVar = this.a;
        int i4 = ovkVar.a;
        if (i4 >= 0 && (i3 = ovkVar.b) >= 0 && i2 > 0 && i <= i3) {
            if (i <= i4) {
                ovkVar.a = i4 + i2;
                ovkVar.b = i3 + i2;
            } else {
                ovkVar.m();
            }
        }
        ovkVar.r();
    }

    @Override // defpackage.qa
    public final void fT(int i, int i2) {
        int i3;
        ovk ovkVar = this.a;
        int i4 = ovkVar.a;
        if (i4 >= 0 && (i3 = ovkVar.b) >= 0 && i2 > 0 && i <= i3) {
            if (i + i2 <= i4) {
                ovkVar.a = i4 - i2;
                ovkVar.b = i3 - i2;
            } else {
                ovkVar.m();
            }
        }
        ovkVar.r();
    }

    @Override // defpackage.qa
    public final void fU(int i, int i2) {
        int i3;
        ovk ovkVar = this.a;
        int i4 = ovkVar.a;
        if (i4 >= 0 && (i3 = ovkVar.b) >= 0) {
            if (i + 1 <= i4) {
                if (i2 >= i3) {
                    ovkVar.a = i4 - 1;
                    ovkVar.b = i3 - 1;
                } else if (i2 + 1 > i4) {
                    ovkVar.m();
                }
            } else if (i <= i3) {
                ovkVar.m();
            } else if (i2 <= i3) {
                if (i2 <= i4) {
                    ovkVar.a = i4 + 1;
                    ovkVar.b = i3 + 1;
                } else {
                    ovkVar.m();
                }
            }
        }
        ovkVar.r();
    }
}
