package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mta extends mff implements mwq {
    private final ahuj a;

    public mta(ahuj ahujVar) {
        this.a = ahujVar;
    }

    @Override // defpackage.mwq
    public final int bU() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(6);
        if (iB != 0) {
            return ahujVar.b.getInt(iB + ahujVar.a);
        }
        return 0;
    }

    @Override // defpackage.mwq
    public final int bV() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(4);
        if (iB != 0) {
            return ahujVar.b.getInt(iB + ahujVar.a);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.a;
            ahuj ahujVar2 = ((mta) obj).a;
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
