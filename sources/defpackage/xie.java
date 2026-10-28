package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xie {
    public final long a;
    public final long b;
    public final String c;
    public final Optional d;
    public final ajij e;
    public final boolean f;
    public final Optional g;
    public final boolean h;

    public xie(long j, long j2, String str, Optional optional, ajij ajijVar, boolean z, Optional optional2, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = optional;
        this.e = ajijVar;
        this.f = z;
        this.g = optional2;
        this.h = z2;
    }

    public static xid a() {
        xid xidVar = new xid((byte[]) null);
        xidVar.b(false);
        xidVar.c(false);
        xidVar.c = ajij.AUTOMATED_LOG_EVENT_SOURCE_UNKNOWN;
        return xidVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xie) {
            xie xieVar = (xie) obj;
            if (this.a == xieVar.a && this.b == xieVar.b && this.c.equals(xieVar.c) && this.d.equals(xieVar.d) && this.e.equals(xieVar.e) && this.f == xieVar.f && this.g.equals(xieVar.g) && this.h == xieVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((((((((((((((((int) ((j2 >>> 32) ^ j2)) ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true == this.h ? 1231 : 1237);
    }

    public final String toString() {
        Optional optional = this.g;
        ajij ajijVar = this.e;
        return "EventContext{timestamp=" + this.a + ", lastActivityMs=" + this.b + ", identityId=" + this.c + ", visitorId=" + String.valueOf(this.d) + ", automatedLogEventSource=" + String.valueOf(ajijVar) + ", isPageSystem=" + this.f + ", delayedEventTier=" + String.valueOf(optional) + ", isIncognito=" + this.h + '}';
    }

    public xie() {
        throw null;
    }
}
