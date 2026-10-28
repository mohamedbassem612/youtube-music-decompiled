package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avck extends auzg {
    private static final Logger b = Logger.getLogger(avck.class.getName());
    static final ThreadLocal a = new ThreadLocal();

    @Override // defpackage.auzg
    public final auzh a() {
        auzh auzhVar = (auzh) a.get();
        return auzhVar == null ? auzh.b : auzhVar;
    }

    @Override // defpackage.auzg
    public final auzh b(auzh auzhVar) {
        auzh auzhVarA = a();
        a.set(auzhVar);
        return auzhVarA;
    }

    @Override // defpackage.auzg
    public final void c(auzh auzhVar, auzh auzhVar2) {
        if (a() != auzhVar) {
            b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        auzh auzhVar3 = auzh.b;
        ThreadLocal threadLocal = a;
        if (auzhVar2 != auzhVar3) {
            threadLocal.set(auzhVar2);
        } else {
            threadLocal.set(null);
        }
    }
}
