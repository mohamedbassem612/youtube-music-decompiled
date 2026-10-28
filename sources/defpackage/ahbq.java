package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.RandomAccess;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahbq extends AbstractList implements RandomAccess, Serializable, List {
    private static final long serialVersionUID = 0;
    public final int[] a;
    public final int b;
    public final int c;

    public ahbq(int[] iArr, int i, int i2) {
        this.a = iArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && ahng.N(this.a, ((Integer) obj).intValue(), this.b, this.c) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahbq)) {
            return super.equals(obj);
        }
        ahbq ahbqVar = (ahbq) obj;
        int size = size();
        if (ahbqVar.size() == size) {
            for (int i = 0; i < size; i++) {
                if (this.a[this.b + i] == ahbqVar.a[ahbqVar.b + i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        ahno.W(i, size());
        return Integer.valueOf(this.a[this.b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.b; i2 < this.c; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.a;
            int iIntValue = ((Integer) obj).intValue();
            int i = this.b;
            int iN = ahng.N(iArr, iIntValue, i, this.c);
            if (iN >= 0) {
                return iN - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int[] iArr = this.a;
        int iIntValue = ((Integer) obj).intValue();
        int i = this.b;
        int i2 = this.c - 1;
        while (i2 >= i) {
            if (iArr[i2] == iIntValue) {
                if (i2 >= 0) {
                    return i2 - i;
                }
                return -1;
            }
            i2--;
        }
        i2 = -1;
        if (i2 >= 0) {
            return i2 - i;
        }
        return -1;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        ahno.W(i, size());
        int[] iArr = this.a;
        int i2 = this.b + i;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c - this.b;
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.a, this.b, this.c, 0);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i, int i2) {
        ahno.N(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int[] iArr = this.a;
        int i3 = this.b;
        return new ahbq(iArr, i3 + i, i2 + i3);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.a;
        int i = this.b;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }
}
