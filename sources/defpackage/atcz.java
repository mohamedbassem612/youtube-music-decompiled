package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atcz extends atdb implements mes {
    public boolean d = false;

    private final void aU() {
        if (this.d) {
            this.d = false;
            bG();
        }
    }

    @Override // defpackage.atdb
    public final void aR() {
        if (this.f) {
            aU();
            bO(8, 2);
            bR(true != a ? 16 : 24, this.i);
            this.f = false;
        }
    }

    @Override // defpackage.atdb
    public final void aS() {
        if (this.e) {
            aU();
            bO(8, 1);
            bR(true != a ? 12 : 16, this.h);
            this.e = false;
        }
    }

    @Override // defpackage.atdb
    public final void aT() {
        if (this.g) {
            aU();
            bO(8, 4);
            bR(true != a ? 20 : 32, this.j);
            this.g = false;
        }
    }
}
