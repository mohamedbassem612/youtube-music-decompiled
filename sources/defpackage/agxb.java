package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agxb extends agxa {
    public ByteBuffer a;
    final /* synthetic */ agxc b;

    public agxb(agxc agxcVar, int i) {
        this.b = agxcVar;
        this.a = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void b(int i) {
        if (this.a.remaining() < i) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(Math.max(this.a.capacity() << 1, this.a.position() + i)).order(ByteOrder.LITTLE_ENDIAN);
            this.a.flip();
            byteBufferOrder.put(this.a);
            this.a = byteBufferOrder;
        }
    }

    @Override // defpackage.agxa
    public final void c(char c) {
        b(2);
        this.a.putChar(c);
    }

    @Override // defpackage.agxa, defpackage.agxk
    public final void f(ByteBuffer byteBuffer) {
        b(byteBuffer.remaining());
        this.a.put(byteBuffer);
    }

    @Override // defpackage.agxa, defpackage.agxk
    public final void g(byte[] bArr, int i) {
        b(i);
        this.a.put(bArr, 0, i);
    }

    @Override // defpackage.agxa, defpackage.agxk
    public final void j(CharSequence charSequence) {
        b(charSequence.length() << 1);
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            this.a.putChar(charSequence.charAt(i));
        }
    }

    @Override // defpackage.agxk
    public final agxi o() {
        return this.b.e(this.a.array(), this.a.position());
    }
}
