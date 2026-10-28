package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ater extends ateu implements mes {
    public boolean d = false;

    private final void aZ() {
        if (this.d) {
            this.d = false;
            bG();
        }
    }

    @Override // defpackage.ateu
    public final void aR() {
        if (this.f) {
            aZ();
            bO(8, 4);
            bR(true != a ? 20 : 32, this.k);
            this.f = false;
        }
    }

    @Override // defpackage.ateu
    public final void aS() {
        if (this.h) {
            aZ();
            bO(8, 32);
            bR(true == a ? 56 : 32, this.n);
            this.h = false;
        }
    }

    @Override // defpackage.ateu
    public final void aT() {
        if (this.g) {
            aZ();
            bO(8, 16);
            bR(true != a ? 28 : 48, this.m);
            this.g = false;
        }
    }

    @Override // defpackage.ateu
    public final void aU() {
        if (this.e) {
            aZ();
            bO(8, 1);
            bR(true != a ? 12 : 16, this.i);
            this.e = false;
        }
    }
}
