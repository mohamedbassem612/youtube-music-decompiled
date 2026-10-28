package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class athc extends athg implements mes {
    public boolean d = false;

    public final void aR() {
        if (this.d) {
            this.d = false;
            bG();
        }
    }

    @Override // defpackage.athg
    public final void aS() {
        if (this.e) {
            aR();
            bO(8, 8);
            bR(true != a ? 20 : 24, this.f);
            this.e = false;
        }
    }
}
