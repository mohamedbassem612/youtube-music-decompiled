package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajx {
    public int a;
    public long[] b = new long[16];
    public int[] c = new int[16];
    public int[] d;
    public int e;

    public ajx() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.d = iArr;
    }

    private final void c(int i, int i2) {
        long[] jArr = this.b;
        int[] iArr = this.c;
        int[] iArr2 = this.d;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public final void a(int i) {
        int i2 = this.d[i];
        c(i2, this.a - 1);
        this.a--;
        b(i2);
        long[] jArr = this.b;
        int i3 = this.a >> 1;
        while (i2 < i3) {
            int i4 = (i2 + 1) << 1;
            int i5 = i4 - 1;
            if (i4 < this.a) {
                long j = jArr[i4];
                if (awrc.a(j, jArr[i5]) < 0) {
                    if (awrc.a(j, jArr[i2]) >= 0) {
                        break;
                    }
                    c(i4, i2);
                    i2 = i4;
                }
            }
            if (awrc.a(jArr[i5], jArr[i2]) >= 0) {
                break;
            }
            c(i5, i2);
            i2 = i5;
        }
        this.d[i] = this.e;
        this.e = i;
    }

    public final void b(int i) {
        long[] jArr = this.b;
        long j = jArr[i];
        while (i > 0) {
            int i2 = ((i + 1) >> 1) - 1;
            if (awrc.a(jArr[i2], j) <= 0) {
                return;
            }
            c(i2, i);
            i = i2;
        }
    }
}
