package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nob extends mew implements ner {
    volatile ngf d;
    volatile ngf e;

    public nob() {
        super(noa.a);
    }

    public static nob aR(byte[] bArr) {
        nob nobVar = new nob();
        nobVar.bH(bArr);
        return nobVar;
    }

    @Override // defpackage.ner
    public final int g() {
        return Memory.peekInt(this.c + (true != a ? 28L : 16L), false);
    }

    @Override // defpackage.ner
    public final int h() {
        return Memory.peekInt(this.c + (true != a ? 16L : 12L), false);
    }

    @Override // defpackage.ner
    public final /* bridge */ /* synthetic */ mxc i() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        ngf ngfVar = new ngf(cp(true != a ? 12 : 24, ngg.a));
        this.d = ngfVar;
        return ngfVar;
    }

    @Override // defpackage.ner
    public final /* bridge */ /* synthetic */ mxc j() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 4) == 0) {
            return null;
        }
        ngf ngfVar = new ngf(cp(true != a ? 20 : 32, ngg.a));
        this.e = ngfVar;
        return ngfVar;
    }

    @Override // defpackage.ner
    public final boolean k() {
        return Memory.peekByte(this.c + 10) != 0;
    }

    @Override // defpackage.ner
    public final boolean l() {
        return (Memory.peekByte(this.c + 8) & 2) != 0;
    }

    @Override // defpackage.ner
    public final boolean m() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    @Override // defpackage.ner
    public final boolean n() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
