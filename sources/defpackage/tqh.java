package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class tqh {
    public final int[] a;
    public final long[] b;
    final boolean[] c;
    final tqj d;
    public int e;

    public tqh(int i, tqj tqjVar) {
        this.d = tqjVar;
        this.a = new int[i];
        this.b = new long[i];
        this.c = new boolean[i];
    }

    public final void a() {
        this.d.f(this);
    }

    public void b(int i, long j) {
        int[] iArr = this.a;
        int i2 = this.e;
        iArr[i2] = i;
        this.e = i2 + 1;
        this.b[i2] = j;
    }

    public void c(int i, byte[] bArr) {
        int i2 = tqg.a;
        int length = bArr.length;
        int iMin = Math.min((i >>> 16) & 16383, (length << 3) + 63) & (-64);
        char c = (char) i;
        int i3 = 0;
        for (int i4 = c; i4 < iMin + c; i4 += 64) {
            long j = 0;
            for (int i5 = 0; i5 < 64 && i3 < length; i5 += 8) {
                j |= (((long) bArr[i3]) & 255) << i5;
                i3++;
            }
            int[] iArr = this.a;
            int i6 = this.e;
            iArr[i6] = ((-1073741824) & i) | 4194304 | i4;
            long[] jArr = this.b;
            this.e = i6 + 1;
            jArr[i6] = j;
        }
    }

    public final void d(long j) {
        int i = tqg.a;
        b(1074551979, Math.max(-2048L, Math.min(j, 2047L)) & 4095);
    }

    public final void e(int i) {
        this.c[this.e] = true;
        b(i, 1L);
    }

    public void f(int i, boolean z) {
        b(i, true != z ? 0L : 1L);
    }

    public void g(long j) {
        int i = tqg.a;
        b(1074269699, Math.max(0L, Math.min(j, 25500L)) / 100);
    }
}
