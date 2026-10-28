package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atlj extends atln implements mes {
    private boolean d = false;

    public final atln aR() {
        if (this.d) {
            bG();
        } else {
            this.d = true;
        }
        return new atln(this.b);
    }

    public final void aS() {
        if (this.d) {
            this.d = false;
            bG();
        }
        bO(8, 1);
        bQ(12, 1);
    }
}
