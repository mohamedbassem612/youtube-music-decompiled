package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nnr extends mew implements neh {
    @Override // defpackage.mew, defpackage.mxk
    public final float cf() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.mew, defpackage.mxk
    public final boolean cm() {
        return (Memory.peekByte(this.c + 8) & 1) != 0;
    }

    @Override // defpackage.neh
    public final float g() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 16, false));
    }

    @Override // defpackage.neh
    public final boolean h() {
        return (Memory.peekByte(this.c + 8) & 2) != 0;
    }
}
