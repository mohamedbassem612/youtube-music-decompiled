package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avqh extends AtomicReference implements avlc, avmn {
    private static final long serialVersionUID = 251330541679988317L;
    final /* synthetic */ avqi a;

    public avqh(avqi avqiVar) {
        this.a = avqiVar;
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        avqi avqiVar = this.a;
        avmm avmmVar = avqiVar.e;
        avmmVar.d(this);
        if (!avqiVar.c) {
            avqiVar.f.kj();
            avmmVar.dispose();
            awkd awkdVar = avqiVar.d;
            if (!awkh.e(awkdVar, th)) {
                atqp.n(th);
                return;
            } else {
                if (avqiVar.getAndSet(0) > 0) {
                    avqiVar.a.b(awkh.d(awkdVar));
                    return;
                }
                return;
            }
        }
        awkd awkdVar2 = avqiVar.d;
        if (!awkh.e(awkdVar2, th)) {
            atqp.n(th);
        } else if (avqiVar.decrementAndGet() == 0) {
            avqiVar.a.b(awkh.d(awkdVar2));
        } else if (avqiVar.b != Integer.MAX_VALUE) {
            avqiVar.f.ko(1L);
        }
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        avnr.d(this, avmnVar);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) get());
    }

    @Override // defpackage.avlc, defpackage.avln
    public final void kn() {
        avqi avqiVar = this.a;
        avqiVar.e.d(this);
        if (avqiVar.decrementAndGet() != 0) {
            if (avqiVar.b != Integer.MAX_VALUE) {
                avqiVar.f.ko(1L);
            }
        } else {
            Throwable th = (Throwable) avqiVar.d.get();
            if (th != null) {
                avqiVar.a.b(th);
            } else {
                avqiVar.a.kn();
            }
        }
    }
}
