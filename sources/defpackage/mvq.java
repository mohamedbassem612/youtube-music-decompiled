package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mvq extends mff implements ndd {
    private final aunj b;

    public mvq(aunj aunjVar) {
        this.b = aunjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aunj aunjVar = this.b;
            aunj aunjVar2 = ((mvq) obj).b;
            if (aunjVar == aunjVar2) {
                return true;
            }
            ByteBuffer byteBuffer = aunjVar.b;
            ByteBuffer byteBuffer2 = aunjVar2.b;
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

    @Override // defpackage.ndd
    public final int g() {
        aunj aunjVar = this.b;
        int iB = aunjVar.b(4);
        if (iB != 0) {
            return aunjVar.d(iB);
        }
        return 0;
    }

    @Override // defpackage.ndd
    public final /* synthetic */ ncz h(int i) {
        ahuj ahujVar = new ahuj();
        aunj aunjVar = this.b;
        int iB = aunjVar.b(4);
        if (iB != 0) {
            ahujVar.f(aunjVar.a(aunjVar.c(iB) + (i << 2)), aunjVar.b);
        } else {
            ahujVar = null;
        }
        if (ahujVar != null) {
            return new mvo(ahujVar);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }
}
