package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class das {
    public boolean d;
    public boolean e;
    private int g;
    public final dat a = new dat();
    public final bwb b = new bwb(new byte[65025], 0);
    public int c = -1;
    public long f = -1;

    private final int b(int i) {
        int i2;
        int i3 = 0;
        this.g = 0;
        do {
            int i4 = this.g;
            int i5 = i + i4;
            dat datVar = this.a;
            if (i5 >= datVar.c) {
                break;
            }
            this.g = i4 + 1;
            i2 = datVar.f[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean a(cvj cvjVar) {
        if (this.d) {
            this.d = false;
            this.b.L(0);
            this.f = -1L;
        }
        while (true) {
            if (this.d) {
                return true;
            }
            int i = this.c;
            if (i < 0) {
                dat datVar = this.a;
                if (!datVar.c(cvjVar, -1L) || !datVar.b(cvjVar, true)) {
                    return false;
                }
                int iB = datVar.d;
                this.e = false;
                if ((datVar.a & 1) == 1 && this.b.d == 0) {
                    iB += b(0);
                    int i2 = this.g;
                    this.e = i2 > 0 && datVar.f[i2 + (-1)] != 255;
                    i = i2;
                } else {
                    i = 0;
                }
                if (!azz.i(cvjVar, iB)) {
                    return false;
                }
                this.c = i;
            }
            int iB2 = b(i);
            int i3 = this.c + this.g;
            if (iB2 > 0) {
                bwb bwbVar = this.b;
                bwbVar.H(bwbVar.d + iB2);
                if (!azz.h(cvjVar, bwbVar.b, bwbVar.d, iB2)) {
                    return false;
                }
                bwbVar.O(bwbVar.d + iB2);
            }
            if (this.b.d > 0 && this.g > 0) {
                this.d = this.a.f[i3 + (-1)] != 255;
            }
            if (this.d) {
                this.e = false;
            } else if (this.e) {
                dat datVar2 = this.a;
                if (i3 == datVar2.c && (datVar2.a & 4) == 0) {
                    long j = datVar2.b;
                    if (j >= 0) {
                        this.f = j;
                    }
                }
            }
            if (i3 == this.a.c) {
                i3 = -1;
            }
            this.c = i3;
        }
    }
}
