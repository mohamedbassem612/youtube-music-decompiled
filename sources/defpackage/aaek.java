package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaek {
    public final boolean a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;

    public aaek(boolean z, int i, int i2, long j, long j2, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaek) {
            aaek aaekVar = (aaek) obj;
            if (this.a == aaekVar.a && this.b == aaekVar.b && this.c == aaekVar.c && this.d == aaekVar.d && this.e == aaekVar.e && this.f == aaekVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ this.b) * 1000003;
        int i2 = this.c;
        long j = this.d;
        long j2 = this.e;
        return ((((((((i ^ i2) * 1000003) ^ ((int) j)) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ 1237) * (-721379959)) ^ (true != this.f ? 1237 : 1231);
    }

    public final String toString() {
        return "OfflineModuleConfig{enablePlaylistAutoSync=" + this.a + ", enableYouTubeBundles=false, transferRetryStrategy=" + this.b + ", transferMaxRetries=" + this.c + ", transferBaseRetryMilliSecs=" + this.d + ", transferMaxRetryMilliSecs=" + this.e + ", disableOfflineWhenDatabaseOpenException=false, databaseOpenRetries=0, enableFallbackToAudioOnlyDownload=" + this.f + '}';
    }

    public aaek() {
        throw null;
    }
}
