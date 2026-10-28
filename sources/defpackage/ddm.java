package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ddm implements ddr {
    public long a;
    private final bwb b;
    private final String c;
    private final int d;
    private final String e;
    private String f;
    private cwj g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private long l;
    private bse m;
    private int n;
    private final dqp o;

    public ddm(String str, int i, String str2) {
        dqp dqpVar = new dqp(new byte[16], (byte[]) null);
        this.o = dqpVar;
        this.b = new bwb((byte[]) dqpVar.c);
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.k = false;
        this.a = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x011e  */
    @Override // defpackage.ddr
    public final void a(bwb bwbVar) {
        boolean z;
        this.g.getClass();
        while (bwbVar.d() > 0) {
            int i = this.h;
            if (i == 0) {
                while (true) {
                    if (bwbVar.d() > 0) {
                        if (this.j) {
                            int iN = bwbVar.n();
                            this.j = iN == 172;
                            if (iN == 64) {
                                if (iN != 65) {
                                    z = false;
                                }
                                this.k = z;
                                this.h = 1;
                                byte[] bArr = this.b.b;
                                bArr[0] = -84;
                                bArr[1] = true == this.k ? (byte) 65 : (byte) 64;
                                this.i = 2;
                            } else if (iN == 65) {
                            }
                            z = true;
                            this.k = z;
                            this.h = 1;
                            byte[] bArr2 = this.b.b;
                            bArr2[0] = -84;
                            bArr2[1] = true == this.k ? (byte) 65 : (byte) 64;
                            this.i = 2;
                        } else {
                            this.j = bwbVar.n() == 172;
                        }
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(bwbVar.d(), this.n - this.i);
                this.g.c(bwbVar, iMin);
                int i2 = this.i + iMin;
                this.i = i2;
                if (i2 == this.n) {
                    ahno.O(this.a != -9223372036854775807L);
                    this.g.e(this.a, 1, this.n, 0, null);
                    this.a += this.l;
                    this.h = 0;
                }
            } else {
                bwb bwbVar2 = this.b;
                byte[] bArr3 = bwbVar2.b;
                int iMin2 = Math.min(bwbVar.d(), 16 - this.i);
                bwbVar.K(bArr3, this.i, iMin2);
                int i3 = this.i + iMin2;
                this.i = i3;
                if (i3 == 16) {
                    dqp dqpVar = this.o;
                    dqpVar.q(0);
                    aamu aamuVarC = cuq.c(dqpVar);
                    bse bseVar = this.m;
                    if (bseVar == null || bseVar.I != 2 || aamuVarC.c != bseVar.K || !"audio/ac4".equals(bseVar.q)) {
                        bsd bsdVar = new bsd();
                        bsdVar.a = this.f;
                        bsdVar.a(this.e);
                        bsdVar.e("audio/ac4");
                        bsdVar.G = 2;
                        bsdVar.I = aamuVarC.c;
                        bsdVar.d = this.c;
                        bsdVar.f = this.d;
                        bse bseVar2 = new bse(bsdVar);
                        this.m = bseVar2;
                        this.g.b(bseVar2);
                    }
                    this.n = aamuVarC.b;
                    this.l = (((long) aamuVarC.a) * 1000000) / ((long) this.m.K);
                    bwbVar2.P(0);
                    this.g.c(bwbVar2, 16);
                    this.h = 2;
                }
            }
        }
    }

    @Override // defpackage.ddr
    public final void b(cvk cvkVar, dev devVar) {
        devVar.c();
        this.f = devVar.b();
        this.g = cvkVar.s(devVar.a(), 1);
    }

    @Override // defpackage.ddr
    public final void e(long j, int i) {
        this.a = j;
    }

    @Override // defpackage.ddr
    public final void f() {
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.k = false;
        this.a = -9223372036854775807L;
    }

    @Override // defpackage.ddr
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ddr
    public final /* synthetic */ void d() {
    }
}
