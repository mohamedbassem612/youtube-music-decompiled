package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.util.Map;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class agyz implements AutoCloseable {
    public static agyz b(Map map) {
        return c(Collection.EL.stream(map.entrySet()));
    }

    public static agyz c(Stream stream) {
        return new agyt(stream, new aegf(12), new aegf(13));
    }

    public static agyz d(Iterable iterable, Iterable iterable2) {
        return new agyy(e(iterable), e(iterable2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Stream e(Iterable iterable) {
        return iterable instanceof java.util.Collection ? Collection.EL.stream(iterable) : StreamSupport.stream(new agyq(iterable.iterator()), false);
    }

    public abstract Stream a(BiFunction biFunction);
}
