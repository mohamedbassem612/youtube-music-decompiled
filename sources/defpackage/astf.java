package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class astf extends astl implements mes {
    public boolean d = false;

    @Override // defpackage.astl
    public final void aR() {
        if (this.f) {
            aS();
            bO(8, 2);
            bR(true != a ? 16 : 24, this.h);
            this.f = false;
        }
    }

    public final void aS() {
        if (this.d) {
            this.d = false;
            bG();
        }
    }

    @Override // defpackage.astl
    public final void aT() {
        if (this.e) {
            aS();
            bO(8, 1);
            bR(true != a ? 12 : 16, this.g);
            this.e = false;
        }
    }
}
