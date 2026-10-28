package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class q2 extends i2 {
    @Override // j$.util.stream.i2, j$.util.stream.a5
    public final Object a(a aVar, Spliterator spliterator) {
        return z3.SIZED.p(aVar.f) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.a(aVar, spliterator);
    }

    @Override // j$.util.stream.i2, j$.util.stream.a5
    public final Object b(a aVar, Spliterator spliterator) {
        return z3.SIZED.p(aVar.f) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(aVar, spliterator);
    }

    @Override // j$.util.stream.i2, j$.util.stream.a5
    public final int c() {
        return z3.r;
    }
}
