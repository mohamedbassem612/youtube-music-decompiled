package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmd extends mew implements ncq {
    volatile nlx d;
    volatile nlx e;
    volatile nlx f;
    volatile mew g;
    volatile mew h;
    volatile mew i;
    volatile mew j;

    public nmd() {
        super(nmc.a);
    }

    @Override // defpackage.ncq
    public final /* synthetic */ mzg g() {
        if (this.i != null) {
            return this.i;
        }
        if ((Memory.peekByte(this.c + 8) & 128) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 40 : 64, nij.a));
        this.i = mewVar;
        return mewVar;
    }

    @Override // defpackage.ncq
    public final /* synthetic */ mzg h() {
        if (this.j != null) {
            return this.j;
        }
        if ((Memory.peekByte(this.c + 9) & 1) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 44 : 72, nij.a));
        this.j = mewVar;
        return mewVar;
    }

    @Override // defpackage.ncq
    public final /* synthetic */ mzg i() {
        if (this.h != null) {
            return this.h;
        }
        if ((Memory.peekByte(this.c + 8) & 64) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 36 : 56, nij.a));
        this.h = mewVar;
        return mewVar;
    }

    @Override // defpackage.ncq
    public final /* synthetic */ mzg j() {
        if (this.g != null) {
            return this.g;
        }
        if ((Memory.peekByte(this.c + 8) & 32) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true == a ? 48 : 32, nij.a));
        this.g = mewVar;
        return mewVar;
    }

    @Override // defpackage.ncq
    public final /* synthetic */ nci k() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        nlx nlxVar = new nlx(cp(true != a ? 16 : 32, nlw.a));
        this.e = nlxVar;
        return nlxVar;
    }

    @Override // defpackage.ncq
    public final /* synthetic */ nci l() {
        if (this.f != null) {
            return this.f;
        }
        if ((Memory.peekByte(this.c + 8) & 4) == 0) {
            return null;
        }
        nlx nlxVar = new nlx(cp(true != a ? 20 : 40, nlw.a));
        this.f = nlxVar;
        return nlxVar;
    }

    @Override // defpackage.ncq
    public final /* synthetic */ nci m() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        nlx nlxVar = new nlx(cp(true != a ? 12 : 24, nlw.a));
        this.d = nlxVar;
        return nlxVar;
    }

    @Override // defpackage.ncq
    public final boolean n() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.ncq
    public final boolean o() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    @Override // defpackage.ncq
    public final boolean p() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    @Override // defpackage.ncq
    public final boolean q() {
        return (this.i == null && (Memory.peekByte(this.c + 8) & 128) == 0) ? false : true;
    }

    @Override // defpackage.ncq
    public final boolean r() {
        return (this.j == null && (Memory.peekByte(this.c + 9) & 1) == 0) ? false : true;
    }

    @Override // defpackage.ncq
    public final boolean s() {
        return (this.h == null && (Memory.peekByte(this.c + 8) & 64) == 0) ? false : true;
    }

    @Override // defpackage.ncq
    public final boolean t() {
        return (this.g == null && (Memory.peekByte(this.c + 8) & 32) == 0) ? false : true;
    }

    @Override // defpackage.ncq
    public final int u() {
        int iAS = a.aS(Memory.peekInt(this.c + (true != a ? 28L : 16L), false));
        if (iAS != 0) {
            return iAS;
        }
        return 1;
    }

    @Override // defpackage.ncq
    public final int v() {
        int iAS = a.aS(Memory.peekInt(this.c + (true != a ? 24L : 12L), false));
        if (iAS != 0) {
            return iAS;
        }
        return 1;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
