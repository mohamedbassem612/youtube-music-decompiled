package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aupu implements aupr {
    private static final Object a = new Object();
    private volatile aupr b;
    private volatile Object c = a;

    private aupu(aupr auprVar) {
        this.b = auprVar;
    }

    public static aupr b(aupr auprVar) {
        if ((auprVar instanceof aupu) || (auprVar instanceof aupm)) {
            return auprVar;
        }
        auprVar.getClass();
        return new aupu(auprVar);
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        Object obj = this.c;
        if (obj != a) {
            return obj;
        }
        aupr auprVar = this.b;
        if (auprVar == null) {
            return this.c;
        }
        Object objIo = auprVar.io();
        this.c = objIo;
        this.b = null;
        return objIo;
    }
}
