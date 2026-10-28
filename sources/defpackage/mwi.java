package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mwi extends mff implements nfc {
    private agev a;
    private agev b;
    private agev c;
    private final ahuj d;

    public mwi(ahuj ahujVar) {
        this.d = ahujVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.d;
            ahuj ahujVar2 = ((mwi) obj).d;
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

    @Override // defpackage.nfc
    public final float g() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(18);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.nfc
    public final float h() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(12);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.d.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, new] */
    @Override // defpackage.nfc
    public final /* synthetic */ Cnew i() {
        agev agevVarI = this.a;
        if (agevVarI == null) {
            ahuj ahujVar = this.d;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(6);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            agevVarI = ahujVar2 == null ? agdf.a : agev.i(new mwf(ahujVar2));
            this.a = agevVarI;
        }
        if (agevVarI.g()) {
            return this.a.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ney] */
    @Override // defpackage.nfc
    public final /* synthetic */ ney j() {
        agev agevVarI = this.c;
        if (agevVarI == null) {
            ahuj ahujVar = this.d;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(16);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            agevVarI = ahujVar2 == null ? agdf.a : agev.i(new mwg(ahujVar2));
            this.c = agevVarI;
        }
        if (agevVarI.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ney] */
    @Override // defpackage.nfc
    public final /* synthetic */ ney k() {
        agev agevVarI = this.b;
        if (agevVarI == null) {
            ahuj ahujVar = this.d;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(10);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            agevVarI = ahujVar2 == null ? agdf.a : agev.i(new mwg(ahujVar2));
            this.b = agevVarI;
        }
        if (agevVarI.g()) {
            return this.b.c();
        }
        return null;
    }

    @Override // defpackage.nfc
    public final nfe l() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(4);
        nfe nfeVarA = nfe.a(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        return nfeVarA == null ? nfe.a : nfeVarA;
    }

    @Override // defpackage.nfc
    public final boolean m() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(14);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.nfc
    public final boolean n() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(8);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }
}
