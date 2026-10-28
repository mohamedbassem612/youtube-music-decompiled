package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum avnr implements avmn {
    DISPOSED;

    public static void a() {
        atqp.n(new avmz("Disposable already set!"));
    }

    public static boolean b(AtomicReference atomicReference) {
        avmn avmnVar;
        avmn avmnVar2 = (avmn) atomicReference.get();
        avnr avnrVar = DISPOSED;
        if (avmnVar2 == avnrVar || (avmnVar = (avmn) atomicReference.getAndSet(avnrVar)) == avnrVar) {
            return false;
        }
        if (avmnVar != null) {
            avmnVar.dispose();
        }
        return true;
    }

    public static boolean c(avmn avmnVar) {
        return avmnVar == DISPOSED;
    }

    public static boolean d(AtomicReference atomicReference, avmn avmnVar) {
        avmnVar.getClass();
        if (a.av(atomicReference, null, avmnVar)) {
            return true;
        }
        avmnVar.dispose();
        if (atomicReference.get() != DISPOSED) {
            a();
        }
        return false;
    }

    public static boolean e(avmn avmnVar, avmn avmnVar2) {
        if (avmnVar2 == null) {
            atqp.n(new NullPointerException("next is null"));
            return false;
        }
        if (avmnVar == null) {
            return true;
        }
        avmnVar2.dispose();
        a();
        return false;
    }

    public static void g(AtomicReference atomicReference, avmn avmnVar) {
        avmn avmnVar2;
        do {
            avmnVar2 = (avmn) atomicReference.get();
            if (avmnVar2 == DISPOSED) {
                if (avmnVar != null) {
                    avmnVar.dispose();
                    return;
                }
                return;
            }
        } while (!a.av(atomicReference, avmnVar2, avmnVar));
    }

    public static void h(AtomicReference atomicReference, avmn avmnVar) {
        if (a.av(atomicReference, null, avmnVar) || atomicReference.get() != DISPOSED) {
            return;
        }
        avmnVar.dispose();
    }

    public static void i(AtomicReference atomicReference, avmn avmnVar) {
        avmn avmnVar2;
        do {
            avmnVar2 = (avmn) atomicReference.get();
            if (avmnVar2 == DISPOSED) {
                if (avmnVar != null) {
                    avmnVar.dispose();
                    return;
                }
                return;
            }
        } while (!a.av(atomicReference, avmnVar2, avmnVar));
        if (avmnVar2 != null) {
            avmnVar2.dispose();
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return true;
    }

    @Override // defpackage.avmn
    public final void dispose() {
    }
}
