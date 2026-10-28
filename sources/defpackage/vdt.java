package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vdt implements awqg {
    private final /* synthetic */ int $cid;
    final /* synthetic */ ListenableFuture a;

    public vdt(ListenableFuture listenableFuture, int i) {
        this.$cid = i;
        this.a = listenableFuture;
    }

    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            this.a.cancel(false);
            return awmy.a;
        }
        if (i != 1) {
            this.a.cancel(false);
            return awmy.a;
        }
        this.a.cancel(false);
        return awmy.a;
    }
}
