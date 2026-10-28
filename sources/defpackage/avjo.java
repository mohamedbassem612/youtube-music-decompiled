package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avjo extends avjn {
    private final AtomicIntegerFieldUpdater a;

    public avjo(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.avjn
    public final boolean a(avjq avjqVar) {
        return this.a.compareAndSet(avjqVar, 0, -1);
    }

    @Override // defpackage.avjn
    public final void b(avjq avjqVar) {
        this.a.set(avjqVar, 0);
    }
}
