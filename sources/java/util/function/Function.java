package java.util.function;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public interface Function<T, R> {
    /* JADX INFO: renamed from: andThen */
    <V> Function<T, V> mo840andThen(Function<? super R, ? extends V> function);

    R apply(T t);
}
