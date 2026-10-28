package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class bt extends rc {
    final /* synthetic */ AtomicReference a;

    public bt(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.rc
    public final void a() {
        throw null;
    }

    @Override // defpackage.rc
    public final void b(Object obj, aad aadVar) {
        rc rcVar = (rc) this.a.get();
        if (rcVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        rcVar.b(obj, null);
    }
}
