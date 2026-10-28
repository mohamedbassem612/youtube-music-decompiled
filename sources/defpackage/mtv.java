package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mtv extends mff implements myh {
    private agev b;
    private agev c;
    private agev d;
    private agev e;
    private final aune f;

    public mtv(aune auneVar) {
        this.f = auneVar;
    }

    private final void v() {
        if (this.e == null) {
            aune auneVar = this.f;
            ahuj ahujVar = new ahuj();
            int iB = auneVar.b(20);
            if (iB != 0) {
                ahujVar.f(auneVar.a(iB + auneVar.a), auneVar.b);
            } else {
                ahujVar = null;
            }
            this.e = ahujVar == null ? agdf.a : agev.i(new mtu(ahujVar));
        }
    }

    private final void w() {
        if (this.d == null) {
            aune auneVar = this.f;
            ahuj ahujVar = new ahuj();
            int iB = auneVar.b(14);
            if (iB != 0) {
                ahujVar.f(auneVar.a(iB + auneVar.a), auneVar.b);
            } else {
                ahujVar = null;
            }
            this.d = ahujVar == null ? agdf.a : agev.i(new mwb(ahujVar));
        }
    }

    private final void x() {
        if (this.c == null) {
            aune auneVar = this.f;
            ahuj ahujVar = new ahuj();
            int iB = auneVar.b(16);
            if (iB != 0) {
                ahujVar.f(auneVar.a(iB + auneVar.a), auneVar.b);
            } else {
                ahujVar = null;
            }
            this.c = ahujVar == null ? agdf.a : agev.i(new mty(ahujVar));
        }
    }

    private final void y() {
        if (this.b == null) {
            aune auneVar = this.f;
            ahuj ahujVar = new ahuj();
            int iB = auneVar.b(12);
            if (iB != 0) {
                ahujVar.f(auneVar.a(iB + auneVar.a), auneVar.b);
            } else {
                ahujVar = null;
            }
            this.b = ahujVar == null ? agdf.a : agev.i(new mtx(ahujVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aune auneVar = this.f;
            aune auneVar2 = ((mtv) obj).f;
            if (auneVar == auneVar2) {
                return true;
            }
            ByteBuffer byteBuffer = auneVar.b;
            ByteBuffer byteBuffer2 = auneVar2.b;
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

    @Override // defpackage.myh
    public final float g() {
        aune auneVar = this.f;
        int iB = auneVar.b(4);
        if (iB != 0) {
            return auneVar.b.getFloat(iB + auneVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.myh
    public final float h() {
        aune auneVar = this.f;
        int iB = auneVar.b(8);
        if (iB != 0) {
            return auneVar.b.getFloat(iB + auneVar.a);
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.f.b.hashCode();
    }

    @Override // defpackage.myh
    public final int i() {
        aune auneVar = this.f;
        int iB = auneVar.b(18);
        return (int) (iB != 0 ? ((long) auneVar.b.getInt(iB + auneVar.a)) & 4294967295L : 0L);
    }

    @Override // defpackage.myh
    public final int j() {
        aune auneVar = this.f;
        int iB = auneVar.b(6);
        return (int) (iB != 0 ? ((long) auneVar.b.getInt(iB + auneVar.a)) & 4294967295L : 0L);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mye] */
    @Override // defpackage.myh
    public final /* bridge */ /* synthetic */ mye k() {
        v();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, myj] */
    @Override // defpackage.myh
    public final /* bridge */ /* synthetic */ myj l() {
        y();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, myk] */
    @Override // defpackage.myh
    public final /* bridge */ /* synthetic */ myk m() {
        x();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nei] */
    @Override // defpackage.myh
    public final /* bridge */ /* synthetic */ nei n() {
        w();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    @Override // defpackage.myh
    public final boolean o() {
        aune auneVar = this.f;
        int iB = auneVar.b(10);
        return (iB == 0 || auneVar.b.get(iB + auneVar.a) == 0) ? false : true;
    }

    @Override // defpackage.myh
    public final boolean p() {
        return aewo.al(this.f, 18);
    }

    @Override // defpackage.myh
    public final boolean q() {
        return aewo.al(this.f, 8);
    }

    @Override // defpackage.myh
    public final boolean r() {
        v();
        return this.e.g();
    }

    @Override // defpackage.myh
    public final boolean s() {
        w();
        return this.d.g();
    }

    @Override // defpackage.myh
    public final boolean t() {
        x();
        return this.c.g();
    }

    @Override // defpackage.myh
    public final boolean u() {
        y();
        return this.b.g();
    }
}
