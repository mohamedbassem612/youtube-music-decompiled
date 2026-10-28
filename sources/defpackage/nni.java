package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nni extends mew implements ndw {
    volatile mew d;

    @Override // defpackage.ndw
    public final /* synthetic */ mzg g() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 12 : 16, nij.a));
        this.d = mewVar;
        return mewVar;
    }

    @Override // defpackage.ndw
    public final boolean h() {
        return Memory.peekByte(this.c + 9) != 0;
    }

    @Override // defpackage.ndw
    public final boolean i() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
