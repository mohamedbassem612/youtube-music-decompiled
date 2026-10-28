package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mul extends mff implements mzt {
    private final ahuj b;

    public mul(ahuj ahujVar) {
        this.b = ahujVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.b;
            ahuj ahujVar2 = ((mul) obj).b;
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

    @Override // defpackage.mzt
    public final int g(int i) {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(22);
        if (iB != 0) {
            return ahujVar.b.getInt(ahujVar.c(iB) + (i << 2));
        }
        return 0;
    }

    @Override // defpackage.mzt
    public final int h() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(22);
        if (iB != 0) {
            return ahujVar.d(iB);
        }
        return 0;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    @Override // defpackage.mzt
    public final long i() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(14);
        if (iB != 0) {
            return ahujVar.b.getLong(iB + ahujVar.a);
        }
        return 0L;
    }

    @Override // defpackage.mzt
    public final String j() {
        return this.b.n();
    }

    @Override // defpackage.mzt
    public final ByteBuffer k() {
        return this.b.g(18);
    }

    @Override // defpackage.mzt
    public final ByteBuffer l() {
        return this.b.g(16);
    }

    @Override // defpackage.mzt
    public final boolean m() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(26);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.mzt
    public final boolean n() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(20);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.mzt
    public final boolean o() {
        return this.b.g(18) != null;
    }

    @Override // defpackage.mzt
    public final boolean p() {
        return this.b.n() != null;
    }
}
