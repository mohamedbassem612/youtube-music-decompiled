package defpackage;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awoa extends awni implements List, RandomAccess, Serializable, awrq {
    public static final /* synthetic */ int d = 0;
    private static final awoa e;
    public Object[] a;
    public int b;
    public boolean c;

    static {
        awoa awoaVar = new awoa(0);
        awoaVar.c = true;
        e = awoaVar;
    }

    public awoa(int i) {
        this.a = new Object[i];
    }

    private final void j() {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    private final void k(int i, int i2) {
        int i3 = this.b + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArrCopyOf = this.a;
        int length = objArrCopyOf.length;
        if (i3 > length) {
            objArrCopyOf.getClass();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, atqp.h(length, i3));
            objArrCopyOf.getClass();
            this.a = objArrCopyOf;
        }
        int i4 = this.b;
        objArrCopyOf.getClass();
        objArrCopyOf.getClass();
        System.arraycopy(objArrCopyOf, i, objArrCopyOf, i + i2, i4 - i);
        this.b += i2;
    }

    private final void l() {
        this.modCount++;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.c) {
            return new awoj(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // defpackage.awni
    public final int a() {
        return this.b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        j();
        atqp.f(i, this.b);
        h(i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        j();
        atqp.f(i, this.b);
        int size = collection.size();
        g(i, collection, size);
        return size > 0;
    }

    @Override // defpackage.awni
    public final Object b(int i) {
        j();
        atqp.e(i, this.b);
        return e(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j();
        i(0, this.b);
    }

    public final int d(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.a;
            if (i3 >= i2) {
                break;
            }
            int i5 = i3 + 1;
            int i6 = i3 + i;
            if (collection.contains(objArr[i6]) == z) {
                Object[] objArr2 = this.a;
                objArr2[i + i4] = objArr2[i6];
                i4++;
            }
            i3 = i5;
        }
        int i7 = i2 - i4;
        atqq.aW(objArr, objArr, i + i4, i + i2, this.b);
        Object[] objArr3 = this.a;
        int i8 = this.b;
        atqq.m(objArr3, i8 - i7, i8);
        if (i7 > 0) {
            l();
        }
        this.b -= i7;
        return i7;
    }

    public final Object e(int i) {
        l();
        Object[] objArr = this.a;
        Object obj = objArr[i];
        atqq.aW(objArr, objArr, i, i + 1, this.b);
        atqq.l(this.a, this.b - 1);
        this.b--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (atqq.n(this.a, 0, this.b, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final List f() {
        j();
        this.c = true;
        return this.b <= 0 ? e : this;
    }

    public final void g(int i, Collection collection, int i2) {
        l();
        k(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.a[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        atqp.e(i, this.b);
        return this.a[i];
    }

    public final void h(int i, Object obj) {
        l();
        k(i, 1);
        this.a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return atqq.j(this.a, 0, this.b);
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            l();
        }
        Object[] objArr = this.a;
        atqq.aW(objArr, objArr, i, i + i2, this.b);
        Object[] objArr2 = this.a;
        int i3 = this.b;
        atqq.m(objArr2, i3 - i2, i3);
        this.b -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.b; i++) {
            if (awrc.c(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (awrc.c(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        atqp.f(i, this.b);
        return new awnz(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j();
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        j();
        return d(0, this.b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        j();
        return d(0, this.b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        j();
        atqp.e(i, this.b);
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        atqp.g(i, i2, this.b);
        return new awny(this.a, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.b;
        Object[] objArr2 = this.a;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        objArr2.getClass();
        System.arraycopy(objArr2, 0, objArr, 0, i);
        atqq.aG(this.b, objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return atqq.k(this.a, 0, this.b, this);
    }

    public awoa() {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        j();
        h(this.b, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        j();
        int size = collection.size();
        g(this.b, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return atqq.aN(this.a, 0, this.b);
    }
}
