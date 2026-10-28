package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class der {
    public boolean b;
    public boolean c;
    public boolean d;
    public final nzd h = new nzd(0);
    public long e = -9223372036854775807L;
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public final bwb a = new bwb();

    public der(byte[] bArr) {
    }

    public static long b(bwb bwbVar) {
        int i = bwbVar.c;
        if (bwbVar.d() >= 9) {
            byte[] bArr = new byte[9];
            bwbVar.K(bArr, 0, 9);
            bwbVar.P(i);
            byte b = bArr[0];
            if ((b & 196) == 68) {
                byte b2 = bArr[2];
                if ((b2 & 4) == 4) {
                    byte b3 = bArr[4];
                    if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                        long j = b;
                        long j2 = b2;
                        long j3 = (j & 56) >> 3;
                        return (j3 << 30) | ((j & 3) << 28) | ((bArr[1] & 255) << 20) | (((248 & j2) >> 3) << 15) | ((j2 & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                    }
                }
            }
        }
        return -9223372036854775807L;
    }

    public static final int d(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    public final void a(cvj cvjVar) {
        this.a.M(bwp.e);
        this.b = true;
        cvjVar.k();
    }

    public final void c(cvj cvjVar) {
        this.a.M(bwp.e);
        this.b = true;
        cvjVar.k();
    }

    public der() {
    }
}
