package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nki extends mew implements nax {
    public static final /* synthetic */ int d = 0;

    static {
        nkh.a.d(2);
        nkh.a.d(4);
    }

    public nki() {
        super(nkh.a);
    }

    @Override // defpackage.nax
    public final boolean a() {
        return (Memory.peekByte(this.c + 8) & 1) != 0;
    }
}
