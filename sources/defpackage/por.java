package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class por implements poq {
    public final aieh a;
    private final String b;
    private final aidu c;
    private final long d;
    private final long e;
    private final long f;
    private final String g;
    private final aifv h;
    private final long i;
    private final aigj j;
    private final Set k;
    private final aies l;
    private final long m;
    private final String n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;

    public por(String str, int i, aidu aiduVar, int i2, int i3, long j, long j2, long j3, String str2, aifv aifvVar, long j4, int i4, aigj aigjVar, Set set, aies aiesVar, aieh aiehVar, long j5, String str3) {
        this.b = str;
        this.r = i;
        this.c = aiduVar;
        this.o = i2;
        this.p = i3;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = str2;
        this.h = aifvVar;
        this.i = j4;
        this.q = i4;
        this.j = aigjVar;
        this.k = set;
        this.l = aiesVar;
        this.a = aiehVar;
        this.m = j5;
        this.n = str3;
    }

    @Override // defpackage.poq
    public final long a() {
        return this.f;
    }

    @Override // defpackage.poq
    public final long b() {
        return this.d;
    }

    @Override // defpackage.poq
    public final /* synthetic */ aicb c() {
        return nxh.a(this);
    }

    @Override // defpackage.poq
    public final aigj d() {
        return this.j;
    }

    @Override // defpackage.poq
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof por) {
            por porVar = (por) obj;
            if (awrc.c(this.b, porVar.b) && this.r == porVar.r && this.c == porVar.c && this.o == porVar.o && this.p == porVar.p && this.d == porVar.d && this.e == porVar.e && this.f == porVar.f && awrc.c(this.g, porVar.g) && awrc.c(this.h, porVar.h) && this.i == porVar.i && this.q == porVar.q && awrc.c(this.j, porVar.j) && awrc.c(this.k, porVar.k) && awrc.c(this.l, porVar.l) && awrc.c(this.a, porVar.a) && this.m == porVar.m && awrc.c(this.n, porVar.n)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.poq
    public final String f() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = (((this.b.hashCode() * 31) + aiep.a(this.r)) * 31) + this.c.hashCode();
        String str = this.g;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i = this.o;
        long j = this.f;
        int i2 = ((iHashCode * 31) + i) * 31;
        int iAk = (((((((((i2 + this.p) * 31) + a.ak(this.d)) * 31) + a.ak(this.e)) * 31) + a.ak(j)) * 31) + iHashCode2) * 31;
        aifv aifvVar = this.h;
        int iHashCode3 = (((((((((((((((iAk + (aifvVar == null ? 0 : aifvVar.hashCode())) * 31) + a.ak(this.i)) * 31) + this.q) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.a.hashCode()) * 31) + a.ak(this.m)) * 31;
        String str2 = this.n;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ChimeInboxThread(id=" + this.b + ", readState=" + ((Object) aiep.toString$ar$edu(this.r)) + ", deletionStatus=" + this.c + ", countBehavior=" + ((Object) Integer.toString(this.o - 1)) + ", systemTrayBehavior=" + ((Object) Integer.toString(this.p - 1)) + ", lastUpdatedVersion=" + this.d + ", lastNotificationVersion=" + this.e + ", creationId=" + this.f + ", payloadType=" + this.g + ", payload=" + this.h + ", insertionTimeMs=" + this.i + ", storageMode=" + ((Object) Integer.toString(this.q - 1)) + ", opaqueBackendData=" + this.j + ", externalExperimentIds=" + this.k + ", renderingMetadata=" + this.l + ", inboxMessage=" + this.a + ", sendTimestampUsec=" + this.m + ", notificationType=" + this.n + ')';
    }
}
