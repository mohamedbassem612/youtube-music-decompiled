package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zia {
    public static final zia a = a(-1, -1, 0, 0, -1, -1, -1, null);
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final long h;
    public final String i;

    public zia(long j, long j2, long j3, long j4, int i, long j5, long j6, String str) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = i;
        this.g = j5;
        this.h = j6;
        this.i = str;
    }

    public static zia a(long j, long j2, long j3, long j4, int i, long j5, long j6, String str) {
        int i2 = typ.a;
        return new zia(j, j2, j3, j4, i, j5, j6, str == null ? "" : str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zia) {
            zia ziaVar = (zia) obj;
            if (this.b == ziaVar.b && this.c == ziaVar.c && this.d == ziaVar.d && this.e == ziaVar.e && this.f == ziaVar.f && this.g == ziaVar.g && this.h == ziaVar.h && this.i.equals(ziaVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.h;
        long j2 = this.b;
        int i = (int) ((j2 >>> 32) ^ j2);
        String str = this.i;
        long j3 = (j >>> 32) ^ j;
        long j4 = this.g;
        long j5 = (j4 >>> 32) ^ j4;
        long j6 = this.e;
        long j7 = (j6 >>> 32) ^ j6;
        long j8 = this.d;
        long j9 = (j8 >>> 32) ^ j8;
        long j10 = this.c;
        return ((((((((((((((i ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ ((int) j9)) * 1000003) ^ ((int) j7)) * 1000003) ^ this.f) * 1000003) ^ ((int) j5)) * 1000003) ^ ((int) j3)) * 1000003) ^ str.hashCode();
    }

    public final String toString() {
        return "MedialibPlayerTimeInfo{currentPositionMillis=" + this.b + ", currentUtcTimeMillis=" + this.c + ", durationMillis=" + this.d + ", bufferedPositionMillis=" + this.e + ", liveEndToEndLatencyMillis=" + this.f + ", liveHeadSq=" + this.g + ", liveHeadMediaTimeMs=" + this.h + ", cpn=" + this.i + '}';
    }

    public zia() {
        throw null;
    }
}
