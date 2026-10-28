package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awez extends AtomicReference implements avlw {
    private static final long serialVersionUID = 3837284832786408377L;
    final awfa a;
    final long b;
    final int c;
    volatile avot d;
    volatile boolean e;

    public awez(awfa awfaVar, long j, int i) {
        this.a = awfaVar;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        long j = this.b;
        awfa awfaVar = this.a;
        if (j != awfaVar.j || !awkh.e(awfaVar.e, th)) {
            atqp.n(th);
            return;
        }
        awfaVar.h.dispose();
        awfaVar.f = true;
        this.e = true;
        awfaVar.g();
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.d(this, avmnVar)) {
            if (avmnVar instanceof avoo) {
                avoo avooVar = (avoo) avmnVar;
                int iKl = avooVar.kl(7);
                if (iKl == 1) {
                    this.d = avooVar;
                    this.e = true;
                    this.a.g();
                    return;
                } else if (iKl == 2) {
                    this.d = avooVar;
                    return;
                }
            }
            this.d = new awig(this.c);
        }
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        awfa awfaVar = this.a;
        if (this.b == awfaVar.j) {
            if (obj != null) {
                this.d.j(obj);
            }
            awfaVar.g();
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        awfa awfaVar = this.a;
        if (this.b == awfaVar.j) {
            this.e = true;
            awfaVar.g();
        }
    }
}
