package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tzf implements avnh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ ListenableFuture a;

    public /* synthetic */ tzf(ListenableFuture listenableFuture, int i) {
        this.$cid = i;
        this.a = listenableFuture;
    }

    @Override // defpackage.avnh
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            this.a.cancel(true);
            return;
        }
        ListenableFuture listenableFuture = this.a;
        if (i != 1) {
            listenableFuture.cancel(false);
        } else {
            listenableFuture.cancel(true);
        }
    }
}
