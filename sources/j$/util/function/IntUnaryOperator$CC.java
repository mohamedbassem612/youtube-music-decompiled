package j$.util.function;

import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: j$.util.function.IntUnaryOperator$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class IntUnaryOperator$CC {
    public static IntUnaryOperator $default$andThen(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2) {
        intUnaryOperator2.getClass();
        return new f(intUnaryOperator, intUnaryOperator2, (byte) 0);
    }

    public static IntUnaryOperator $default$compose(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2) {
        intUnaryOperator2.getClass();
        return new f(intUnaryOperator, intUnaryOperator2, (byte) 1);
    }
}
