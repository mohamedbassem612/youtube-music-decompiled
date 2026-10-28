package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mtr extends mff implements mxy {
    private agev a;
    private agev b;
    private agev c;
    private final ahuj d;

    public mtr(ahuj ahujVar) {
        this.d = ahujVar;
    }

    private final void G() {
        if (this.c == null) {
            ahuj ahujVar = this.d;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(38);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.c = ahujVar2 == null ? agdf.a : agev.i(new mti(ahujVar2));
        }
    }

    private final void H() {
        if (this.a == null) {
            ahuj ahujVar = this.d;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(40);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.a = ahujVar2 == null ? agdf.a : agev.i(new mtm(ahujVar2));
        }
    }

    private final void I() {
        if (this.b == null) {
            ahuj ahujVar = this.d;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(18);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.b = ahujVar2 == null ? agdf.a : agev.i(new mts(ahujVar2));
        }
    }

    @Override // defpackage.mxy
    public final boolean A() {
        return aewo.al(this.d, 20);
    }

    @Override // defpackage.mxy
    public final boolean B() {
        I();
        return this.b.g();
    }

    @Override // defpackage.mxy
    public final int C() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(12);
        int iAS = a.aS(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }

    @Override // defpackage.mxy
    public final int D() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(30);
        int iAS = a.aS(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }

    @Override // defpackage.mxy
    public final int E() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(28);
        int iBc = a.bc(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iBc == 0) {
            return 1;
        }
        return iBc;
    }

    @Override // defpackage.mxy
    public final int F() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(16);
        int iBc = a.bc(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iBc == 0) {
            return 1;
        }
        return iBc;
    }

    @Override // defpackage.mxy
    public final int aO() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(24);
        int iBi = a.bi(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iBi == 0) {
            return 1;
        }
        return iBi;
    }

    @Override // defpackage.mxy
    public final boolean ck() {
        return aewo.al(this.d, 22);
    }

    @Override // defpackage.mxy
    public final boolean cl() {
        return aewo.al(this.d, 24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.d;
            ahuj ahujVar2 = ((mtr) obj).d;
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

    @Override // defpackage.mxy
    @Deprecated
    public final float g() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(36);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.mxy
    public final float h() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(10);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.d.b.hashCode();
    }

    @Override // defpackage.mxy
    public final float i() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(20);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.mxy
    @Deprecated
    public final int j() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(34);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(iB + ahujVar.a)) & 4294967295L : 0L);
    }

    @Override // defpackage.mxy
    public final int k() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(14);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(iB + ahujVar.a)) & 4294967295L : 0L);
    }

    @Override // defpackage.mxy
    public final int l() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(6);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(iB + ahujVar.a)) & 4294967295L : 0L);
    }

    @Override // defpackage.mxy
    public final int m() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(4);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(iB + ahujVar.a)) & 4294967295L : 0L);
    }

    @Override // defpackage.mxy
    public final int n() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(22);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(iB + ahujVar.a)) & 4294967295L : 0L);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mxg] */
    @Override // defpackage.mxy
    public final /* bridge */ /* synthetic */ mxg o() {
        G();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mxk] */
    @Override // defpackage.mxy
    public final /* bridge */ /* synthetic */ mxk p() {
        H();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mxz] */
    @Override // defpackage.mxy
    public final /* bridge */ /* synthetic */ mxz q() {
        I();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    @Override // defpackage.mxy
    public final String r() {
        return this.d.o();
    }

    @Override // defpackage.mxy
    public final String s() {
        return this.d.p();
    }

    @Override // defpackage.mxy
    public final boolean t() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(26);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.mxy
    public final boolean u() {
        G();
        return this.c.g();
    }

    @Override // defpackage.mxy
    public final boolean v() {
        H();
        return this.a.g();
    }

    @Override // defpackage.mxy
    public final boolean w() {
        return aewo.al(this.d, 14);
    }

    @Override // defpackage.mxy
    public final boolean x() {
        return this.d.o() != null;
    }

    @Override // defpackage.mxy
    public final boolean y() {
        return this.d.p() != null;
    }

    @Override // defpackage.mxy
    public final boolean z() {
        return aewo.al(this.d, 6);
    }
}
