package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xgb implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ xge a;
    public final /* synthetic */ xgz b;
    public final /* synthetic */ amdd c;
    public final /* synthetic */ xie d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xgb(xge xgeVar, ameb amebVar, xgz xgzVar, amdd amddVar, xie xieVar, int i) {
        this.$cid = i;
        this.a = xgeVar;
        this.e = amebVar;
        this.b = xgzVar;
        this.c = amddVar;
        this.d = xieVar;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        if (this.$cid != 0) {
            xgt xgtVar = (xgt) obj;
            Object obj2 = this.e;
            xge xgeVar = this.a;
            xie xieVar = this.d;
            xgeVar.e.b(this.b, Optional.ofNullable(obj2), this.c, xgtVar, xieVar);
            return;
        }
        xgt xgtVar2 = (xgt) obj;
        xgz xgzVar = this.b;
        xge xgeVar2 = this.a;
        xie xieVar2 = this.d;
        argn argnVarC = xgzVar.c();
        amdd amddVar = this.c;
        xgeVar2.c.j(xgtVar2, (ameb) this.e, argnVarC, amddVar, xieVar2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.$cid != 0 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ xgb(xge xgeVar, xgz xgzVar, atqd atqdVar, amdd amddVar, xie xieVar, int i) {
        this.$cid = i;
        this.a = xgeVar;
        this.b = xgzVar;
        this.e = atqdVar;
        this.c = amddVar;
        this.d = xieVar;
    }
}
