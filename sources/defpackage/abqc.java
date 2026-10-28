package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abqc implements Runnable {
    private static final agrf m = agrf.h("com/google/android/libraries/youtube/player/net/RequestWatchAndPlaybackRunnable");
    public final abnl a;
    public final int b;
    public final String c;
    public final abqb d;
    public final ttm e;
    public final abmt f;
    public volatile boolean g;
    private final abor n;
    private final wjf o;
    private final boolean p;
    private final Handler q;
    private final long r;
    private final long s;
    private final abnp t;
    private final boolean u;
    private final avmb v;
    private final avmb w;
    private final ScheduledExecutorService x;
    public volatile boolean h = true;
    private volatile avmn y = null;
    private final avmm z = new avmm();
    private volatile ListenableFuture A = null;
    public volatile wgi i = null;
    public volatile Throwable j = null;
    private volatile ListenableFuture B = null;
    public volatile wjf k = null;
    private volatile Throwable C = null;
    final awlm l = new awlm();

    public abqc(abnl abnlVar, int i, abor aborVar, wjf wjfVar, String str, boolean z, Handler handler, long j, long j2, ttm ttmVar, abqb abqbVar, boolean z2, abnp abnpVar, avmb avmbVar, avmb avmbVar2, ScheduledExecutorService scheduledExecutorService, abmt abmtVar) {
        this.a = abnlVar;
        this.b = i;
        this.n = aborVar;
        this.o = wjfVar;
        this.c = str;
        this.p = z;
        this.q = handler;
        this.r = j;
        this.s = j2;
        this.e = ttmVar;
        this.d = abqbVar;
        this.u = z2;
        this.t = abnpVar;
        this.v = avmbVar;
        this.w = avmbVar2;
        this.x = scheduledExecutorService;
        this.f = abmtVar;
    }

    private final void m() {
        if (this.f.N()) {
            return;
        }
        this.q.post(afwl.i(new abbj(this.d, 12)));
    }

    private final void n(wgi wgiVar) {
        this.q.post(afwl.i(new abaq(this, wgiVar, 17, null)));
    }

    private final void o() {
        try {
            abor aborVar = this.n;
            abnl abnlVar = this.a;
            abnlVar.w();
            ListenableFuture listenableFutureH = aborVar.h(this.c, abnlVar, this.t, null, this.u);
            m();
            this.k = (wjf) listenableFutureH.get(this.s, TimeUnit.MILLISECONDS);
            c(this.k);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            b(e);
        } catch (ExecutionException e2) {
            e = e2;
            b(e);
        } catch (TimeoutException e3) {
            e = e3;
            b(e);
        }
    }

    private final void p(boolean z) {
        abmt abmtVar = this.f;
        boolean zAY = abmtVar.aY();
        abor aborVar = this.n;
        int i = 2;
        int i2 = 4;
        int i3 = 0;
        if (!zAY) {
            Pair pairB = aborVar.b(this.a, this.c, this.t, this.u);
            ListenableFuture listenableFuture = (ListenableFuture) pairB.second;
            this.A = listenableFuture;
            m();
            this.B = (ListenableFuture) pairB.first;
            this.y = tzk.c(this.B).B(this.s, TimeUnit.MILLISECONDS, this.v, null).p(new abpy(this, z, 0)).o(new abpy(this, z, 2)).u(new ablh(i2)).w(new ablh(3)).j().o(new abpz(this, z, i3)).o(new hpn(this, listenableFuture, 16)).s(this.w).C(new abpy(this, z, 3), new abpy(this, z, 4));
            return;
        }
        abrj abrjVarC = aborVar.c(this.a, this.c, this.t, this.u);
        m();
        avmn avmnVar = abrjVarC.a;
        avlm avlmVarJ = abrjVarC.a(abpg.class).h(wjf.class).ao().z(this.s, TimeUnit.MILLISECONDS).p(new abpy(this, z, 5)).o(new abqa(this, avmnVar, z, i3)).u(new ablh(i2)).w(new ablh(5)).j();
        avlr avlrVarH = abmtVar.bf() ? abrjVarC.a(abqu.class).h(wgi.class) : abrjVarC.a(abqu.class).h(wgi.class).ao().k();
        avmm avmmVar = this.z;
        awap awapVar = new awap(avlmVarJ.o(new abpz(this, z, i)), new hpn(this, avlrVarH, 17));
        avnn avnnVar = atqp.l;
        avmmVar.c(awapVar.ag(new abpy(this, z, 6), new abpy(this, z, 7)));
        avmmVar.c(avmnVar);
    }

    public final avlm a(Optional optional, boolean z) {
        if (optional.isEmpty()) {
            return avlm.q(Boolean.FALSE);
        }
        if (z) {
            return avlm.q(Boolean.TRUE);
        }
        wjf wjfVar = (wjf) optional.get();
        abnl abnlVar = this.a;
        if (wjfVar.aa() || wjfVar.f().al() || abnlVar.P()) {
            return avlm.q(Boolean.TRUE);
        }
        long j = this.r;
        if (j <= 0) {
            return avlm.q(Boolean.TRUE);
        }
        awlm awlmVar = this.l;
        avmb avmbVar = this.w;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        avzx avzxVar = new avzx(awlmVar, avlm.y(j, timeUnit, avmbVar), avlm.q(Boolean.FALSE));
        avnn avnnVar = atqp.n;
        return avzxVar;
    }

    public final void b(Throwable th) {
        this.q.post(afwl.i(new abaq(this, th, 15)));
    }

    public final void c(wjf wjfVar) {
        Runnable runnableI = afwl.i(new abaq(this, wjfVar, 16, null));
        boolean z = this.p;
        Handler handler = this.q;
        if (z) {
            handler.post(runnableI);
        } else {
            handler.postAtFrontOfQueue(runnableI);
        }
    }

    public final void d(boolean z, Throwable th) {
        if (this.f.aO() && ((th instanceof CancellationException) || (th.getCause() instanceof CancellationException))) {
            ((agrc) ((agrc) ((agrc) m.b()).j(th)).k("com/google/android/libraries/youtube/player/net/RequestWatchAndPlaybackRunnable", "cancelByException", (char) 434, "RequestWatchAndPlaybackRunnable.java")).t("Player response cancelled");
            l(false);
        } else {
            ((agrc) ((agrc) ((agrc) m.b()).j(th)).k("com/google/android/libraries/youtube/player/net/RequestWatchAndPlaybackRunnable", "handlePlayerResponseError", (char) 424, "RequestWatchAndPlaybackRunnable.java")).t("Problem fetching player response");
            this.C = th;
        }
        if (z) {
            return;
        }
        e();
    }

    public final void e() {
        if (this.k != null) {
            c(this.k);
        } else if (this.C != null) {
            b(this.C);
        }
    }

    public final void f(boolean z, Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
            ((agrc) ((agrc) ((agrc) m.b()).j(th)).k("com/google/android/libraries/youtube/player/net/RequestWatchAndPlaybackRunnable", "handleWatchNextResponseError", (char) 402, "RequestWatchAndPlaybackRunnable.java")).t("Problem fetching WatchNext response");
            this.j = th;
        } else if (this.f.aO() && ((th instanceof CancellationException) || (th.getCause() instanceof CancellationException))) {
            ((agrc) ((agrc) ((agrc) m.b()).j(th)).k("com/google/android/libraries/youtube/player/net/RequestWatchAndPlaybackRunnable", "handleWatchNextResponseError", (char) 407, "RequestWatchAndPlaybackRunnable.java")).t("WatchNext response cancelled");
            l(false);
        } else {
            ((agrc) ((agrc) ((agrc) m.b()).j(th)).k("com/google/android/libraries/youtube/player/net/RequestWatchAndPlaybackRunnable", "handleWatchNextResponseError", (char) 410, "RequestWatchAndPlaybackRunnable.java")).t("Problem fetching WatchNext response");
            this.j = th;
        }
        k(z);
    }

    public final void g() {
        if (this.i != null) {
            n(this.i);
        } else if (this.j != null) {
            this.q.post(afwl.i(new abaq(this, this.j, 18)));
        }
    }

    public final void h() {
        this.l.ki(Boolean.TRUE);
    }

    public final void i() {
        if (this.b == 0 || this.k == null || this.i == null) {
            return;
        }
        this.q.post(afwl.i(new abbj(this, 13)));
    }

    public final synchronized void j() {
        h();
    }

    public final void k(boolean z) {
        if (!z) {
            g();
        } else if (this.i != null || this.j != null) {
            wjf wjfVar = this.k;
            Throwable th = this.C;
            wgi wgiVar = this.i;
            Throwable th2 = this.j;
            boolean z2 = false;
            boolean z3 = (wjfVar == null && th == null) ? false : true;
            boolean z4 = (wgiVar == null && th2 == null) ? false : true;
            if (z3 && z4) {
                z2 = true;
            }
            ahno.O(z2);
            if (th != null) {
                b(th);
            } else if (th2 != null) {
                b(th2);
            } else if (wjfVar != null && wgiVar != null) {
                n(wgiVar);
                c(wjfVar);
            }
        }
        i();
    }

    public final boolean l(boolean z) {
        xir xirVar;
        boolean z2 = this.h;
        abmt abmtVar = this.f;
        if (abmtVar.g.l(265, 45722097L, false) && (xirVar = this.t.b) != null) {
            xirVar.f(tau.PLAYBACK_REQUEST_CANCELLED);
        }
        if (!this.h && !z) {
            h();
            return false;
        }
        this.g = true;
        if (this.y != null && !this.y.f()) {
            avnr.b((AtomicReference) this.y);
        }
        this.z.b();
        if (abmtVar.aq() && this.B != null && !this.B.isDone()) {
            this.B.cancel(false);
        }
        if (abmtVar.bV() && this.A != null) {
            this.A.cancel(false);
        }
        j();
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Looper.myLooper() != Looper.getMainLooper() && Process.getThreadPriority(Process.myTid()) != 0) {
            ((agrc) ((agrc) m.b()).k("com/google/android/libraries/youtube/player/net/RequestWatchAndPlaybackRunnable", "checkCriticalThread", 762, "RequestWatchAndPlaybackRunnable.java")).t("Request being made from non-critical thread");
        }
        this.d.e();
        int i = this.b;
        if (i == 0) {
            abmt abmtVar = this.f;
            if (abmtVar.X()) {
                abor aborVar = this.n;
                abnl abnlVar = this.a;
                abnlVar.w();
                ListenableFuture listenableFutureH = aborVar.h(this.c, abnlVar, this.t, null, this.u);
                m();
                ListenableFuture listenableFutureU = ahng.u(listenableFutureH, this.s, TimeUnit.MILLISECONDS, this.x);
                this.B = listenableFutureU;
                if (abmtVar.aq() && this.g) {
                    listenableFutureU.cancel(false);
                    return;
                } else {
                    taf.i(listenableFutureU, MoreExecutors.directExecutor(), new wuy(this, 12), new yqj(this, 9), null);
                    return;
                }
            }
            o();
        } else if (i == 1) {
            boolean zX = this.f.X();
            wjf wjfVar = this.o;
            if (zX) {
                this.k = wjfVar;
                this.A = this.n.e(this.a, this.t);
                if (this.g) {
                    return;
                }
                taf.i(this.A, this.x, new wuy(this, 13), new yqj(this, 10), null);
                return;
            }
            this.k = wjfVar;
            this.A = this.n.e(this.a, this.t);
            if (!this.g) {
                try {
                    this.i = (wgi) this.A.get();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    this.j = e;
                } catch (ExecutionException e2) {
                    this.j = e2;
                }
            }
            g();
        } else if (i != 2) {
            p(false);
        } else {
            p(true);
        }
        i();
    }
}
