package j$.util.function;

import java.util.function.IntPredicate;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements IntPredicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ IntPredicate b;
    public final /* synthetic */ IntPredicate c;

    public /* synthetic */ e(IntPredicate intPredicate, IntPredicate intPredicate2, byte b) {
        this.a = b;
        this.b = intPredicate;
        this.c = intPredicate2;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return IntPredicate$CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return IntPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return IntPredicate$CC.$default$or(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        byte b = this.a;
        IntPredicate intPredicate = this.c;
        IntPredicate intPredicate2 = this.b;
        switch (b) {
            case 0:
                if (!intPredicate2.test(i) && !intPredicate.test(i)) {
                    return false;
                }
                break;
            default:
                if (!intPredicate2.test(i) || !intPredicate.test(i)) {
                    return false;
                }
                break;
        }
        return true;
    }
}
