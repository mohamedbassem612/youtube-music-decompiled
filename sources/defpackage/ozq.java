package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ozq extends awpk implements awqg {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozq(List list, pjv pjvVar, plx plxVar, pbh pbhVar, awoq awoqVar, int i) {
        super(1, awoqVar);
        this.$cid = i;
        this.d = list;
        this.c = pjvVar;
        this.e = plxVar;
        this.b = pbhVar;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            Object obj = this.b;
            Object obj2 = this.c;
            return new ozq((ozu) obj, (plx) obj2, (aiez) this.d, (ahyr) this.e, awoqVar, 0);
        }
        if (i != 1) {
            ?? r1 = this.d;
            Object obj3 = this.c;
            return new ozq((List) r1, (pjv) obj3, (plx) this.e, (pbh) this.b, awoqVar, 2);
        }
        Object obj4 = this.b;
        Object obj5 = this.c;
        return new ozq((ozu) obj4, (plx) obj5, (aiez) this.d, (ahyr) this.e, awoqVar, 1, null);
    }

    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return ((ozq) create((awoq) obj)).invokeSuspend(awmy.a);
        }
        if (i != 1) {
            return ((ozq) create((awoq) obj)).invokeSuspend(awmy.a);
        }
        return ((ozq) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f0, code lost:
    
        if (((defpackage.ozu) r15).h((defpackage.plx) r0, (defpackage.aiez) r2, (defpackage.ahyr) r3, r14) != r14) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0115, code lost:
    
        if (((defpackage.ozu) r15).h((defpackage.plx) r0, (defpackage.aiez) r2, (defpackage.ahyr) r3, r14) == r14) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozq(ozu ozuVar, plx plxVar, aiez aiezVar, ahyr ahyrVar, awoq awoqVar, int i) {
        super(1, awoqVar);
        this.$cid = i;
        this.b = ozuVar;
        this.c = plxVar;
        this.d = aiezVar;
        this.e = ahyrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozq(ozu ozuVar, plx plxVar, aiez aiezVar, ahyr ahyrVar, awoq awoqVar, int i, byte[] bArr) {
        super(1, awoqVar);
        this.$cid = i;
        this.b = ozuVar;
        this.c = plxVar;
        this.d = aiezVar;
        this.e = ahyrVar;
    }
}
