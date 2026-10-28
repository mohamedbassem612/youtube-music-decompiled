package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axen extends axbi {
    private final axso d;

    public axen(axso axsoVar, awou awouVar, int i, int i2) {
        super(awouVar, i, i2);
        this.d = axsoVar;
    }

    private final long f() {
        if (this.c != 1) {
            return Long.MAX_VALUE;
        }
        int i = this.b;
        if (i == -2) {
            int i2 = awye.zb;
            return awyd.a;
        }
        if (i == 0) {
            return 1L;
        }
        if (i == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        long j = i;
        if (j < 1) {
            throw new IllegalStateException("Check failed.");
        }
        return j;
    }

    @Override // defpackage.axbi
    public final Object a(awyp awypVar, awoq awoqVar) throws Throwable {
        awypVar.b();
        Object objC = c(new axce(awypVar.c()), awoqVar);
        return objC != awox.a ? awmy.a : objC;
    }

    @Override // defpackage.axbi
    protected final axbi b(awou awouVar, int i, int i2) {
        return new axen(this.d, awouVar, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[Catch: all -> 0x00af, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00af, blocks: (B:13:0x002e, B:30:0x0082, B:18:0x0040), top: B:51:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4 A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #1 {all -> 0x00ac, blocks: (B:33:0x0099, B:35:0x00a4), top: B:49:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [awzd] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [axeq] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v3, types: [axeq] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v10, types: [axeq] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [axeq] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0095 -> B:32:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(defpackage.awzd r14, defpackage.awoq r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.axem
            if (r0 == 0) goto L13
            r0 = r15
            axem r0 = (defpackage.axem) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            axem r0 = new axem
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.c
            awox r1 = defpackage.awox.a
            int r2 = r0.e
            r3 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L44
            if (r2 == r6) goto L3a
            if (r2 != r5) goto L32
            long r7 = r0.b
            axeq r14 = r0.f
            java.lang.Object r2 = r0.a
            defpackage.atqp.j(r15)     // Catch: java.lang.Throwable -> Laf
            goto L97
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            long r7 = r0.b
            axeq r14 = r0.f
            java.lang.Object r2 = r0.a
            defpackage.atqp.j(r15)     // Catch: java.lang.Throwable -> Laf
            goto L7a
        L44:
            defpackage.atqp.j(r15)
            int r15 = r13.b
            int r2 = r13.c
            axeq r7 = new axeq
            long r8 = r13.f()
            r7.<init>(r15, r2, r8)
            axso r15 = r13.d
            axeh[] r2 = defpackage.axeo.a
            int r8 = r2.length
            r9 = 0
        L5a:
            if (r9 >= r8) goto L65
            r15 = r2[r9]
            axso r15 = r15.a()
            int r9 = r9 + 1
            goto L5a
        L65:
            r15.aq(r7)
        L68:
            r8 = r3
        L69:
            r0.a = r14     // Catch: java.lang.Throwable -> Lb2
            r0.f = r7     // Catch: java.lang.Throwable -> Lb2
            r0.b = r8     // Catch: java.lang.Throwable -> Lb2
            r0.e = r6     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r15 = r7.d(r0)     // Catch: java.lang.Throwable -> Lb2
            if (r15 == r1) goto Lb1
            r2 = r14
            r14 = r7
            r7 = r8
        L7a:
            if (r15 != 0) goto L82
            r14.f()
            awmy r1 = defpackage.awmy.a
            goto Lb1
        L82:
            awou r9 = r0.getContext()     // Catch: java.lang.Throwable -> Laf
            defpackage.awro.A(r9)     // Catch: java.lang.Throwable -> Laf
            r0.a = r2     // Catch: java.lang.Throwable -> Laf
            r0.f = r14     // Catch: java.lang.Throwable -> Laf
            r0.b = r7     // Catch: java.lang.Throwable -> Laf
            r0.e = r5     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r15 = r2.emit(r15, r0)     // Catch: java.lang.Throwable -> Laf
            if (r15 == r1) goto Lb1
        L97:
            r15 = r14
            r14 = r2
            long r9 = r13.f()     // Catch: java.lang.Throwable -> Lac
            r11 = 1
            long r7 = r7 + r11
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto La9
            r15.g()     // Catch: java.lang.Throwable -> Lac
            r7 = r15
            goto L68
        La9:
            r8 = r7
            r7 = r15
            goto L69
        Lac:
            r13 = move-exception
            r14 = r15
            goto Lb4
        Laf:
            r13 = move-exception
            goto Lb4
        Lb1:
            return r1
        Lb2:
            r13 = move-exception
            r14 = r7
        Lb4:
            r14.f()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axen.c(awzd, awoq):java.lang.Object");
    }

    @Override // defpackage.axbi, defpackage.awzc
    public final Object collect(awzd awzdVar, awoq awoqVar) throws Throwable {
        awou context = awoqVar.getContext();
        if (awrc.c(awup.a(context, this.a), context)) {
            Object objC = c(awzdVar, awoqVar);
            if (objC == awox.a) {
                return objC;
            }
        } else {
            Object objD = axbi.d(this, awzdVar, awoqVar);
            if (objD == awox.a) {
                return objD;
            }
        }
        return awmy.a;
    }
}
