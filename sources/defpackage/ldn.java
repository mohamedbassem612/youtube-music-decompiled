package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ldn extends agm {
    final /* synthetic */ ldo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldn(ldo ldoVar) {
        super(20);
        this.c = ldoVar;
    }

    @Override // defpackage.agm
    protected final /* bridge */ /* synthetic */ Object a(Object obj) throws Throwable {
        String str = (String) obj;
        kro.i(str);
        ldo ldoVar = this.c;
        ldoVar.w();
        kro.i(str);
        xsc xscVarAr = ldoVar.v().ar(str);
        if (xscVarAr == null) {
            return null;
        }
        ldoVar.aT().k.b("Populate EES config from database on cache miss. appId", str);
        ldoVar.i(str, ldoVar.f(str, (byte[]) xscVarAr.b));
        return (giy) ldoVar.h.e().get(str);
    }
}
