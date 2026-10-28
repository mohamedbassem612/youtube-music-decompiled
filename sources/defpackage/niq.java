package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class niq extends mew implements mzl {
    volatile nis d;
    volatile njy e;
    volatile mew f;
    volatile mew g;
    volatile mew h;
    volatile mew i;
    volatile mew j;
    volatile mew k;
    volatile mew l;
    volatile mew m;
    volatile mew n;
    volatile mew o;
    volatile mew p;
    volatile mew q;
    volatile mew r;
    volatile mew s;
    volatile mew t;
    volatile mew u;
    volatile mew v;
    volatile mew w;

    public niq() {
        super(nip.a);
    }

    @Override // defpackage.mzl
    public final boolean A() {
        return (this.i == null && (Memory.peekByte(this.c + 10) & 64) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    public final boolean B() {
        return (this.g == null && (Memory.peekByte(this.c + 9) & 32) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    public final boolean C() {
        return (this.d == null && (Memory.peekByte(this.c + 10) & 32) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    @Deprecated
    public final boolean D() {
        return (this.p == null && (Memory.peekByte(this.c + 8) & 32) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    public final boolean E() {
        return (this.q == null && (Memory.peekByte(this.c + 8) & 8) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    public final boolean F() {
        return (this.v == null && (Memory.peekByte(this.c + 10) & 128) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    public final boolean G() {
        return (this.w == null && (Memory.peekByte(this.c + 11) & 1) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    public final boolean H() {
        return (this.h == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    public final boolean I() {
        return (this.k == null && (Memory.peekByte(this.c + 10) & 2) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    public final boolean J() {
        return (this.l == null && (Memory.peekByte(this.c + 10) & 8) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    public final boolean K() {
        return (this.m == null && (Memory.peekByte(this.c + 10) & 4) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    public final boolean L() {
        return (this.n == null && (Memory.peekByte(this.c + 10) & 16) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    public final boolean M() {
        return (this.j == null && (Memory.peekByte(this.c + 10) & 1) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    public final boolean N() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    public final boolean O() {
        return (this.r == null && (Memory.peekByte(this.c + 8) & 64) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    public final boolean P() {
        return (this.u == null && (Memory.peekByte(this.c + 9) & 1) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    public final boolean Q() {
        return (this.t == null && (Memory.peekByte(this.c + 8) & 128) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    public final boolean R() {
        return (this.s == null && (Memory.peekByte(this.c + 9) & 128) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    public final boolean S() {
        return (this.o == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    public final boolean T() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 16) == 0) ? false : true;
    }

    @Override // defpackage.mzl
    public final /* synthetic */ mzg g() {
        if (this.i != null) {
            return this.i;
        }
        if ((Memory.peekByte(this.c + 10) & 64) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 100 : 192, nij.a));
        this.i = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzl
    public final /* synthetic */ mzg h() {
        if (this.g != null) {
            return this.g;
        }
        if ((Memory.peekByte(this.c + 9) & 32) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 64 : 120, nij.a));
        this.g = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzl
    @Deprecated
    public final /* synthetic */ mzg i() {
        if (this.p != null) {
            return this.p;
        }
        if ((Memory.peekByte(this.c + 8) & 32) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true == a ? 56 : 32, nij.a));
        this.p = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzl
    public final /* synthetic */ mzg j() {
        if (this.q != null) {
            return this.q;
        }
        if ((Memory.peekByte(this.c + 8) & 8) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 24 : 40, nij.a));
        this.q = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzl
    public final /* synthetic */ mzg k() {
        if (this.v != null) {
            return this.v;
        }
        if ((Memory.peekByte(this.c + 10) & 128) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 104 : 200, nij.a));
        this.v = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzl
    public final /* synthetic */ mzg l() {
        if (this.w != null) {
            return this.w;
        }
        if ((Memory.peekByte(this.c + 11) & 1) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 108 : 208, nij.a));
        this.w = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzl
    public final /* synthetic */ mzg m() {
        if (this.h != null) {
            return this.h;
        }
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 16 : 24, nij.a));
        this.h = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzl
    public final /* synthetic */ mzg n() {
        if (this.k != null) {
            return this.k;
        }
        if ((Memory.peekByte(this.c + 10) & 2) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 80 : 152, nij.a));
        this.k = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzl
    public final /* synthetic */ mzg o() {
        if (this.l != null) {
            return this.l;
        }
        if ((Memory.peekByte(this.c + 10) & 8) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 88 : 168, nij.a));
        this.l = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzl
    public final /* synthetic */ mzg p() {
        if (this.m != null) {
            return this.m;
        }
        if ((Memory.peekByte(this.c + 10) & 4) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 84 : 160, nij.a));
        this.m = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzl
    public final /* synthetic */ mzg q() {
        if (this.n != null) {
            return this.n;
        }
        if ((Memory.peekByte(this.c + 10) & 16) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 92 : 176, nij.a));
        this.n = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzl
    public final /* synthetic */ mzg r() {
        if (this.j != null) {
            return this.j;
        }
        if ((Memory.peekByte(this.c + 10) & 1) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 76 : 144, nij.a));
        this.j = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzl
    public final /* synthetic */ mzg s() {
        if (this.f != null) {
            return this.f;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 12 : 16, nij.a));
        this.f = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzl
    public final /* synthetic */ mzg t() {
        if (this.r != null) {
            return this.r;
        }
        if ((Memory.peekByte(this.c + 8) & 64) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 36 : 64, nij.a));
        this.r = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzl
    public final /* synthetic */ mzg u() {
        if (this.u != null) {
            return this.u;
        }
        if ((Memory.peekByte(this.c + 9) & 1) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 44 : 80, nij.a));
        this.u = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzl
    public final /* synthetic */ mzg v() {
        if (this.t != null) {
            return this.t;
        }
        if ((Memory.peekByte(this.c + 8) & 128) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 40 : 72, nij.a));
        this.t = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzl
    public final /* synthetic */ mzg w() {
        if (this.s != null) {
            return this.s;
        }
        if ((Memory.peekByte(this.c + 9) & 128) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 72 : 136, nij.a));
        this.s = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzl
    public final /* synthetic */ mzg x() {
        if (this.o != null) {
            return this.o;
        }
        if ((Memory.peekByte(this.c + 8) & 4) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 20 : 32, nij.a));
        this.o = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzl
    public final /* synthetic */ mzn y() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 10) & 32) == 0) {
            return null;
        }
        nis nisVar = new nis(cp(true != a ? 96 : 184, nir.a));
        this.d = nisVar;
        return nisVar;
    }

    @Override // defpackage.mzl
    public final /* synthetic */ nak z() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 16) == 0) {
            return null;
        }
        njy njyVar = new njy(cp(true != a ? 28 : 48, njx.a));
        this.e = njyVar;
        return njyVar;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
