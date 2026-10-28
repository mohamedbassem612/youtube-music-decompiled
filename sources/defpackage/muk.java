package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class muk extends mff implements mzn {
    private agev a;
    private agev b;
    private final ahuj c;

    public muk(ahuj ahujVar) {
        this.c = ahujVar;
    }

    private final void l() {
        if (this.a == null) {
            ahuj ahujVar = this.c;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(4);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.a = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void m() {
        if (this.b == null) {
            ahuj ahujVar = this.c;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(6);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.b = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.c;
            ahuj ahujVar2 = ((muk) obj).c;
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
    @Override // defpackage.mzn
    public final /* bridge */ /* synthetic */ mzg g() {
        l();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.mzn
    public final /* bridge */ /* synthetic */ mzg h() {
        m();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.c.b.hashCode();
    }

    @Override // defpackage.mzn
    public final boolean i() {
        l();
        return this.a.g();
    }

    @Override // defpackage.mzn
    public final boolean j() {
        m();
        return this.b.g();
    }

    @Override // defpackage.mzn
    public final int k() {
        ahuj ahujVar = this.c;
        int iB = ahujVar.b(8);
        int iAS = a.aS(iB != 0 ? ahujVar.b.getShort(iB + ahujVar.a) : (short) 0);
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }
}
