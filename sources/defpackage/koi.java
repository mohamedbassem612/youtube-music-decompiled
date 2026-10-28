package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class koi extends kob {
    public final afx d;
    private final koq f;

    public koi(kou kouVar, koq koqVar) {
        super(kouVar, klt.a);
        this.d = new afx(0);
        this.f = koqVar;
        this.e.c("ConnectionlessLifecycleHelper", this);
    }

    private final void o() {
        if (this.d.isEmpty()) {
            return;
        }
        this.f.f(this);
    }

    @Override // defpackage.kob
    protected final void f(klo kloVar, int i) {
        this.f.d(kloVar, i);
    }

    @Override // defpackage.kob
    protected final void g() {
        this.f.e();
    }

    @Override // defpackage.kob, defpackage.kot
    public final void i() {
        super.i();
        o();
    }

    @Override // defpackage.kob, defpackage.kot
    public final void j() {
        super.j();
        Object obj = koq.c;
        koq koqVar = this.f;
        synchronized (obj) {
            if (koqVar.l == this) {
                koqVar.l = null;
                koqVar.m.clear();
            }
        }
    }

    @Override // defpackage.kot
    public final void k() {
        o();
    }
}
