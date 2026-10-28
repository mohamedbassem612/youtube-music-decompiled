package defpackage;

import j$.util.function.IntPredicate$CC;
import java.util.List;
import java.util.function.IntPredicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abft implements IntPredicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ abft(abnl abnlVar, List list, int i) {
        this.$cid = i;
        this.b = abnlVar;
        this.a = list;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? IntPredicate$CC.$default$and(this, intPredicate) : IntPredicate$CC.$default$and(this, intPredicate);
        }
        return IntPredicate$CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? IntPredicate$CC.$default$negate(this) : IntPredicate$CC.$default$negate(this);
        }
        return IntPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? IntPredicate$CC.$default$or(this, intPredicate) : IntPredicate$CC.$default$or(this, intPredicate);
        }
        return IntPredicate$CC.$default$or(this, intPredicate);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            return ((wgo[]) this.a)[i].a.equals(this.b);
        }
        if (i2 != 1) {
            atxp atxpVar = adxz.a;
            return ((String) this.a).equals(((advp) ((agke) this.b).get(i)).q());
        }
        abnl abnlVar = (abnl) this.b;
        if (!abnlVar.w().isEmpty()) {
            if (abnlVar.w().equals(((htf) this.a.get(i)).a)) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ abft(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
