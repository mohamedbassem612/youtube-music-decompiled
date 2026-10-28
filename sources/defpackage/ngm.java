package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ngm extends mew implements mxf {
    volatile mew d;

    public ngm() {
        super(ngl.a);
    }

    @Override // defpackage.mxf
    public final /* synthetic */ myb g() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 12 : 16, nhh.a));
        this.d = mewVar;
        return mewVar;
    }

    @Override // defpackage.mxf
    public final boolean h() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
