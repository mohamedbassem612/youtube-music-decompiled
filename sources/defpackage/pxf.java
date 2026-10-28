package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pxf extends awpk implements awqk {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ pxg c;
    final /* synthetic */ String d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxf(String str, pxg pxgVar, String str2, int i, int i2, awoq awoqVar) {
        super(2, awoqVar);
        this.b = str;
        this.c = pxgVar;
        this.d = str2;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new pxf(this.b, this.c, this.d, this.e, this.f, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((pxf) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return new defpackage.pkv(new java.lang.IllegalArgumentException("HTTP Scheme not supported for URL: ".concat(java.lang.String.valueOf(r6))), defpackage.pkx.w);
     */
    @Override // defpackage.awpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            awox r0 = defpackage.awox.a
            int r1 = r5.a
            defpackage.atqp.j(r6)
            if (r1 != 0) goto L89
            java.lang.String r6 = r5.b
            android.net.Uri r1 = android.net.Uri.parse(r6)
            r1.getClass()
            java.lang.String r2 = r1.getScheme()
            if (r2 == 0) goto L76
            int r3 = r2.hashCode()
            r4 = -368816979(0xffffffffea044cad, float:-3.9985075E25)
            if (r3 == r4) goto L53
            r1 = 3143036(0x2ff57c, float:4.404332E-39)
            if (r3 == r1) goto L34
            r1 = 951530617(0x38b73479, float:8.735894E-5)
            if (r3 != r1) goto L76
            java.lang.String r1 = "content"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L76
            goto L3c
        L34:
            java.lang.String r1 = "file"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L76
        L3c:
            java.lang.String r5 = java.lang.String.valueOf(r6)
            pkv r0 = new pkv
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "HTTP Scheme not supported for URL: "
            java.lang.String r5 = r1.concat(r5)
            r6.<init>(r5)
            pkx r5 = defpackage.pkx.w
            r0.<init>(r6, r5)
            goto L8c
        L53:
            java.lang.String r6 = "android.resource"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L76
            pxg r5 = r5.c
            pkx r6 = defpackage.pkx.w
            android.content.Context r5 = r5.a     // Catch: java.lang.Exception -> L6f
            java.io.InputStream r5 = defpackage.qol.b(r5, r1)     // Catch: java.lang.Exception -> L6f
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch: java.lang.Exception -> L6f
            pla r0 = new pla     // Catch: java.lang.Exception -> L6f
            r0.<init>(r5)     // Catch: java.lang.Exception -> L6f
            goto L8c
        L6f:
            r5 = move-exception
            pkv r0 = new pkv
            r0.<init>(r5, r6)
            goto L8c
        L76:
            pxg r6 = r5.c
            java.lang.String r1 = r5.b
            int r2 = r5.e
            int r3 = r5.f
            r4 = 1
            r5.a = r4
            pxd r6 = r6.b
            java.lang.Object r6 = r6.a(r1, r2, r3, r5)
            if (r6 == r0) goto L8c
        L89:
            r0 = r6
            pky r0 = (defpackage.pky) r0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
