package j$.util.function;

import j$.desugar.sun.nio.fs.o;
import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.function.Function$-CC, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class Function$CC {
    public static Function $default$andThen(Function function, Function function2) {
        function2.getClass();
        return new c(function, function2, (byte) 0);
    }

    public static Function $default$compose(Function function, Function function2) {
        function2.getClass();
        return new c(function, function2, (byte) 1);
    }

    public static <T> Function<T, T> identity() {
        return new o((byte) 12);
    }
}
