package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avpc implements avlw, avmn {
    final avlw a;
    final avni b;
    final avnd c;
    avmn d;

    public avpc(avlw avlwVar, avni avniVar, avnd avndVar) {
        this.a = avlwVar;
        this.b = avniVar;
        this.c = avndVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        avmn avmnVar = this.d;
        avnr avnrVar = avnr.DISPOSED;
        if (avmnVar == avnrVar) {
            atqp.n(th);
        } else {
            this.d = avnrVar;
            this.a.b(th);
        }
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        try {
            this.b.a(avmnVar);
            if (avnr.e(this.d, avmnVar)) {
                this.d = avmnVar;
                this.a.d(this);
            }
        } catch (Throwable th) {
            avkz.a(th);
            avmnVar.dispose();
            this.d = avnr.DISPOSED;
            avns.g(th, this.a);
        }
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avmn avmnVar = this.d;
        avnr avnrVar = avnr.DISPOSED;
        if (avmnVar != avnrVar) {
            this.d = avnrVar;
            try {
                this.c.a();
            } catch (Throwable th) {
                avkz.a(th);
                atqp.n(th);
            }
            avmnVar.dispose();
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.d.f();
    }

    @Override // defpackage.avlw
    public final void kk(Object obj) {
        this.a.kk(obj);
    }

    @Override // defpackage.avlw
    public final void kn() {
        avmn avmnVar = this.d;
        avnr avnrVar = avnr.DISPOSED;
        if (avmnVar != avnrVar) {
            this.d = avnrVar;
            this.a.kn();
        }
    }
}
