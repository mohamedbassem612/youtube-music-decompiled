package defpackage;

import java.util.ArrayList;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nkf extends mew implements nar {
    static final mfc d = nke.a.d(19);
    public static final /* synthetic */ int m = 0;
    volatile ngf e;
    volatile ngf f;
    ArrayList g;
    volatile mew h;
    volatile mew i;
    volatile mew j;
    volatile mew k;
    volatile mew l;

    public nkf() {
        super(nke.a);
    }

    @Override // defpackage.nar
    public final boolean A() {
        return (this.h == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    @Override // defpackage.nar
    public final boolean B() {
        return (this.l == null && (Memory.peekByte(this.c + 10) & 2) == 0) ? false : true;
    }

    @Override // defpackage.nar
    public final boolean C() {
        return (this.k == null && (Memory.peekByte(this.c + 9) & 2) == 0) ? false : true;
    }

    @Override // defpackage.nar
    public final boolean D() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.nar
    public final boolean E() {
        return (Memory.peekByte(this.c + 9) & 128) != 0;
    }

    @Override // defpackage.nar
    public final boolean F() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    @Override // defpackage.nar
    public final int G() {
        int iAU = a.aU(Memory.peekInt(this.c + (true != a ? 36L : 16L), false));
        if (iAU != 0) {
            return iAU;
        }
        return 1;
    }

    @Override // defpackage.nar
    public final int H() {
        int iBc = a.bc(Memory.peekInt(this.c + (true != a ? 52L : 28L), false));
        if (iBc != 0) {
            return iBc;
        }
        return 1;
    }

    @Override // defpackage.nar
    public final int I() {
        int iBi = a.bi(Memory.peekInt(this.c + (true != a ? 44L : 24L), false));
        if (iBi != 0) {
            return iBi;
        }
        return 1;
    }

    @Override // defpackage.nar
    public final int J() {
        int iBt = a.bt(Memory.peekInt(this.c + (true != a ? 60L : 36L), false));
        if (iBt != 0) {
            return iBt;
        }
        return 1;
    }

    final void aR() {
        if (this.g == null) {
            this.g = bF(d.b);
        }
    }

    @Override // defpackage.nar
    public final int g() {
        return Memory.peekInt(this.c + (true != a ? 56L : 32L), false);
    }

    @Override // defpackage.nar
    public final int h() {
        return Memory.peekInt(this.c + (true != a ? 64L : 40L), false);
    }

    @Override // defpackage.nar
    public final int i() {
        return Memory.peekInt(this.c + (true != a ? 40L : 20L), false);
    }

    @Override // defpackage.nar
    public final int j() {
        aR();
        return this.g.size();
    }

    @Override // defpackage.nar
    public final /* bridge */ /* synthetic */ mxc k() {
        if (this.f != null) {
            return this.f;
        }
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        ngf ngfVar = new ngf(cp(true != a ? 20 : 56, ngg.a));
        this.f = ngfVar;
        return ngfVar;
    }

    @Override // defpackage.nar
    public final /* bridge */ /* synthetic */ mxc l() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        ngf ngfVar = new ngf(cp(true != a ? 16 : 48, ngg.a));
        this.e = ngfVar;
        return ngfVar;
    }

    @Override // defpackage.nar
    public final /* synthetic */ mzg m() {
        if (this.i != null) {
            return this.i;
        }
        if ((Memory.peekByte(this.c + 8) & 8) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 28 : 72, nij.a));
        this.i = mewVar;
        return mewVar;
    }

    @Override // defpackage.nar
    public final /* synthetic */ mzg n() {
        if (this.j != null) {
            return this.j;
        }
        if ((Memory.peekByte(this.c + 8) & 16) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 32 : 80, nij.a));
        this.j = mewVar;
        return mewVar;
    }

    @Override // defpackage.nar
    public final /* synthetic */ mzg o() {
        if (this.h != null) {
            return this.h;
        }
        if ((Memory.peekByte(this.c + 8) & 4) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 24 : 64, nij.a));
        this.h = mewVar;
        return mewVar;
    }

    @Override // defpackage.nar
    public final /* synthetic */ mzg p() {
        if (this.l != null) {
            return this.l;
        }
        if ((Memory.peekByte(this.c + 10) & 2) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 72 : 104, nij.a));
        this.l = mewVar;
        return mewVar;
    }

    @Override // defpackage.nar
    public final /* synthetic */ mzg q() {
        if (this.k != null) {
            return this.k;
        }
        if ((Memory.peekByte(this.c + 9) & 2) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 48 : 88, nij.a));
        this.k = mewVar;
        return mewVar;
    }

    @Override // defpackage.nar
    public final String r(int i) {
        aR();
        return (String) this.g.get(i);
    }

    @Override // defpackage.nar
    public final boolean s() {
        return Memory.peekByte(this.c + 14) != 0;
    }

    @Override // defpackage.nar
    public final boolean t() {
        return Memory.peekByte(this.c + 12) != 0;
    }

    @Override // defpackage.nar
    public final boolean u() {
        return Memory.peekByte(this.c + 11) != 0;
    }

    @Override // defpackage.nar
    public final boolean v() {
        return Memory.peekByte(this.c + 13) != 0;
    }

    @Override // defpackage.nar
    public final boolean w() {
        return (Memory.peekByte(this.c + 9) & 8) != 0;
    }

    @Override // defpackage.nar
    public final boolean x() {
        return (Memory.peekByte(this.c + 8) & 32) != 0;
    }

    @Override // defpackage.nar
    public final boolean y() {
        return (this.i == null && (Memory.peekByte(this.c + 8) & 8) == 0) ? false : true;
    }

    @Override // defpackage.nar
    public final boolean z() {
        return (this.j == null && (Memory.peekByte(this.c + 8) & 16) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
