package j$.util.function;

import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i implements Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Predicate b;
    public final /* synthetic */ Predicate c;

    public /* synthetic */ i(Predicate predicate, Predicate predicate2, byte b) {
        this.a = b;
        this.b = predicate;
        this.c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ Predicate mo841negate() {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        byte b = this.a;
        Predicate predicate = this.c;
        Predicate predicate2 = this.b;
        switch (b) {
            case 0:
                if (predicate2.test(obj) && predicate.test(obj)) {
                    return true;
                }
                break;
            default:
                if (predicate2.test(obj) || predicate.test(obj)) {
                    return true;
                }
                break;
        }
        return false;
    }
}
