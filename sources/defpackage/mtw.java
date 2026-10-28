package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mtw extends mff implements myi {
    private agev a;
    private agev b;
    private final ahuj c;

    public mtw(ahuj ahujVar) {
        this.c = ahujVar;
    }

    private final void l() {
        if (this.b == null) {
            ahuj ahujVar = this.c;
            zh zhVar = new zh((byte[]) null);
            int iB = ahujVar.b(6);
            if (iB != 0) {
                zhVar.i(iB + ahujVar.a, ahujVar.b);
            } else {
                zhVar = null;
            }
            this.b = zhVar == null ? agdf.a : agev.i(new mvt(zhVar));
        }
    }

    private final void m() {
        if (this.a == null) {
            ahuj ahujVar = this.c;
            zh zhVar = new zh((byte[]) null);
            int iB = ahujVar.b(4);
            if (iB != 0) {
                zhVar.i(iB + ahujVar.a, ahujVar.b);
            } else {
                zhVar = null;
            }
            this.a = zhVar == null ? agdf.a : agev.i(new mvt(zhVar));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahuj ahujVar = this.c;
            ahuj ahujVar2 = ((mtw) obj).c;
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

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ndq] */
    @Override // defpackage.myi
    public final /* bridge */ /* synthetic */ ndq g() {
        l();
        if (this.b.g()) {
            return this.b.c();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ndq] */
    @Override // defpackage.myi
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

    @Override // defpackage.myi
    public final boolean i() {
        l();
        return this.b.g();
    }

    @Override // defpackage.myi
    public final boolean j() {
        m();
        return this.a.g();
    }

    @Override // defpackage.myi
    public final int k() {
        ahuj ahujVar = this.c;
        int iB = ahujVar.b(8);
        int iAS = a.aS(iB != 0 ? ahujVar.b.getInt(iB + ahujVar.a) : 0);
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }
}
