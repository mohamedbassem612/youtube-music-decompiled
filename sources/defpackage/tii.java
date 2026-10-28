package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tii extends awpk implements awqk {
    Object a;
    Object b;
    int c;
    final /* synthetic */ tir d;
    final /* synthetic */ tns e;
    final /* synthetic */ boolean f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tii(tir tirVar, tns tnsVar, boolean z, awoq awoqVar) {
        super(2, awoqVar);
        this.d = tirVar;
        this.e = tnsVar;
        this.f = z;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        tii tiiVar = new tii(this.d, this.e, this.f, awoqVar);
        tiiVar.g = obj;
        return tiiVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((tii) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0112  */
    /* JADX WARN: Code duplicated, block: B:56:0x0156  */
    /* JADX WARN: Code duplicated, block: B:61:0x016c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0171  */
    /* JADX WARN: Code duplicated, block: B:70:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x016c -> B:62:0x016d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:67:0x017c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // defpackage.awpe
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tii.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
