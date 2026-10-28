package defpackage;

import android.util.Log;
import androidx.work.OverwritingInputMerger;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ees {
    public static final String a = dzf.a("WorkSpec");
    public static final vx b = new miu(1);
    public int A;
    public final String c;
    public dzr d;
    public String e;
    public String f;
    public dyp g;
    public dyp h;
    public long i;
    public long j;
    public long k;
    public dyn l;
    public int m;
    public long n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public int s;
    public final int t;
    public long u;
    public int v;
    public final int w;
    public String x;
    public Boolean y;
    public int z;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ees(String str, dzr dzrVar, String str2, String str3, dyp dypVar, dyp dypVar2, long j, long j2, long j3, dyn dynVar, int i, int i2, long j4, long j5, long j6, long j7, boolean z, int i3, int i4, long j8, int i5, int i6, String str4, Boolean bool, int i7) {
        String str5;
        dzr dzrVar2 = (i7 & 2) != 0 ? dzr.a : dzrVar;
        if ((i7 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            name.getClass();
            str5 = name;
        } else {
            str5 = str3;
        }
        dyp dypVar3 = (i7 & 16) != 0 ? dyp.a : dypVar;
        dyp dypVar4 = (i7 & 32) != 0 ? dyp.a : dypVar2;
        long j9 = (i7 & 64) != 0 ? 0L : j;
        long j10 = (i7 & SemanticState.Focused) != 0 ? 0L : j2;
        long j11 = (i7 & SemanticState.Hidden) != 0 ? 0L : j3;
        dyn dynVar2 = (i7 & SemanticState.LiveRegion) != 0 ? dyn.a : dynVar;
        int i8 = (i7 & SemanticState.ReadOnly) != 0 ? 0 : i;
        this(str, dzrVar2, str2, str5, dypVar3, dypVar4, j9, j10, j11, dynVar2, i8, (i7 & SemanticState.Modal) != 0 ? 1 : i2, (i7 & SemanticState.Obscured) != 0 ? 30000L : j4, (i7 & SemanticState.Multiline) != 0 ? -1L : j5, (i7 & 16384) != 0 ? 0L : j6, (32768 & i7) == 0 ? j7 : -1L, ((65536 & i7) == 0) & z, (131072 & i7) != 0 ? 1 : i3, (262144 & i7) != 0 ? 0 : i4, 0, (1048576 & i7) != 0 ? Long.MAX_VALUE : j8, (2097152 & i7) != 0 ? 0 : i5, (4194304 & i7) != 0 ? -256 : i6, (8388608 & i7) != 0 ? null : str4, (i7 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public static /* synthetic */ ees f(ees eesVar, String str, dzr dzrVar, String str2, dyp dypVar, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        String str3 = (i5 & 1) != 0 ? eesVar.c : str;
        dzr dzrVar2 = (i5 & 2) != 0 ? eesVar.d : dzrVar;
        String str4 = (i5 & 4) != 0 ? eesVar.e : str2;
        String str5 = (i5 & 8) != 0 ? eesVar.f : null;
        dyp dypVar2 = (i5 & 16) != 0 ? eesVar.g : dypVar;
        dyp dypVar3 = (i5 & 32) != 0 ? eesVar.h : null;
        long j3 = (i5 & 64) != 0 ? eesVar.i : 0L;
        long j4 = (i5 & SemanticState.Focused) != 0 ? eesVar.j : 0L;
        dyp dypVar4 = dypVar2;
        long j5 = (i5 & SemanticState.Hidden) != 0 ? eesVar.k : 0L;
        dyn dynVar = (i5 & SemanticState.LiveRegion) != 0 ? eesVar.l : null;
        int i6 = (i5 & SemanticState.ReadOnly) != 0 ? eesVar.m : i;
        int i7 = (i5 & SemanticState.Modal) != 0 ? eesVar.A : 0;
        String str6 = str3;
        dzr dzrVar3 = dzrVar2;
        long j6 = (i5 & SemanticState.Obscured) != 0 ? eesVar.n : 0L;
        long j7 = (i5 & SemanticState.Multiline) != 0 ? eesVar.o : j;
        long j8 = (i5 & 16384) != 0 ? eesVar.p : 0L;
        long j9 = (i5 & 32768) != 0 ? eesVar.q : 0L;
        boolean z = (i5 & 65536) != 0 ? eesVar.r : false;
        int i8 = (i5 & 131072) != 0 ? eesVar.z : 0;
        int i9 = (i5 & 262144) != 0 ? eesVar.s : i2;
        int i10 = (i5 & 524288) != 0 ? eesVar.t : i3;
        long j10 = j9;
        long j11 = (i5 & 1048576) != 0 ? eesVar.u : j2;
        int i11 = (i5 & 2097152) != 0 ? eesVar.v : i4;
        int i12 = eesVar.w;
        String str7 = eesVar.x;
        Boolean bool = eesVar.y;
        str6.getClass();
        dzrVar3.getClass();
        str4.getClass();
        str5.getClass();
        dypVar4.getClass();
        dypVar3.getClass();
        dynVar.getClass();
        if (i7 == 0 || i8 == 0) {
            throw null;
        }
        return new ees(str6, dzrVar3, str4, str5, dypVar4, dypVar3, j3, j4, j5, dynVar, i6, i7, j6, j7, j8, j10, z, i8, i9, i10, j11, i11, i12, str7, bool);
    }

    public final long a() {
        return bou.f(d(), this.m, this.A, this.n, this.o, this.s, e(), this.i, this.k, this.j, this.u);
    }

    public final void b(long j, long j2) {
        if (j < 900000) {
            dzf.b();
            Log.w(a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.j = j >= 900000 ? j : 900000L;
        if (j2 < 300000) {
            dzf.b();
            Log.w(a, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > this.j) {
            dzf.b();
            Log.w(a, a.bS(j, "Flex duration greater than interval duration; Changed to "));
        }
        this.k = awro.j(j2, 300000L, this.j);
    }

    public final boolean c() {
        return !awrc.c(dyn.a, this.l);
    }

    public final boolean d() {
        return this.d == dzr.a && this.m > 0;
    }

    public final boolean e() {
        return this.j != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ees) {
            ees eesVar = (ees) obj;
            if (awrc.c(this.c, eesVar.c) && this.d == eesVar.d && awrc.c(this.e, eesVar.e) && awrc.c(this.f, eesVar.f) && awrc.c(this.g, eesVar.g) && awrc.c(this.h, eesVar.h) && this.i == eesVar.i && this.j == eesVar.j && this.k == eesVar.k && awrc.c(this.l, eesVar.l) && this.m == eesVar.m && this.A == eesVar.A && this.n == eesVar.n && this.o == eesVar.o && this.p == eesVar.p && this.q == eesVar.q && this.r == eesVar.r && this.z == eesVar.z && this.s == eesVar.s && this.t == eesVar.t && this.u == eesVar.u && this.v == eesVar.v && this.w == eesVar.w && awrc.c(this.x, eesVar.x) && awrc.c(this.y, eesVar.y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
        long j = this.i;
        long j2 = this.j;
        long j3 = this.k;
        int iHashCode2 = (((((((((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.l.hashCode()) * 31) + this.m) * 31) + a.bm(this.A);
        long j4 = this.n;
        long j5 = j4 ^ (j4 >>> 32);
        long j6 = this.o;
        long j7 = j6 ^ (j6 >>> 32);
        long j8 = this.p;
        long j9 = j8 ^ (j8 >>> 32);
        long j10 = this.q;
        long j11 = j10 ^ (j10 >>> 32);
        int i = true != this.r ? 1237 : 1231;
        int i2 = this.z;
        a.by(i2);
        int i3 = (((((((((((((iHashCode2 * 31) + ((int) j5)) * 31) + ((int) j7)) * 31) + ((int) j9)) * 31) + ((int) j11)) * 31) + i) * 31) + i2) * 31) + this.s;
        long j12 = this.u;
        int i4 = ((((((((i3 * 31) + this.t) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.v) * 31) + this.w) * 31;
        String str = this.x;
        int iHashCode3 = (i4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.y;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "{WorkSpec: " + this.c + '}';
    }

    public ees(String str, dzr dzrVar, String str2, String str3, dyp dypVar, dyp dypVar2, long j, long j2, long j3, dyn dynVar, int i, int i2, long j4, long j5, long j6, long j7, boolean z, int i3, int i4, int i5, long j8, int i6, int i7, String str4, Boolean bool) {
        dzrVar.getClass();
        str2.getClass();
        str3.getClass();
        dypVar.getClass();
        dypVar2.getClass();
        dynVar.getClass();
        if (i2 == 0 || i3 == 0) {
            throw null;
        }
        this.c = str;
        this.d = dzrVar;
        this.e = str2;
        this.f = str3;
        this.g = dypVar;
        this.h = dypVar2;
        this.i = j;
        this.j = j2;
        this.k = j3;
        this.l = dynVar;
        this.m = i;
        this.A = i2;
        this.n = j4;
        this.o = j5;
        this.p = j6;
        this.q = j7;
        this.r = z;
        this.z = i3;
        this.s = i4;
        this.t = i5;
        this.u = j8;
        this.v = i6;
        this.w = i7;
        this.x = str4;
        this.y = bool;
    }
}
