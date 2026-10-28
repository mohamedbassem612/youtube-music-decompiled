package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ewj implements eug {
    final /* synthetic */ ewk a;
    final /* synthetic */ hed b;

    public ewj(ewk ewkVar, hed hedVar) {
        this.b = hedVar;
        this.a = ewkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ett, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [euh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [euh, java.lang.Object] */
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
    @Override // defpackage.eug
    public final void b(Object obj) {
        ewk ewkVar = this.a;
        hed hedVar = this.b;
        if (ewkVar.e(hedVar)) {
            evs evsVar = ewkVar.a.o;
            if (obj != null && evsVar.c(hedVar.a.g())) {
                ewkVar.c = obj;
                ((evl) ewkVar.b).f(2);
            } else {
                evi eviVar = ewkVar.b;
                ?? r2 = hedVar.b;
                ?? r4 = hedVar.a;
                eviVar.d(r2, obj, r4, r4.g(), ewkVar.d);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [euh, java.lang.Object] */
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
    @Override // defpackage.eug
    public final void e(Exception exc) {
        ewk ewkVar = this.a;
        hed hedVar = this.b;
        if (ewkVar.e(hedVar)) {
            evh evhVar = ewkVar.d;
            ?? r3 = hedVar.a;
            ewkVar.b.b(evhVar, exc, r3, r3.g());
        }
    }
}
