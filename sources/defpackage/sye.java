package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class sye {
    private int a = 0;

    private final boolean j(int i) {
        int i2 = this.a;
        if ((i2 & i) == i) {
            return false;
        }
        this.a = i2 | i;
        return true;
    }

    @Deprecated
    protected void a() {
        b();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0016 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void b() {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 4
            boolean r0 = r1.j(r0)     // Catch: java.lang.RuntimeException -> L12 java.lang.Throwable -> L16
            if (r0 == 0) goto L10
            r1.g()     // Catch: java.lang.RuntimeException -> L12 java.lang.Throwable -> L16
            r1.e()     // Catch: java.lang.RuntimeException -> L12 java.lang.Throwable -> L16
            monitor-exit(r1)
            goto L11
        L10:
            monitor-exit(r1)
        L11:
            return
        L12:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L16
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r0
        L16:
            r0 = move-exception
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sye.b():void");
    }

    public final synchronized void f() {
        try {
            if (j(1)) {
                c();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0016 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g() {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 2
            boolean r0 = r1.j(r0)     // Catch: java.lang.RuntimeException -> L12 java.lang.Throwable -> L16
            if (r0 == 0) goto L10
            r1.f()     // Catch: java.lang.RuntimeException -> L12 java.lang.Throwable -> L16
            r1.d()     // Catch: java.lang.RuntimeException -> L12 java.lang.Throwable -> L16
            monitor-exit(r1)
            goto L11
        L10:
            monitor-exit(r1)
        L11:
            return
        L12:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L16
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r0
        L16:
            r0 = move-exception
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sye.g():void");
    }

    public final synchronized void h() {
        if (this.a != 7) {
            try {
                a();
            } catch (Throwable unused) {
            }
            this.a = 7;
        }
    }

    public final synchronized void i() {
        h();
    }

    protected void c() {
    }

    protected void d() {
    }

    protected void e() {
    }
}
