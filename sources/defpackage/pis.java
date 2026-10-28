package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pis extends awpk implements awqk {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    Object g;
    Object h;
    Object i;
    Object j;
    Object k;
    Object l;
    Object m;
    Object n;
    int o;
    int p;
    final /* synthetic */ plx q;
    final /* synthetic */ plb r;
    final /* synthetic */ boolean s;
    final /* synthetic */ int t;
    final /* synthetic */ pit u;
    final /* synthetic */ aidq v;
    final /* synthetic */ boolean w;
    final /* synthetic */ pot x;
    private /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pis(plx plxVar, plb plbVar, boolean z, int i, pit pitVar, aidq aidqVar, boolean z2, pot potVar, awoq awoqVar) {
        super(2, awoqVar);
        this.q = plxVar;
        this.r = plbVar;
        this.s = z;
        this.t = i;
        this.u = pitVar;
        this.v = aidqVar;
        this.w = z2;
        this.x = potVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        pis pisVar = new pis(this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, awoqVar);
        pisVar.y = obj;
        return pisVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((pis) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0481  */
    /* JADX WARN: Code duplicated, block: B:207:0x059a  */
    /* JADX WARN: Code duplicated, block: B:250:0x070d  */
    /* JADX WARN: Code duplicated, block: B:252:0x073e  */
    /* JADX WARN: Code duplicated, block: B:34:0x027a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0280  */
    /* JADX WARN: Code duplicated, block: B:38:0x0288  */
    /* JADX WARN: Code duplicated, block: B:40:0x028c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0297  */
    /* JADX WARN: Code duplicated, block: B:44:0x029c  */
    /* JADX WARN: Code duplicated, block: B:48:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:54:0x02be  */
    /* JADX WARN: Code duplicated, block: B:56:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:60:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:63:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:65:0x02fc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [pit] */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v119, types: [java.util.List] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:252:0x073e -> B:253:0x0742). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.awpe
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 2226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pis.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
