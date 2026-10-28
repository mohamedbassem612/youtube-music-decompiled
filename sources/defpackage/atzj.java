package defpackage;

import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atzj implements atzb {
    private final byte[] a;
    private int b;

    public atzj(String str) {
        this.a = str.getBytes(StandardCharsets.UTF_8);
    }

    @Override // defpackage.atzb
    public final synchronized int a(byte[] bArr, int i, int i2) {
        ahno.G(65536 - i >= i2, "Buffer length too small.");
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.b;
        byte[] bArr2 = this.a;
        int length = bArr2.length;
        if (i3 == length) {
            return 0;
        }
        int iMin = Math.min(i2, length - i3);
        for (int i4 = 0; i4 < iMin; i4++) {
            int i5 = this.b;
            bArr[i + i4] = bArr2[i5];
            this.b = i5 + 1;
        }
        return iMin;
    }

    @Override // defpackage.atzb
    public final synchronized long b() {
        throw null;
    }

    @Override // defpackage.atzb
    public final synchronized long c() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.atzb, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
    }

    @Override // defpackage.atzb
    public final synchronized long d() {
        return this.b;
    }

    @Override // defpackage.atzb
    public final synchronized long e() {
        return this.a.length;
    }

    @Override // defpackage.atzb
    public final synchronized long f(long j) {
        throw null;
    }

    @Override // defpackage.atzb
    public final synchronized void g() {
    }

    @Override // defpackage.atzb
    public final synchronized void h() {
        throw null;
    }

    @Override // defpackage.atzb
    public final synchronized boolean i() {
        return this.b < this.a.length;
    }
}
