package defpackage;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fea implements Future, feb, fem {
    private Object a;
    private fdx b;
    private boolean c;
    private boolean d;
    private boolean e;
    private ewb f;

    private final synchronized Object i(Long l) {
        if (!isDone()) {
            ffs.f();
        }
        if (this.c) {
            throw new CancellationException();
        }
        if (this.e) {
            throw new ExecutionException(this.f);
        }
        if (!this.d) {
            if (l == null) {
                wait(0L);
            } else if (l.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    wait(jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.e) {
                throw new ExecutionException(this.f);
            }
            if (this.c) {
                throw new CancellationException();
            }
            if (!this.d) {
                throw new TimeoutException();
            }
        }
        return this.a;
    }

    @Override // defpackage.fem
    public final synchronized void a(Drawable drawable) {
    }

    @Override // defpackage.fem
    public final synchronized void b(Object obj, fev fevVar) {
    }

    @Override // defpackage.feb
    public final synchronized boolean c(ewb ewbVar, fem femVar) {
        this.e = true;
        this.f = ewbVar;
        notifyAll();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.c = true;
            notifyAll();
            fdx fdxVar = null;
            if (z) {
                fdx fdxVar2 = this.b;
                this.b = null;
                fdxVar = fdxVar2;
            }
            if (fdxVar != null) {
                fdxVar.c();
            }
            return true;
        }
    }

    @Override // defpackage.fem
    public final synchronized fdx d() {
        return this.b;
    }

    @Override // defpackage.fem
    public final synchronized void f(fdx fdxVar) {
        this.b = fdxVar;
    }

    @Override // defpackage.fem
    public final void g(fed fedVar) {
        fedVar.d(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.feb
    public final synchronized boolean gJ(Object obj, fem femVar, int i) {
        this.d = true;
        this.a = obj;
        notifyAll();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return i(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.c;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        return this.c || this.d || this.e;
    }

    public final String toString() {
        fdx fdxVar;
        String str;
        String strValueOf = String.valueOf(super.toString());
        synchronized (this) {
            fdxVar = null;
            if (this.c) {
                str = "CANCELLED";
            } else if (this.e) {
                str = "FAILURE";
            } else if (this.d) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                fdxVar = this.b;
            }
        }
        String strConcat = strValueOf.concat("[status=");
        if (fdxVar == null) {
            return strConcat + str + ']';
        }
        return strConcat + str + ", request=[" + fdxVar.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return i(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // defpackage.fcz
    public final void k() {
    }

    @Override // defpackage.fcz
    public final void l() {
    }

    @Override // defpackage.fcz
    public final void m() {
    }

    @Override // defpackage.fem
    public final void e(Drawable drawable) {
    }

    @Override // defpackage.fem
    public final void gG(Drawable drawable) {
    }

    @Override // defpackage.fem
    public final void h(fed fedVar) {
    }
}
