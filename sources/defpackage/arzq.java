package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class arzq extends mew implements mes {
    static final mfc e = arzp.a.d(3);
    public volatile aszv f;
    volatile String g;
    public volatile arzk h;

    public arzq() {
        super(arzp.a);
    }

    public final String aR() {
        if (this.g == null) {
            this.g = (Memory.peekByte(this.c + 8) & 4) != 0 ? cq(e.b) : "";
        }
        return this.g;
    }

    public final boolean aS() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    public final boolean aT() {
        return (this.h == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
