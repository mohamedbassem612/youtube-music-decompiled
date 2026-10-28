package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nna extends mew implements ndr {
    volatile mew d;

    @Override // defpackage.ndr
    public final int g() {
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.ndr
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

    @Override // defpackage.ndr
    public final boolean i() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
