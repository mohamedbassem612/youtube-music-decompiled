package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import java.io.Closeable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahcz implements Callable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public ahcz(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [afvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.$cid == 0) {
            Object obj = this.a;
            ((ahde) obj).a.j(((Closeable[]) ((hwe) this.b).a)[0], MoreExecutors.directExecutor());
            return null;
        }
        afvh afvhVar = (afvh) afty.d.get();
        afvl afvlVarE = afty.e(afvhVar, this.b);
        try {
            Object objCall = this.a.call();
            afty.e(afvhVar, afvlVarE);
            return objCall;
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
        if (this.$cid == 0) {
            return ((hwe) this.b).toString();
        }
        return "propagating=[" + this.a + ']';
    }
}
