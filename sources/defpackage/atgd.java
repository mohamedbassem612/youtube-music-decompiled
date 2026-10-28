package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atgd extends atgg implements mes {
    private boolean m = false;
    private boolean n = false;

    private final void bc() {
        if (this.m) {
            this.m = false;
            bG();
        }
    }

    @Override // defpackage.atgg
    public final void aR() {
        if (this.h) {
            bc();
            AtomicReference atomicReference = this.g;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(true != a ? 20 : 48);
            } else {
                bS(3, (ArrayList) atomicReference.get());
            }
            this.h = false;
        }
    }

    @Override // defpackage.atgg
    public final void aS() {
        if (this.f) {
            bc();
            bO(8, 2);
            bR(true != a ? 16 : 40, this.k);
            this.f = false;
        }
    }

    @Override // defpackage.atgg
    public final void aT() {
        if (this.e) {
            bc();
            bO(8, 1);
            bR(true != a ? 12 : 32, this.j);
            this.e = false;
        }
    }

    public final atgg aU() {
        if (this.m) {
            bG();
        } else {
            this.m = true;
        }
        atgg atggVar = new atgg(this.b);
        AtomicReference atomicReference = this.g;
        if (atomicReference.get() != null) {
            atggVar.g.set((ArrayList) atomicReference.get());
            atggVar.h = this.h;
            this.n = true;
        }
        if (this.j != null) {
            atggVar.j = this.j;
            atggVar.e = this.e;
        }
        if (this.k != null) {
            atggVar.k = this.k;
            atggVar.f = this.f;
        }
        atggVar.bJ();
        return atggVar;
    }

    public final void aV(atgg atggVar) {
        if (this.n) {
            AtomicReference atomicReference = this.g;
            atomicReference.set(new ArrayList((Collection) atomicReference.get()));
            this.n = false;
        } else {
            AtomicReference atomicReference2 = this.g;
            if (atomicReference2.get() == null) {
                a.ap(atomicReference2, bE(true != atgg.a ? 20 : 48, atgf.a, new njk(13)));
            }
        }
        ((ArrayList) this.g.get()).add(atggVar);
        this.h = true;
    }

    public final void aW(atoc atocVar) {
        if (atocVar.d) {
            atocVar.bG();
        } else {
            atocVar.d = true;
        }
        mew mewVar = new mew(atocVar.b, (byte[][]) null);
        if (mewVar != this.j) {
            this.j = mewVar;
            this.e = true;
        }
    }

    public final void aX(mew mewVar) {
        if (mewVar != this.k) {
            this.k = mewVar;
            this.f = true;
        }
    }
}
