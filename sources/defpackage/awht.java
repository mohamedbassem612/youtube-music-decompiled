package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awht extends AtomicReference implements Runnable, avmd, avmn {
    private static final long serialVersionUID = 37497744973048446L;
    final avmd a;
    final AtomicReference b = new AtomicReference();
    final awhs c;
    avmf d;
    final long e;
    final TimeUnit f;

    public awht(avmd avmdVar, avmf avmfVar, long j, TimeUnit timeUnit) {
        this.a = avmdVar;
        this.d = avmfVar;
        this.e = j;
        this.f = timeUnit;
        if (avmfVar != null) {
            this.c = new awhs(avmdVar);
        } else {
            this.c = null;
        }
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        avmn avmnVar = (avmn) get();
        avnr avnrVar = avnr.DISPOSED;
        if (avmnVar == avnrVar || !compareAndSet(avmnVar, avnrVar)) {
            atqp.n(th);
        } else {
            avnr.b(this.b);
            this.a.b(th);
        }
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.d(this, avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
        avnr.b(this.b);
        awhs awhsVar = this.c;
        if (awhsVar != null) {
            avnr.b(awhsVar);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) get());
    }

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        avmn avmnVar = (avmn) get();
        avnr avnrVar = avnr.DISPOSED;
        if (avmnVar == avnrVar || !compareAndSet(avmnVar, avnrVar)) {
            return;
        }
        avnr.b(this.b);
        this.a.ki(obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        avmn avmnVar = (avmn) get();
        avnr avnrVar = avnr.DISPOSED;
        if (avmnVar == avnrVar || !compareAndSet(avmnVar, avnrVar)) {
            return;
        }
        if (avmnVar != null) {
            avmnVar.dispose();
        }
        avmf avmfVar = this.d;
        if (avmfVar == null) {
            this.a.b(new TimeoutException(awkh.c(this.e, this.f)));
        } else {
            this.d = null;
            avmfVar.F(this.c);
        }
    }
}
