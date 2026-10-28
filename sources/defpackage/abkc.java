package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abkc implements abjm {
    private final Long a;

    public abkc(Long l) {
        this.a = l;
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
        abnk abnkVarF = abnlVar.f();
        Long l = this.a;
        if (l != null) {
            abnkVarF.k = l.longValue();
        }
        abnkVarF.f(true);
        return abnkVarF.a();
    }
}
