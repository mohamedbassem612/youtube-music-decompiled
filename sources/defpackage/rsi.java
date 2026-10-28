package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rsi {
    public static final long a;
    public static final long b;
    public static final long c;
    public static final long d;
    public final String e;
    public final long f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    private final long l;
    private final long m;
    private final boolean n;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        a = 420000L;
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        b = 900000L;
        TimeUnit timeUnit3 = TimeUnit.SECONDS;
        c = 15000L;
        TimeUnit timeUnit4 = TimeUnit.SECONDS;
        d = 15000L;
    }

    public rsi(String str, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.e = str;
        this.l = j;
        this.m = j2;
        this.f = j3;
        this.g = j4;
        this.h = z;
        this.i = z2;
        this.n = z3;
        this.j = z4;
        this.k = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rsi) {
            rsi rsiVar = (rsi) obj;
            if (this.e.equals(rsiVar.e) && this.l == rsiVar.l && this.m == rsiVar.m && this.f == rsiVar.f && this.g == rsiVar.g && this.h == rsiVar.h && this.i == rsiVar.i && this.n == rsiVar.n && this.j == rsiVar.j && this.k == rsiVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.e.hashCode() ^ 1000003;
        int i = true != this.h ? 1237 : 1231;
        long j = this.l;
        long j2 = this.m;
        long j3 = this.f;
        int i2 = ((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        long j4 = this.g;
        return ((((((((((((((((((((((((((i2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * (-721379959)) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ i) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ this.k;
    }

    public final String toString() {
        return "AdsModuleConfig{getAppVersionForAds=" + this.e + ", getMidrollAdsFreqCapMillis=" + this.l + ", getImmediateAdExpireTimeMillis=" + this.m + ", getAdsTimeoutMillis=" + this.f + ", getAdWarningMillis=0, getMidrollPrefetchMillis=" + this.g + ", trackUserPresence=" + this.h + ", shouldAllowInnertubeCaching=" + this.i + ", shouldEmitAdClickthroughReportedEvent=false, shouldPreventYoutubeHeaders=false, shouldPreventAdsHeaders=false, shouldBlockAds=false, shouldBlockOfflineAds=" + this.n + ", shouldGenerateDebugSlotIds=false, shouldGenerateDebugLayoutIds=false, shouldSendAdsClientMonitoringLogsAsync=" + this.j + ", getAdsClientMonitoringDelayLogMs=" + this.k + '}';
    }

    public rsi() {
        throw null;
    }
}
