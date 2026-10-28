package j$.util.stream;

import j$.util.DesugarArrays;
import j$.util.OptionalInt;
import j$.util.Spliterators;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public interface IntStream extends BaseStream<Integer, IntStream> {

    /* JADX INFO: renamed from: j$.util.stream.IntStream$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
    public final /* synthetic */ class CC {
        public static IntStream of(int... iArr) {
            return DesugarArrays.stream(iArr);
        }

        public static IntStream range(int i, int i2) {
            if (i >= i2) {
                j$.util.u0 u0Var = Spliterators.b;
                return new a0(u0Var, z3.l(u0Var), false);
            }
            y4 y4Var = new y4(i, i2, 0);
            return new a0(y4Var, z3.l(y4Var), false);
        }

        public static IntStream rangeClosed(int i, int i2) {
            if (i > i2) {
                j$.util.u0 u0Var = Spliterators.b;
                return new a0(u0Var, z3.l(u0Var), false);
            }
            y4 y4Var = new y4(i, i2, 1);
            return new a0(y4Var, z3.l(y4Var), false);
        }
    }

    boolean allMatch(IntPredicate intPredicate);

    Stream<Integer> boxed();

    IntStream filter(IntPredicate intPredicate);

    OptionalInt findFirst();

    <U> Stream<U> mapToObj(IntFunction<? extends U> intFunction);

    OptionalInt max();

    int sum();

    int[] toArray();
}
