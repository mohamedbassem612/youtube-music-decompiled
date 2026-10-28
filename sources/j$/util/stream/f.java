package j$.util.stream;

import j$.util.Map;
import j$.util.Objects;
import j$.util.StringJoiner;
import j$.util.function.BiConsumer$CC;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f implements BiConsumer, Supplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Function function = (Function) this.b;
        switch (b) {
            case 0:
                Set set = Collectors.a;
                Map.EL.merge((java.util.Map) obj, function.apply(obj2), ((Function) obj4).apply(obj2), (BinaryOperator) obj3);
                break;
            default:
                Set set2 = Collectors.a;
                Object objApply = function.apply(obj2);
                Objects.a(objApply, "element cannot be mapped to a null key");
                ((BiConsumer) obj3).accept(Map.EL.computeIfAbsent((java.util.Map) obj, objApply, new j$.desugar.sun.nio.fs.h((byte) 8, (Supplier) obj4)), obj2);
                break;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        CharSequence charSequence = (CharSequence) this.b;
        CharSequence charSequence2 = (CharSequence) this.c;
        CharSequence charSequence3 = (CharSequence) this.d;
        Set set = Collectors.a;
        return new StringJoiner(charSequence, charSequence2, charSequence3);
    }
}
