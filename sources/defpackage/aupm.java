package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aupm implements aupr, aunn {
    private static final Object a = new Object();
    private volatile aupr b;
    private volatile Object c = a;

    private aupm(aupr auprVar) {
        this.b = auprVar;
    }

    public static aunn b(aupr auprVar) {
        if (auprVar instanceof aunn) {
            return (aunn) auprVar;
        }
        auprVar.getClass();
        return new aupm(auprVar);
    }

    public static aupr c(aupr auprVar) {
        auprVar.getClass();
        return !(auprVar instanceof aupm) ? new aupm(auprVar) : auprVar;
    }

    private final synchronized Object d() {
        Object objIo;
        objIo = this.c;
        Object obj = a;
        if (objIo == obj) {
            objIo = this.b.io();
            Object obj2 = this.c;
            if (obj2 != obj && obj2 != objIo) {
                throw new IllegalStateException(a.bW(objIo, obj2, "Scoped provider was invoked recursively returning different results: ", " & ", ". This is likely due to a circular dependency."));
            }
            this.c = objIo;
            this.b = null;
        }
        return objIo;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        Object obj = this.c;
        return obj == a ? d() : obj;
    }
}
