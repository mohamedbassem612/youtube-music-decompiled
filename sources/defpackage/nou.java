package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nou extends mew implements nfi {
    static final mfc d = not.a.d(1);
    public static final /* synthetic */ int f = 0;
    volatile String e;

    public nou() {
        super(not.a);
    }

    @Override // defpackage.nfi
    public final String a() {
        if (this.e == null && (Memory.peekByte(this.c + 8) & 1) != 0) {
            this.e = cq(d.b);
        }
        return this.e;
    }

    @Override // defpackage.nfi
    public final boolean b() {
        return (Memory.peekByte(this.c + 8) & 1) != 0;
    }
}
