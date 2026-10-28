package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhx extends mew implements myq {
    static final mfc d = nhw.a.d(1);
    public static final /* synthetic */ int f = 0;
    volatile String e;

    static {
        nhw.a.d(2);
        nhw.a.d(3);
        nhw.a.d(4);
    }

    public nhx() {
        super(nhw.a);
    }

    @Override // defpackage.myq
    public final String g() {
        if (this.e == null && (Memory.peekByte(this.c + 8) & 1) != 0) {
            this.e = cq(d.b);
        }
        return this.e;
    }

    @Override // defpackage.myq
    public final boolean h() {
        return (Memory.peekByte(this.c + 8) & 1) != 0;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
