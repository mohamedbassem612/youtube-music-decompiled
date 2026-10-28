package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class niv extends mew implements mzq {
    public static final /* synthetic */ int g = 0;
    volatile mew d;
    volatile mew e;
    volatile mew f;

    static {
        niu.a.d(1);
        niu.a.d(7);
    }

    public niv() {
        super(niu.a);
    }

    @Override // defpackage.mzq
    public final boolean a() {
        return Memory.peekByte(this.c + 9) != 0;
    }

    @Override // defpackage.mzq
    public final boolean b() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 16) == 0) ? false : true;
    }

    @Override // defpackage.mzq
    public final boolean c() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.mzq
    public final boolean g() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 128) == 0) ? false : true;
    }

    @Override // defpackage.mzq
    public final /* synthetic */ mew h() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 16) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 24 : 72, nnx.a));
        this.e = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzq
    public final /* synthetic */ mew i() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 12 : 48, nny.a));
        this.d = mewVar;
        return mewVar;
    }

    @Override // defpackage.mzq
    public final /* synthetic */ mew j() {
        if (this.f != null) {
            return this.f;
        }
        if ((Memory.peekByte(this.c + 8) & 128) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 28 : 80, noq.a));
        this.f = mewVar;
        return mewVar;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
