package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mwf extends mff implements Cnew {
    private final ahuj a;

    public mwf(ahuj ahujVar) {
        this.a = ahujVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.a;
            ahuj ahujVar2 = ((mwf) obj).a;
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

    @Override // defpackage.Cnew
    public final float g() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(4);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.Cnew
    public final float h(int i) {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(8);
        if (iB != 0) {
            return ahujVar.b.getFloat(ahujVar.c(iB) + (i << 2));
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }

    @Override // defpackage.Cnew
    public final int i() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(8);
        if (iB != 0) {
            return ahujVar.d(iB);
        }
        return 0;
    }

    @Override // defpackage.Cnew
    public final int j() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(6);
        int iAX = a.aX(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iAX == 0) {
            return 1;
        }
        return iAX;
    }
}
