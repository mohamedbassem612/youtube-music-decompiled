package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atat extends atax implements mes {
    public boolean d = false;
    public boolean e = false;

    @Override // defpackage.atax
    public final void aR() {
        if (this.g) {
            if (this.d) {
                this.d = false;
                bG();
            }
            AtomicReference atomicReference = this.f;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(8);
            } else {
                aN((ArrayList) atomicReference.get());
            }
            this.g = false;
        }
    }

    public final void aS(atau atauVar) {
        if (atauVar.d) {
            atauVar.bG();
        } else {
            atauVar.d = true;
        }
        atgs atgsVar = new atgs(atauVar.b, (char[]) null);
        if (this.e) {
            AtomicReference atomicReference = this.f;
            atomicReference.set(new ArrayList((Collection) atomicReference.get()));
            this.e = false;
        } else {
            AtomicReference atomicReference2 = this.f;
            if (atomicReference2.get() == null) {
                a.ap(atomicReference2, bB(8, atav.a, new ngh(12)));
            }
        }
        ((ArrayList) this.f.get()).add(atgsVar);
        this.g = true;
    }
}
