package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlu extends mew implements ncf {
    static final mfc d;
    volatile String e;

    static {
        nlt.a.d(1);
        d = nlt.a.d(2);
    }

    @Override // defpackage.ncf
    public final int g() {
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.ncf
    public final String h() {
        if (this.e == null && (Memory.peekByte(this.c + 8) & 2) != 0) {
            this.e = cq(d.b);
        }
        return this.e;
    }

    @Override // defpackage.ncf
    public final boolean i() {
        return (Memory.peekByte(this.c + 8) & 2) != 0;
    }
}
