package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nhb extends mew implements mxv {
    static final mfc d = nha.a.d(3);
    volatile String e;

    public nhb() {
        super(nha.a);
    }

    @Override // defpackage.mxv
    public final int g() {
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.mxv
    public final int h() {
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.mxv
    public final String i() {
        if (this.e == null && (Memory.peekByte(this.c + 8) & 4) != 0) {
            this.e = cq(d.b);
        }
        return this.e;
    }

    @Override // defpackage.mxv
    public final boolean j() {
        return (Memory.peekByte(this.c + 8) & 4) != 0;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
