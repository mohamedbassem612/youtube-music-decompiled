package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zbo extends cpb {
    public final zbb o;
    private long p;
    private volatile boolean q;
    private volatile boolean r;
    private final cpf s;

    public zbo(bye byeVar, byi byiVar, bse bseVar, int i, Object obj, long j, cpf cpfVar, zbb zbbVar) {
        super(byeVar, byiVar, bseVar, i, obj, j, j, -9223372036854775807L, -9223372036854775807L, 0L);
        this.s = cpfVar;
        this.o = zbbVar;
    }

    @Override // defpackage.crm
    public final void a() {
        this.q = true;
    }

    @Override // defpackage.crm
    public final void b() {
        zhq zhqVar = zhq.ABR;
        String str = this.h.a;
        byi byiVarA = this.f.a(this.p);
        try {
            bze bzeVar = this.m;
            cvb cvbVar = new cvb(bzeVar, byiVarA.h, bzeVar.b(byiVarA));
            if (this.p == 0) {
                this.s.b(new zbn(this, 0), -9223372036854775807L, -9223372036854775807L);
            }
            while (!this.q && this.s.d(cvbVar)) {
                try {
                } catch (Throwable th) {
                    this.p = cvbVar.b - this.f.h;
                    throw th;
                }
            }
            this.p = cvbVar.b - this.f.h;
            this.m.f();
            this.r = !this.q;
        } catch (Throwable th2) {
            this.m.f();
            throw th2;
        }
    }

    @Override // defpackage.cpo
    public final long h() {
        return -1L;
    }

    @Override // defpackage.cpo
    public final boolean j() {
        return this.r;
    }
}
