package androidx.media3.decoder;

import defpackage.bse;
import defpackage.bst;
import defpackage.cai;
import defpackage.cak;
import defpackage.cao;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DecoderInputBuffer extends cai {
    public static final int BUFFER_REPLACEMENT_MODE_DIRECT = 2;
    public static final int BUFFER_REPLACEMENT_MODE_DISABLED = 0;
    public static final int BUFFER_REPLACEMENT_MODE_NORMAL = 1;
    private final int bufferReplacementMode;
    public final cak cryptoInfo;
    public ByteBuffer data;
    public bse format;
    private final int paddingSize;
    public ByteBuffer supplementalData;
    public long timeUs;
    public boolean waitingForKeys;

    static {
        bst.b("media3.decoder");
    }

    public DecoderInputBuffer(int i, int i2) {
        this.cryptoInfo = new cak();
        this.bufferReplacementMode = i;
        this.paddingSize = i2;
    }

    private ByteBuffer createReplacementByteBuffer(int i) {
        int i2 = this.bufferReplacementMode;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.data;
        throw new cao(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    public static DecoderInputBuffer newNoDataInstance() {
        return new DecoderInputBuffer(0);
    }

    @Override // defpackage.cai
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.waitingForKeys = false;
    }

    public void ensureSpaceForWrite(int i) {
        int i2 = i + this.paddingSize;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            this.data = createReplacementByteBuffer(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.data = byteBuffer;
            return;
        }
        ByteBuffer byteBufferCreateReplacementByteBuffer = createReplacementByteBuffer(i3);
        byteBufferCreateReplacementByteBuffer.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferCreateReplacementByteBuffer.put(byteBuffer);
        }
        this.data = byteBufferCreateReplacementByteBuffer;
    }

    public final void flip() {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean isEncrypted() {
        return getFlag(1073741824);
    }

    public void resetSupplementalData(int i) {
        ByteBuffer byteBuffer = this.supplementalData;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.supplementalData = ByteBuffer.allocate(i);
        } else {
            this.supplementalData.clear();
        }
    }

    public DecoderInputBuffer(int i) {
        this(i, 0);
    }
}
