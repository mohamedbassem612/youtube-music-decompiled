package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nka extends mew implements nal {
    @Override // defpackage.mew, defpackage.mxl
    public final float co() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.nal
    public final boolean g() {
        return (Memory.peekByte(this.c + 8) & 2) != 0;
    }

    @Override // defpackage.nal
    public final boolean h() {
        return (Memory.peekByte(this.c + 8) & 1) != 0;
    }

    @Override // defpackage.nal
    public final int i() {
        int iAS = a.aS(Memory.peekInt(this.c + 16, false));
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }
}
