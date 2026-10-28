package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mwh extends mff implements nfb {
    private agev b;
    private final aunm c;

    public mwh(aunm aunmVar) {
        this.c = aunmVar;
    }

    private final void k() {
        if (this.b == null) {
            aunm aunmVar = this.c;
            ahuj ahujVar = new ahuj();
            int iB = aunmVar.b(6);
            if (iB != 0) {
                ahujVar.f(aunmVar.a(iB + aunmVar.a), aunmVar.b);
            } else {
                ahujVar = null;
            }
            this.b = ahujVar == null ? agdf.a : agev.i(new mug(ahujVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aunm aunmVar = this.c;
            aunm aunmVar2 = ((mwh) obj).c;
            if (aunmVar == aunmVar2) {
                return true;
            }
            ByteBuffer byteBuffer = aunmVar.b;
            ByteBuffer byteBuffer2 = aunmVar2.b;
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

    @Override // defpackage.nfb
    public final int g() {
        aunm aunmVar = this.c;
        int iB = aunmVar.b(4);
        if (iB != 0) {
            return aunmVar.d(iB);
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.nfb
    public final /* bridge */ /* synthetic */ mzg h() {
        k();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.c.b.hashCode();
    }

    @Override // defpackage.nfb
    public final /* synthetic */ nfc i(int i) {
        ahuj ahujVar = new ahuj();
        aunm aunmVar = this.c;
        int iB = aunmVar.b(4);
        if (iB != 0) {
            ahujVar.f(aunmVar.a(aunmVar.c(iB) + (i << 2)), aunmVar.b);
        } else {
            ahujVar = null;
        }
        if (ahujVar != null) {
            return new mwi(ahujVar);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.nfb
    public final boolean j() {
        k();
        return this.b.g();
    }
}
