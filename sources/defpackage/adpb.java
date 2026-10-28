package defpackage;

import app.rive.core.CommandQueue;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adpb extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpb(adpd adpdVar, String str, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = adpdVar;
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [awzc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [adrj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [axat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v7, types: [adrj, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        adpb adpbVar;
        switch (this.$cid) {
            case 0:
                adpbVar = new adpb((String) this.b, (adpd) this.c, awoqVar, 0);
                break;
            case 1:
                adpbVar = new adpb((adpd) this.c, (String) this.b, awoqVar, 1);
                break;
            case 2:
                adpbVar = new adpb((awrm) this.b, (CommandQueue) this.c, awoqVar, 2);
                break;
            case 3:
                adpbVar = new adpb((adrf) this.c, (adrj) this.b, awoqVar, 3);
                break;
            case 4:
                adpbVar = new adpb((adqc) this.c, (adrf) this.b, awoqVar, 4);
                break;
            case 5:
                return new adpb((adrj) this.c, (adrl) this.b, awoqVar, 5);
            case 6:
                adpbVar = new adpb((axlj) this.b, (dvo) this.c, awoqVar, 6);
                break;
            case 7:
                adpbVar = new adpb((ahgb) this.c, (Map) this.b, awoqVar, 7);
                break;
            case 8:
                return new adpb((axat) this.b, (avgj) this.c, awoqVar, 8);
            default:
                return new adpb((awzc) this.c, (axce) this.b, awoqVar, 9);
        }
        return adpbVar;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$cid) {
            case 0:
                return ((adpb) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 1:
                return ((adpb) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 2:
                return ((adpb) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 3:
                return ((adpb) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 4:
                return ((adpb) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 5:
                return ((adpb) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 6:
                return ((adpb) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 7:
                return ((adpb) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 8:
                return ((adpb) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            default:
                return ((adpb) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0176  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [adpb, awoq] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19, types: [adrj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v70, types: [awou, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v74, types: [bec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v76, types: [axat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v78, types: [awzc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v16, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [adrj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [adrj, java.lang.Object] */
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
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:164:0x01e0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // defpackage.awpe
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adpb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpb(adqc adqcVar, adrf adrfVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = adqcVar;
        this.b = adrfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpb(adrf adrfVar, adrj adrjVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = adrfVar;
        this.b = adrjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpb(adrj adrjVar, adrl adrlVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = adrjVar;
        this.b = adrlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpb(ahgb ahgbVar, Map map, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = ahgbVar;
        this.b = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpb(awrm awrmVar, CommandQueue commandQueue, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awrmVar;
        this.c = commandQueue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpb(awzc awzcVar, axce axceVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = awzcVar;
        this.b = axceVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpb(axat axatVar, avgj avgjVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = axatVar;
        this.c = avgjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpb(axlj axljVar, dvo dvoVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = axljVar;
        this.c = dvoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpb(String str, adpd adpdVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = str;
        this.c = adpdVar;
    }
}
