package defpackage;

import com.google.android.libraries.elements.interfaces.JSPromiseResolver;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class mhg extends awkp {
    final /* synthetic */ JSPromiseResolver a;

    public mhg(JSPromiseResolver jSPromiseResolver) {
        this.a = jSPromiseResolver;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.a.reject(Status.c.withDescription(th.getMessage() == null ? "error" : th.getMessage()));
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        this.a.resolve();
    }
}
