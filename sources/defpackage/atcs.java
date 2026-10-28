package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atcs extends mew implements mes {
    public volatile atcp d;

    public atcs() {
        super(atcr.a);
    }

    public final atcp aR() {
        if (this.d == null && (Memory.peekByte(this.c + 8) & 1) != 0) {
            this.d = new atcp(cp(true != a ? 12 : 16, atco.a));
        }
        if (this.d != null) {
            return this.d;
        }
        mfc mfcVar = atcp.d;
        return atcn.a;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
