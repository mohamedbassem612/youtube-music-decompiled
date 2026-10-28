package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pjl extends awpk implements awqg {
    Object a;
    int b;
    final /* synthetic */ pjv c;
    final /* synthetic */ plx d;
    final /* synthetic */ pbh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjl(pjv pjvVar, plx plxVar, pbh pbhVar, awoq awoqVar) {
        super(1, awoqVar);
        this.c = pjvVar;
        this.d = plxVar;
        this.e = pbhVar;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new pjl(this.c, this.d, this.e, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((pjl) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [pjv] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6, types: [pjv] */
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
        ?? r3;
        pbh pbhVar;
        Object obj2;
        awox awoxVar = awox.a;
        int i = this.b;
        if (i != 0) {
            obj2 = this.a;
            atqp.j(obj);
            if (i == 1) {
            }
            ?? r4 = obj2;
            r3 = obj2;
            return r4;
        }
        atqp.j(obj);
        pjv pjvVar = this.c;
        plx plxVar = this.d;
        omm ommVar = pjvVar.g;
        agke agkeVarP = ommVar.p(plxVar);
        tld tldVar = new tld();
        tldVar.A("1");
        ((pfv) ommVar.a).b(plxVar, agke.q(tldVar.z()));
        agkeVarP.getClass();
        this.a = agkeVarP;
        this.b = 1;
        if (pjvVar.g(plxVar, agkeVarP, this) == awoxVar) {
            return awoxVar;
        }
        r3 = agkeVarP;
        ?? r5 = obj2;
        r3 = obj2;
        if (!((agke) r3).isEmpty() && (pbhVar = this.e) != null) {
            ?? r1 = this.c;
            plx plxVar2 = this.d;
            r3.getClass();
            r1.q(plxVar2, r3, pbhVar, null);
        }
        ?? r8 = this.c;
        plx plxVar3 = this.d;
        r3.getClass();
        this.a = r3;
        this.b = 2;
        Object objE = r8.e(plxVar3, r3, this);
        r5 = r3;
        if (objE == awoxVar) {
            return awoxVar;
        }
        ?? r6 = obj2;
        r3 = obj2;
        return r6;
    }
}
