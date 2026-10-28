package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nvh {
    public static ahzx a(pbg pbgVar) {
        aihf aihfVarCreateBuilder = ahzx.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        Objects.checkIndex(0, 3);
        if (pbgVar instanceof pbj) {
            int i = ((pbj) pbgVar).a;
            aihfVarCreateBuilder.copyOnWrite();
            ahzx ahzxVar = (ahzx) aihfVarCreateBuilder.instance;
            ahzxVar.b = 1;
            ahzxVar.c = Integer.valueOf(i);
        } else {
            if (!(pbgVar instanceof pbi)) {
                throw new awmj();
            }
            aihf aihfVarCreateBuilder2 = ahzw.a.createBuilder();
            aihfVarCreateBuilder2.getClass();
            pbi pbiVar = (pbi) pbgVar;
            String str = pbiVar.b;
            aihfVarCreateBuilder2.copyOnWrite();
            ahzw ahzwVar = (ahzw) aihfVarCreateBuilder2.instance;
            ahzwVar.b |= 1;
            ahzwVar.c = str;
            int i2 = pbiVar.a;
            aihfVarCreateBuilder2.copyOnWrite();
            ahzw ahzwVar2 = (ahzw) aihfVarCreateBuilder2.instance;
            ahzwVar2.b |= 2;
            ahzwVar2.d = i2;
            aihn aihnVarBuild = aihfVarCreateBuilder2.build();
            aihnVarBuild.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            ahzx ahzxVar2 = (ahzx) aihfVarCreateBuilder.instance;
            ahzxVar2.c = (ahzw) aihnVarBuild;
            ahzxVar2.b = 2;
        }
        aihn aihnVarBuild2 = aihfVarCreateBuilder.build();
        aihnVarBuild2.getClass();
        return (ahzx) aihnVarBuild2;
    }
}
