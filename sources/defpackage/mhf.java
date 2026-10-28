package defpackage;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class mhf extends awkp {
    final /* synthetic */ AtomicReference a;

    public mhf(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.a.set(Status.j.withDescription(th.getMessage() == null ? "Error while executing command." : th.getMessage()));
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        this.a.set(Status.OK);
    }
}
