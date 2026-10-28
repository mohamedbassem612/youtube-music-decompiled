package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bep extends awpk implements awqg {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bep(awqg awqgVar, awoq awoqVar, int i) {
        super(1, awoqVar);
        this.$cid = i;
        this.b = awqgVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bdx, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? new bep((pki) this.b, awoqVar, 2) : new bep((bdx) this.b, awoqVar, 1);
        }
        return new bep((awqg) this.b, awoqVar, 0);
    }

    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return ((bep) create((awoq) obj)).invokeSuspend(awmy.a);
        }
        if (i != 1) {
            return ((bep) create((awoq) obj)).invokeSuspend(awmy.a);
        }
        return ((bep) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r4.c() != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r4 != r0) goto L9;
     */
    /* JADX WARN: Type inference failed for: r4v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [bdx, java.lang.Object] */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            int r0 = r3.$cid
            r1 = 1
            if (r0 == 0) goto L5d
            if (r0 == r1) goto L47
            awox r0 = defpackage.awox.a
            int r2 = r3.a
            defpackage.atqp.j(r4)
            if (r2 != 0) goto L1e
            java.lang.Object r4 = r3.b
            r3.a = r1
            pki r4 = (defpackage.pki) r4
            pve r4 = r4.b
            java.lang.Object r4 = r4.c(r3)
            if (r4 == r0) goto L70
        L1e:
            pky r4 = (defpackage.pky) r4
            int r3 = defpackage.a.au(r4)
            if (r3 == 0) goto L42
            if (r3 != r1) goto L3c
            pku r4 = (defpackage.pku) r4
            agsn r3 = defpackage.pki.a
            agru r3 = r3.c()
            java.lang.Throwable r4 = r4.b()
            java.lang.String r0 = "Failed to fetch accounts from storage."
            defpackage.a.cm(r3, r0, r4)
            awno r4 = defpackage.awno.a
            goto L71
        L3c:
            awmj r3 = new awmj
            r3.<init>()
            throw r3
        L42:
            pla r4 = (defpackage.pla) r4
            java.lang.Object r4 = r4.a
            goto L71
        L47:
            awox r0 = defpackage.awox.a
            int r2 = r3.a
            defpackage.atqp.j(r4)
            if (r2 != 0) goto L5a
            java.lang.Object r4 = r3.b
            r3.a = r1
            java.lang.Object r3 = r4.c()
            if (r3 == r0) goto L70
        L5a:
            awmy r4 = defpackage.awmy.a
            goto L71
        L5d:
            awox r0 = defpackage.awox.a
            int r2 = r3.a
            defpackage.atqp.j(r4)
            if (r2 != 0) goto L71
            java.lang.Object r4 = r3.b
            r3.a = r1
            java.lang.Object r4 = r4.invoke(r3)
            if (r4 != r0) goto L71
        L70:
            r4 = r0
        L71:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bep.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bep(bdx bdxVar, awoq awoqVar, int i) {
        super(1, awoqVar);
        this.$cid = i;
        this.b = bdxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bep(pki pkiVar, awoq awoqVar, int i) {
        super(1, awoqVar);
        this.$cid = i;
        this.b = pkiVar;
    }
}
