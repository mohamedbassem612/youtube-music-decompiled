package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xnm extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    /* synthetic */ Object a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnm(amyt amytVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = amytVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        Object obj2 = this.b;
        if (i != 0) {
            xnm xnmVar = new xnm((bod) obj2, awoqVar, 1);
            xnmVar.a = obj;
            return xnmVar;
        }
        xnm xnmVar2 = new xnm((amyt) obj2, awoqVar, 0);
        xnmVar2.a = obj;
        return xnmVar2;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((xnm) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((xnm) create((xni) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [bof, java.lang.Object] */
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
        if (this.$cid == 0) {
            atqp.j(obj);
            aihf builder = ((xni) this.a).toBuilder();
            builder.getClass();
            yno.dh((amyt) this.b, builder);
            return yno.dg(builder);
        }
        awut awutVar = (awut) this.a;
        atqp.j(obj);
        ?? r3 = this.b;
        boc bocVar = ((bod) r3).a;
        if (bocVar.a().compareTo(bob.b) >= 0) {
            bocVar.b(r3);
        } else {
            awro.z(awutVar.b(), null);
        }
        return awmy.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnm(bod bodVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = bodVar;
    }
}
