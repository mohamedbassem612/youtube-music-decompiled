package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avsz extends awjm {
    final avni a;
    final avni b;
    final avnd c;
    final avnd d;

    public avsz(axsp axspVar, avni avniVar, avni avniVar2, avnd avndVar, avnd avndVar2) {
        super(axspVar);
        this.a = avniVar;
        this.b = avniVar2;
        this.c = avndVar;
        this.d = avndVar2;
    }

    @Override // defpackage.awjm, defpackage.axsp
    public final void b(Throwable th) {
        if (this.h) {
            atqp.n(th);
            return;
        }
        this.h = true;
        try {
            this.b.a(th);
            this.e.b(th);
        } catch (Throwable th2) {
            avkz.a(th2);
            this.e.b(new avmw(th, th2));
        }
        try {
            this.d.a();
        } catch (Throwable th3) {
            avkz.a(th3);
            atqp.n(th3);
        }
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.h) {
            return;
        }
        if (this.i != 0) {
            this.e.kk(null);
            return;
        }
        try {
            this.a.a(obj);
            this.e.kk(obj);
        } catch (Throwable th) {
            g(th);
        }
    }

    @Override // defpackage.avop
    public final int kl(int i) {
        return f(i);
    }

    @Override // defpackage.avot
    public final Object km() throws Exception {
        try {
            Object objKm = this.g.km();
            if (objKm == null) {
                if (this.i != 1) {
                    return objKm;
                }
                this.c.a();
                this.d.a();
                return null;
            }
            try {
                this.a.a(objKm);
                this.d.a();
                return objKm;
            } catch (Throwable th) {
                try {
                    avkz.a(th);
                    try {
                        this.b.a(th);
                        throw awkh.a(th);
                    } catch (Throwable th2) {
                        throw new avmw(th, th2);
                    }
                } catch (Throwable th3) {
                    this.d.a();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            avkz.a(th4);
            try {
                this.b.a(th4);
                throw awkh.a(th4);
            } catch (Throwable th5) {
                throw new avmw(th4, th5);
            }
        }
    }

    @Override // defpackage.awjm, defpackage.axsp
    public final void kn() {
        if (this.h) {
            return;
        }
        try {
            this.c.a();
            this.h = true;
            this.e.kn();
            try {
                this.d.a();
            } catch (Throwable th) {
                avkz.a(th);
                atqp.n(th);
            }
        } catch (Throwable th2) {
            g(th2);
        }
    }
}
