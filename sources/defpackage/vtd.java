package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vtd implements vtm {
    private final awku a;
    private final awku b;
    private final avlh c;
    private final avlh d;

    public vtd(abwk abwkVar, vxz vxzVar, ahto ahtoVar, avlr avlrVar) {
        awku awkuVar = new awku(Boolean.TRUE);
        this.a = awkuVar;
        tzk.ae(abwkVar, avlrVar).H(new hby(vxzVar, 18)).p().ap(awkuVar);
        agpr agprVar = agpr.a;
        agprVar.getClass();
        awku awkuVar2 = new awku(agprVar);
        this.b = awkuVar2;
        tzk.ad(abwkVar).H(new hby(vxzVar, 19)).p().ap(awkuVar2);
        this.c = tzk.af(abwkVar).U(vux.a).p();
        this.d = avlh.f(tzk.W(avlrVar, (avlh) ahtoVar.b), awkuVar, new idi(7)).S().ax().c();
    }

    @Override // defpackage.vtm
    public final agkz a() {
        agkz agkzVar = (agkz) this.b.aD();
        return agkzVar == null ? agpr.a : agkzVar;
    }

    @Override // defpackage.vtm
    public final avlh b() {
        return this.b;
    }

    @Override // defpackage.vtm
    public final avlh c() {
        return this.d;
    }

    @Override // defpackage.vtm
    public final avlh d() {
        return this.a;
    }

    @Override // defpackage.vtm
    public final avlh e() {
        return this.c;
    }

    @Override // defpackage.vtm
    public final boolean f() {
        Boolean bool = (Boolean) this.a.aD();
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
