package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class afit implements afhv {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ afit(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.afhv
    public final ListenableFuture a() {
        int i = this.$cid;
        Object obj = this.a;
        if (i == 0) {
            ((axqr) obj).b();
            return aher.a;
        }
        ListenableFuture listenableFuture = aher.a;
        ((ahpu) obj).k(listenableFuture);
        return listenableFuture;
    }
}
