package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nic extends mew implements myv {
    volatile mew d;
    volatile mew e;

    public nic() {
        super(nib.a);
    }

    @Override // defpackage.myv
    public final /* synthetic */ mzg g() {
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

    @Override // defpackage.myv
    public final /* synthetic */ mzg h() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(16, nij.a));
        this.d = mewVar;
        return mewVar;
    }

    @Override // defpackage.myv
    public final boolean i() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    @Override // defpackage.myv
    public final boolean j() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.myv
    public final int k() {
        int iAS = a.aS(Memory.peekInt(this.c + 12, false));
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
