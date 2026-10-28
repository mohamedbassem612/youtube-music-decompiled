package androidx.media3.decoder;

import defpackage.ahno;
import defpackage.cap;
import defpackage.caq;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class SimpleDecoderOutputBuffer extends caq {
    public ByteBuffer data;
    private final cap owner;

    public SimpleDecoderOutputBuffer(cap capVar) {
        this.owner = capVar;
    }

    @Override // defpackage.caq, defpackage.cai
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public ByteBuffer grow(int i) {
        ByteBuffer byteBuffer = this.data;
        byteBuffer.getClass();
        ahno.F(i >= byteBuffer.limit());
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(iPosition);
        byteBufferOrder.limit(i);
        this.data = byteBufferOrder;
        return byteBufferOrder;
    }

    public ByteBuffer init(long j, int i) {
        this.timeUs = j;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.data = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        this.data.position(0);
        this.data.limit(i);
        return this.data;
    }

    @Override // defpackage.caq
    public void release() {
        this.owner.a(this);
    }
}
