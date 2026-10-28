package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abkb implements abjm {
    private final Long a;

    public abkb(Long l) {
        this.a = Long.valueOf(Math.max(0L, l == null ? 0L : l.longValue()));
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
        abnkVarF.k = this.a.longValue();
        return abnkVarF.a();
    }
}
