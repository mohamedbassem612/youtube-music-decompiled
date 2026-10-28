package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class deb implements ddr {
    private cwj c;
    private boolean d;
    private int f;
    private int g;
    private final String a = "video/mp2t";
    private final bwb b = new bwb(10);
    private long e = -9223372036854775807L;

    @Override // defpackage.ddr
    public final void a(bwb bwbVar) {
        this.c.getClass();
        if (this.d) {
            int iD = bwbVar.d();
            int i = this.g;
            if (i < 10) {
                int iMin = Math.min(iD, 10 - i);
                byte[] bArr = bwbVar.b;
                int i2 = bwbVar.c;
                bwb bwbVar2 = this.b;
                System.arraycopy(bArr, i2, bwbVar2.b, this.g, iMin);
                if (this.g + iMin == 10) {
                    bwbVar2.P(0);
                    if (bwbVar2.n() != 73 || bwbVar2.n() != 68 || bwbVar2.n() != 51) {
                        bvx.e("Id3Reader", "Discarding invalid ID3 tag");
                        this.d = false;
                        return;
                    } else {
                        bwbVar2.Q(3);
                        this.f = bwbVar2.m() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iD, this.f - this.g);
            this.c.c(bwbVar, iMin2);
            this.g += iMin2;
        }
    }

    @Override // defpackage.ddr
    public final void b(cvk cvkVar, dev devVar) {
        devVar.c();
        cwj cwjVarS = cvkVar.s(devVar.a(), 5);
        this.c = cwjVarS;
        bsd bsdVar = new bsd();
        bsdVar.a = devVar.b();
        bsdVar.a(this.a);
        bsdVar.e("application/id3");
        cwjVarS.b(new bse(bsdVar));
    }

    @Override // defpackage.ddr
    public final void d() {
        int i;
        this.c.getClass();
        if (this.d && (i = this.f) != 0 && this.g == i) {
            ahno.O(this.e != -9223372036854775807L);
            this.c.e(this.e, 1, this.f, 0, null);
            this.d = false;
        }
    }

    @Override // defpackage.ddr
    public final void e(long j, int i) {
        if ((i & 4) != 0) {
            this.d = true;
            this.e = j;
            this.f = 0;
            this.g = 0;
        }
    }

    @Override // defpackage.ddr
    public final void f() {
        this.d = false;
        this.e = -9223372036854775807L;
    }

    @Override // defpackage.ddr
    public final /* synthetic */ void c() {
    }
}
