package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atlv extends atmi implements mes {
    private boolean d = false;

    private final void bd() {
        if (this.d) {
            this.d = false;
            bG();
        }
    }

    public final atlz aR() {
        if (this.d) {
            bG();
        } else {
            this.d = true;
        }
        atlz atlzVar = new atlz(this.b);
        if (this.i != null) {
            atlzVar.i = this.i;
        }
        if (this.j != null) {
            atlzVar.j = this.j;
        }
        if (this.f != null) {
            atlzVar.f = this.f;
        }
        if (this.g != null) {
            atlzVar.g = this.g;
        }
        if (this.h != null) {
            atlzVar.h = this.h;
        }
        if (this.k != null) {
            atlzVar.k = this.k;
            atlzVar.e = this.e;
        }
        arzk arzkVar = this.l;
        atlzVar.aS();
        return atlzVar;
    }

    @Override // defpackage.atmi
    public final void aS() {
        if (this.e) {
            bd();
            bO(9, 2);
            bR(true != a ? 40 : 64, this.k);
            this.e = false;
        }
    }

    public final void aT(atlh atlhVar) {
        if (atlhVar != this.k) {
            this.k = atlhVar;
            this.e = true;
        }
    }

    public final void aU() {
        bd();
        bO(8, 1);
        bQ(12, 1);
    }
}
