package j$.util;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class k implements Iterator, v {
    public final /* synthetic */ byte a = 0;
    public final Iterator b;

    public k(l lVar) {
        this.b = lVar.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.v
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                Iterator$EL.forEachRemaining(this.b, consumer);
                break;
            default:
                Iterator$EL.forEachRemaining(this.b, new j$.nio.file.q(consumer, (byte) 2));
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return new o((java.util.Map.Entry) this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public k(q qVar) {
        this.b = qVar.a.iterator();
    }
}
