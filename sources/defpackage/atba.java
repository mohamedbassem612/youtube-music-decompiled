package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atba extends mew implements mes {
    public volatile atkv d;
    volatile atfc e;
    public volatile atla f;
    public volatile mew g;

    public atba() {
        super(ataz.a);
    }

    public final boolean aR() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    public final boolean aS() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 8) == 0) ? false : true;
    }

    public final atfc aT() {
        if (this.e == null && (Memory.peekByte(this.c + 8) & 4) != 0) {
            this.e = new atfc(cp(true != a ? 20 : 32, atfb.a));
        }
        return this.e == null ? atfa.a : this.e;
    }

    public final mew aU() {
        if (this.g == null && (Memory.peekByte(this.c + 8) & 1) != 0) {
            this.g = new mew(cp(true != a ? 12 : 16, ateq.a));
        }
        return this.g == null ? atep.a : this.g;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
