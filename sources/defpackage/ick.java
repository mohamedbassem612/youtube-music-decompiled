package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ick extends wne {
    @Override // defpackage.wne
    protected final /* bridge */ /* synthetic */ Object a(apjh apjhVar) {
        if (apjhVar == null) {
            return null;
        }
        aihl aihlVar = aouj.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        apjhVar.c(aihlVarCheckIsLite);
        if (!apjhVar.j.n(aihlVarCheckIsLite.d)) {
            return null;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        apjhVar.c(aihlVarCheckIsLite2);
        Object objK = apjhVar.j.k(aihlVarCheckIsLite2.d);
        return (aouj) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
    }
}
