package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class aha {
    private int[] a;
    private Object[] b;
    public int d;

    public aha(int i) {
        this.a = i == 0 ? ahe.a : new int[i];
        this.b = i == 0 ? ahe.c : new Object[i << 1];
    }

    private final int a(Object obj, int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        int iA = ahe.a(this.a, i2, i);
        if (iA < 0 || awrc.c(obj, this.b[iA << 1])) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (awrc.c(obj, this.b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (awrc.c(obj, this.b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    private final int j() {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        int iA = ahe.a(this.a, i, 0);
        if (iA < 0 || this.b[iA << 1] == null) {
            return iA;
        }
        int i2 = iA + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iA - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final int b(Object obj) {
        int i = this.d << 1;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (awrc.c(obj, objArr[i3])) {
                    return i3 >> 1;
                }
            }
        }
        return -1;
    }

    public final int c(Object obj) {
        return obj == null ? j() : a(obj, obj.hashCode());
    }

    public void clear() {
        if (this.d > 0) {
            this.a = ahe.a;
            this.b = ahe.c;
            this.d = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public final Object d(int i) {
        if (i < 0 || i >= this.d) {
            dl.k(a.bR(i, "Expected index to be within 0..size()-1, but was "));
        }
        return this.b[i << 1];
    }

    public Object e(int i) {
        if (i < 0 || i >= this.d) {
            dl.k(a.bR(i, "Expected index to be within 0..size()-1, but was "));
        }
        Object[] objArr = this.b;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.d;
        if (i3 <= 1) {
            clear();
            return obj;
        }
        int i4 = i3 - 1;
        int[] iArr = this.a;
        int length = iArr.length;
        if (length <= 8 || i3 >= length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                iArr.getClass();
                iArr.getClass();
                System.arraycopy(iArr, i5, iArr, i, i3 - i5);
                Object[] objArr2 = this.b;
                objArr2.getClass();
                objArr2.getClass();
                int i6 = i5 << 1;
                System.arraycopy(objArr2, i6, objArr2, i2, (i3 << 1) - i6);
            }
            Object[] objArr3 = this.b;
            int i7 = i4 << 1;
            objArr3[i7] = null;
            objArr3[i7 + 1] = null;
        } else {
            int i8 = i3 > 8 ? i3 + (i3 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i8);
            iArrCopyOf.getClass();
            this.a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.b, i8 << 1);
            objArrCopyOf.getClass();
            this.b = objArrCopyOf;
            if (i3 != this.d) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                int[] iArr2 = this.a;
                iArr.getClass();
                iArr2.getClass();
                System.arraycopy(iArr, 0, iArr2, 0, i);
                Object[] objArr4 = this.b;
                objArr.getClass();
                objArr4.getClass();
                System.arraycopy(objArr, 0, objArr4, 0, i2);
            }
            if (i < i4) {
                int[] iArr3 = this.a;
                int i9 = i + 1;
                iArr.getClass();
                iArr3.getClass();
                System.arraycopy(iArr, i9, iArr3, i, i3 - i9);
                Object[] objArr5 = this.b;
                objArr.getClass();
                objArr5.getClass();
                int i10 = i9 << 1;
                System.arraycopy(objArr, i10, objArr5, i2, (i3 << 1) - i10);
            }
        }
        if (i3 != this.d) {
            throw new ConcurrentModificationException();
        }
        this.d = i4;
        return obj;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof aha) {
                int i3 = this.d;
                aha ahaVar = (aha) obj;
                if (i3 == ahaVar.d) {
                    for (0; i2 < i3; i2 + 1) {
                        Object objD = d(i2);
                        Object objG = g(i2);
                        Object obj2 = ahaVar.get(objD);
                        if (objG == null) {
                            i2 = (obj2 == null && ahaVar.containsKey(objD)) ? i2 + 1 : 0;
                        } else if (awrc.c(objG, obj2)) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof Map) && this.d == ((Map) obj).size()) {
                int i4 = this.d;
                for (0; i < i4; i + 1) {
                    Object objD2 = d(i);
                    Object objG2 = g(i);
                    Map map = (Map) obj;
                    Object obj3 = map.get(objD2);
                    if (objG2 == null) {
                        i = (obj3 == null && map.containsKey(objD2)) ? i + 1 : 0;
                    } else if (awrc.c(objG2, obj3)) {
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object f(int i, Object obj) {
        if (i < 0 || i >= this.d) {
            dl.k(a.bR(i, "Expected index to be within 0..size()-1, but was "));
        }
        Object[] objArr = this.b;
        int i2 = (i << 1) + 1;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final Object g(int i) {
        if (i < 0 || i >= this.d) {
            dl.k(a.bR(i, "Expected index to be within 0..size()-1, but was "));
        }
        return this.b[(i << 1) + 1];
    }

    public final Object get(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return this.b[(iC << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iC = c(obj);
        return iC >= 0 ? this.b[(iC << 1) + 1] : obj2;
    }

    public final void h(int i) {
        int i2 = this.d;
        int[] iArr = this.a;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            iArrCopyOf.getClass();
            this.a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.b, i << 1);
            objArrCopyOf.getClass();
            this.b = objArrCopyOf;
        }
        if (this.d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i = this.d;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += iArr[i3] ^ (obj != null ? obj.hashCode() : 0);
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public void i(aha ahaVar) {
        int i = ahaVar.d;
        h(this.d + i);
        if (this.d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(ahaVar.d(i2), ahaVar.g(i2));
            }
        } else if (i > 0) {
            int[] iArr = ahaVar.a;
            int[] iArr2 = this.a;
            iArr.getClass();
            iArr2.getClass();
            System.arraycopy(iArr, 0, iArr2, 0, i);
            Object[] objArr = ahaVar.b;
            Object[] objArr2 = this.b;
            objArr.getClass();
            objArr2.getClass();
            System.arraycopy(objArr, 0, objArr2, 0, i << 1);
            this.d = i;
        }
    }

    public final boolean isEmpty() {
        return this.d <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int iJ;
        int iHashCode;
        int i = this.d;
        if (obj != null) {
            iHashCode = obj.hashCode();
            iJ = a(obj, iHashCode);
        } else {
            iJ = j();
            iHashCode = 0;
        }
        if (iJ >= 0) {
            int i2 = (iJ << 1) + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iJ;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            iArrCopyOf.getClass();
            this.a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.b, i4 << 1);
            objArrCopyOf.getClass();
            this.b = objArrCopyOf;
            if (i != this.d) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.a;
            int i5 = i3 + 1;
            iArr2.getClass();
            iArr2.getClass();
            System.arraycopy(iArr2, i3, iArr2, i5, i - i3);
            Object[] objArr2 = this.b;
            int i6 = this.d << 1;
            objArr2.getClass();
            objArr2.getClass();
            int i7 = i3 << 1;
            System.arraycopy(objArr2, i7, objArr2, i5 << 1, i6 - i7);
        }
        int i8 = this.d;
        if (i == i8) {
            int[] iArr3 = this.a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.b;
                int i9 = i3 << 1;
                objArr3[i9] = obj;
                objArr3[i9 + 1] = obj2;
                this.d = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC < 0 || !awrc.c(obj2, g(iC))) {
            return false;
        }
        e(iC);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iC = c(obj);
        if (iC < 0 || !awrc.c(obj2, g(iC))) {
            return false;
        }
        f(iC, obj3);
        return true;
    }

    public final int size() {
        return this.d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objD = d(i2);
            if (objD != sb) {
                sb.append(objD);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objG = g(i2);
            if (objG != sb) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object remove(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return e(iC);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC >= 0) {
            return f(iC, obj2);
        }
        return null;
    }

    public aha() {
        throw null;
    }
}
