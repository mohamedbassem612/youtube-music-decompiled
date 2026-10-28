package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class nku extends mew implements nbi {
    volatile ngf d;
    volatile ngf e;
    volatile ngf f;
    volatile ngf g;
    volatile ngf h;
    volatile njy i;
    volatile njy j;
    volatile mew k;
    volatile mew l;

    public nku() {
        super(nkt.a);
    }

    @Override // defpackage.nbi
    public final int A() {
        int iAV = a.aV(Memory.peekInt(this.c + (true != a ? 44L : 24L), false));
        if (iAV != 0) {
            return iAV;
        }
        return 1;
    }

    @Override // defpackage.nbi
    public final int g() {
        return Memory.peekInt(this.c + (true != a ? 20L : 16L), false);
    }

    @Override // defpackage.nbi
    public final /* bridge */ /* synthetic */ mxc h() {
        if (this.f != null) {
            return this.f;
        }
        if ((Memory.peekByte(this.c + 8) & 8) == 0) {
            return null;
        }
        ngf ngfVar = new ngf(cp(true != a ? 28 : 48, ngg.a));
        this.f = ngfVar;
        return ngfVar;
    }

    @Override // defpackage.nbi
    public final /* bridge */ /* synthetic */ mxc i() {
        if (this.h != null) {
            return this.h;
        }
        if ((Memory.peekByte(this.c + 8) & 64) == 0) {
            return null;
        }
        ngf ngfVar = new ngf(cp(true != a ? 36 : 64, ngg.a));
        this.h = ngfVar;
        return ngfVar;
    }

    @Override // defpackage.nbi
    public final /* bridge */ /* synthetic */ mxc j() {
        if (this.g != null) {
            return this.g;
        }
        if ((Memory.peekByte(this.c + 8) & 32) == 0) {
            return null;
        }
        ngf ngfVar = new ngf(cp(true == a ? 56 : 32, ngg.a));
        this.g = ngfVar;
        return ngfVar;
    }

    @Override // defpackage.nbi
    public final /* bridge */ /* synthetic */ mxc k() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        ngf ngfVar = new ngf(cp(true != a ? 16 : 32, ngg.a));
        this.d = ngfVar;
        return ngfVar;
    }

    @Override // defpackage.nbi
    public final /* bridge */ /* synthetic */ mxc l() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 4) == 0) {
            return null;
        }
        ngf ngfVar = new ngf(cp(true != a ? 24 : 40, ngg.a));
        this.e = ngfVar;
        return ngfVar;
    }

    @Override // defpackage.nbi
    public final /* synthetic */ mzg m() {
        if (this.l != null) {
            return this.l;
        }
        if ((Memory.peekByte(this.c + 9) & 32) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 60 : 96, nij.a));
        this.l = mewVar;
        return mewVar;
    }

    @Override // defpackage.nbi
    public final /* synthetic */ mzg n() {
        if (this.k != null) {
            return this.k;
        }
        if ((Memory.peekByte(this.c + 9) & 16) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 56 : 88, nij.a));
        this.k = mewVar;
        return mewVar;
    }

    @Override // defpackage.nbi
    public final /* synthetic */ nak o() {
        if (this.j != null) {
            return this.j;
        }
        if ((Memory.peekByte(this.c + 9) & 8) == 0) {
            return null;
        }
        njy njyVar = new njy(cp(true != a ? 52 : 80, njx.a));
        this.j = njyVar;
        return njyVar;
    }

    @Override // defpackage.nbi
    public final /* synthetic */ nak p() {
        if (this.i != null) {
            return this.i;
        }
        if ((Memory.peekByte(this.c + 9) & 4) == 0) {
            return null;
        }
        njy njyVar = new njy(cp(true != a ? 48 : 72, njx.a));
        this.i = njyVar;
        return njyVar;
    }

    @Override // defpackage.nbi
    public final boolean q() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 8) == 0) ? false : true;
    }

    @Override // defpackage.nbi
    public final boolean r() {
        return (this.h == null && (Memory.peekByte(this.c + 8) & 64) == 0) ? false : true;
    }

    @Override // defpackage.nbi
    public final boolean s() {
        return (this.g == null && (Memory.peekByte(this.c + 8) & 32) == 0) ? false : true;
    }

    @Override // defpackage.nbi
    public final boolean t() {
        return (Memory.peekByte(this.c + 8) & 128) != 0;
    }

    @Override // defpackage.nbi
    public final boolean u() {
        return (this.j == null && (Memory.peekByte(this.c + 9) & 8) == 0) ? false : true;
    }

    @Override // defpackage.nbi
    public final boolean v() {
        return (this.i == null && (Memory.peekByte(this.c + 9) & 4) == 0) ? false : true;
    }

    @Override // defpackage.nbi
    public final boolean w() {
        return (this.l == null && (Memory.peekByte(this.c + 9) & 32) == 0) ? false : true;
    }

    @Override // defpackage.nbi
    public final boolean x() {
        return (this.k == null && (Memory.peekByte(this.c + 9) & 16) == 0) ? false : true;
    }

    @Override // defpackage.nbi
    public final boolean y() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    @Override // defpackage.nbi
    public final boolean z() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
