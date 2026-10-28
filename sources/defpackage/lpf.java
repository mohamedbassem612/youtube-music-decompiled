package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lpf extends lpa {
    public boolean b;
    public volatile boolean c;
    public Exception d;
    private Object f;
    public final Object a = new Object();
    public final abhi e = new abhi((char[]) null);

    private final void w() {
        if (!this.b) {
            throw new IllegalStateException("Task is not yet complete");
        }
    }

    private final void x() {
        if (this.c) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void y() {
        String strConcat;
        if (this.b) {
            if (!i()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excE = e();
            if (excE != null) {
                strConcat = "failure";
            } else if (j()) {
                strConcat = "result ".concat(String.valueOf(String.valueOf(f())));
            } else {
                strConcat = this.c ? "cancellation" : "unknown issue";
            }
        }
    }

    @Override // defpackage.lpa
    public final lpa a(Executor executor, loo looVar) {
        lpf lpfVar = new lpf();
        this.e.g(new lop(executor, looVar, lpfVar));
        r();
        return lpfVar;
    }

    @Override // defpackage.lpa
    public final lpa b(Executor executor, loo looVar) {
        lpf lpfVar = new lpf();
        this.e.g(new lox(executor, looVar, lpfVar, 1));
        r();
        return lpfVar;
    }

    @Override // defpackage.lpa
    public final lpa c(loz lozVar) {
        return d(lpd.a, lozVar);
    }

    @Override // defpackage.lpa
    public final lpa d(Executor executor, loz lozVar) {
        lpf lpfVar = new lpf();
        this.e.g(new lox(executor, lozVar, lpfVar, 0));
        r();
        return lpfVar;
    }

    @Override // defpackage.lpa
    public final Exception e() {
        Exception exc;
        synchronized (this.a) {
            exc = this.d;
        }
        return exc;
    }

    @Override // defpackage.lpa
    public final Object f() {
        Object obj;
        synchronized (this.a) {
            w();
            x();
            Exception exc = this.d;
            if (exc != null) {
                throw new loy(exc);
            }
            obj = this.f;
        }
        return obj;
    }

    @Override // defpackage.lpa
    public final Object g(Class cls) {
        Object obj;
        synchronized (this.a) {
            w();
            x();
            boolean zIsInstance = cls.isInstance(this.d);
            Exception exc = this.d;
            if (zIsInstance) {
                throw ((Throwable) cls.cast(exc));
            }
            if (exc != null) {
                throw new loy(exc);
            }
            obj = this.f;
        }
        return obj;
    }

    @Override // defpackage.lpa
    public final boolean h() {
        return this.c;
    }

    @Override // defpackage.lpa
    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    @Override // defpackage.lpa
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.b && !this.c && this.d == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.lpa
    public final void k(Executor executor, los losVar) {
        this.e.g(new lor(losVar));
        r();
    }

    @Override // defpackage.lpa
    public final void l(Executor executor, lot lotVar) {
        this.e.g(new lou(executor, lotVar, 1));
        r();
    }

    @Override // defpackage.lpa
    public final void m(Executor executor, lov lovVar) {
        this.e.g(new lou(executor, lovVar, 0));
        r();
    }

    @Override // defpackage.lpa
    public final void n(Executor executor, low lowVar) {
        this.e.g(new lou(executor, lowVar, 2));
        r();
    }

    @Override // defpackage.lpa
    public final void o(lot lotVar) {
        l(lpd.a, lotVar);
    }

    @Override // defpackage.lpa
    public final void p(lov lovVar) {
        m(lpd.a, lovVar);
    }

    @Override // defpackage.lpa
    public final void q(low lowVar) {
        n(lpd.a, lowVar);
    }

    public final void r() {
        synchronized (this.a) {
            if (this.b) {
                this.e.h(this);
            }
        }
    }

    public final void s(Exception exc) {
        if (exc == null) {
            throw new NullPointerException("Exception must not be null");
        }
        synchronized (this.a) {
            y();
            this.b = true;
            this.d = exc;
        }
        this.e.h(this);
    }

    public final void t(Object obj) {
        synchronized (this.a) {
            y();
            this.b = true;
            this.f = obj;
        }
        this.e.h(this);
    }

    public final boolean u(Object obj) {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.f = obj;
            this.e.h(this);
            return true;
        }
    }

    public final void v() {
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.c = true;
            this.e.h(this);
        }
    }
}
