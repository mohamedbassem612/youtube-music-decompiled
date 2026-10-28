package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atlo extends atlu implements mes {
    public boolean d = false;

    @Override // defpackage.atlu
    public final void aR() {
        if (this.e) {
            aT();
            bO(8, 1);
            bR(true != a ? 12 : 16, this.g);
            this.e = false;
        }
    }

    @Override // defpackage.atlu
    public final void aS() {
        if (this.f) {
            aT();
            bO(8, 2);
            bR(true != a ? 16 : 24, this.h);
            this.f = false;
        }
    }

    public final void aT() {
        if (this.d) {
            this.d = false;
            bG();
        }
    }
}
