package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mti extends mff implements mxg {
    private agev a;
    private agev b;
    private agev c;
    private final ahuj d;

    public mti(ahuj ahujVar) {
        this.d = ahujVar;
    }

    private final void m() {
        if (this.c == null) {
            ahuj ahujVar = this.d;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(8);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.c = ahujVar2 == null ? agdf.a : agev.i(new mtj(ahujVar2));
        }
    }

    private final void n() {
        if (this.a == null) {
            ahuj ahujVar = this.d;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(4);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.a = ahujVar2 == null ? agdf.a : agev.i(new mtk(ahujVar2));
        }
    }

    private final void o() {
        if (this.b == null) {
            ahuj ahujVar = this.d;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(6);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.b = ahujVar2 == null ? agdf.a : agev.i(new mtl(ahujVar2));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.d;
            ahuj ahujVar2 = ((mti) obj).d;
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

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mxh] */
    @Override // defpackage.mxg
    public final /* bridge */ /* synthetic */ mxh g() {
        m();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mxi] */
    @Override // defpackage.mxg
    public final /* bridge */ /* synthetic */ mxi h() {
        n();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.d.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mxj] */
    @Override // defpackage.mxg
    public final /* bridge */ /* synthetic */ mxj i() {
        o();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    @Override // defpackage.mxg
    public final boolean j() {
        m();
        return this.c.g();
    }

    @Override // defpackage.mxg
    public final boolean k() {
        n();
        return this.a.g();
    }

    @Override // defpackage.mxg
    public final boolean l() {
        o();
        return this.b.g();
    }
}
