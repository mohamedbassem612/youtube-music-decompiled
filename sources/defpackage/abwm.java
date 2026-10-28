package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abwm implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ abwm(abpd abpdVar, yrr yrrVar, String str, abnl abnlVar, String str2, abnp abnpVar, int i) {
        this.$cid = i;
        this.a = abpdVar;
        this.b = yrrVar;
        this.d = str;
        this.f = abnlVar;
        this.c = str2;
        this.e = abnpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [abwo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, xir] */
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
    @Override // java.lang.Runnable
    public final void run() {
        if (this.$cid != 0) {
            Object obj = this.d;
            yrr yrrVar = (yrr) this.b;
            yrrVar.b((String) obj);
            yrrVar.x = 4;
            Object obj2 = this.e;
            Object obj3 = this.c;
            ((abpd) this.a).i((abnl) this.f, (String) obj3, -1, null, yrrVar, true, (abnp) obj2);
            return;
        }
        abwn abwnVar = (abwn) this.a;
        abwp abwpVar = abwnVar.e;
        ?? r2 = this.d;
        ?? r3 = this.c;
        ?? r4 = this.b;
        if (abwpVar.f(r4, r3, r2)) {
            return;
        }
        abwpVar.c.execute(afwl.i(new zdy(abwnVar, (acey) r3, (wjf) r4, (abnl) this.e, (xir) this.f, 7)));
    }

    public /* synthetic */ abwm(abwn abwnVar, wjf wjfVar, acey aceyVar, abwo abwoVar, abnl abnlVar, xir xirVar, int i) {
        this.$cid = i;
        this.a = abwnVar;
        this.b = wjfVar;
        this.c = aceyVar;
        this.d = abwoVar;
        this.e = abnlVar;
        this.f = xirVar;
    }
}
