package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cnr implements bvh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ aae c;

    public /* synthetic */ cnr(aae aaeVar, cnd cndVar, cni cniVar, int i) {
        this.$cid = i;
        this.c = aaeVar;
        this.a = cndVar;
        this.b = cniVar;
    }

    @Override // defpackage.bvh
    public final void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            Object obj2 = this.b;
            Object obj3 = this.a;
            aae aaeVar = this.c;
            ((cns) obj).f(aaeVar.a, (cnm) aaeVar.b, (cnd) obj3, (cni) obj2);
            return;
        }
        if (i != 1) {
            Object obj4 = this.a;
            ((cns) obj).gm(this.c.a, (cnm) this.b, (cni) obj4);
        } else {
            Object obj5 = this.b;
            Object obj6 = this.a;
            aae aaeVar2 = this.c;
            ((cns) obj).g(aaeVar2.a, (cnm) aaeVar2.b, (cnd) obj6, (cni) obj5);
        }
    }

    public /* synthetic */ cnr(aae aaeVar, cnm cnmVar, cni cniVar, int i) {
        this.$cid = i;
        this.c = aaeVar;
        this.b = cnmVar;
        this.a = cniVar;
    }
}
