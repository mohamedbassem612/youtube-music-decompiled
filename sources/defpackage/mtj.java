package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mtj extends mff implements mxh {
    private final ahuj a;

    public mtj(ahuj ahujVar) {
        this.a = ahujVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.a;
            ahuj ahujVar2 = ((mtj) obj).a;
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

    @Override // defpackage.mxh
    public final int g(int i) {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(6);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(ahujVar.c(iB) + (i << 2))) & 4294967295L : 0L);
    }

    @Override // defpackage.mxh
    public final int h() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(6);
        if (iB != 0) {
            return ahujVar.d(iB);
        }
        return 0;
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }

    @Override // defpackage.mxh
    public final int i(int i) {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(4);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(ahujVar.c(iB) + (i << 2))) & 4294967295L : 0L);
    }

    @Override // defpackage.mxh
    public final int j() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(4);
        if (iB != 0) {
            return ahujVar.d(iB);
        }
        return 0;
    }
}
