package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class cpm extends cpb {
    private final int o;
    private final long p;
    private long q;
    private volatile boolean r;
    private boolean s;
    private final cpf t;

    public cpm(bye byeVar, byi byiVar, bse bseVar, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, cpf cpfVar) {
        super(byeVar, byiVar, bseVar, i, obj, j, j2, j3, j4, j5);
        this.o = i2;
        this.p = j6;
        this.t = cpfVar;
    }

    @Override // defpackage.crm
    public final void a() {
        this.r = true;
    }

    @Override // defpackage.crm
    public final void b() {
        int i;
        int i2;
        cpd cpdVarD = d();
        if (this.q == 0) {
            long j = this.p;
            cpdVarD.b(j);
            cpf cpfVar = this.t;
            cph cphVarI = i(cpdVarD);
            long j2 = this.a;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j;
            long j4 = this.b;
            cpfVar.b(cphVarI, j3, j4 != -9223372036854775807L ? j4 - j : -9223372036854775807L);
        }
        try {
            byi byiVar = this.f;
            byi byiVarA = byiVar.a(this.q);
            bze bzeVar = this.m;
            cvb cvbVar = new cvb(bzeVar, byiVarA.h, bzeVar.b(byiVarA));
            do {
                try {
                    if (this.r) {
                        break;
                    }
                } catch (Throwable th) {
                    this.q = cvbVar.b - this.f.h;
                    throw th;
                }
            } while (this.t.d(cvbVar));
            bse bseVar = this.h;
            if (bsy.k(bseVar.p) && (((i = bseVar.Q) > 1 || bseVar.R > 1) && i != -1 && (i2 = bseVar.R) != -1)) {
                cwj cwjVarA = cpdVarD.a(0, 4);
                int i3 = i * i2;
                long j5 = (this.l - this.k) / ((long) i3);
                for (int i4 = 1; i4 < i3; i4++) {
                    cwjVarA.c(new bwb(), 0);
                    cwjVarA.e(((long) i4) * j5, 0, 0, 0, null);
                }
            }
            this.q = cvbVar.b - byiVar.h;
            aua.d(bzeVar);
            this.s = !this.r;
        } catch (Throwable th2) {
            aua.d(this.m);
            throw th2;
        }
    }

    @Override // defpackage.cpo
    public final long h() {
        return this.n + ((long) this.o);
    }

    @Override // defpackage.cpo
    public final boolean j() {
        return this.s;
    }

    protected cph i(cpd cpdVar) {
        return cpdVar;
    }
}
