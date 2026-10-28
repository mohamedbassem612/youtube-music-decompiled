package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class hyv implements abnz {
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    @Override // defpackage.abnz
    public final boolean a(wjf wjfVar, wjf wjfVar2) {
        aoqd aoqdVar;
        ajhg ajhgVar;
        akiy akiyVar;
        aoqd aoqdVar2;
        ajhg ajhgVar2;
        akiy akiyVar2;
        int iAS;
        int iAS2;
        wjfVar.getClass();
        wjfVar2.getClass();
        alvt alvtVarU = wjfVar.u();
        alvt alvtVarU2 = wjfVar2.u();
        alvtVarU.getClass();
        alvtVarU2.getClass();
        if ((alvtVarU.c & SemanticState.Multiline) == 0 || (alvtVarU2.c & SemanticState.Multiline) == 0) {
            aoqdVar = alvtVarU.e;
            if (aoqdVar == null) {
                aoqdVar = aoqd.a;
            }
            ajhgVar = aoqdVar.g;
            if (ajhgVar == null) {
                ajhgVar = ajhg.a;
            }
            akiyVar = ajhgVar.o;
            if (akiyVar == null) {
                akiyVar = akiy.a;
            }
            akiyVar.getClass();
            aoqdVar2 = alvtVarU2.e;
            if (aoqdVar2 == null) {
                aoqdVar2 = aoqd.a;
            }
            ajhgVar2 = aoqdVar2.g;
            if (ajhgVar2 == null) {
                ajhgVar2 = ajhg.a;
            }
            akiyVar2 = ajhgVar2.o;
            if (akiyVar2 == null) {
                akiyVar2 = akiy.a;
            }
            akiyVar2.getClass();
            iAS = a.aS(akiyVar.b);
            if (iAS != 0 && iAS == 3 && (iAS2 = a.aS(akiyVar2.b)) != 0 && iAS2 == 3) {
                return true;
            }
        } else {
            aqou aqouVar = alvtVarU.J;
            if (aqouVar == null) {
                aqouVar = aqou.a;
            }
            aqouVar.getClass();
            aqou aqouVar2 = alvtVarU2.J;
            if (aqouVar2 == null) {
                aqouVar2 = aqou.a;
            }
            aqouVar2.getClass();
            String str = aqouVar.c;
            str.getClass();
            if (str.length() == 0 || !awrc.c(aqouVar.c, aqouVar2.c) || (aqouVar.b & 2) == 0 || (aqouVar2.b & 2) == 0 || aqouVar2.d - aqouVar.d != 1) {
                aoqdVar = alvtVarU.e;
                if (aoqdVar == null) {
                    aoqdVar = aoqd.a;
                }
                ajhgVar = aoqdVar.g;
                if (ajhgVar == null) {
                    ajhgVar = ajhg.a;
                }
                akiyVar = ajhgVar.o;
                if (akiyVar == null) {
                    akiyVar = akiy.a;
                }
                akiyVar.getClass();
                aoqdVar2 = alvtVarU2.e;
                if (aoqdVar2 == null) {
                    aoqdVar2 = aoqd.a;
                }
                ajhgVar2 = aoqdVar2.g;
                if (ajhgVar2 == null) {
                    ajhgVar2 = ajhg.a;
                }
                akiyVar2 = ajhgVar2.o;
                if (akiyVar2 == null) {
                    akiyVar2 = akiy.a;
                }
                akiyVar2.getClass();
                iAS = a.aS(akiyVar.b);
                if (iAS != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
