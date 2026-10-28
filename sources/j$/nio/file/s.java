package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Spliterator;
import j$.util.y0;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class s implements Iterable, j$.lang.a {
    public final Iterable a;

    public s(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        Iterable$EL.forEach(this.a, new q(consumer, (byte) 1));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new t(this.a.iterator());
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final Spliterator spliterator() {
        return new y0(iterator());
    }
}
