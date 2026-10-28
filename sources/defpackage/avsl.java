package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avsl extends avlh {
    final avlj b;
    final avla c;

    public avsl(avlj avljVar, avla avlaVar) {
        this.b = avljVar;
        this.c = avlaVar;
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
        avse avsjVar;
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 0) {
            avsjVar = new avsj(axspVar);
        } else if (iOrdinal == 1) {
            avsjVar = new avsh(axspVar);
        } else if (iOrdinal != 3) {
            avsjVar = iOrdinal != 4 ? new avsf(axspVar, avlh.a) : new avsi(axspVar);
        } else {
            avsjVar = new avsg(axspVar);
        }
        axspVar.e(avsjVar);
        try {
            this.b.a(avsjVar);
        } catch (Throwable th) {
            avkz.a(th);
            avsjVar.b(th);
        }
    }
}
