package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class plx {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final agkz h;
    public final String i;
    public final long j;
    public final long k;
    public final int l;
    public final long m;
    public final String n;
    public final long o;
    public final int p;

    public plx(long j, String str, int i, String str2, String str3, String str4, int i2, String str5, agkz agkzVar, String str6, long j2, long j3, int i3, long j4, String str7, long j5) {
        this.a = j;
        this.b = str;
        this.p = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = str5;
        this.h = agkzVar;
        this.i = str6;
        this.j = j2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = str7;
        this.o = j5;
    }

    public static plw a() {
        plw plwVar = new plw();
        plwVar.f(0L);
        plwVar.i(0);
        plwVar.e = agpr.a;
        plwVar.j(0L);
        plwVar.h(0L);
        plwVar.g(0);
        plwVar.d(0L);
        plwVar.e(0L);
        return plwVar;
    }

    public static plx d(long j, String str, int i, String str2, String str3, String str4, int i2, String str5, agkz agkzVar, String str6, long j2, long j3, int i3, long j4, String str7, long j5) {
        plw plwVarA = a();
        plwVarA.f(j);
        plwVarA.c(str);
        plwVarA.h = i;
        plwVarA.a = str2;
        plwVarA.b = str3;
        plwVarA.c = str4;
        plwVarA.i(i2);
        plwVarA.d = str5;
        plwVarA.e = agkzVar;
        plwVarA.f = str6;
        plwVarA.j(j2);
        plwVarA.h(j3);
        plwVarA.g(i3);
        plwVarA.d(j4);
        plwVarA.g = str7;
        plwVarA.e(j5);
        return plwVarA.a();
    }

    public final pxk b() {
        int i = this.p;
        if (i == 0) {
            throw null;
        }
        if (i == 1) {
            return new pxo(this.b);
        }
        if (i == 2) {
            return pyd.a;
        }
        if (i == 3) {
            return pyb.a;
        }
        String str = this.b;
        return i != 4 ? new pxn(str, this.o) : new pxl(str);
    }

    public final boolean c() {
        return b().b();
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        agkz agkzVar;
        String str5;
        String str6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof plx) {
            plx plxVar = (plx) obj;
            if (this.a == plxVar.a && this.b.equals(plxVar.b)) {
                int i = this.p;
                int i2 = plxVar.p;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && ((str = this.c) != null ? str.equals(plxVar.c) : plxVar.c == null) && ((str2 = this.d) != null ? str2.equals(plxVar.d) : plxVar.d == null) && ((str3 = this.e) != null ? str3.equals(plxVar.e) : plxVar.e == null) && this.f == plxVar.f && ((str4 = this.g) != null ? str4.equals(plxVar.g) : plxVar.g == null) && ((agkzVar = this.h) != null ? agkzVar.equals(plxVar.h) : plxVar.h == null) && ((str5 = this.i) != null ? str5.equals(plxVar.i) : plxVar.i == null) && this.j == plxVar.j && this.k == plxVar.k && this.l == plxVar.l && this.m == plxVar.m && ((str6 = this.n) != null ? str6.equals(plxVar.n) : plxVar.n == null) && this.o == plxVar.o) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ a.bm(this.p);
        String str = this.c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int iHashCode4 = (((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f) * 1000003;
        String str4 = this.g;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        agkz agkzVar = this.h;
        int iHashCode6 = (iHashCode5 ^ (agkzVar == null ? 0 : agkzVar.hashCode())) * 1000003;
        String str5 = this.i;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        long j2 = this.j;
        int i = (((iHashCode6 ^ iHashCode7) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        long j3 = this.k;
        int i2 = (((i ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.l) * 1000003;
        long j4 = this.m;
        int i3 = (i2 ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        String str6 = this.n;
        int iHashCode8 = str6 != null ? str6.hashCode() : 0;
        long j5 = this.o;
        return ((i3 ^ iHashCode8) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5));
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.b("SpecificId", nxp.a(this.b));
        return ageuVarAc.toString();
    }

    public plx() {
        throw null;
    }
}
