package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mue extends mff implements myz {
    private agev b;
    private agev c;
    private agev d;
    private agev e;
    private agev f;
    private agev g;
    private agev h;
    private final ahuj i;

    public mue(ahuj ahujVar) {
        this.i = ahujVar;
    }

    private final void G() {
        if (this.g == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(38);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.g = ahujVar2 == null ? agdf.a : agev.i(new mub(ahujVar2));
        }
    }

    private final void H() {
        if (this.f == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(36);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.f = ahujVar2 == null ? agdf.a : agev.i(new mud(ahujVar2));
        }
    }

    private final void I() {
        if (this.b == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(12);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.b = ahujVar2 == null ? agdf.a : agev.i(new muo(ahujVar2));
        }
    }

    private final void J() {
        if (this.h == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(46);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.h = ahujVar2 == null ? agdf.a : agev.i(new muy(ahujVar2));
        }
    }

    private final void K() {
        if (this.c == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(22);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.c = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void L() {
        if (this.d == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(30);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.d = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void M() {
        if (this.e == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(32);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.e = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    @Override // defpackage.myz
    public final boolean A() {
        M();
        return this.e.g();
    }

    @Override // defpackage.myz
    public final int B() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(28);
        int iAV = a.aV(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iAV == 0) {
            return 1;
        }
        return iAV;
    }

    @Override // defpackage.myz
    public final int C() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(6);
        int iAS = a.aS(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }

    @Override // defpackage.myz
    public final int D() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(34);
        int iAV = a.aV(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iAV == 0) {
            return 1;
        }
        return iAV;
    }

    @Override // defpackage.myz
    public final int E() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(24);
        int iAS = a.aS(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }

    @Override // defpackage.myz
    public final int F() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(26);
        int iAS = a.aS(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = ((mue) obj).i;
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

    @Override // defpackage.myz
    @Deprecated
    public final int g() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(4);
        if (iB != 0) {
            return ahujVar.d(iB);
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, myr] */
    @Override // defpackage.myz
    public final /* bridge */ /* synthetic */ myr h() {
        G();
        if (this.g.g()) {
            return this.g.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.i.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, myw] */
    @Override // defpackage.myz
    public final /* bridge */ /* synthetic */ myw i() {
        H();
        if (this.f.g()) {
            return this.f.c();
        }
        return null;
    }

    @Override // defpackage.myz
    @Deprecated
    public final /* synthetic */ mzc j(int i) {
        ahuj ahujVar = new ahuj();
        ahuj ahujVar2 = this.i;
        int iB = ahujVar2.b(4);
        if (iB != 0) {
            ahujVar.f(ahujVar2.a(ahujVar2.c(iB) + (i << 2)), ahujVar2.b);
        } else {
            ahujVar = null;
        }
        if (ahujVar != null) {
            return new muf(ahujVar);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.myz
    public final /* bridge */ /* synthetic */ mzg k() {
        K();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.myz
    public final /* bridge */ /* synthetic */ mzg l() {
        L();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.myz
    public final /* bridge */ /* synthetic */ mzg m() {
        M();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nak] */
    @Override // defpackage.myz
    public final /* bridge */ /* synthetic */ nak n() {
        I();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nbn] */
    @Override // defpackage.myz
    public final /* bridge */ /* synthetic */ nbn o() {
        J();
        if (this.h.g()) {
            return this.h.c();
        }
        return null;
    }

    @Override // defpackage.myz
    public final boolean p() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(40);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.myz
    public final boolean q() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(42);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.myz
    public final boolean r() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(44);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.myz
    public final boolean s() {
        G();
        return this.g.g();
    }

    @Override // defpackage.myz
    public final boolean t() {
        H();
        return this.f.g();
    }

    @Override // defpackage.myz
    public final boolean u() {
        I();
        return this.b.g();
    }

    @Override // defpackage.myz
    public final boolean v() {
        return aewo.al(this.i, 42);
    }

    @Override // defpackage.myz
    public final boolean w() {
        return aewo.al(this.i, 44);
    }

    @Override // defpackage.myz
    public final boolean x() {
        J();
        return this.h.g();
    }

    @Override // defpackage.myz
    public final boolean y() {
        K();
        return this.c.g();
    }

    @Override // defpackage.myz
    public final boolean z() {
        L();
        return this.d.g();
    }
}
