package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cho extends buk {
    public int e;
    public int f;
    public long g;
    private boolean h;
    private int i;
    private byte[] j = bwp.e;
    private int k;

    @Override // defpackage.buk, defpackage.buj
    public final long a(long j) {
        return Math.max(0L, j - bwp.B(this.f + this.e, this.b.b));
    }

    @Override // defpackage.buk, defpackage.buj
    public final ByteBuffer c() {
        int i;
        if (super.i() && (i = this.k) > 0) {
            l(i).put(this.j, 0, this.k).flip();
            this.k = 0;
        }
        return super.c();
    }

    @Override // defpackage.buj
    public final void f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i != 0) {
            int iMin = Math.min(i, this.i);
            this.g += (long) (iMin / this.b.e);
            this.i -= iMin;
            byteBuffer.position(iPosition + iMin);
            if (this.i <= 0) {
                int i2 = i - iMin;
                int length = (this.k + i2) - this.j.length;
                ByteBuffer byteBufferL = l(length);
                int iC = bwp.c(length, 0, this.k);
                byteBufferL.put(this.j, 0, iC);
                int iC2 = bwp.c(length - iC, 0, i2);
                byteBuffer.limit(byteBuffer.position() + iC2);
                byteBufferL.put(byteBuffer);
                byteBuffer.limit(iLimit);
                int i3 = i2 - iC2;
                int i4 = this.k - iC;
                this.k = i4;
                byte[] bArr = this.j;
                System.arraycopy(bArr, iC, bArr, 0, i4);
                byteBuffer.get(this.j, this.k, i3);
                this.k += i3;
                byteBufferL.flip();
            }
        }
    }

    @Override // defpackage.buk, defpackage.buj
    public final boolean i() {
        return super.i() && this.k == 0;
    }

    @Override // defpackage.buk
    public final bug k(bug bugVar) throws bui {
        if (!bwp.ab(bugVar.d)) {
            throw new bui("Unhandled input format:", bugVar);
        }
        this.h = true;
        return (this.e == 0 && this.f == 0) ? bug.a : bugVar;
    }

    @Override // defpackage.buk
    protected final void n() {
        if (this.h) {
            int i = this.k;
            if (i > 0) {
                this.g += (long) (i / this.b.e);
            }
            this.k = 0;
        }
    }

    @Override // defpackage.buk
    protected final void o() {
        this.j = bwp.e;
    }

    @Override // defpackage.buk
    protected final void p() {
        if (this.h) {
            this.h = false;
            int i = this.f;
            int i2 = this.b.e;
            this.j = new byte[i * i2];
            this.i = this.e * i2;
        }
        this.k = 0;
    }
}
