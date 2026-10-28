package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ojr {
    public final String a;
    public final long b;
    public final agev c;
    public final int d;
    private final agev e;
    private final long f;

    public ojr(String str, long j, int i, agev agevVar, agev agevVar2, long j2) {
        this.a = str;
        this.b = j;
        this.d = i;
        this.c = agevVar;
        this.e = agevVar2;
        this.f = j2;
    }

    public static ojq a() {
        ojq ojqVar = new ojq();
        ojqVar.c = -1L;
        ojqVar.d = (byte) (ojqVar.d | 2);
        agdf agdfVar = agdf.a;
        ojqVar.b = agdfVar;
        ojqVar.b(agdfVar);
        return ojqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ojr) {
            ojr ojrVar = (ojr) obj;
            if (this.a.equals(ojrVar.a) && this.b == ojrVar.b) {
                int i = this.d;
                int i2 = ojrVar.d;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.c.equals(ojrVar.c) && this.e.equals(ojrVar.e) && this.f == ojrVar.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.d;
        a.bj(i);
        int iHashCode2 = (((((iHashCode * 1000003) ^ ((int) this.b)) * 1000003) ^ i) * 1000003) ^ this.c.hashCode();
        long j = this.f;
        return (((iHashCode2 * 1000003) ^ 2040732332) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String str;
        int i = this.d;
        if (i == 1) {
            str = "NETWORK_STATE_CONNECTED";
        } else if (i != 2) {
            str = i != 3 ? "null" : "NETWORK_STATE_ANY";
        } else {
            str = "NETWORK_STATE_UNMETERED";
        }
        long j = this.b;
        String str2 = this.a;
        agev agevVar = this.c;
        agev agevVar2 = this.e;
        long j2 = this.f;
        return "TaskParams{tag=" + str2 + ", periodSeconds=" + j + ", networkState=" + str + ", constraintOverridesOptional=" + String.valueOf(agevVar) + ", flexIntervalOptional=" + String.valueOf(agevVar2) + ", nextScheduleTimeOverride=" + j2 + '}';
    }

    public ojr() {
        throw null;
    }
}
