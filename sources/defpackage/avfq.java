package defpackage;

import j$.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avfq {
    final int a;
    final long b;
    final Set c;

    public avfq(int i, long j, Set set) {
        this.a = i;
        this.b = j;
        this.c = agkz.n(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            avfq avfqVar = (avfq) obj;
            if (this.a == avfqVar.a && this.b == avfqVar.b && Objects.equals(this.c, avfqVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Long.valueOf(this.b), this.c);
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.e("maxAttempts", this.a);
        ageuVarAc.f("hedgingDelayNanos", this.b);
        ageuVarAc.b("nonFatalStatusCodes", this.c);
        return ageuVarAc.toString();
    }
}
