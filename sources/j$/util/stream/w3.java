package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class w3 extends c implements Iterable, j$.lang.a {
    public Object d = newArray(16);
    public Object[] e;

    public Object b() {
        long jCount = count();
        if (jCount >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        Object objNewArray = newArray((int) jCount);
        d(0, objNewArray);
        return objNewArray;
    }

    @Override // j$.util.stream.c
    public final void clear() {
        Object[] objArr = this.e;
        if (objArr != null) {
            this.d = objArr[0];
            this.e = null;
            this.c = null;
        }
        this.a = 0;
        this.b = 0;
    }

    public void d(int i, Object obj) {
        long j = i;
        long jCount = count() + j;
        if (jCount > v(obj) || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.b == 0) {
            System.arraycopy(this.d, 0, obj, i, this.a);
            return;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            Object obj2 = this.e[i2];
            System.arraycopy(obj2, 0, obj, i, v(obj2));
            i += v(this.e[i2]);
        }
        int i3 = this.a;
        if (i3 > 0) {
            System.arraycopy(this.d, 0, obj, i, i3);
        }
    }

    public void e(Object obj) {
        for (int i = 0; i < this.b; i++) {
            Object obj2 = this.e[i];
            t(obj2, 0, v(obj2), obj);
        }
        t(this.d, 0, this.a, obj);
    }

    public Object newArray(int i) {
        return new long[i];
    }

    public abstract void t(Object obj, int i, int i2, Object obj2);

    public int v(Object obj) {
        return ((long[]) obj).length;
    }

    public final int w(long j) {
        int i = 0;
        if (this.b != 0) {
            if (j >= count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            while (i <= this.b) {
                if (j >= this.c[i] + ((long) v(this.e[i]))) {
                    i++;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= this.a) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        return i;
    }

    public final void x(long j) {
        long jV;
        int i = this.b;
        if (i == 0) {
            jV = v(this.d);
        } else {
            jV = ((long) v(this.e[i])) + this.c[i];
        }
        if (j > jV) {
            if (this.e == null) {
                Object[] objArrY = y();
                this.e = objArrY;
                this.c = new long[8];
                objArrY[0] = this.d;
            }
            int i2 = this.b + 1;
            while (j > jV) {
                Object[] objArr = this.e;
                if (i2 >= objArr.length) {
                    int length = objArr.length << 1;
                    this.e = Arrays.copyOf(objArr, length);
                    this.c = Arrays.copyOf(this.c, length);
                }
                int iMin = 1 << ((i2 == 0 || i2 == 1) ? 4 : Math.min(i2 + 3, 30));
                this.e[i2] = newArray(iMin);
                long[] jArr = this.c;
                int i3 = i2 - 1;
                jArr[i2] = jArr[i3] + ((long) v(this.e[i3]));
                jV += (long) iMin;
                i2++;
            }
        }
    }

    public Object[] y() {
        return new long[8][];
    }

    public final void z() {
        long jV;
        if (this.a == v(this.d)) {
            Object[] objArrY = this.e;
            if (objArrY == null) {
                objArrY = y();
                this.e = objArrY;
                this.c = new long[8];
                objArrY[0] = this.d;
            }
            int i = this.b;
            int i2 = i + 1;
            if (i2 >= objArrY.length || objArrY[i2] == null) {
                if (i == 0) {
                    jV = v(this.d);
                } else {
                    jV = ((long) v(objArrY[i])) + this.c[i];
                }
                x(jV + 1);
            }
            this.a = 0;
            int i3 = this.b + 1;
            this.b = i3;
            this.d = this.e[i3];
        }
    }
}
