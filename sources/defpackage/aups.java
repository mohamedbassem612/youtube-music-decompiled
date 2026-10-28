package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aups implements aupr {
    private final aupr a;

    public aups(aupr auprVar) {
        this.a = auprVar;
    }

    public static aupr b(aupr auprVar) {
        auprVar.getClass();
        return new aups(auprVar);
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* bridge */ /* synthetic */ Object io() {
        return aupm.b(this.a);
    }
}
