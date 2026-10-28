package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gqg extends wne {
    @Override // defpackage.wne
    public final /* bridge */ /* synthetic */ Object a(apjh apjhVar) {
        if (apjhVar != null) {
            aihl aihlVar = apoq.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            apjhVar.c(aihlVarCheckIsLite);
            if (apjhVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                apjhVar.c(aihlVarCheckIsLite2);
                Object objK = apjhVar.j.k(aihlVarCheckIsLite2.d);
                return new wgd((apoq) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
            }
        }
        throw new IllegalArgumentException("PersistentBrowseService: autoload next continuation must be a section list");
    }
}
