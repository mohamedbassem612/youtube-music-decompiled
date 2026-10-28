package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tjb implements tjk {
    final /* synthetic */ tjk a;
    final /* synthetic */ tjc b;
    final /* synthetic */ tjd c;
    private boolean d;

    public tjb(tjk tjkVar, tjc tjcVar, tjd tjdVar) {
        this.a = tjkVar;
        this.b = tjcVar;
        this.c = tjdVar;
    }

    @Override // defpackage.tjk
    public final void a() {
        this.a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if ((r7.getCause() instanceof java.util.concurrent.CancellationException) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r0.b(r1.b, r6.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        if (r2.a(r4, r3.c(r5, r4), r7) != false) goto L13;
     */
    @Override // defpackage.tjk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Throwable r7) {
        /*
            r6 = this;
            boolean r0 = r6.d
            if (r0 != 0) goto L43
            tjc r0 = r6.b
            tjd r1 = r6.c
            aunn r2 = r1.a
            java.lang.Object r2 = r2.io()
            r2.getClass()
            tjl r2 = (defpackage.tjl) r2
            tjd r3 = r0.b
            boolean r4 = r3.d
            if (r4 == 0) goto L2f
            tns r4 = r0.a
            tjj r3 = r3.c
            java.lang.String r5 = r4.q()
            r5.getClass()
            java.util.List r3 = r3.c(r5, r4)
            boolean r2 = r2.a(r4, r3, r7)
            if (r2 == 0) goto L43
            goto L3b
        L2f:
            boolean r2 = r7 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L43
            java.lang.Throwable r2 = r7.getCause()
            boolean r2 = r2 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L43
        L3b:
            tjl r7 = r1.b
            tjk r6 = r6.a
            r0.b(r7, r6)
            goto L48
        L43:
            tjk r6 = r6.a
            r6.b(r7)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tjb.b(java.lang.Throwable):void");
    }

    @Override // defpackage.tjk
    public final void c(tnm tnmVar) {
        this.d = true;
        this.a.c(tnmVar);
    }
}
