package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rde {
    public final Object b = new Object();
    public boolean c = false;
    public boolean d = false;
    private final zhk f = new zhk(null, null);
    private static final rbm e = rbm.c(rde.class);
    public static final Duration a = Duration.ofSeconds(1);

    public final void a() {
        synchronized (this.b) {
            this.c = false;
            b();
        }
    }

    public final void b() {
        if (this.c || this.d) {
            this.f.h();
        } else {
            this.f.f();
        }
    }

    public final void c() {
        Duration duration = a;
        if (this.f.d(duration.toMillis())) {
            return;
        }
        rbc rbcVar = new rbc(e, rbd.c);
        rbcVar.c();
        rbcVar.a("It took more than %s to render a frame, not waiting for it.", duration);
    }

    public final boolean d() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (!this.c && !this.d) {
                z = false;
            }
        }
        return z;
    }
}
