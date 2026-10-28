package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jtq {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(jtp jtpVar) {
        if (this.c > 0) {
            jtpVar.W.e(this.d, this.e, this.f, this.g, jtpVar.i);
            this.c = 0;
        }
    }

    public final void b(cwj cwjVar, cwi cwiVar) {
        if (this.c > 0) {
            cwjVar.e(this.d, this.e, this.f, this.g, cwiVar);
            this.c = 0;
        }
    }

    public final void c() {
        this.b = false;
        this.c = 0;
    }

    public final void d(cwj cwjVar, long j, int i, int i2, int i3, cwi cwiVar) {
        ahno.P(this.g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                b(cwjVar, cwiVar);
            }
        }
    }

    public final void e(cvj cvjVar) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        cvjVar.i(bArr, 0, 10);
        cvjVar.k();
        if (cuo.b(bArr) != 0) {
            this.b = true;
        }
    }
}
