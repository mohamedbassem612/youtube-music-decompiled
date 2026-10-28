package defpackage;

import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzs {
    public final UUID a;
    public final dzr b;
    public final Set c;
    public final dyn d;
    private final dyp e;
    private final dyp f;
    private final int g;
    private final int h;
    private final long i;
    private final dzq j;
    private final long k;
    private final int l;
    private final String m;

    public dzs(UUID uuid, dzr dzrVar, Set set, dyp dypVar, dyp dypVar2, int i, int i2, dyn dynVar, long j, dzq dzqVar, long j2, int i3, String str) {
        dypVar2.getClass();
        this.a = uuid;
        this.b = dzrVar;
        this.c = set;
        this.e = dypVar;
        this.f = dypVar2;
        this.g = i;
        this.h = i2;
        this.d = dynVar;
        this.i = j;
        this.j = dzqVar;
        this.k = j2;
        this.l = i3;
        this.m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && awrc.c(getClass(), obj.getClass())) {
            dzs dzsVar = (dzs) obj;
            if (this.g == dzsVar.g && this.h == dzsVar.h && awrc.c(this.a, dzsVar.a) && this.b == dzsVar.b && awrc.c(this.e, dzsVar.e) && awrc.c(this.d, dzsVar.d) && this.i == dzsVar.i && awrc.c(this.j, dzsVar.j) && this.k == dzsVar.k && this.l == dzsVar.l && awrc.c(this.m, dzsVar.m) && awrc.c(this.c, dzsVar.c)) {
                return awrc.c(this.f, dzsVar.f);
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.h) * 31) + this.d.hashCode();
        dzq dzqVar = this.j;
        return (((((((((iHashCode * 31) + a.ak(this.i)) * 31) + (dzqVar != null ? dzqVar.hashCode() : 0)) * 31) + a.ak(this.k)) * 31) + this.l) * 31) + this.m.hashCode();
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.e + ", tags=" + this.c + ", progress=" + this.f + ", runAttemptCount=" + this.g + ", generation=" + this.h + ", constraints=" + this.d + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l + ", workerClassName=" + this.m;
    }
}
