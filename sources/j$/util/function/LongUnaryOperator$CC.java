package j$.util.function;

import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: j$.util.function.LongUnaryOperator$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class LongUnaryOperator$CC {
    public static LongUnaryOperator $default$andThen(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2) {
        longUnaryOperator2.getClass();
        return new h(longUnaryOperator, longUnaryOperator2, (byte) 0);
    }

    public static LongUnaryOperator $default$compose(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2) {
        longUnaryOperator2.getClass();
        return new h(longUnaryOperator, longUnaryOperator2, (byte) 1);
    }
}
