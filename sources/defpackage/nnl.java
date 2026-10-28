package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nnl extends mew implements ndy {
    volatile mew d;

    @Override // defpackage.ndy
    public final float g() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.ndy
    public final float h() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + (true != a ? 28L : 24L), false));
    }

    @Override // defpackage.ndy
    public final int i() {
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.ndy
    public final /* synthetic */ nea j() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 8) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 24 : 32, nnm.a));
        this.d = mewVar;
        return mewVar;
    }

    @Override // defpackage.ndy
    public final boolean k() {
        return Memory.peekByte(this.c + 9) != 0;
    }

    @Override // defpackage.ndy
    public final boolean l() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 8) == 0) ? false : true;
    }

    @Override // defpackage.ndy
    public final int m() {
        int iAV = a.aV(Memory.peekInt(this.c + 20, false));
        if (iAV == 0) {
            return 1;
        }
        return iAV;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
