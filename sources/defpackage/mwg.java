package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mwg extends mff implements ney {
    private agev a;
    private agev b;
    private final ahuj c;

    public mwg(ahuj ahujVar) {
        this.c = ahujVar;
    }

    private final void m() {
        if (this.a == null) {
            ahuj ahujVar = this.c;
            zh zhVar = new zh((byte[]) null);
            int iB = ahujVar.b(6);
            if (iB != 0) {
                zhVar.i(iB + ahujVar.a, ahujVar.b);
            } else {
                zhVar = null;
            }
            this.a = zhVar == null ? agdf.a : agev.i(new mvt(zhVar));
        }
    }

    private final void n() {
        if (this.b == null) {
            ahuj ahujVar = this.c;
            zh zhVar = new zh((byte[]) null);
            int iB = ahujVar.b(8);
            if (iB != 0) {
                zhVar.i(iB + ahujVar.a, ahujVar.b);
            } else {
                zhVar = null;
            }
            this.b = zhVar == null ? agdf.a : agev.i(new mwa(zhVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.c;
            ahuj ahujVar2 = ((mwg) obj).c;
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

    @Override // defpackage.ney
    public final float g() {
        ahuj ahujVar = this.c;
        int iB = ahujVar.b(4);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 0.0f;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ndq] */
    @Override // defpackage.ney
    public final /* bridge */ /* synthetic */ ndq h() {
        m();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    public final int hashCode() {
        return this.c.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, neh] */
    @Override // defpackage.ney
    public final /* bridge */ /* synthetic */ neh i() {
        n();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    @Override // defpackage.ney
    public final boolean j() {
        return aewo.al(this.c, 4);
    }

    @Override // defpackage.ney
    public final boolean k() {
        m();
        return this.a.g();
    }

    @Override // defpackage.ney
    public final boolean l() {
        n();
        return this.b.g();
    }
}
