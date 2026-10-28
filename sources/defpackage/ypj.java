package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ypj {
    private final ypm a;
    private final yup b;
    private final boolean c;
    private ypi d;
    private final byi e;
    private final hed f;

    public ypj(byi byiVar, long j, ypm ypmVar, yup yupVar, hed hedVar, boolean z) {
        this.e = byiVar;
        this.a = ypmVar;
        this.b = yupVar;
        this.f = hedVar;
        this.c = z;
        String queryParameter = byiVar.a.getQueryParameter("rn");
        int i = -1;
        if (queryParameter != null) {
            try {
                i = Integer.parseInt(queryParameter);
            } catch (NumberFormatException unused) {
            }
        }
        this.d = new ypi(i, j);
    }

    static void a(StringBuilder sb, int i, int i2) {
        sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_".charAt((i >> 6) & 63));
        sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_".charAt(i & 63));
        sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_".charAt((i2 >> 6) & 63));
        sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_".charAt(i2 & 63));
    }

    static void b(StringBuilder sb, int i, int i2) {
        c(sb, i);
        c(sb, i2);
    }

    static void c(StringBuilder sb, int i) {
        while (i > 31) {
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt((i & 31) + 32));
            i >>= 5;
        }
        sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(i));
    }

    public final void d(long j) {
        ypi ypiVar = this.d;
        this.d = null;
        if (ypiVar == null || ypiVar.a == -1) {
            return;
        }
        if (this.c) {
            long j2 = j - ypiVar.f;
            long j3 = (ypiVar.h / 1024) - ypiVar.g;
            if (j3 > 0 || j2 > 0) {
                b(ypiVar.c, (int) j2, (int) j3);
            }
        } else {
            long jMin = Math.min(4095L, (ypiVar.h - (ypiVar.g << 10)) / 1024);
            long jMin2 = Math.min(4095L, j - ypiVar.f);
            if (jMin > 0) {
                a(ypiVar.c, (int) jMin2, (int) jMin);
            }
        }
        ypiVar.j = j - ypiVar.b;
        this.a.a(ypiVar);
    }

    public final void e(byt bytVar, long j) {
        ypi ypiVar = this.d;
        if (ypiVar == null || ypiVar.a == -1) {
            return;
        }
        ypiVar.l = this.f.o(bytVar).f();
        d(j);
    }

    public final void f(String str, long j) {
        ypi ypiVar = this.d;
        if (ypiVar == null || ypiVar.a == -1) {
            return;
        }
        ypiVar.l = str;
        d(j);
    }

    public final void g(long j, long j2, int i) {
        ypi ypiVar = this.d;
        if (ypiVar == null || ypiVar.a == -1) {
            return;
        }
        long j3 = ypiVar.h + ((long) i);
        ypiVar.h = j3;
        if (this.c) {
            if (i != 0) {
                long j4 = j2 - ypiVar.f;
                long j5 = (j3 / 1024) - ypiVar.g;
                b(ypiVar.c, (int) j4, (int) j5);
                ypiVar.g += j5;
                ypiVar.f += j4;
                return;
            }
            return;
        }
        long jMin = Math.min(4095L, j2 - ypiVar.f);
        long j6 = j2 - j;
        long jMin2 = Math.min(4095L, (ypiVar.h - (ypiVar.g << 10)) / 1024);
        if (j6 <= 0 || jMin2 <= 0) {
            return;
        }
        a(ypiVar.c, (int) jMin, (int) jMin2);
        ypiVar.g += jMin2;
        ypiVar.f += jMin;
    }

    public final void h(long j) {
        ypq ypqVar;
        Long l;
        Long l2;
        ypi ypiVar = this.d;
        if (ypiVar != null) {
            ypiVar.k = j - ypiVar.b;
            ypiVar.i = this.b.j();
            byi byiVar = this.e;
            Object obj = byiVar.l;
            if (true != (obj instanceof ypq)) {
                obj = null;
            }
            if (obj == null || (l = (ypqVar = (ypq) obj).b) == null || (l2 = ypqVar.c) == null) {
                return;
            }
            long jLongValue = byiVar.i;
            if (jLongValue == -1) {
                jLongValue = ((l2.longValue() / 8) * l.longValue()) / 1000;
            }
            ypiVar.e = jLongValue;
            ypiVar.d = l.longValue();
        }
    }
}
