package j$.util.stream;

import j$.util.function.BiFunction$CC;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g implements BinaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BinaryOperator b;

    public /* synthetic */ g(BinaryOperator binaryOperator, byte b) {
        this.a = b;
        this.b = binaryOperator;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        byte b = this.a;
        BinaryOperator binaryOperator = this.b;
        switch (b) {
            case 0:
                k kVar = (k) obj;
                k kVar2 = (k) obj2;
                Set set = Collectors.a;
                return new k(binaryOperator.apply(kVar.a, kVar2.a), binaryOperator.apply(kVar.b, kVar2.b));
            default:
                Map map = (Map) obj;
                Set set2 = Collectors.a;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    j$.util.Map.EL.merge(map, entry.getKey(), entry.getValue(), binaryOperator);
                }
                return map;
        }
    }
}
