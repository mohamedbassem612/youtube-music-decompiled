package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class muv extends mff implements nbi {
    private agev b;
    private agev c;
    private agev d;
    private agev e;
    private agev f;
    private agev g;
    private agev h;
    private agev i;
    private agev j;
    private final ahuj k;

    public muv(ahuj ahujVar) {
        this.k = ahujVar;
    }

    private final void B() {
        if (this.d == null) {
            ahuj ahujVar = this.k;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(10);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.d = ahujVar2 == null ? agdf.a : agev.i(new mtf(ahujVar2));
        }
    }

    private final void C() {
        if (this.f == null) {
            ahuj ahujVar = this.k;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(16);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.f = ahujVar2 == null ? agdf.a : agev.i(new mtf(ahujVar2));
        }
    }

    private final void D() {
        if (this.e == null) {
            ahuj ahujVar = this.k;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(14);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.e = ahujVar2 == null ? agdf.a : agev.i(new mtf(ahujVar2));
        }
    }

    private final void E() {
        if (this.h == null) {
            ahuj ahujVar = this.k;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(26);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.h = ahujVar2 == null ? agdf.a : agev.i(new muo(ahujVar2));
        }
    }

    private final void F() {
        if (this.g == null) {
            ahuj ahujVar = this.k;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(24);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.g = ahujVar2 == null ? agdf.a : agev.i(new muo(ahujVar2));
        }
    }

    private final void G() {
        if (this.j == null) {
            ahuj ahujVar = this.k;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(30);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.j = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void H() {
        if (this.i == null) {
            ahuj ahujVar = this.k;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(28);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.i = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void I() {
        if (this.b == null) {
            ahuj ahujVar = this.k;
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

    private final void J() {
        if (this.c == null) {
            ahuj ahujVar = this.k;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(8);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.c = ahujVar2 == null ? agdf.a : agev.i(new mtf(ahujVar2));
        }
    }

    @Override // defpackage.nbi
    public final int A() {
        ahuj ahujVar = this.k;
        int iB = ahujVar.b(22);
        int iAV = a.aV(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iAV == 0) {
            return 1;
        }
        return iAV;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.k;
            ahuj ahujVar2 = ((muv) obj).k;
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

    @Override // defpackage.nbi
    public final int g() {
        ahuj ahujVar = this.k;
        int iB = ahujVar.b(6);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(iB + ahujVar.a)) & 4294967295L : 0L);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mxc] */
    @Override // defpackage.nbi
    public final /* bridge */ /* synthetic */ mxc h() {
        B();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.k.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mxc] */
    @Override // defpackage.nbi
    public final /* bridge */ /* synthetic */ mxc i() {
        C();
        if (this.f.g()) {
            return this.f.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mxc] */
    @Override // defpackage.nbi
    public final /* bridge */ /* synthetic */ mxc j() {
        D();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mxc] */
    @Override // defpackage.nbi
    public final /* bridge */ /* synthetic */ mxc k() {
        I();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mxc] */
    @Override // defpackage.nbi
    public final /* bridge */ /* synthetic */ mxc l() {
        J();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.nbi
    public final /* bridge */ /* synthetic */ mzg m() {
        G();
        if (this.j.g()) {
            return this.j.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.nbi
    public final /* bridge */ /* synthetic */ mzg n() {
        H();
        if (this.i.g()) {
            return this.i.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nak] */
    @Override // defpackage.nbi
    public final /* bridge */ /* synthetic */ nak o() {
        E();
        if (this.h.g()) {
            return this.h.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nak] */
    @Override // defpackage.nbi
    public final /* bridge */ /* synthetic */ nak p() {
        F();
        if (this.g.g()) {
            return this.g.c();
        }
        return null;
    }

    @Override // defpackage.nbi
    public final boolean q() {
        B();
        return this.d.g();
    }

    @Override // defpackage.nbi
    public final boolean r() {
        C();
        return this.f.g();
    }

    @Override // defpackage.nbi
    public final boolean s() {
        D();
        return this.e.g();
    }

    @Override // defpackage.nbi
    public final boolean t() {
        return aewo.al(this.k, 18);
    }

    @Override // defpackage.nbi
    public final boolean u() {
        E();
        return this.h.g();
    }

    @Override // defpackage.nbi
    public final boolean v() {
        F();
        return this.g.g();
    }

    @Override // defpackage.nbi
    public final boolean w() {
        G();
        return this.j.g();
    }

    @Override // defpackage.nbi
    public final boolean x() {
        H();
        return this.i.g();
    }

    @Override // defpackage.nbi
    public final boolean y() {
        I();
        return this.b.g();
    }

    @Override // defpackage.nbi
    public final boolean z() {
        J();
        return this.c.g();
    }
}
