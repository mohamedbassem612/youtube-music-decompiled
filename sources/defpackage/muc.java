package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class muc extends mff implements myv {
    private agev b;
    private agev c;
    private final aunf d;

    public muc(aunf aunfVar) {
        this.d = aunfVar;
    }

    private final void l() {
        if (this.c == null) {
            aunf aunfVar = this.d;
            ahuj ahujVar = new ahuj();
            int iB = aunfVar.b(8);
            if (iB != 0) {
                ahujVar.f(aunfVar.a(iB + aunfVar.a), aunfVar.b);
            } else {
                ahujVar = null;
            }
            this.c = ahujVar == null ? agdf.a : agev.i(new mug(ahujVar));
        }
    }

    private final void m() {
        if (this.b == null) {
            aunf aunfVar = this.d;
            ahuj ahujVar = new ahuj();
            int iB = aunfVar.b(6);
            if (iB != 0) {
                ahujVar.f(aunfVar.a(iB + aunfVar.a), aunfVar.b);
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
            aunf aunfVar = this.d;
            aunf aunfVar2 = ((muc) obj).d;
            if (aunfVar == aunfVar2) {
                return true;
            }
            ByteBuffer byteBuffer = aunfVar.b;
            ByteBuffer byteBuffer2 = aunfVar2.b;
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
    @Override // defpackage.myv
    public final /* bridge */ /* synthetic */ mzg g() {
        l();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.myv
    public final /* bridge */ /* synthetic */ mzg h() {
        m();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.d.b.hashCode();
    }

    @Override // defpackage.myv
    public final boolean i() {
        l();
        return this.c.g();
    }

    @Override // defpackage.myv
    public final boolean j() {
        m();
        return this.b.g();
    }

    @Override // defpackage.myv
    public final int k() {
        aunf aunfVar = this.d;
        int iB = aunfVar.b(4);
        int iAS = a.aS(iB != 0 ? aunfVar.b.getInt(iB + aunfVar.a) : 0);
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }
}
