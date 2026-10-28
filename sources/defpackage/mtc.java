package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mtc extends mff implements mww {
    private agev b;
    private agev c;
    private agev d;
    private agev e;
    private agev f;
    private agev g;
    private agev h;
    private agev i;
    private final ahuj j;

    public mtc(ahuj ahujVar) {
        this.j = ahujVar;
    }

    private final void E() {
        if (this.i == null) {
            ahuj ahujVar = this.j;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(36);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.i = ahujVar2 == null ? agdf.a : agev.i(new mtd(ahujVar2));
        }
    }

    private final void F() {
        if (this.b == null) {
            ahuj ahujVar = this.j;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(4);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.b = ahujVar2 == null ? agdf.a : agev.i(new mtd(ahujVar2));
        }
    }

    private final void G() {
        if (this.d == null) {
            ahuj ahujVar = this.j;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(20);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.d = ahujVar2 == null ? agdf.a : agev.i(new mta(ahujVar2));
        }
    }

    private final void H() {
        if (this.f == null) {
            ahuj ahujVar = this.j;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(24);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.f = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void I() {
        if (this.g == null) {
            ahuj ahujVar = this.j;
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

    private final void J() {
        if (this.h == null) {
            ahuj ahujVar = this.j;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(34);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.h = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void K() {
        if (this.e == null) {
            ahuj ahujVar = this.j;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(22);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.e = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void L() {
        if (this.c == null) {
            ahuj ahujVar = this.j;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(18);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.c = ahujVar2 == null ? agdf.a : agev.i(new mtb(ahujVar2));
        }
    }

    @Override // defpackage.mww
    public final boolean A() {
        K();
        return this.e.g();
    }

    @Override // defpackage.mww
    public final boolean B() {
        L();
        return this.c.g();
    }

    @Override // defpackage.mww
    public final int C() {
        ahuj ahujVar = this.j;
        int iB = ahujVar.b(16);
        int iAV = a.aV(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iAV == 0) {
            return 1;
        }
        return iAV;
    }

    @Override // defpackage.mww
    public final int D() {
        ahuj ahujVar = this.j;
        int iB = ahujVar.b(26);
        int iBc = a.bc(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iBc == 0) {
            return 1;
        }
        return iBc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.j;
            ahuj ahujVar2 = ((mtc) obj).j;
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

    @Override // defpackage.mww
    public final float g() {
        ahuj ahujVar = this.j;
        int iB = ahujVar.b(10);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.mww
    public final float h() {
        ahuj ahujVar = this.j;
        int iB = ahujVar.b(12);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 1.0f;
    }

    public final int hashCode() {
        return this.j.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mwq] */
    @Override // defpackage.mww
    public final /* bridge */ /* synthetic */ mwq i() {
        G();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mwr] */
    @Override // defpackage.mww
    public final /* bridge */ /* synthetic */ mwr j() {
        L();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mwx] */
    @Override // defpackage.mww
    public final /* bridge */ /* synthetic */ mwx k() {
        E();
        if (this.i.g()) {
            return this.i.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mwx] */
    @Override // defpackage.mww
    public final /* bridge */ /* synthetic */ mwx l() {
        F();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.mww
    public final /* bridge */ /* synthetic */ mzg m() {
        H();
        if (this.f.g()) {
            return this.f.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.mww
    public final /* bridge */ /* synthetic */ mzg n() {
        I();
        if (this.g.g()) {
            return this.g.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.mww
    public final /* bridge */ /* synthetic */ mzg o() {
        J();
        if (this.h.g()) {
            return this.h.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.mww
    public final /* bridge */ /* synthetic */ mzg p() {
        K();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    @Override // defpackage.mww
    public final boolean q() {
        ahuj ahujVar = this.j;
        int iB = ahujVar.b(30);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.mww
    public final boolean r() {
        ahuj ahujVar = this.j;
        int iB = ahujVar.b(28);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.mww
    public final boolean s() {
        ahuj ahujVar = this.j;
        int iB = ahujVar.b(6);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.mww
    public final boolean t() {
        E();
        return this.i.g();
    }

    @Override // defpackage.mww
    public final boolean u() {
        F();
        return this.b.g();
    }

    @Override // defpackage.mww
    public final boolean v() {
        return aewo.al(this.j, 10);
    }

    @Override // defpackage.mww
    public final boolean w() {
        G();
        return this.d.g();
    }

    @Override // defpackage.mww
    public final boolean x() {
        H();
        return this.f.g();
    }

    @Override // defpackage.mww
    public final boolean y() {
        I();
        return this.g.g();
    }

    @Override // defpackage.mww
    public final boolean z() {
        J();
        return this.h.g();
    }
}
