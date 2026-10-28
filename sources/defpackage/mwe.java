package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mwe extends mff implements ner {
    private agev b;
    private agev c;
    private final ahuj d;

    public mwe(ahuj ahujVar) {
        this.d = ahujVar;
    }

    private final void o() {
        if (this.b == null) {
            ahuj ahujVar = this.d;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(4);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.b = ahujVar2 == null ? agdf.a : agev.i(new mtf(ahujVar2));
        }
    }

    private final void p() {
        if (this.c == null) {
            ahuj ahujVar = this.d;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(8);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.c = ahujVar2 == null ? agdf.a : agev.i(new mtf(ahujVar2));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.d;
            ahuj ahujVar2 = ((mwe) obj).d;
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

    @Override // defpackage.ner
    public final int g() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(12);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(iB + ahujVar.a)) & 4294967295L : 0L);
    }

    @Override // defpackage.ner
    public final int h() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(6);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(iB + ahujVar.a)) & 4294967295L : 0L);
    }

    public final int hashCode() {
        return this.d.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mxc] */
    @Override // defpackage.ner
    public final /* bridge */ /* synthetic */ mxc i() {
        o();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mxc] */
    @Override // defpackage.ner
    public final /* bridge */ /* synthetic */ mxc j() {
        p();
        if (this.c.g()) {
            return this.c.c();
        }
        return null;
    }

    @Override // defpackage.ner
    public final boolean k() {
        ahuj ahujVar = this.d;
        int iB = ahujVar.b(14);
        return (iB == 0 || ahujVar.b.get(iB + ahujVar.a) == 0) ? false : true;
    }

    @Override // defpackage.ner
    public final boolean l() {
        return aewo.al(this.d, 6);
    }

    @Override // defpackage.ner
    public final boolean m() {
        o();
        return this.b.g();
    }

    @Override // defpackage.ner
    public final boolean n() {
        p();
        return this.c.g();
    }
}
