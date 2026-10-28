package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afmf extends awuq implements awvb {
    private final awuq a;
    private final aunn b;

    public afmf(awuq awuqVar, aunn aunnVar) {
        this.a = awuqVar;
        this.b = aunnVar;
    }

    @Override // defpackage.awuq
    public final void a(awou awouVar, Runnable runnable) {
        awouVar.getClass();
        runnable.getClass();
        Boolean.TRUE.booleanValue();
        this.a.a(awouVar, runnable);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awuq, awvb] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.awvb
    public final awvk c(long j, Runnable runnable, awou awouVar) {
        awouVar.getClass();
        Boolean.TRUE.booleanValue();
        return this.a.c(j, runnable, awouVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awuq, awvb] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.awvb
    public final void d(long j, awuc awucVar) {
        Boolean.TRUE.booleanValue();
        this.a.d(j, awucVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof afmf) {
            Boolean bool = Boolean.TRUE;
            afmf afmfVar = (afmf) obj;
            aunn aunnVar = afmfVar.b;
            if (awrc.c(bool, Boolean.TRUE)) {
                Boolean.TRUE.booleanValue();
                if (awrc.c(this.a, afmfVar.a)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.awuq
    public final boolean fX(awou awouVar) {
        awouVar.getClass();
        Boolean.TRUE.booleanValue();
        return this.a.fX(awouVar);
    }

    public final int hashCode() {
        Boolean.TRUE.booleanValue();
        return this.a.hashCode();
    }
}
