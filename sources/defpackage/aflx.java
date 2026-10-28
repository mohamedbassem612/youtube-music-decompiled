package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aflx implements afso {
    final /* synthetic */ Supplier a;

    public aflx(Supplier supplier) {
        this.a = supplier;
    }

    @Override // defpackage.afso
    public final ListenableFuture a() {
        return aher.a;
    }

    @Override // defpackage.afso
    public final ListenableFuture b(Duration duration) {
        ((Integer) this.a.get()).intValue();
        return aher.a;
    }
}
