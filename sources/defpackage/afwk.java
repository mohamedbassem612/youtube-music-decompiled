package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afwk implements Runnable {
    final /* synthetic */ awrm a;
    final /* synthetic */ afvl b;
    final /* synthetic */ Runnable c;

    public afwk(awrm awrmVar, afvl afvlVar, Runnable runnable) {
        this.a = awrmVar;
        this.b = afvlVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((afxa) this.a.a) != null) {
            throw null;
        }
        afvl afvlVar = this.b;
        Runnable runnable = this.c;
        afvh afvhVar = (afvh) afty.d.get();
        afvl afvlVarE = afty.e(afvhVar, afvlVar);
        try {
            runnable.run();
            afty.e(afvhVar, afvlVarE);
        } catch (Throwable th) {
            try {
                aftt.a(th);
                throw th;
            } catch (Throwable th2) {
                afty.e(afvhVar, afvlVarE);
                throw th2;
            }
        }
    }

    public final String toString() {
        return "propagating=[" + this.c + ']';
    }
}
