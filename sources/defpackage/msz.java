package defpackage;

import internal.org.jni_zero.CommonApis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class msz extends mff implements mwo {
    private final aund b;

    public msz(aund aundVar) {
        this.b = aundVar;
    }

    @Override // defpackage.mwo
    public final int bA(int i) {
        aund aundVar = this.b;
        int iB = aundVar.b(12);
        int iG = CommonApis.g(iB != 0 ? aundVar.b.getInt(aundVar.c(iB) + (i << 2)) : 0);
        if (iG == 0) {
            return 1;
        }
        return iG;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aund aundVar = this.b;
            aund aundVar2 = ((msz) obj).b;
            if (aundVar == aundVar2) {
                return true;
            }
            ByteBuffer byteBuffer = aundVar.b;
            ByteBuffer byteBuffer2 = aundVar2.b;
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

    @Override // defpackage.mwo
    public final int g() {
        aund aundVar = this.b;
        int iB = aundVar.b(12);
        if (iB != 0) {
            return aundVar.d(iB);
        }
        return 0;
    }

    @Override // defpackage.mwo
    public final String h() {
        aund aundVar = this.b;
        int iB = aundVar.b(6);
        if (iB != 0) {
            return aundVar.e(iB + aundVar.a);
        }
        return null;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    @Override // defpackage.mwo
    public final String i() {
        return this.b.s();
    }

    @Override // defpackage.mwo
    public final String j() {
        aund aundVar = this.b;
        int iB = aundVar.b(4);
        if (iB != 0) {
            return aundVar.e(iB + aundVar.a);
        }
        return null;
    }

    @Override // defpackage.mwo
    public final boolean k() {
        aund aundVar = this.b;
        int iB = aundVar.b(14);
        return (iB == 0 || aundVar.b.get(iB + aundVar.a) == 0) ? false : true;
    }

    @Override // defpackage.mwo
    public final boolean l() {
        return this.b.s() != null;
    }

    @Override // defpackage.mwo
    public final boolean m() {
        return aewo.al(this.b, 14);
    }

    @Override // defpackage.mwo
    public final int n() {
        aund aundVar = this.b;
        int iB = aundVar.b(16);
        int iBc = a.bc(iB != 0 ? aundVar.b.getInt(iB + aundVar.a) : 0);
        if (iBc == 0) {
            return 1;
        }
        return iBc;
    }
}
