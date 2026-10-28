package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nle extends mew implements nbr {
    public nle() {
        super(nld.a);
    }

    @Override // defpackage.nbr
    public final float g() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.nbr
    public final float h() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 16, false));
    }
}
