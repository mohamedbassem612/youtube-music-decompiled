package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class aviv implements aviz {
    private final /* synthetic */ int $cid;

    public aviv(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aviz
    public final void a(avjf avjfVar) {
        int i = this.$cid;
        if (i == 0) {
            avjfVar.a.i();
            return;
        }
        if (i == 1) {
            avjfVar.a.r();
        } else if (i != 2) {
            avjfVar.a.v();
        } else {
            avjfVar.a.s();
        }
    }
}
