package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class a2 extends c2 implements f3 {
    public final long[] h;

    public a2(a2 a2Var, Spliterator spliterator, long j, long j2) {
        super(a2Var, spliterator, j, j2, a2Var.h.length);
        this.h = a2Var.h;
    }

    @Override // j$.util.stream.f3
    public final /* synthetic */ void B(Long l) {
        i2.g(this, l);
    }

    @Override // j$.util.stream.c2
    public final c2 a(Spliterator spliterator, long j, long j2) {
        return new a2(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.c2, j$.util.stream.g3
    public final void accept(long j) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(i));
        }
        long[] jArr = this.h;
        this.f = i + 1;
        jArr[i] = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.desugar.sun.nio.fs.g.c(this, longConsumer);
    }

    public a2(Spliterator spliterator, a aVar, long[] jArr) {
        super(spliterator, aVar, jArr.length);
        this.h = jArr;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        B((Long) obj);
    }
}
