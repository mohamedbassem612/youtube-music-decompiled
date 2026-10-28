package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awnm extends awni {
    private static final Object[] d = new Object[0];
    public int a;
    public Object[] b;
    public int c;

    public awnm(Collection collection) {
        Object[] array = collection.toArray(new Object[0]);
        this.b = array;
        int length = array.length;
        this.c = length;
        if (length == 0) {
            this.b = d;
        }
    }

    private final int f(int i) {
        if (i != 0) {
            return i - 1;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        return objArr.length - 1;
    }

    private final int g(int i) {
        Object[] objArr = this.b;
        objArr.getClass();
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    private final int h(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    private final void i(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c += collection.size();
    }

    private final void j(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i > length) {
            if (objArr == d) {
                if (i < 10) {
                    i = 10;
                }
                this.b = new Object[i];
                return;
            }
            Object[] objArr2 = new Object[atqp.h(length, i)];
            int i2 = this.a;
            objArr.getClass();
            System.arraycopy(objArr, i2, objArr2, 0, length - i2);
            Object[] objArr3 = this.b;
            int length2 = objArr3.length;
            int i3 = this.a;
            objArr3.getClass();
            System.arraycopy(objArr3, 0, objArr2, length2 - i3, i3);
            this.a = 0;
            this.b = objArr2;
        }
    }

    private final void k(int i, int i2) {
        Object[] objArr = this.b;
        if (i < i2) {
            atqq.bc(objArr, i, i2);
        } else {
            atqq.bc(objArr, i, objArr.length);
            atqq.bc(this.b, 0, i2);
        }
    }

    private final void l() {
        this.modCount++;
    }

    @Override // defpackage.awni
    public final int a() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        atqp.f(i, this.c);
        if (i == this.c) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        l();
        j(this.c + 1);
        int iC = c(this.a + i);
        int i2 = this.c;
        if (i < ((i2 + 1) >> 1)) {
            int iF = f(iC);
            int iF2 = f(this.a);
            int i3 = this.a;
            Object[] objArr = this.b;
            if (iF >= i3) {
                objArr[iF2] = objArr[i3];
                atqq.aW(objArr, objArr, i3, i3 + 1, iF + 1);
            } else {
                atqq.aW(objArr, objArr, i3 - 1, i3, objArr.length);
                Object[] objArr2 = this.b;
                objArr2[objArr2.length - 1] = objArr2[0];
                atqq.aW(objArr2, objArr2, 0, 1, iF + 1);
            }
            this.b[iF] = obj;
            this.a = iF2;
        } else {
            int iC2 = c(this.a + i2);
            Object[] objArr3 = this.b;
            if (iC < iC2) {
                atqq.aW(objArr3, objArr3, iC + 1, iC, iC2);
            } else {
                atqq.aW(objArr3, objArr3, 1, 0, iC2);
                Object[] objArr4 = this.b;
                int length = objArr4.length - 1;
                objArr4[0] = objArr4[length];
                atqq.aW(objArr4, objArr4, iC + 1, iC, length);
            }
            this.b[iC] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        atqp.f(i, this.c);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.c) {
            return addAll(collection);
        }
        l();
        j(this.c + collection.size());
        int iC = c(this.a + this.c);
        int iC2 = c(this.a + i);
        int size = collection.size();
        if (i < ((this.c + 1) >> 1)) {
            int i2 = this.a;
            int i3 = i2 - size;
            if (iC2 >= i2) {
                Object[] objArr = this.b;
                if (i3 >= 0) {
                    atqq.aW(objArr, objArr, i3, i2, iC2);
                } else {
                    int length = objArr.length;
                    i3 += length;
                    int i4 = length - i3;
                    if (i4 >= iC2 - i2) {
                        atqq.aW(objArr, objArr, i3, i2, iC2);
                    } else {
                        atqq.aW(objArr, objArr, i3, i2, i2 + i4);
                        Object[] objArr2 = this.b;
                        atqq.aW(objArr2, objArr2, 0, this.a + i4, iC2);
                    }
                }
            } else {
                Object[] objArr3 = this.b;
                atqq.aW(objArr3, objArr3, i3, i2, objArr3.length);
                Object[] objArr4 = this.b;
                if (size >= iC2) {
                    atqq.aW(objArr4, objArr4, objArr4.length - size, 0, iC2);
                } else {
                    atqq.aW(objArr4, objArr4, objArr4.length - size, 0, size);
                    Object[] objArr5 = this.b;
                    atqq.aW(objArr5, objArr5, 0, size, iC2);
                }
            }
            this.a = i3;
            i(h(iC2 - size), collection);
        } else {
            int i5 = iC2 + size;
            Object[] objArr6 = this.b;
            if (iC2 < iC) {
                int i6 = size + iC;
                int length2 = objArr6.length;
                if (i6 <= length2) {
                    atqq.aW(objArr6, objArr6, i5, iC2, iC);
                } else if (i5 >= length2) {
                    atqq.aW(objArr6, objArr6, i5 - length2, iC2, iC);
                } else {
                    int i7 = iC - (i6 - length2);
                    atqq.aW(objArr6, objArr6, 0, i7, iC);
                    Object[] objArr7 = this.b;
                    atqq.aW(objArr7, objArr7, i5, iC2, i7);
                }
            } else {
                atqq.aW(objArr6, objArr6, size, 0, iC);
                Object[] objArr8 = this.b;
                int length3 = objArr8.length;
                if (i5 >= length3) {
                    atqq.aW(objArr8, objArr8, i5 - length3, iC2, length3);
                } else {
                    atqq.aW(objArr8, objArr8, 0, length3 - size, length3);
                    Object[] objArr9 = this.b;
                    atqq.aW(objArr9, objArr9, i5, iC2, objArr9.length - size);
                }
            }
            i(iC2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        l();
        j(this.c + 1);
        int iF = f(this.a);
        this.a = iF;
        this.b[iF] = obj;
        this.c++;
    }

    public final void addLast(Object obj) {
        l();
        j(this.c + 1);
        this.b[c(this.a + this.c)] = obj;
        this.c++;
    }

    @Override // defpackage.awni
    public final Object b(int i) {
        atqp.e(i, this.c);
        if (i == this.c - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        l();
        int iC = c(this.a + i);
        Object[] objArr = this.b;
        Object obj = objArr[iC];
        int i2 = this.c;
        int i3 = i2 >> 1;
        int i4 = this.a;
        if (i < i3) {
            if (iC >= i4) {
                atqq.aW(objArr, objArr, i4 + 1, i4, iC);
            } else {
                atqq.aW(objArr, objArr, 1, 0, iC);
                Object[] objArr2 = this.b;
                int length = objArr2.length - 1;
                objArr2[0] = objArr2[length];
                int i5 = this.a;
                atqq.aW(objArr2, objArr2, i5 + 1, i5, length);
            }
            Object[] objArr3 = this.b;
            int i6 = this.a;
            objArr3[i6] = null;
            this.a = g(i6);
        } else {
            int iC2 = c(i4 + (i2 - 1));
            Object[] objArr4 = this.b;
            int i7 = iC + 1;
            if (iC <= iC2) {
                atqq.aW(objArr4, objArr4, iC, i7, iC2 + 1);
            } else {
                atqq.aW(objArr4, objArr4, iC, i7, objArr4.length);
                Object[] objArr5 = this.b;
                objArr5[objArr5.length - 1] = objArr5[0];
                atqq.aW(objArr5, objArr5, 0, 1, iC2 + 1);
            }
            this.b[iC2] = null;
        }
        this.c--;
        return obj;
    }

    public final int c(int i) {
        int length = this.b.length;
        return i >= length ? i - length : i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            l();
            k(this.a, c(this.a + this.c));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object d() {
        if (isEmpty()) {
            return null;
        }
        return this.b[c(this.a + (this.c - 1))];
    }

    public final Object e() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        atqp.e(i, this.c);
        return this.b[c(this.a + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iC = c(this.a + this.c);
        int length = this.a;
        if (length < iC) {
            while (length < iC) {
                if (awrc.c(obj, this.b[length])) {
                    i = this.a;
                    break;
                }
                length++;
            }
            return -1;
        }
        if (!isEmpty() && length >= iC) {
            int length2 = this.b.length;
            while (true) {
                if (length >= length2) {
                    for (int i2 = 0; i2 < iC; i2++) {
                        if (awrc.c(obj, this.b[i2])) {
                            length = i2 + this.b.length;
                            i = this.a;
                            break;
                        }
                    }
                } else {
                    if (awrc.c(obj, this.b[length])) {
                        i = this.a;
                        break;
                    }
                    length++;
                }
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iC = c(this.a + this.c);
        int i2 = this.a;
        if (i2 >= iC) {
            if (isEmpty() || i2 < iC) {
                return -1;
            }
            int i3 = iC - 1;
            while (true) {
                Object[] objArr = this.b;
                if (i3 < 0) {
                    objArr.getClass();
                    int i4 = this.a;
                    int length2 = objArr.length - 1;
                    if (i4 > length2) {
                        return -1;
                    }
                    while (!awrc.c(obj, this.b[length2])) {
                        if (length2 == i4) {
                            return -1;
                        }
                        length2--;
                    }
                    length = length2;
                } else {
                    if (awrc.c(obj, objArr[i3])) {
                        length = i3 + this.b.length;
                        i = this.a;
                        break;
                    }
                    i3--;
                }
            }
            return length - i;
        }
        length = iC - 1;
        if (i2 > length) {
            return -1;
        }
        while (!awrc.c(obj, this.b[length])) {
            if (length == i2) {
                return -1;
            }
            length--;
        }
        i = this.a;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iC;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        if (isEmpty() || this.b.length == 0) {
            return false;
        }
        int iC2 = c(this.a + this.c);
        int i = this.a;
        if (i < iC2) {
            iC = i;
            while (true) {
                objArr = this.b;
                if (i >= iC2) {
                    break;
                }
                Object obj = objArr[i];
                if (collection.contains(obj)) {
                    z = true;
                } else {
                    this.b[iC] = obj;
                    iC++;
                }
                i++;
            }
            atqq.bc(objArr, iC, iC2);
        } else {
            int length = this.b.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                Object[] objArr2 = this.b;
                Object obj2 = objArr2[i];
                objArr2[i] = null;
                if (collection.contains(obj2)) {
                    z2 = true;
                } else {
                    this.b[i2] = obj2;
                    i2++;
                }
                i++;
            }
            iC = c(i2);
            for (int i3 = 0; i3 < iC2; i3++) {
                Object[] objArr3 = this.b;
                Object obj3 = objArr3[i3];
                objArr3[i3] = null;
                if (collection.contains(obj3)) {
                    z2 = true;
                } else {
                    this.b[iC] = obj3;
                    iC = g(iC);
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        l();
        this.c = h(iC - this.a);
        return true;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        l();
        Object[] objArr = this.b;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = g(i);
        this.c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        l();
        int iC = c(this.a + (this.c - 1));
        Object[] objArr = this.b;
        Object obj = objArr[iC];
        objArr[iC] = null;
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        atqp.g(i, i2, this.c);
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == this.c) {
                clear();
                return;
            }
            if (i3 == 1) {
                b(i);
                return;
            }
            l();
            int i4 = this.c - i2;
            int i5 = this.a;
            if (i < i4) {
                int iC = c(i5 + (i - 1));
                int iC2 = c(this.a + (i2 - 1));
                while (i > 0) {
                    int i6 = iC + 1;
                    int iMin = Math.min(i, Math.min(i6, iC2 + 1));
                    Object[] objArr = this.b;
                    int i7 = iC2 - iMin;
                    int i8 = iC - iMin;
                    atqq.aW(objArr, objArr, i7 + 1, i8 + 1, i6);
                    iC = h(i8);
                    iC2 = h(i7);
                    i -= iMin;
                }
                int iC3 = c(this.a + i3);
                k(this.a, iC3);
                this.a = iC3;
            } else {
                int iC4 = c(i5 + i2);
                int iC5 = c(this.a + i);
                int i9 = this.c;
                while (true) {
                    i9 -= i2;
                    if (i9 <= 0) {
                        break;
                    }
                    int length = this.b.length;
                    i2 = Math.min(i9, Math.min(length - iC4, length - iC5));
                    Object[] objArr2 = this.b;
                    int i10 = iC4 + i2;
                    atqq.aW(objArr2, objArr2, iC5, iC4, i10);
                    iC4 = c(i10);
                    iC5 = c(iC5 + i2);
                }
                int iC6 = c(this.a + this.c);
                k(h(iC6 - i3), iC6);
            }
            this.c -= i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iC;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        if (isEmpty() || this.b.length == 0) {
            return false;
        }
        int iC2 = c(this.a + this.c);
        int i = this.a;
        if (i < iC2) {
            iC = i;
            while (true) {
                objArr = this.b;
                if (i >= iC2) {
                    break;
                }
                Object obj = objArr[i];
                if (collection.contains(obj)) {
                    this.b[iC] = obj;
                    iC++;
                } else {
                    z = true;
                }
                i++;
            }
            atqq.bc(objArr, iC, iC2);
        } else {
            int length = this.b.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                Object[] objArr2 = this.b;
                Object obj2 = objArr2[i];
                objArr2[i] = null;
                if (collection.contains(obj2)) {
                    this.b[i2] = obj2;
                    i2++;
                } else {
                    z2 = true;
                }
                i++;
            }
            iC = c(i2);
            for (int i3 = 0; i3 < iC2; i3++) {
                Object[] objArr3 = this.b;
                Object obj3 = objArr3[i3];
                objArr3[i3] = null;
                if (collection.contains(obj3)) {
                    this.b[iC] = obj3;
                    iC = g(iC);
                } else {
                    z2 = true;
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        l();
        this.c = h(iC - this.a);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        atqp.e(i, this.c);
        int iC = c(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[iC];
        objArr[iC] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iC = c(this.a + this.c);
        int i2 = this.a;
        if (i2 < iC) {
            atqq.aY(this.b, objArr, i2, iC, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            atqq.aW(objArr2, objArr, 0, i2, objArr2.length);
            Object[] objArr3 = this.b;
            atqq.aW(objArr3, objArr, objArr3.length - this.a, 0, iC);
        }
        atqq.aG(this.c, objArr);
        return objArr;
    }

    public awnm(byte[] bArr) {
        this.b = new Object[2];
    }

    public awnm() {
        this.b = d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.c]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        l();
        j(this.c + collection.size());
        i(c(this.a + this.c), collection);
        return true;
    }
}
