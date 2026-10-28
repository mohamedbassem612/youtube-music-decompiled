package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ngi extends mew implements mxc {
    static final mfc e = ngg.a.d(1);
    volatile String f;
    final AtomicReference g;
    final AtomicReference h;
    final AtomicReference i;
    final AtomicReference j;
    final AtomicReference k;
    final AtomicReference l;
    volatile mew m;

    public ngi() {
        super(ngg.a);
        this.g = new AtomicReference();
        this.h = new AtomicReference();
        this.i = new AtomicReference();
        this.j = new AtomicReference();
        this.k = new AtomicReference();
        this.l = new AtomicReference();
    }

    @Override // defpackage.mxc
    public final boolean A() {
        return (this.m == null && (Memory.peekByte(this.c + 8) & 64) == 0) ? false : true;
    }

    @Override // defpackage.mxc
    public final boolean B() {
        return (Memory.peekByte(this.c + 8) & 2) != 0;
    }

    @Override // defpackage.mxc
    public final boolean C() {
        return (Memory.peekByte(this.c + 9) & 1) != 0;
    }

    @Override // defpackage.mxc
    public final boolean D() {
        return (Memory.peekByte(this.c + 8) & 32) != 0;
    }

    @Override // defpackage.mxc
    public final int E() {
        int iBb = a.bb(Memory.peekInt(this.c + 20, false));
        if (iBb == 0) {
            return 1;
        }
        return iBb;
    }

    @Override // defpackage.mxc
    public final int F() {
        int iAS = a.aS(Memory.peekInt(this.c + (true != a ? 60L : 28L), false));
        if (iAS != 0) {
            return iAS;
        }
        return 1;
    }

    @Override // defpackage.mxc
    public final int G() {
        int iBt = a.bt(Memory.peekInt(this.c + 16, false));
        if (iBt == 0) {
            return 1;
        }
        return iBt;
    }

    @Override // defpackage.mxc
    public final int H() {
        int iBt = a.bt(Memory.peekInt(this.c + (true != a ? 36L : 24L), false));
        if (iBt != 0) {
            return iBt;
        }
        return 1;
    }

    final void aT() {
        AtomicReference atomicReference = this.i;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 32 : 64, ngc.a, new ngh(1)));
        }
    }

    final void aU() {
        AtomicReference atomicReference = this.g;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 24 : 48, ngj.a, new ngh(3)));
        }
    }

    final void aV() {
        AtomicReference atomicReference = this.j;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 40 : 72, ngl.a, new ngh(5)));
        }
    }

    final void aW() {
        AtomicReference atomicReference = this.l;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 56 : 104, nha.a, new ngh(0)));
        }
    }

    final void aX() {
        AtomicReference atomicReference = this.k;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 52 : 96, nhc.a, new ngh(2)));
        }
    }

    final void aY() {
        AtomicReference atomicReference = this.h;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 28 : 56, nhf.a, new ngh(4)));
        }
    }

    @Override // defpackage.mxc
    public final float g() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.mxc
    public final int h() {
        aT();
        return ((ArrayList) this.i.get()).size();
    }

    @Override // defpackage.mxc
    public final int i() {
        aU();
        return ((ArrayList) this.g.get()).size();
    }

    @Override // defpackage.mxc
    public final int j() {
        aV();
        return ((ArrayList) this.j.get()).size();
    }

    @Override // defpackage.mxc
    public final int k() {
        aW();
        return ((ArrayList) this.l.get()).size();
    }

    @Override // defpackage.mxc
    public final int l() {
        aX();
        return ((ArrayList) this.k.get()).size();
    }

    @Override // defpackage.mxc
    public final int m() {
        aY();
        return ((ArrayList) this.h.get()).size();
    }

    @Override // defpackage.mxc
    public final /* bridge */ /* synthetic */ mxb n(int i) {
        aT();
        return (ngd) ((ArrayList) this.i.get()).get(i);
    }

    @Override // defpackage.mxc
    public final /* bridge */ /* synthetic */ mxe o(int i) {
        aU();
        return (ngk) ((ArrayList) this.g.get()).get(i);
    }

    @Override // defpackage.mxc
    public final /* bridge */ /* synthetic */ mxf p(int i) {
        aV();
        return (ngm) ((ArrayList) this.j.get()).get(i);
    }

    @Override // defpackage.mxc
    public final /* synthetic */ mxl q() {
        if (this.m != null) {
            return this.m;
        }
        if ((Memory.peekByte(this.c + 8) & 64) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 44 : 80, ngv.a));
        this.m = mewVar;
        return mewVar;
    }

    @Override // defpackage.mxc
    public final /* bridge */ /* synthetic */ mxv r(int i) {
        aW();
        return (nhb) ((ArrayList) this.l.get()).get(i);
    }

    @Override // defpackage.mxc
    public final /* bridge */ /* synthetic */ mxx s(int i) {
        aX();
        return (nhd) ((ArrayList) this.k.get()).get(i);
    }

    @Override // defpackage.mxc
    public final /* bridge */ /* synthetic */ mxy t(int i) {
        aY();
        return (nhg) ((ArrayList) this.h.get()).get(i);
    }

    @Override // defpackage.mxc
    public final String u() {
        if (this.f == null && (Memory.peekByte(this.c + 8) & 1) != 0) {
            this.f = cq(e.b);
        }
        return this.f;
    }

    @Override // defpackage.mxc
    public final boolean v() {
        return (Memory.peekByte(this.c + 8) & 16) == 0 || Memory.peekByte(this.c + 10) != 0;
    }

    @Override // defpackage.mxc
    public final boolean w() {
        return (Memory.peekByte(this.c + 8) & 4) != 0;
    }

    @Override // defpackage.mxc
    public final boolean x() {
        return (Memory.peekByte(this.c + 8) & 16) != 0;
    }

    @Override // defpackage.mxc
    public final boolean y() {
        return (Memory.peekByte(this.c + 8) & 1) != 0;
    }

    @Override // defpackage.mxc
    public final boolean z() {
        return (Memory.peekByte(this.c + 8) & 8) != 0;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }

    public ngi(UpbMessage upbMessage) {
        super(upbMessage);
        this.g = new AtomicReference();
        this.h = new AtomicReference();
        this.i = new AtomicReference();
        this.j = new AtomicReference();
        this.k = new AtomicReference();
        this.l = new AtomicReference();
    }
}
