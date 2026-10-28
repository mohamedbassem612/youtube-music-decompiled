package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class avub extends awjv {
    private static final long serialVersionUID = -2252972430506210021L;
    Iterator a;
    volatile boolean b;
    boolean c;

    public avub(Iterator it) {
        this.a = it;
    }

    @Override // defpackage.avot
    public final void c() {
        this.a = null;
    }

    public abstract void d();

    public abstract void f(long j);

    @Override // defpackage.avot
    public final boolean i() {
        Iterator it = this.a;
        return it == null || !it.hasNext();
    }

    @Override // defpackage.axsq
    public final void kj() {
        this.b = true;
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        return i & 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r0.hasNext() == false) goto L9;
     */
    @Override // defpackage.avot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object km() {
        /*
            r2 = this;
            java.util.Iterator r0 = r2.a
            if (r0 == 0) goto L12
            boolean r1 = r2.c
            if (r1 != 0) goto Lc
            r0 = 1
            r2.c = r0
            goto L14
        Lc:
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L14
        L12:
            r2 = 0
            goto L1d
        L14:
            java.util.Iterator r2 = r2.a
            java.lang.Object r2 = r2.next()
            r2.getClass()
        L1d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avub.km():java.lang.Object");
    }

    @Override // defpackage.axsq
    public final void ko(long j) {
        if (awka.h(j) && atqp.B(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                d();
            } else {
                f(j);
            }
        }
    }
}
