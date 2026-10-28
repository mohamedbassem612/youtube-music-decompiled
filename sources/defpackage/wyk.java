package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wyk {
    public final awmd a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public wyk(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12) {
        awmdVar.getClass();
        this.b = awmdVar;
        this.c = awmdVar2;
        awmdVar3.getClass();
        this.d = awmdVar3;
        awmdVar4.getClass();
        this.e = awmdVar4;
        awmdVar5.getClass();
        this.f = awmdVar5;
        awmdVar6.getClass();
        this.g = awmdVar6;
        awmdVar7.getClass();
        this.h = awmdVar7;
        awmdVar8.getClass();
        this.a = awmdVar8;
        awmdVar9.getClass();
        this.i = awmdVar9;
        awmdVar10.getClass();
        this.j = awmdVar10;
        awmdVar11.getClass();
        this.k = awmdVar11;
        awmdVar12.getClass();
        this.l = awmdVar12;
    }

    public final void a() {
        Object obj = this.h;
        if (obj != null) {
            xeu xeuVar = (xeu) this.g;
            if (!xeuVar.b) {
                xeuVar.b(((acb) obj).h());
                return;
            }
            xff xffVarA = xeuVar.a(((acb) obj).o(), alot.TRANSACTION_FLOW_FAILED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        }
    }

    public final boolean b() {
        return ((vxz) this.d).m(13, 45620268L);
    }

    public wyk(xeu xeuVar, ttm ttmVar, vwt vwtVar, awmd awmdVar, xgn xgnVar, cf cfVar, sud sudVar, arom aromVar, svp svpVar, abfv abfvVar, vxz vxzVar) {
        this.g = xeuVar;
        this.k = ttmVar;
        this.c = vwtVar;
        this.a = awmdVar;
        this.d = vxzVar;
        this.j = xgnVar;
        this.e = cfVar;
        this.b = sudVar;
        this.f = aromVar;
        this.i = svpVar;
        this.l = abfvVar;
        acb acbVar = null;
        if (!aromVar.d.E()) {
            acb acbVar2 = new acb((char[]) null);
            acbVar2.d = aromVar.d;
            acbVar2.a = 3;
            acbVar = acbVar2;
        }
        this.h = acbVar;
    }
}
