package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ftd implements fte {
    private final /* synthetic */ int $cid;

    public ftd(int i) {
        this.$cid = i;
    }

    @Override // defpackage.fte
    public final void a(int i, fsb fsbVar) {
        if (this.$cid != 0) {
            for (int i2 = 0; i2 < i && fsbVar.a(i2); i2++) {
            }
            return;
        }
        do {
            i--;
            if (i < 0) {
                return;
            }
        } while (fsbVar.a(i));
    }
}
