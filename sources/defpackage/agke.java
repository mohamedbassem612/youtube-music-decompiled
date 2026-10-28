package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agke extends agjw implements List, RandomAccess, j$.util.List {
    private static final long serialVersionUID = -889275714;

    @SafeVarargs
    public static agke A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        aguu.j(objArr2, i);
        return new agpi(objArr2, i);
    }

    public static agke B(Comparator comparator, Iterable iterable) {
        comparator.getClass();
        Object[] array = aguu.O(iterable).toArray();
        int length = array.length;
        aguu.j(array, length);
        Arrays.sort(array, comparator);
        return i(array, length);
    }

    public static agjz f(int i) {
        aguu.ag(i, "expectedSize");
        return new agjz(i);
    }

    public static agke h(Object[] objArr) {
        return i(objArr, objArr.length);
    }

    public static agke i(Object[] objArr, int i) {
        return i == 0 ? agpi.a : new agpi(objArr, i);
    }

    public static agke j(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? n((Collection) iterable) : o(iterable.iterator());
    }

    public static agke n(Collection collection) {
        if (!(collection instanceof agjw)) {
            Object[] array = collection.toArray();
            int length = array.length;
            aguu.j(array, length);
            return i(array, length);
        }
        agke agkeVarG = ((agjw) collection).g();
        if (!agkeVarG.l()) {
            return agkeVarG;
        }
        Object[] array2 = agkeVarG.toArray();
        return i(array2, array2.length);
    }

    public static agke o(Iterator it) {
        if (!it.hasNext()) {
            return agpi.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Object[] objArr = {next};
            aguu.j(objArr, 1);
            return new agpi(objArr, 1);
        }
        agjz agjzVar = new agjz(4);
        agjzVar.h(next);
        agjzVar.k(it);
        return agjzVar.g();
    }

    public static agke p(Object[] objArr) {
        if (objArr.length == 0) {
            return agpi.a;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        aguu.j(objArr2, length);
        return i(objArr2, length);
    }

    public static agke q(Object obj) {
        Object[] objArr = {obj};
        aguu.j(objArr, 1);
        return new agpi(objArr, 1);
    }

    public static agke r(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        aguu.j(objArr, 2);
        return new agpi(objArr, 2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static agke s(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        aguu.j(objArr, 3);
        return new agpi(objArr, 3);
    }

    public static agke t(Object obj, Object obj2, Object obj3, Object obj4) {
        Object[] objArr = {obj, obj2, obj3, obj4};
        aguu.j(objArr, 4);
        return new agpi(objArr, 4);
    }

    public static agke u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        aguu.j(objArr, 5);
        return new agpi(objArr, 5);
    }

    public static agke v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        aguu.j(objArr, 6);
        return new agpi(objArr, 6);
    }

    public static agke w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7};
        aguu.j(objArr, 7);
        return new agpi(objArr, 7);
    }

    public static agke x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8};
        aguu.j(objArr, 8);
        return new agpi(objArr, 8);
    }

    public static agke y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9};
        aguu.j(objArr, 9);
        return new agpi(objArr, 9);
    }

    public static agke z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10};
        aguu.j(objArr, 10);
        return new agpi(objArr, 10);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final agqs listIterator(int i) {
        ahno.X(i, size());
        return isEmpty() ? agpi.b : new agka(this, i);
    }

    public agke a() {
        return size() > 1 ? new agkb(this) : this;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.agjw
    public int b(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public agke subList(int i, int i2) {
        ahno.N(i, i2, size());
        int i3 = i2 - i;
        if (i3 != size()) {
            return i3 == 0 ? agpi.a : new agkd(this, i, i3);
        }
        return this;
    }

    @Override // defpackage.agjw, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return aguu.v(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.agjw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.agjw
    /* JADX INFO: renamed from: k */
    public final agqr iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        j$.util.List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        j$.util.List.CC.$default$sort(this, comparator);
    }

    @Override // defpackage.agjw
    public Object writeReplace() {
        return new agkc(toArray());
    }

    @Override // defpackage.agjw
    @Deprecated
    public final agke g() {
        return this;
    }
}
