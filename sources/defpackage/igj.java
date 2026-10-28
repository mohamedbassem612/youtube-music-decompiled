package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class igj implements ibu {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ igj(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.ibu
    public final void a() {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            ((gze) obj).g = true;
        } else {
            ((igk) obj).h();
        }
    }
}
