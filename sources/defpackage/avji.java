package defpackage;

import j$.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avji {
    final int a;
    final long b;
    final long c;
    final double d;
    final Long e;
    final Set f;

    public avji(int i, long j, long j2, double d, Long l, Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = l;
        this.f = agkz.n(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof avji)) {
            return false;
        }
        avji avjiVar = (avji) obj;
        return this.a == avjiVar.a && this.b == avjiVar.b && this.c == avjiVar.c && Double.compare(this.d, avjiVar.d) == 0 && Objects.equals(this.e, avjiVar.e) && Objects.equals(this.f, avjiVar.f);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.e("maxAttempts", this.a);
        ageuVarAc.f("initialBackoffNanos", this.b);
        ageuVarAc.f("maxBackoffNanos", this.c);
        ageuVarAc.c("backoffMultiplier", String.valueOf(this.d));
        ageuVarAc.b("perAttemptRecvTimeoutNanos", this.e);
        ageuVarAc.b("retryableStatusCodes", this.f);
        return ageuVarAc.toString();
    }
}
