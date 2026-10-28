package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aupl implements aupn {
    private aupr a;

    public static void b(aupl auplVar, aupr auprVar) {
        auprVar.getClass();
        if (auplVar.a != null) {
            throw new IllegalStateException();
        }
        auplVar.a = auprVar;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        aupr auprVar = this.a;
        if (auprVar != null) {
            return auprVar.io();
        }
        throw new IllegalStateException();
    }
}
