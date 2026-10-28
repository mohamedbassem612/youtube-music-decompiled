package defpackage;

import j$.util.function.IntUnaryOperator$CC;
import java.util.function.IntUnaryOperator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ktx implements IntUnaryOperator {
    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        return Math.max(i - 1, 0);
    }

    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
    }
}
