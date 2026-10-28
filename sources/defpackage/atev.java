package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atev extends atey implements mes {
    private boolean d = false;

    public final void aR(float f) {
        if (this.d) {
            this.d = false;
            bG();
        }
        bO(8, 1);
        bP(12, f);
    }

    public final atey aS() {
        if (this.d) {
            bG();
        } else {
            this.d = true;
        }
        return new atey(this.b);
    }
}
