package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qrv implements ahcx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ ListenableFuture a;
    public final /* synthetic */ ahcy b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qrv(Object obj, ListenableFuture listenableFuture, ahcy ahcyVar, Executor executor, int i) {
        this.$cid = i;
        this.d = obj;
        this.a = listenableFuture;
        this.b = ahcyVar;
        this.c = executor;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ahcx
    public final ListenableFuture a() {
        if (this.$cid == 0) {
            Executor executor = this.c;
            okv okvVar = new okv(this.d, this.b, executor, 3, null);
            long j = afwl.a;
            ahdb ahdbVar = new ahdb(afty.c(false), okvVar, 1);
            Executor executorDirectExecutor = MoreExecutors.directExecutor();
            int i = ahcs.c;
            ListenableFuture listenableFuture = this.a;
            ahcq ahcqVar = new ahcq(listenableFuture, ahdbVar);
            listenableFuture.addListener(ahcqVar, MoreExecutors.c(executorDirectExecutor, ahcqVar));
            return ahcqVar;
        }
        Object obj = this.d;
        olm olmVar = new olm(obj, 13);
        Executor executor2 = this.c;
        Executor executorDirectExecutor2 = MoreExecutors.directExecutor();
        int i2 = ahcs.c;
        ListenableFuture listenableFuture2 = this.a;
        ahcq ahcqVar2 = new ahcq(listenableFuture2, olmVar);
        listenableFuture2.addListener(ahcqVar2, MoreExecutors.c(executorDirectExecutor2, ahcqVar2));
        ahcq ahcqVar3 = new ahcq(ahcqVar2, this.b);
        ahcqVar2.addListener(ahcqVar3, MoreExecutors.c(executor2, ahcqVar3));
        okv okvVar2 = new okv(obj, ahcqVar2, ahcqVar3, 2, null);
        long j2 = afwl.a;
        ahdb ahdbVar2 = new ahdb(afty.c(false), okvVar2, 1);
        Executor executorDirectExecutor3 = MoreExecutors.directExecutor();
        ahcq ahcqVar4 = new ahcq(ahcqVar3, ahdbVar2);
        ahcqVar3.addListener(ahcqVar4, MoreExecutors.c(executorDirectExecutor3, ahcqVar4));
        return ahcqVar4;
    }
}
