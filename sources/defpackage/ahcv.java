package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class ahcv extends ahcw {
    private static final aheu c = new aheu(ahcv.class);
    private agjw d;
    private final boolean e;
    private final boolean f;

    public ahcv(agjw agjwVar, boolean z, boolean z2) {
        super(agjwVar.size());
        agjwVar.getClass();
        this.d = agjwVar;
        this.e = z;
        this.f = z2;
    }

    private final void s(int i, ListenableFuture listenableFuture) {
        try {
            d(i, a.i(listenableFuture));
        } catch (ExecutionException e) {
            t(e.getCause());
        } catch (Throwable th) {
            t(th);
        }
    }

    private final void t(Throwable th) {
        th.getClass();
        if (this.e && !setException(th)) {
            Set set = this.seenExceptionsField;
            if (set == null) {
                Set setAj = ahng.aj();
                c(setAj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ahcw.a;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, setAj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                set = this.seenExceptionsField;
                set.getClass();
            }
            if (v(set, th)) {
                u(th);
                return;
            }
        }
        if (th instanceof Error) {
            u(th);
        }
    }

    private static void u(Throwable th) {
        c.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean v(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // defpackage.ahcw
    public final void c(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thI = i();
        thI.getClass();
        v(set, thI);
    }

    public abstract void d(int i, Object obj);

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public final void e(agjw agjwVar) {
        int iDecrementAndGet = ahcw.b.decrementAndGet(this);
        ahno.P((iDecrementAndGet ^ (-1)) >>> 31, "Less than 0 remaining futures");
        if (iDecrementAndGet == 0) {
            if (agjwVar != null) {
                agqr it = agjwVar.iterator();
                int i = 0;
                while (it.hasNext()) {
                    ListenableFuture listenableFuture = (ListenableFuture) it.next();
                    if (!listenableFuture.isCancelled()) {
                        s(i, listenableFuture);
                    }
                    i++;
                }
            }
            this.seenExceptionsField = null;
            f();
            r(2);
        }
    }

    public abstract void f();

    @Override // defpackage.ahch
    protected final void gH() {
        agjw agjwVar = this.d;
        r(1);
        if (isCancelled() && (agjwVar != null)) {
            boolean zM = m();
            agqr it = agjwVar.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).cancel(zM);
            }
        }
    }

    @Override // defpackage.ahch
    protected final String jK() {
        agjw agjwVar = this.d;
        return agjwVar != null ? "futures=".concat(agjwVar.toString()) : super.jK();
    }

    final void p() {
        agjw agjwVar = this.d;
        agjwVar.getClass();
        if (agjwVar.isEmpty()) {
            f();
            return;
        }
        boolean z = this.e;
        agjw agjwVar2 = this.d;
        if (!z) {
            final agjw agjwVar3 = true != this.f ? null : agjwVar2;
            Runnable runnable = new Runnable() { // from class: ahcu
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.e(agjwVar3);
                }
            };
            agqr it = agjwVar2.iterator();
            while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                if (listenableFuture.isDone()) {
                    e(agjwVar3);
                } else {
                    listenableFuture.addListener(runnable, MoreExecutors.directExecutor());
                }
            }
            return;
        }
        agqr it2 = agjwVar2.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            int i2 = i + 1;
            if (listenableFuture2.isDone()) {
                q(i, listenableFuture2);
            } else {
                listenableFuture2.addListener(new Runnable() { // from class: ahct
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.q(i, listenableFuture2);
                    }
                }, MoreExecutors.directExecutor());
            }
            i = i2;
        }
    }

    public final void q(int i, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.d = null;
                cancel(false);
            } else {
                s(i, listenableFuture);
            }
        } finally {
            e(null);
        }
    }

    public void r(int i) {
        this.d = null;
    }
}
