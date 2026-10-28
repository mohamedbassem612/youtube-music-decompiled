package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mvr extends mff implements ndg {
    private agev b;
    private agev c;
    private agev d;
    private agev e;
    private agev f;
    private agev g;
    private final ahuj h;

    public mvr(ahuj ahujVar) {
        this.h = ahujVar;
    }

    private final void u() {
        if (this.g == null) {
            ahuj ahujVar = this.h;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(16);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.g = ahujVar2 == null ? agdf.a : agev.i(new mvp(ahujVar2));
        }
    }

    private final void v() {
        if (this.f == null) {
            ahuj ahujVar = this.h;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(20);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.f = ahujVar2 == null ? agdf.a : agev.i(new mug(ahujVar2));
        }
    }

    private final void w() {
        if (this.d == null) {
            ahuj ahujVar = this.h;
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

    private final void x() {
        if (this.e == null) {
            ahuj ahujVar = this.h;
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

    private final void y() {
        if (this.b == null) {
            ahuj ahujVar = this.h;
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

    private final void z() {
        if (this.c == null) {
            ahuj ahujVar = this.h;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.h;
            ahuj ahujVar2 = ((mvr) obj).h;
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

    @Override // defpackage.ndg
    public final int g() {
        ahuj ahujVar = this.h;
        int iB = ahujVar.b(18);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(iB + ahujVar.a)) & 4294967295L : 0L);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.ndg
    public final /* bridge */ /* synthetic */ mzg h() {
        v();
        if (this.f.g()) {
            return this.f.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.h.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.ndg
    public final /* bridge */ /* synthetic */ mzg i() {
        w();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mzg] */
    @Override // defpackage.ndg
    public final /* bridge */ /* synthetic */ mzg j() {
        x();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ncy] */
    @Override // defpackage.ndg
    public final /* bridge */ /* synthetic */ ncy k() {
        y();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ncy] */
    @Override // defpackage.ndg
    public final /* bridge */ /* synthetic */ ncy l() {
        z();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nda] */
    @Override // defpackage.ndg
    public final /* bridge */ /* synthetic */ nda m() {
        u();
        if (this.g.g()) {
            return this.g.c();
        }
        return null;
    }

    @Override // defpackage.ndg
    public final String n() {
        ahuj ahujVar = this.h;
        int iB = ahujVar.b(12);
        if (iB != 0) {
            return ahujVar.e(iB + ahujVar.a);
        }
        return null;
    }

    @Override // defpackage.ndg
    public final boolean o() {
        u();
        return this.g.g();
    }

    @Override // defpackage.ndg
    public final boolean p() {
        v();
        return this.f.g();
    }

    @Override // defpackage.ndg
    public final boolean q() {
        w();
        return this.d.g();
    }

    @Override // defpackage.ndg
    public final boolean r() {
        x();
        return this.e.g();
    }

    @Override // defpackage.ndg
    public final boolean s() {
        y();
        return this.b.g();
    }

    @Override // defpackage.ndg
    public final boolean t() {
        z();
        return this.c.g();
    }
}
