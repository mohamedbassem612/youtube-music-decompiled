package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bej extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(aesp aespVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = aespVar;
    }

    /* JADX WARN: Type inference failed for: r2v33, types: [awzc, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        switch (this.$cid) {
            case 0:
                return new bej((bfp) this.b, awoqVar, 0);
            case 1:
                return new bej((bfp) this.b, awoqVar, 1, (byte[]) null);
            case 2:
                return new bej((bfp) this.b, awoqVar, 2, (char[]) null);
            case 3:
                return new bej((bfp) this.b, awoqVar, 3, (short[]) null);
            case 4:
                return new bej((ayq) this.b, awoqVar, 4);
            case 5:
                return new bej((dmg) this.b, awoqVar, 5);
            case 6:
                return new bej((dnl) this.b, awoqVar, 6);
            case 7:
                return new bej((eby) this.b, awoqVar, 7);
            case 8:
                return new bej((eby) this.b, awoqVar, 8, (byte[]) null);
            case 9:
                return new bej((jnm) this.b, awoqVar, 9);
            case 10:
                return new bej((omm) this.b, awoqVar, 10);
            case 11:
                return new bej((tko) this.b, awoqVar, 11);
            case 12:
                return new bej((aesp) this.b, awoqVar, 12);
            case 13:
                return new bej((aesp) this.b, awoqVar, 13, (byte[]) null);
            case 14:
                return new bej((ycd) this.b, awoqVar, 14);
            case 15:
                return new bej((ycd) this.b, awoqVar, 15, (byte[]) null);
            default:
                return new bej((awzc) this.b, awoqVar, 16);
        }
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$cid) {
            case 0:
                return ((bej) create((awzd) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((bej) create(bool, (awoq) obj2)).invokeSuspend(awmy.a);
            case 2:
                return ((bej) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((bej) create(bool2, (awoq) obj2)).invokeSuspend(awmy.a);
            case 4:
                return ((bej) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 5:
                return ((bej) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 6:
                return ((bej) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 7:
                return ((bej) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 8:
                return ((bej) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 9:
                return ((bej) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 10:
                return ((bej) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 11:
                return ((bej) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 12:
                return ((bej) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 13:
                return ((bej) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 14:
                return ((bej) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 15:
                return ((bej) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            default:
                return ((bej) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x028d, code lost:
    
        if (r10 != r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        if (defpackage.awqx.w(r1, r5, r9) != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02fc, code lost:
    
        if (((defpackage.dnl) r10).e(r9) != r0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0314, code lost:
    
        if (((defpackage.dmg) r10).a(r9) != r0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x038b, code lost:
    
        if (r1.collect(r3, r9) != r0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03bd, code lost:
    
        if (((defpackage.bfp) r10).e(r9) != r0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03ca, code lost:
    
        if (defpackage.awqx.v(r10, r9) == r0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (defpackage.awqx.w(r10.h, r2, r9) != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (((defpackage.aesp) r10).d(r9) != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        if (((defpackage.aesp) r10).c(r9) != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c7, code lost:
    
        if (r10 != r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ac, code lost:
    
        if (r10 != r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0253, code lost:
    
        if (r10 != r0) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v107, types: [awzc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v52, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v18, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [awzc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [aunn, java.lang.Object] */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bej.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(aesp aespVar, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = aespVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(awzc awzcVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awzcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(ayq ayqVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ayqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(bfp bfpVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = bfpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(bfp bfpVar, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = bfpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(bfp bfpVar, awoq awoqVar, int i, char[] cArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = bfpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(bfp bfpVar, awoq awoqVar, int i, short[] sArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = bfpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(dmg dmgVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = dmgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(dnl dnlVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = dnlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(eby ebyVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ebyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(eby ebyVar, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ebyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(jnm jnmVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = jnmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(omm ommVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ommVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(tko tkoVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = tkoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(ycd ycdVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ycdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(ycd ycdVar, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = ycdVar;
    }
}
