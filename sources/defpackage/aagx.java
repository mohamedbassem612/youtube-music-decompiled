package defpackage;

import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import j$.util.Optional;
import j$.util.function.IntPredicate$CC;
import java.util.function.IntPredicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aagx implements IntPredicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aagx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
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

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            return ((Optional) ((agke) this.a).get(i)).isPresent();
        }
        if (i2 != 1) {
            atxp atxpVar = adxz.a;
            return ((agke) this.a).get(i) instanceof advp;
        }
        agrf agrfVar = iog.a;
        aftj aftjVarD = ((TabbedView) this.a).D(i);
        return aftjVarD != null && hdu.c(((aqjj) aftjVarD.b).c);
    }
}
