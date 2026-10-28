package defpackage;

import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rdj {
    private long a = 0;
    private long b = 0;
    private boolean c = false;
    private qxz d;

    private final void g() {
        if (this.c) {
            qxz qxzVar = this.d;
            if (qxzVar == null) {
                this.b = mbe.a() - this.a;
                return;
            }
            Optional optionalA = qxzVar.a();
            if (optionalA.isEmpty()) {
                return;
            }
            this.b = Math.max(this.b, ((Duration) optionalA.get()).toNanos());
            this.a = mbe.a() - this.b;
        }
    }

    public final synchronized Duration a() {
        g();
        return nrb.e(Duration.ofNanos(this.b));
    }

    public final synchronized void b(qxz qxzVar) {
        this.d = qxzVar;
    }

    public final synchronized void c(Duration duration) {
        this.b = duration.toNanos();
    }

    public final synchronized void d() {
        if (!this.c) {
            this.a = mbe.a() - this.b;
            this.c = true;
        }
    }

    public final synchronized void e() {
        if (this.c) {
            g();
            this.c = false;
        }
    }

    public final synchronized boolean f() {
        qxz qxzVar = this.d;
        return qxzVar != null && qxzVar.g();
    }
}
