package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afni implements afso {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public afni(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [afna, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [afmz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [afmz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [afna, afss, java.lang.Object] */
    @Override // defpackage.afso
    public final ListenableFuture a() {
        int i = this.$cid;
        if (i == 0) {
            ListenableFuture listenableFutureA = this.a.a();
            listenableFutureA.getClass();
            return listenableFutureA;
        }
        if (i == 1) {
            ListenableFuture listenableFutureB = this.a.b();
            listenableFutureB.getClass();
            return listenableFutureB;
        }
        if (i == 2) {
            ListenableFuture listenableFutureB2 = this.a.b();
            listenableFutureB2.getClass();
            return listenableFutureB2;
        }
        ?? r2 = this.a;
        if (i != 3) {
            return r2.b();
        }
        ListenableFuture listenableFutureA2 = r2.a();
        listenableFutureA2.getClass();
        return listenableFutureA2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [afmz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [afmz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [afss, java.lang.Object] */
    @Override // defpackage.afso
    public final ListenableFuture b(Duration duration) {
        int i = this.$cid;
        if (i == 0) {
            duration.getClass();
            return aher.a;
        }
        if (i == 1) {
            duration.getClass();
            ListenableFuture listenableFutureA = this.a.a();
            listenableFutureA.getClass();
            return listenableFutureA;
        }
        if (i != 2) {
            if (i != 3) {
                return this.a.a();
            }
            duration.getClass();
            return aher.a;
        }
        duration.getClass();
        ListenableFuture listenableFutureA2 = this.a.a();
        listenableFutureA2.getClass();
        return listenableFutureA2;
    }
}
