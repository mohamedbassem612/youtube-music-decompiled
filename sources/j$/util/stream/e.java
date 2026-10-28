package j$.util.stream;

import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements BiFunction, Function {
    public final /* synthetic */ Function a;

    public /* synthetic */ e(Function function) {
        this.a = function;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Map map = (Map) obj;
        Set set = Collectors.a;
        e eVar = new e(this.a);
        if (map instanceof j$.util.Map) {
            ((j$.util.Map) map).replaceAll(eVar);
        } else if (map instanceof ConcurrentMap) {
            j$.util.concurrent.ConcurrentMap.CC.$default$replaceAll((ConcurrentMap) map, eVar);
        } else {
            j$.util.Map.CC.$default$replaceAll(map, eVar);
        }
        return map;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Set set = Collectors.a;
        return this.a.apply(obj2);
    }
}
