package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ngd extends mew implements mxb {
    volatile nkl d;

    public ngd() {
        super(ngc.a);
    }

    @Override // defpackage.mxb
    public final int g() {
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.mxb
    public final int h() {
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.mxb
    public final /* synthetic */ nay i() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 4) == 0) {
            return null;
        }
        nkl nklVar = new nkl(cp(true != a ? 20 : 24, nkk.a));
        this.d = nklVar;
        return nklVar;
    }

    @Override // defpackage.mxb
    public final boolean j() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    @Override // defpackage.mxb
    public final int k() {
        int iAV = a.aV(Memory.peekInt(this.c + (true != a ? 24L : 20L), false));
        if (iAV != 0) {
            return iAV;
        }
        return 1;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
