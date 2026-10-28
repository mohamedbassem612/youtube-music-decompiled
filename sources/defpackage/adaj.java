package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adaj extends acyx {
    public adaj(Executor executor, acxn acxnVar) {
        super(executor, false, acxnVar);
    }

    @Override // defpackage.acyx
    protected final /* bridge */ /* synthetic */ akrn a(Object obj) {
        apji apjiVar = (apji) obj;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
            return null;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
        apjiVar.c(aihlVarCheckIsLite2);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
        return (akrn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
    }
}
