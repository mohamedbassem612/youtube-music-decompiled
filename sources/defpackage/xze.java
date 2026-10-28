package defpackage;

import j$.time.Instant;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xze {
    public final String a;
    public final Instant b;
    public final String c;
    public final String d;
    public final int e;
    public final amyv f;
    public final xyj g;
    public final Optional h;
    public final Optional i;
    public final xwc j;
    public final int k;

    public xze(int i, String str, Instant instant, String str2, String str3, xwc xwcVar, int i2, amyv amyvVar, xyj xyjVar, Optional optional, Optional optional2) {
        if (i == 0) {
            throw null;
        }
        str.getClass();
        instant.getClass();
        str2.getClass();
        str3.getClass();
        amyvVar.getClass();
        optional.getClass();
        optional2.getClass();
        this.k = i;
        this.a = str;
        this.b = instant;
        this.c = str2;
        this.d = str3;
        this.j = xwcVar;
        this.e = i2;
        this.f = amyvVar;
        this.g = xyjVar;
        this.h = optional;
        this.i = optional2;
    }

    public final long a() {
        return this.b.toEpochMilli();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xze) {
            xze xzeVar = (xze) obj;
            if (this.k == xzeVar.k && awrc.c(this.a, xzeVar.a) && awrc.c(this.b, xzeVar.b) && awrc.c(this.c, xzeVar.c) && awrc.c(this.d, xzeVar.d) && awrc.c(this.j, xzeVar.j) && this.e == xzeVar.e && this.f == xzeVar.f && awrc.c(this.g, xzeVar.g) && awrc.c(this.h, xzeVar.h) && awrc.c(this.i, xzeVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.k * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        xwc xwcVar = this.j;
        int iHashCode2 = ((((((iHashCode * 31) + (xwcVar == null ? 0 : xwcVar.hashCode())) * 31) + this.e) * 31) + this.f.hashCode()) * 31;
        xyj xyjVar = this.g;
        return ((((iHashCode2 + (xyjVar != null ? xyjVar.hashCode() : 0)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "MdxSessionInfo(sessionType=" + ((Object) Integer.toString(this.k - 1)) + ", sessionNonce=" + this.a + ", startedTime=" + this.b + ", mediaRouteId=" + this.c + ", screenName=" + this.d + ", pairingCode=" + this.j + ", sessionIndex=" + this.e + ", mdxSessionSource=" + this.f + ", dialSessionInfo=" + this.g + ", connectedInfo=" + this.h + ", loggedDisconnectReason=" + this.i + ')';
    }
}
