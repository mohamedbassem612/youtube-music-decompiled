package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agwy extends agxa {
    private ByteBuffer a;

    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.a = byteBufferOrder;
        return byteBufferOrder;
    }

    protected void b(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.agxa
    public final void c(char c) {
        ByteBuffer byteBufferA = a();
        byteBufferA.putChar(c);
        d(byteBufferA, 2);
    }

    public final void d(ByteBuffer byteBuffer, int i) {
        try {
            e(byteBuffer.array(), i);
        } finally {
            byteBuffer.clear();
        }
    }

    protected void e(byte[] bArr, int i) {
        throw null;
    }

    @Override // defpackage.agxa, defpackage.agxk
    public final void f(ByteBuffer byteBuffer) {
        b(byteBuffer);
    }

    @Override // defpackage.agxa, defpackage.agxk
    public final void g(byte[] bArr, int i) {
        ahno.N(0, i, bArr.length);
        e(bArr, i);
    }

    @Override // defpackage.agxa, defpackage.agxk
    public final void h(byte[] bArr) {
        bArr.getClass();
        e(bArr, bArr.length);
    }
}
