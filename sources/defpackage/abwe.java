package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abwe extends ahef {
    private final Supplier a;

    public abwe(ListenableFuture listenableFuture, Supplier supplier) {
        super(listenableFuture);
        this.a = supplier;
    }

    @Override // defpackage.ahee, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Supplier supplier = this.a;
        boolean zCancel = super.cancel(z);
        ListenableFuture listenableFuture = (ListenableFuture) supplier.get();
        if (listenableFuture != null) {
            listenableFuture.cancel(z);
        }
        return zCancel;
    }
}
