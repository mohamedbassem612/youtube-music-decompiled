package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class z1 extends c2 implements e3 {
    public final int[] h;

    public z1(z1 z1Var, Spliterator spliterator, long j, long j2) {
        super(z1Var, spliterator, j, j2, z1Var.h.length);
        this.h = z1Var.h;
    }

    @Override // j$.util.stream.c2
    public final c2 a(Spliterator spliterator, long j, long j2) {
        return new z1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.c2, j$.util.stream.g3
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(i2));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.e3
    public final /* synthetic */ void r(Integer num) {
        i2.e(this, num);
    }

    public z1(Spliterator spliterator, a aVar, int[] iArr) {
        super(spliterator, aVar, iArr.length);
        this.h = iArr;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        r((Integer) obj);
    }
}
