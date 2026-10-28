package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class egh extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egh(adqc adqcVar, boc bocVar, adrf adrfVar, awwd awwdVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = adqcVar;
        this.b = bocVar;
        this.e = adrfVar;
        this.d = awwdVar;
    }

    /* JADX WARN: Type inference failed for: r1v32, types: [axap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v25, types: [awzc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [dyw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25, types: [axae, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v12, types: [awwd, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        egh eghVar;
        switch (this.$cid) {
            case 0:
                Object obj2 = this.b;
                Object obj3 = this.c;
                ees eesVar = (ees) obj3;
                dov dovVar = (dov) obj2;
                eghVar = new egh(dovVar, eesVar, (AtomicInteger) this.d, (ListenableFuture) this.e, awoqVar, 0);
                break;
            case 1:
                Object obj4 = this.e;
                dze dzeVar = (dze) obj4;
                eghVar = new egh(dzeVar, (ees) this.d, (dyw) this.c, (Context) this.b, awoqVar, 1);
                break;
            case 2:
                Object obj5 = this.d;
                Object obj6 = this.b;
                dze dzeVar2 = (dze) obj6;
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) obj5;
                eghVar = new egh(constraintTrackingWorker, dzeVar2, (dov) this.c, (ees) this.e, awoqVar, 2);
                break;
            case 3:
                Object obj7 = this.c;
                Object obj8 = this.b;
                ViewGroup viewGroup = (ViewGroup) obj8;
                goy goyVar = (goy) obj7;
                eghVar = new egh(goyVar, viewGroup, (aseq) this.d, (xgn) this.e, awoqVar, 3);
                break;
            case 4:
                Object obj9 = this.b;
                Object obj10 = this.c;
                plx plxVar = (plx) obj10;
                ozu ozuVar = (ozu) obj9;
                eghVar = new egh(ozuVar, plxVar, (aieo) this.e, (Map) this.d, awoqVar, 4);
                break;
            case 5:
                Object obj11 = this.b;
                Object obj12 = this.c;
                plx plxVar2 = (plx) obj12;
                ozu ozuVar2 = (ozu) obj11;
                eghVar = new egh(ozuVar2, plxVar2, (aiez) this.d, (ahyr) this.e, awoqVar, 5);
                break;
            case 6:
                Object obj13 = this.c;
                Object obj14 = this.e;
                plx plxVar3 = (plx) obj14;
                pfa pfaVar = (pfa) obj13;
                eghVar = new egh(pfaVar, plxVar3, (Bundle) this.b, (Long) this.d, awoqVar, 6);
                break;
            case 7:
                Object obj15 = this.c;
                Object obj16 = this.b;
                pgm pgmVar = (pgm) obj16;
                plx plxVar4 = (plx) obj15;
                eghVar = new egh(plxVar4, pgmVar, (aidy) this.e, (Long) this.d, awoqVar, 7);
                break;
            case 8:
                Object obj17 = this.d;
                Object obj18 = this.c;
                pcu pcuVar = (pcu) obj18;
                agev agevVar = (agev) obj17;
                eghVar = new egh(agevVar, pcuVar, (ozj) this.b, (pot) this.e, awoqVar, 8);
                break;
            case 9:
                Object obj19 = this.e;
                Object obj20 = this.c;
                plx plxVar5 = (plx) obj20;
                pmz pmzVar = (pmz) obj19;
                eghVar = new egh(pmzVar, plxVar5, (aicw) this.d, (plb) this.b, awoqVar, 9);
                break;
            case 10:
                Object obj21 = this.b;
                pux puxVar = (pux) obj21;
                eghVar = new egh(puxVar, (List) this.d, (String) this.e, (aiaz) this.c, awoqVar, 10);
                break;
            case 11:
                Object obj22 = this.e;
                Object obj23 = this.c;
                plx plxVar6 = (plx) obj23;
                tld tldVar = (tld) obj22;
                eghVar = new egh(tldVar, plxVar6, (String) this.d, (plb) this.b, awoqVar, 11);
                break;
            case 12:
                Object obj24 = this.c;
                Object obj25 = this.b;
                return new egh((adqc) obj24, (boc) obj25, (adrf) this.e, (awwd) this.d, awoqVar, 12);
            default:
                eghVar = new egh((axap) this.d, (awzc) this.c, (axae) this.e, this.b, awoqVar, 13);
                break;
        }
        return eghVar;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$cid) {
            case 0:
                return ((egh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 1:
                return ((egh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 2:
                return ((egh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 3:
                return ((egh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 4:
                return ((egh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 5:
                return ((egh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 6:
                return ((egh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 7:
                return ((egh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 8:
                return ((egh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 9:
                return ((egh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 10:
                return ((egh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 11:
                return ((egh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 12:
                return ((egh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            default:
                return ((egh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (((defpackage.tld) r0).a.a((defpackage.plx) r1, (java.lang.String) r2, (defpackage.plb) r3, null, r18) != r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f5, code lost:
    
        if (r0 != r6) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01aa, code lost:
    
        if (((defpackage.pgm) r0).b(r1, (defpackage.aidy) r2, r18) == r6) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ea, code lost:
    
        if (((defpackage.pgm) r0).a.a(r1, r2, r4, r18) == r6) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [awwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Object, qbn] */
    /* JADX WARN: Type inference failed for: r11v4, types: [awzc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4, types: [axae, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v77, types: [awzc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v79, types: [awzc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v77, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v78, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egh(agev agevVar, pcu pcuVar, ozj ozjVar, pot potVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = agevVar;
        this.c = pcuVar;
        this.b = ozjVar;
        this.e = potVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egh(ConstraintTrackingWorker constraintTrackingWorker, dze dzeVar, dov dovVar, ees eesVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = constraintTrackingWorker;
        this.b = dzeVar;
        this.c = dovVar;
        this.e = eesVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egh(axap axapVar, awzc awzcVar, axae axaeVar, Object obj, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = axapVar;
        this.c = awzcVar;
        this.e = axaeVar;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egh(dov dovVar, ees eesVar, AtomicInteger atomicInteger, ListenableFuture listenableFuture, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = dovVar;
        this.c = eesVar;
        this.d = atomicInteger;
        this.e = listenableFuture;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egh(dze dzeVar, ees eesVar, dyw dywVar, Context context, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.e = dzeVar;
        this.d = eesVar;
        this.c = dywVar;
        this.b = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egh(goy goyVar, ViewGroup viewGroup, aseq aseqVar, xgn xgnVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = goyVar;
        this.b = viewGroup;
        this.d = aseqVar;
        this.e = xgnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egh(ozu ozuVar, plx plxVar, aieo aieoVar, Map map, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ozuVar;
        this.c = plxVar;
        this.e = aieoVar;
        this.d = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egh(ozu ozuVar, plx plxVar, aiez aiezVar, ahyr ahyrVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ozuVar;
        this.c = plxVar;
        this.d = aiezVar;
        this.e = ahyrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egh(pfa pfaVar, plx plxVar, Bundle bundle, Long l, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = pfaVar;
        this.e = plxVar;
        this.b = bundle;
        this.d = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egh(plx plxVar, pgm pgmVar, aidy aidyVar, Long l, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = plxVar;
        this.b = pgmVar;
        this.e = aidyVar;
        this.d = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egh(pmz pmzVar, plx plxVar, aicw aicwVar, plb plbVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.e = pmzVar;
        this.c = plxVar;
        this.d = aicwVar;
        this.b = plbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egh(pux puxVar, List list, String str, aiaz aiazVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = puxVar;
        this.d = list;
        this.e = str;
        this.c = aiazVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egh(tld tldVar, plx plxVar, String str, plb plbVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.e = tldVar;
        this.c = plxVar;
        this.d = str;
        this.b = plbVar;
    }
}
