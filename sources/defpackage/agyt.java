package defpackage;

import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agyt extends agyz {
    public final Stream a;
    public final Function b;
    public final Function c;

    public agyt(Stream stream, Function function, Function function2) {
        stream.getClass();
        this.a = stream;
        function.getClass();
        this.b = function;
        function2.getClass();
        this.c = function2;
    }

    @Override // defpackage.agyz
    public final Stream a(final BiFunction biFunction) {
        return this.a.map(new Function() { // from class: agys
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public final /* synthetic */ Function mo840andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                BiFunction biFunction2 = biFunction;
                agyt agytVar = this.a;
                return biFunction2.apply(agytVar.b.apply(obj), agytVar.c.apply(obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
