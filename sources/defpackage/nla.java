package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nla extends mew implements nbn {
    volatile nka d;
    volatile nka e;

    @Override // defpackage.nbn
    public final /* synthetic */ nal g() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        nka nkaVar = new nka(cp(true != a ? 16 : 24, njz.a));
        this.e = nkaVar;
        return nkaVar;
    }

    @Override // defpackage.nbn
    public final /* synthetic */ nal h() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        nka nkaVar = new nka(cp(true != a ? 12 : 16, njz.a));
        this.d = nkaVar;
        return nkaVar;
    }

    @Override // defpackage.nbn
    public final boolean i() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.nbn
    public final boolean j() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
