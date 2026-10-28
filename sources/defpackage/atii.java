package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atii extends mew implements mes {
    static final mfc d;
    public static final /* synthetic */ int f = 0;
    volatile String e;

    static {
        atih.a.d(1);
        d = atih.a.d(2);
    }

    public atii() {
        super(atih.a);
    }

    public final String aR() {
        if (this.e == null) {
            this.e = (Memory.peekByte(this.c + 8) & 2) != 0 ? cq(d.b) : "";
        }
        return this.e;
    }
}
