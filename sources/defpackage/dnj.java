package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dnj extends awpk implements awqk {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    int f;
    int g;
    final /* synthetic */ dmi[] h;
    final /* synthetic */ dnl i;
    final /* synthetic */ dnv j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnj(dmi[] dmiVarArr, dnl dnlVar, dnv dnvVar, awoq awoqVar) {
        super(2, awoqVar);
        this.h = dmiVarArr;
        this.i = dnlVar;
        this.j = dnvVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new dnj(this.h, this.i, this.j, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((dnj) create((dnq) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [dml, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r4v11, types: [dnl] */
    /* JADX WARN: Type inference failed for: r4v7, types: [dnl] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:24:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x004a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.awpe
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            awox r0 = defpackage.awox.a
            int r1 = r10.g
            r2 = 1
            if (r1 == 0) goto L26
            int r3 = r10.f
            if (r1 == r2) goto L16
            int r1 = r10.e
            int r4 = r10.d
            java.lang.Object r5 = r10.c
            java.lang.Object r6 = r10.b
            java.lang.Object r7 = r10.a
            goto L20
        L16:
            int r1 = r10.e
            int r4 = r10.d
            java.lang.Object r5 = r10.c
            java.lang.Object r6 = r10.b
            java.lang.Object r7 = r10.a
        L20:
            defpackage.atqp.j(r11)
            r11 = r5
            r5 = r4
            goto L84
        L26:
            defpackage.atqp.j(r11)
            dmi[] r11 = r10.h
            dnl r1 = r10.i
            dnv r3 = r10.j
            int r4 = r11.length
            r5 = 0
            r7 = r11
            r6 = r1
            r11 = r3
            r3 = r4
            r1 = r5
        L36:
            if (r1 >= r3) goto L86
            r4 = r7
            dmi[] r4 = (defpackage.dmi[]) r4
            r4 = r4[r1]
            int r8 = r5 + 1
            int r4 = r4.ordinal()
            if (r4 == 0) goto L83
            if (r4 == r2) goto L6a
            r9 = 2
            if (r4 != r9) goto L64
            r10.a = r7
            r10.b = r6
            r10.c = r11
            r10.d = r8
            r10.e = r1
            r10.f = r3
            r10.g = r9
            int r4 = defpackage.dnl.h
            r4 = r6
            dnl r4 = (defpackage.dnl) r4
            java.lang.Object r4 = r4.d(r11, r5, r10)
            if (r4 == r0) goto L88
            goto L83
        L64:
            awmj r10 = new awmj
            r10.<init>()
            throw r10
        L6a:
            r10.a = r7
            r10.b = r6
            r10.c = r11
            r10.d = r8
            r10.e = r1
            r10.f = r3
            r10.g = r2
            int r4 = defpackage.dnl.h
            r4 = r6
            dnl r4 = (defpackage.dnl) r4
            java.lang.Object r4 = r4.c(r11, r5, r10)
            if (r4 == r0) goto L88
        L83:
            r5 = r8
        L84:
            int r1 = r1 + r2
            goto L36
        L86:
            awmy r0 = defpackage.awmy.a
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
