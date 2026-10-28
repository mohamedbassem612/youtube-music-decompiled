package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tu implements UnaryOperator {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ tu(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        luv luvVar;
        int i = this.$cid;
        if (i == 0) {
            luvVar = (luv) obj;
            Object obj2 = this.a;
            if (tv.a(luvVar) <= tv.a((luv) obj2)) {
                return obj2;
            }
        } else {
            if (i != 1) {
                return (alon) ((aihf) this.a).build();
            }
            luvVar = (luv) obj;
            Object obj3 = this.a;
            if (tv.a((luv) obj3) >= tv.a(luvVar)) {
                return luv.UNKNOWN;
            }
        }
        return luvVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }
}
