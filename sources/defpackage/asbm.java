package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class asbm extends mew implements mes {
    volatile aryh e;

    public asbm() {
        super(asbl.a);
    }

    public final aryh aR() {
        if (this.e == null && (Memory.peekByte(this.c + 8) & 2) != 0) {
            this.e = new aryh(cp(true != a ? 12 : 16, aryi.a));
        }
        if (this.e != null) {
            return this.e;
        }
        int i = aryh.d;
        return aryg.a;
    }

    public final boolean aS() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
