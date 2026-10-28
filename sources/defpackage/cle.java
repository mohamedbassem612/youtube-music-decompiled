package defpackage;

import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cle extends DecoderInputBuffer {
    public long a;
    public int b;
    public int c;

    public cle() {
        super(2);
        this.c = 32;
    }

    public final boolean a(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ahno.F(!decoderInputBuffer.isEncrypted());
        ahno.F(!decoderInputBuffer.hasSupplementalData());
        ahno.F(!decoderInputBuffer.isEndOfStream());
        if (b() && (this.b >= this.c || ((byteBuffer = decoderInputBuffer.data) != null && (byteBuffer2 = this.data) != null && byteBuffer2.position() + byteBuffer.remaining() > 3072000))) {
            return false;
        }
        int i = this.b;
        this.b = i + 1;
        if (i == 0) {
            this.timeUs = decoderInputBuffer.timeUs;
            if (decoderInputBuffer.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = decoderInputBuffer.data;
        if (byteBuffer3 != null) {
            ensureSpaceForWrite(byteBuffer3.remaining());
            this.data.put(byteBuffer3);
        }
        this.a = decoderInputBuffer.timeUs;
        return true;
    }

    public final boolean b() {
        return this.b > 0;
    }

    @Override // androidx.media3.decoder.DecoderInputBuffer, defpackage.cai
    public final void clear() {
        super.clear();
        this.b = 0;
    }
}
