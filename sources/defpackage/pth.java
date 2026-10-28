package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pth {
    public final int a;
    public final String b;
    public final aidu c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final aifv h;
    public final long i;
    public final aigj j;
    public final pti k;
    public final aigj l;
    public final String m;
    public final aigj n;
    public final long o;
    public final String p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;

    public pth(int i, String str, int i2, aidu aiduVar, int i3, int i4, long j, long j2, long j3, String str2, aifv aifvVar, long j4, int i5, aigj aigjVar, pti ptiVar, aigj aigjVar2, String str3, aigj aigjVar3, long j5, String str4) {
        ptiVar.getClass();
        this.a = i;
        this.b = str;
        this.t = i2;
        this.c = aiduVar;
        this.q = i3;
        this.r = i4;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = str2;
        this.h = aifvVar;
        this.i = j4;
        this.s = i5;
        this.j = aigjVar;
        this.k = ptiVar;
        this.l = aigjVar2;
        this.m = str3;
        this.n = aigjVar3;
        this.o = j5;
        this.p = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pth) {
            pth pthVar = (pth) obj;
            if (this.a == pthVar.a && awrc.c(this.b, pthVar.b) && this.t == pthVar.t && this.c == pthVar.c && this.q == pthVar.q && this.r == pthVar.r && this.d == pthVar.d && this.e == pthVar.e && this.f == pthVar.f && awrc.c(this.g, pthVar.g) && awrc.c(this.h, pthVar.h) && this.i == pthVar.i && this.s == pthVar.s && awrc.c(this.j, pthVar.j) && this.k == pthVar.k && awrc.c(this.l, pthVar.l) && awrc.c(this.m, pthVar.m) && awrc.c(this.n, pthVar.n) && this.o == pthVar.o && awrc.c(this.p, pthVar.p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a * 31) + this.b.hashCode()) * 31) + aiep.a(this.t)) * 31) + this.c.hashCode();
        String str = this.g;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i = this.q;
        long j = this.f;
        int i2 = ((iHashCode * 31) + i) * 31;
        int iAk = (((((((((i2 + this.r) * 31) + a.ak(this.d)) * 31) + a.ak(this.e)) * 31) + a.ak(j)) * 31) + iHashCode2) * 31;
        aifv aifvVar = this.h;
        int iHashCode3 = (((((((((((((((((iAk + (aifvVar == null ? 0 : aifvVar.hashCode())) * 31) + a.ak(this.i)) * 31) + this.s) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + a.ak(this.o)) * 31;
        String str2 = this.p;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ChimeThreadEntity(databaseId=" + this.a + ", threadId=" + this.b + ", readState=" + ((Object) aiep.toString$ar$edu(this.t)) + ", deletionStatus=" + this.c + ", countBehavior=" + ((Object) Integer.toString(this.q - 1)) + ", systemTrayBehavior=" + ((Object) Integer.toString(this.r - 1)) + ", lastUpdatedVersion=" + this.d + ", lastNotificationVersion=" + this.e + ", creationId=" + this.f + ", payloadType=" + this.g + ", payload=" + this.h + ", insertionTimeMs=" + this.i + ", storageMode=" + ((Object) Integer.toString(this.s - 1)) + ", opaqueBackendData=" + this.j + ", threadType=" + this.k + ", typeSpecificData=" + this.l + ", externalExperimentIds=" + this.m + ", renderingMetadata=" + this.n + ", sendTimestampUsec=" + this.o + ", notificationType=" + this.p + ')';
    }
}
