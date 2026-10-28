package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class prc implements ppw {
    public final long a;
    private final awmd b;
    private final pls c;
    private final ppy d;
    private final String e;
    private final omm f;

    static {
        agsn.h("GnpSdk");
    }

    public prc(awmd awmdVar, pls plsVar, omm ommVar, ppy ppyVar) {
        plsVar.getClass();
        ommVar.getClass();
        ppyVar.getClass();
        this.b = awmdVar;
        this.c = plsVar;
        this.f = ommVar;
        this.d = ppyVar;
        this.e = "GNP_PERIODIC_REGISTRATION";
        this.a = ((long) (plsVar.j * 86400)) * 1000;
    }

    @Override // defpackage.ppw
    public final int a() {
        return 17;
    }

    @Override // defpackage.ppw
    public final long b() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r5.a(17, null, null, r6) != r0) goto L29;
     */
    @Override // defpackage.ppw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.os.Bundle r6, defpackage.awoq r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r6 = r7 instanceof defpackage.prb
            if (r6 == 0) goto L13
            r6 = r7
            prb r6 = (defpackage.prb) r6
            int r0 = r6.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.c = r0
            goto L18
        L13:
            prb r6 = new prb
            r6.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r6.a
            awox r0 = defpackage.awox.a
            int r1 = r6.c
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            defpackage.atqp.j(r7)
            goto L80
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.atqp.j(r7)
            goto L77
        L39:
            defpackage.atqp.j(r7)
            goto L4a
        L3d:
            defpackage.atqp.j(r7)
            omm r7 = r5.f
            r6.c = r4
            java.lang.Object r7 = r7.k(r6)
            if (r7 == r0) goto L7f
        L4a:
            pqk r1 = defpackage.pqk.GNP
            r4 = 0
            if (r7 != r1) goto L6b
            pls r7 = r5.c
            int r7 = r7.j
            if (r7 == 0) goto L6b
            awmd r5 = r5.b
            java.lang.Object r5 = r5.io()
            r5.getClass()
            pxv r5 = (defpackage.pxv) r5
            aier r7 = defpackage.aier.PERIODIC_REGISTRATION
            r6.c = r2
            java.lang.Object r7 = r5.a(r7, r4, r6)
            if (r7 != r0) goto L80
            goto L7f
        L6b:
            ppy r5 = r5.d
            r6.c = r3
            r7 = 17
            java.lang.Object r5 = r5.a(r7, r4, r4, r6)
            if (r5 == r0) goto L7f
        L77:
            pla r7 = new pla
            awmy r5 = defpackage.awmy.a
            r7.<init>(r5)
            goto L80
        L7f:
            r7 = r0
        L80:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prc.c(android.os.Bundle, awoq):java.lang.Object");
    }

    @Override // defpackage.ppw
    public final String d() {
        return this.e;
    }

    @Override // defpackage.ppw
    public final boolean e() {
        return true;
    }

    @Override // defpackage.ppw
    public final /* synthetic */ int f() {
        return 3;
    }

    @Override // defpackage.ppw
    public final int g() {
        return 1;
    }

    @Override // defpackage.ppw
    public final void h() {
    }

    @Override // defpackage.ppw
    public final void i() {
    }
}
