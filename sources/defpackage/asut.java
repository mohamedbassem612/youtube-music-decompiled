package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.ArrayList;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class asut extends mew implements mes {
    public static final mfc e = asus.a.d(1);
    public static final mfc f = asus.a.d(7);
    public static final mfc g = asus.a.d(8);
    static final mfc h = asus.a.d(9);
    public volatile String i;
    public boolean j;
    public volatile String k;
    public volatile String l;
    public ArrayList m;
    public boolean n;
    public volatile asuv o;
    public volatile asux p;
    public volatile asur q;
    public volatile mew r;
    public volatile asuy s;
    public volatile mew t;

    public asut() {
        super(asus.a);
        this.j = false;
        this.n = false;
    }

    public void aR() {
        if (this.n) {
            bO(8, 16);
            bR(true != a ? 20 : 88, this.s);
            this.n = false;
        }
    }

    public void aT() {
        if (this.j) {
            bO(8, 2);
            bR(true != a ? 12 : 72, this.t);
            this.j = false;
        }
    }

    public final int aU() {
        aZ();
        return this.m.size();
    }

    public final String aV(int i) {
        aZ();
        return (String) this.m.get(i);
    }

    public final String aW() {
        if (this.k == null) {
            this.k = (Memory.peekByte(this.c + 8) & 4) != 0 ? cq(f.b) : "";
        }
        return this.k;
    }

    public final String aX() {
        if (this.i == null) {
            this.i = (Memory.peekByte(this.c + 8) & 1) != 0 ? cq(e.b) : "";
        }
        return this.i;
    }

    public final String aY() {
        if (this.l == null) {
            this.l = (Memory.peekByte(this.c + 8) & 8) != 0 ? cq(g.b) : "";
        }
        return this.l;
    }

    final void aZ() {
        if (this.m == null) {
            this.m = bF(h.b);
        }
    }

    @Override // defpackage.mew
    public final void bJ() {
        aT();
        aR();
    }

    public final boolean ba() {
        return (this.s == null && (Memory.peekByte(this.c + 8) & 16) == 0) ? false : true;
    }

    public final int bb() {
        long j = this.c;
        int i = 0;
        int iPeekInt = Memory.peekInt(j + (true != a ? 24L : 12L), false);
        if (iPeekInt == 0) {
            i = 2;
        } else if (iPeekInt == 1) {
            i = 3;
        } else if (iPeekInt == 2) {
            i = 4;
        } else if (iPeekInt == 3) {
            i = 5;
        }
        if (i != 0) {
            return i;
        }
        return 1;
    }

    public final asuy bc() {
        if (this.s == null && (Memory.peekByte(this.c + 8) & 16) != 0) {
            this.s = new asuy(cp(true != a ? 20 : 88, asuo.a));
        }
        if (this.s != null) {
            return this.s;
        }
        mfc mfcVar = asuy.h;
        return asun.a;
    }

    public final mew bd() {
        if (this.t == null && (Memory.peekByte(this.c + 8) & 2) != 0) {
            this.t = new mew(cp(true != a ? 12 : 72, asvl.a), (byte[]) null);
        }
        return this.t == null ? asvk.a : this.t;
    }

    public asut(UpbMessage upbMessage) {
        super(upbMessage);
        this.j = false;
        this.n = false;
    }
}
