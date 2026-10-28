package defpackage;

import android.util.Base64;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nxm {
    public static final pxk a(String str) {
        pyl pylVar = (pyl) aihn.parseFrom(pyl.a, Base64.decode(str, 10));
        pylVar.getClass();
        return nqx.b(pylVar);
    }

    public static final pyl b(pxk pxkVar) {
        pxkVar.getClass();
        aihf aihfVarCreateBuilder = pyl.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        int iV = a.v(pxkVar);
        if (iV == 0) {
            aihf aihfVarCreateBuilder2 = pyi.a.createBuilder();
            aihfVarCreateBuilder2.getClass();
            String str = ((pxo) pxkVar).a;
            aihfVarCreateBuilder2.copyOnWrite();
            ((pyi) aihfVarCreateBuilder2.instance).b = str;
            aihn aihnVarBuild = aihfVarCreateBuilder2.build();
            aihnVarBuild.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            pyl pylVar = (pyl) aihfVarCreateBuilder.instance;
            pylVar.c = (pyi) aihnVarBuild;
            pylVar.b = 1;
        } else if (iV == 1) {
            aihf aihfVarCreateBuilder3 = pyg.a.createBuilder();
            aihfVarCreateBuilder3.getClass();
            String str2 = ((pxl) pxkVar).a;
            aihfVarCreateBuilder3.copyOnWrite();
            ((pyg) aihfVarCreateBuilder3.instance).b = str2;
            aihn aihnVarBuild2 = aihfVarCreateBuilder3.build();
            aihnVarBuild2.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            pyl pylVar2 = (pyl) aihfVarCreateBuilder.instance;
            pylVar2.c = (pyg) aihnVarBuild2;
            pylVar2.b = 4;
        } else if (iV == 2) {
            aihf aihfVarCreateBuilder4 = pyh.a.createBuilder();
            aihfVarCreateBuilder4.getClass();
            pxn pxnVar = (pxn) pxkVar;
            String str3 = pxnVar.a;
            aihfVarCreateBuilder4.copyOnWrite();
            ((pyh) aihfVarCreateBuilder4.instance).b = str3;
            long j = pxnVar.b;
            aihfVarCreateBuilder4.copyOnWrite();
            ((pyh) aihfVarCreateBuilder4.instance).c = j;
            aihn aihnVarBuild3 = aihfVarCreateBuilder4.build();
            aihnVarBuild3.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            pyl pylVar3 = (pyl) aihfVarCreateBuilder.instance;
            pylVar3.c = (pyh) aihnVarBuild3;
            pylVar3.b = 5;
        } else if (iV == 3) {
            aihf aihfVarCreateBuilder5 = pyk.a.createBuilder();
            aihfVarCreateBuilder5.getClass();
            aihn aihnVarBuild4 = aihfVarCreateBuilder5.build();
            aihnVarBuild4.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            pyl pylVar4 = (pyl) aihfVarCreateBuilder.instance;
            pylVar4.c = (pyk) aihnVarBuild4;
            pylVar4.b = 2;
        } else {
            if (iV != 4) {
                throw new awmj();
            }
            aihf aihfVarCreateBuilder6 = pyj.a.createBuilder();
            aihfVarCreateBuilder6.getClass();
            aihn aihnVarBuild5 = aihfVarCreateBuilder6.build();
            aihnVarBuild5.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            pyl pylVar5 = (pyl) aihfVarCreateBuilder.instance;
            pylVar5.c = (pyj) aihnVarBuild5;
            pylVar5.b = 3;
        }
        aihn aihnVarBuild6 = aihfVarCreateBuilder.build();
        aihnVarBuild6.getClass();
        return (pyl) aihnVarBuild6;
    }

    public static final String c(pxk pxkVar) {
        return nwv.a(b(pxkVar));
    }
}
