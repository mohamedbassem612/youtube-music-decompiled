package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cuy {
    public final cus a;
    protected final cux b;
    protected cuu c;
    private final int d;

    public cuy(cuv cuvVar, cux cuxVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = cuxVar;
        this.d = i;
        this.a = new cus(cuvVar, j, j2, j3, j4, j5);
    }

    protected static final boolean d(cvj cvjVar, long j) {
        cvb cvbVar = (cvb) cvjVar;
        long j2 = j - cvbVar.b;
        if (j2 < 0 || j2 > 262144) {
            return false;
        }
        cvbVar.p((int) j2, false);
        return true;
    }

    public static int e(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    protected static final int g(cvj cvjVar, long j, qha qhaVar) {
        if (j == ((cvb) cvjVar).b) {
            return 0;
        }
        qhaVar.a = j;
        return 1;
    }

    public final void a(long j) {
        cuu cuuVar = this.c;
        if (cuuVar == null || cuuVar.a != j) {
            cus cusVar = this.a;
            this.c = new cuu(j, cusVar.a.a(j), cusVar.b, cusVar.c, cusVar.d, cusVar.e);
        }
    }

    public final boolean b() {
        return this.c != null;
    }

    protected final void c() {
        this.c = null;
        this.b.b();
    }

    public final int f(cvj cvjVar, qha qhaVar) {
        while (true) {
            cuu cuuVar = this.c;
            cuuVar.getClass();
            long j = cuuVar.e;
            long j2 = cuuVar.f - j;
            int i = this.d;
            long j3 = cuuVar.g;
            if (j2 <= i) {
                c();
                return g(cvjVar, j, qhaVar);
            }
            if (!d(cvjVar, j3)) {
                return g(cvjVar, j3, qhaVar);
            }
            cvjVar.k();
            cuw cuwVarA = this.b.a(cvjVar, cuuVar.b);
            int i2 = cuwVarA.b;
            if (i2 == -3) {
                c();
                return g(cvjVar, j3, qhaVar);
            }
            if (i2 == -2) {
                long j4 = cuwVarA.c;
                long j5 = cuwVarA.d;
                cuuVar.c = j4;
                cuuVar.e = j5;
                cuuVar.b();
            } else {
                if (i2 != -1) {
                    long j6 = cuwVarA.d;
                    d(cvjVar, j6);
                    c();
                    return g(cvjVar, j6, qhaVar);
                }
                long j7 = cuwVarA.c;
                long j8 = cuwVarA.d;
                cuuVar.d = j7;
                cuuVar.f = j8;
                cuuVar.b();
            }
        }
    }
}
