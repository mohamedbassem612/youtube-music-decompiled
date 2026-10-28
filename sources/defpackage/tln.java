package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tln implements Runnable {
    private final /* synthetic */ int $cid;
    private final Object a;
    private final Object b;

    public tln(ListenableFuture listenableFuture, awuc awucVar, int i) {
        this.$cid = i;
        this.a = listenableFuture;
        this.b = awucVar;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [awuc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r3v2, types: [awoq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [awuc, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            tnx tnxVar = (tnx) this.b;
            boolean zH = tnxVar.h();
            ?? r3 = this.a;
            if (zH) {
                r3.ad(tnxVar.c().a);
                return;
            } else {
                r3.y(tnxVar.a().a);
                return;
            }
        }
        ?? r1 = this.a;
        if (i != 1) {
            xdb xdbVar = (xdb) r1;
            if (xdbVar.g != null) {
                xdbVar.e((String) this.b);
                return;
            }
            return;
        }
        if (r1.isCancelled()) {
            this.b.f(null);
            return;
        }
        try {
            ?? r0 = this.b;
            int i2 = aqh.c;
            r0.resumeWith(a.i(r1));
        } catch (ExecutionException e) {
            this.b.resumeWith(atqp.i(yi.c(e)));
        }
    }

    public tln(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
