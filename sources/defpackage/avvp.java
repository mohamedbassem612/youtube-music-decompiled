package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avvp extends awjz implements avlk {
    private static final long serialVersionUID = 4063763155303814625L;
    final axsp a;
    final avnn b;
    boolean c;
    boolean d;
    long e;

    public avvp(axsp axspVar, avnn avnnVar) {
        this.a = axspVar;
        this.b = avnnVar;
    }

    @Override // defpackage.axsp
    public final void b(Throwable th) {
        if (this.c) {
            if (this.d) {
                atqp.n(th);
                return;
            } else {
                this.a.b(th);
                return;
            }
        }
        this.c = true;
        try {
            axso axsoVar = (axso) ((avog) this.b).a;
            long j = this.e;
            if (j != 0) {
                g(j);
            }
            axsoVar.aq(this);
        } catch (Throwable th2) {
            avkz.a(th2);
            this.a.b(new avmw(th, th2));
        }
    }

    @Override // defpackage.avlk, defpackage.axsp
    public final void e(axsq axsqVar) {
        h(axsqVar);
    }

    @Override // defpackage.axsp
    public final void kk(Object obj) {
        if (this.d) {
            return;
        }
        if (!this.c) {
            this.e++;
        }
        this.a.kk(obj);
    }

    @Override // defpackage.axsp
    public final void kn() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c = true;
        this.a.kn();
    }
}
