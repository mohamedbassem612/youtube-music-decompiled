package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atbl extends atbr implements mes {
    public boolean d = false;

    @Override // defpackage.atbr
    public final void aR() {
        if (this.e) {
            aT();
            bO(8, 1);
            bR(true != a ? 12 : 24, this.h);
            this.e = false;
        }
    }

    @Override // defpackage.atbr
    public final void aS() {
        if (this.g) {
            aT();
            bO(8, 8);
            bR(true != a ? 24 : 32, this.j);
            this.g = false;
        }
    }

    public final void aT() {
        if (this.d) {
            this.d = false;
            bG();
        }
    }

    @Override // defpackage.atbr
    public final void aU() {
        if (this.f) {
            aT();
            bO(8, 32);
            bR(true == a ? 40 : 32, this.i);
            this.f = false;
        }
    }
}
