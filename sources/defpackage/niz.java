package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class niz extends mew implements mzt {
    static final mfc d = niy.a.d(2);
    static final mfc e = niy.a.d(3);
    static final mfc f = niy.a.d(6);
    public static final /* synthetic */ int k = 0;
    volatile ByteBuffer g;
    volatile ByteBuffer h;
    ArrayList i;
    volatile String j;

    public niz() {
        super(niy.a);
    }

    final void aR() {
        if (this.i == null) {
            this.i = bD(true != a ? 12 : 72);
        }
    }

    @Override // defpackage.mzt
    public final int g(int i) {
        aR();
        return ((Integer) this.i.get(i)).intValue();
    }

    @Override // defpackage.mzt
    public final int h() {
        aR();
        return this.i.size();
    }

    @Override // defpackage.mzt
    public final long i() {
        return Memory.peekLong(this.c + (true != a ? 40L : 64L), false);
    }

    @Override // defpackage.mzt
    public final String j() {
        if (this.j == null && (Memory.peekByte(this.c + 8) & 16) != 0) {
            this.j = cq(f.b);
        }
        return this.j;
    }

    @Override // defpackage.mzt
    public final ByteBuffer k() {
        if ((Memory.peekByte(this.c + 8) & 4) == 0) {
            return null;
        }
        if (this.h == null) {
            if ((Memory.peekByte(this.c + 8) & 4) != 0) {
                this.h = cr(e.b);
            } else {
                this.h = ByteBuffer.allocate(0);
            }
        }
        return this.h.asReadOnlyBuffer();
    }

    @Override // defpackage.mzt
    public final ByteBuffer l() {
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        if (this.g == null) {
            if ((Memory.peekByte(this.c + 8) & 2) != 0) {
                this.g = cr(d.b);
            } else {
                this.g = ByteBuffer.allocate(0);
            }
        }
        return this.g.asReadOnlyBuffer();
    }

    @Override // defpackage.mzt
    public final boolean m() {
        return Memory.peekByte(this.c + 10) != 0;
    }

    @Override // defpackage.mzt
    public final boolean n() {
        return Memory.peekByte(this.c + 9) != 0;
    }

    @Override // defpackage.mzt
    public final boolean o() {
        return (Memory.peekByte(this.c + 8) & 4) != 0;
    }

    @Override // defpackage.mzt
    public final boolean p() {
        return (Memory.peekByte(this.c + 8) & 16) != 0;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
