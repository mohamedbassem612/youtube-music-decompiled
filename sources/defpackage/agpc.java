package defpackage;

import androidx.car.app.model.Alert;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agpc {
    transient Object[] a;
    transient int[] b;
    transient int c;
    transient int d;
    public transient int[] e;
    transient long[] f;
    private transient float g;
    private transient int h;

    public agpc(agpc agpcVar) {
        k(agpcVar.c);
        int iA = agpcVar.a();
        while (iA != -1) {
            l(agpcVar.g(iA), agpcVar.c(iA));
            iA = agpcVar.e(iA);
        }
    }

    private static int n(long j) {
        return (int) (j >>> 32);
    }

    private final int o() {
        return this.e.length - 1;
    }

    private static long p(long j, int i) {
        return (j & (-4294967296L)) | (((long) i) & 4294967295L);
    }

    private final void q(int i) {
        if (this.e.length >= 1073741824) {
            this.h = Alert.DURATION_SHOW_INDEFINITELY;
            return;
        }
        float f = i * this.g;
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        long[] jArr = this.f;
        for (int i2 = 0; i2 < this.c; i2++) {
            int iN = n(jArr[i2]);
            int i3 = (i - 1) & iN;
            int i4 = iArr[i3];
            iArr[i3] = i2;
            jArr[i2] = (((long) iN) << 32) | (((long) i4) & 4294967295L);
        }
        this.h = ((int) f) + 1;
        this.e = iArr;
    }

    final int a() {
        return this.c == 0 ? -1 : 0;
    }

    public final int b(Object obj) {
        int iD = d(obj);
        if (iD == -1) {
            return 0;
        }
        return this.b[iD];
    }

    final int c(int i) {
        ahno.W(i, this.c);
        return this.b[i];
    }

    final int d(Object obj) {
        int iX = aguu.X(obj);
        int i = this.e[o() & iX];
        while (i != -1) {
            long j = this.f[i];
            if (n(j) == iX && Objects.equals(obj, this.a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    final int e(int i) {
        int i2 = i + 1;
        if (i2 >= this.c) {
            return -1;
        }
        return i2;
    }

    final int f(int i) {
        long[] jArr;
        long j;
        Object obj = this.a[i];
        int iN = n(this.f[i]);
        int iO = o() & iN;
        int i2 = this.e[iO];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (n(this.f[i2]) == iN && Objects.equals(obj, this.a[i2])) {
                int[] iArr = this.b;
                int i4 = iArr[i2];
                if (i3 == -1) {
                    this.e[iO] = (int) this.f[i2];
                } else {
                    long[] jArr2 = this.f;
                    jArr2[i3] = p(jArr2[i3], (int) jArr2[i2]);
                }
                int i5 = this.c - 1;
                Object[] objArr = this.a;
                if (i2 < i5) {
                    objArr[i2] = objArr[i5];
                    iArr[i2] = iArr[i5];
                    objArr[i5] = null;
                    iArr[i5] = 0;
                    long[] jArr3 = this.f;
                    long j2 = jArr3[i5];
                    jArr3[i2] = j2;
                    jArr3[i5] = -1;
                    int iN2 = n(j2) & o();
                    int[] iArr2 = this.e;
                    int i6 = iArr2[iN2];
                    if (i6 == i5) {
                        iArr2[iN2] = i2;
                    } else {
                        while (true) {
                            jArr = this.f;
                            j = jArr[i6];
                            int i7 = (int) j;
                            if (i7 == i5) {
                                break;
                            }
                            i6 = i7;
                        }
                        jArr[i6] = p(j, i2);
                    }
                } else {
                    objArr[i2] = null;
                    iArr[i2] = 0;
                    this.f[i2] = -1;
                }
                this.c--;
                this.d++;
                return i4;
            }
            int i8 = (int) this.f[i2];
            if (i8 == -1) {
                return 0;
            }
            i3 = i2;
            i2 = i8;
        }
    }

    final Object g(int i) {
        ahno.W(i, this.c);
        return this.a[i];
    }

    final void h(int i) {
        if (i > this.f.length) {
            i(i);
        }
        if (i >= this.h) {
            q(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    final void i(int i) {
        this.a = Arrays.copyOf(this.a, i);
        this.b = Arrays.copyOf(this.b, i);
        long[] jArr = this.f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.f = jArrCopyOf;
    }

    final void j(int i, int i2) {
        ahno.W(i, this.c);
        this.b[i] = i2;
    }

    final void k(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Initial capacity must be non-negative");
        }
        int iY = aguu.Y(i);
        int[] iArr = new int[iY];
        Arrays.fill(iArr, -1);
        this.e = iArr;
        this.g = 1.0f;
        this.a = new Object[i];
        this.b = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.f = jArr;
        this.h = Math.max(1, iY);
    }

    public final void l(Object obj, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.bR(i, "count must be positive but was: "));
        }
        long[] jArr = this.f;
        Object[] objArr = this.a;
        int[] iArr = this.b;
        int iX = aguu.X(obj);
        int iO = o() & iX;
        int i2 = this.c;
        int[] iArr2 = this.e;
        int i3 = iArr2[iO];
        if (i3 == -1) {
            iArr2[iO] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (n(j) == iX && Objects.equals(obj, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return;
                } else {
                    int i5 = (int) j;
                    if (i5 == -1) {
                        jArr[i3] = p(j, i2);
                        break;
                    }
                    i3 = i5;
                }
            }
        }
        int i6 = Alert.DURATION_SHOW_INDEFINITELY;
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i7 = i2 + 1;
        int length = this.f.length;
        if (i7 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax >= 0) {
                i6 = iMax;
            }
            if (i6 != length) {
                i(i6);
            }
        }
        this.f[i2] = (((long) iX) << 32) | 4294967295L;
        this.a[i2] = obj;
        this.b[i2] = i;
        this.c = i7;
        if (i2 >= this.h) {
            q(this.e.length << 1);
        }
        this.d++;
    }

    final agox m(int i) {
        ahno.W(i, this.c);
        return new agox(this, i);
    }

    public agpc(int i) {
        k(i);
    }

    public agpc() {
        k(3);
    }
}
