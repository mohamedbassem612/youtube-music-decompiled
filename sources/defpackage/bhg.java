package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhg extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhg(awqk awqkVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = awqkVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            bhg bhgVar = new bhg((awqk) this.c, awoqVar, 0);
            bhgVar.b = obj;
            return bhgVar;
        }
        if (i != 1) {
            bhg bhgVar2 = new bhg((axbi) this.c, awoqVar, 2);
            bhgVar2.b = obj;
            return bhgVar2;
        }
        bhg bhgVar3 = new bhg((List) this.c, awoqVar, 1);
        bhgVar3.b = obj;
        return bhgVar3;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((bhg) create((bhj) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 1) {
            return ((bhg) create((awyp) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((bhg) create((bef) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r4.b(r6, r0, r5) != r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r6 == r3) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.List] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.$cid
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L42
            if (r0 == r2) goto L24
            awox r0 = defpackage.awox.a
            int r1 = r5.a
            defpackage.atqp.j(r6)
            if (r1 != 0) goto L21
            java.lang.Object r6 = r5.b
            awyp r6 = (defpackage.awyp) r6
            java.lang.Object r1 = r5.c
            r5.a = r2
            axbi r1 = (defpackage.axbi) r1
            java.lang.Object r5 = r1.a(r6, r5)
            if (r5 == r0) goto L6c
        L21:
            awmy r0 = defpackage.awmy.a
            goto L6c
        L24:
            java.lang.Object r0 = r5.b
            bef r0 = (defpackage.bef) r0
            awox r3 = defpackage.awox.a
            int r4 = r5.a
            defpackage.atqp.j(r6)
            if (r4 != 0) goto L3f
            java.lang.Object r6 = r5.c
            bbl r4 = defpackage.bea.a
            r5.b = r1
            r5.a = r2
            java.lang.Object r5 = r4.b(r6, r0, r5)
            if (r5 == r3) goto L5b
        L3f:
            awmy r0 = defpackage.awmy.a
            goto L6c
        L42:
            java.lang.Object r0 = r5.b
            bhj r0 = (defpackage.bhj) r0
            awox r3 = defpackage.awox.a
            int r4 = r5.a
            defpackage.atqp.j(r6)
            if (r4 != 0) goto L5d
            java.lang.Object r6 = r5.c
            r5.b = r1
            r5.a = r2
            java.lang.Object r6 = r6.invoke(r0, r5)
            if (r6 != r3) goto L5d
        L5b:
            r0 = r3
            goto L6c
        L5d:
            r0 = r6
            bhj r0 = (defpackage.bhj) r0
            r0.getClass()
            ci r5 = r0.a
            java.lang.Object r5 = r5.a
            java.util.concurrent.atomic.AtomicBoolean r5 = (java.util.concurrent.atomic.AtomicBoolean) r5
            r5.set(r2)
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhg(axbi axbiVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = axbiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhg(List list, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = list;
    }
}
