package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ngk extends mew implements mxe {
    volatile nin d;
    volatile mew e;
    volatile mew f;

    public ngk() {
        super(ngj.a);
    }

    @Override // defpackage.mxe
    public final int g() {
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.mxe
    public final int h() {
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.mxe
    public final /* synthetic */ mzg i() {
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

    @Override // defpackage.mxe
    public final /* synthetic */ mzg j() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 4) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 20 : 24, nij.a));
        this.e = mewVar;
        return mewVar;
    }

    @Override // defpackage.mxe
    public final /* synthetic */ mzi k() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 16) == 0) {
            return null;
        }
        nin ninVar = new nin(cp(true != a ? 28 : 40, nim.a));
        this.d = ninVar;
        return ninVar;
    }

    @Override // defpackage.mxe
    public final boolean l() {
        return (Memory.peekByte(this.c + 8) & 2) != 0;
    }

    @Override // defpackage.mxe
    public final boolean m() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 8) == 0) ? false : true;
    }

    @Override // defpackage.mxe
    public final boolean n() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    @Override // defpackage.mxe
    public final boolean o() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 16) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
