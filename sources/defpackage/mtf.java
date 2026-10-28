package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mtf extends mff implements mxc {
    private agev a;
    private final ahuj b;

    public mtf(ahuj ahujVar) {
        this.b = ahujVar;
    }

    private final void I() {
        if (this.a == null) {
            ahuj ahujVar = this.b;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(28);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.a = ahujVar2 == null ? agdf.a : agev.i(new mtn(ahujVar2));
        }
    }

    @Override // defpackage.mxc
    public final boolean A() {
        I();
        return this.a.g();
    }

    @Override // defpackage.mxc
    public final boolean B() {
        return aewo.al(this.b, 6);
    }

    @Override // defpackage.mxc
    public final boolean C() {
        return aewo.al(this.b, 34);
    }

    @Override // defpackage.mxc
    public final boolean D() {
        return aewo.al(this.b, 24);
    }

    @Override // defpackage.mxc
    public final int E() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(10);
        int iBb = a.bb(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iBb == 0) {
            return 1;
        }
        return iBb;
    }

    @Override // defpackage.mxc
    public final int F() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(34);
        int iAS = a.aS(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }

    @Override // defpackage.mxc
    public final int G() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(8);
        int iBt = a.bt(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iBt == 0) {
            return 1;
        }
        return iBt;
    }

    @Override // defpackage.mxc
    public final int H() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(24);
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
            ahuj ahujVar = this.b;
            ahuj ahujVar2 = ((mtf) obj).b;
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

    @Override // defpackage.mxc
    public final float g() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(6);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.mxc
    public final int h() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(20);
        if (iB != 0) {
            return ahujVar.d(iB);
        }
        return 0;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    @Override // defpackage.mxc
    public final int i() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(12);
        if (iB != 0) {
            return ahujVar.d(iB);
        }
        return 0;
    }

    @Override // defpackage.mxc
    public final int j() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(26);
        if (iB != 0) {
            return ahujVar.d(iB);
        }
        return 0;
    }

    @Override // defpackage.mxc
    public final int k() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(32);
        if (iB != 0) {
            return ahujVar.d(iB);
        }
        return 0;
    }

    @Override // defpackage.mxc
    public final int l() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(30);
        if (iB != 0) {
            return ahujVar.d(iB);
        }
        return 0;
    }

    @Override // defpackage.mxc
    public final int m() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(14);
        if (iB != 0) {
            return ahujVar.d(iB);
        }
        return 0;
    }

    @Override // defpackage.mxc
    public final /* synthetic */ mxb n(int i) {
        ahuj ahujVar = new ahuj();
        ahuj ahujVar2 = this.b;
        int iB = ahujVar2.b(20);
        if (iB != 0) {
            ahujVar.f(ahujVar2.a(ahujVar2.c(iB) + (i << 2)), ahujVar2.b);
        } else {
            ahujVar = null;
        }
        if (ahujVar != null) {
            return new mte(ahujVar);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.mxc
    public final /* synthetic */ mxe o(int i) {
        ahuj ahujVar = new ahuj();
        ahuj ahujVar2 = this.b;
        int iB = ahujVar2.b(12);
        if (iB != 0) {
            ahujVar.f(ahujVar2.a(ahujVar2.c(iB) + (i << 2)), ahujVar2.b);
        } else {
            ahujVar = null;
        }
        if (ahujVar != null) {
            return new mtg(ahujVar);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.mxc
    public final /* synthetic */ mxf p(int i) {
        ahuj ahujVar = new ahuj();
        ahuj ahujVar2 = this.b;
        int iB = ahujVar2.b(26);
        if (iB != 0) {
            ahujVar.f(ahujVar2.a(ahujVar2.c(iB) + (i << 2)), ahujVar2.b);
        } else {
            ahujVar = null;
        }
        if (ahujVar != null) {
            return new mth(ahujVar);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mxl] */
    @Override // defpackage.mxc
    public final /* bridge */ /* synthetic */ mxl q() {
        I();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    @Override // defpackage.mxc
    public final /* synthetic */ mxv r(int i) {
        ahuj ahujVar = new ahuj();
        ahuj ahujVar2 = this.b;
        int iB = ahujVar2.b(32);
        if (iB != 0) {
            ahujVar.f(ahujVar2.a(ahujVar2.c(iB) + (i << 2)), ahujVar2.b);
        } else {
            ahujVar = null;
        }
        if (ahujVar != null) {
            return new mtp(ahujVar);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.mxc
    public final /* synthetic */ mxx s(int i) {
        ahuj ahujVar = new ahuj();
        ahuj ahujVar2 = this.b;
        int iB = ahujVar2.b(30);
        if (iB != 0) {
            ahujVar.f(ahujVar2.a(ahujVar2.c(iB) + (i << 2)), ahujVar2.b);
        } else {
            ahujVar = null;
        }
        if (ahujVar != null) {
            return new mtq(ahujVar);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.mxc
    public final /* synthetic */ mxy t(int i) {
        ahuj ahujVar = new ahuj();
        ahuj ahujVar2 = this.b;
        int iB = ahujVar2.b(14);
        if (iB != 0) {
            ahujVar.f(ahujVar2.a(ahujVar2.c(iB) + (i << 2)), ahujVar2.b);
        } else {
            ahujVar = null;
        }
        if (ahujVar != null) {
            return new mtr(ahujVar);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.mxc
    public final String u() {
        return ahuj.r(this.b);
    }

    @Override // defpackage.mxc
    public final boolean v() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(22);
        return iB == 0 || ahujVar.b.get(iB + ahujVar.a) != 0;
    }

    @Override // defpackage.mxc
    public final boolean w() {
        return aewo.al(this.b, 8);
    }

    @Override // defpackage.mxc
    public final boolean x() {
        return aewo.al(this.b, 22);
    }

    @Override // defpackage.mxc
    public final boolean y() {
        return ahuj.r(this.b) != null;
    }

    @Override // defpackage.mxc
    public final boolean z() {
        return aewo.al(this.b, 10);
    }
}
