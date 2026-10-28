package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class muw extends mff implements nbl {
    private final aunh b;

    public muw(aunh aunhVar) {
        this.b = aunhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aunh aunhVar = this.b;
            aunh aunhVar2 = ((muw) obj).b;
            if (aunhVar == aunhVar2) {
                return true;
            }
            ByteBuffer byteBuffer = aunhVar.b;
            ByteBuffer byteBuffer2 = aunhVar2.b;
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

    @Override // defpackage.nbl
    public final boolean g() {
        aunh aunhVar = this.b;
        int iB = aunhVar.b(12);
        return (iB == 0 || aunhVar.b.get(iB + aunhVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nbl
    public final boolean h() {
        aunh aunhVar = this.b;
        int iB = aunhVar.b(16);
        return (iB == 0 || aunhVar.b.get(iB + aunhVar.a) == 0) ? false : true;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    @Override // defpackage.nbl
    @Deprecated
    public final boolean i() {
        aunh aunhVar = this.b;
        int iB = aunhVar.b(24);
        return (iB == 0 || aunhVar.b.get(iB + aunhVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nbl
    public final boolean j() {
        aunh aunhVar = this.b;
        int iB = aunhVar.b(22);
        return (iB == 0 || aunhVar.b.get(iB + aunhVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nbl
    public final boolean k() {
        aunh aunhVar = this.b;
        int iB = aunhVar.b(18);
        return (iB == 0 || aunhVar.b.get(iB + aunhVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nbl
    public final boolean l() {
        aunh aunhVar = this.b;
        int iB = aunhVar.b(14);
        return (iB == 0 || aunhVar.b.get(iB + aunhVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nbl
    @Deprecated
    public final boolean m() {
        aunh aunhVar = this.b;
        int iB = aunhVar.b(26);
        return (iB == 0 || aunhVar.b.get(iB + aunhVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nbl
    public final boolean n() {
        aunh aunhVar = this.b;
        int iB = aunhVar.b(10);
        return (iB == 0 || aunhVar.b.get(iB + aunhVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nbl
    public final boolean o() {
        aunh aunhVar = this.b;
        int iB = aunhVar.b(6);
        return (iB == 0 || aunhVar.b.get(iB + aunhVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nbl
    public final boolean p() {
        aunh aunhVar = this.b;
        int iB = aunhVar.b(4);
        return (iB == 0 || aunhVar.b.get(iB + aunhVar.a) == 0) ? false : true;
    }
}
