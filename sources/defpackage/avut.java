package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avut extends avlh {
    final avmb b;
    final long c;
    final long d;
    final TimeUnit e;

    public avut(long j, long j2, TimeUnit timeUnit, avmb avmbVar) {
        this.c = j;
        this.d = j2;
        this.e = timeUnit;
        this.b = avmbVar;
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
    @Override // defpackage.avlh
    public final void ar(axsp axspVar) {
        avus avusVar = new avus(axspVar);
        axspVar.e(avusVar);
        avmb avmbVar = this.b;
        if (!(avmbVar instanceof awjk)) {
            avusVar.a(avmbVar.d(avusVar, this.c, this.d, this.e));
            return;
        }
        avma avmaVarA = avmbVar.a();
        avusVar.a(avmaVarA);
        avmaVarA.c(avusVar, this.c, this.d, this.e);
    }
}
