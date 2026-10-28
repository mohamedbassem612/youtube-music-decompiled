package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class epb extends eow {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public epb(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.eow
    public final void a(epe epeVar, epe epeVar2) {
        this.b.lazySet(epeVar, epeVar2);
    }

    @Override // defpackage.eow
    public final void b(epe epeVar, Thread thread) {
        this.a.lazySet(epeVar, thread);
    }

    @Override // defpackage.eow
    public final boolean c(epf epfVar, epa epaVar, epa epaVar2) {
        return a.aA(this.d, epfVar, epaVar, epaVar2);
    }

    @Override // defpackage.eow
    public final boolean d(epf epfVar, Object obj, Object obj2) {
        return a.aA(this.e, epfVar, obj, obj2);
    }

    @Override // defpackage.eow
    public final boolean e(epf epfVar, epe epeVar, epe epeVar2) {
        return a.aA(this.c, epfVar, epeVar, epeVar2);
    }
}
