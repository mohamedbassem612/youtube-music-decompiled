package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ipv implements tvl {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ipv(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.tvl
    public final void a() {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            ipf ipfVar = (ipf) obj;
            ipfVar.b.g();
            aihf aihfVarCreateBuilder = antn.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            antn antnVar = (antn) aihfVarCreateBuilder.instance;
            antnVar.c = 1;
            antnVar.b |= 1;
            xeu xeuVar = ipfVar.c;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MUSIC_PERSISTENT_CACHE_CLEARED);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
                return;
            }
            alos alosVar = (alos) alou.a.createBuilder();
            antn antnVar2 = (antn) aihfVarCreateBuilder.build();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            antnVar2.getClass();
            alouVar.d = antnVar2;
            alouVar.c = 155;
            xeuVar.b((alou) alosVar.build());
            return;
        }
        ipw ipwVar = (ipw) obj;
        ipwVar.c.g();
        aihf aihfVarCreateBuilder2 = antn.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        antn antnVar3 = (antn) aihfVarCreateBuilder2.instance;
        antnVar3.c = 1;
        antnVar3.b |= 1;
        xeu xeuVar2 = ipwVar.d;
        if (xeuVar2.b) {
            xff xffVarA2 = xeuVar2.a(aihfVarCreateBuilder2, alot.MUSIC_PERSISTENT_CACHE_CLEARED);
            ztf ztfVar2 = xffVarA2.k.e;
            xffVarA2.l = ztfVar2.a();
            ztfVar2.k(xffVarA2);
            return;
        }
        alos alosVar2 = (alos) alou.a.createBuilder();
        antn antnVar4 = (antn) aihfVarCreateBuilder2.build();
        alosVar2.copyOnWrite();
        alou alouVar2 = (alou) alosVar2.instance;
        antnVar4.getClass();
        alouVar2.d = antnVar4;
        alouVar2.c = 155;
        xeuVar2.b((alou) alosVar2.build());
    }
}
