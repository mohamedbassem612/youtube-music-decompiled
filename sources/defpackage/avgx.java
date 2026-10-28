package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avgx extends aveo {
    final auzh h;
    final avbh i;
    final auyq j;
    final /* synthetic */ avgy k;
    private final long l;
    private boolean m;
    private boolean n;

    /* JADX WARN: Illegal instructions before constructor call */
    public avgx(avgy avgyVar, auzh auzhVar, avbh avbhVar, auyq auyqVar) {
        this.k = avgyVar;
        avhb avhbVar = avgyVar.c;
        super(avhbVar.f(auyqVar), avhbVar.l, auyqVar.b);
        this.h = auzhVar;
        this.i = avbhVar;
        this.j = auyqVar;
        this.l = System.nanoTime();
    }

    private final synchronized void m() {
        if (!this.n) {
            this.n = true;
            if (this.m) {
                for (atxy atxyVar : this.j.e) {
                }
            }
        }
    }

    @Override // defpackage.aveo
    protected final void f() {
        m();
        this.k.c.o.execute(new avgv(this, 4));
    }

    public final synchronized void k() {
        if (!this.n && !this.m) {
            this.m = true;
            for (atxy atxyVar : this.j.e) {
                if (this.n) {
                    break;
                }
            }
        }
    }

    final void l() {
        avej avejVar;
        m();
        auzh auzhVarA = this.h.a();
        try {
            auyt auytVarC = this.k.c(this.i, this.j.c(auyw.a, Long.valueOf(System.nanoTime() - this.l)));
            this.h.c(auzhVarA);
            synchronized (this) {
                if (this.e == null) {
                    super.i(auytVarC);
                    aven avenVar = this.g;
                    if (avenVar == null) {
                        this.f = null;
                        this.d = true;
                    } else {
                        super.j(avenVar);
                        avejVar = new avej(this, this.c);
                    }
                }
                avejVar = null;
            }
            avgy avgyVar = this.k;
            if (avejVar == null) {
                avgyVar.c.o.execute(new avgv(this, 4));
            } else {
                avgyVar.c.f(this.j).execute(new aves(this, avejVar, 11, (short[]) null));
            }
        } catch (Throwable th) {
            this.h.c(auzhVarA);
            throw th;
        }
    }
}
