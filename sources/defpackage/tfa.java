package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tfa extends InputStream implements InputStreamRetargetInterface {
    private final List a;
    private int b;
    private int c;
    private int d;

    public tfa(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((ByteBuffer) obj).hasRemaining()) {
                arrayList.add(obj);
            }
        }
        this.a = arrayList;
        ByteBuffer byteBuffer = (ByteBuffer) atqq.Z(arrayList);
        int iRemaining = 0;
        this.c = byteBuffer != null ? byteBuffer.position() : 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iRemaining += ((ByteBuffer) it.next()).remaining();
        }
        this.d = iRemaining;
    }

    private final ByteBuffer a() {
        List list = this.a;
        if (this.b < list.size()) {
            return (ByteBuffer) list.get(this.b);
        }
        return null;
    }

    private final void b(ByteBuffer byteBuffer, int i) {
        int i2 = this.c + i;
        if (i2 < byteBuffer.limit()) {
            this.c = i2;
            return;
        }
        int i3 = this.b + 1;
        this.b = i3;
        List list = this.a;
        this.c = i3 < list.size() ? ((ByteBuffer) list.get(this.b)).position() : 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.d;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException("off=" + i + ", len=" + i2 + ", size=" + bArr.length);
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i3 < i2) {
            ByteBuffer byteBufferA = a();
            if (byteBufferA == null) {
                break;
            }
            int i4 = i + i3;
            int i5 = this.c;
            int iMin = Math.min(i2 - i3, byteBufferA.limit() - i5);
            if (byteBufferA.hasArray()) {
                System.arraycopy(byteBufferA.array(), byteBufferA.arrayOffset() + i5, bArr, i4, iMin);
            } else {
                ByteBuffer byteBufferDuplicate = byteBufferA.duplicate();
                byteBufferDuplicate.getClass();
                byteBufferDuplicate.position(i5);
                byteBufferDuplicate.get(bArr, i4, iMin).getClass();
            }
            b(byteBufferA, iMin);
            i3 += iMin;
        }
        this.d -= i3;
        if (i3 == 0) {
            return -1;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        ByteBuffer byteBufferA;
        long j2 = 0;
        while (j2 < j && (byteBufferA = a()) != null) {
            int iMin = (int) Math.min(j - j2, byteBufferA.limit() - this.c);
            b(byteBufferA, iMin);
            j2 += (long) iMin;
        }
        this.d -= (int) j2;
        return j2;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte b;
        ByteBuffer byteBufferA = a();
        if (byteBufferA == null) {
            return -1;
        }
        int i = this.c;
        if (byteBufferA.hasArray()) {
            b = byteBufferA.array()[byteBufferA.arrayOffset() + i];
        } else {
            b = byteBufferA.get(i);
        }
        int i2 = b & 255;
        b(byteBufferA, 1);
        this.d--;
        return i2;
    }
}
