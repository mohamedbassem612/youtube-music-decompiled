package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class b3 extends d3 {
    @Override // j$.util.stream.d3, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (this.a.l) {
            super.forEach(consumer);
        } else {
            q().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.d3, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (this.a.l) {
            super.forEachOrdered(consumer);
        } else {
            q().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.a
    public final boolean n() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final g3 o(int i, g3 g3Var) {
        throw new UnsupportedOperationException();
    }
}
