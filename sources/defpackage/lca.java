package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lca {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Boolean k;

    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean, int] */
    public lca(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        kro.i(str);
        kro.i(str2);
        kro.c(((j > 0L ? 1 : (j == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        kro.c(((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        kro.c(((j3 > 0L ? 1 : (j3 == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        kro.c(((j5 > 0L ? 1 : (j5 == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    public final lca a(Long l, Long l2, Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
        }
        return new lca(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, bool);
    }

    public final lca b(long j, long j2) {
        return new lca(this.a, this.b, this.c, this.d, this.e, this.f, j, Long.valueOf(j2), this.i, this.j, this.k);
    }

    public final lca c(long j) {
        return new lca(this.a, this.b, this.c, this.d, this.e, j, this.g, this.h, this.i, this.j, this.k);
    }
}
