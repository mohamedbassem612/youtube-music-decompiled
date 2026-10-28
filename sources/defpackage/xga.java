package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xga implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ xge a;
    public final /* synthetic */ xgz b;
    public final /* synthetic */ xie c;

    public /* synthetic */ xga(xge xgeVar, xgz xgzVar, xie xieVar, int i) {
        this.$cid = i;
        this.a = xgeVar;
        this.b = xgzVar;
        this.c = xieVar;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        if (this.$cid != 0) {
            xgz xgzVar = this.b;
            xge xgeVar = this.a;
            argn argnVarC = xgzVar.c();
            xie xieVar = this.c;
            xgeVar.c.g((xgt) obj, argnVarC, xieVar);
            return;
        }
        xgt xgtVar = (xgt) obj;
        xgz xgzVar2 = this.b;
        xge xgeVar2 = this.a;
        argn argnVarC2 = xgzVar2.c();
        xie xieVar2 = this.c;
        xgeVar2.c.g(xgtVar, argnVarC2, xieVar2);
        xgeVar2.e.b(xgzVar2, Optional.empty(), null, xgtVar, xieVar2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.$cid != 0 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
