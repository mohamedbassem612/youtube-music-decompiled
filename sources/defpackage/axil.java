package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axil implements axir {
    private final axih a;
    private final axig b;
    private axio c;
    private int d;
    private boolean e;
    private long f;

    public axil(axih axihVar) {
        this.a = axihVar;
        axig axigVar = ((axin) axihVar).b;
        this.b = axigVar;
        axio axioVar = axigVar.a;
        this.c = axioVar;
        this.d = axioVar != null ? axioVar.b : -1;
    }

    @Override // defpackage.axir, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r11 != r12.b) goto L10;
     */
    @Override // defpackage.axir
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(defpackage.axig r10, long r11) {
        /*
            r9 = this;
            boolean r11 = r9.e
            if (r11 != 0) goto Lb6
            axio r11 = r9.c
            if (r11 == 0) goto L1f
            axig r12 = r9.b
            axio r12 = r12.a
            if (r11 != r12) goto L17
            int r11 = r9.d
            r12.getClass()
            int r12 = r12.b
            if (r11 == r12) goto L1f
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L1f:
            axih r11 = r9.a
            long r0 = r9.f
            r2 = 1
            long r0 = r0 + r2
            boolean r11 = r11.l(r0)
            if (r11 != 0) goto L2f
            r9 = -1
            return r9
        L2f:
            axio r11 = r9.c
            if (r11 != 0) goto L3f
            axig r11 = r9.b
            axio r11 = r11.a
            if (r11 == 0) goto L3f
            r9.c = r11
            int r11 = r11.b
            r9.d = r11
        L3f:
            axig r11 = r9.b
            long r0 = r11.b
            long r2 = r9.f
            long r0 = r0 - r2
            r2 = 8192(0x2000, double:4.0474E-320)
            long r4 = java.lang.Math.min(r2, r0)
            long r2 = r9.f
            long r0 = r11.b
            org.chromium.base.AndroidInfo.c(r0, r2, r4)
            r0 = 0
            int r12 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r12 == 0) goto Laf
            long r6 = r10.b
            long r6 = r6 + r4
            r10.b = r6
            axio r11 = r11.a
        L60:
            r11.getClass()
            int r12 = r11.c
            int r6 = r11.b
            int r12 = r12 - r6
            long r6 = (long) r12
            int r12 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r12 < 0) goto L71
            axio r11 = r11.f
            long r2 = r2 - r6
            goto L60
        L71:
            r6 = r4
        L72:
            int r12 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r12 <= 0) goto Laf
            r11.getClass()
            axio r12 = r11.b()
            int r8 = r12.b
            int r2 = (int) r2
            int r8 = r8 + r2
            r12.b = r8
            int r2 = r12.c
            int r3 = (int) r6
            int r8 = r8 + r3
            int r2 = java.lang.Math.min(r8, r2)
            r12.c = r2
            axio r2 = r10.a
            if (r2 != 0) goto L9c
            r12.g = r12
            axio r2 = r12.g
            r12.f = r2
            axio r2 = r12.f
            r10.a = r2
            goto La4
        L9c:
            axio r2 = r2.g
            r2.getClass()
            r2.d(r12)
        La4:
            int r2 = r12.c
            int r12 = r12.b
            int r2 = r2 - r12
            long r2 = (long) r2
            long r6 = r6 - r2
            axio r11 = r11.f
            r2 = r0
            goto L72
        Laf:
            long r10 = r9.f
            long r10 = r10 + r4
            r9.f = r10
            r9 = r4
            return r9
        Lb6:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axil.e(axig, long):long");
    }
}
