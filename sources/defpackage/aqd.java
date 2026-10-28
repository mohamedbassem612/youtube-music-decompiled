package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aqd extends apy {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public aqd(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.apy
    public final void a(aqg aqgVar, aqg aqgVar2) {
        this.b.lazySet(aqgVar, aqgVar2);
    }

    @Override // defpackage.apy
    public final void b(aqg aqgVar, Thread thread) {
        this.a.lazySet(aqgVar, thread);
    }

    @Override // defpackage.apy
    public final boolean c(aqh aqhVar, aqc aqcVar, aqc aqcVar2) {
        return a.aA(this.d, aqhVar, aqcVar, aqcVar2);
    }

    @Override // defpackage.apy
    public final boolean d(aqh aqhVar, Object obj, Object obj2) {
        return a.aA(this.e, aqhVar, obj, obj2);
    }

    @Override // defpackage.apy
    public final boolean e(aqh aqhVar, aqg aqgVar, aqg aqgVar2) {
        return a.aA(this.c, aqhVar, aqgVar, aqgVar2);
    }
}
