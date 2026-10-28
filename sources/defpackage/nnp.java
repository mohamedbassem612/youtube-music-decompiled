package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nnp extends mew implements nee {
    volatile nnr d;
    volatile nnl e;
    volatile nla f;
    volatile mew g;
    volatile mew h;
    volatile mew i;
    volatile mew j;

    public nnp() {
        super(nno.a);
    }

    @Override // defpackage.nee
    public final /* synthetic */ mzg g() {
        if (this.h != null) {
            return this.h;
        }
        if ((Memory.peekByte(this.c + 8) & 32) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 24 : 40, nij.a));
        this.h = mewVar;
        return mewVar;
    }

    @Override // defpackage.nee
    public final /* synthetic */ mzg h() {
        if (this.i != null) {
            return this.i;
        }
        if ((Memory.peekByte(this.c + 8) & 64) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 28 : 48, nij.a));
        this.i = mewVar;
        return mewVar;
    }

    @Override // defpackage.nee
    public final /* synthetic */ mzg i() {
        if (this.j != null) {
            return this.j;
        }
        if ((Memory.peekByte(this.c + 8) & 128) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 32 : 56, nij.a));
        this.j = mewVar;
        return mewVar;
    }

    @Override // defpackage.nee
    public final /* synthetic */ nbn j() {
        if (this.f != null) {
            return this.f;
        }
        if ((Memory.peekByte(this.c + 9) & 4) == 0) {
            return null;
        }
        nla nlaVar = new nla(cp(true != a ? 44 : 72, nkz.a));
        this.f = nlaVar;
        return nlaVar;
    }

    @Override // defpackage.nee
    public final /* synthetic */ ndq k() {
        if (this.g != null) {
            return this.g;
        }
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 16 : 24, nmy.a));
        this.g = mewVar;
        return mewVar;
    }

    @Override // defpackage.nee
    public final /* synthetic */ ndy l() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 9) & 2) == 0) {
            return null;
        }
        nnl nnlVar = new nnl(cp(true != a ? 40 : 64, nnk.a));
        this.e = nnlVar;
        return nnlVar;
    }

    @Override // defpackage.nee
    public final /* synthetic */ neh m() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 4) == 0) {
            return null;
        }
        nnr nnrVar = new nnr(cp(true != a ? 20 : 32, nnq.a));
        this.d = nnrVar;
        return nnrVar;
    }

    @Override // defpackage.nee
    public final boolean n() {
        return Memory.peekByte(this.c + 10) != 0;
    }

    @Override // defpackage.nee
    public final boolean o() {
        return Memory.peekByte(this.c + 11) != 0;
    }

    @Override // defpackage.nee
    public final boolean p() {
        return (this.g == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.nee
    public final boolean q() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    @Override // defpackage.nee
    public final boolean r() {
        return (this.f == null && (Memory.peekByte(this.c + 9) & 4) == 0) ? false : true;
    }

    @Override // defpackage.nee
    public final boolean s() {
        return (this.e == null && (Memory.peekByte(this.c + 9) & 2) == 0) ? false : true;
    }

    @Override // defpackage.nee
    public final boolean t() {
        return (this.h == null && (Memory.peekByte(this.c + 8) & 32) == 0) ? false : true;
    }

    @Override // defpackage.nee
    public final boolean u() {
        return (this.i == null && (Memory.peekByte(this.c + 8) & 64) == 0) ? false : true;
    }

    @Override // defpackage.nee
    public final boolean v() {
        return (this.j == null && (Memory.peekByte(this.c + 8) & 128) == 0) ? false : true;
    }

    @Override // defpackage.nee
    public final int w() {
        int iAS = a.aS(Memory.peekInt(this.c + 12, false));
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }

    @Override // defpackage.nee
    public final int x() {
        int iAV = a.aV(Memory.peekInt(this.c + (true != a ? 36L : 16L), false));
        if (iAV != 0) {
            return iAV;
        }
        return 1;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
