package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asis extends asiu implements mes {
    private boolean f = false;

    @Override // defpackage.asiu
    public final void aR() {
        if (this.d) {
            if (this.f) {
                this.f = false;
                bG();
            }
            bO(8, 1);
            bR(true != a ? 12 : 16, this.e);
            this.d = false;
        }
    }

    public final asiu aS() {
        if (this.f) {
            bG();
        } else {
            this.f = true;
        }
        asiu asiuVar = new asiu(this.b);
        if (this.e != null) {
            asiuVar.e = this.e;
            asiuVar.d = this.d;
        }
        asiuVar.aR();
        return asiuVar;
    }

    public final void aT(atan atanVar) {
        if (atanVar.d) {
            atanVar.bG();
        } else {
            atanVar.d = true;
        }
        atas atasVar = new atas(atanVar.b);
        AtomicReference atomicReference = atanVar.f;
        if (atomicReference.get() != null) {
            atasVar.f.set((ArrayList) atomicReference.get());
            atasVar.g = atanVar.g;
            atanVar.e = true;
        }
        atasVar.aR();
        if (atasVar != this.e) {
            this.e = atasVar;
            this.d = true;
        }
    }
}
