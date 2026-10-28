package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pvv extends awpk implements awqg {
    private final /* synthetic */ int $cid;
    Object a;
    int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvv(bfp bfpVar, awqk awqkVar, awoq awoqVar, int i) {
        super(1, awoqVar);
        this.$cid = i;
        this.c = bfpVar;
        this.d = awqkVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            return new pvv((pvz) this.c, (Map) this.d, awoqVar, 0);
        }
        Object obj = this.c;
        if (i != 1) {
            return new pvv((pvz) obj, (List) this.d, awoqVar, 2);
        }
        return new pvv((bfp) obj, (awqk) this.d, awoqVar, 1);
    }

    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return ((pvv) create((awoq) obj)).invokeSuspend(awmy.a);
        }
        if (i != 1) {
            return ((pvv) create((awoq) obj)).invokeSuspend(awmy.a);
        }
        return ((pvv) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
        if (r12 != r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f4, code lost:
    
        if (r12 != r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a3, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v26, types: [bfp] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v32, types: [pvz] */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v40, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4, types: [pkx] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v2, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, pvs] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, pvs] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Iterator] */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvv(pvz pvzVar, List list, awoq awoqVar, int i) {
        super(1, awoqVar);
        this.$cid = i;
        this.c = pvzVar;
        this.d = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvv(pvz pvzVar, Map map, awoq awoqVar, int i) {
        super(1, awoqVar);
        this.$cid = i;
        this.c = pvzVar;
        this.d = map;
    }
}
