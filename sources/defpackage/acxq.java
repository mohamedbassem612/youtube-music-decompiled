package defpackage;

import com.google.android.libraries.blocks.Container;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acxq implements acxn {
    private final awmd a;

    public acxq(awmd awmdVar) {
        this.a = awmdVar;
    }

    @Override // defpackage.acxn
    public final acxm a(akrn akrnVar) {
        int i = acxu.a;
        aihl aihlVar = arrj.a;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        akrnVar.c(aihlVarCheckIsLite);
        Object objK = akrnVar.j.k(aihlVarCheckIsLite.d);
        byte[] bArrA = acxu.a((aigj) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
        akro akroVar = akrnVar.c;
        if (akroVar == null) {
            akroVar = akro.a;
        }
        if (akroVar.h || qnl.aF(aigm.O(bArrA, 0, bArrA.length, false))) {
            return new adai(akrnVar);
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        akrnVar.c(aihlVarCheckIsLite2);
        if (!akrnVar.j.n(aihlVarCheckIsLite2.d)) {
            aihl aihlVar2 = ajua.a;
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
            akrnVar.c(aihlVarCheckIsLite3);
            if (akrnVar.j.n(aihlVarCheckIsLite3.d)) {
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                akrnVar.c(aihlVarCheckIsLite4);
                Object objK2 = akrnVar.j.k(aihlVarCheckIsLite4.d);
                asiw asiwVar = (asiw) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2));
                aihh aihhVar = (aihh) akrnVar.toBuilder();
                Container container = (Container) this.a.io();
                asiv asivVar = asiwVar.b;
                if (asivVar == null) {
                    asivVar = asiv.a;
                }
                acxp acxpVar = (acxp) container.a(new acxo(asivVar.b));
                asiv asivVar2 = asiwVar.b;
                if (asivVar2 == null) {
                    asivVar2 = asiv.a;
                }
                byte[] bArrNativeCallSync = acxpVar.nativeCallSync(acxpVar.a, asivVar2.c, acxu.a(asiwVar.c));
                aigj aigjVar = aigj.d;
                try {
                    aihhVar.e(aihlVar, aigj.H(bArrNativeCallSync, 0, bArrNativeCallSync.length));
                    akrnVar = (akrn) aihhVar.build();
                } catch (aiik e) {
                    throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                }
            }
        }
        return new acxm(akrnVar);
    }
}
