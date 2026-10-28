package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class njh extends mew implements mzx {
    volatile njc d;

    public njh() {
        super(njg.a);
    }

    @Override // defpackage.mzx
    public final /* synthetic */ mzu a() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        njc njcVar = new njc(cp(true != a ? 12 : 16, njb.a));
        this.d = njcVar;
        return njcVar;
    }

    @Override // defpackage.mzx
    public final boolean b() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
