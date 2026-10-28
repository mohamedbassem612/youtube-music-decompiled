package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nnw extends mew implements nem {
    volatile mew d;
    volatile mew e;
    volatile mew f;

    public nnw() {
        super(nnv.a);
    }

    @Override // defpackage.nem
    public final float g() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 28, false));
    }

    @Override // defpackage.nem
    public final float h() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 24, false));
    }

    @Override // defpackage.nem
    public final float i() {
        if ((Memory.peekByte(this.c + 8) & 2) != 0) {
            return Float.intBitsToFloat(Memory.peekInt(this.c + 16, false));
        }
        return 1.0f;
    }

    @Override // defpackage.nem
    public final float j() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + (true != a ? 44L : 36L), false));
    }

    @Override // defpackage.nem
    public final float k() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + (true != a ? 40L : 32L), false));
    }

    @Override // defpackage.nem
    public final float l() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + (true != a ? 56L : 40L), false));
    }

    @Override // defpackage.nem
    public final float m() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + (true != a ? 60L : 44L), false));
    }

    @Override // defpackage.nem
    public final int n() {
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.nem
    public final int o() {
        return Memory.peekInt(this.c + 20, false);
    }

    @Override // defpackage.nem
    public final /* synthetic */ ndq p() {
        if (this.f != null) {
            return this.f;
        }
        if ((Memory.peekByte(this.c + 9) & 4) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 48 : 64, nmy.a));
        this.f = mewVar;
        return mewVar;
    }

    @Override // defpackage.nem
    public final /* synthetic */ nei q() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 128) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 36 : 56, nns.a));
        this.d = mewVar;
        return mewVar;
    }

    @Override // defpackage.nem
    public final /* synthetic */ nen r() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 32) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true == a ? 48 : 32, nnu.a));
        this.e = mewVar;
        return mewVar;
    }

    @Override // defpackage.nem
    public final boolean s() {
        return (Memory.peekByte(this.c + 8) & 64) == 0 || Memory.peekByte(this.c + 10) != 0;
    }

    @Override // defpackage.nem
    public final boolean t() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 128) == 0) ? false : true;
    }

    @Override // defpackage.nem
    public final boolean u() {
        return (Memory.peekByte(this.c + 8) & 64) != 0;
    }

    @Override // defpackage.nem
    public final boolean v() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 32) == 0) ? false : true;
    }

    @Override // defpackage.nem
    public final boolean w() {
        return (this.f == null && (Memory.peekByte(this.c + 9) & 4) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
