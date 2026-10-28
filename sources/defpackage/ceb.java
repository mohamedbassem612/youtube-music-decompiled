package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ceb implements bvs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ cdy a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ ceb(cdy cdyVar, boolean z, int i) {
        this.$cid = i;
        this.a = cdyVar;
        this.b = z;
    }

    @Override // defpackage.bvs
    public final void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((cdz) obj).ag(this.a, this.b);
        } else {
            if (i != 1) {
                ((cdz) obj).R(this.a, this.b);
                return;
            }
            cdz cdzVar = (cdz) obj;
            boolean z = this.b;
            cdy cdyVar = this.a;
            cdzVar.T(cdyVar, z);
            cdzVar.Q(cdyVar, z);
        }
    }
}
