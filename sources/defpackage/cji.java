package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cji implements bvh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ cji(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.bvh
    public final void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((aae) obj).q((Exception) this.a);
            return;
        }
        if (i == 1) {
            ((aae) obj).s((auq) this.a);
        } else if (i != 2) {
            ((aae) obj).q((Exception) this.a);
        } else {
            ((agjz) this.a).h((abnx) obj);
        }
    }
}
