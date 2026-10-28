package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atau extends atgs implements mes {
    public boolean d;

    public atau() {
        super((char[]) null);
        this.d = false;
    }

    private final void aT() {
        if (this.d) {
            this.d = false;
            bG();
        }
    }

    public final void aR(int i) {
        aT();
        bO(8, 1);
        bQ(16, i);
    }

    public final void aS() {
        aT();
        bO(8, 2);
        bK(32, true);
    }
}
