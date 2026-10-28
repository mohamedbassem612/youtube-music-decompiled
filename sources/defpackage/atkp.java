package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atkp extends atks implements mes {
    private boolean d = false;

    private final void aU() {
        if (this.d) {
            this.d = false;
            bG();
        }
    }

    public final void aR(float f) {
        aU();
        bO(8, 1);
        bP(12, f);
    }

    public final void aS(float f) {
        aU();
        bO(8, 2);
        bP(16, f);
    }

    public final atks aT() {
        if (this.d) {
            bG();
        } else {
            this.d = true;
        }
        return new atks(this.b);
    }
}
