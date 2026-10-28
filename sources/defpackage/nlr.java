package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlr extends mew implements nce {
    static final mfc d = nlq.a.d(1);
    public static final /* synthetic */ int f = 0;
    volatile String e;

    static {
        nlq.a.d(6);
    }

    public nlr() {
        super(nlq.a);
    }

    @Override // defpackage.nce
    public final String g() {
        if (this.e == null && (Memory.peekByte(this.c + 8) & 1) != 0) {
            this.e = cq(d.b);
        }
        return this.e;
    }

    @Override // defpackage.nce
    public final boolean h() {
        return (Memory.peekByte(this.c + 8) & 1) != 0;
    }
}
