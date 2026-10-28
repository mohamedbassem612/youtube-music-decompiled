package defpackage;

import j$.util.Collection;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rcr implements IntFunction {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rcr(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            ?? r7 = this.a;
            int i3 = rct.f;
            return new rcb((agke) Collection.EL.stream(r7).map(new ccf(i, 4)).collect(aghu.a));
        }
        ?? r8 = this.a;
        if (i2 != 1) {
            return new xgx((xgt) r8, 308787, i, false, (xgz) null, (ajva) null);
        }
        int i4 = rcq.v;
        return new rcb((agke) Collection.EL.stream(r8).map(new ccf(i, 3)).collect(aghu.a));
    }
}
