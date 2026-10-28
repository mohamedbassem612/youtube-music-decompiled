package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaeg {
    public final boolean a;

    public aaeg(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof aaeg) && this.a == ((aaeg) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 385623362) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "AutoOfflineConfig{channelAutoOfflineEnabled=false, videoListAutoOfflineEnabled=" + this.a + ", offlineCandidatesEnabled=false, offlineSubscriptionsSyncEnabled=false}";
    }

    public aaeg() {
        throw null;
    }
}
