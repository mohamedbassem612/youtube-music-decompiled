package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaza {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final wjf j;
    public final boolean k;
    private long l;

    public aaza(String str, String str2, String str3, String str4, long j, long j2, boolean z, boolean z2, boolean z3, wjf wjfVar, boolean z4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = wjfVar;
        this.k = z4;
        long j3 = -1;
        if (z && !awrc.c(str, str4)) {
            j3 = 0;
        }
        this.l = j3;
    }

    public final String a() {
        String strG = this.j.G();
        strG.getClass();
        return strG;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aaza) {
            aaza aazaVar = (aaza) obj;
            if (awrc.c(this.a, aazaVar.a) && awrc.c(this.b, aazaVar.b) && awrc.c(this.c, aazaVar.c) && awrc.c(this.d, aazaVar.d) && this.e == aazaVar.e && this.f == aazaVar.f && this.g == aazaVar.g && this.h == aazaVar.h && this.i == aazaVar.i && awrc.c(this.j, aazaVar.j) && this.k == aazaVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        wjf wjfVar = this.j;
        boolean z = this.i;
        boolean z2 = this.h;
        boolean z3 = this.g;
        return (((((((((((((iHashCode * 31) + a.ak(this.e)) * 31) + a.ak(this.f)) * 31) + a.aj(z3)) * 31) + a.aj(z2)) * 31) + a.aj(z)) * 31) + wjfVar.hashCode()) * 31) + a.aj(this.k);
    }

    public final String toString() {
        return "StitchedVideoTransitionEvent currentCpn=" + this.a + ", currentVideoId=" + a() + ", otherCpn=" + this.b + ", otherVideoId=" + this.c + ", contentCpn=" + this.d + ", transitionMediaTimeMs=" + this.e + ", isEnter=" + this.g + ", isSeek=" + this.h + ", isSkip=" + this.i + ", hasIncompleteAd=" + this.k + ", adVideoLocalStartTimeMs=" + this.l + ", expectedAdStartTimeMs=" + this.f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aaza(String str, String str2, String str3, String str4, long j, long j2, boolean z, boolean z2, boolean z3, wjf wjfVar) {
        this(str, str2, str3, str4, j, j2, z, z2, false, wjfVar, false, SemanticState.ReadOnly, null);
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
    }

    public /* synthetic */ aaza(String str, String str2, String str3, String str4, long j, long j2, boolean z, boolean z2, boolean z3, wjf wjfVar, boolean z4, int i, awqx awqxVar) {
        this(str, str2, str3, str4, j, j2, z, z2, false, wjfVar, false);
    }
}
