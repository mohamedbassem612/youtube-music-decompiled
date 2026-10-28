package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hlb extends awpk implements awqk {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ axfd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlb(axfd axfdVar, int i, awoq awoqVar) {
        super(2, awoqVar);
        this.c = axfdVar;
        this.b = i;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new hlb(this.c, this.b, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((hlb) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068 A[Catch: Exception -> 0x0079, CancellationException -> 0x0084, TryCatch #2 {CancellationException -> 0x0084, Exception -> 0x0079, blocks: (B:5:0x000a, B:22:0x005d, B:23:0x005f, B:25:0x0068, B:26:0x0071, B:6:0x000e, B:19:0x004a, B:9:0x0015, B:11:0x0028, B:17:0x003e, B:20:0x004d), top: B:33:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[Catch: Exception -> 0x0079, CancellationException -> 0x0084, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0084, Exception -> 0x0079, blocks: (B:5:0x000a, B:22:0x005d, B:23:0x005f, B:25:0x0068, B:26:0x0071, B:6:0x000e, B:19:0x004a, B:9:0x0015, B:11:0x0028, B:17:0x003e, B:20:0x004d), top: B:33:0x0006 }] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r9 != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r9 != r0) goto L22;
     */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, pxv] */
    /* JADX WARN: Type inference failed for: r9v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [awmd, java.lang.Object] */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            awox r0 = defpackage.awox.a
            int r1 = r8.a
            r2 = 6
            r3 = 1
            if (r1 == 0) goto L12
            if (r1 == r3) goto Le
            defpackage.atqp.j(r9)     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            goto L5d
        Le:
            defpackage.atqp.j(r9)     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            goto L4a
        L12:
            defpackage.atqp.j(r9)
            axfd r9 = r8.c     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            java.lang.Object r1 = r9.d     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            vxz r1 = (defpackage.vxz) r1     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            r4 = 45803126(0x2bae676, double:2.2629751E-316)
            r6 = 0
            r7 = 245(0xf5, float:3.43E-43)
            boolean r1 = r1.l(r7, r4, r6)     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            r4 = 2
            if (r1 == 0) goto L4d
            java.lang.Object r9 = r9.c     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            java.lang.Object r9 = r9.io()     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            ijt r9 = (defpackage.ijt) r9     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            int r1 = r8.b     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            if (r1 == r3) goto L3c
            if (r1 == r4) goto L39
            java.lang.String r1 = "USER_CHANGE"
            goto L3e
        L39:
            java.lang.String r1 = "BACKGROUND_JOB"
            goto L3e
        L3c:
            java.lang.String r1 = "ACTIVITY_RESUME"
        L3e:
            r8.a = r3     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            aier r3 = defpackage.aier.COLLABORATOR_API_CALL     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            java.lang.Object r9 = r9.a     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            java.lang.Object r9 = r9.a(r3, r1, r8)     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            if (r9 == r0) goto L78
        L4a:
            pky r9 = (defpackage.pky) r9     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            goto L5f
        L4d:
            java.lang.Object r9 = r9.a     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            java.lang.Object r9 = r9.io()     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            pxr r9 = (defpackage.pxr) r9     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            r8.a = r4     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            java.lang.Object r9 = r9.a(r8)     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            if (r9 == r0) goto L78
        L5d:
            pky r9 = (defpackage.pky) r9     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
        L5f:
            r0 = r9
            boolean r9 = r0.i()     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            axfd r1 = r8.c     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            if (r9 == 0) goto L71
            java.lang.Object r9 = r1.b     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            ci r9 = (defpackage.ci) r9     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            r1 = 4
            r9.aC(r1)     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            goto L78
        L71:
            java.lang.Object r9 = r1.b     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            ci r9 = (defpackage.ci) r9     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            r9.aC(r2)     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
        L78:
            return r0
        L79:
            r9 = move-exception
            axfd r8 = r8.c
            java.lang.Object r8 = r8.b
            ci r8 = (defpackage.ci) r8
            r8.aC(r2)
            throw r9
        L84:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hlb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
