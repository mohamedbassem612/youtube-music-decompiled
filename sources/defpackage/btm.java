package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btm {
    public static final Object a = new Object();
    private static final bss r;

    @Deprecated
    public Object c;
    public Object e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public boolean j;
    public bso k;
    public boolean l;
    public long m;
    public long n;
    public int o;
    public int p;
    public long q;
    public Object b = a;
    public bss d = r;

    static {
        bsi bsiVar = new bsi();
        bsiVar.a = "androidx.media3.common.Timeline";
        bsiVar.b = Uri.EMPTY;
        r = bsiVar.a();
        int i = bwp.a;
    }

    public final long a() {
        return bwp.F(this.m);
    }

    public final long b() {
        return bwp.F(this.n);
    }

    public final long c() {
        return bwp.F(this.q);
    }

    public final boolean d() {
        return this.k != null;
    }

    public final void e(Object obj, bss bssVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, bso bsoVar, long j4, long j5, int i, long j6) {
        bsp bspVar;
        this.b = obj;
        this.d = bssVar != null ? bssVar : r;
        Object obj3 = null;
        if (bssVar != null && (bspVar = bssVar.c) != null) {
            obj3 = bspVar.h;
        }
        this.c = obj3;
        this.e = obj2;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = z;
        this.j = z2;
        this.k = bsoVar;
        this.m = j4;
        this.n = j5;
        this.o = 0;
        this.p = i;
        this.q = j6;
        this.l = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            btm btmVar = (btm) obj;
            if (Objects.equals(this.b, btmVar.b) && Objects.equals(this.d, btmVar.d) && Objects.equals(this.e, btmVar.e) && Objects.equals(this.k, btmVar.k) && this.f == btmVar.f && this.g == btmVar.g && this.h == btmVar.h && this.i == btmVar.i && this.j == btmVar.j && this.l == btmVar.l && this.m == btmVar.m && this.n == btmVar.n && this.o == btmVar.o && this.p == btmVar.p && this.q == btmVar.q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.b.hashCode() + 217) * 31) + this.d.hashCode();
        Object obj = this.e;
        int iHashCode2 = ((iHashCode * 31) + (obj == null ? 0 : obj.hashCode())) * 31;
        bso bsoVar = this.k;
        return ((((((((((((((((((((((iHashCode2 + (bsoVar != null ? bsoVar.hashCode() : 0)) * 31) + a.ak(this.f)) * 31) + a.ak(this.g)) * 31) + a.ak(this.h)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31) + a.ak(this.m)) * 31) + a.ak(this.n)) * 31) + this.o) * 31) + this.p) * 31) + a.ak(this.q);
    }
}
