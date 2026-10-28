package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nll extends mew implements nby {
    public nll() {
        super(nlk.a);
    }

    @Override // defpackage.nby
    public final float g() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 24, false));
    }

    @Override // defpackage.nby
    public final float h() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 40, false));
    }

    @Override // defpackage.nby
    public final float i() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 28, false));
    }

    @Override // defpackage.nby
    public final float j() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 32, false));
    }

    @Override // defpackage.nby
    public final float k() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 36, false));
    }

    @Override // defpackage.nby
    public final int l() {
        return Memory.peekInt(this.c + 20, false);
    }

    @Override // defpackage.nby
    public final int m() {
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.nby
    public final int n() {
        return Memory.peekInt(this.c + 12, false);
    }
}
