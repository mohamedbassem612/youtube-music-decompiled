package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eer {
    public final String a;
    public final dzr b;
    public final dyp c;
    public final long d;
    public final long e;
    public final long f;
    public final dyn g;
    public final int h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final long m;
    public final int n;
    public final List o;
    public final String p;
    public final List q;
    public final int r;

    public eer(String str, dzr dzrVar, dyp dypVar, long j, long j2, long j3, dyn dynVar, int i, int i2, long j4, long j5, int i3, int i4, long j6, int i5, List list, String str2, List list2) {
        dypVar.getClass();
        this.a = str;
        this.b = dzrVar;
        this.c = dypVar;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = dynVar;
        this.h = i;
        this.r = i2;
        this.i = j4;
        this.j = j5;
        this.k = i3;
        this.l = i4;
        this.m = j6;
        this.n = i5;
        this.o = list;
        this.p = str2;
        this.q = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eer) {
            eer eerVar = (eer) obj;
            if (awrc.c(this.a, eerVar.a) && this.b == eerVar.b && awrc.c(this.c, eerVar.c) && this.d == eerVar.d && this.e == eerVar.e && this.f == eerVar.f && awrc.c(this.g, eerVar.g) && this.h == eerVar.h && this.r == eerVar.r && this.i == eerVar.i && this.j == eerVar.j && this.k == eerVar.k && this.l == eerVar.l && this.m == eerVar.m && this.n == eerVar.n && awrc.c(this.o, eerVar.o) && awrc.c(this.p, eerVar.p) && awrc.c(this.q, eerVar.q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        dyn dynVar = this.g;
        long j = this.f;
        int iAk = (((((((iHashCode * 31) + a.ak(this.d)) * 31) + a.ak(this.e)) * 31) + a.ak(j)) * 31) + dynVar.hashCode();
        List list = this.o;
        long j2 = this.m;
        long j3 = this.j;
        return (((((((((((((((((((((iAk * 31) + this.h) * 31) + this.r) * 31) + a.ak(this.i)) * 31) + a.ak(j3)) * 31) + this.k) * 31) + this.l) * 31) + a.ak(j2)) * 31) + this.n) * 31) + list.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkInfoPojo(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", output=");
        sb.append(this.c);
        sb.append(", initialDelay=");
        sb.append(this.d);
        sb.append(", intervalDuration=");
        sb.append(this.e);
        sb.append(", flexDuration=");
        sb.append(this.f);
        sb.append(", constraints=");
        sb.append(this.g);
        sb.append(", runAttemptCount=");
        sb.append(this.h);
        sb.append(", backoffPolicy=");
        sb.append((Object) (this.r != 1 ? "LINEAR" : "EXPONENTIAL"));
        sb.append(", backoffDelayDuration=");
        sb.append(this.i);
        sb.append(", lastEnqueueTime=");
        sb.append(this.j);
        sb.append(", periodCount=");
        sb.append(this.k);
        sb.append(", generation=");
        sb.append(this.l);
        sb.append(", nextScheduleTimeOverride=");
        sb.append(this.m);
        sb.append(", stopReason=");
        sb.append(this.n);
        sb.append(", tags=");
        sb.append(this.o);
        sb.append(", workerClassName=");
        sb.append(this.p);
        sb.append(", progress=");
        sb.append(this.q);
        sb.append(')');
        return sb.toString();
    }
}
