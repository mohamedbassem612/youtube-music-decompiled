package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mtx extends mff implements myj {
    private agev a;
    private final ahuj b;

    public mtx(ahuj ahujVar) {
        this.b = ahujVar;
    }

    private final void n() {
        if (this.a == null) {
            ahuj ahujVar = this.b;
            ahuj ahujVar2 = new ahuj();
            int iB = ahujVar.b(10);
            if (iB != 0) {
                ahujVar2.f(ahujVar.a(iB + ahujVar.a), ahujVar.b);
            } else {
                ahujVar2 = null;
            }
            this.a = ahujVar2 == null ? agdf.a : agev.i(new mtw(ahujVar2));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.b;
            ahuj ahujVar2 = ((mtx) obj).b;
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

    @Override // defpackage.myj
    public final float g() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(8);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.myj
    public final float h(int i) {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(6);
        if (iB != 0) {
            return ahujVar.b.getFloat(ahujVar.c(iB) + (i << 2));
        }
        return 0.0f;
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    @Override // defpackage.myj
    public final int i(int i) {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(4);
        return (int) (iB != 0 ? ((long) ahujVar.b.getInt(ahujVar.c(iB) + (i << 2))) & 4294967295L : 0L);
    }

    @Override // defpackage.myj
    public final int j() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(4);
        if (iB != 0) {
            return ahujVar.d(iB);
        }
        return 0;
    }

    @Override // defpackage.myj
    public final int k() {
        ahuj ahujVar = this.b;
        int iB = ahujVar.b(6);
        if (iB != 0) {
            return ahujVar.d(iB);
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, myi] */
    @Override // defpackage.myj
    public final /* bridge */ /* synthetic */ myi l() {
        n();
        if (this.a.g()) {
            return this.a.c();
        }
        return null;
    }

    @Override // defpackage.myj
    public final boolean m() {
        n();
        return this.a.g();
    }
}
