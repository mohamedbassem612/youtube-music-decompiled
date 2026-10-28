package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mvj extends mff implements ncl {
    private agev a;
    private agev b;
    private final auni c;

    public mvj(auni auniVar) {
        this.c = auniVar;
    }

    private final void q() {
        if (this.a == null) {
            auni auniVar = this.c;
            ahuj ahujVar = new ahuj();
            int iB = auniVar.b(8);
            if (iB != 0) {
                ahujVar.f(auniVar.a(iB + auniVar.a), auniVar.b);
            } else {
                ahujVar = null;
            }
            this.a = ahujVar == null ? agdf.a : agev.i(new mvf(ahujVar));
        }
    }

    private final void r() {
        if (this.b == null) {
            auni auniVar = this.c;
            ahuj ahujVar = new ahuj();
            int iB = auniVar.b(14);
            if (iB != 0) {
                ahujVar.f(auniVar.a(iB + auniVar.a), auniVar.b);
            } else {
                ahujVar = null;
            }
            this.b = ahujVar == null ? agdf.a : agev.i(new mvg(ahujVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            auni auniVar = this.c;
            auni auniVar2 = ((mvj) obj).c;
            if (auniVar == auniVar2) {
                return true;
            }
            ByteBuffer byteBuffer = auniVar.b;
            ByteBuffer byteBuffer2 = auniVar2.b;
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

    @Override // defpackage.ncl
    public final int g() {
        auni auniVar = this.c;
        int iB = auniVar.b(12);
        return (int) (iB != 0 ? ((long) auniVar.b.getInt(iB + auniVar.a)) & 4294967295L : 0L);
    }

    @Override // defpackage.ncl
    public final int h() {
        auni auniVar = this.c;
        int iB = auniVar.b(10);
        return (int) (iB != 0 ? ((long) auniVar.b.getInt(iB + auniVar.a)) & 4294967295L : 0L);
    }

    public final int hashCode() {
        return this.c.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ncf] */
    @Override // defpackage.ncl
    public final /* bridge */ /* synthetic */ ncf i() {
        q();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nch] */
    @Override // defpackage.ncl
    public final /* bridge */ /* synthetic */ nch j() {
        r();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    @Override // defpackage.ncl
    public final String k() {
        return this.c.h();
    }

    @Override // defpackage.ncl
    public final ByteBuffer l() {
        return this.c.g(6);
    }

    @Override // defpackage.ncl
    public final boolean m() {
        q();
        return this.a.g();
    }

    @Override // defpackage.ncl
    public final boolean n() {
        r();
        return this.b.g();
    }

    @Override // defpackage.ncl
    public final boolean o() {
        return this.c.g(6) != null;
    }

    @Override // defpackage.ncl
    public final boolean p() {
        return this.c.h() != null;
    }
}
