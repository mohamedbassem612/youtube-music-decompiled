package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yok implements Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;

    public /* synthetic */ yok(boolean z, int i) {
        this.$cid = i;
        this.a = z;
    }

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
        if (i == 0) {
            wgs wgsVar = (wgs) obj;
            if (!wgsVar.I()) {
                return false;
            }
            if (this.a && !wgsVar.ab()) {
                return false;
            }
        } else if (i != 1) {
            agkz agkzVar = yos.a;
            if (((wgs) obj).P() == this.a) {
                return false;
            }
        } else {
            wgs wgsVar2 = (wgs) obj;
            if (!wgsVar2.af()) {
                return false;
            }
            if (this.a && !wgsVar2.ab()) {
                return false;
            }
        }
        return true;
    }
}
