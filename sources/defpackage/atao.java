package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atao extends ataq implements mes {
    public boolean d = false;

    private final void aU() {
        if (this.d) {
            this.d = false;
            bG();
        }
    }

    @Override // defpackage.ataq
    public final void aR() {
        if (this.e) {
            aU();
            bO(8, 2);
            bR(32, this.f);
            this.e = false;
        }
    }

    public final void aS(int i) {
        aU();
        bO(8, 1);
        bQ(16, i);
    }

    public final void aT(atat atatVar) {
        if (atatVar.d) {
            atatVar.bG();
        } else {
            atatVar.d = true;
        }
        atax ataxVar = new atax(atatVar.b);
        AtomicReference atomicReference = atatVar.f;
        if (atomicReference.get() != null) {
            ataxVar.f.set((ArrayList) atomicReference.get());
            ataxVar.g = atatVar.g;
            atatVar.e = true;
        }
        ataxVar.aR();
        if (ataxVar != this.f) {
            this.f = ataxVar;
            this.e = true;
        }
    }
}
