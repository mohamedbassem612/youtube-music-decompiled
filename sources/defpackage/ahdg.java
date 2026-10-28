package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahdg implements Callable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public ahdg(aciz acizVar, ahdh ahdhVar, int i) {
        this.$cid = i;
        this.a = ahdhVar;
        this.b = acizVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [afvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ahdh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object objA;
        if (this.$cid != 0) {
            ?? r0 = this.a;
            afvh afvhVarA = afty.a();
            afvl afvlVarF = afty.f(afvhVarA, r0);
            try {
                objA = this.b.call();
                afty.f(afvhVarA, afvlVarF);
            } catch (Throwable th) {
                try {
                    aftt.a(th);
                    throw th;
                } catch (Throwable th2) {
                    afty.f(afvhVarA, afvlVarF);
                    throw th2;
                }
            }
        } else {
            aciz acizVar = (aciz) this.b;
            ahdj ahdjVar = new ahdj((agke) acizVar.a);
            ahdjVar.a = true;
            ahde ahdeVar = new ahde();
            Object obj = acizVar.b;
            try {
                objA = this.a.a(ahdjVar);
            } finally {
                ((ahde) obj).b(ahdeVar, MoreExecutors.directExecutor());
                ahdjVar.a = false;
            }
        }
        return objA;
    }

    public final String toString() {
        if (this.$cid == 0) {
            return this.a.toString();
        }
        return "propagating=[" + this.b + ']';
    }

    public ahdg(afvl afvlVar, Callable callable, int i) {
        this.$cid = i;
        this.a = afvlVar;
        this.b = callable;
    }
}
