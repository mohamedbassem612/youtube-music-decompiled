package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class b2 extends c2 {
    public final Object[] h;

    public b2(b2 b2Var, Spliterator spliterator, long j, long j2) {
        super(b2Var, spliterator, j, j2, b2Var.h.length);
        this.h = b2Var.h;
    }

    @Override // j$.util.stream.c2
    public final c2 a(Spliterator spliterator, long j, long j2) {
        return new b2(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(i));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }

    public b2(Spliterator spliterator, a aVar, Object[] objArr) {
        super(spliterator, aVar, objArr.length);
        this.h = objArr;
    }
}
