package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mur extends mff implements nar {
    private agev b;
    private agev c;
    private agev d;
    private agev e;
    private agev f;
    private agev g;
    private agev h;
    private final ahuj i;

    public mur(ahuj ahujVar) {
        this.i = ahujVar;
    }

    private final void K() {
        if (this.e == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(10);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.e = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void L() {
        if (this.f == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(12);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.f = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void M() {
        if (this.d == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(8);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.d = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void N() {
        if (this.h == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(40);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.h = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void O() {
        if (this.g == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(32);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.g = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void P() {
        if (this.c == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(6);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.c = ahujVar2 == null ? agdf.a : agev.i(new mtf(ahujVar2));
        }
    }

    private final void Q() {
        if (this.b == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(4);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.b = ahujVar2 == null ? agdf.a : agev.i(new mtf(ahujVar2));
        }
    }

    @Override // defpackage.nar
    public final boolean A() {
        M();
        return this.d.g();
    }

    @Override // defpackage.nar
    public final boolean B() {
        N();
        return this.h.g();
    }

    @Override // defpackage.nar
    public final boolean C() {
        O();
        return this.g.g();
    }

    @Override // defpackage.nar
    public final boolean D() {
        P();
        return this.c.g();
    }

    @Override // defpackage.nar
    public final boolean E() {
        return aewo.al(this.i, 28);
    }

    @Override // defpackage.nar
    public final boolean F() {
        Q();
        return this.b.g();
    }

    @Override // defpackage.nar
    public final int G() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(20);
        int iAU = a.aU(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iAU == 0) {
            return 1;
        }
        return iAU;
    }

    @Override // defpackage.nar
    public final int H() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(30);
        int iBc = a.bc(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iBc == 0) {
            return 1;
        }
        return iBc;
    }

    @Override // defpackage.nar
    public final int I() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(26);
        int iBi = a.bi(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iBi == 0) {
            return 1;
        }
        return iBi;
    }

    @Override // defpackage.nar
    public final int J() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(28);
        int iBt = a.bt(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iBt == 0) {
            return 1;
        }
        return iBt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = ((mur) obj).i;
            if (ahujVar == ahujVar2) {
                return true;
            }
            ByteBuffer byteBuffer = ahujVar.b;
            ByteBuffer byteBuffer2 = ahujVar2.b;
            if (byteBuffer == null) {
                if (byteBuffer2 == null) {
                    return true;
                }
            } else if (byteBuffer2 != null) {
                if (byteBuffer.hasArray() && byteBuffer2.hasArray() && byteBuffer.array() == byteBuffer2.array() && byteBuffer.arrayOffset() == byteBuffer2.arrayOffset() && byteBuffer.capacity() == byteBuffer2.capacity() && byteBuffer.position() == byteBuffer2.position() && byteBuffer.remaining() == byteBuffer2.remaining()) {
                    return true;
                }
                return byteBuffer.equals(byteBuffer2);
            }
        }
        return false;
    }

    @Override // defpackage.nar
    public final int g() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(34);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(iB + ahujVar.a)) & 4294967295L : 0L);
    }

    @Override // defpackage.nar
    public final int h() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(24);
        if (iB != 0) {
            return ahujVar.b.getInt(iB + ahujVar.a);
        }
        return 0;
    }

    public final int hashCode() {
        return this.i.b.hashCode();
    }

    @Override // defpackage.nar
    public final int i() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(22);
        if (iB != 0) {
            return ahujVar.b.getInt(iB + ahujVar.a);
        }
        return 0;
    }

    @Override // defpackage.nar
    public final int j() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(38);
        if (iB != 0) {
            return ahujVar.d(iB);
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mxc] */
    @Override // defpackage.nar
    public final /* bridge */ /* synthetic */ mxc k() {
        P();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mxc] */
    @Override // defpackage.nar
    public final /* bridge */ /* synthetic */ mxc l() {
        Q();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.nar
    public final /* bridge */ /* synthetic */ mzg m() {
        K();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.nar
    public final /* bridge */ /* synthetic */ mzg n() {
        L();
        if (this.f.g()) {
            return this.f.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.nar
    public final /* bridge */ /* synthetic */ mzg o() {
        M();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.nar
    public final /* bridge */ /* synthetic */ mzg p() {
        N();
        if (this.h.g()) {
            return this.h.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.nar
    public final /* bridge */ /* synthetic */ mzg q() {
        O();
        if (this.g.g()) {
            return this.g.c();
        }
        return null;
    }

    @Override // defpackage.nar
    public final String r(int i) {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(38);
        String strE = iB != 0 ? ahujVar.e(ahujVar.c(iB) + (i << 2)) : null;
        if (strE != null) {
            return strE;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.nar
    public final boolean s() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(36);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nar
    public final boolean t() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(16);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nar
    public final boolean u() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(18);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nar
    public final boolean v() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(14);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nar
    public final boolean w() {
        return aewo.al(this.i, 34);
    }

    @Override // defpackage.nar
    public final boolean x() {
        return aewo.al(this.i, 18);
    }

    @Override // defpackage.nar
    public final boolean y() {
        K();
        return this.e.g();
    }

    @Override // defpackage.nar
    public final boolean z() {
        L();
        return this.f.g();
    }
}
