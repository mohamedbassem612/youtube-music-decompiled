package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zcz extends cpb {
    private volatile boolean o;
    private long p;
    private boolean q;
    private final cpf r;

    public zcz(bye byeVar, byi byiVar, bse bseVar, int i, Object obj, cpf cpfVar) {
        super(byeVar, byiVar, bseVar, i, obj, 0L, 0L, -9223372036854775807L, -9223372036854775807L, -1L);
        this.r = cpfVar;
    }

    @Override // defpackage.crm
    public final void a() {
        this.o = true;
    }

    @Override // defpackage.crm
    public final void b() {
        byi byiVarA = this.f.a(this.p);
        try {
            bze bzeVar = this.m;
            cvb cvbVar = new cvb(bzeVar, byiVarA.g, bzeVar.b(byiVarA));
            if (this.p == 0) {
                this.r.b(d(), -9223372036854775807L, -9223372036854775807L);
            }
            while (!this.o && this.r.d(cvbVar)) {
                try {
                } catch (Throwable th) {
                    this.p = cvbVar.b - this.f.g;
                    throw th;
                }
            }
            this.p = cvbVar.b - this.f.g;
            aua.d(this.m);
            this.q = !this.o;
        } catch (Throwable th2) {
            aua.d(this.m);
            throw th2;
        }
    }

    @Override // defpackage.cpo
    public final boolean j() {
        return this.q;
    }
}
