package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avpe extends AtomicReference implements avlw, avmn {
    private static final long serialVersionUID = -5417183359794346637L;
    final int a;
    public avot b;
    public volatile boolean c;
    int d;
    final awbh e;

    public avpe(awbh awbhVar, int i) {
        this.e = awbhVar;
        this.a = i;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        awbh awbhVar = this.e;
        if (!awkh.e(awbhVar.d, th)) {
            atqp.n(th);
            return;
        }
        if (awbhVar.m == 1) {
            awbhVar.g.dispose();
        }
        e();
        awbhVar.g();
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        if (avnr.d(this, avmnVar)) {
            if (avmnVar instanceof avoo) {
                avoo avooVar = (avoo) avmnVar;
                int iKl = avooVar.kl(3);
                if (iKl == 1) {
                    this.d = 1;
                    this.b = avooVar;
                    this.c = true;
                    this.e.h(this);
                    return;
                }
                if (iKl == 2) {
                    this.d = 2;
                    this.b = avooVar;
                    return;
                }
            }
            this.b = atqp.p(-this.a);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this);
    }

    public final void e() {
        this.c = true;
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return avnr.c((avmn) get());
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        int i = this.d;
        awbh awbhVar = this.e;
        if (i != 0) {
            awbhVar.g();
        } else {
            this.b.j(obj);
            awbhVar.g();
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
        this.e.h(this);
    }
}
