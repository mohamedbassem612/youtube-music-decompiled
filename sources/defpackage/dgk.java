package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgk implements dhj {
    final /* synthetic */ dgr a;

    public dgk(dgr dgrVar) {
        this.a = dgrVar;
    }

    @Override // defpackage.dhj
    public final void a(dhk dhkVar, dhg dhgVar, Collection collection) {
        dgr dgrVar = this.a;
        if (dhkVar != dgrVar.u || dhgVar == null) {
            if (dhkVar == dgrVar.f) {
                if (dhgVar != null) {
                    dgrVar.a(dgrVar.e, dhgVar);
                }
                dif difVarE = dgrVar.e.e();
                if (difVarE != null) {
                    difVarE.a(collection);
                    return;
                }
                return;
            }
            return;
        }
        dih dihVar = dgrVar.t.b;
        String strP = dhgVar.p();
        dif difVar = new dif(dihVar, strP, dgrVar.g(dihVar, strP));
        difVar.c(dhgVar);
        if (dgrVar.e != difVar) {
            dgrVar.k(dgrVar, difVar, dgrVar.u, 3, dgrVar.v, true, dgrVar.t, collection);
            dgrVar.t = null;
            dgrVar.u = null;
            dgrVar.v = 0;
        }
    }
}
