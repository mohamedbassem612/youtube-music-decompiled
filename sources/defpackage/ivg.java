package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ivg implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ ivg(int i, int i2) {
        this.$cid = i2;
        this.a = i;
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
        int i = this.$cid;
        if (i == 0) {
            return ((admo) obj).getItem(this.a);
        }
        if (i != 1) {
            return ((acqh) obj).L(this.a);
        }
        agrf agrfVar = ijl.ar;
        return ((admo) obj).getItem(this.a);
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }
}
