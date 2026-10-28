package j$.util.function;

import java.util.function.IntPredicate;

/* JADX INFO: renamed from: j$.util.function.IntPredicate$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class IntPredicate$CC {
    public static IntPredicate $default$and(IntPredicate intPredicate, IntPredicate intPredicate2) {
        intPredicate2.getClass();
        return new e(intPredicate, intPredicate2, (byte) 1);
    }

    public static IntPredicate $default$negate(IntPredicate intPredicate) {
        return new j$.desugar.sun.nio.fs.h((byte) 4, intPredicate);
    }

    public static IntPredicate $default$or(IntPredicate intPredicate, IntPredicate intPredicate2) {
        intPredicate2.getClass();
        return new e(intPredicate, intPredicate2, (byte) 0);
    }
}
