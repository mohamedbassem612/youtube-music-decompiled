package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mvx extends mff implements ndy {
    private agev a;
    private final ahuj b;

    public mvx(ahuj ahujVar) {
        this.b = ahujVar;
    }

    private final void n() {
        if (this.a == null) {
            ahuj ahujVar = this.b;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(10);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.a = ahujVar2 == null ? agdf.a : agev.i(new mvy(ahujVar2));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.b;
            ahuj ahujVar2 = ((mvx) obj).b;
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

    @Override // defpackage.ndy
    public final float g() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(4);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.ndy
    public final float h() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(14);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    @Override // defpackage.ndy
    public final int i() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(6);
        if (iB != 0) {
            return ahujVar.b.getInt(iB + ahujVar.a);
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nea] */
    @Override // defpackage.ndy
    public final /* bridge */ /* synthetic */ nea j() {
        n();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    @Override // defpackage.ndy
    public final boolean k() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(12);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.ndy
    public final boolean l() {
        n();
        return this.a.g();
    }

    @Override // defpackage.ndy
    public final int m() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(8);
        int iAV = a.aV(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iAV == 0) {
            return 1;
        }
        return iAV;
    }
}
