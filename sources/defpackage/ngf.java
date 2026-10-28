package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ngf extends ngi {
    private ngf() {
    }

    public static ngf aS(byte[] bArr) {
        ngf ngfVar = new ngf();
        ngfVar.bH(bArr);
        return ngfVar;
    }

    public final nge aR() {
        nge ngeVar = new nge(this.b);
        AtomicReference atomicReference = this.g;
        if (atomicReference.get() != null) {
            ngeVar.g.set((ArrayList) atomicReference.get());
        }
        AtomicReference atomicReference2 = this.h;
        if (atomicReference2.get() != null) {
            ngeVar.h.set((ArrayList) atomicReference2.get());
        }
        AtomicReference atomicReference3 = this.i;
        if (atomicReference3.get() != null) {
            ngeVar.i.set((ArrayList) atomicReference3.get());
        }
        AtomicReference atomicReference4 = this.j;
        if (atomicReference4.get() != null) {
            ngeVar.j.set((ArrayList) atomicReference4.get());
        }
        AtomicReference atomicReference5 = this.k;
        if (atomicReference5.get() != null) {
            ngeVar.k.set((ArrayList) atomicReference5.get());
        }
        AtomicReference atomicReference6 = this.l;
        if (atomicReference6.get() != null) {
            ngeVar.l.set((ArrayList) atomicReference6.get());
        }
        if (this.m != null) {
            ngeVar.m = this.m;
        }
        ngeVar.d = true;
        return ngeVar;
    }
}
