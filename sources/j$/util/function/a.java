package j$.util.function;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements BinaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Comparator b;

    public /* synthetic */ a(Comparator comparator, byte b) {
        this.a = b;
        this.b = comparator;
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
        Comparator comparator = this.b;
        switch (b) {
            case 0:
                if (comparator.compare(obj, obj2) >= 0) {
                    return obj;
                }
                break;
            default:
                if (comparator.compare(obj, obj2) <= 0) {
                    return obj;
                }
                break;
        }
        return obj2;
    }
}
