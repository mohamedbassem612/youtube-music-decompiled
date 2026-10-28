package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pmu extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmu(adrf adrfVar, adqs adqsVar, awqg awqgVar, boc bocVar, awut awutVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.e = adrfVar;
        this.d = adqsVar;
        this.b = awqgVar;
        this.f = bocVar;
        this.c = awutVar;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r2v9, types: [adqs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v6, types: [awut, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            Object obj2 = this.b;
            Object obj3 = this.c;
            Object obj4 = this.d;
            return new pmu((pmz) obj2, (aicw) obj3, (plx) obj4, (pmi) this.e, (plb) this.f, awoqVar, 0);
        }
        if (i == 1) {
            Object obj5 = this.d;
            Object obj6 = this.f;
            Object obj7 = this.e;
            return new pmu((plb) obj5, (ozu) obj6, (plx) obj7, (aieo) this.b, (Map) this.c, awoqVar, 1);
        }
        if (i == 2) {
            ?? r1 = this.b;
            Object obj8 = this.f;
            Object obj9 = this.e;
            return new pmu((List) r1, (pra) obj8, (String) obj9, (aiaz) this.d, (Map) this.c, awoqVar, 2);
        }
        if (i != 3) {
            Object obj10 = this.e;
            return new pmu((adrf) obj10, (adqs) this.d, (awqg) this.b, (boc) this.f, (awut) this.c, awoqVar, 4);
        }
        Object obj11 = this.f;
        ?? r2 = this.b;
        Object obj12 = this.e;
        return new pmu((tir) obj11, (tns) r2, (tmr) obj12, (String) this.c, (tjh) this.d, awoqVar, 3);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((pmu) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 1) {
            return ((pmu) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 2) {
            return ((pmu) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 3) {
            return ((pmu) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((pmu) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (((defpackage.adrf) r2).d(r7, r6, r8, r15) != r0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0112, code lost:
    
        if (r15 != r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01f7, code lost:
    
        if (((defpackage.pmz) r2).h((defpackage.aicw) r3, (defpackage.plx) r4, (defpackage.pmi) r5, (defpackage.plb) r6, r15) == r0) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v20, types: [adqs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [adqs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [adqs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r6v7, types: [adqs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [awqg, java.lang.Object] */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmu(List list, pra praVar, String str, aiaz aiazVar, Map map, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = list;
        this.f = praVar;
        this.e = str;
        this.d = aiazVar;
        this.c = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmu(plb plbVar, ozu ozuVar, plx plxVar, aieo aieoVar, Map map, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = plbVar;
        this.f = ozuVar;
        this.e = plxVar;
        this.b = aieoVar;
        this.c = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmu(pmz pmzVar, aicw aicwVar, plx plxVar, pmi pmiVar, plb plbVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = pmzVar;
        this.c = aicwVar;
        this.d = plxVar;
        this.e = pmiVar;
        this.f = plbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmu(tir tirVar, tns tnsVar, tmr tmrVar, String str, tjh tjhVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.f = tirVar;
        this.b = tnsVar;
        this.e = tmrVar;
        this.c = str;
        this.d = tjhVar;
    }
}
