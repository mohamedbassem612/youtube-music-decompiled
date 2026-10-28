package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class qsr extends ahch implements Runnable {
    public static final /* synthetic */ int a = 0;
    private final qsq b;

    public qsr(qsq qsqVar) {
        this.b = qsqVar;
    }

    protected abstract void c(qsq qsqVar);

    public final void d(Executor executor) {
        executor.execute(afwl.i(this));
    }

    @Override // defpackage.ahch
    public final String jK() {
        return "query=[" + this.b.b() + ']';
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isCancelled()) {
            return;
        }
        try {
            qsq qsqVar = this.b;
            afuu afuuVarD = afwt.d(37, "Query: " + qsqVar.b(), afux.a, true);
            try {
                c(qsqVar);
                afuuVarD.close();
            } catch (Throwable th) {
                try {
                    afuuVarD.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            setException(th3);
        }
    }
}
