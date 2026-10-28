package defpackage;

import j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abng {
    public final wjf a;
    public final Instant b;

    public abng(wjf wjfVar, Instant instant) {
        this.a = wjfVar;
        this.b = instant;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abng) {
            abng abngVar = (abng) obj;
            if (this.a.equals(abngVar.a) && this.b.equals(abngVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Instant instant = this.b;
        return "CacheablePlayerResponse{playerResponseModel=" + String.valueOf(this.a) + ", timeStampReceived=" + String.valueOf(instant) + '}';
    }

    public abng() {
        throw null;
    }
}
