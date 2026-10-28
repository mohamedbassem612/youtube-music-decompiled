package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cpn extends cpg {
    public cph a;
    private long b;
    private volatile boolean c;
    private final cpf d;

    public cpn(bye byeVar, byi byiVar, bse bseVar, int i, Object obj, cpf cpfVar) {
        super(byeVar, byiVar, 2, bseVar, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.d = cpfVar;
    }

    @Override // defpackage.crm
    public final void a() {
        this.c = true;
    }

    @Override // defpackage.crm
    public final void b() {
        if (this.b == 0) {
            this.d.b(this.a, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            byi byiVarA = this.f.a(this.b);
            bze bzeVar = this.m;
            cvb cvbVar = new cvb(bzeVar, byiVarA.h, bzeVar.b(byiVarA));
            while (!this.c && this.d.d(cvbVar)) {
                try {
                } catch (Throwable th) {
                    this.b = cvbVar.b - this.f.h;
                    this.d.a();
                    throw th;
                }
            }
            this.b = cvbVar.b - this.f.h;
            this.d.a();
            aua.d(this.m);
        } catch (Throwable th2) {
            aua.d(this.m);
            throw th2;
        }
    }
}
