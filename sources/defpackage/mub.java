package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mub extends mff implements myr {
    private agev a;
    private agev b;
    private agev c;
    private agev d;
    private agev e;
    private final ahuj f;

    public mub(ahuj ahujVar) {
        this.f = ahujVar;
    }

    private final void q() {
        if (this.a == null) {
            ahuj ahujVar = this.f;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(4);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.a = ahujVar2 == null ? agdf.a : agev.i(new mun(ahujVar2));
        }
    }

    private final void r() {
        if (this.c == null) {
            ahuj ahujVar = this.f;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(8);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.c = ahujVar2 == null ? agdf.a : agev.i(new muq(ahujVar2));
        }
    }

    private final void s() {
        if (this.e == null) {
            ahuj ahujVar = this.f;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(12);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.e = ahujVar2 == null ? agdf.a : agev.i(new mux(ahujVar2));
        }
    }

    private final void t() {
        if (this.b == null) {
            ahuj ahujVar = this.f;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(6);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.b = ahujVar2 == null ? agdf.a : agev.i(new mvu(ahujVar2));
        }
    }

    private final void u() {
        if (this.d == null) {
            ahuj ahujVar = this.f;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(10);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.d = ahujVar2 == null ? agdf.a : agev.i(new mvw(ahujVar2));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.f;
            ahuj ahujVar2 = ((mub) obj).f;
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

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nae] */
    @Override // defpackage.myr
    public final /* bridge */ /* synthetic */ nae g() {
        q();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nan] */
    @Override // defpackage.myr
    public final /* bridge */ /* synthetic */ nan h() {
        r();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.f.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nbm] */
    @Override // defpackage.myr
    public final /* bridge */ /* synthetic */ nbm i() {
        s();
        if (this.e.g()) {
            return this.e.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ndr] */
    @Override // defpackage.myr
    public final /* bridge */ /* synthetic */ ndr j() {
        t();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ndw] */
    @Override // defpackage.myr
    public final /* bridge */ /* synthetic */ ndw k() {
        u();
        if (this.d.g()) {
            return this.d.c();
        }
        return null;
    }

    @Override // defpackage.myr
    public final boolean l() {
        q();
        return this.a.g();
    }

    @Override // defpackage.myr
    public final boolean m() {
        r();
        return this.c.g();
    }

    @Override // defpackage.myr
    public final boolean n() {
        s();
        return this.e.g();
    }

    @Override // defpackage.myr
    public final boolean o() {
        t();
        return this.b.g();
    }

    @Override // defpackage.myr
    public final boolean p() {
        u();
        return this.d.g();
    }
}
