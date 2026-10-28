package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mte extends mff implements mxb {
    private agev a;
    private final ahuj b;

    public mte(ahuj ahujVar) {
        this.b = ahujVar;
    }

    private final void l() {
        if (this.a == null) {
            ahuj ahujVar = this.b;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(8);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.a = ahujVar2 == null ? agdf.a : agev.i(new mus(ahujVar2));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.b;
            ahuj ahujVar2 = ((mte) obj).b;
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

    @Override // defpackage.mxb
    public final int g() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(6);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(iB + ahujVar.a)) & 4294967295L : 0L);
    }

    @Override // defpackage.mxb
    public final int h() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(4);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(iB + ahujVar.a)) & 4294967295L : 0L);
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nay] */
    @Override // defpackage.mxb
    public final /* bridge */ /* synthetic */ nay i() {
        l();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    @Override // defpackage.mxb
    public final boolean j() {
        l();
        return this.a.g();
    }

    @Override // defpackage.mxb
    public final int k() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(10);
        int iAV = a.aV(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iAV == 0) {
            return 1;
        }
        return iAV;
    }
}
