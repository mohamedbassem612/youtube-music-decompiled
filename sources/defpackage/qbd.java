package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class qbd extends awpk implements awqk {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ qbf c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbd(boolean z, qbf qbfVar, String str, awoq awoqVar) {
        super(2, awoqVar);
        this.b = z;
        this.c = qbfVar;
        this.d = str;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new qbd(this.b, this.c, this.d, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((qbd) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            awox r0 = defpackage.awox.a
            int r1 = r3.a
            r2 = 1
            defpackage.atqp.j(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1f
            goto L30
        Ld:
            boolean r4 = r3.b
            qbf r1 = r3.c
            if (r4 == 0) goto L23
            java.lang.String r4 = r3.d
            r3.a = r2
            ppe r1 = r1.b
            java.lang.Object r4 = r1.c(r4, r3)
            if (r4 == r0) goto L33
        L1f:
            r0 = r4
            pky r0 = (defpackage.pky) r0
            goto L33
        L23:
            java.lang.String r4 = r3.d
            r2 = 2
            r3.a = r2
            ppe r1 = r1.b
            java.lang.Object r4 = r1.d(r4, r3)
            if (r4 == r0) goto L33
        L30:
            r0 = r4
            pky r0 = (defpackage.pky) r0
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
