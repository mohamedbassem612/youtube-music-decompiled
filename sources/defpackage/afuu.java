package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afuu implements Runnable, afvx {
    public afvl a;
    private afvl b;
    private final boolean c = qpj.h(Thread.currentThread());
    private boolean d;
    private boolean e;
    private boolean f;

    public afuu(afvl afvlVar, boolean z) {
        this.f = false;
        this.a = afvlVar;
        this.b = afvlVar;
        this.f = z;
    }

    private final void b() {
        this.d = true;
        this.a.o(this.c && !this.e && qpj.h(Thread.currentThread()));
        this.a = null;
    }

    @Override // defpackage.afvx
    public final void a(ListenableFuture listenableFuture) {
        if (this.d) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.e) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.e = true;
        this.a.p(3);
        listenableFuture.addListener(this, MoreExecutors.directExecutor());
    }

    @Override // defpackage.afvn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        afvl afvlVar = this.b;
        try {
            this.b = null;
            if (!this.e) {
                if (this.d) {
                    throw new IllegalStateException("Span was already closed!");
                }
                b();
            }
            if (afvlVar != null) {
                afvlVar.close();
            }
            if (this.f) {
                afty.e((afvh) afty.d.get(), afur.a);
            }
        } catch (Throwable th) {
            if (afvlVar != null) {
                try {
                    afvlVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.d && this.e) {
            b();
        } else {
            qpj.a().post(new aeia(9));
        }
    }
}
