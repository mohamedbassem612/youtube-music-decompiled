package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class epm implements epn {
    private final ByteBuffer a;

    public epm(ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }

    @Override // defpackage.epn
    public final long a() {
        return this.a.capacity();
    }

    @Override // defpackage.epn
    public final void b(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer byteBufferSlice;
        ByteBuffer byteBuffer = this.a;
        synchronized (byteBuffer) {
            int i2 = (int) j;
            byteBuffer.position(i2);
            byteBuffer.limit(i2 + i);
            byteBufferSlice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }
}
