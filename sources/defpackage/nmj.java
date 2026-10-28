package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nmj extends mew implements ncw {
    volatile mew d;
    volatile mew e;
    volatile mew f;
    volatile mew g;
    volatile mew h;

    public nmj() {
        super(nmi.a);
    }

    @Override // defpackage.ncw
    public final int g() {
        return Memory.peekInt(this.c + (true != a ? 20L : 12L), false);
    }

    @Override // defpackage.ncw
    public final /* synthetic */ mzg h() {
        if (this.g != null) {
            return this.g;
        }
        if ((Memory.peekByte(this.c + 8) & 16) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 28 : 40, nij.a));
        this.g = mewVar;
        return mewVar;
    }

    @Override // defpackage.ncw
    public final /* synthetic */ mzg i() {
        if (this.h != null) {
            return this.h;
        }
        if ((Memory.peekByte(this.c + 8) & 32) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true == a ? 48 : 32, nij.a));
        this.h = mewVar;
        return mewVar;
    }

    @Override // defpackage.ncw
    public final /* synthetic */ mzg j() {
        if (this.f != null) {
            return this.f;
        }
        if ((Memory.peekByte(this.c + 8) & 8) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 24 : 32, nij.a));
        this.f = mewVar;
        return mewVar;
    }

    @Override // defpackage.ncw
    public final /* synthetic */ ncy k() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 12 : 16, nmk.a));
        this.d = mewVar;
        return mewVar;
    }

    @Override // defpackage.ncw
    public final /* synthetic */ ncy l() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 16 : 24, nmk.a));
        this.e = mewVar;
        return mewVar;
    }

    @Override // defpackage.ncw
    public final boolean m() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    @Override // defpackage.ncw
    public final boolean n() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.ncw
    public final boolean o() {
        return (this.g == null && (Memory.peekByte(this.c + 8) & 16) == 0) ? false : true;
    }

    @Override // defpackage.ncw
    public final boolean p() {
        return (this.h == null && (Memory.peekByte(this.c + 8) & 32) == 0) ? false : true;
    }

    @Override // defpackage.ncw
    public final boolean q() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 8) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
