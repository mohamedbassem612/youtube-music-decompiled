package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mwc extends mff implements nem {
    private agev b;
    private agev c;
    private agev d;
    private final aunl e;

    public mwc(aunl aunlVar) {
        this.e = aunlVar;
    }

    private final void x() {
        if (this.b == null) {
            aunl aunlVar = this.e;
            ahuj ahujVar = new ahuj();
            int iB = aunlVar.b(14);
            if (iB != 0) {
                ahujVar.f(aunlVar.a(iB + aunlVar.a), aunlVar.b);
            } else {
                ahujVar = null;
            }
            this.b = ahujVar == null ? agdf.a : agev.i(new mwb(ahujVar));
        }
    }

    private final void y() {
        if (this.c == null) {
            aunl aunlVar = this.e;
            ahuj ahujVar = new ahuj();
            int iB = aunlVar.b(20);
            if (iB != 0) {
                ahujVar.f(aunlVar.a(iB + aunlVar.a), aunlVar.b);
            } else {
                ahujVar = null;
            }
            this.c = ahujVar == null ? agdf.a : agev.i(new mwd(ahujVar));
        }
    }

    private final void z() {
        if (this.d == null) {
            aunl aunlVar = this.e;
            zh zhVar = new zh((byte[]) null);
            int iB = aunlVar.b(30);
            if (iB != 0) {
                zhVar.i(iB + aunlVar.a, aunlVar.b);
            } else {
                zhVar = null;
            }
            this.d = zhVar == null ? agdf.a : agev.i(new mvt(zhVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aunl aunlVar = this.e;
            aunl aunlVar2 = ((mwc) obj).e;
            if (aunlVar == aunlVar2) {
                return true;
            }
            ByteBuffer byteBuffer = aunlVar.b;
            ByteBuffer byteBuffer2 = aunlVar2.b;
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

    @Override // defpackage.nem
    public final float g() {
        aunl aunlVar = this.e;
        int iB = aunlVar.b(12);
        if (iB != 0) {
            return aunlVar.b.getFloat(iB + aunlVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nem
    public final float h() {
        aunl aunlVar = this.e;
        int iB = aunlVar.b(10);
        if (iB != 0) {
            return aunlVar.b.getFloat(iB + aunlVar.a);
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.e.b.hashCode();
    }

    @Override // defpackage.nem
    public final float i() {
        aunl aunlVar = this.e;
        int iB = aunlVar.b(6);
        if (iB != 0) {
            return aunlVar.b.getFloat(iB + aunlVar.a);
        }
        return 1.0f;
    }

    @Override // defpackage.nem
    public final float j() {
        aunl aunlVar = this.e;
        int iB = aunlVar.b(28);
        if (iB != 0) {
            return aunlVar.b.getFloat(iB + aunlVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nem
    public final float k() {
        aunl aunlVar = this.e;
        int iB = aunlVar.b(22);
        if (iB != 0) {
            return aunlVar.b.getFloat(iB + aunlVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nem
    public final float l() {
        aunl aunlVar = this.e;
        int iB = aunlVar.b(24);
        if (iB != 0) {
            return aunlVar.b.getFloat(iB + aunlVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nem
    public final float m() {
        aunl aunlVar = this.e;
        int iB = aunlVar.b(26);
        if (iB != 0) {
            return aunlVar.b.getFloat(iB + aunlVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nem
    public final int n() {
        aunl aunlVar = this.e;
        int iB = aunlVar.b(4);
        return (int) (iB != 0 ? ((long) aunlVar.b.getInt(iB + aunlVar.a)) & 4294967295L : 0L);
    }

    @Override // defpackage.nem
    public final int o() {
        aunl aunlVar = this.e;
        int iB = aunlVar.b(8);
        return (int) (iB != 0 ? ((long) aunlVar.b.getInt(iB + aunlVar.a)) & 4294967295L : 0L);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ndq] */
    @Override // defpackage.nem
    public final /* bridge */ /* synthetic */ ndq p() {
        z();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nei] */
    @Override // defpackage.nem
    public final /* bridge */ /* synthetic */ nei q() {
        x();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nen] */
    @Override // defpackage.nem
    public final /* bridge */ /* synthetic */ nen r() {
        y();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    @Override // defpackage.nem
    public final boolean s() {
        aunl aunlVar = this.e;
        int iB = aunlVar.b(16);
        return iB == 0 || aunlVar.b.get(iB + aunlVar.a) != 0;
    }

    @Override // defpackage.nem
    public final boolean t() {
        x();
        return this.b.g();
    }

    @Override // defpackage.nem
    public final boolean u() {
        return aewo.al(this.e, 16);
    }

    @Override // defpackage.nem
    public final boolean v() {
        y();
        return this.c.g();
    }

    @Override // defpackage.nem
    public final boolean w() {
        z();
        return this.d.g();
    }
}
