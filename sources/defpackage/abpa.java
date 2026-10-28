package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abpa extends ahef {
    private final AtomicReference a;

    public abpa(ListenableFuture listenableFuture, AtomicReference atomicReference) {
        super(listenableFuture);
        this.a = atomicReference;
    }

    @Override // defpackage.ahee, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        AtomicReference atomicReference = this.a;
        boolean zCancel = super.cancel(z);
        aboz abozVar = (aboz) atomicReference.get();
        if (abozVar != null) {
            abozVar.cancel(z);
        }
        return zCancel;
    }
}
