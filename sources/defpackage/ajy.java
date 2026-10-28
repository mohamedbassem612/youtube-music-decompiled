package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ajy extends awpj implements awqk {
    Object a;
    int b;
    int c;
    int d;
    final /* synthetic */ ajz e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajy(ajz ajzVar, awoq awoqVar) {
        super(2, awoqVar);
        this.e = ajzVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        ajy ajyVar = new ajy(this.e, awoqVar);
        ajyVar.f = obj;
        return ajyVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ajy) create((awsz) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0052 -> B:15:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006c -> B:24:0x0082). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0080 -> B:24:0x0082). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.awpe
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = r0.f
            awsz r1 = (defpackage.awsz) r1
            awox r2 = defpackage.awox.a
            int r3 = r0.d
            r4 = 0
            r7 = 64
            r8 = 2
            r9 = 0
            r10 = 0
            r12 = 1
            if (r3 == 0) goto L2b
            if (r3 == r12) goto L21
            int r13 = r0.b
            defpackage.atqp.j(r19)
            r16 = 1
            if (r3 == r8) goto L82
            goto Lb2
        L21:
            int r3 = r0.c
            int r13 = r0.b
            java.lang.Object r14 = r0.a
            defpackage.atqp.j(r19)
            goto L54
        L2b:
            defpackage.atqp.j(r19)
            ajz r3 = r0.e
            long[] r3 = r3.d
            if (r3 == 0) goto L56
            int r13 = r3.length
            r14 = r3
            r3 = r13
            r13 = r9
        L38:
            if (r13 >= r3) goto L56
            r15 = r14
            long[] r15 = (long[]) r15
            r5 = r15[r13]
            java.lang.Long r15 = new java.lang.Long
            r15.<init>(r5)
            r0.f = r1
            r0.a = r14
            r0.b = r13
            r0.c = r3
            r0.d = r12
            java.lang.Object r5 = r1.a(r15, r0)
            if (r5 == r2) goto Lb7
        L54:
            int r13 = r13 + r12
            goto L38
        L56:
            r16 = 1
            ajz r3 = r0.e
            long r5 = r3.c
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 == 0) goto L84
            r13 = r9
        L61:
            if (r13 >= r7) goto L84
            ajz r3 = r0.e
            long r5 = r16 << r13
            long r14 = r3.c
            long r14 = r14 & r5
            int r3 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r3 == 0) goto L82
            long r5 = (long) r13
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r5)
            r0.f = r1
            r0.a = r4
            r0.b = r13
            r0.d = r8
            java.lang.Object r3 = r1.a(r3, r0)
            if (r3 == r2) goto Lb7
        L82:
            int r13 = r13 + r12
            goto L61
        L84:
            ajz r3 = r0.e
            long r5 = r3.b
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 == 0) goto Lb5
        L8c:
            if (r9 >= r7) goto Lb5
            ajz r3 = r0.e
            long r5 = r16 << r9
            long r13 = r3.b
            long r13 = r13 & r5
            int r3 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r3 == 0) goto Lb1
            long r5 = (long) r9
            java.lang.Long r3 = new java.lang.Long
            r13 = 64
            long r5 = r5 + r13
            r3.<init>(r5)
            r0.f = r1
            r0.a = r4
            r0.b = r9
            r5 = 3
            r0.d = r5
            java.lang.Object r3 = r1.a(r3, r0)
            if (r3 == r2) goto Lb7
        Lb1:
            r13 = r9
        Lb2:
            int r9 = r13 + 1
            goto L8c
        Lb5:
            awmy r2 = defpackage.awmy.a
        Lb7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
