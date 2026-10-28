package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gyc implements sxu {
    private final ttm a;
    private final vxe b;
    private final apzb c;
    private final Object d;
    private final tbt e;
    private final jin f;

    public gyc(apzb apzbVar, Object obj, vxe vxeVar, ttm ttmVar, tbt tbtVar, jin jinVar) {
        this.c = apzbVar;
        this.d = obj;
        this.a = ttmVar;
        this.b = vxeVar;
        this.e = tbtVar;
        this.f = jinVar;
    }

    @Override // defpackage.sxu
    public final /* synthetic */ void b(Object obj, Object obj2) {
        hck hckVar = (hck) obj2;
        agke agkeVar = hckVar.a;
        int size = agkeVar.size();
        for (int i = 0; i < size; i++) {
            this.b.c((ajwo) agkeVar.get(i), agpn.b);
        }
        apzb apzbVar = this.c;
        for (apyx apyxVar : apzbVar.e) {
            int i2 = apyxVar.b;
            if (i2 == 2) {
                tbt tbtVar = this.e;
                tbtVar.c(new isp(apzbVar.d, (i2 == 2 ? (apyz) apyxVar.c : apyz.a).c, hckVar));
                Object obj3 = this.d;
                if (obj3 instanceof anzi) {
                    tbtVar.c(new vvt(obj3));
                }
            }
        }
    }

    @Override // defpackage.sxu
    public final /* synthetic */ void iT(Object obj, Exception exc) {
        jio jioVarE = jin.e();
        ((jik) jioVarE).k(this.a.b(exc));
        this.f.d(jioVarE.b());
    }
}
