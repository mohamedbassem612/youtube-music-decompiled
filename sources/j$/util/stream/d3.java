package j$.util.stream;

import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.Spliterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d3 extends a implements Stream {
    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) d(i2.B(g0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) d(i2.B(g0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Collector collector2;
        Object objD;
        if (this.a.l && collector.characteristics().contains(Collector.Characteristics.CONCURRENT) && (!z3.ORDERED.p(this.f) || collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            objD = collector.supplier().get();
            forEach(new j$.nio.file.y(collector.accumulator(), objD, (byte) 12));
            collector2 = collector;
        } else {
            collector.getClass();
            Supplier supplier = collector.supplier();
            collector2 = collector;
            objD = d(new n2(a4.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        }
        return !collector2.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? collector2.finisher().apply(objD) : objD;
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) d(new q2())).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new o(this, z3.m | z3.t, (byte) 0);
    }

    @Override // j$.util.stream.a
    public final t0 f(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return i2.v(aVar, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        predicate.getClass();
        return new y(this, z3.t, predicate, (byte) 1);
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) d(r.d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) d(r.c);
    }

    @Override // j$.util.stream.Stream
    public final Stream flatMap(Function function) {
        function.getClass();
        return new z2(this, z3.p | z3.n | z3.t, function, (byte) 1);
    }

    public void forEach(Consumer consumer) {
        consumer.getClass();
        d(new u(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        consumer.getClass();
        d(new u(consumer, true));
    }

    @Override // j$.util.stream.a
    public final a4 i() {
        return a4.REFERENCE;
    }

    @Override // j$.util.stream.BaseStream
    public final Iterator iterator() {
        return new j$.util.m0(spliterator());
    }

    @Override // j$.util.stream.a
    public final Spliterator j(Supplier supplier) {
        return new g4(supplier);
    }

    @Override // j$.util.stream.a
    public final l0 k(long j, IntFunction intFunction) {
        return i2.u(j, intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j >= 0) {
            return new i3(this, z3.t | (j != -1 ? z3.u : 0), j);
        }
        j$.time.g.a(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        function.getClass();
        return new z2(this, z3.p | z3.n, function, (byte) 0);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        toIntFunction.getClass();
        return new z(this, z3.p | z3.n, toIntFunction, (byte) 1);
    }

    @Override // j$.util.stream.Stream
    public final LongStream mapToLong(ToLongFunction toLongFunction) {
        toLongFunction.getClass();
        return new a3(this, z3.p | z3.n, toLongFunction);
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        comparator.getClass();
        return (Optional) d(new j2(a4.REFERENCE, new j$.util.function.a(comparator, (byte) 0), (byte) 2));
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        comparator.getClass();
        return (Optional) d(new j2(a4.REFERENCE, new j$.util.function.a(comparator, (byte) 1), (byte) 2));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) d(i2.B(g0.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.a
    public final Spliterator r(a aVar, Supplier supplier, boolean z) {
        return new u4(aVar, supplier, z);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new m3(this);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return i2.x(e(intFunction), intFunction).k(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final List toList() {
        return DesugarCollections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new m3(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new n((byte) 24));
    }
}
