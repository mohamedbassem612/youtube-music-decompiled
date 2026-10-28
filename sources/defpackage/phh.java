package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class phh extends awpk implements awqk {
    Object a;
    int b;
    final /* synthetic */ phk c;
    final /* synthetic */ plb d;
    final /* synthetic */ phb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phh(phk phkVar, plb plbVar, phb phbVar, awoq awoqVar) {
        super(2, awoqVar);
        this.c = phkVar;
        this.d = plbVar;
        this.e = phbVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new phh(this.c, this.d, this.e, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((phh) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0087 -> B:23:0x0089). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.awpe
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            awox r0 = defpackage.awox.a
            int r1 = r9.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 == r2) goto L11
            defpackage.atqp.j(r10)
            goto Lad
        L11:
            java.lang.Object r1 = r9.a
            defpackage.atqp.j(r10)
            r8 = r9
            goto L89
        L19:
            defpackage.atqp.j(r10)
            goto L2e
        L1d:
            defpackage.atqp.j(r10)
            phk r10 = r9.c
            agsn r1 = defpackage.phk.a
            r9.b = r3
            pve r10 = r10.d
            java.lang.Object r10 = r10.c(r9)
            if (r10 == r0) goto Laf
        L2e:
            pky r10 = (defpackage.pky) r10
            int r1 = defpackage.a.au(r10)
            if (r1 == 0) goto L52
            if (r1 != r3) goto L4c
            pku r10 = (defpackage.pku) r10
            agsn r1 = defpackage.phk.a
            agru r1 = r1.c()
            java.lang.Throwable r10 = r10.b()
            java.lang.String r3 = "Failed to fetch accounts from storage, not refreshing notifications."
            defpackage.a.cm(r1, r3, r10)
            awno r10 = defpackage.awno.a
            goto L56
        L4c:
            awmj r9 = new awmj
            r9.<init>()
            throw r9
        L52:
            pla r10 = (defpackage.pla) r10
            java.lang.Object r10 = r10.a
        L56:
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r10 = r10.iterator()
            r1 = r10
        L5d:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L8d
            java.lang.Object r10 = r1.next()
            plx r10 = (defpackage.plx) r10
            phk r3 = r9.c
            agsn r4 = defpackage.phk.a
            omm r4 = r3.e
            agke r5 = r4.p(r10)
            pcu r4 = defpackage.nvu.a(r10)
            r5.getClass()
            plb r6 = r9.d
            phb r7 = r9.e
            r9.a = r1
            r9.b = r2
            r8 = r9
            java.lang.Object r10 = r3.e(r4, r5, r6, r7, r8)
            if (r10 == r0) goto Laf
        L89:
            java.util.List r10 = (java.util.List) r10
            r9 = r8
            goto L5d
        L8d:
            r8 = r9
            phk r3 = r8.c
            agsn r9 = defpackage.phk.a
            omm r9 = r3.e
            r10 = 0
            agke r5 = r9.p(r10)
            pcr r4 = defpackage.pcr.a
            r5.getClass()
            plb r6 = r8.d
            phb r7 = r8.e
            r8.a = r10
            r9 = 3
            r8.b = r9
            java.lang.Object r9 = r3.e(r4, r5, r6, r7, r8)
            if (r9 == r0) goto Laf
        Lad:
            awmy r0 = defpackage.awmy.a
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
