package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njy extends mew implements nak {
    volatile nka d;
    volatile nka e;
    volatile nka f;
    volatile nka g;
    volatile nka h;
    volatile nka i;
    volatile nka j;
    volatile nka k;
    volatile nka l;

    @Override // defpackage.mew, defpackage.nbo
    public final boolean ak() {
        return (this.l == null && (Memory.peekByte(this.c + 9) & 1) == 0) ? false : true;
    }

    @Override // defpackage.nak
    public final /* synthetic */ nal g() {
        if (this.l != null) {
            return this.l;
        }
        if ((Memory.peekByte(this.c + 9) & 1) == 0) {
            return null;
        }
        nka nkaVar = new nka(cp(true != a ? 44 : 80, njz.a));
        this.l = nkaVar;
        return nkaVar;
    }

    @Override // defpackage.nak
    public final /* synthetic */ nal h() {
        if (this.f != null) {
            return this.f;
        }
        if ((Memory.peekByte(this.c + 8) & 4) == 0) {
            return null;
        }
        nka nkaVar = new nka(cp(true != a ? 20 : 32, njz.a));
        this.f = nkaVar;
        return nkaVar;
    }

    @Override // defpackage.nak
    public final /* synthetic */ nal i() {
        if (this.i != null) {
            return this.i;
        }
        if ((Memory.peekByte(this.c + 8) & 32) == 0) {
            return null;
        }
        nka nkaVar = new nka(cp(true == a ? 56 : 32, njz.a));
        this.i = nkaVar;
        return nkaVar;
    }

    @Override // defpackage.nak
    public final /* synthetic */ nal j() {
        if (this.j != null) {
            return this.j;
        }
        if ((Memory.peekByte(this.c + 8) & 64) == 0) {
            return null;
        }
        nka nkaVar = new nka(cp(true != a ? 36 : 64, njz.a));
        this.j = nkaVar;
        return nkaVar;
    }

    @Override // defpackage.nak
    public final /* synthetic */ nal k() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        nka nkaVar = new nka(cp(true != a ? 16 : 24, njz.a));
        this.e = nkaVar;
        return nkaVar;
    }

    @Override // defpackage.nak
    public final /* synthetic */ nal l() {
        if (this.g != null) {
            return this.g;
        }
        if ((Memory.peekByte(this.c + 8) & 8) == 0) {
            return null;
        }
        nka nkaVar = new nka(cp(true != a ? 24 : 40, njz.a));
        this.g = nkaVar;
        return nkaVar;
    }

    @Override // defpackage.nak
    public final /* synthetic */ nal m() {
        if (this.h != null) {
            return this.h;
        }
        if ((Memory.peekByte(this.c + 8) & 16) == 0) {
            return null;
        }
        nka nkaVar = new nka(cp(true != a ? 28 : 48, njz.a));
        this.h = nkaVar;
        return nkaVar;
    }

    @Override // defpackage.nak
    public final /* synthetic */ nal n() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        nka nkaVar = new nka(cp(true != a ? 12 : 16, njz.a));
        this.d = nkaVar;
        return nkaVar;
    }

    @Override // defpackage.nak
    public final /* synthetic */ nal o() {
        if (this.k != null) {
            return this.k;
        }
        if ((Memory.peekByte(this.c + 8) & 128) == 0) {
            return null;
        }
        nka nkaVar = new nka(cp(true != a ? 40 : 72, njz.a));
        this.k = nkaVar;
        return nkaVar;
    }

    @Override // defpackage.nak
    public final boolean p() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    @Override // defpackage.nak
    public final boolean q() {
        return (this.i == null && (Memory.peekByte(this.c + 8) & 32) == 0) ? false : true;
    }

    @Override // defpackage.nak
    public final boolean r() {
        return (this.j == null && (Memory.peekByte(this.c + 8) & 64) == 0) ? false : true;
    }

    @Override // defpackage.nak
    public final boolean s() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.nak
    public final boolean t() {
        return (this.g == null && (Memory.peekByte(this.c + 8) & 8) == 0) ? false : true;
    }

    @Override // defpackage.nak
    public final boolean u() {
        return (this.h == null && (Memory.peekByte(this.c + 8) & 16) == 0) ? false : true;
    }

    @Override // defpackage.nak
    public final boolean v() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    @Override // defpackage.nak
    public final boolean w() {
        return (this.k == null && (Memory.peekByte(this.c + 8) & 128) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
