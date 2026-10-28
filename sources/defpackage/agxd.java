package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agxd extends agxa {
    public final ByteBuffer a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);

    protected agxd() {
    }

    private final void m() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= 16) {
            e(byteBuffer);
        }
        byteBuffer.compact();
    }

    private final void n(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.a;
        if (byteBuffer.remaining() <= byteBuffer2.remaining()) {
            byteBuffer2.put(byteBuffer);
            d();
            return;
        }
        int iPosition = 16 - byteBuffer2.position();
        for (int i = 0; i < iPosition; i++) {
            byteBuffer2.put(byteBuffer.get());
        }
        m();
        while (byteBuffer.remaining() >= 16) {
            e(byteBuffer);
        }
        byteBuffer2.put(byteBuffer);
    }

    protected abstract agxi b();

    @Override // defpackage.agxa
    public final void c(char c) {
        this.a.putChar(c);
        d();
    }

    public final void d() {
        if (this.a.remaining() < 8) {
            m();
        }
    }

    protected abstract void e(ByteBuffer byteBuffer);

    @Override // defpackage.agxa, defpackage.agxk
    public final void f(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder = byteBuffer.order();
        try {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            n(byteBuffer);
        } finally {
            byteBuffer.order(byteOrderOrder);
        }
    }

    @Override // defpackage.agxa, defpackage.agxk
    public final void g(byte[] bArr, int i) {
        n(ByteBuffer.wrap(bArr, 0, i).order(ByteOrder.LITTLE_ENDIAN));
    }

    protected void l(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.agxk
    public final agxi o() {
        m();
        ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        if (byteBuffer.remaining() > 0) {
            l(byteBuffer);
            byteBuffer.position(byteBuffer.limit());
        }
        return b();
    }
}
