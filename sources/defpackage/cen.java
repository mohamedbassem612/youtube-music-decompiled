package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cen implements bvs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ cdy a;

    public /* synthetic */ cen(cdy cdyVar, int i) {
        this.$cid = i;
        this.a = cdyVar;
    }

    @Override // defpackage.bvs
    public final void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((cdz) obj).af(this.a);
        } else if (i != 1) {
            ((cdz) obj).N(this.a);
        } else {
            ((cdz) obj).K(this.a);
        }
    }
}
