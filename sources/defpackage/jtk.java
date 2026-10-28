package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jtk implements jtm {
    public boolean a;
    public long b;
    public ByteBuffer c;
    public boolean d;
    private long e;
    private List f = new ArrayList();
    private boolean g;
    private int h;
    private int i;

    public jtk() {
        g();
    }

    private final int m(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.f.size() + 1 && i4 < i2) {
            ByteBuffer byteBuffer = i3 == this.f.size() ? this.c : (ByteBuffer) this.f.get(i3);
            int iMin = Math.min(i2 - i4, byteBuffer.remaining());
            byteBuffer.get(bArr, i + i4, iMin);
            i4 += iMin;
            i3++;
        }
        return i4;
    }

    private final void n(int i) {
        this.b += (long) i;
        if (this.f.isEmpty() || ((ByteBuffer) this.f.get(0)).hasRemaining()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ByteBuffer byteBuffer : this.f) {
            if (byteBuffer.remaining() > 0) {
                arrayList.add(byteBuffer);
            }
        }
        this.f = arrayList;
    }

    @Override // defpackage.jtm, defpackage.brv
    public final int a(byte[] bArr, int i, int i2) {
        h();
        int iM = m(bArr, i, i2);
        n(iM);
        return iM;
    }

    @Override // defpackage.jtm
    public final long b() {
        return -1L;
    }

    public final long c() {
        return this.b + this.e;
    }

    @Override // defpackage.jtm
    public final long d() {
        return this.b;
    }

    public final void e() {
        if (this.a) {
            int iPosition = this.c.position() - this.c.reset().position();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[iPosition]);
            this.c.get(byteBufferWrap.array(), 0, iPosition);
            byteBufferWrap.mark().position(byteBufferWrap.capacity());
            this.f.add(byteBufferWrap);
        }
        this.g = true;
    }

    public final void f(ByteBuffer byteBuffer, long j) {
        ahno.O(this.g);
        if (this.b == -1) {
            this.b = j;
        }
        this.c = byteBuffer;
        byteBuffer.mark();
        this.g = false;
    }

    public final void g() {
        this.g = true;
        this.f.clear();
        this.c = ByteBuffer.wrap(new byte[0]);
        this.b = -1L;
        this.e = 0L;
        this.d = false;
    }

    @Override // defpackage.jtm
    public final void h() {
        if (this.a) {
            this.a = false;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((ByteBuffer) it.next()).reset();
            }
            this.c.reset();
            this.e = 0L;
        }
    }

    public boolean i() {
        throw null;
    }

    @Override // defpackage.jtm
    public final boolean j(byte[] bArr, int i, int i2) {
        h();
        if (this.d) {
            i = this.h;
            i2 = this.i;
        }
        int iM = m(bArr, i, i2);
        if (iM != i2) {
            this.d = true;
            this.h = i + iM;
            this.i = i2 - iM;
        } else {
            this.d = false;
        }
        n(iM);
        return !this.d;
    }

    @Override // defpackage.jtm
    public final boolean k(int i) {
        h();
        if (this.d) {
            i = this.i;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f.size() + 1 && i3 < i) {
            ByteBuffer byteBuffer = i2 == this.f.size() ? this.c : (ByteBuffer) this.f.get(i2);
            int iMin = Math.min(i - i3, byteBuffer.remaining());
            byteBuffer.position(byteBuffer.position() + iMin);
            i3 += iMin;
            i2++;
        }
        if (i3 != i) {
            this.d = true;
            this.i = i - i3;
        } else {
            this.d = false;
        }
        n(i3);
        return !this.d;
    }

    @Override // defpackage.jtm
    public final boolean l(byte[] bArr, int i) {
        int i2;
        int i3;
        boolean z;
        if (!this.a) {
            this.a = true;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((ByteBuffer) it.next()).mark();
            }
            this.c.mark();
        }
        if (this.d) {
            i3 = this.h;
            i2 = this.i;
        } else {
            i2 = i;
            i3 = 0;
        }
        int iM = m(bArr, i3, i2);
        if (iM != i2) {
            this.d = true;
            this.h = i3 + iM;
            this.i = i2 - iM;
            z = true;
        } else {
            this.d = false;
            z = false;
        }
        this.e += (long) iM;
        return !z;
    }
}
