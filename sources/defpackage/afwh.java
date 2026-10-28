package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afwh implements ahcx {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public afwh(ahdz ahdzVar, ahcx ahcxVar, int i) {
        this.$cid = i;
        this.b = ahdzVar;
        this.a = ahcxVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [afvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ahcx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [ahcx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [ahcx, java.lang.Object] */
    @Override // defpackage.ahcx
    public final ListenableFuture a() {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                return !((ahdz) this.b).compareAndSet(ahdy.a, ahdy.c) ? ahng.l() : this.a.a();
            }
            return this.a.a();
        }
        afvh afvhVar = (afvh) afty.d.get();
        afvl afvlVarE = afty.e(afvhVar, this.a);
        try {
            ListenableFuture listenableFutureA = this.b.a();
            afty.e(afvhVar, afvlVarE);
            listenableFutureA.getClass();
            return listenableFutureA;
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
        int i = this.$cid;
        if (i == 0) {
            return "propagating=[" + this.b + ']';
        }
        Object obj = this.a;
        if (i != 1) {
            return obj.toString();
        }
        Object obj2 = this.b;
        return obj.toString() + ", input=[" + String.valueOf(obj2) + ']';
    }

    public afwh(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
