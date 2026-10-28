package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wla {
    public final Optional A;
    public final aigj B;
    public final agke C;
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final String u;
    public final boolean v;
    public final int w;
    public final int x;
    public final agke y;
    public final wly z;

    public wla(long j, int i, int i2, int i3, boolean z, boolean z2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str, boolean z3, int i18, int i19, agke agkeVar, wly wlyVar, Optional optional, aigj aigjVar, agke agkeVar2) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = z2;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = i7;
        this.k = i8;
        this.l = i9;
        this.m = i10;
        this.n = i11;
        this.o = i12;
        this.p = i13;
        this.q = i14;
        this.r = i15;
        this.s = i16;
        this.t = i17;
        this.u = str;
        this.v = z3;
        this.w = i18;
        this.x = i19;
        this.y = agkeVar;
        this.z = wlyVar;
        this.A = optional;
        this.B = aigjVar;
        this.C = agkeVar2;
    }

    public static wkz a() {
        wkz wkzVar = new wkz();
        wkzVar.y(0);
        wkzVar.w(0L);
        wkzVar.l(0);
        wkzVar.v(0);
        wkzVar.x(0);
        wkzVar.r(false);
        wkzVar.s(false);
        wkzVar.k(0);
        wkzVar.c(0);
        wkzVar.f(0);
        wkzVar.o(0);
        wkzVar.j(0);
        wkzVar.i(0);
        wkzVar.h(0);
        wkzVar.m(0);
        wkzVar.d(0);
        wkzVar.g(0);
        wkzVar.p(0);
        wkzVar.e(0);
        wkzVar.b(0);
        wkzVar.n(0);
        wkzVar.t(agpi.a);
        return wkzVar;
    }

    public final boolean equals(Object obj) {
        wly wlyVar;
        aigj aigjVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof wla) {
            wla wlaVar = (wla) obj;
            if (this.a == wlaVar.a && this.b == wlaVar.b && this.c == wlaVar.c && this.d == wlaVar.d && this.e == wlaVar.e && this.f == wlaVar.f && this.g == wlaVar.g && this.h == wlaVar.h && this.i == wlaVar.i && this.j == wlaVar.j && this.k == wlaVar.k && this.l == wlaVar.l && this.m == wlaVar.m && this.n == wlaVar.n && this.o == wlaVar.o && this.p == wlaVar.p && this.q == wlaVar.q && this.r == wlaVar.r && this.s == wlaVar.s && this.t == wlaVar.t && this.u.equals(wlaVar.u) && this.v == wlaVar.v && this.w == wlaVar.w && this.x == wlaVar.x && aguu.v(this.y, wlaVar.y) && ((wlyVar = this.z) != null ? wlyVar.equals(wlaVar.z) : wlaVar.z == null) && this.A.equals(wlaVar.A) && ((aigjVar = this.B) != null ? aigjVar.equals(wlaVar.B) : wlaVar.B == null) && aguu.v(this.C, wlaVar.C)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.e ? 1237 : 1231;
        long j = this.a;
        int i2 = this.b;
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ i2) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ i) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003) ^ this.m) * 1000003) ^ this.n) * 1000003) ^ this.o) * 1000003) ^ this.p) * 1000003) ^ this.q) * 1000003) ^ this.r) * 1000003) ^ this.s) * 1000003) ^ this.t) * 1000003) ^ this.u.hashCode()) * 1000003) ^ (true == this.v ? 1231 : 1237)) * 1000003) ^ this.w) * 1000003) ^ this.x) * 1000003) ^ this.y.hashCode();
        wly wlyVar = this.z;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (wlyVar == null ? 0 : wlyVar.hashCode())) * 1000003) ^ this.A.hashCode()) * 1000003;
        aigj aigjVar = this.B;
        return ((iHashCode2 ^ (aigjVar != null ? aigjVar.hashCode() : 0)) * 1000003) ^ this.C.hashCode();
    }

    public final String toString() {
        agke agkeVar = this.C;
        aigj aigjVar = this.B;
        Optional optional = this.A;
        wly wlyVar = this.z;
        String strValueOf = String.valueOf(this.y);
        String strValueOf2 = String.valueOf(wlyVar);
        String strValueOf3 = String.valueOf(optional);
        String strValueOf4 = String.valueOf(aigjVar);
        String strValueOf5 = String.valueOf(agkeVar);
        StringBuilder sb = new StringBuilder("ExecutedInnerTubeRequestInfo{protoParsingTimeMillis=");
        sb.append(this.a);
        sb.append(", futProcessingTimeMillis=");
        sb.append(this.b);
        sb.append(", overallProcessingTimeMillis=");
        sb.append(this.c);
        sb.append(", responseContextsProcessingTimeMillis=");
        sb.append(this.d);
        sb.append(", hasNestedResponse=");
        sb.append(this.e);
        sb.append(", hasRootTrace=");
        sb.append(this.f);
        sb.append(", futParseTimeMillis=");
        sb.append(this.g);
        sb.append(", futElementsProcessingMillis=");
        sb.append(this.h);
        sb.append(", futEntitiesProcessingMillis=");
        sb.append(this.i);
        sb.append(", futTasksProcessingMillis=");
        sb.append(this.j);
        sb.append(", futEntityMutationProcessingMillis=");
        sb.append(this.k);
        sb.append(", futEntityMutationPersistentEditsCommitMillis=");
        sb.append(this.l);
        sb.append(", futEntityMutationInMemoryEditsCommitMillis=");
        sb.append(this.m);
        sb.append(", futSize=");
        sb.append(this.n);
        sb.append(", futElementsSize=");
        sb.append(this.o);
        sb.append(", futEntitiesSize=");
        sb.append(this.p);
        sb.append(", futTasksSize=");
        sb.append(this.q);
        sb.append(", futEntitiesCount=");
        sb.append(this.r);
        sb.append(", futElementsCount=");
        sb.append(this.s);
        sb.append(", futTasksCount=");
        sb.append(this.t);
        sb.append(", rpcName=");
        sb.append(this.u);
        int i = this.x;
        int i2 = this.w;
        boolean z = this.v;
        sb.append(", hasContinuationToken=");
        sb.append(z);
        sb.append(", responseProtoByteSize=");
        sb.append(i2);
        sb.append(", retryCount=");
        sb.append(i);
        sb.append(", networkHealthAnnotations=");
        sb.append(strValueOf);
        sb.append(", networkErrorResponseInfo=");
        sb.append(strValueOf2);
        sb.append(", triggeringClientScreenNonce=");
        sb.append(strValueOf3);
        sb.append(", serverEventId=");
        sb.append(strValueOf4);
        sb.append(", nestedInnerTubeRequestInfos=");
        sb.append(strValueOf5);
        sb.append('}');
        return sb.toString();
    }

    public wla() {
        throw null;
    }
}
