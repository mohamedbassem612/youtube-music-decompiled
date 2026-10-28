package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aind extends mew implements mes {
    static final mfc d = ainc.a.d(4);
    volatile String e;

    public final String aR() {
        if (this.e == null) {
            this.e = (Memory.peekByte(this.c + 8) & 8) != 0 ? cq(d.b) : "";
        }
        return this.e;
    }
}
