package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tgb extends tgd {
    private final byte[] a;
    private final int d;
    private ByteBuffer e;

    public tgb(byte[] bArr, int i, String str) {
        super(i, str);
        this.a = bArr;
        this.d = i;
        this.e = null;
    }

    @Override // defpackage.tgd
    public final InputStream a() {
        return new tpe(this.a, this.d);
    }

    @Override // defpackage.tgd
    public final ByteBuffer b() {
        ByteBuffer byteBufferWrap = this.e;
        if (byteBufferWrap == null) {
            byteBufferWrap = ByteBuffer.wrap(this.a, 0, this.d);
            this.e = byteBufferWrap;
        }
        return byteBufferWrap.duplicate();
    }

    @Override // defpackage.tgd
    public final byte[] c() {
        byte[] bArr = this.a;
        if (this.d == bArr.length) {
            return bArr;
        }
        return null;
    }
}
