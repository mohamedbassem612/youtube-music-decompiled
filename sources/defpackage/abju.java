package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class abju implements abjm {
    final /* synthetic */ abjv a;

    public abju(abjv abjvVar) {
        this.a = abjvVar;
    }

    @Override // defpackage.abjm
    public final abnl a(abke abkeVar) {
        abnl abnlVarN = abkeVar.n();
        if (abnlVarN == null) {
            return null;
        }
        return b(abnlVarN);
    }

    @Override // defpackage.abua
    public final abnl b(abnl abnlVar) {
        if (((abvk) this.a.a.io()).X()) {
            return abnlVar;
        }
        abnk abnkVarF = abnlVar.f();
        abnkVarF.f(true);
        return abnkVarF.a();
    }
}
