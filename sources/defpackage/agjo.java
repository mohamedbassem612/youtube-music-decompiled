package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agjo extends AbstractMap implements Serializable, aghp {
    public transient Object[] a;
    public transient Object[] b;
    public transient int c;
    public transient int d;
    public transient int e;
    public transient int[] f;
    public transient aghp g;
    private transient int[] h;
    private transient int[] i;
    private transient int[] j;
    private transient int[] k;
    private transient int l;
    private transient int[] m;
    private transient Set n;
    private transient Set o;
    private transient Set p;

    public agjo(int i) {
        h(i);
    }

    private final int n(int i) {
        return i & (this.h.length - 1);
    }

    private final int o(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[n(i)];
        while (i2 != -1) {
            if (Objects.equals(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    private final void p(int i, int i2) {
        ahno.F(i != -1);
        int iN = n(i2);
        int[] iArr = this.h;
        int i3 = iArr[iN];
        int[] iArr2 = this.j;
        if (i3 == i) {
            iArr[iN] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = iArr2[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with key ".concat(String.valueOf(String.valueOf(this.a[i]))));
            }
            int[] iArr3 = this.j;
            if (i3 == i) {
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = iArr3[i3];
        }
    }

    private final void q(int i, int i2) {
        ahno.F(i != -1);
        int iN = n(i2);
        int[] iArr = this.i;
        int i3 = iArr[iN];
        int[] iArr2 = this.k;
        if (i3 == i) {
            iArr[iN] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = iArr2[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with value ".concat(String.valueOf(String.valueOf(this.b[i]))));
            }
            int[] iArr3 = this.k;
            if (i3 == i) {
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = iArr3[i3];
        }
    }

    private final void r(int i) {
        int length = this.j.length;
        if (length < i) {
            int iF = agjv.f(length, i);
            this.a = Arrays.copyOf(this.a, iF);
            this.b = Arrays.copyOf(this.b, iF);
            this.j = x(this.j, iF);
            this.k = x(this.k, iF);
            this.m = x(this.m, iF);
            this.f = x(this.f, iF);
        }
        if (this.h.length < i) {
            int iY = aguu.Y(i);
            this.h = w(iY);
            this.i = w(iY);
            for (int i2 = 0; i2 < this.c; i2++) {
                int iN = n(aguu.X(this.a[i2]));
                int[] iArr = this.j;
                int[] iArr2 = this.h;
                iArr[i2] = iArr2[iN];
                iArr2[iN] = i2;
                int iN2 = n(aguu.X(this.b[i2]));
                int[] iArr3 = this.k;
                int[] iArr4 = this.i;
                iArr3[i2] = iArr4[iN2];
                iArr4[iN2] = i2;
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        h(16);
        for (int i2 = 0; i2 < i; i2++) {
            g(objectInputStream.readObject(), objectInputStream.readObject(), false);
        }
    }

    private final void s(int i, int i2) {
        ahno.F(i != -1);
        int iN = n(i2);
        int[] iArr = this.j;
        int[] iArr2 = this.h;
        iArr[i] = iArr2[iN];
        iArr2[iN] = i;
    }

    private final void t(int i, int i2) {
        ahno.F(i != -1);
        int iN = n(i2);
        int[] iArr = this.k;
        int[] iArr2 = this.i;
        iArr[i] = iArr2[iN];
        iArr2[iN] = i;
    }

    private final void u(int i, int i2, int i3) {
        int i4;
        int[] iArr;
        int i5;
        int[] iArr2;
        ahno.F(i != -1);
        p(i, i2);
        q(i, i3);
        v(this.m[i], this.f[i]);
        int i6 = this.c - 1;
        if (i6 != i) {
            int i7 = this.m[i6];
            int i8 = this.f[i6];
            v(i7, i);
            v(i, i8);
            Object[] objArr = this.a;
            Object obj = objArr[i6];
            Object[] objArr2 = this.b;
            Object obj2 = objArr2[i6];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int iN = n(aguu.X(obj));
            int[] iArr3 = this.h;
            int i9 = iArr3[iN];
            if (i9 == i6) {
                iArr3[iN] = i;
            } else {
                int i10 = this.j[i9];
                while (true) {
                    i4 = i9;
                    i9 = i10;
                    iArr = this.j;
                    if (i9 == i6) {
                        break;
                    } else {
                        i10 = iArr[i9];
                    }
                }
                iArr[i4] = i;
            }
            int[] iArr4 = this.j;
            iArr4[i] = iArr4[i6];
            iArr4[i6] = -1;
            int iN2 = n(aguu.X(obj2));
            int[] iArr5 = this.i;
            int i11 = iArr5[iN2];
            if (i11 == i6) {
                iArr5[iN2] = i;
            } else {
                int i12 = this.k[i11];
                while (true) {
                    i5 = i11;
                    i11 = i12;
                    iArr2 = this.k;
                    if (i11 == i6) {
                        break;
                    } else {
                        i12 = iArr2[i11];
                    }
                }
                iArr2[i5] = i;
            }
            int[] iArr6 = this.k;
            iArr6[i] = iArr6[i6];
            iArr6[i6] = -1;
        }
        Object[] objArr3 = this.a;
        int i13 = this.c - 1;
        objArr3[i13] = null;
        this.b[i13] = null;
        this.c = i13;
        this.d++;
    }

    private final void v(int i, int i2) {
        if (i == -2) {
            this.e = i2;
        } else {
            this.f[i] = i2;
        }
        if (i2 == -2) {
            this.l = i;
        } else {
            this.m[i2] = i;
        }
    }

    private static int[] w(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.c);
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private static int[] x(int[] iArr, int i) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(iArrCopyOf, length, i, -1);
        return iArrCopyOf;
    }

    @Override // defpackage.aghp
    public final aghp a() {
        aghp aghpVar = this.g;
        if (aghpVar != null) {
            return aghpVar;
        }
        agji agjiVar = new agji(this);
        this.g = agjiVar;
        return agjiVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set values() {
        Set set = this.o;
        if (set != null) {
            return set;
        }
        agjl agjlVar = new agjl(this);
        this.o = agjlVar;
        return agjlVar;
    }

    public final int c(Object obj) {
        return d(obj, aguu.X(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.a, 0, this.c, (Object) null);
        Arrays.fill(this.b, 0, this.c, (Object) null);
        Arrays.fill(this.h, -1);
        Arrays.fill(this.i, -1);
        Arrays.fill(this.j, 0, this.c, -1);
        Arrays.fill(this.k, 0, this.c, -1);
        Arrays.fill(this.m, 0, this.c, -1);
        Arrays.fill(this.f, 0, this.c, -1);
        this.c = 0;
        this.e = -2;
        this.l = -2;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return c(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return e(obj) != -1;
    }

    public final int d(Object obj, int i) {
        return o(obj, i, this.h, this.j, this.a);
    }

    public final int e(Object obj) {
        return f(obj, aguu.X(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.p;
        if (set != null) {
            return set;
        }
        agjh agjhVar = new agjh(this);
        this.p = agjhVar;
        return agjhVar;
    }

    public final int f(Object obj, int i) {
        return o(obj, i, this.i, this.k, this.b);
    }

    public final Object g(Object obj, Object obj2, boolean z) {
        int iX = aguu.X(obj);
        int iD = d(obj, iX);
        if (iD != -1) {
            Object obj3 = this.b[iD];
            if (Objects.equals(obj3, obj2)) {
                return obj2;
            }
            k(iD, obj2, z);
            return obj3;
        }
        int iX2 = aguu.X(obj2);
        int iF = f(obj2, iX2);
        if (!z) {
            ahno.K(iF == -1, "Value already present: %s", obj2);
        } else if (iF != -1) {
            j(iF, iX2);
        }
        r(this.c + 1);
        Object[] objArr = this.a;
        int i = this.c;
        objArr[i] = obj;
        this.b[i] = obj2;
        s(i, iX);
        t(this.c, iX2);
        v(this.l, this.c);
        v(this.c, -2);
        this.c++;
        this.d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int iC = c(obj);
        if (iC == -1) {
            return null;
        }
        return this.b[iC];
    }

    final void h(int i) {
        aguu.ag(i, "expectedSize");
        int iY = aguu.Y(i);
        this.c = 0;
        this.a = new Object[i];
        this.b = new Object[i];
        this.h = w(iY);
        this.i = w(iY);
        this.j = w(i);
        this.k = w(i);
        this.e = -2;
        this.l = -2;
        this.m = w(i);
        this.f = w(i);
    }

    public final void i(int i, int i2) {
        u(i, i2, aguu.X(this.b[i]));
    }

    public final void j(int i, int i2) {
        u(i, aguu.X(this.a[i]), i2);
    }

    public final void k(int i, Object obj, boolean z) {
        ahno.F(i != -1);
        int iX = aguu.X(obj);
        int iF = f(obj, iX);
        if (iF != -1) {
            if (!z) {
                throw new IllegalArgumentException("Value already present in map: ".concat(String.valueOf(String.valueOf(obj))));
            }
            j(iF, iX);
            if (i == this.c) {
                i = iF;
            }
        }
        q(i, aguu.X(this.b[i]));
        this.b[i] = obj;
        t(i, iX);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.n;
        if (set != null) {
            return set;
        }
        agjk agjkVar = new agjk(this);
        this.n = agjkVar;
        return agjkVar;
    }

    public final Object l(Object obj, Object obj2) {
        int iX = aguu.X(obj);
        int iF = f(obj, iX);
        if (iF != -1) {
            Object obj3 = this.a[iF];
            if (Objects.equals(obj3, obj2)) {
                return obj2;
            }
            m(iF, obj2);
            return obj3;
        }
        int i = this.l;
        int iX2 = aguu.X(obj2);
        ahno.K(d(obj2, iX2) == -1, "Key already present: %s", obj2);
        r(this.c + 1);
        Object[] objArr = this.a;
        int i2 = this.c;
        objArr[i2] = obj2;
        this.b[i2] = obj;
        s(i2, iX2);
        t(this.c, iX);
        int i3 = i == -2 ? this.e : this.f[i];
        v(i, this.c);
        v(this.c, i3);
        this.c++;
        this.d++;
        return null;
    }

    public final void m(int i, Object obj) {
        ahno.F(i != -1);
        int iD = d(obj, aguu.X(obj));
        int i2 = this.l;
        if (iD != -1) {
            throw new IllegalArgumentException("Key already present in map: ".concat(String.valueOf(String.valueOf(obj))));
        }
        if (i2 == i) {
            i2 = this.m[i];
        } else if (i2 == this.c) {
            i2 = iD;
        }
        if (i == -2) {
            iD = this.f[-2];
        } else if (this.c != -2) {
            iD = -2;
        }
        v(this.m[i], this.f[i]);
        p(i, aguu.X(this.a[i]));
        this.a[i] = obj;
        s(i, aguu.X(obj));
        v(i2, i);
        v(i, iD);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return g(obj, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int iX = aguu.X(obj);
        int iD = d(obj, iX);
        if (iD == -1) {
            return null;
        }
        Object obj2 = this.b[iD];
        i(iD, iX);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }
}
