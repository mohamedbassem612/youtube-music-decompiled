package j$.util.concurrent;

import j$.util.function.Predicate$CC;
import java.util.Collection;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r implements Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Collection b;

    public /* synthetic */ r(Collection collection, byte b) {
        this.a = b;
        this.b = collection;
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
        Collection collection = this.b;
        switch (b) {
            case 0:
                j$.com.android.tools.r8.a aVar = ConcurrentLinkedQueue.a;
                return !collection.contains(obj);
            default:
                j$.com.android.tools.r8.a aVar2 = ConcurrentLinkedQueue.a;
                return collection.contains(obj);
        }
    }
}
