package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nhz extends mew implements myr {
    volatile nna d;
    volatile nkc e;
    volatile nni f;
    volatile mew g;
    volatile mew h;

    @Override // defpackage.myr
    public final /* synthetic */ nae g() {
        if (this.g != null) {
            return this.g;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 12 : 16, njr.a));
        this.g = mewVar;
        return mewVar;
    }

    @Override // defpackage.myr
    public final /* synthetic */ nan h() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 4) == 0) {
            return null;
        }
        nkc nkcVar = new nkc(cp(true != a ? 20 : 32, nkb.a));
        this.e = nkcVar;
        return nkcVar;
    }

    @Override // defpackage.myr
    public final /* synthetic */ nbm i() {
        if (this.h != null) {
            return this.h;
        }
        if ((Memory.peekByte(this.c + 8) & 16) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 28 : 48, nky.a));
        this.h = mewVar;
        return mewVar;
    }

    @Override // defpackage.myr
    public final /* synthetic */ ndr j() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        nna nnaVar = new nna(cp(true != a ? 16 : 24, nmz.a));
        this.d = nnaVar;
        return nnaVar;
    }

    @Override // defpackage.myr
    public final /* synthetic */ ndw k() {
        if (this.f != null) {
            return this.f;
        }
        if ((Memory.peekByte(this.c + 8) & 8) == 0) {
            return null;
        }
        nni nniVar = new nni(cp(true != a ? 24 : 40, nnh.a));
        this.f = nniVar;
        return nniVar;
    }

    @Override // defpackage.myr
    public final boolean l() {
        return (this.g == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    @Override // defpackage.myr
    public final boolean m() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    @Override // defpackage.myr
    public final boolean n() {
        return (this.h == null && (Memory.peekByte(this.c + 8) & 16) == 0) ? false : true;
    }

    @Override // defpackage.myr
    public final boolean o() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.myr
    public final boolean p() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 8) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
