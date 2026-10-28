package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mtm extends mff implements mxk {
    private final ahuj a;

    public mtm(ahuj ahujVar) {
        this.a = ahujVar;
    }

    @Override // defpackage.mxk
    public final int aO() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(6);
        int iBi = a.bi(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iBi == 0) {
            return 1;
        }
        return iBi;
    }

    @Override // defpackage.mxk
    public final int aP() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(10);
        int iBi = a.bi(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iBi == 0) {
            return 1;
        }
        return iBi;
    }

    @Override // defpackage.mxk
    public final float ca() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(14);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.mxk
    public final float cb() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(18);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.mxk
    public final float cc() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(16);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.mxk
    public final float cd() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(12);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.mxk
    public final float ce() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(4);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.mxk
    public final float cf() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(8);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.mxk
    public final boolean cg() {
        return aewo.al(this.a, 14);
    }

    @Override // defpackage.mxk
    public final boolean ch() {
        return aewo.al(this.a, 18);
    }

    @Override // defpackage.mxk
    public final boolean ci() {
        return aewo.al(this.a, 16);
    }

    @Override // defpackage.mxk
    public final boolean cj() {
        return aewo.al(this.a, 12);
    }

    @Override // defpackage.mxk
    public final boolean ck() {
        return aewo.al(this.a, 4);
    }

    @Override // defpackage.mxk
    public final boolean cl() {
        return aewo.al(this.a, 6);
    }

    @Override // defpackage.mxk
    public final boolean cm() {
        return aewo.al(this.a, 8);
    }

    @Override // defpackage.mxk
    public final boolean cn() {
        return aewo.al(this.a, 10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.a;
            ahuj ahujVar2 = ((mtm) obj).a;
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
