package j$.util.function;

import java.util.function.LongUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h implements LongUnaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LongUnaryOperator b;
    public final /* synthetic */ LongUnaryOperator c;

    public /* synthetic */ h(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2, byte b) {
        this.a = b;
        this.b = longUnaryOperator;
        this.c = longUnaryOperator2;
    }

    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return LongUnaryOperator$CC.$default$andThen(this, longUnaryOperator);
    }

    @Override // java.util.function.LongUnaryOperator
    public final long applyAsLong(long j) {
        byte b = this.a;
        LongUnaryOperator longUnaryOperator = this.c;
        LongUnaryOperator longUnaryOperator2 = this.b;
        switch (b) {
            case 0:
                return longUnaryOperator.applyAsLong(longUnaryOperator2.applyAsLong(j));
            default:
                return longUnaryOperator2.applyAsLong(longUnaryOperator.applyAsLong(j));
        }
    }

    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return LongUnaryOperator$CC.$default$compose(this, longUnaryOperator);
    }
}
