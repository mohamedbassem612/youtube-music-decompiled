package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avsw extends awjm implements avok {
    final avnn a;
    final avng b;
    Object c;
    boolean d;

    public avsw(axsp axspVar, avnn avnnVar, avng avngVar) {
        super(axspVar);
        this.a = avnnVar;
        this.b = avngVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 != false) goto L11;
     */
    @Override // defpackage.avok
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r4.h
            if (r0 != 0) goto L25
            int r0 = r4.i
            r1 = 1
            if (r0 == 0) goto Lf
            axsp r4 = r4.e
            r4.kk(r5)
            goto L35
        Lf:
            avnn r0 = r4.a     // Catch: java.lang.Throwable -> L31
            java.lang.Object r0 = r0.a(r5)     // Catch: java.lang.Throwable -> L31
            boolean r2 = r4.d     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L27
            avng r2 = r4.b     // Catch: java.lang.Throwable -> L31
            java.lang.Object r3 = r4.c     // Catch: java.lang.Throwable -> L31
            boolean r2 = r2.a(r3, r0)     // Catch: java.lang.Throwable -> L31
            r4.c = r0     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L2b
        L25:
            r1 = 0
            goto L35
        L27:
            r4.d = r1     // Catch: java.lang.Throwable -> L31
            r4.c = r0     // Catch: java.lang.Throwable -> L31
        L2b:
            axsp r4 = r4.e
            r4.kk(r5)
            goto L35
        L31:
            r5 = move-exception
            r4.g(r5)
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avsw.d(java.lang.Object):boolean");
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (d(obj)) {
            return;
        }
        this.f.ko(1L);
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        return f(i);
    }

    @Override // defpackage.avot
    public final Object km() {
        while (true) {
            Object objKm = this.g.km();
            if (objKm == null) {
                return null;
            }
            Object objA = this.a.a(objKm);
            if (!this.d) {
                this.d = true;
                this.c = objA;
                return objKm;
            }
            boolean zA = this.b.a(this.c, objA);
            this.c = objA;
            if (!zA) {
                return objKm;
            }
            if (this.i != 1) {
                this.f.ko(1L);
            }
        }
    }
}
