package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nhd extends mew implements mxx {
    volatile mew d;

    public nhd() {
        super(nhc.a);
    }

    @Override // defpackage.mxx
    public final int g() {
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.mxx
    public final int h() {
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.mxx
    public final /* synthetic */ mxu i() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 4) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 20 : 24, ngz.a));
        this.d = mewVar;
        return mewVar;
    }

    @Override // defpackage.mxx
    public final boolean j() {
        return (Memory.peekByte(this.c + 8) & 2) != 0;
    }

    @Override // defpackage.mxx
    public final boolean k() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
