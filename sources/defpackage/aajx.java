package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aajx implements aajv {
    private final xeu a;

    public aajx(xeu xeuVar) {
        this.a = xeuVar;
    }

    @Override // defpackage.tw
    public final void c(uo uoVar) {
        aihf aihfVarCreateBuilder = aknl.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aknl aknlVar = (aknl) aihfVarCreateBuilder.instance;
        aknlVar.b |= 1;
        aknlVar.c = uoVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        aknl aknlVar2 = (aknl) aihfVarCreateBuilder.instance;
        aknlVar2.b |= 8;
        aknlVar2.f = uoVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        aknl aknlVar3 = (aknl) aihfVarCreateBuilder.instance;
        aknlVar3.b |= 16;
        aknlVar3.g = uoVar.d;
        us usVar = uoVar.e;
        if (usVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aknl aknlVar4 = (aknl) aihfVarCreateBuilder.instance;
            aknlVar4.b |= 4;
            aknlVar4.e = usVar.a;
            aihfVarCreateBuilder.copyOnWrite();
            aknl aknlVar5 = (aknl) aihfVarCreateBuilder.instance;
            aknlVar5.b |= 2;
            aknlVar5.d = usVar.b;
        }
        aihf aihfVarCreateBuilder2 = akng.a.createBuilder();
        aknl aknlVar6 = (aknl) aihfVarCreateBuilder.build();
        aihfVarCreateBuilder2.copyOnWrite();
        akng akngVar = (akng) aihfVarCreateBuilder2.instance;
        aknlVar6.getClass();
        akngVar.c = aknlVar6;
        akngVar.b = 2;
        akng akngVar2 = (akng) aihfVarCreateBuilder2.build();
        int i = uoVar.a;
        aihf aihfVarCreateBuilder3 = aknf.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        aknf aknfVar = (aknf) aihfVarCreateBuilder3.instance;
        aknfVar.c = 5;
        aknfVar.b |= 1;
        aihfVarCreateBuilder3.copyOnWrite();
        aknf aknfVar2 = (aknf) aihfVarCreateBuilder3.instance;
        aknfVar2.d = aaja.a(i) - 1;
        aknfVar2.b |= 2;
        aihfVarCreateBuilder3.copyOnWrite();
        aknf aknfVar3 = (aknf) aihfVarCreateBuilder3.instance;
        akngVar2.getClass();
        aknfVar3.e = akngVar2;
        aknfVar3.b |= 4;
        xeu xeuVar = this.a;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder3, alot.DOWNLOADS_SEARCH_ICING_API_STATS);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aknf aknfVar4 = (aknf) aihfVarCreateBuilder3.build();
        aknfVar4.getClass();
        alouVar.d = aknfVar4;
        alouVar.c = 391;
        xeuVar.b((alou) alosVar.build());
    }

    @Override // defpackage.tw
    public final void a(uk ukVar) {
    }

    @Override // defpackage.tw
    public final void b(um umVar) {
    }

    @Override // defpackage.tw
    public final void d(uq uqVar) {
    }

    @Override // defpackage.aajv
    public final void e(tq tqVar, List list) {
    }

    @Override // defpackage.aajv
    public final void f(int i, List list) {
    }

    @Override // defpackage.aajv
    public final void g(int i, List list) {
    }
}
