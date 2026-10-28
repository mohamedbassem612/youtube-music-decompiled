package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ztv extends ept {
    public final boolean a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final long f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final boolean n;
    private final boolean o;

    public ztv(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2, boolean z3, long j, long j2, long j3) {
        this.a = z;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.b = i4;
        this.c = i5;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = i9;
        this.n = z2;
        this.o = z3;
        this.d = j;
        this.e = j2;
        this.f = j3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ztv)) {
            return false;
        }
        ztv ztvVar = (ztv) obj;
        return this.a == ztvVar.a && this.n == ztvVar.n && this.o == ztvVar.o && this.g == ztvVar.g && this.h == ztvVar.h && this.i == ztvVar.i && this.b == ztvVar.b && this.c == ztvVar.c && this.j == ztvVar.j && this.k == ztvVar.k && this.l == ztvVar.l && this.m == ztvVar.m && this.d == ztvVar.d && this.e == ztvVar.e && this.f == ztvVar.f;
    }

    public final int hashCode() {
        int iAj = ((((((((((((((((((((a.aj(this.a) * 31) + a.aj(this.n)) * 31) + a.aj(this.o)) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.b) * 31) + this.c) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31;
        long j = this.f;
        long j2 = this.e;
        return ((((((iAj + this.m) * 31) + a.ak(this.d)) * 31) + a.ak(j2)) * 31) + a.ak(j);
    }

    public final String toString() {
        Object[] objArr = {Boolean.valueOf(this.a), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(this.m), Boolean.valueOf(this.n), Boolean.valueOf(this.o), Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f)};
        String[] strArrSplit = "attemptedDispatch;maxInFlightFresh;maxInFlightStale;maxInFlightRetry;unsentFresh;unsentStale;unsentRetry;inFlightFresh;inFlightStale;inFlightRetry;pagesBehind;retryBehind;responseTimeoutMs;retryCooldownMs;eventsWakeupMs".split(";");
        StringBuilder sb = new StringBuilder("ztv[");
        int i = 0;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append('=');
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
