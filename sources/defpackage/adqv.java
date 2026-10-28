package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adqv extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqv(adqc adqcVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = adqcVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [awqg, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        switch (this.$cid) {
            case 0:
                return new adqv((awqg) this.b, awoqVar, 0);
            case 1:
                return new adqv((xpq) this.b, awoqVar, 1);
            case 2:
                return new adqv((adqc) this.b, awoqVar, 2);
            case 3:
                return new adqv((awqg) this.b, awoqVar, 3, (byte[]) null);
            case 4:
                return new adqv((adrf) this.b, awoqVar, 4);
            case 5:
                return new adqv((awqg) this.b, awoqVar, 5, (char[]) null);
            case 6:
                return new adqv((ahgb) this.b, awoqVar, 6);
            default:
                return new adqv((ahpr) this.b, awoqVar, 7);
        }
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$cid) {
            case 0:
                return ((adqv) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 1:
                return ((adqv) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 2:
                return ((adqv) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 3:
                return ((adqv) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 4:
                return ((adqv) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 5:
                return ((adqv) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 6:
                return ((adqv) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            default:
                return ((adqv) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (defpackage.avkz.y(150, r4) != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (defpackage.adqc.a((defpackage.adqc) r5, r4) != r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        if (((defpackage.xpq) r5).c(r4) != r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        if (r5 == r0) goto L44;
     */
    /* JADX WARN: Type inference failed for: r5v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [bec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [awqg, java.lang.Object] */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adqv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqv(adrf adrfVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = adrfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqv(ahgb ahgbVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ahgbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqv(ahpr ahprVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ahprVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqv(awqg awqgVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awqgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqv(awqg awqgVar, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awqgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqv(awqg awqgVar, awoq awoqVar, int i, char[] cArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awqgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqv(xpq xpqVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = xpqVar;
    }
}
