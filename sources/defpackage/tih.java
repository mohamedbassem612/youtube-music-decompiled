package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tih extends awpk implements awqk {
    Object a;
    Object b;
    int c;
    final /* synthetic */ tir d;
    final /* synthetic */ tns e;
    final /* synthetic */ String f;
    final /* synthetic */ tjh g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tih(tir tirVar, tns tnsVar, String str, tjh tjhVar, awoq awoqVar) {
        super(2, awoqVar);
        this.d = tirVar;
        this.e = tnsVar;
        this.f = str;
        this.g = tjhVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new tih(this.d, this.e, this.f, this.g, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((tih) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [tns] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v4, types: [tir] */
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
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        ?? r1;
        awox awoxVar = awox.a;
        int i = this.c;
        if (i == 0) {
            atqp.j(obj);
            tir tirVar = this.d;
            tns tnsVar = this.e;
            String str = this.f;
            tjh tjhVar = this.g;
            this.a = tirVar;
            this.b = tnsVar;
            this.c = 1;
            Object objI = tirVar.i(tnsVar, str, tjhVar, this);
            if (objI != awoxVar) {
                obj2 = tirVar;
                obj = objI;
                r1 = tnsVar;
            }
            return awoxVar;
        }
        if (i != 1) {
            atqp.j(obj);
            return obj;
        }
        Object obj3 = this.b;
        Object obj4 = this.a;
        atqp.j(obj);
        r1 = obj3;
        obj2 = obj4;
        this.a = null;
        this.b = null;
        this.c = 2;
        Object objF = ((tir) obj2).f(r1, (tnx) obj, this);
        if (objF != awoxVar) {
            return objF;
        }
        return awoxVar;
    }
}
