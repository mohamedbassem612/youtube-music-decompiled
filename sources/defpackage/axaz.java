package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axaz implements awzd {
    private final awzd a;
    private final awqk b;

    public axaz(awzd awzdVar, awqk awqkVar) {
        this.a = awzdVar;
        this.b = awqkVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [axcb] */
    /* JADX WARN: Type inference failed for: r2v3, types: [axcb] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
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
    public final Object a(awoq awoqVar) throws Throwable {
        axay axayVar;
        if (awoqVar instanceof axay) {
            axayVar = (axay) awoqVar;
            int i = axayVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                axayVar.c = i - Integer.MIN_VALUE;
            } else {
                axayVar = new axay(this, awoqVar);
            }
        } else {
            axayVar = new axay(this, awoqVar);
        }
        Object obj = axayVar.a;
        awox awoxVar = awox.a;
        ?? r2 = axayVar.c;
        try {
            if (r2 != 0) {
                if (r2 == 1) {
                    axcb axcbVar = axayVar.d;
                    atqp.j(obj);
                    r2 = axcbVar;
                } else {
                    if (r2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    atqp.j(obj);
                }
                return awmy.a;
            }
            atqp.j(obj);
            axcb axcbVar2 = new axcb(this.a, axayVar.getContext());
            awqk awqkVar = this.b;
            axayVar.d = axcbVar2;
            axayVar.c = 1;
            Object objInvoke = awqkVar.invoke(axcbVar2, axayVar);
            r2 = axcbVar2;
            if (objInvoke == awoxVar) {
                return awoxVar;
            }
            r2.releaseIntercepted();
            awzd awzdVar = this.a;
            if (awzdVar instanceof axaz) {
                axayVar.d = null;
                axayVar.c = 2;
                if (((axaz) awzdVar).a(axayVar) == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        } catch (Throwable th) {
            r2.releaseIntercepted();
            throw th;
        }
    }

    @Override // defpackage.awzd
    public final Object emit(Object obj, awoq awoqVar) {
        return this.a.emit(obj, awoqVar);
    }
}
