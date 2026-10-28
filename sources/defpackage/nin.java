package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nin extends mew implements mzi {
    volatile nil d;

    @Override // defpackage.mzi
    public final /* synthetic */ mzh g() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        nil nilVar = new nil(cp(true != a ? 12 : 16, nik.a));
        this.d = nilVar;
        return nilVar;
    }

    @Override // defpackage.mzi
    public final boolean h() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
