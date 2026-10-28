package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ljl extends kry {
    private static final Map A;
    private static final Map B;
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public String c;
    public long d;
    public long e;
    public ljo[] f;
    public int g;
    public String h;
    public String i;
    public String j;
    public String k;
    public int l;
    public List m;
    public long n;
    public long o;
    public long p;
    public String q;
    public String r;
    public boolean s;
    public ljv t;
    public lje u;
    public int v;
    public long w;
    public long x;
    public long y;
    public long z;

    static {
        HashMap map = new HashMap();
        A = map;
        map.put(0, "UNSPECIFIED");
        map.put(1, "THROTTLED");
        map.put(2, "BLOCKED");
        map.put(3, "PAY_AS_YOU_GO");
        B = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            B.put((String) entry.getValue(), (Integer) entry.getKey());
        }
        CREATOR = new ljm();
    }

    public ljl(String str, String str2, String str3, long j, long j2, ljo[] ljoVarArr, int i, String str4, String str5, String str6, String str7, int i2, List list, long j3, long j4, long j5, String str8, String str9, boolean z, ljv ljvVar, lje ljeVar, int i3, long j6, long j7, long j8, long j9) {
        this.s = true;
        this.a = str;
        this.h = str4;
        this.i = str5;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = ljoVarArr;
        if (!A.containsKey(Integer.valueOf(i))) {
            throw new IllegalArgumentException(a.bR(i, "Illegal overusage policy: "));
        }
        this.g = i;
        this.n = j3;
        this.o = j4;
        this.p = j5;
        this.q = str8;
        this.r = str9;
        this.j = str6;
        this.s = z;
        this.k = str7;
        this.l = i2;
        this.m = list;
        this.t = ljvVar;
        this.u = ljeVar;
        this.v = i3;
        this.w = j6;
        this.x = j7;
        this.y = j8;
        this.z = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ljl ljlVar = (ljl) obj;
            if (Objects.equals(this.a, ljlVar.a) && Objects.equals(this.b, ljlVar.b) && Objects.equals(this.c, ljlVar.c) && Objects.equals(Long.valueOf(this.d), Long.valueOf(ljlVar.d)) && Objects.equals(Long.valueOf(this.e), Long.valueOf(ljlVar.e)) && Arrays.equals(this.f, ljlVar.f) && Objects.equals(Integer.valueOf(this.g), Integer.valueOf(ljlVar.g)) && Objects.equals(Long.valueOf(this.n), Long.valueOf(ljlVar.n)) && Objects.equals(Long.valueOf(this.o), Long.valueOf(ljlVar.o)) && Objects.equals(Long.valueOf(this.p), Long.valueOf(ljlVar.p)) && Objects.equals(this.q, ljlVar.q) && Objects.equals(this.h, ljlVar.h) && Objects.equals(this.r, ljlVar.r) && Objects.equals(this.i, ljlVar.i) && Objects.equals(Boolean.valueOf(this.s), Boolean.valueOf(ljlVar.s)) && Objects.equals(this.j, ljlVar.j) && Objects.equals(this.k, ljlVar.k) && Objects.equals(Integer.valueOf(this.l), Integer.valueOf(ljlVar.l)) && Objects.equals(this.m, ljlVar.m) && Objects.equals(this.t, ljlVar.t) && Objects.equals(this.u, ljlVar.u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), this.h, this.i, this.j, this.k, Integer.valueOf(this.l), this.m, this.t, this.u)), Integer.valueOf(Arrays.hashCode(this.f)))), Integer.valueOf(this.g), Long.valueOf(this.n), Long.valueOf(this.o), Long.valueOf(this.p), this.q, this.r, Boolean.valueOf(this.s));
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("PlanName", this.a, arrayList);
        kro.p("ExpirationTime", this.b, arrayList);
        kro.p("TrafficCategory", this.c, arrayList);
        kro.p("QuotaBytes", Long.valueOf(this.d), arrayList);
        kro.p("QuotaMinutes", Long.valueOf(this.e), arrayList);
        kro.p("FlexTimeWindows", Arrays.toString(this.f), arrayList);
        int i = this.g;
        String str = (String) A.get(Integer.valueOf(i));
        if (str == null) {
            throw new IllegalArgumentException(a.bR(i, "Illegal overusage policy string: "));
        }
        kro.p("OverUsagePolicy", str, arrayList);
        kro.p("RemainingBytes", Long.valueOf(this.o), arrayList);
        kro.p("RemainingMinutes", Long.valueOf(this.p), arrayList);
        kro.p("ShortDescription", this.j, arrayList);
        kro.p("DisplayRefreshPeriod", this.k, arrayList);
        kro.p("PlanType", Integer.valueOf(this.l), arrayList);
        kro.p("Pmtcs", this.m, arrayList);
        kro.p("SnapshotTime", Long.valueOf(this.n), arrayList);
        kro.p("Description", this.q, arrayList);
        kro.p("PlanId", this.h, arrayList);
        kro.p("Balance", this.r, arrayList);
        kro.p("ModuleName", this.i, arrayList);
        kro.p("IsActive", Boolean.valueOf(this.s), arrayList);
        kro.p("QoeMetrics", this.t, arrayList);
        kro.p("DataPlanUsageHistory", this.u, arrayList);
        return kro.o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.B(parcel, 2, this.b);
        ksy.B(parcel, 3, this.c);
        ksy.m(parcel, 4, this.d);
        ksy.m(parcel, 5, this.e);
        ksy.E(parcel, 6, this.f, i);
        ksy.l(parcel, 7, this.g);
        ksy.B(parcel, 8, this.h);
        ksy.B(parcel, 9, this.i);
        ksy.B(parcel, 10, this.j);
        ksy.B(parcel, 11, this.k);
        ksy.l(parcel, 12, this.l);
        ksy.v(parcel, 13, this.m);
        ksy.m(parcel, 20, this.n);
        ksy.m(parcel, 21, this.o);
        ksy.m(parcel, 22, this.p);
        ksy.B(parcel, 23, this.q);
        ksy.B(parcel, 24, this.r);
        ksy.i(parcel, 25, this.s);
        ksy.A(parcel, 26, this.t, i);
        ksy.A(parcel, 27, this.u, i);
        ksy.l(parcel, 28, this.v);
        ksy.m(parcel, 29, this.w);
        ksy.m(parcel, 30, this.x);
        ksy.m(parcel, 31, this.y);
        ksy.m(parcel, 32, this.z);
        ksy.h(parcel, iG);
    }

    private ljl() {
        this.s = true;
    }
}
