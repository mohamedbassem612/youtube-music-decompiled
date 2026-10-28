package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xfw implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ xge a;
    public final /* synthetic */ xgz b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xfw(xge xgeVar, xgz xgzVar, amdd amddVar, xie xieVar, int i) {
        this.$cid = i;
        this.a = xgeVar;
        this.b = xgzVar;
        this.d = amddVar;
        this.c = xieVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xgz] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        if (this.$cid != 0) {
            xgz xgzVar = this.b;
            xge xgeVar = this.a;
            Object obj2 = this.c;
            Object obj3 = this.d;
            xgeVar.c.o((xgt) obj, xgzVar.c(), (amdd) obj3, (xie) obj2);
            return;
        }
        xgz xgzVar2 = this.b;
        ?? r1 = this.c;
        xge xgeVar2 = this.a;
        Object obj4 = this.d;
        xgeVar2.c.h((xgt) obj, xgzVar2.c(), r1.c(), (xie) obj4);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.$cid != 0 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ xfw(xge xgeVar, xgz xgzVar, xgz xgzVar2, xie xieVar, int i) {
        this.$cid = i;
        this.a = xgeVar;
        this.b = xgzVar;
        this.c = xgzVar2;
        this.d = xieVar;
    }
}
