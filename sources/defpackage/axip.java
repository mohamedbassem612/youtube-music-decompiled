package defpackage;

import app.rive.semantics.SemanticState;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axip {
    private static final axio a = new axio(new byte[0], 0, 0, false);
    private static final int b;
    private static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() << 1) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final axio a() {
        AtomicReference atomicReferenceC = c();
        axio axioVar = a;
        axio axioVar2 = (axio) atomicReferenceC.getAndSet(axioVar);
        if (axioVar2 == axioVar) {
            return new axio();
        }
        if (axioVar2 == null) {
            atomicReferenceC.set(null);
            return new axio();
        }
        atomicReferenceC.set(axioVar2.f);
        axioVar2.f = null;
        axioVar2.c = 0;
        return axioVar2;
    }

    public static final void b(axio axioVar) {
        if (axioVar.f != null || axioVar.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (axioVar.d) {
            return;
        }
        AtomicReference atomicReferenceC = c();
        axio axioVar2 = a;
        axio axioVar3 = (axio) atomicReferenceC.getAndSet(axioVar2);
        if (axioVar3 != axioVar2) {
            int i = axioVar3 != null ? axioVar3.c : 0;
            if (i >= 65536) {
                atomicReferenceC.set(axioVar3);
                return;
            }
            axioVar.f = axioVar3;
            axioVar.b = 0;
            axioVar.c = i + SemanticState.Multiline;
            atomicReferenceC.set(axioVar);
        }
    }

    private static final AtomicReference c() {
        return c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
    }
}
