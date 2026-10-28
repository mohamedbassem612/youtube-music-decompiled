package j$.util;

import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import j$.util.stream.z3;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class DesugarArrays {
    public static IntStream stream(int[] iArr) {
        Spliterator.OfInt ofIntSpliterator = Spliterators.spliterator(iArr, 0, iArr.length, 1040);
        return new j$.util.stream.a0(ofIntSpliterator, z3.l(ofIntSpliterator), false);
    }

    public static <T> Stream<T> stream(T[] tArr) {
        return StreamSupport.stream(Spliterators.b(tArr, 0, tArr.length, 1040), false);
    }
}
