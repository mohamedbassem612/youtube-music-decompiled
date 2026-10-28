package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xrv implements xrc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ xrv(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.xrc
    public final void a() {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            ((xqi) obj).b();
        } else {
            ((xrw) obj).a();
        }
    }
}
