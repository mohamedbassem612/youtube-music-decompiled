package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ztt implements Predicate {
    private final /* synthetic */ int $cid;

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ Predicate mo841negate() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this);
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                int i2 = adde.b;
                if (albl.b.a() != 424548931) {
                    return false;
                }
            } else if ((((akks) obj).b & 16) == 0) {
                return false;
            }
        } else if ((((akks) obj).b & 2) == 0) {
            return false;
        }
        return true;
    }
}
