package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ssy implements aeal {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public ssy(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.aeal
    public final void a() {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            ((ssv) obj).g.callOnClick();
        } else {
            ((ssz) obj).t.callOnClick();
        }
    }
}
