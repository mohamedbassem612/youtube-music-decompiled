package defpackage;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avzv extends AtomicReference implements avln, avmn {
    private static final long serialVersionUID = -5955289211445418871L;
    final avln a;
    final avzw b = new avzw(this);
    final avlp c;
    final avzu d;

    public avzv(avln avlnVar, avlp avlpVar) {
        this.a = avlnVar;
        this.c = avlpVar;
        this.d = avlpVar != null ? new avzu(avlnVar) : null;
    }

    @Override // defpackage.avln
    public final void b(Throwable th) {
        avnr.b(this.b);
        avnr avnrVar = avnr.DISPOSED;
        if (getAndSet(avnrVar) != avnrVar) {
            this.a.b(th);
        } else {
            atqp.n(th);
        }
    }

    public final void c() {
        if (avnr.b(this)) {
            avlp avlpVar = this.c;
            if (avlpVar == null) {
                this.a.b(new TimeoutException());
            } else {
                avlpVar.F(this.d);
            }
        }
    }

    @Override // defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.d(this, avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
        avnr.b(this.b);
        avzu avzuVar = this.d;
        if (avzuVar != null) {
            avnr.b(avzuVar);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) get());
    }

    @Override // defpackage.avln
    public final void ki(Object obj) {
        avnr.b(this.b);
        avnr avnrVar = avnr.DISPOSED;
        if (getAndSet(avnrVar) != avnrVar) {
            this.a.ki(obj);
        }
    }

    @Override // defpackage.avln
    public final void kn() {
        avnr.b(this.b);
        avnr avnrVar = avnr.DISPOSED;
        if (getAndSet(avnrVar) != avnrVar) {
            this.a.kn();
        }
    }
}
