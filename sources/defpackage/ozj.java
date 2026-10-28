package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ozj {
    private final int A;
    private final int B;
    public final String a;
    public final aidq b;
    public final aifv c;
    public final List d;
    private final aidu e;
    private final long f;
    private final long g;
    private final List h;
    private final long i;
    private final String j;
    private final String k;
    private final String l;
    private final long m;
    private final long n;
    private final long o;
    private final aifh p;
    private final aigj q;
    private final Set r;
    private final aies s;
    private final long t;
    private final String u;
    private final aids v;
    private final Set w;
    private final Set x;
    private final int y;
    private final int z;

    public ozj(String str, int i, aidu aiduVar, int i2, int i3, long j, long j2, aidq aidqVar, List list, long j3, String str2, aifv aifvVar, String str3, String str4, long j4, long j5, long j6, int i4, aifh aifhVar, List list2, aigj aigjVar, Set set, aies aiesVar, long j7, String str5, aids aidsVar, Set set2, Set set3) {
        this.a = str;
        this.B = i;
        this.e = aiduVar;
        this.y = i2;
        this.z = i3;
        this.f = j;
        this.g = j2;
        this.b = aidqVar;
        this.h = list;
        this.i = j3;
        this.j = str2;
        this.c = aifvVar;
        this.k = str3;
        this.l = str4;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.A = i4;
        this.p = aifhVar;
        this.d = list2;
        this.q = aigjVar;
        this.r = set;
        this.s = aiesVar;
        this.t = j7;
        this.u = str5;
        this.v = aidsVar;
        this.w = set2;
        this.x = set3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ozj) {
            ozj ozjVar = (ozj) obj;
            if (awrc.c(this.a, ozjVar.a) && this.B == ozjVar.B && this.e == ozjVar.e && this.y == ozjVar.y && this.z == ozjVar.z && this.f == ozjVar.f && this.g == ozjVar.g && awrc.c(this.b, ozjVar.b) && awrc.c(this.h, ozjVar.h) && this.i == ozjVar.i && awrc.c(this.j, ozjVar.j) && awrc.c(this.c, ozjVar.c) && awrc.c(this.k, ozjVar.k) && awrc.c(this.l, ozjVar.l) && this.m == ozjVar.m && this.n == ozjVar.n && this.o == ozjVar.o && this.A == ozjVar.A && awrc.c(this.p, ozjVar.p) && awrc.c(this.d, ozjVar.d) && awrc.c(this.q, ozjVar.q) && awrc.c(this.r, ozjVar.r) && awrc.c(this.s, ozjVar.s) && this.t == ozjVar.t && awrc.c(this.u, ozjVar.u) && awrc.c(this.v, ozjVar.v) && awrc.c(this.w, ozjVar.w) && awrc.c(this.x, ozjVar.x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((((this.a.hashCode() * 31) + aiep.a(this.B)) * 31) + this.e.hashCode()) * 31) + this.y) * 31) + this.z) * 31) + a.ak(this.f)) * 31) + a.ak(this.g)) * 31) + this.b.hashCode()) * 31) + this.h.hashCode();
        String str = this.j;
        int iAk = ((((iHashCode * 31) + a.ak(this.i)) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        aifv aifvVar = this.c;
        int iHashCode2 = (iAk + (aifvVar == null ? 0 : aifvVar.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode3 = (((((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.l.hashCode()) * 31) + a.ak(this.m)) * 31) + a.ak(this.n)) * 31) + a.ak(this.o)) * 31) + this.A) * 31;
        aifh aifhVar = this.p;
        int iHashCode4 = (((((((iHashCode3 + (aifhVar == null ? 0 : aifhVar.hashCode())) * 31) + this.d.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31;
        aies aiesVar = this.s;
        int iHashCode5 = (((iHashCode4 + (aiesVar == null ? 0 : aiesVar.hashCode())) * 31) + a.ak(this.t)) * 31;
        String str3 = this.u;
        return ((((((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.v.hashCode()) * 31) + this.w.hashCode()) * 31) + this.x.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChimeThread(id=");
        sb.append(this.a);
        sb.append(", readState=");
        sb.append((Object) aiep.toString$ar$edu(this.B));
        sb.append(", deletionStatus=");
        sb.append(this.e);
        sb.append(", countBehavior=");
        sb.append((Object) Integer.toString(this.y - 1));
        sb.append(", systemTrayBehavior=");
        sb.append((Object) Integer.toString(this.z - 1));
        sb.append(", lastUpdatedVersion=");
        sb.append(this.f);
        sb.append(", lastNotificationVersion=");
        sb.append(this.g);
        sb.append(", androidSdkMessage=");
        sb.append(this.b);
        sb.append(", notificationMetadataList=");
        sb.append(this.h);
        sb.append(", creationId=");
        sb.append(this.i);
        sb.append(", payloadType=");
        sb.append(this.j);
        sb.append(", payload=");
        sb.append(this.c);
        sb.append(", updateThreadStateToken=");
        sb.append(this.k);
        sb.append(", groupId=");
        sb.append(this.l);
        sb.append(", expirationTimestampUsec=");
        sb.append(this.m);
        sb.append(", expirationDurationAfterDisplayMs=");
        sb.append(this.n);
        sb.append(", insertionTimeMs=");
        sb.append(this.o);
        sb.append(", storageMode=");
        sb.append((Object) Integer.toString(this.A - 1));
        sb.append(", schedule=");
        sb.append(this.p);
        sb.append(", actionList=");
        sb.append(this.d);
        sb.append(", opaqueBackendData=");
        sb.append(this.q);
        sb.append(", externalExperimentIds=");
        sb.append(this.r);
        sb.append(", renderingMetadata=");
        sb.append(this.s);
        Set set = this.x;
        Set set2 = this.w;
        aids aidsVar = this.v;
        String str = this.u;
        long j = this.t;
        sb.append(", sendTimestampUsec=");
        sb.append(j);
        sb.append(", notificationType=");
        sb.append(str);
        sb.append(", counterfactualConfig=");
        sb.append(aidsVar);
        sb.append(", businessExperimentIds=");
        sb.append(set2);
        sb.append(", healthExperimentIds=");
        sb.append(set);
        sb.append(')');
        return sb.toString();
    }
}
