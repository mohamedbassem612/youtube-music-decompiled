package defpackage;

import app.rive.semantics.SemanticState;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmv extends mew implements ndn {
    volatile njy d;
    volatile nka e;
    volatile nka f;
    volatile nka g;
    volatile nka h;
    volatile nka i;
    volatile nka j;
    volatile njy k;
    volatile njy l;
    volatile nka m;
    volatile mew n;

    public nmv() {
        super(nmu.a);
    }

    @Override // defpackage.ndn
    public final boolean A() {
        return (this.j == null && (Memory.peekByte(this.c + 8) & 64) == 0) ? false : true;
    }

    @Override // defpackage.ndn
    public final boolean B() {
        return (this.i == null && (Memory.peekByte(this.c + 8) & 32) == 0) ? false : true;
    }

    @Override // defpackage.ndn
    public final boolean C() {
        return (this.h == null && (Memory.peekByte(this.c + 8) & 16) == 0) ? false : true;
    }

    @Override // defpackage.ndn
    public final boolean D() {
        return (this.g == null && (Memory.peekByte(this.c + 8) & 8) == 0) ? false : true;
    }

    @Override // defpackage.ndn
    public final boolean E() {
        return (this.l == null && (Memory.peekByte(this.c + 9) & 1) == 0) ? false : true;
    }

    @Override // defpackage.ndn
    public final boolean F() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    @Override // defpackage.ndn
    public final int G() {
        if ((Memory.peekByte(this.c + 10) & 16) != 0) {
            int iBg = a.bg(Memory.peekInt(this.c + (true != a ? 92L : 52L), false));
            if (iBg != 0) {
                return iBg;
            }
        }
        return a.bg(0);
    }

    @Override // defpackage.ndn
    public final int H() {
        int iBg = a.bg(Memory.peekInt(this.c + (true != a ? 56L : 20L), false));
        if (iBg != 0) {
            return iBg;
        }
        return 1;
    }

    @Override // defpackage.ndn
    public final int I() {
        int iBg = a.bg(Memory.peekInt(this.c + (true != a ? 72L : 32L), false));
        if (iBg != 0) {
            return iBg;
        }
        return 1;
    }

    @Override // defpackage.ndn
    public final int J() {
        int iBc = a.bc(Memory.peekInt(this.c + (true != a ? 48L : 12L), false));
        if (iBc != 0) {
            return iBc;
        }
        return 1;
    }

    @Override // defpackage.ndn
    public final int K() {
        int iAV = a.aV(Memory.peekInt(this.c + (true != a ? 88L : 48L), false));
        if (iAV != 0) {
            return iAV;
        }
        return 1;
    }

    @Override // defpackage.ndn
    public final int L() {
        int iAX = a.aX(Memory.peekInt(this.c + (true != a ? 52L : 16L), false));
        if (iAX != 0) {
            return iAX;
        }
        return 1;
    }

    @Override // defpackage.ndn
    public final int M() {
        int iAS = a.aS(Memory.peekInt(this.c + (true != a ? 76L : 36L), false));
        if (iAS != 0) {
            return iAS;
        }
        return 1;
    }

    @Override // defpackage.ndn
    public final int N() {
        int iBc = a.bc(Memory.peekInt(this.c + (true != a ? 84L : 44L), false));
        if (iBc != 0) {
            return iBc;
        }
        return 1;
    }

    @Override // defpackage.mew, defpackage.mxk
    public final boolean cm() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    @Override // defpackage.ndn
    public final float g() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + (true != a ? 80L : 40L), false));
    }

    @Override // defpackage.ndn
    public final float h() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + (true != a ? 60L : 24L), false));
    }

    @Override // defpackage.ndn
    public final float i() {
        if ((Memory.peekByte(this.c + 9) & 32) != 0) {
            return Float.intBitsToFloat(Memory.peekInt(this.c + (true != a ? 64L : 28L), false));
        }
        return 1.0f;
    }

    @Override // defpackage.ndn
    public final /* synthetic */ nak j() {
        if (this.k != null) {
            return this.k;
        }
        if ((Memory.peekByte(this.c + 8) & 128) == 0) {
            return null;
        }
        njy njyVar = new njy(cp(true != a ? 40 : 112, njx.a));
        this.k = njyVar;
        return njyVar;
    }

    @Override // defpackage.ndn
    public final /* synthetic */ nak k() {
        if (this.l != null) {
            return this.l;
        }
        if ((Memory.peekByte(this.c + 9) & 1) == 0) {
            return null;
        }
        njy njyVar = new njy(cp(true != a ? 44 : 120, njx.a));
        this.l = njyVar;
        return njyVar;
    }

    @Override // defpackage.ndn
    public final /* synthetic */ nak l() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        njy njyVar = new njy(cp(true != a ? 12 : 56, njx.a));
        this.d = njyVar;
        return njyVar;
    }

    @Override // defpackage.ndn
    public final /* synthetic */ nal m() {
        if (this.m != null) {
            return this.m;
        }
        if ((Memory.peekByte(this.c + 9) & 64) == 0) {
            return null;
        }
        nka nkaVar = new nka(cp(true != a ? 68 : SemanticState.Focused, njz.a));
        this.m = nkaVar;
        return nkaVar;
    }

    @Override // defpackage.ndn
    public final /* synthetic */ nal n() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        nka nkaVar = new nka(cp(true != a ? 16 : 64, njz.a));
        this.e = nkaVar;
        return nkaVar;
    }

    @Override // defpackage.ndn
    public final /* synthetic */ nal o() {
        if (this.j != null) {
            return this.j;
        }
        if ((Memory.peekByte(this.c + 8) & 64) == 0) {
            return null;
        }
        nka nkaVar = new nka(cp(true != a ? 36 : 104, njz.a));
        this.j = nkaVar;
        return nkaVar;
    }

    @Override // defpackage.ndn
    public final /* synthetic */ nal p() {
        if (this.i != null) {
            return this.i;
        }
        if ((Memory.peekByte(this.c + 8) & 32) == 0) {
            return null;
        }
        nka nkaVar = new nka(cp(true == a ? 96 : 32, njz.a));
        this.i = nkaVar;
        return nkaVar;
    }

    @Override // defpackage.ndn
    public final /* synthetic */ nal q() {
        if (this.h != null) {
            return this.h;
        }
        if ((Memory.peekByte(this.c + 8) & 16) == 0) {
            return null;
        }
        nka nkaVar = new nka(cp(true != a ? 28 : 88, njz.a));
        this.h = nkaVar;
        return nkaVar;
    }

    @Override // defpackage.ndn
    public final /* synthetic */ nal r() {
        if (this.g != null) {
            return this.g;
        }
        if ((Memory.peekByte(this.c + 8) & 8) == 0) {
            return null;
        }
        nka nkaVar = new nka(cp(true != a ? 24 : 80, njz.a));
        this.g = nkaVar;
        return nkaVar;
    }

    @Override // defpackage.ndn
    public final /* synthetic */ nal s() {
        if (this.f != null) {
            return this.f;
        }
        if ((Memory.peekByte(this.c + 8) & 4) == 0) {
            return null;
        }
        nka nkaVar = new nka(cp(true != a ? 20 : 72, njz.a));
        this.f = nkaVar;
        return nkaVar;
    }

    @Override // defpackage.ndn
    public final /* synthetic */ nbo t() {
        if (this.n != null) {
            return this.n;
        }
        if ((Memory.peekByte(this.c + 10) & 32) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 96 : 136, nlb.a));
        this.n = mewVar;
        return mewVar;
    }

    @Override // defpackage.ndn
    public final boolean u() {
        return (this.m == null && (Memory.peekByte(this.c + 9) & 64) == 0) ? false : true;
    }

    @Override // defpackage.ndn
    public final boolean v() {
        return (this.n == null && (Memory.peekByte(this.c + 10) & 32) == 0) ? false : true;
    }

    @Override // defpackage.ndn
    public final boolean w() {
        return (Memory.peekByte(this.c + 9) & 16) != 0;
    }

    @Override // defpackage.ndn
    public final boolean x() {
        return (Memory.peekByte(this.c + 9) & 32) != 0;
    }

    @Override // defpackage.ndn
    public final boolean y() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.ndn
    public final boolean z() {
        return (this.k == null && (Memory.peekByte(this.c + 8) & 128) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
