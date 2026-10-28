package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaju implements aajv {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/features/appsearch/logging/DefaultAppSearchLogger");
    private final xeu b;

    public aaju(xeu xeuVar) {
        this.b = xeuVar;
    }

    private final void h(int i, int i2, akng akngVar) {
        aihf aihfVarCreateBuilder = aknf.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aknf aknfVar = (aknf) aihfVarCreateBuilder.instance;
        aknfVar.c = i - 1;
        aknfVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        aknf aknfVar2 = (aknf) aihfVarCreateBuilder.instance;
        aknfVar2.d = aaja.a(i2) - 1;
        aknfVar2.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        aknf aknfVar3 = (aknf) aihfVarCreateBuilder.instance;
        akngVar.getClass();
        aknfVar3.e = akngVar;
        aknfVar3.b |= 4;
        xeu xeuVar = this.b;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.DOWNLOADS_SEARCH_ICING_API_STATS);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aknf aknfVar4 = (aknf) aihfVarCreateBuilder.build();
        aknfVar4.getClass();
        alouVar.d = aknfVar4;
        alouVar.c = 391;
        xeuVar.b((alou) alosVar.build());
    }

    @Override // defpackage.tw
    public final void a(uk ukVar) {
        int i;
        aihf aihfVarCreateBuilder = akng.a.createBuilder();
        aihf aihfVarCreateBuilder2 = aknj.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aknj aknjVar = (aknj) aihfVarCreateBuilder2.instance;
        aknjVar.b |= 1;
        aknjVar.c = ukVar.b;
        int i2 = ukVar.e;
        if (i2 != 0) {
            i = i2 != 1 ? 4 : 3;
        } else {
            i = 2;
        }
        aihfVarCreateBuilder2.copyOnWrite();
        aknj aknjVar2 = (aknj) aihfVarCreateBuilder2.instance;
        aknjVar2.f = i - 1;
        aknjVar2.b |= 8;
        int i3 = ukVar.c;
        aihfVarCreateBuilder2.copyOnWrite();
        aknj aknjVar3 = (aknj) aihfVarCreateBuilder2.instance;
        aknjVar3.d = aaja.b(i3) - 1;
        aknjVar3.b |= 2;
        int i4 = ukVar.d;
        aihfVarCreateBuilder2.copyOnWrite();
        aknj aknjVar4 = (aknj) aihfVarCreateBuilder2.instance;
        aknjVar4.e = aaja.b(i4) - 1;
        aknjVar4.b |= 4;
        int i5 = ukVar.f;
        aihfVarCreateBuilder2.copyOnWrite();
        aknj aknjVar5 = (aknj) aihfVarCreateBuilder2.instance;
        aknjVar5.b |= 16;
        aknjVar5.g = i5;
        aihfVarCreateBuilder.copyOnWrite();
        akng akngVar = (akng) aihfVarCreateBuilder.instance;
        aknj aknjVar6 = (aknj) aihfVarCreateBuilder2.build();
        aknjVar6.getClass();
        akngVar.c = aknjVar6;
        akngVar.b = 3;
        h(2, ukVar.a, (akng) aihfVarCreateBuilder.build());
    }

    @Override // defpackage.tw
    public final void b(um umVar) {
        aihf aihfVarCreateBuilder = akng.a.createBuilder();
        aihf aihfVarCreateBuilder2 = aknk.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aknk aknkVar = (aknk) aihfVarCreateBuilder2.instance;
        aknkVar.b |= 1;
        aknkVar.c = umVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        akng akngVar = (akng) aihfVarCreateBuilder.instance;
        aknk aknkVar2 = (aknk) aihfVarCreateBuilder2.build();
        aknkVar2.getClass();
        akngVar.c = aknkVar2;
        akngVar.b = 4;
        h(5, umVar.a, (akng) aihfVarCreateBuilder.build());
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
        h(6, uoVar.a, (akng) aihfVarCreateBuilder2.build());
    }

    @Override // defpackage.tw
    public final void d(uq uqVar) {
        aihf aihfVarCreateBuilder = akng.a.createBuilder();
        aihf aihfVarCreateBuilder2 = aknh.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        aknh aknhVar = (aknh) aihfVarCreateBuilder2.instance;
        int i = 1;
        aknhVar.b |= 1;
        aknhVar.c = uqVar.b;
        int i2 = uqVar.c;
        if (i2 == 1) {
            i = 2;
        } else if (i2 == 2) {
            i = 3;
        }
        aihfVarCreateBuilder2.copyOnWrite();
        aknh aknhVar2 = (aknh) aihfVarCreateBuilder2.instance;
        aknhVar2.d = i - 1;
        aknhVar2.b |= 2;
        int i3 = uqVar.d;
        aihfVarCreateBuilder2.copyOnWrite();
        aknh aknhVar3 = (aknh) aihfVarCreateBuilder2.instance;
        aknhVar3.b |= 4;
        aknhVar3.e = i3;
        aihfVarCreateBuilder.copyOnWrite();
        akng akngVar = (akng) aihfVarCreateBuilder.instance;
        aknh aknhVar4 = (aknh) aihfVarCreateBuilder2.build();
        aknhVar4.getClass();
        akngVar.c = aknhVar4;
        akngVar.b = 5;
        h(7, uqVar.a, (akng) aihfVarCreateBuilder.build());
    }

    @Override // defpackage.aajv
    public final void e(tq tqVar, List list) {
        aihf aihfVarCreateBuilder = aknm.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aknm aknmVar = (aknm) aihfVarCreateBuilder.instance;
        aiie aiieVar = aknmVar.f;
        if (!aiieVar.c()) {
            aknmVar.f = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(list, aknmVar.f);
        long j = tqVar.a;
        aihfVarCreateBuilder.copyOnWrite();
        aknm aknmVar2 = (aknm) aihfVarCreateBuilder.instance;
        aknmVar2.b |= 1;
        aknmVar2.c = j;
        long j2 = tqVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        aknm aknmVar3 = (aknm) aihfVarCreateBuilder.instance;
        aknmVar3.b |= 2;
        aknmVar3.d = j2;
        long j3 = tqVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        aknm aknmVar4 = (aknm) aihfVarCreateBuilder.instance;
        aknmVar4.b |= 4;
        aknmVar4.e = j3;
        xeu xeuVar = this.b;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.DOWNLOADS_SEARCH_INDEX_SNAPSHOT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aknm aknmVar5 = (aknm) aihfVarCreateBuilder.build();
        aknmVar5.getClass();
        alouVar.d = aknmVar5;
        alouVar.c = 398;
        xeuVar.b((alou) alosVar.build());
    }

    @Override // defpackage.aajv
    public final void f(int i, List list) {
        aihf aihfVarCreateBuilder = aknn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aknn aknnVar = (aknn) aihfVarCreateBuilder.instance;
        if (i == 0) {
            throw null;
        }
        aknnVar.c = i - 1;
        aknnVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        aknn aknnVar2 = (aknn) aihfVarCreateBuilder.instance;
        aknnVar2.d = 4;
        aknnVar2.b |= 2;
        aihfVarCreateBuilder.aT(list);
        xeu xeuVar = this.b;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.DOWNLOADS_SEARCH_INDEX_UPDATED_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aknn aknnVar3 = (aknn) aihfVarCreateBuilder.build();
        aknnVar3.getClass();
        alouVar.d = aknnVar3;
        alouVar.c = 397;
        xeuVar.b((alou) alosVar.build());
    }

    @Override // defpackage.aajv
    public final void g(int i, List list) {
        aihf aihfVarCreateBuilder = aknn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aknn aknnVar = (aknn) aihfVarCreateBuilder.instance;
        if (i == 0) {
            throw null;
        }
        aknnVar.c = i - 1;
        aknnVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        aknn aknnVar2 = (aknn) aihfVarCreateBuilder.instance;
        aknnVar2.d = 6;
        aknnVar2.b |= 2;
        aihfVarCreateBuilder.aT((Iterable) Collection.EL.stream(list).map(new aakc(1)).collect(Collectors.toList()));
        xeu xeuVar = this.b;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.DOWNLOADS_SEARCH_INDEX_UPDATED_EVENT);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aknn aknnVar3 = (aknn) aihfVarCreateBuilder.build();
        aknnVar3.getClass();
        alouVar.d = aknnVar3;
        alouVar.c = 397;
        xeuVar.b((alou) alosVar.build());
    }
}
