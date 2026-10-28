package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nil extends mew implements mzh {
    static final mfc d = nik.a.d(1);
    volatile String e;

    @Override // defpackage.mzh
    public final String g() {
        if (this.e == null && (Memory.peekByte(this.c + 8) & 1) != 0) {
            this.e = cq(d.b);
        }
        return this.e;
    }

    @Override // defpackage.mzh
    public final boolean h() {
        return (Memory.peekByte(this.c + 8) & 1) != 0;
    }
}
