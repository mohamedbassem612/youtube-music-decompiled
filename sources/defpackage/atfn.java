package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atfn extends atft implements mes {
    public boolean d = false;

    public final void aR() {
        if (this.d) {
            this.d = false;
            bG();
        }
    }

    @Override // defpackage.atft
    public final void aS() {
        if (this.e) {
            aR();
            bO(8, 1);
            bR(true != a ? 12 : 32, this.g);
            this.e = false;
        }
    }
}
