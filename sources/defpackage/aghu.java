package defpackage;

import j$.util.function.BiConsumer$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aghu {
    public static final Collector a;
    public static final Collector b;

    static {
        final int i = 1;
        final int i2 = 0;
        int i3 = 12;
        a = Collector.CC.of(new idl(10), new BiConsumer() { // from class: aghr
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                int i4 = i;
                if (i4 == 0) {
                    ((agkx) obj).c(obj2);
                } else if (i4 != 1) {
                    ((ahub) obj).i((agpf) obj2);
                } else {
                    ((agjz) obj).h(obj2);
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                int i4 = i;
                if (i4 != 0) {
                    return i4 != 1 ? BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer);
                }
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new aghq(i2), new ygi(i3), new Collector.Characteristics[0]);
        int i4 = 11;
        final int i5 = 2;
        b = Collector.CC.of(new idl(i4), new BiConsumer() { // from class: aghr
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                int i6 = i2;
                if (i6 == 0) {
                    ((agkx) obj).c(obj2);
                } else if (i6 != 1) {
                    ((ahub) obj).i((agpf) obj2);
                } else {
                    ((agjz) obj).h(obj2);
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                int i6 = i2;
                if (i6 != 0) {
                    return i6 != 1 ? BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer);
                }
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new aghq(i5), new ygi(13), new Collector.Characteristics[0]);
        Collector.CC.of(new idl(i3), new BiConsumer() { // from class: aghr
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                int i6 = i5;
                if (i6 == 0) {
                    ((agkx) obj).c(obj2);
                } else if (i6 != 1) {
                    ((ahub) obj).i((agpf) obj2);
                } else {
                    ((agjz) obj).h(obj2);
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                int i6 = i5;
                if (i6 != 0) {
                    return i6 != 1 ? BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer);
                }
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new aghq(i), new ygi(i4), new Collector.Characteristics[0]);
    }

    public static Collector a(final Function function, final Function function2) {
        function2.getClass();
        return Collector.CC.of(new idl(13), new BiConsumer() { // from class: aghs
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Collector collector = aghu.a;
                ((agkh) obj).e(function.apply(obj2), function2.apply(obj2));
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new aghq(3), new ygi(14), new Collector.Characteristics[0]);
    }

    public static Collector b(Function function, Function function2, BinaryOperator binaryOperator) {
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new yoj(17)), new aegf(7));
    }

    public static Collector c(Comparator comparator, final Function function, final Function function2) {
        comparator.getClass();
        function2.getClass();
        int i = 10;
        return Collector.CC.of(new abzk(comparator, i), new BiConsumer() { // from class: aght
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Collector collector = aghu.a;
                ((agld) obj).e(function.apply(obj2), function2.apply(obj2));
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new hnh(i), new aegf(8), Collector.Characteristics.UNORDERED);
    }
}
