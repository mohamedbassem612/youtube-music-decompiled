package defpackage;

import internal.org.jni_zero.CommonApis;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aumd implements Closeable {
    final ByteBuffer a;

    public aumd(byte[] bArr) {
        this.a = ByteBuffer.wrap(bArr);
    }

    public final int a(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.a;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() != 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    public final long b() {
        return this.a.position();
    }

    public final long c() {
        return this.a.capacity();
    }

    public final void d(long j) {
        this.a.position(CommonApis.p(j));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
