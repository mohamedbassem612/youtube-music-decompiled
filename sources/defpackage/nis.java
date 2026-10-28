package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nis extends mew implements mzn {
    volatile mew d;
    volatile mew e;

    @Override // defpackage.mzn
    public final /* synthetic */ mzg g() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 12 : 16, nij.a));
        this.d = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzn
    public final /* synthetic */ mzg h() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 16 : 24, nij.a));
        this.e = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzn
    public final boolean i() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    @Override // defpackage.mzn
    public final boolean j() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.mzn
    public final int k() {
        int iAS = a.aS(Memory.peekInt(this.c + (true != a ? 20L : 12L), false));
        if (iAS != 0) {
            return iAS;
        }
        return 1;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
