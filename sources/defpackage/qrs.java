package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qrs implements qrc {
    private final /* synthetic */ int $cid;
    private final Object a;

    public qrs(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.qrc
    public final ListenableFuture a(ListenableFuture listenableFuture) {
        if (this.$cid != 0) {
            return rmp.B(((qrg) this.a).d(listenableFuture));
        }
        Object obj = this.a;
        return ahcs.f(listenableFuture, afwl.d(new qmu(obj, 5)), ((qrt) obj).b);
    }
}
