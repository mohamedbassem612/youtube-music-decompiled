package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hca implements vtm {
    public agkz a;
    public boolean b;
    private final avlh c;
    private final avlh d;
    private final avlh e;
    private final avlh f;
    private final avmm g;

    public hca(Context context, ahto ahtoVar, abwk abwkVar) {
        avmm avmmVar = new avmm();
        this.g = avmmVar;
        vux vuxVar = vux.a;
        int i = avlh.a;
        avuu avuuVar = new avuu(vuxVar);
        avnn avnnVar = atqp.j;
        this.e = avuuVar.k(tzk.af(abwkVar)).p();
        avlh avlhVarH = ((avlh) ahtoVar.b).x(new hgu(1)).H(new hbz(1));
        avuu avuuVar2 = new avuu(Boolean.FALSE);
        avnn avnnVar2 = atqp.j;
        avlh avlhVarI = avuuVar2.k(avlhVarH.H(new hby(context, 0))).p().u(new gem(this, 5)).i(new tyc(new gem(avmmVar, 6), 1));
        this.c = avlhVarI;
        this.d = avlhVarI.H(new hbz(0));
        agpr agprVar = agpr.a;
        agprVar.getClass();
        avuu avuuVar3 = new avuu(agprVar);
        avnn avnnVar3 = atqp.j;
        avlh avlhVarI2 = avuuVar3.k(tzk.ad(abwkVar)).p().u(new gem(this, 7)).i(new tyc(new gem(avmmVar, 6), 1));
        this.f = avlhVarI2;
        avlhVarI.aj();
        avlhVarI2.aj();
    }

    @Override // defpackage.vtm
    public final agkz a() {
        return this.a;
    }

    @Override // defpackage.vtm
    public final avlh b() {
        return this.f;
    }

    @Override // defpackage.vtm
    public final avlh c() {
        return this.d;
    }

    @Override // defpackage.vtm
    public final avlh d() {
        return this.c;
    }

    @Override // defpackage.vtm
    public final avlh e() {
        return this.e;
    }

    @Override // defpackage.vtm
    public final boolean f() {
        return this.b;
    }
}
