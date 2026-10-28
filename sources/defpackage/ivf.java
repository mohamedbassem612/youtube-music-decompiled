package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ivf implements gmr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ gms a;

    public /* synthetic */ ivf(gms gmsVar, int i) {
        this.$cid = i;
        this.a = gmsVar;
    }

    @Override // defpackage.gmr
    public final void a() {
        int i = this.$cid;
        gms gmsVar = this.a;
        if (i == 0) {
            ivj ivjVar = (ivj) gmsVar;
            ivjVar.ai.clear();
            ivjVar.r();
            ivjVar.T();
            return;
        }
        ijl ijlVar = (ijl) gmsVar;
        ijlVar.aB.clear();
        ijlVar.az.kk(Boolean.FALSE);
        ijlVar.r();
        ijlVar.T();
    }
}
