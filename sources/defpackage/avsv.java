package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avsv extends awjl {
    final avnn a;
    final avng b;
    Object c;
    boolean d;

    public avsv(avok avokVar, avnn avnnVar, avng avngVar) {
        super(avokVar);
        this.a = avnnVar;
        this.b = avngVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r2 != false) goto L12;
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
            if (r0 != 0) goto L26
            int r0 = r4.i
            if (r0 == 0) goto Lf
            avok r4 = r4.e
            boolean r4 = r4.d(r5)
            goto L38
        Lf:
            r0 = 1
            avnn r1 = r4.a     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r1.a(r5)     // Catch: java.lang.Throwable -> L33
            boolean r2 = r4.d     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L28
            avng r2 = r4.b     // Catch: java.lang.Throwable -> L33
            java.lang.Object r3 = r4.c     // Catch: java.lang.Throwable -> L33
            boolean r2 = r2.a(r3, r1)     // Catch: java.lang.Throwable -> L33
            r4.c = r1     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L2c
        L26:
            r4 = 0
            goto L38
        L28:
            r4.d = r0     // Catch: java.lang.Throwable -> L33
            r4.c = r1     // Catch: java.lang.Throwable -> L33
        L2c:
            avok r4 = r4.e
            r4.kk(r5)
        L31:
            r4 = r0
            goto L38
        L33:
            r5 = move-exception
            r4.g(r5)
            goto L31
        L38:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avsv.d(java.lang.Object):boolean");
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
