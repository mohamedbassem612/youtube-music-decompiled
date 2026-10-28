package defpackage;

import app.rive.semantics.SemanticState;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pot implements poq {
    public final int A;
    public final int B;
    public final String a;
    public final aidu b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final aifv g;
    public final long h;
    public final aigj i;
    public final String j;
    public final Set k;
    public final aies l;
    public final long m;
    public final String n;
    public final aidq o;
    public final List p;
    public final String q;
    public final long r;
    public final long s;
    public final aifh t;
    public final List u;
    public final aids v;
    public final Set w;
    public final Set x;
    public final int y;
    public final int z;

    public pot(String str, int i, aidu aiduVar, int i2, int i3, long j, long j2, long j3, String str2, aifv aifvVar, long j4, int i4, aigj aigjVar, String str3, Set set, aies aiesVar, long j5, String str4, aidq aidqVar, List list, String str5, long j6, long j7, aifh aifhVar, List list2, aids aidsVar, Set set2, Set set3) {
        str.getClass();
        if (i == 0) {
            throw null;
        }
        aiduVar.getClass();
        if (i2 == 0 || i3 == 0 || i4 == 0) {
            throw null;
        }
        aigjVar.getClass();
        set.getClass();
        aidqVar.getClass();
        list.getClass();
        str5.getClass();
        list2.getClass();
        aidsVar.getClass();
        set2.getClass();
        set3.getClass();
        this.a = str;
        this.B = i;
        this.b = aiduVar;
        this.y = i2;
        this.z = i3;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str2;
        this.g = aifvVar;
        this.h = j4;
        this.A = i4;
        this.i = aigjVar;
        this.j = str3;
        this.k = set;
        this.l = aiesVar;
        this.m = j5;
        this.n = str4;
        this.o = aidqVar;
        this.p = list;
        this.q = str5;
        this.r = j6;
        this.s = j7;
        this.t = aifhVar;
        this.u = list2;
        this.v = aidsVar;
        this.w = set2;
        this.x = set3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [aifv] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [aigj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [aies] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [aidq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1, types: [aifh] */
    /* JADX WARN: Type inference failed for: r35v2 */
    public static /* synthetic */ pot g(pot potVar, int i, aidu aiduVar, int i2, int i3, List list, int i4) throws Throwable {
        Throwable th;
        long j;
        String str = (i4 & 1) != 0 ? potVar.a : null;
        int i5 = (i4 & 2) != 0 ? potVar.B : i;
        aidu aiduVar2 = (i4 & 4) != 0 ? potVar.b : aiduVar;
        int i6 = (i4 & 8) != 0 ? potVar.y : i2;
        int i7 = (i4 & 16) != 0 ? potVar.z : i3;
        long j2 = (i4 & 32) != 0 ? potVar.c : 0L;
        long j3 = (i4 & 64) != 0 ? potVar.d : 0L;
        if ((i4 & SemanticState.Focused) != 0) {
            th = null;
            j = potVar.e;
        } else {
            th = null;
            j = 0;
        }
        Throwable th2 = th;
        ?? r16 = (i4 & SemanticState.Hidden) != 0 ? potVar.f : th2;
        ?? r17 = (i4 & SemanticState.LiveRegion) != 0 ? potVar.g : th2;
        long j4 = (i4 & SemanticState.ReadOnly) != 0 ? potVar.h : 0L;
        int i8 = (i4 & SemanticState.Modal) != 0 ? potVar.A : 0;
        ?? r21 = (i4 & SemanticState.Obscured) != 0 ? potVar.i : th2;
        ?? r22 = (i4 & SemanticState.Multiline) != 0 ? potVar.j : th2;
        ?? r23 = (i4 & 16384) != 0 ? potVar.k : th2;
        ?? r24 = (32768 & i4) != 0 ? potVar.l : th2;
        long j5 = (65536 & i4) != 0 ? potVar.m : 0L;
        ?? r27 = (131072 & i4) != 0 ? potVar.n : th2;
        ?? r28 = (262144 & i4) != 0 ? potVar.o : th2;
        ?? r29 = (524288 & i4) != 0 ? potVar.p : th2;
        ?? r30 = (1048576 & i4) != 0 ? potVar.q : th2;
        long j6 = (2097152 & i4) != 0 ? potVar.r : 0L;
        long j7 = (4194304 & i4) != 0 ? potVar.s : 0L;
        ?? r35 = (8388608 & i4) != 0 ? potVar.t : th2;
        List list2 = (i4 & 16777216) != 0 ? potVar.u : list;
        aids aidsVar = potVar.v;
        Set set = potVar.w;
        Set set2 = potVar.x;
        str.getClass();
        if (i5 == 0) {
            throw th2;
        }
        aiduVar2.getClass();
        if (i6 == 0 || i7 == 0 || i8 == 0) {
            throw th2;
        }
        r21.getClass();
        r23.getClass();
        r28.getClass();
        r29.getClass();
        r30.getClass();
        list2.getClass();
        return new pot(str, i5, aiduVar2, i6, i7, j2, j3, j, r16, r17, j4, i8, r21, r22, r23, r24, j5, r27, r28, r29, r30, j6, j7, r35, list2, aidsVar, set, set2);
    }

    @Override // defpackage.poq
    public final long a() {
        return this.e;
    }

    @Override // defpackage.poq
    public final long b() {
        return this.c;
    }

    @Override // defpackage.poq
    public final /* synthetic */ aicb c() {
        return nxh.a(this);
    }

    @Override // defpackage.poq
    public final aigj d() {
        return this.i;
    }

    @Override // defpackage.poq
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pot) {
            pot potVar = (pot) obj;
            if (awrc.c(this.a, potVar.a) && this.B == potVar.B && this.b == potVar.b && this.y == potVar.y && this.z == potVar.z && this.c == potVar.c && this.d == potVar.d && this.e == potVar.e && awrc.c(this.f, potVar.f) && awrc.c(this.g, potVar.g) && this.h == potVar.h && this.A == potVar.A && awrc.c(this.i, potVar.i) && awrc.c(this.j, potVar.j) && awrc.c(this.k, potVar.k) && awrc.c(this.l, potVar.l) && this.m == potVar.m && awrc.c(this.n, potVar.n) && awrc.c(this.o, potVar.o) && awrc.c(this.p, potVar.p) && awrc.c(this.q, potVar.q) && this.r == potVar.r && this.s == potVar.s && awrc.c(this.t, potVar.t) && awrc.c(this.u, potVar.u) && awrc.c(this.v, potVar.v) && awrc.c(this.w, potVar.w) && awrc.c(this.x, potVar.x)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.poq
    public final String f() {
        return this.j;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + aiep.a(this.B)) * 31) + this.b.hashCode();
        String str = this.f;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i = this.y;
        long j = this.e;
        int i2 = ((iHashCode * 31) + i) * 31;
        int iAk = (((((((((i2 + this.z) * 31) + a.ak(this.c)) * 31) + a.ak(this.d)) * 31) + a.ak(j)) * 31) + iHashCode2) * 31;
        aifv aifvVar = this.g;
        int iHashCode3 = (((((((iAk + (aifvVar == null ? 0 : aifvVar.hashCode())) * 31) + a.ak(this.h)) * 31) + this.A) * 31) + this.i.hashCode()) * 31;
        String str2 = this.j;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.k.hashCode()) * 31;
        aies aiesVar = this.l;
        int iHashCode5 = (((iHashCode4 + (aiesVar == null ? 0 : aiesVar.hashCode())) * 31) + a.ak(this.m)) * 31;
        String str3 = this.n;
        int iHashCode6 = (((((((((((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + a.ak(this.r)) * 31) + a.ak(this.s)) * 31;
        aifh aifhVar = this.t;
        return ((((((((iHashCode6 + (aifhVar != null ? aifhVar.hashCode() : 0)) * 31) + this.u.hashCode()) * 31) + this.v.hashCode()) * 31) + this.w.hashCode()) * 31) + this.x.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChimeSystemTrayThread(id=");
        sb.append(this.a);
        sb.append(", readState=");
        sb.append((Object) aiep.toString$ar$edu(this.B));
        sb.append(", deletionStatus=");
        sb.append(this.b);
        sb.append(", countBehavior=");
        sb.append((Object) Integer.toString(this.y - 1));
        sb.append(", systemTrayBehavior=");
        sb.append((Object) Integer.toString(this.z - 1));
        sb.append(", lastUpdatedVersion=");
        sb.append(this.c);
        sb.append(", lastNotificationVersion=");
        sb.append(this.d);
        sb.append(", creationId=");
        sb.append(this.e);
        sb.append(", payloadType=");
        sb.append(this.f);
        sb.append(", payload=");
        sb.append(this.g);
        sb.append(", insertionTimeMs=");
        sb.append(this.h);
        sb.append(", storageMode=");
        sb.append((Object) Integer.toString(this.A - 1));
        sb.append(", opaqueBackendData=");
        sb.append(this.i);
        sb.append(", updateThreadStateToken=");
        sb.append(this.j);
        sb.append(", externalExperimentIds=");
        sb.append(this.k);
        sb.append(", renderingMetadata=");
        sb.append(this.l);
        sb.append(", sendTimestampUsec=");
        sb.append(this.m);
        sb.append(", notificationType=");
        sb.append(this.n);
        sb.append(", androidSdkMessage=");
        sb.append(this.o);
        sb.append(", notificationMetadataList=");
        sb.append(this.p);
        sb.append(", groupId=");
        sb.append(this.q);
        sb.append(", expirationTimestampUsec=");
        sb.append(this.r);
        sb.append(", expirationDurationAfterDisplayMs=");
        sb.append(this.s);
        Set set = this.x;
        Set set2 = this.w;
        aids aidsVar = this.v;
        List list = this.u;
        aifh aifhVar = this.t;
        sb.append(", schedule=");
        sb.append(aifhVar);
        sb.append(", actionList=");
        sb.append(list);
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
