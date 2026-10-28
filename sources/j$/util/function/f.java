package j$.util.function;

import java.util.function.IntUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f implements IntUnaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ IntUnaryOperator b;
    public final /* synthetic */ IntUnaryOperator c;

    public /* synthetic */ f(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2, byte b) {
        this.a = b;
        this.b = intUnaryOperator;
        this.c = intUnaryOperator2;
    }

    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        byte b = this.a;
        IntUnaryOperator intUnaryOperator = this.c;
        IntUnaryOperator intUnaryOperator2 = this.b;
        switch (b) {
            case 0:
                return intUnaryOperator.applyAsInt(intUnaryOperator2.applyAsInt(i));
            default:
                return intUnaryOperator2.applyAsInt(intUnaryOperator.applyAsInt(i));
        }
    }

    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
    }
}
