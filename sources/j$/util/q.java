package j$.util;

import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class q extends t {
    private static final long serialVersionUID = 7854390611657943733L;

    @Override // j$.util.l, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        o oVar = new o();
        oVar.a = (java.util.Map.Entry) obj;
        return this.a.contains(oVar);
    }

    @Override // j$.util.l, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.util.t, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            if (set.size() == this.a.size()) {
                return containsAll(set);
            }
        }
        return false;
    }

    @Override // j$.util.l, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        Collection.EL.a(this.a, new j$.nio.file.q(consumer, (byte) 2));
    }

    @Override // j$.util.l, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new k(this);
    }

    @Override // j$.util.l, java.util.Collection, j$.util.Collection
    public final Stream parallelStream() {
        return StreamSupport.stream(spliterator(), true);
    }

    @Override // j$.util.l, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final Spliterator spliterator() {
        return new p(Collection.EL.c(this.a));
    }

    @Override // j$.util.l, java.util.Collection, j$.util.Collection
    public final Stream stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    @Override // j$.util.l, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i = 0; i < array.length; i++) {
            array[i] = new o((java.util.Map.Entry) array[i]);
        }
        if (array.length > objArr.length) {
            return array;
        }
        System.arraycopy(array, 0, objArr, 0, array.length);
        if (objArr.length > array.length) {
            objArr[array.length] = null;
        }
        return objArr;
    }

    @Override // j$.util.l, java.util.Collection
    public final Object[] toArray() {
        Object[] array = this.a.toArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = new o((java.util.Map.Entry) array[i]);
        }
        return array;
    }
}
