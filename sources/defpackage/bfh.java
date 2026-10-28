package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bfh extends awpk implements awqg {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfh(awqk awqkVar, bdw bdwVar, awoq awoqVar, int i) {
        super(1, awoqVar);
        this.$cid = i;
        this.b = awqkVar;
        this.c = bdwVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [awqk, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            return new bfh((awqk) this.b, (bdw) this.c, awoqVar, 0);
        }
        if (i != 1) {
            return new bfh((bfp) this.c, (awqk) this.b, awoqVar, 2);
        }
        return new bfh((bgg) this.b, (bfp) this.c, awoqVar, 1);
    }

    @Override // defpackage.awqg
    public final /* synthetic */ Object invoke(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return ((bfh) create((awoq) obj)).invokeSuspend(awmy.a);
        }
        if (i != 1) {
            return ((bfh) create((awoq) obj)).invokeSuspend(awmy.a);
        }
        return ((bfh) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r8 != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (r8 != r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [bec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [awqk, java.lang.Object] */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = r7.$cid
            r1 = 1
            if (r0 == 0) goto L93
            r2 = 2
            r3 = 0
            if (r0 == r1) goto L46
            awox r0 = defpackage.awox.a
            int r4 = r7.a
            defpackage.atqp.j(r8)
            if (r4 == 0) goto L15
            if (r4 == r1) goto L18
            return r8
        L15:
            r7.a = r1
            r8 = r3
        L18:
            dqy r8 = (defpackage.dqy) r8
            awou r1 = r7.getContext()
            ahx r4 = defpackage.ahx.b
            awos r1 = r1.get(r4)
            bgp r1 = (defpackage.bgp) r1
            if (r1 == 0) goto L2d
            java.lang.Object r4 = r7.c
            r1.a(r4)
        L2d:
            java.lang.Object r4 = r7.c
            bgp r5 = new bgp
            bfp r4 = (defpackage.bfp) r4
            r5.<init>(r1, r4)
            java.lang.Object r1 = r7.b
            bfl r6 = new bfl
            r6.<init>(r4, r1, r8, r3)
            r7.a = r2
            java.lang.Object r8 = defpackage.awro.p(r5, r6, r7)
            if (r8 != r0) goto Lad
            goto Lac
        L46:
            awox r0 = defpackage.awox.a
            int r4 = r7.a
            defpackage.atqp.j(r8)
            if (r4 == 0) goto L52
            if (r4 == r1) goto L86
            goto L7a
        L52:
            java.lang.Object r8 = r7.c
            bej r4 = new bej
            bfp r8 = (defpackage.bfp) r8
            r4.<init>(r8, r3, r1, r3)
            java.lang.Object r5 = r7.b
            bgg r5 = (defpackage.bgg) r5
            java.util.List r6 = r5.b
            if (r6 == 0) goto L7d
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L7d
            ayq r1 = r8.n()
            beg r6 = new beg
            r6.<init>(r8, r4, r5, r3)
            r7.a = r2
            java.lang.Object r8 = r1.f(r6, r7)
            if (r8 == r0) goto Lac
        L7a:
            bdw r8 = (defpackage.bdw) r8
            goto L88
        L7d:
            r7.a = r1
            r1 = 0
            java.lang.Object r8 = r8.h(r1, r4, r7)
            if (r8 == r0) goto Lac
        L86:
            bdw r8 = (defpackage.bdw) r8
        L88:
            java.lang.Object r7 = r7.c
            bfp r7 = (defpackage.bfp) r7
            ci r7 = r7.g
            bgk r8 = r7.i(r8)
            goto Lad
        L93:
            awox r0 = defpackage.awox.a
            int r2 = r7.a
            defpackage.atqp.j(r8)
            if (r2 != 0) goto Lad
            java.lang.Object r8 = r7.b
            java.lang.Object r2 = r7.c
            r7.a = r1
            bdw r2 = (defpackage.bdw) r2
            java.lang.Object r1 = r2.a
            java.lang.Object r8 = r8.invoke(r1, r7)
            if (r8 != r0) goto Lad
        Lac:
            r8 = r0
        Lad:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfh(bfp bfpVar, awqk awqkVar, awoq awoqVar, int i) {
        super(1, awoqVar);
        this.$cid = i;
        this.c = bfpVar;
        this.b = awqkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfh(bgg bggVar, bfp bfpVar, awoq awoqVar, int i) {
        super(1, awoqVar);
        this.$cid = i;
        this.b = bggVar;
        this.c = bfpVar;
    }
}
