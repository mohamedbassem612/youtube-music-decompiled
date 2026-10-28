package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class muq extends mff implements nan {
    private agev a;
    private final ahuj b;

    public muq(ahuj ahujVar) {
        this.b = ahujVar;
    }

    private final void k() {
        if (this.a == null) {
            ahuj ahujVar = this.b;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(6);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.a = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.b;
            ahuj ahujVar2 = ((muq) obj).b;
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

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.nan
    public final /* bridge */ /* synthetic */ mzg g() {
        k();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    @Override // defpackage.nan
    public final boolean h() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(4);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    @Override // defpackage.nan
    public final boolean i() {
        return aewo.al(this.b, 4);
    }

    @Override // defpackage.nan
    public final boolean j() {
        k();
        return this.a.g();
    }
}
