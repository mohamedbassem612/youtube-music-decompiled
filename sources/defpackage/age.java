package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class age extends awpj implements awqk {
    private final /* synthetic */ int $cid;
    Object a;
    Object b;
    int c;
    int d;
    long e;
    long f;
    int g;
    final /* synthetic */ Object h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public age(afy afyVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.h = afyVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            age ageVar = new age((agf) this.h, awoqVar, 0);
            ageVar.i = obj;
            return ageVar;
        }
        Object obj2 = this.h;
        if (i != 1) {
            age ageVar2 = new age((ahd) obj2, awoqVar, 2);
            ageVar2.i = obj;
            return ageVar2;
        }
        age ageVar3 = new age((afy) obj2, awoqVar, 1);
        ageVar3.i = obj;
        return ageVar3;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((age) create((awsz) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 1) {
            return ((age) create((awsz) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((age) create((awsz) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x007f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r2v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0076 -> B:16:0x0078). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0109 -> B:31:0x010b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0199 -> B:48:0x019d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:18:0x007f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.awpe
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.age.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public age(agf agfVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.h = agfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public age(ahd ahdVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.h = ahdVar;
    }
}
