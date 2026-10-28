package defpackage;

import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class syh implements sxu {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/common/async/ThreadingCallback");
    public static final LinkedBlockingQueue b = new LinkedBlockingQueue();
    private final sxu c;

    public syh(sxu sxuVar) {
        sxuVar.getClass();
        this.c = sxuVar;
    }

    private static syg d() {
        syg sygVar = (syg) b.poll();
        return sygVar == null ? new syg() : sygVar;
    }

    @Override // defpackage.sxu
    public final void b(Object obj, Object obj2) {
        syg sygVarD = d();
        sygVarD.a = this.c;
        sygVarD.b = obj;
        sygVarD.c = obj2;
        sygVarD.d = null;
        sygVarD.e = true;
        c(sygVarD);
    }

    protected abstract void c(Runnable runnable);

    @Override // defpackage.sxu
    public final void iT(Object obj, Exception exc) {
        syg sygVarD = d();
        sygVarD.a = this.c;
        sygVarD.b = obj;
        sygVarD.d = exc;
        sygVarD.c = null;
        sygVarD.e = false;
        c(sygVarD);
    }
}
