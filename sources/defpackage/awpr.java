package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class awpr extends ByteArrayOutputStream {
    public awpr() {
        super(8193);
    }

    public final byte[] a() {
        byte[] bArr = this.buf;
        bArr.getClass();
        return bArr;
    }

    public final ByteBuffer b() {
        return ByteBuffer.wrap(this.buf, 0, this.count);
    }

    public awpr(byte[] bArr) {
    }
}
