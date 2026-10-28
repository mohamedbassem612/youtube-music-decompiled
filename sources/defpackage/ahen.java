package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahen extends ahcg implements Runnable {
    private ListenableFuture a;

    public ahen(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    @Override // defpackage.ahch
    protected final void gH() {
        this.a = null;
    }

    @Override // defpackage.ahch
    protected final String jK() {
        ListenableFuture listenableFuture = this.a;
        if (listenableFuture != null) {
            return a.cn((byte) 93, listenableFuture, "delegate=[");
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.a;
        if (listenableFuture != null) {
            setFuture(listenableFuture);
        }
    }
}
