package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pvm extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    Object a;
    int b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvm(djl djlVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = djlVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        Object obj2 = this.c;
        return i != 0 ? new pvm((djl) obj2, awoqVar, 1) : new pvm((pvo) obj2, awoqVar, 0);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((pvm) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((pvm) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3, types: [awqk] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v21, types: [awye, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004d -> B:15:0x004f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x0005
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.awpe
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.$cid
            r1 = 1
            if (r0 == 0) goto L6c
            awox r0 = defpackage.awox.a
            int r2 = r4.b
            if (r2 == 0) goto L17
            if (r2 == r1) goto L11
            defpackage.atqp.j(r5)
            goto L4f
        L11:
            java.lang.Object r2 = r4.a
            defpackage.atqp.j(r5)
            goto L43
        L17:
            defpackage.atqp.j(r5)
            java.lang.Object r5 = r4.c
            djl r5 = (defpackage.djl) r5
            java.lang.Object r5 = r5.d
            ci r5 = (defpackage.ci) r5
            int r5 = r5.j()
            if (r5 <= 0) goto L64
        L28:
            java.lang.Object r5 = r4.c
            djl r5 = (defpackage.djl) r5
            java.lang.Object r2 = r5.a
            axcw r2 = (defpackage.axcw) r2
            awou r2 = r2.a
            defpackage.awro.A(r2)
            java.lang.Object r2 = r5.b
            r4.a = r2
            r4.b = r1
            java.lang.Object r5 = r5.c
            java.lang.Object r5 = r5.d(r4)
            if (r5 == r0) goto Lae
        L43:
            r3 = 0
            r4.a = r3
            r3 = 2
            r4.b = r3
            java.lang.Object r5 = r2.invoke(r5, r4)
            if (r5 == r0) goto Lae
        L4f:
            java.lang.Object r5 = r4.c
            djl r5 = (defpackage.djl) r5
            java.lang.Object r5 = r5.d
            ci r5 = (defpackage.ci) r5
            java.lang.Object r5 = r5.a
            java.util.concurrent.atomic.AtomicInteger r5 = (java.util.concurrent.atomic.AtomicInteger) r5
            int r5 = r5.decrementAndGet()
            if (r5 != 0) goto L28
            awmy r0 = defpackage.awmy.a
            goto Lae
        L64:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Check failed."
            r4.<init>(r5)
            throw r4
        L6c:
            awox r0 = defpackage.awox.a
            int r2 = r4.b
            if (r2 == 0) goto L78
            java.lang.Object r0 = r4.a
            defpackage.atqp.j(r5)     // Catch: java.lang.Exception -> L9b
            goto L94
        L78:
            defpackage.atqp.j(r5)
            java.lang.Object r5 = r4.c
            pkx r2 = defpackage.pkx.W
            pvo r5 = (defpackage.pvo) r5     // Catch: java.lang.Exception -> L9d
            aunn r5 = r5.a     // Catch: java.lang.Exception -> L9d
            java.lang.Object r5 = r5.io()     // Catch: java.lang.Exception -> L9d
            pvh r5 = (defpackage.pvh) r5     // Catch: java.lang.Exception -> L9d
            r4.a = r2     // Catch: java.lang.Exception -> L9d
            r4.b = r1     // Catch: java.lang.Exception -> L9d
            java.lang.Object r5 = r5.a(r4)     // Catch: java.lang.Exception -> L9d
            if (r5 == r0) goto Lae
            r0 = r2
        L94:
            pla r1 = new pla     // Catch: java.lang.Exception -> L9b
            r1.<init>(r5)     // Catch: java.lang.Exception -> L9b
            r0 = r1
            goto Lae
        L9b:
            r5 = move-exception
            goto L9f
        L9d:
            r5 = move-exception
            r0 = r2
        L9f:
            awou r4 = r4.getContext()
            defpackage.awro.A(r4)
            pkv r4 = new pkv
            pkx r0 = (defpackage.pkx) r0
            r4.<init>(r5, r0)
            r0 = r4
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvm(pvo pvoVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = pvoVar;
    }
}
