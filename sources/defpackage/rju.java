package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rju implements zwn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ zwm a;

    public /* synthetic */ rju(zwm zwmVar, int i) {
        this.$cid = i;
        this.a = zwmVar;
    }

    @Override // defpackage.zwn
    public final zwm a(zwa zwaVar) {
        int i = this.$cid;
        if (i == 0) {
            if (zwaVar instanceof rlt) {
                return this.a;
            }
            throw new IllegalStateException();
        }
        boolean z = zwaVar instanceof rlt;
        if (i == 1) {
            ahno.O(z);
            return this.a;
        }
        if (z) {
            return this.a;
        }
        throw new IllegalStateException();
    }
}
