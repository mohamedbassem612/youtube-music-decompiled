package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mtg extends mff implements mxe {
    private agev a;
    private agev b;
    private agev c;
    private final ahuj d;

    public mtg(ahuj ahujVar) {
        this.d = ahujVar;
    }

    private final void p() {
        if (this.b == null) {
            ahuj ahujVar = this.d;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(10);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.b = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void q() {
        if (this.a == null) {
            ahuj ahujVar = this.d;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(8);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.a = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void r() {
        if (this.c == null) {
            ahuj ahujVar = this.d;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(12);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.c = ahujVar2 == null ? agdf.a : agev.i(new mui(ahujVar2));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.d;
            ahuj ahujVar2 = ((mtg) obj).d;
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

    @Override // defpackage.mxe
    public final int g() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(6);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(iB + ahujVar.a)) & 4294967295L : 0L);
    }

    @Override // defpackage.mxe
    public final int h() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(4);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(iB + ahujVar.a)) & 4294967295L : 0L);
    }

    public final int hashCode() {
        return this.d.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.mxe
    public final /* bridge */ /* synthetic */ mzg i() {
        p();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.mxe
    public final /* bridge */ /* synthetic */ mzg j() {
        q();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzi] */
    @Override // defpackage.mxe
    public final /* bridge */ /* synthetic */ mzi k() {
        r();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    @Override // defpackage.mxe
    public final boolean l() {
        return aewo.al(this.d, 6);
    }

    @Override // defpackage.mxe
    public final boolean m() {
        p();
        return this.b.g();
    }

    @Override // defpackage.mxe
    public final boolean n() {
        q();
        return this.a.g();
    }

    @Override // defpackage.mxe
    public final boolean o() {
        r();
        return this.c.g();
    }
}
