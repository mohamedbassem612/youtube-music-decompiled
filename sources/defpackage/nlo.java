package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nlo extends mew implements ncb {
    public nlo() {
        super(nln.a);
    }

    @Override // defpackage.mew, defpackage.mxk
    public final float cf() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.ncb
    public final float g() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 16, false));
    }
}
