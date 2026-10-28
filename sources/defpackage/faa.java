package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class faa implements fac {
    private final ByteBuffer a;

    public faa(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    @Override // defpackage.fac
    public final int a() {
        return (d() << 8) | d();
    }

    @Override // defpackage.fac
    public final int b(byte[] bArr, int i) {
        ByteBuffer byteBuffer = this.a;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // defpackage.fac
    public final long c(long j) {
        ByteBuffer byteBuffer = this.a;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    @Override // defpackage.fac
    public final short d() throws fab {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() > 0) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new fab();
    }
}
