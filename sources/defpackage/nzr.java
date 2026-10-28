package defpackage;

import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class nzr {
    public final agkz a;
    public final Boolean b;
    public final nzo c;
    public final String d;
    public final Integer e;
    public final Status f;
    public final String g;
    public final String h;
    public final Integer i;
    public final Boolean j;
    public final Integer k;
    public final Boolean l;
    public final Integer m;
    public final agke n;
    public final int o;
    public final Integer p;

    public nzr(agkz agkzVar, Boolean bool, nzo nzoVar, String str, Integer num, Status status, String str2, String str3, Integer num2, Boolean bool2, Integer num3, Boolean bool3, Integer num4, agke agkeVar, int i, Integer num5) {
        this.a = agkzVar;
        this.b = bool;
        this.c = nzoVar;
        this.d = str;
        this.e = num;
        this.f = status;
        this.g = str2;
        this.h = str3;
        this.i = num2;
        this.j = bool2;
        this.k = num3;
        this.l = bool3;
        this.m = num4;
        this.n = agkeVar;
        this.o = i;
        this.p = num5;
    }

    public static nzq a() {
        nzq nzqVar = new nzq();
        nzqVar.b(1);
        return nzqVar;
    }

    public final boolean equals(Object obj) {
        Boolean bool;
        nzo nzoVar;
        String str;
        Integer num;
        Status status;
        String str2;
        String str3;
        Integer num2;
        Boolean bool2;
        Integer num3;
        Boolean bool3;
        Integer num4;
        agke agkeVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof nzr) {
            nzr nzrVar = (nzr) obj;
            if (this.a.equals(nzrVar.a) && ((bool = this.b) != null ? bool.equals(nzrVar.b) : nzrVar.b == null) && ((nzoVar = this.c) != null ? nzoVar.equals(nzrVar.c) : nzrVar.c == null) && ((str = this.d) != null ? str.equals(nzrVar.d) : nzrVar.d == null) && ((num = this.e) != null ? num.equals(nzrVar.e) : nzrVar.e == null) && ((status = this.f) != null ? status.equals(nzrVar.f) : nzrVar.f == null) && ((str2 = this.g) != null ? str2.equals(nzrVar.g) : nzrVar.g == null) && ((str3 = this.h) != null ? str3.equals(nzrVar.h) : nzrVar.h == null) && ((num2 = this.i) != null ? num2.equals(nzrVar.i) : nzrVar.i == null) && ((bool2 = this.j) != null ? bool2.equals(nzrVar.j) : nzrVar.j == null) && ((num3 = this.k) != null ? num3.equals(nzrVar.k) : nzrVar.k == null) && ((bool3 = this.l) != null ? bool3.equals(nzrVar.l) : nzrVar.l == null) && ((num4 = this.m) != null ? num4.equals(nzrVar.m) : nzrVar.m == null) && ((agkeVar = this.n) != null ? aguu.v(agkeVar, nzrVar.n) : nzrVar.n == null) && this.o == nzrVar.o) {
                Integer num5 = this.p;
                if (num5 == null) {
                    if (nzrVar.p == null) {
                        return true;
                    }
                } else if (num5.equals(nzrVar.p)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Boolean bool = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        nzo nzoVar = this.c;
        int iHashCode3 = (iHashCode2 ^ (nzoVar == null ? 0 : nzoVar.hashCode())) * 1000003;
        String str = this.d;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Status status = this.f;
        int iHashCode6 = (iHashCode5 ^ (status == null ? 0 : status.hashCode())) * 1000003;
        String str2 = this.g;
        int iHashCode7 = (iHashCode6 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int iHashCode8 = (iHashCode7 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Integer num2 = this.i;
        int iHashCode9 = (iHashCode8 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Boolean bool2 = this.j;
        int iHashCode10 = iHashCode9 ^ (bool2 == null ? 0 : bool2.hashCode());
        Integer num3 = this.k;
        int iHashCode11 = ((iHashCode10 * (-721379959)) ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Boolean bool3 = this.l;
        int iHashCode12 = (iHashCode11 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
        Integer num4 = this.m;
        int iHashCode13 = (iHashCode12 ^ (num4 == null ? 0 : num4.hashCode())) * (-721379959);
        agke agkeVar = this.n;
        int iHashCode14 = (((iHashCode13 ^ (agkeVar == null ? 0 : agkeVar.hashCode())) * 1000003) ^ this.o) * 1000003;
        Integer num5 = this.p;
        return iHashCode14 ^ (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        agke agkeVar = this.n;
        Status status = this.f;
        nzo nzoVar = this.c;
        return "SpanInfo{templateUris=" + String.valueOf(this.a) + ", isWasm=" + this.b + ", threadInfo=" + String.valueOf(nzoVar) + ", nodeId=" + this.d + ", commandExtensionId=" + this.e + ", commandExecutionStatus=" + String.valueOf(status) + ", jsModuleIdentifier=" + this.g + ", jsFunctionName=" + this.h + ", jsBindingExtensionId=" + this.i + ", jsIsSynchronous=" + this.j + ", isAppBackgrounded=null, treeId=" + this.k + ", isFirstMat=" + this.l + ", collectionRate=" + this.m + ", collectionReason=null, collectionReasons=" + String.valueOf(agkeVar) + ", materializationCount=" + this.o + ", feedItemCount=" + this.p + '}';
    }

    public nzr() {
        throw null;
    }
}
