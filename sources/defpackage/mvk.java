package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mvk extends mff implements ncq {
    private agev b;
    private agev c;
    private agev d;
    private agev e;
    private agev f;
    private agev g;
    private agev h;
    private final ahuj i;

    public mvk(ahuj ahujVar) {
        this.i = ahujVar;
    }

    private final void A() {
        if (this.h == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(20);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.h = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void B() {
        if (this.f == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(14);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.f = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void C() {
        if (this.e == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(12);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.e = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void w() {
        if (this.c == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(6);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.c = ahujVar2 == null ? agdf.a : agev.i(new mvh(ahujVar2));
        }
    }

    private final void x() {
        if (this.d == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(8);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.d = ahujVar2 == null ? agdf.a : agev.i(new mvh(ahujVar2));
        }
    }

    private final void y() {
        if (this.b == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(4);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.b = ahujVar2 == null ? agdf.a : agev.i(new mvh(ahujVar2));
        }
    }

    private final void z() {
        if (this.g == null) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(18);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.g = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.i;
            ahuj ahujVar2 = ((mvk) obj).i;
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
    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ mzg g() {
        z();
        if (this.g.g()) {
            return this.g.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ mzg h() {
        A();
        if (this.h.g()) {
            return this.h.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.i.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ mzg i() {
        B();
        if (this.f.g()) {
            return this.f.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ mzg j() {
        C();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nci] */
    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ nci k() {
        w();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nci] */
    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ nci l() {
        x();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nci] */
    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ nci m() {
        y();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    @Override // defpackage.ncq
    public final boolean n() {
        w();
        return this.c.g();
    }

    @Override // defpackage.ncq
    public final boolean o() {
        x();
        return this.d.g();
    }

    @Override // defpackage.ncq
    public final boolean p() {
        y();
        return this.b.g();
    }

    @Override // defpackage.ncq
    public final boolean q() {
        z();
        return this.g.g();
    }

    @Override // defpackage.ncq
    public final boolean r() {
        A();
        return this.h.g();
    }

    @Override // defpackage.ncq
    public final boolean s() {
        B();
        return this.f.g();
    }

    @Override // defpackage.ncq
    public final boolean t() {
        C();
        return this.e.g();
    }

    @Override // defpackage.ncq
    public final int u() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(16);
        int iAS = a.aS(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }

    @Override // defpackage.ncq
    public final int v() {
        ahuj ahujVar = this.i;
        int iB = ahujVar.b(10);
        int iAS = a.aS(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }
}
