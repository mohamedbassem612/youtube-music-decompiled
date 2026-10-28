package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ahcj extends ahci {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(ahcn.class, Thread.class, "thread");
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ahcn.class, ahcn.class, "next");
    private static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(ahco.class, ahcn.class, "waitersField");
    private static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(ahco.class, ahce.class, "listenersField");
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(ahco.class, Object.class, "valueField");

    @Override // defpackage.ahci
    public final ahce a(ahco ahcoVar, ahce ahceVar) {
        return (ahce) d.getAndSet(ahcoVar, ahceVar);
    }

    @Override // defpackage.ahci
    public final ahcn b(ahco ahcoVar, ahcn ahcnVar) {
        return (ahcn) c.getAndSet(ahcoVar, ahcnVar);
    }

    @Override // defpackage.ahci
    public final void c(ahcn ahcnVar, ahcn ahcnVar2) {
        b.lazySet(ahcnVar, ahcnVar2);
    }

    @Override // defpackage.ahci
    public final void d(ahcn ahcnVar, Thread thread) {
        a.lazySet(ahcnVar, thread);
    }

    @Override // defpackage.ahci
    public final boolean e(ahco ahcoVar, ahce ahceVar, ahce ahceVar2) {
        return a.aA(d, ahcoVar, ahceVar, ahceVar2);
    }

    @Override // defpackage.ahci
    public final boolean f(ahco ahcoVar, Object obj, Object obj2) {
        return a.aA(e, ahcoVar, obj, obj2);
    }

    @Override // defpackage.ahci
    public final boolean g(ahco ahcoVar, ahcn ahcnVar, ahcn ahcnVar2) {
        return a.aA(c, ahcoVar, ahcnVar, ahcnVar2);
    }
}
