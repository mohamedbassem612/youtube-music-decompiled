package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mux extends mff implements nbm {
    private final ahuj a;

    public mux(ahuj ahujVar) {
        this.a = ahujVar;
    }

    @Override // defpackage.nbm
    public final float Y() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(12);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nbm
    public final int Z() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(10);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(iB + ahujVar.a)) & 4294967295L : 0L);
    }

    @Override // defpackage.nbm
    public final int aa() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(8);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(iB + ahujVar.a)) & 4294967295L : 0L);
    }

    @Override // defpackage.nbm
    public final boolean ab() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(4);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nbm
    public final boolean ac() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(14);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nbm
    public final boolean ad() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(6);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nbm
    public final boolean ae() {
        return aewo.al(this.a, 10);
    }

    @Override // defpackage.nbm
    public final boolean af() {
        return aewo.al(this.a, 12);
    }

    @Override // defpackage.nbm
    public final boolean ag() {
        return aewo.al(this.a, 8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.a;
            ahuj ahujVar2 = ((mux) obj).a;
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

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
