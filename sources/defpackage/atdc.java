package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atdc extends atdi implements mes {
    public boolean d = false;

    private final void aW() {
        if (this.d) {
            this.d = false;
            bG();
        }
    }

    @Override // defpackage.atdi
    public final void aR() {
        if (this.f) {
            aW();
            bO(8, 2);
            bR(true != a ? 16 : 24, this.i);
            this.f = false;
        }
    }

    @Override // defpackage.atdi
    public final void aS() {
        if (this.e) {
            aW();
            bO(8, 1);
            bR(true != a ? 12 : 16, this.h);
            this.e = false;
        }
    }

    @Override // defpackage.atdi
    public final void aT() {
        if (this.g) {
            aW();
            bO(8, 4);
            bR(true != a ? 20 : 32, this.j);
            this.g = false;
        }
    }
}
