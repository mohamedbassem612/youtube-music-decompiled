package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mvz extends mff implements nee {
    private agev b;
    private agev c;
    private agev d;
    private agev e;
    private agev f;
    private agev g;
    private agev h;
    private final ahuj i;

    public mvz(ahuj ahujVar) {
        this.i = ahujVar;
    }

    private final void A() {
        if (this.h == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(24);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.h = ahujVar2 == null ? agdf.a : agev.i(new muy(ahujVar2));
        }
    }

    private final void B() {
        if (this.g == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(22);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.g = ahujVar2 == null ? agdf.a : agev.i(new mvx(ahujVar2));
        }
    }

    private final void C() {
        if (this.d == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(14);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.d = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void D() {
        if (this.e == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(16);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.e = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void E() {
        if (this.f == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(18);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.f = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void y() {
        if (this.b == null) {
            ahuj ahujVar = this.i;
            zh zhVar = new zh((byte[]) null);
            int iB = ahujVar.b(6);
            if (iB != 0) {
                zhVar.i(iB + ahujVar.a, ahujVar.b);
            } else {
                zhVar = null;
            }
            this.b = zhVar == null ? agdf.a : agev.i(new mvt(zhVar));
        }
    }

    private final void z() {
        if (this.c == null) {
            ahuj ahujVar = this.i;
            zh zhVar = new zh((byte[]) null);
            int iB = ahujVar.b(8);
            if (iB != 0) {
                zhVar.i(iB + ahujVar.a, ahujVar.b);
            } else {
                zhVar = null;
            }
            this.c = zhVar == null ? agdf.a : agev.i(new mwa(zhVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = ((mvz) obj).i;
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

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.nee
    public final /* bridge */ /* synthetic */ mzg g() {
        C();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.nee
    public final /* bridge */ /* synthetic */ mzg h() {
        D();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.i.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.nee
    public final /* bridge */ /* synthetic */ mzg i() {
        E();
        if (this.f.g()) {
            return this.f.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nbn] */
    @Override // defpackage.nee
    public final /* bridge */ /* synthetic */ nbn j() {
        A();
        if (this.h.g()) {
            return this.h.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ndq] */
    @Override // defpackage.nee
    public final /* bridge */ /* synthetic */ ndq k() {
        y();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ndy] */
    @Override // defpackage.nee
    public final /* bridge */ /* synthetic */ ndy l() {
        B();
        if (this.g.g()) {
            return this.g.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, neh] */
    @Override // defpackage.nee
    public final /* bridge */ /* synthetic */ neh m() {
        z();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    @Override // defpackage.nee
    public final boolean n() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(10);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nee
    public final boolean o() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(12);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nee
    public final boolean p() {
        y();
        return this.b.g();
    }

    @Override // defpackage.nee
    public final boolean q() {
        z();
        return this.c.g();
    }

    @Override // defpackage.nee
    public final boolean r() {
        A();
        return this.h.g();
    }

    @Override // defpackage.nee
    public final boolean s() {
        B();
        return this.g.g();
    }

    @Override // defpackage.nee
    public final boolean t() {
        C();
        return this.d.g();
    }

    @Override // defpackage.nee
    public final boolean u() {
        D();
        return this.e.g();
    }

    @Override // defpackage.nee
    public final boolean v() {
        E();
        return this.f.g();
    }

    @Override // defpackage.nee
    public final int w() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(4);
        int iAS = a.aS(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }

    @Override // defpackage.nee
    public final int x() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(20);
        int iAV = a.aV(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iAV == 0) {
            return 1;
        }
        return iAV;
    }
}
