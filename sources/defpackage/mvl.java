package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mvl extends mff implements nct {
    private agev b;
    private agev c;
    private agev d;
    private final ahuj e;

    public mvl(ahuj ahujVar) {
        this.e = ahujVar;
    }

    private final void m() {
        if (this.c == null) {
            ahuj ahujVar = this.e;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(6);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.c = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void n() {
        if (this.b == null) {
            ahuj ahujVar = this.e;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(4);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.b = ahujVar2 == null ? agdf.a : agev.i(new mvn(ahujVar2));
        }
    }

    private final void o() {
        if (this.d == null) {
            ahuj ahujVar = this.e;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(8);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.d = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.e;
            ahuj ahujVar2 = ((mvl) obj).e;
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
    @Override // defpackage.nct
    public final /* bridge */ /* synthetic */ mzg g() {
        m();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.nct
    public final /* bridge */ /* synthetic */ mzg h() {
        o();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.e.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ncy] */
    @Override // defpackage.nct
    public final /* bridge */ /* synthetic */ ncy i() {
        n();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    @Override // defpackage.nct
    public final boolean j() {
        m();
        return this.c.g();
    }

    @Override // defpackage.nct
    public final boolean k() {
        n();
        return this.b.g();
    }

    @Override // defpackage.nct
    public final boolean l() {
        o();
        return this.d.g();
    }
}
