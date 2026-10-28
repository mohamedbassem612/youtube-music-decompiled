package defpackage;

import j$.util.function.BiFunction$CC;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class adtf implements BiFunction {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ adtf(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return this.$cid != 0 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        if (this.$cid == 0) {
            return new abfv(((abfv) obj2).a, this.a);
        }
        byte[] bArr = (byte[]) obj2;
        Object obj3 = this.a;
        return !Arrays.equals(bArr, (byte[]) obj3) ? obj3 : bArr;
    }
}
