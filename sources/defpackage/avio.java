package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avio extends avda {
    final ByteBuffer a;

    public avio(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    @Override // defpackage.avda, defpackage.avil
    public final void b() {
        this.a.mark();
    }

    @Override // defpackage.avda, defpackage.avil
    public final void c() {
        this.a.reset();
    }

    @Override // defpackage.avda, defpackage.avil
    public final boolean d() {
        return true;
    }

    @Override // defpackage.avil
    public final int e() {
        a(1);
        return this.a.get() & 255;
    }

    @Override // defpackage.avil
    public final int f() {
        return this.a.remaining();
    }

    @Override // defpackage.avil
    public final /* bridge */ /* synthetic */ avil g(int i) {
        a(i);
        ByteBuffer byteBuffer = this.a;
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.limit(byteBuffer.position() + i);
        byteBuffer.position(byteBuffer.position() + i);
        return new avio(byteBufferDuplicate);
    }

    @Override // defpackage.avil
    public final void i(OutputStream outputStream, int i) throws IOException {
        a(i);
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.hasArray()) {
            outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i);
            byteBuffer.position(byteBuffer.position() + i);
        } else {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            outputStream.write(bArr);
        }
    }

    @Override // defpackage.avil
    public final void j(byte[] bArr, int i, int i2) {
        a(i2);
        this.a.get(bArr, i, i2);
    }

    @Override // defpackage.avil
    public final void k(int i) {
        a(i);
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + i);
    }
}
