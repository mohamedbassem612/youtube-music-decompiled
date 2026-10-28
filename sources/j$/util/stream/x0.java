package j$.util.stream;

import j$.util.Spliterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class x0 implements t0 {
    public final Collection a;

    public x0(Collection collection) {
        this.a = collection;
    }

    @Override // j$.util.stream.t0
    public final t0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.t0
    public final long count() {
        return this.a.size();
    }

    @Override // j$.util.stream.t0
    public final void forEach(Consumer consumer) {
        j$.util.Collection.EL.a(this.a, consumer);
    }

    @Override // j$.util.stream.t0
    public final /* synthetic */ t0 g(long j, long j2, IntFunction intFunction) {
        return i2.t(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.t0
    public final void h(Object[] objArr, int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // j$.util.stream.t0
    public final Object[] k(IntFunction intFunction) {
        Collection collection = this.a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.t0
    public final int l() {
        return 0;
    }

    @Override // j$.util.stream.t0
    public final Spliterator spliterator() {
        return j$.util.Collection.EL.stream(this.a).spliterator();
    }

    public final String toString() {
        Collection collection = this.a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
