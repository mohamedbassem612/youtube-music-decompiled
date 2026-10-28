package defpackage;

import internal.org.jni_zero.CommonApis;
import java.util.ArrayList;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nfo extends mew implements mwo {
    static final mfc d = nfn.a.d(1);
    static final mfc e = nfn.a.d(2);
    static final mfc f;
    static final mfc g;
    public static final /* synthetic */ int l = 0;
    volatile String h;
    volatile String i;
    volatile String j;
    ArrayList k;

    static {
        nfn.a.d(3);
        f = nfn.a.d(4);
        g = nfn.a.d(5);
    }

    public nfo() {
        super(nfn.a);
    }

    final void aR() {
        if (this.k == null) {
            this.k = bD(g.b);
        }
    }

    @Override // defpackage.mwo
    public final int bA(int i) {
        aR();
        int iG = CommonApis.g(((Integer) this.k.get(i)).intValue());
        if (iG == 0) {
            return 1;
        }
        return iG;
    }

    @Override // defpackage.mwo
    public final int g() {
        aR();
        return this.k.size();
    }

    @Override // defpackage.mwo
    public final String h() {
        if (this.i == null && (Memory.peekByte(this.c + 8) & 2) != 0) {
            this.i = cq(e.b);
        }
        return this.i;
    }

    @Override // defpackage.mwo
    public final String i() {
        if (this.j == null && (Memory.peekByte(this.c + 8) & 8) != 0) {
            this.j = cq(f.b);
        }
        return this.j;
    }

    @Override // defpackage.mwo
    public final String j() {
        if (this.h == null && (Memory.peekByte(this.c + 8) & 1) != 0) {
            this.h = cq(d.b);
        }
        return this.h;
    }

    @Override // defpackage.mwo
    public final boolean k() {
        return Memory.peekByte(this.c + 9) != 0;
    }

    @Override // defpackage.mwo
    public final boolean l() {
        return (Memory.peekByte(this.c + 8) & 8) != 0;
    }

    @Override // defpackage.mwo
    public final boolean m() {
        return (Memory.peekByte(this.c + 8) & 16) != 0;
    }

    @Override // defpackage.mwo
    public final int n() {
        int iBc = a.bc(Memory.peekInt(this.c + (true != a ? 16L : 12L), false));
        if (iBc != 0) {
            return iBc;
        }
        return 1;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
