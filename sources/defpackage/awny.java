package defpackage;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awny extends awni implements List, RandomAccess, Serializable, awrq {
    public Object[] a;
    public final int b;
    public int c;
    public final awoa d;
    private final awny e;

    public awny(Object[] objArr, int i, int i2, awny awnyVar, awoa awoaVar) {
        objArr.getClass();
        awoaVar.getClass();
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.e = awnyVar;
        this.d = awoaVar;
        this.modCount = awoaVar.modCount;
    }

    private final int d(int i, int i2, Collection collection, boolean z) {
        int iD;
        awny awnyVar = this.e;
        if (awnyVar != null) {
            iD = awnyVar.d(i, i2, collection, z);
        } else {
            awoa awoaVar = this.d;
            int i3 = awoa.d;
            iD = awoaVar.d(i, i2, collection, z);
        }
        if (iD > 0) {
            j();
        }
        this.c -= iD;
        return iD;
    }

    private final Object e(int i) {
        Object objE;
        j();
        awny awnyVar = this.e;
        if (awnyVar != null) {
            objE = awnyVar.e(i);
        } else {
            awoa awoaVar = this.d;
            int i2 = awoa.d;
            objE = awoaVar.e(i);
        }
        this.c--;
        return objE;
    }

    private final void f(int i, Collection collection, int i2) {
        j();
        awny awnyVar = this.e;
        if (awnyVar != null) {
            awnyVar.f(i, collection, i2);
        } else {
            awoa awoaVar = this.d;
            int i3 = awoa.d;
            awoaVar.g(i, collection, i2);
        }
        awoa awoaVar2 = this.d;
        int i4 = awoa.d;
        this.a = awoaVar2.a;
        this.c += i2;
    }

    private final void g(int i, Object obj) {
        j();
        awny awnyVar = this.e;
        if (awnyVar != null) {
            awnyVar.g(i, obj);
        } else {
            awoa awoaVar = this.d;
            int i2 = awoa.d;
            awoaVar.h(i, obj);
        }
        awoa awoaVar2 = this.d;
        int i3 = awoa.d;
        this.a = awoaVar2.a;
        this.c++;
    }

    private final void h() {
        int i = awoa.d;
        if (this.d.modCount != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        if (l()) {
            throw new UnsupportedOperationException();
        }
    }

    private final void j() {
        this.modCount++;
    }

    private final void k(int i, int i2) {
        if (i2 > 0) {
            j();
        }
        awny awnyVar = this.e;
        if (awnyVar != null) {
            awnyVar.k(i, i2);
        } else {
            awoa awoaVar = this.d;
            int i3 = awoa.d;
            awoaVar.i(i, i2);
        }
        this.c -= i2;
    }

    private final boolean l() {
        int i = awoa.d;
        return this.d.c;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (l()) {
            return new awoj(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // defpackage.awni
    public final int a() {
        h();
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        i();
        h();
        atqp.f(i, this.c);
        g(this.b + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        i();
        h();
        atqp.f(i, this.c);
        int i2 = this.b + i;
        int size = collection.size();
        f(i2, collection, size);
        return size > 0;
    }

    @Override // defpackage.awni
    public final Object b(int i) {
        i();
        h();
        atqp.e(i, this.c);
        return e(this.b + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        h();
        k(this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (atqq.n(this.a, this.b, this.c, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h();
        atqp.e(i, this.c);
        return this.a[this.b + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        return atqq.j(this.a, this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i = 0; i < this.c; i++) {
            if (awrc.c(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i = this.c - 1; i >= 0; i--) {
            if (awrc.c(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        h();
        atqp.f(i, this.c);
        return new awnx(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
        h();
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
        i();
        h();
        return d(this.b, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        i();
        h();
        return d(this.b, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        i();
        h();
        atqp.e(i, this.c);
        int i2 = this.b;
        Object[] objArr = this.a;
        int i3 = i2 + i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        atqp.g(i, i2, this.c);
        return new awny(this.a, this.b + i, i2 - i, this, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        h();
        int length = objArr.length;
        int i = this.c;
        Object[] objArr2 = this.a;
        if (length >= i) {
            int i2 = this.b;
            atqq.aW(objArr2, objArr, 0, i2, i + i2);
            atqq.aG(this.c, objArr);
            return objArr;
        }
        int i3 = this.b;
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i3, i + i3, objArr.getClass());
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return atqq.k(this.a, this.b, this.c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        h();
        g(this.b + this.c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        i();
        h();
        int size = collection.size();
        f(this.b + this.c, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.a;
        int i = this.b;
        return atqq.aN(objArr, i, this.c + i);
    }
}
