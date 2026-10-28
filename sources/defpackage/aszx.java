package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aszx extends mew implements mes {
    volatile atad e;
    volatile atah f;
    public volatile atnd g;
    volatile aszr h;

    public aszx() {
        super(aszw.a);
    }

    public final boolean aR() {
        return (this.h == null && (Memory.peekByte(this.c + 8) & 64) == 0) ? false : true;
    }

    public final boolean aS() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 8) == 0) ? false : true;
    }

    public final boolean aT() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    public final aszr aU() {
        if (this.h == null && (Memory.peekByte(this.c + 8) & 64) != 0) {
            this.h = new aszr(cp(true != a ? 36 : 56, aszq.a));
        }
        return this.h == null ? aszp.a : this.h;
    }

    public final atad aV() {
        if (this.e == null && (Memory.peekByte(this.c + 8) & 4) != 0) {
            this.e = new atad(cp(true != a ? 20 : 32, atac.a));
        }
        return this.e == null ? atab.a : this.e;
    }

    public final atah aW() {
        if (this.f == null && (Memory.peekByte(this.c + 8) & 8) != 0) {
            this.f = new atah(cp(true != a ? 24 : 40, atag.a));
        }
        return this.f == null ? ataf.a : this.f;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
