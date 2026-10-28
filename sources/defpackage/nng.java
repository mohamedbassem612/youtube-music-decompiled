package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nng extends mew implements ndv {
    volatile njq d;
    volatile mew e;

    public nng() {
        super(nnf.a);
    }

    @Override // defpackage.ndv
    public final boolean a() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    @Override // defpackage.ndv
    public final boolean b() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.ndv
    public final /* synthetic */ njq c() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        njq njqVar = new njq(cp(true != a ? 16 : 24, njp.a));
        this.d = njqVar;
        return njqVar;
    }

    @Override // defpackage.ndv
    public final /* synthetic */ mew g() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 12 : 16, nnd.a));
        this.e = mewVar;
        return mewVar;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
