package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nge extends ngi implements mes {
    public boolean d;

    public nge(UpbMessage upbMessage) {
        super(upbMessage);
        this.d = false;
    }

    public final ngf aR() {
        if (this.d) {
            bG();
        } else {
            this.d = true;
        }
        ngf ngfVar = new ngf(this.b);
        AtomicReference atomicReference = this.g;
        if (atomicReference.get() != null) {
            ngfVar.g.set((ArrayList) atomicReference.get());
        }
        AtomicReference atomicReference2 = this.h;
        if (atomicReference2.get() != null) {
            ngfVar.h.set((ArrayList) atomicReference2.get());
        }
        AtomicReference atomicReference3 = this.i;
        if (atomicReference3.get() != null) {
            ngfVar.i.set((ArrayList) atomicReference3.get());
        }
        AtomicReference atomicReference4 = this.j;
        if (atomicReference4.get() != null) {
            ngfVar.j.set((ArrayList) atomicReference4.get());
        }
        AtomicReference atomicReference5 = this.k;
        if (atomicReference5.get() != null) {
            ngfVar.k.set((ArrayList) atomicReference5.get());
        }
        AtomicReference atomicReference6 = this.l;
        if (atomicReference6.get() != null) {
            ngfVar.l.set((ArrayList) atomicReference6.get());
        }
        if (this.m != null) {
            ngfVar.m = this.m;
        }
        return ngfVar;
    }

    public final void aS() {
        if (this.d) {
            this.d = false;
            bG();
        }
        mfc mfcVar = e;
        bN(mfcVar);
        bT(mfcVar.b, "…");
        this.f = null;
    }
}
