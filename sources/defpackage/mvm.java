package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mvm extends mff implements ncw {
    private agev b;
    private agev c;
    private agev d;
    private agev e;
    private agev f;
    private final ahuj g;

    public mvm(ahuj ahujVar) {
        this.g = ahujVar;
    }

    private final void r() {
        if (this.b == null) {
            ahuj ahujVar = this.g;
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

    private final void s() {
        if (this.c == null) {
            ahuj ahujVar = this.g;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(6);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.c = ahujVar2 == null ? agdf.a : agev.i(new mvn(ahujVar2));
        }
    }

    private final void t() {
        if (this.e == null) {
            ahuj ahujVar = this.g;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(10);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.e = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void u() {
        if (this.f == null) {
            ahuj ahujVar = this.g;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(12);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.f = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void v() {
        if (this.d == null) {
            ahuj ahujVar = this.g;
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
            ahuj ahujVar = this.g;
            ahuj ahujVar2 = ((mvm) obj).g;
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

    @Override // defpackage.ncw
    public final int g() {
        ahuj ahujVar = this.g;
        int iB = ahujVar.b(14);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(iB + ahujVar.a)) & 4294967295L : 0L);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.ncw
    public final /* bridge */ /* synthetic */ mzg h() {
        t();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.g.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.ncw
    public final /* bridge */ /* synthetic */ mzg i() {
        u();
        if (this.f.g()) {
            return this.f.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.ncw
    public final /* bridge */ /* synthetic */ mzg j() {
        v();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ncy] */
    @Override // defpackage.ncw
    public final /* bridge */ /* synthetic */ ncy k() {
        r();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ncy] */
    @Override // defpackage.ncw
    public final /* bridge */ /* synthetic */ ncy l() {
        s();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    @Override // defpackage.ncw
    public final boolean m() {
        r();
        return this.b.g();
    }

    @Override // defpackage.ncw
    public final boolean n() {
        s();
        return this.c.g();
    }

    @Override // defpackage.ncw
    public final boolean o() {
        t();
        return this.e.g();
    }

    @Override // defpackage.ncw
    public final boolean p() {
        u();
        return this.f.g();
    }

    @Override // defpackage.ncw
    public final boolean q() {
        v();
        return this.d.g();
    }
}
