package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class beh extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beh(ahpr ahprVar, bhi bhiVar, Object obj, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = ahprVar;
        this.b = bhiVar;
        this.d = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [awou, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [awzc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [aia, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [dyw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [eco, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, tns] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        beh behVar;
        switch (this.$cid) {
            case 0:
                Object obj2 = this.b;
                bfp bfpVar = (bfp) obj2;
                behVar = new beh(bfpVar, (dqy) this.d, (bgg) this.c, awoqVar, 0);
                break;
            case 1:
                behVar = new beh((awou) this.c, (awzc) this.d, (aia) this.b, awoqVar, 1);
                break;
            case 2:
                Object obj3 = this.b;
                bfp bfpVar2 = (bfp) obj3;
                behVar = new beh(bfpVar2, (axfd) this.c, (dqy) this.d, awoqVar, 2);
                break;
            case 3:
                Object obj4 = this.d;
                eby ebyVar = (eby) obj4;
                behVar = new beh(ebyVar, (dze) this.c, (dyw) this.b, awoqVar, 3);
                break;
            case 4:
                Object obj5 = this.c;
                dov dovVar = (dov) obj5;
                behVar = new beh(dovVar, (ees) this.d, (eco) this.b, awoqVar, 4);
                break;
            case 5:
                Object obj6 = this.b;
                pyf pyfVar = (pyf) obj6;
                behVar = new beh(pyfVar, (aier) this.c, (String) this.d, awoqVar, 5);
                break;
            case 6:
                Object obj7 = this.b;
                tir tirVar = (tir) obj7;
                behVar = new beh(tirVar, (String) this.d, (tns) this.c, awoqVar, 6);
                break;
            case 7:
                Object obj8 = this.d;
                return new beh((tnx) obj8, (tir) this.b, (tns) this.c, awoqVar, 7);
            default:
                Object obj9 = this.c;
                ahpr ahprVar = (ahpr) obj9;
                behVar = new beh(ahprVar, (bhi) this.b, this.d, awoqVar, 8);
                break;
        }
        return behVar;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$cid) {
            case 0:
                return ((beh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 1:
                return ((beh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 2:
                return ((beh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 3:
                return ((beh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 4:
                return ((beh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 5:
                return ((beh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 6:
                return ((beh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 7:
                return ((beh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            default:
                return ((beh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x022f, code lost:
    
        if (r4.collect(r0, r10) == r10) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x023f, code lost:
    
        if (defpackage.awro.p(r11, r5, r10) != r10) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0274, code lost:
    
        if (r11 == r10) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r11 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (((defpackage.tir) r11).c.b((java.lang.String) r1, r2, r10) != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        if (r11 != r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0131, code lost:
    
        if (r11.collect(r4, r10) != r0) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [aia, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [awou, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [awou, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [awou, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [eco, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awzc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [dyw, java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.beh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beh(awou awouVar, awzc awzcVar, aia aiaVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = awouVar;
        this.d = awzcVar;
        this.b = aiaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beh(bfp bfpVar, axfd axfdVar, dqy dqyVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = bfpVar;
        this.c = axfdVar;
        this.d = dqyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beh(bfp bfpVar, dqy dqyVar, bgg bggVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = bfpVar;
        this.d = dqyVar;
        this.c = bggVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beh(dov dovVar, ees eesVar, eco ecoVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = dovVar;
        this.d = eesVar;
        this.b = ecoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beh(eby ebyVar, dze dzeVar, dyw dywVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = ebyVar;
        this.c = dzeVar;
        this.b = dywVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beh(pyf pyfVar, aier aierVar, String str, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = pyfVar;
        this.c = aierVar;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beh(tir tirVar, String str, tns tnsVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = tirVar;
        this.d = str;
        this.c = tnsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beh(tnx tnxVar, tir tirVar, tns tnsVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = tnxVar;
        this.b = tirVar;
        this.c = tnsVar;
    }
}
