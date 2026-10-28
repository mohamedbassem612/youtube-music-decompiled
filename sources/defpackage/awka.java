package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum awka implements axsq {
    CANCELLED;

    public static void a(AtomicReference atomicReference, AtomicLong atomicLong, long j) {
        axsq axsqVar = (axsq) atomicReference.get();
        if (axsqVar != null) {
            axsqVar.ko(j);
            return;
        }
        if (h(j)) {
            atqp.B(atomicLong, j);
            axsq axsqVar2 = (axsq) atomicReference.get();
            if (axsqVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    axsqVar2.ko(andSet);
                }
            }
        }
    }

    public static void b(long j) {
        atqp.n(new avmz(a.bS(j, "More produced than requested: ")));
    }

    public static void d() {
        atqp.n(new avmz("Subscription already set!"));
    }

    public static boolean f(AtomicReference atomicReference) {
        axsq axsqVar;
        axsq axsqVar2 = (axsq) atomicReference.get();
        awka awkaVar = CANCELLED;
        if (axsqVar2 == awkaVar || (axsqVar = (axsq) atomicReference.getAndSet(awkaVar)) == awkaVar) {
            return false;
        }
        if (axsqVar != null) {
            axsqVar.kj();
        }
        return true;
    }

    public static boolean g(AtomicReference atomicReference, axsq axsqVar) {
        if (a.ap(atomicReference, axsqVar)) {
            return true;
        }
        axsqVar.kj();
        if (atomicReference.get() != CANCELLED) {
            d();
        }
        return false;
    }

    public static boolean h(long j) {
        if (j > 0) {
            return true;
        }
        atqp.n(new IllegalArgumentException(a.bS(j, "n > 0 required but it was ")));
        return false;
    }

    public static boolean i(axsq axsqVar, axsq axsqVar2) {
        if (axsqVar == null) {
            return true;
        }
        axsqVar2.kj();
        d();
        return false;
    }

    public static void j(AtomicReference atomicReference, AtomicLong atomicLong, axsq axsqVar) {
        if (g(atomicReference, axsqVar)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                axsqVar.ko(andSet);
            }
        }
    }

    public static void k(AtomicReference atomicReference, axsq axsqVar, long j) {
        if (g(atomicReference, axsqVar)) {
            axsqVar.ko(j);
        }
    }

    @Override // defpackage.axsq
    public final void kj() {
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
    }
}
