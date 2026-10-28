package androidx.media3.decoder;

import androidx.car.app.model.Alert;
import defpackage.bse;
import defpackage.cap;
import defpackage.caq;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class VideoDecoderOutputBuffer extends caq {
    public static final int COLORSPACE_BT2020 = 3;
    public static final int COLORSPACE_BT601 = 1;
    public static final int COLORSPACE_BT709 = 2;
    public static final int COLORSPACE_UNKNOWN = 0;
    public int colorspace;
    public ByteBuffer data;
    public long decoderPrivate;
    public bse format;
    public int height;
    public int mode;
    private final cap owner;
    public ByteBuffer supplementalData;
    public int uvStride;
    public int width;
    public int yStride;
    public ByteBuffer[] yuvPlanes;
    public int[] yuvStrides;

    public VideoDecoderOutputBuffer(cap capVar) {
        this.owner = capVar;
    }

    private static boolean isSafeToMultiply(int i, int i2) {
        if (i < 0 || i2 < 0) {
            return false;
        }
        return i2 <= 0 || i < Alert.DURATION_SHOW_INDEFINITELY / i2;
    }

    public void init(long j, int i, ByteBuffer byteBuffer) {
        this.timeUs = j;
        this.mode = i;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            this.supplementalData = null;
            return;
        }
        addFlag(268435456);
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 == null || byteBuffer2.capacity() < iLimit) {
            this.supplementalData = ByteBuffer.allocate(iLimit);
        } else {
            this.supplementalData.clear();
        }
        this.supplementalData.put(byteBuffer);
        this.supplementalData.flip();
        byteBuffer.position(0);
    }

    public boolean initForOffsetFrames(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        ByteBuffer[] byteBufferArr = this.yuvPlanes;
        if (byteBufferArr == null) {
            byteBufferArr = new ByteBuffer[3];
            this.yuvPlanes = byteBufferArr;
        }
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            return false;
        }
        this.width = i2;
        this.height = i3;
        this.colorspace = i6;
        int i8 = i4 * i3;
        int i9 = (i3 >> 1) * i5;
        int i10 = i4 * i7;
        byteBuffer.position(i);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferArr[0] = byteBufferSlice;
        byteBufferSlice.limit(i8);
        byteBuffer.position(i10 + i);
        ByteBuffer byteBufferSlice2 = byteBuffer.slice();
        byteBufferArr[1] = byteBufferSlice2;
        byteBufferSlice2.limit(i9);
        byteBuffer.position(i10 + ((i7 >> 1) * i5) + i);
        ByteBuffer byteBufferSlice3 = byteBuffer.slice();
        byteBufferArr[2] = byteBufferSlice3;
        byteBufferSlice3.limit(i9);
        int[] iArr = this.yuvStrides;
        if (iArr == null) {
            iArr = new int[3];
            this.yuvStrides = iArr;
        }
        iArr[0] = i4;
        iArr[1] = i5;
        iArr[2] = i5;
        return true;
    }

    public void initForPrivateFrame(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public boolean initForYuvFrame(int i, int i2, int i3, int i4, int i5) {
        int i6;
        this.width = i;
        this.height = i2;
        this.colorspace = i5;
        this.yStride = i3;
        this.uvStride = i4;
        if (!isSafeToMultiply(i3, i2)) {
            return false;
        }
        int i7 = (int) ((((long) i2) + 1) / 2);
        if (!isSafeToMultiply(i4, i7)) {
            return false;
        }
        int i8 = i2 * i3;
        int i9 = i7 * i4;
        if (!isSafeToMultiply(i9, 2) || (i6 = (i9 << 1) + i8) < i8) {
            return false;
        }
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i6) {
            this.data = ByteBuffer.allocateDirect(i6);
        } else {
            this.data.position(0);
            this.data.limit(i6);
        }
        ByteBuffer[] byteBufferArr = this.yuvPlanes;
        if (byteBufferArr == null) {
            byteBufferArr = new ByteBuffer[3];
            this.yuvPlanes = byteBufferArr;
        }
        ByteBuffer byteBuffer2 = this.data;
        ByteBuffer byteBufferSlice = byteBuffer2.slice();
        byteBufferArr[0] = byteBufferSlice;
        byteBufferSlice.limit(i8);
        byteBuffer2.position(i8);
        ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
        byteBufferArr[1] = byteBufferSlice2;
        byteBufferSlice2.limit(i9);
        byteBuffer2.position(i8 + i9);
        ByteBuffer byteBufferSlice3 = byteBuffer2.slice();
        byteBufferArr[2] = byteBufferSlice3;
        byteBufferSlice3.limit(i9);
        int[] iArr = this.yuvStrides;
        if (iArr == null) {
            iArr = new int[3];
            this.yuvStrides = iArr;
        }
        iArr[0] = i3;
        iArr[1] = i4;
        iArr[2] = i4;
        return true;
    }

    @Override // defpackage.caq
    public void release() {
        this.owner.a(this);
    }
}
