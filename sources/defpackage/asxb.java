package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asxb extends asxe implements mes {
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    public asxb() {
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
    }

    @Override // defpackage.asxe
    public final void aR() {
        if (this.r) {
            aT();
            AtomicReference atomicReference = this.q;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(true != a ? 32 : 64);
            } else {
                bS(8, (ArrayList) atomicReference.get());
            }
            this.r = false;
        }
    }

    @Override // defpackage.asxe
    public final void aS() {
        if (this.n) {
            aT();
            AtomicReference atomicReference = this.m;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(true != a ? 24 : 48);
            } else {
                bS(5, (ArrayList) atomicReference.get());
            }
            this.n = false;
        }
    }

    public final void aT() {
        if (this.d) {
            this.d = false;
            bG();
        }
    }

    @Override // defpackage.asxe
    public final void aU() {
        if (this.t) {
            aT();
            AtomicReference atomicReference = this.s;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(true != a ? 40 : 72);
            } else {
                bS(10, (ArrayList) atomicReference.get());
            }
            this.t = false;
        }
    }

    @Override // defpackage.asxe
    public final void aV() {
        if (this.u) {
            aT();
            bO(8, 64);
            bR(true != a ? 44 : 80, this.z);
            this.u = false;
        }
    }

    @Override // defpackage.asxe
    public final void aW() {
        if (this.y) {
            aT();
            AtomicReference atomicReference = this.x;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(true != a ? 56 : 104);
            } else {
                bS(14, (ArrayList) atomicReference.get());
            }
            this.y = false;
        }
    }

    @Override // defpackage.asxe
    public final void aX() {
        if (this.w) {
            aT();
            AtomicReference atomicReference = this.v;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(true != a ? 52 : 96);
            } else {
                bS(13, (ArrayList) atomicReference.get());
            }
            this.w = false;
        }
    }

    @Override // defpackage.asxe
    public final void aY() {
        if (this.p) {
            aT();
            AtomicReference atomicReference = this.o;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(true != a ? 28 : 56);
            } else {
                bS(6, (ArrayList) atomicReference.get());
            }
            this.p = false;
        }
    }

    public final void aZ(String str) {
        str.getClass();
        aT();
        mfc mfcVar = k;
        bN(mfcVar);
        bT(mfcVar.b, str);
        this.l = null;
    }

    public final asxe ba() {
        if (this.d) {
            bG();
        } else {
            this.d = true;
        }
        asxe asxeVar = new asxe(this.b);
        AtomicReference atomicReference = this.m;
        if (atomicReference.get() != null) {
            asxeVar.m.set((ArrayList) atomicReference.get());
            asxeVar.n = this.n;
            this.e = true;
        }
        AtomicReference atomicReference2 = this.o;
        if (atomicReference2.get() != null) {
            asxeVar.o.set((ArrayList) atomicReference2.get());
            asxeVar.p = this.p;
            this.f = true;
        }
        AtomicReference atomicReference3 = this.q;
        if (atomicReference3.get() != null) {
            asxeVar.q.set((ArrayList) atomicReference3.get());
            asxeVar.r = this.r;
            this.g = true;
        }
        AtomicReference atomicReference4 = this.s;
        if (atomicReference4.get() != null) {
            asxeVar.s.set((ArrayList) atomicReference4.get());
            asxeVar.t = this.t;
            this.h = true;
        }
        AtomicReference atomicReference5 = this.v;
        if (atomicReference5.get() != null) {
            asxeVar.v.set((ArrayList) atomicReference5.get());
            asxeVar.w = this.w;
            this.i = true;
        }
        AtomicReference atomicReference6 = this.x;
        if (atomicReference6.get() != null) {
            asxeVar.x.set((ArrayList) atomicReference6.get());
            asxeVar.y = this.y;
            this.j = true;
        }
        if (this.z != null) {
            asxeVar.z = this.z;
            asxeVar.u = this.u;
        }
        asxeVar.bJ();
        return asxeVar;
    }

    public final void bb(aszd aszdVar) {
        aszdVar.getClass();
        if (this.f) {
            AtomicReference atomicReference = this.o;
            atomicReference.set(new ArrayList((Collection) atomicReference.get()));
            this.f = false;
        } else {
            bo();
        }
        ((ArrayList) this.o.get()).add(aszdVar);
        this.p = true;
    }

    public asxb(UpbMessage upbMessage) {
        super(upbMessage);
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
    }
}
