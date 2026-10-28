package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ded implements ddr {
    private final bwb a;
    private final cvu b;
    private final String c;
    private final int d;
    private final String e;
    private cwj f;
    private String g;
    private int h = 0;
    private int i;
    private boolean j;
    private boolean k;
    private long l;
    private int m;
    private long n;

    public ded(String str, int i, String str2) {
        bwb bwbVar = new bwb(4);
        this.a = bwbVar;
        bwbVar.b[0] = -1;
        this.b = new cvu();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.ddr
    public final void a(bwb bwbVar) {
        this.f.getClass();
        while (bwbVar.d() > 0) {
            int i = this.h;
            if (i == 0) {
                byte[] bArr = bwbVar.b;
                int i2 = bwbVar.c;
                int i3 = bwbVar.d;
                while (true) {
                    if (i2 >= i3) {
                        bwbVar.P(i3);
                        break;
                    }
                    int i4 = i2 + 1;
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        bwbVar.P(i4);
                        this.k = false;
                        this.a.b[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2 = i4;
                }
            } else if (i != 1) {
                int iMin = Math.min(bwbVar.d(), this.m - this.i);
                this.f.c(bwbVar, iMin);
                int i5 = this.i + iMin;
                this.i = i5;
                if (i5 >= this.m) {
                    ahno.O(this.n != -9223372036854775807L);
                    this.f.e(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            } else {
                int iMin2 = Math.min(bwbVar.d(), 4 - this.i);
                bwb bwbVar2 = this.a;
                bwbVar.K(bwbVar2.b, this.i, iMin2);
                int i6 = this.i + iMin2;
                this.i = i6;
                if (i6 >= 4) {
                    bwbVar2.P(0);
                    cvu cvuVar = this.b;
                    if (cvuVar.a(bwbVar2.i())) {
                        this.m = cvuVar.c;
                        if (!this.j) {
                            this.l = (((long) cvuVar.g) * 1000000) / ((long) cvuVar.d);
                            bsd bsdVar = new bsd();
                            bsdVar.a = this.g;
                            bsdVar.a(this.e);
                            bsdVar.e(cvuVar.b);
                            bsdVar.p = SemanticState.Obscured;
                            bsdVar.G = cvuVar.e;
                            bsdVar.I = cvuVar.d;
                            bsdVar.d = this.c;
                            bsdVar.f = this.d;
                            this.f.b(new bse(bsdVar));
                            this.j = true;
                        }
                        bwbVar2.P(0);
                        this.f.c(bwbVar2, 4);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            }
        }
    }

    @Override // defpackage.ddr
    public final void b(cvk cvkVar, dev devVar) {
        devVar.c();
        this.g = devVar.b();
        this.f = cvkVar.s(devVar.a(), 1);
    }

    @Override // defpackage.ddr
    public final void e(long j, int i) {
        this.n = j;
    }

    @Override // defpackage.ddr
    public final void f() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.ddr
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ddr
    public final /* synthetic */ void d() {
    }
}
