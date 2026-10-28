package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nop extends mew implements nfc {
    volatile noi d;
    volatile nok e;
    volatile nok f;

    public nop() {
        super(noo.a);
    }

    @Override // defpackage.nfc
    public final float g() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + (true != a ? 24L : 20L), false));
    }

    @Override // defpackage.nfc
    public final float h() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + (true != a ? 20L : 16L), false));
    }

    @Override // defpackage.nfc
    public final /* synthetic */ Cnew i() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        noi noiVar = new noi(cp(true != a ? 16 : 24, noh.a));
        this.d = noiVar;
        return noiVar;
    }

    @Override // defpackage.nfc
    public final /* synthetic */ ney j() {
        if (this.f != null) {
            return this.f;
        }
        if ((Memory.peekByte(this.c + 8) & 128) == 0) {
            return null;
        }
        nok nokVar = new nok(cp(true != a ? 32 : 40, noj.a));
        this.f = nokVar;
        return nokVar;
    }

    @Override // defpackage.nfc
    public final /* synthetic */ ney k() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 64) == 0) {
            return null;
        }
        nok nokVar = new nok(cp(true != a ? 28 : 32, noj.a));
        this.e = nokVar;
        return nokVar;
    }

    @Override // defpackage.nfc
    public final nfe l() {
        nfe nfeVarA = nfe.a(Memory.peekInt(this.c + 12, false));
        return nfeVarA == null ? nfe.a : nfeVarA;
    }

    @Override // defpackage.nfc
    public final boolean m() {
        return Memory.peekByte(this.c + 10) != 0;
    }

    @Override // defpackage.nfc
    public final boolean n() {
        return Memory.peekByte(this.c + 9) != 0;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
