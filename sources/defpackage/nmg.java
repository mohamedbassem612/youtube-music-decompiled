package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nmg extends mew implements nct {
    volatile mew d;
    volatile mew e;
    volatile mew f;

    public nmg() {
        super(nmf.a);
    }

    @Override // defpackage.nct
    public final /* synthetic */ mzg g() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 16 : 24, nij.a));
        this.e = mewVar;
        return mewVar;
    }

    @Override // defpackage.nct
    public final /* synthetic */ mzg h() {
        if (this.f != null) {
            return this.f;
        }
        if ((Memory.peekByte(this.c + 8) & 4) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 20 : 32, nij.a));
        this.f = mewVar;
        return mewVar;
    }

    @Override // defpackage.nct
    public final /* synthetic */ ncy i() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 12 : 16, nmk.a));
        this.d = mewVar;
        return mewVar;
    }

    @Override // defpackage.nct
    public final boolean j() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.nct
    public final boolean k() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    @Override // defpackage.nct
    public final boolean l() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
