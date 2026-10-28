package j$.util.stream;

import j$.util.function.Function$CC;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h implements Supplier, Function {
    public final /* synthetic */ Collector a;

    public /* synthetic */ h(Collector collector) {
        this.a = collector;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        k kVar = (k) obj;
        Set set = Collectors.a;
        Collector collector = this.a;
        return new k(collector.finisher().apply(kVar.a), collector.finisher().apply(kVar.b));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Set set = Collectors.a;
        Collector collector = this.a;
        return new k(collector.supplier().get(), collector.supplier().get());
    }
}
