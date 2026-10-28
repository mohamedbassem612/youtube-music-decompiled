package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atan extends atas implements mes {
    public boolean d = false;
    public boolean e = false;

    @Override // defpackage.atas
    public final void aR() {
        if (this.g) {
            if (this.d) {
                this.d = false;
                bG();
            }
            AtomicReference atomicReference = this.f;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(true != a ? 12 : 32);
            } else {
                aN((ArrayList) atomicReference.get());
            }
            this.g = false;
        }
    }

    public final void aS(atao ataoVar) {
        if (ataoVar.d) {
            ataoVar.bG();
        } else {
            ataoVar.d = true;
        }
        ataq ataqVar = new ataq(ataoVar.b);
        if (ataoVar.f != null) {
            ataqVar.f = ataoVar.f;
            ataqVar.e = ataoVar.e;
        }
        ataqVar.aR();
        if (this.e) {
            AtomicReference atomicReference = this.f;
            atomicReference.set(new ArrayList((Collection) atomicReference.get()));
            this.e = false;
        } else {
            AtomicReference atomicReference2 = this.f;
            if (atomicReference2.get() == null) {
                a.ap(atomicReference2, bB(true != atas.a ? 12 : 32, atap.a, new ngh(11)));
            }
        }
        ((ArrayList) this.f.get()).add(ataqVar);
        this.g = true;
    }
}
