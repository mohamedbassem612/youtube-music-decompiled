package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adpo extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    Object a;
    int b;
    final /* synthetic */ awrm c;
    final /* synthetic */ awrm d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpo(awrm awrmVar, awrm awrmVar2, adpi adpiVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = awrmVar;
        this.d = awrmVar2;
        this.e = adpiVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return this.$cid != 0 ? new adpo(this.c, this.d, (adpi) this.e, awoqVar, 1) : new adpo(this.c, this.d, (adps) this.e, awoqVar, 0);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((adpo) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((adpo) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:40:0x007f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // defpackage.awpe
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.$cid
            r1 = 1
            if (r0 == 0) goto L66
            awox r0 = defpackage.awox.a
            int r2 = r3.b
            if (r2 == 0) goto L11
            java.lang.Object r2 = r3.a
            defpackage.atqp.j(r4)     // Catch: java.lang.Exception -> L1e
            goto L1e
        L11:
            defpackage.atqp.j(r4)
            awrm r4 = r3.c
            java.lang.Object r4 = r4.a
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r2 = r4.iterator()
        L1e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L35
            java.lang.Object r4 = r2.next()
            awwd r4 = (defpackage.awwd) r4
            r3.a = r2     // Catch: java.lang.Exception -> L1e
            r3.b = r1     // Catch: java.lang.Exception -> L1e
            java.lang.Object r4 = r4.l(r3)     // Catch: java.lang.Exception -> L1e
            if (r4 != r0) goto L1e
            return r0
        L35:
            awrm r4 = r3.d
            java.lang.Object r4 = r4.a
            java.util.Map r4 = (java.util.Map) r4
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L43:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            app.rive.FontAsset r0 = (app.rive.FontAsset) r0
            java.lang.Object r2 = r3.e
            adpi r2 = (defpackage.adpi) r2
            r2.e(r1, r0)
            goto L43
        L63:
            awmy r0 = defpackage.awmy.a
            goto Lb7
        L66:
            awox r0 = defpackage.awox.a
            int r2 = r3.b
            if (r2 == 0) goto L72
            java.lang.Object r2 = r3.a
            defpackage.atqp.j(r4)     // Catch: java.lang.Exception -> L7f
            goto L7f
        L72:
            defpackage.atqp.j(r4)
            awrm r4 = r3.c
            java.lang.Object r4 = r4.a
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r2 = r4.iterator()
        L7f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L96
            java.lang.Object r4 = r2.next()
            awwd r4 = (defpackage.awwd) r4
            r3.a = r2     // Catch: java.lang.Exception -> L7f
            r3.b = r1     // Catch: java.lang.Exception -> L7f
            java.lang.Object r4 = r4.l(r3)     // Catch: java.lang.Exception -> L7f
            if (r4 != r0) goto L7f
            goto Lb7
        L96:
            awrm r4 = r3.d
            java.lang.Object r4 = r4.a
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        La0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lb4
            java.lang.Object r0 = r4.next()
            java.lang.AutoCloseable r0 = (java.lang.AutoCloseable) r0
            java.lang.Object r1 = r3.e
            adps r1 = (defpackage.adps) r1
            r1.d(r0)
            goto La0
        Lb4:
            awmy r3 = defpackage.awmy.a
            r0 = r3
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adpo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpo(awrm awrmVar, awrm awrmVar2, adps adpsVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = awrmVar;
        this.d = awrmVar2;
        this.e = adpsVar;
    }
}
