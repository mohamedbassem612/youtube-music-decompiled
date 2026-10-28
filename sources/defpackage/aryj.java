package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class aryj extends mew implements mes {
    public volatile mew e;
    volatile arzk f;

    static {
        aryi.a.d(1);
        aryi.a.d(6);
    }

    public aryj() {
        super(aryi.a);
    }

    public final boolean aR() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 8) == 0) ? false : true;
    }

    public final arzk aS() {
        if (this.f == null && (Memory.peekByte(this.c + 8) & 8) != 0) {
            this.f = new arzk(cp(true != a ? 28 : 64, artj.a), 1, null);
        }
        return this.f == null ? arti.a : this.f;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
