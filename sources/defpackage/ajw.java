package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ajw {
    private ajz a;
    public boolean b;
    private long c;
    private int d;

    public ajw(long j, ajz ajzVar) {
        int i;
        this.a = ajzVar;
        this.c = j;
        Object obj = aka.a;
        if (j != 0) {
            ajz ajzVarN = n();
            long[] jArr = ajzVarN.d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j2 = ajzVarN.c;
                if (j2 != 0) {
                    j = Long.numberOfTrailingZeros(j2);
                } else {
                    long j3 = ajzVarN.b;
                    if (j3 != 0) {
                        j = ((long) Long.numberOfTrailingZeros(j3)) + 64;
                    }
                }
            }
            synchronized (aka.a) {
                ajx ajxVar = aka.c;
                int i2 = ajxVar.a + 1;
                long[] jArr2 = ajxVar.b;
                int length = jArr2.length;
                if (i2 > length) {
                    int i3 = length << 1;
                    long[] jArr3 = new long[i3];
                    int[] iArr = new int[i3];
                    jArr2.getClass();
                    System.arraycopy(jArr2, 0, jArr3, 0, length);
                    atqq.aX(ajxVar.c, iArr, 0, 14);
                    ajxVar.b = jArr3;
                    ajxVar.c = iArr;
                }
                int i4 = ajxVar.a;
                ajxVar.a = i4 + 1;
                int length2 = ajxVar.d.length;
                if (ajxVar.e >= length2) {
                    int i5 = length2 << 1;
                    int[] iArr2 = new int[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i6 + 1;
                        iArr2[i6] = i7;
                        i6 = i7;
                    }
                    atqq.aX(ajxVar.d, iArr2, 0, 14);
                    ajxVar.d = iArr2;
                }
                i = ajxVar.e;
                int[] iArr3 = ajxVar.d;
                ajxVar.e = iArr3[i];
                ajxVar.b[i4] = j;
                ajxVar.c[i4] = i;
                iArr3[i] = i4;
                ajxVar.b(i4);
            }
        } else {
            i = -1;
        }
        this.d = i;
    }

    public void a() {
        throw null;
    }

    public int c() {
        return 0;
    }

    public abstract awqg d();

    public void e() {
        throw null;
    }

    public abstract void f(akb akbVar);

    public void g() {
        throw null;
    }

    public void h(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract void k();

    public abstract void l();

    public long m() {
        return this.c;
    }

    public ajz n() {
        return this.a;
    }

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            aka.c.a(i);
            this.d = -1;
        }
    }
}
