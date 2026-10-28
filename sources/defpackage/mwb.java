package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mwb extends mff implements nei {
    private final ahuj a;

    public mwb(ahuj ahujVar) {
        this.a = ahujVar;
    }

    @Override // defpackage.nei
    public final boolean aA() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(4);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nei
    public final boolean aB() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(6);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nei
    public final boolean aC() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(12);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nei
    public final boolean aD() {
        return aewo.al(this.a, 18);
    }

    @Override // defpackage.nei
    public final boolean aE() {
        return aewo.al(this.a, 8);
    }

    @Override // defpackage.nei
    public final boolean aF() {
        return aewo.al(this.a, 10);
    }

    @Override // defpackage.nei
    public final boolean aG() {
        return aewo.al(this.a, 16);
    }

    @Override // defpackage.nei
    public final boolean aH() {
        return aewo.al(this.a, 14);
    }

    @Override // defpackage.nei
    public final boolean aI() {
        return aewo.al(this.a, 4);
    }

    @Override // defpackage.nei
    public final boolean aJ() {
        return aewo.al(this.a, 6);
    }

    @Override // defpackage.nei
    public final boolean aK() {
        return aewo.al(this.a, 12);
    }

    @Override // defpackage.nei
    public final boolean av() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(18);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nei
    public final boolean aw() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(8);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nei
    public final boolean ax() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(10);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nei
    public final boolean ay() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(16);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nei
    public final boolean az() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(14);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.a;
            ahuj ahujVar2 = ((mwb) obj).a;
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
