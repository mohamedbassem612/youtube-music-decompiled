package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aaji implements ahcx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ ListenableFuture a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aaji(aajk aajkVar, ListenableFuture listenableFuture, int i, ug ugVar, int i2) {
        this.$cid = i2;
        this.d = aajkVar;
        this.a = listenableFuture;
        this.b = i;
        this.c = ugVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.ahcx
    public final ListenableFuture a() {
        int i = this.$cid;
        if (i == 0) {
            ug ugVar = (ug) ahng.v(this.d);
            ListenableFuture listenableFuture = this.a;
            List list = (List) Collection.EL.stream((agke) ahng.v(listenableFuture)).map(new aaeq(19)).collect(Collectors.toCollection(new yoj(4)));
            ((aajk) this.c).b.f(this.b, (List) Collection.EL.stream((agke) ahng.v(listenableFuture)).map(new aaeq(20)).collect(Collectors.toCollection(new yoj(4))));
            atwh atwhVar = new atwh(null);
            atwhVar.a(list);
            return ugVar.i(atwhVar.b());
        }
        if (i != 1) {
            ListenableFuture listenableFuture2 = this.a;
            List list2 = (List) Collection.EL.stream((agke) ahng.v(listenableFuture2)).map(new aaeq(19)).collect(Collectors.toCollection(new yoj(4)));
            ((aajk) this.d).b.f(this.b, (List) Collection.EL.stream((agke) ahng.v(listenableFuture2)).map(new aaeq(20)).collect(Collectors.toCollection(new yoj(4))));
            atwh atwhVar2 = new atwh(null);
            atwhVar2.a(list2);
            return ((ug) this.c).i(atwhVar2.b());
        }
        ug ugVar2 = (ug) ahng.v(this.d);
        agke agkeVar = (agke) ahng.v(this.a);
        aajk aajkVar = (aajk) this.c;
        ListenableFuture listenableFutureC = aajkVar.c(agkeVar);
        ahek ahekVarH = ahng.h(listenableFutureC);
        int i2 = this.b;
        ahcx ahcxVarC = afwl.c(new aaji(aajkVar, listenableFutureC, i2, ugVar2, 2));
        Executor executor = aajkVar.a;
        ListenableFuture listenableFutureB = ahekVarH.b(ahcxVarC, executor);
        afxd afxdVarH = afxd.f(aajkVar.b()).h(new vwa(aajkVar, agkeVar, i2, ugVar2, 2), executor);
        return ahng.h(listenableFutureB, afxdVarH).a(afwl.j(new vtq(ugVar2, listenableFutureB, afxdVarH, 9, (byte[]) null)), MoreExecutors.directExecutor());
    }

    public /* synthetic */ aaji(aajk aajkVar, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, int i, int i2) {
        this.$cid = i2;
        this.c = aajkVar;
        this.d = listenableFuture;
        this.a = listenableFuture2;
        this.b = i;
    }
}
