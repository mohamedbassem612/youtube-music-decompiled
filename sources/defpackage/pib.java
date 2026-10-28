package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pib extends awpk implements awqk {
    Object a;
    Object b;
    int c;
    final /* synthetic */ pot d;
    final /* synthetic */ pic e;
    final /* synthetic */ atr f;
    final /* synthetic */ String g;
    final /* synthetic */ plx h;
    final /* synthetic */ pzn i;
    final /* synthetic */ aidq j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pib(pot potVar, pic picVar, atr atrVar, String str, plx plxVar, pzn pznVar, aidq aidqVar, awoq awoqVar) {
        super(2, awoqVar);
        this.d = potVar;
        this.e = picVar;
        this.f = atrVar;
        this.g = str;
        this.h = plxVar;
        this.i = pznVar;
        this.j = aidqVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new pib(this.d, this.e, this.f, this.g, this.h, this.i, this.j, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((pib) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    /* JADX WARN: Code duplicated, block: B:15:0x0058  */
    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0055 -> B:19:0x007f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:18:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x0072
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.awpe
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            awox r0 = defpackage.awox.a
            int r1 = r13.c
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 == r2) goto L12
            java.lang.Object r1 = r13.b
            java.lang.Object r3 = r13.a
            defpackage.atqp.j(r14)
            r10 = r13
            goto L73
        L12:
            java.lang.Object r1 = r13.a
            defpackage.atqp.j(r14)
            r3 = r1
            goto L25
        L19:
            defpackage.atqp.j(r14)
            pot r14 = r13.d
            java.util.List r14 = r14.u
            java.util.Iterator r14 = r14.iterator()
            r3 = r14
        L25:
            boolean r14 = r3.hasNext()
            if (r14 == 0) goto L81
            java.lang.Object r14 = r3.next()
            r8 = r14
            pos r8 = (defpackage.pos) r8
            int r14 = r8.i
            pic r4 = r13.e
            r1 = 2
            if (r14 != r1) goto L58
            atr r5 = r13.f
            java.lang.String r6 = r13.g
            plx r7 = r13.h
            r9 = r8
            pot r8 = r13.d
            pzn r10 = r13.i
            aidq r11 = r13.j
            r13.a = r3
            r14 = 0
            r13.b = r14
            r13.c = r2
            agsn r14 = defpackage.pic.a
            r12 = r13
            java.lang.Object r13 = r4.f(r5, r6, r7, r8, r9, r10, r11, r12)
            r10 = r12
            if (r13 != r0) goto L7f
            goto L83
        L58:
            r10 = r13
            agsn r13 = defpackage.pic.a
            java.lang.String r5 = r10.g
            plx r6 = r10.h
            pot r7 = r10.d
            pzn r9 = r10.i
            r10.a = r3
            r10.b = r8
            r10.c = r1
            piy r4 = r4.d
            java.lang.Object r14 = defpackage.piy.c(r4, r5, r6, r7, r8, r9, r10)
            r9 = r8
            if (r14 == r0) goto L83
            r1 = r9
        L73:
            pos r1 = (defpackage.pos) r1
            java.lang.String r13 = r1.b
            atr r1 = r10.f
            r4 = 0
            android.app.PendingIntent r14 = (android.app.PendingIntent) r14
            r1.f(r4, r13, r14)
        L7f:
            r13 = r10
            goto L25
        L81:
            awmy r0 = defpackage.awmy.a
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pib.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
