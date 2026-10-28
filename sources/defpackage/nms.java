package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nms extends mew implements ndg {
    static final mfc d = nmr.a.d(3);
    public static final /* synthetic */ int l = 0;
    volatile String e;
    volatile mew f;
    volatile mew g;
    volatile mew h;
    volatile mew i;
    volatile mew j;
    volatile mew k;

    public nms() {
        super(nmr.a);
    }

    @Override // defpackage.ndg
    public final int g() {
        return Memory.peekInt(this.c + (true != a ? 36L : 12L), false);
    }

    @Override // defpackage.ndg
    public final /* synthetic */ mzg h() {
        if (this.j != null) {
            return this.j;
        }
        if ((Memory.peekByte(this.c + 9) & 1) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 40 : 80, nij.a));
        this.j = mewVar;
        return mewVar;
    }

    @Override // defpackage.ndg
    public final /* synthetic */ mzg i() {
        if (this.h != null) {
            return this.h;
        }
        if ((Memory.peekByte(this.c + 8) & 8) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 20 : 48, nij.a));
        this.h = mewVar;
        return mewVar;
    }

    @Override // defpackage.ndg
    public final /* synthetic */ mzg j() {
        if (this.i != null) {
            return this.i;
        }
        if ((Memory.peekByte(this.c + 8) & 16) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 24 : 56, nij.a));
        this.i = mewVar;
        return mewVar;
    }

    @Override // defpackage.ndg
    public final /* synthetic */ ncy k() {
        if (this.f != null) {
            return this.f;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 12 : 32, nmk.a));
        this.f = mewVar;
        return mewVar;
    }

    @Override // defpackage.ndg
    public final /* synthetic */ ncy l() {
        if (this.g != null) {
            return this.g;
        }
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 16 : 40, nmk.a));
        this.g = mewVar;
        return mewVar;
    }

    @Override // defpackage.ndg
    public final /* synthetic */ nda m() {
        if (this.k != null) {
            return this.k;
        }
        if ((Memory.peekByte(this.c + 8) & 64) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 32 : 72, nml.a));
        this.k = mewVar;
        return mewVar;
    }

    @Override // defpackage.ndg
    public final String n() {
        if (this.e == null && (Memory.peekByte(this.c + 8) & 4) != 0) {
            this.e = cq(d.b);
        }
        return this.e;
    }

    @Override // defpackage.ndg
    public final boolean o() {
        return (this.k == null && (Memory.peekByte(this.c + 8) & 64) == 0) ? false : true;
    }

    @Override // defpackage.ndg
    public final boolean p() {
        return (this.j == null && (Memory.peekByte(this.c + 9) & 1) == 0) ? false : true;
    }

    @Override // defpackage.ndg
    public final boolean q() {
        return (this.h == null && (Memory.peekByte(this.c + 8) & 8) == 0) ? false : true;
    }

    @Override // defpackage.ndg
    public final boolean r() {
        return (this.i == null && (Memory.peekByte(this.c + 8) & 16) == 0) ? false : true;
    }

    @Override // defpackage.ndg
    public final boolean s() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    @Override // defpackage.ndg
    public final boolean t() {
        return (this.g == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
