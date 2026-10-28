package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wfi extends wfk {
    private final vyo b;

    public wfi(mbc mbcVar, vyo vyoVar) {
        super(mbcVar);
        this.b = vyoVar;
    }

    @Override // defpackage.wfk, defpackage.wfl
    public final synchronized void a(String str, String str2) {
        alik alikVarB = this.b.b();
        if (alikVarB != null) {
            amve amveVar = alikVarB.f;
            if (amveVar == null) {
                amveVar = amve.a;
            }
            if (amveVar.d) {
                super.a(str, str2);
                return;
            }
        }
        this.a.clear();
    }
}
