package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class fgh extends auly {
    ByteBuffer a;

    public fgh(String str) {
        super(str);
    }

    @Override // defpackage.auly
    protected final long e() {
        return this.a.limit();
    }

    @Override // defpackage.auly
    public final void f(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
