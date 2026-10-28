package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dmr extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmr(awqg awqgVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awqgVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [awzd, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            dmr dmrVar = new dmr((awqg) this.b, awoqVar, 0);
            dmrVar.c = obj;
            return dmrVar;
        }
        if (i == 1) {
            dmr dmrVar2 = new dmr((awqk) this.b, awoqVar, 1);
            dmrVar2.c = obj;
            return dmrVar2;
        }
        if (i == 2) {
            dmr dmrVar3 = new dmr((awqk) this.b, awoqVar, 2, (byte[]) null);
            dmrVar3.c = obj;
            return dmrVar3;
        }
        if (i == 3) {
            dmr dmrVar4 = new dmr((awqk) this.b, awoqVar, 3, (char[]) null);
            dmrVar4.c = obj;
            return dmrVar4;
        }
        if (i != 4) {
            dmr dmrVar5 = new dmr((awzd) this.b, awoqVar, 5);
            dmrVar5.c = obj;
            return dmrVar5;
        }
        dmr dmrVar6 = new dmr((axbj) this.b, awoqVar, 4);
        dmrVar6.c = obj;
        return dmrVar6;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((dmr) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 1) {
            return ((dmr) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 2) {
            return ((dmr) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i == 3) {
            return ((dmr) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 4) {
            return ((dmr) create(obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((dmr) create((awzd) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        if (r2.emit(r5, r4) != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (((defpackage.axbj) r2).c(r5, r4) != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r2.invoke(r5, r4) != r0) goto L26;
     */
    /* JADX WARN: Type inference failed for: r2v14, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [awqg, java.lang.Object] */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            int r0 = r4.$cid
            r1 = 1
            if (r0 == 0) goto L95
            if (r0 == r1) goto L76
            r2 = 2
            if (r0 == r2) goto L5e
            r2 = 3
            if (r0 == r2) goto L44
            r2 = 4
            if (r0 == r2) goto L28
            awox r0 = defpackage.awox.a
            int r2 = r4.a
            defpackage.atqp.j(r5)
            if (r2 != 0) goto L25
            java.lang.Object r5 = r4.c
            java.lang.Object r2 = r4.b
            r4.a = r1
            java.lang.Object r4 = r2.emit(r5, r4)
            if (r4 == r0) goto Lb8
        L25:
            awmy r5 = defpackage.awmy.a
            return r5
        L28:
            awox r0 = defpackage.awox.a
            int r2 = r4.a
            defpackage.atqp.j(r5)
            if (r2 != 0) goto L41
            java.lang.Object r5 = r4.c
            awzd r5 = (defpackage.awzd) r5
            java.lang.Object r2 = r4.b
            r4.a = r1
            axbj r2 = (defpackage.axbj) r2
            java.lang.Object r4 = r2.c(r5, r4)
            if (r4 == r0) goto Lb8
        L41:
            awmy r5 = defpackage.awmy.a
            goto Lb9
        L44:
            awox r0 = defpackage.awox.a
            int r2 = r4.a
            defpackage.atqp.j(r5)
            if (r2 != 0) goto L5b
            java.lang.Object r5 = r4.c
            awut r5 = (defpackage.awut) r5
            java.lang.Object r2 = r4.b
            r4.a = r1
            java.lang.Object r4 = r2.invoke(r5, r4)
            if (r4 == r0) goto Lb8
        L5b:
            awmy r5 = defpackage.awmy.a
            goto Lb9
        L5e:
            awox r0 = defpackage.awox.a
            int r2 = r4.a
            defpackage.atqp.j(r5)
            if (r2 != 0) goto Lb9
            java.lang.Object r5 = r4.c
            awut r5 = (defpackage.awut) r5
            java.lang.Object r2 = r4.b
            r4.a = r1
            java.lang.Object r5 = r2.invoke(r5, r4)
            if (r5 != r0) goto Lb9
            goto Lb8
        L76:
            java.lang.Object r0 = r4.c
            awut r0 = (defpackage.awut) r0
            awox r2 = defpackage.awox.a
            int r3 = r4.a
            defpackage.atqp.j(r5)
            if (r3 != 0) goto L92
            java.lang.Object r5 = r4.b
            r3 = 0
            r4.c = r3
            r4.a = r1
            java.lang.Object r4 = r5.invoke(r0, r4)
            if (r4 != r2) goto L92
            r5 = r2
            goto Lb9
        L92:
            awmy r5 = defpackage.awmy.a
            goto Lb9
        L95:
            awox r0 = defpackage.awox.a
            int r2 = r4.a
            defpackage.atqp.j(r5)
            if (r2 != 0) goto Lb9
            java.lang.Object r5 = r4.c
            awut r5 = (defpackage.awut) r5
            awou r5 = r5.b()
            ahx r2 = defpackage.dmx.b
            awos r5 = r5.get(r2)
            if (r5 == 0) goto Lba
            java.lang.Object r5 = r4.b
            r4.a = r1
            java.lang.Object r5 = r5.invoke(r4)
            if (r5 != r0) goto Lb9
        Lb8:
            r5 = r0
        Lb9:
            return r5
        Lba:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Expected a TransactionElement in the CoroutineContext but none was found."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmr(awqk awqkVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awqkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmr(awqk awqkVar, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awqkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmr(awqk awqkVar, awoq awoqVar, int i, char[] cArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awqkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmr(awzd awzdVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awzdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmr(axbj axbjVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = axbjVar;
    }
}
