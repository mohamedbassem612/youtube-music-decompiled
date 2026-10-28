package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ybd {
    public final String a;
    public final String b;
    public final Duration c;

    public ybd(String str, String str2, Duration duration) {
        duration.getClass();
        this.a = str;
        this.b = str2;
        this.c = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ybd) {
            ybd ybdVar = (ybd) obj;
            if (awrc.c(this.a, ybdVar.a) && awrc.c(this.b, ybdVar.b) && awrc.c(this.c, ybdVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "StreamState(nextContinuation=" + this.a + ", nextParams=" + this.b + ", timeout=" + this.c + ')';
    }
}
