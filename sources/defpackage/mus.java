package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mus extends mff implements nay {
    private agev a;
    private agev b;
    private final ahuj c;

    public mus(ahuj ahujVar) {
        this.c = ahujVar;
    }

    private final void o() {
        if (this.b == null) {
            ahuj ahujVar = this.c;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(6);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.b = ahujVar2 == null ? agdf.a : agev.i(new mvv(ahujVar2));
        }
    }

    private final void p() {
        if (this.a == null) {
            ahuj ahujVar = this.c;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(4);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.a = ahujVar2 == null ? agdf.a : agev.i(new mwj(ahujVar2));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.c;
            ahuj ahujVar2 = ((mus) obj).c;
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

    @Override // defpackage.nay
    public final int g() {
        ahuj ahujVar = this.c;
        int iB = ahujVar.b(8);
        if (iB != 0) {
            return ahujVar.d(iB);
        }
        return 0;
    }

    @Override // defpackage.nay
    public final /* synthetic */ nay h(int i) {
        ahuj ahujVar = new ahuj();
        ahuj ahujVar2 = this.c;
        int iB = ahujVar2.b(8);
        if (iB != 0) {
            ahujVar.f(ahujVar2.a(ahujVar2.c(iB) + (i << 2)), ahujVar2.b);
        } else {
            ahujVar = null;
        }
        if (ahujVar != null) {
            return new mus(ahujVar);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int hashCode() {
        return this.c.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nds] */
    @Override // defpackage.nay
    public final /* bridge */ /* synthetic */ nds i() {
        o();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, nff] */
    @Override // defpackage.nay
    public final /* bridge */ /* synthetic */ nff j() {
        p();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    @Override // defpackage.nay
    public final String k() {
        return this.c.j();
    }

    @Override // defpackage.nay
    public final boolean l() {
        return this.c.j() != null;
    }

    @Override // defpackage.nay
    public final boolean m() {
        o();
        return this.b.g();
    }

    @Override // defpackage.nay
    public final boolean n() {
        p();
        return this.a.g();
    }
}
