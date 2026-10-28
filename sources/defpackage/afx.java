package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afx implements Collection, Set, awrq {
    public int[] a;
    public Object[] b;
    public int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public afx(afx afxVar) {
        this(0);
        if (afxVar != null) {
            int i = afxVar.c;
            c(this.c + i);
            if (this.c != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    add(afxVar.b(i2));
                }
            } else if (i > 0) {
                atqq.aX(afxVar.a, this.a, i, 6);
                atqq.aY(afxVar.b, this.b, 0, i, 6);
                if (this.c != 0) {
                    throw new ConcurrentModificationException();
                }
                this.c = i;
            }
        }
    }

    public final int a(Object obj) {
        return obj == null ? dl.n(this, null, 0) : dl.n(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iN;
        int i2 = this.c;
        if (obj == null) {
            iN = dl.n(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iN = dl.n(this, obj, iHashCode);
        }
        if (iN >= 0) {
            return false;
        }
        int i3 = ~iN;
        int[] iArr = this.a;
        int length = iArr.length;
        if (i2 >= length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.b;
            int[] iArr2 = new int[i4];
            this.a = iArr2;
            this.b = new Object[i4];
            if (i2 != this.c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                atqq.aX(iArr, iArr2, length, 6);
                atqq.aY(objArr, this.b, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.a;
            int i5 = i3 + 1;
            iArr3.getClass();
            iArr3.getClass();
            int i6 = i2 - i3;
            System.arraycopy(iArr3, i3, iArr3, i5, i6);
            Object[] objArr2 = this.b;
            objArr2.getClass();
            objArr2.getClass();
            System.arraycopy(objArr2, i3, objArr2, i5, i6);
        }
        int i7 = this.c;
        if (i2 == i7) {
            int[] iArr4 = this.a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.b[i3] = obj;
                this.c = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        c(this.c + collection.size());
        Iterator it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object b(int i) {
        return this.b[i];
    }

    public final void c(int i) {
        int i2 = this.c;
        int[] iArr = this.a;
        if (iArr.length < i) {
            Object[] objArr = this.b;
            int[] iArr2 = new int[i];
            this.a = iArr2;
            this.b = new Object[i];
            if (i2 > 0) {
                atqq.aX(iArr, iArr2, i2, 6);
                atqq.aY(objArr, this.b, 0, this.c, 6);
            }
        }
        if (this.c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.c != 0) {
            this.a = ahe.a;
            this.b = ahe.c;
            this.c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return a(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i) {
        int i2 = this.c;
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.a;
        int length = iArr.length;
        if (length <= 8 || i2 >= length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                iArr.getClass();
                iArr.getClass();
                int i5 = i2 - i4;
                System.arraycopy(iArr, i4, iArr, i, i5);
                Object[] objArr2 = this.b;
                objArr2.getClass();
                objArr2.getClass();
                System.arraycopy(objArr2, i4, objArr2, i, i5);
            }
            this.b[i3] = null;
        } else {
            int i6 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i6];
            this.a = iArr2;
            this.b = new Object[i6];
            if (i > 0) {
                atqq.aX(iArr, iArr2, i, 6);
                atqq.aY(objArr, this.b, 0, i, 6);
            }
            if (i < i3) {
                int[] iArr3 = this.a;
                int i7 = i + 1;
                iArr.getClass();
                iArr3.getClass();
                int i8 = i2 - i7;
                System.arraycopy(iArr, i7, iArr3, i, i8);
                Object[] objArr3 = this.b;
                objArr.getClass();
                objArr3.getClass();
                System.arraycopy(objArr, i7, objArr3, i, i8);
            }
        }
        if (i2 != this.c) {
            throw new ConcurrentModificationException();
        }
        this.c = i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.c == ((Set) obj).size()) {
            try {
                int i = this.c;
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Set) obj).contains(b(i2))) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new afw(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iA = a(obj);
        if (iA < 0) {
            return false;
        }
        d(iA);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.c - 1; i >= 0; i--) {
            if (!atqq.ay(collection, this.b[i])) {
                d(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.c;
        int length = objArr.length;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (length > i) {
            objArr[i] = null;
        }
        Object[] objArr2 = this.b;
        int i2 = this.c;
        objArr2.getClass();
        objArr.getClass();
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 14);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objB = b(i2);
            if (objB != this) {
                sb.append(objB);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.b;
        int i = this.c;
        objArr.getClass();
        atqq.aJ(i, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, 0, i);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    public afx(int i) {
        this.a = ahe.a;
        this.b = ahe.c;
        if (i > 0) {
            this.a = new int[i];
            this.b = new Object[i];
        }
    }

    public afx(Collection collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }
}
