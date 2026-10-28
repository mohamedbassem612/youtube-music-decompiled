package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rgr implements rhd {
    public static final /* synthetic */ int b = 0;
    private static final rbm h = new rbm("rgr");
    public rgq a;
    private final Object c = new Object();
    private final Object d = new Object();
    private final rbn e = new rbn();
    private boolean f = false;
    private rft g;

    @Override // defpackage.rft
    public final void a(rfs rfsVar) {
        synchronized (this.c) {
            if (!rfsVar.B()) {
                this.e.d(rfsVar.j());
            }
            if (this.g == null) {
                new rbc(h, rbd.a).a("Trying to receive a frame without a consumer set!", new Object[0]);
                g(rfsVar);
                return;
            }
            synchronized (this.d) {
                if (this.f) {
                    g(rfsVar);
                    return;
                }
                try {
                    c(rfsVar);
                } catch (RuntimeException e) {
                    rbc rbcVar = new rbc(h, rbd.d);
                    rbcVar.a = e;
                    rbcVar.c();
                    rbcVar.a("Failed to process a frame within the processor.", new Object[0]);
                    g(rfsVar);
                }
            }
        }
    }

    @Override // defpackage.rfu
    public final void b(rft rftVar) {
        synchronized (this.c) {
            this.g = rftVar;
        }
    }

    protected abstract void c(rfs rfsVar);

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.d) {
            this.f = true;
        }
        synchronized (this.c) {
            this.g = null;
        }
    }

    protected final void d(boolean z) {
        rbn rbnVar = this.e;
        if (z) {
            rbnVar.b();
        } else {
            rbnVar.a();
        }
        rgq rgqVar = this.a;
        if (rgqVar != null) {
            rgqVar.a(z);
        }
    }

    protected void e(rfs rfsVar) {
        synchronized (this.c) {
            if (this.g == null) {
                new rbc(h, rbd.a).a("Trying to send a frame without a consumer set!", new Object[0]);
                g(rfsVar);
            } else {
                if (!rfsVar.B()) {
                    this.e.c();
                }
                this.g.a(rfsVar);
            }
        }
    }

    @Override // defpackage.rhd
    public final void f(Runnable runnable) {
        this.a = new rgt(runnable, 1);
    }

    public final void g(rfs rfsVar) {
        if (rfsVar.B()) {
            return;
        }
        rfsVar.release();
        d(false);
    }
}
