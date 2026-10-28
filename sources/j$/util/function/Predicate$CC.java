package j$.util.function;

import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.function.Predicate$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class Predicate$CC {
    public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new i(predicate, predicate2, (byte) 0);
    }

    public static Predicate $default$negate(Predicate predicate) {
        return new j$.desugar.sun.nio.fs.h((byte) 5, predicate);
    }

    public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new i(predicate, predicate2, (byte) 1);
    }

    public static <T> Predicate<T> not(Predicate<? super T> predicate) {
        predicate.getClass();
        return predicate.mo841negate();
    }
}
