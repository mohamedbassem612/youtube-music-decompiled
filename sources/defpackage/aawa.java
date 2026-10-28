package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aawa {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final boolean f;
    private final tyy g;

    public aawa(boolean z, boolean z2, boolean z3, int i, tyy tyyVar, int i2, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.g = tyyVar;
        this.e = i2;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aawa) {
            aawa aawaVar = (aawa) obj;
            if (this.a == aawaVar.a && this.b == aawaVar.b && this.c == aawaVar.c && this.d == aawaVar.d && this.g.equals(aawaVar.g) && this.e == aawaVar.e && this.f == aawaVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.e) * 1000003) ^ (true != this.f ? 1237 : 1231);
    }

    public final String toString() {
        return "PlayerModuleConfig{onesieEnabled=" + this.a + ", enableVss2StatsTracking=" + this.b + ", enableRawCcSupport=false, enableLegacyHeartbeatFlow=" + this.c + ", backgroundNotificationIconResourceId=" + this.d + ", referringAppProvider=" + String.valueOf(this.g) + ", maximumConsecutiveSkippedUnplayableVideos=" + this.e + ", enableVss2UserPresenceTracking=" + this.f + '}';
    }

    public aawa() {
        throw null;
    }
}
