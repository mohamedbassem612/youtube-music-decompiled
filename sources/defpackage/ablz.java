package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ablz {
    public final int a;
    public final int b;
    protected final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final SparseArray i;
    private final int j;
    private final long k;
    private final long l;

    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    public ablz(String str, int i, String str2, long j) {
        ahno.F(str != null);
        ahno.F(str2 != null);
        ahno.F((i ^ (-1)) >>> 31);
        this.g = str;
        this.h = i;
        this.l = j;
        String[] strArrSplit = str2.split("#", -1);
        ahno.F(strArrSplit.length == 8);
        int i2 = Integer.parseInt(strArrSplit[0]);
        this.a = i2;
        int i3 = Integer.parseInt(strArrSplit[1]);
        this.b = i3;
        int i4 = Integer.parseInt(strArrSplit[2]);
        this.j = i4;
        int i5 = Integer.parseInt(strArrSplit[3]);
        this.c = i5;
        int i6 = Integer.parseInt(strArrSplit[4]);
        this.d = i6;
        this.k = Long.parseLong(strArrSplit[5]);
        this.e = strArrSplit[6];
        this.f = strArrSplit[7];
        ahno.F(i2 > 0);
        ahno.F(i3 > 0);
        if (j > 0) {
            ahno.F(i4 > 0);
        }
        ahno.F(i5 > 0);
        ahno.F(i6 > 0);
        this.i = new SparseArray();
    }

    public int a(long j) {
        int iB = b() - 1;
        long j2 = this.k;
        float f = j;
        return Math.max(0, Math.min(iB, j2 == 0 ? Math.round(b() * (f / this.l)) : Math.round(f / j2)));
    }

    public int b() {
        return this.j;
    }

    public final int c() {
        return this.c * this.d;
    }

    public int d() {
        if (b() > 0) {
            return (int) Math.ceil(b() / c());
        }
        return 0;
    }

    public final long e() {
        return this.h;
    }
}
