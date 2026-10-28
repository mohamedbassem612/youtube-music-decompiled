package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class muf extends mff implements mzc {
    private final ahuj a;

    public muf(ahuj ahujVar) {
        this.a = ahujVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.a;
            ahuj ahujVar2 = ((muf) obj).a;
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

    @Override // defpackage.mzc
    public final int g() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(4);
        if (iB != 0) {
            return ahujVar.d(iB);
        }
        return 0;
    }

    @Override // defpackage.mzc
    public final /* synthetic */ nay h(int i) {
        ahuj ahujVar = new ahuj();
        ahuj ahujVar2 = this.a;
        int iB = ahujVar2.b(4);
        if (iB != 0) {
            ahujVar.f(ahujVar2.a(ahujVar2.c(iB) + (i << 2)), ahujVar2.b);
        } else {
            ahujVar = null;
        }
        if (ahujVar != null) {
            return new mus(ahujVar);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int hashCode() {
        return this.a.b.hashCode();
    }
}
