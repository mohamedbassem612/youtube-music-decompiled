package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pcv {
    public final pcu a;
    public final plb b;
    public final pax c;
    public final pzn d;
    public final boolean e;
    public final boolean f;
    public final phb g;
    public final boolean h;
    public final boolean i;

    public /* synthetic */ pcv(pcu pcuVar, plb plbVar, pax paxVar, pzn pznVar, boolean z, boolean z2, phb phbVar, boolean z3, int i) {
        phbVar = (i & 64) != 0 ? phb.a : phbVar;
        int i2 = i & 16;
        int i3 = i & 8;
        int i4 = i & 4;
        boolean z4 = ((i & 32) == 0) & z2;
        boolean z5 = (i2 == 0) & z;
        pznVar = i3 != 0 ? null : pznVar;
        paxVar = i4 != 0 ? null : paxVar;
        boolean z6 = (i & SemanticState.Focused) != 0;
        boolean z7 = (i & SemanticState.Hidden) == 0;
        pcuVar.getClass();
        plbVar.getClass();
        phbVar.getClass();
        this.a = pcuVar;
        this.b = plbVar;
        this.c = paxVar;
        this.d = pznVar;
        this.e = z5;
        this.f = z4;
        this.g = phbVar;
        this.h = z6;
        this.i = z7 & z3;
    }

    public final plx a() {
        return this.a.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pcv) {
            pcv pcvVar = (pcv) obj;
            if (awrc.c(this.a, pcvVar.a) && awrc.c(this.b, pcvVar.b) && awrc.c(this.c, pcvVar.c) && awrc.c(this.d, pcvVar.d) && this.e == pcvVar.e && this.f == pcvVar.f && this.g == pcvVar.g && this.h == pcvVar.h && this.i == pcvVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        pax paxVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (paxVar == null ? 0 : paxVar.hashCode())) * 31;
        pzn pznVar = this.d;
        return ((((((((((iHashCode2 + (pznVar != null ? pznVar.hashCode() : 0)) * 31) + a.aj(this.e)) * 31) + a.aj(this.f)) * 31) + this.g.hashCode()) * 31) + a.aj(this.h)) * 31) + a.aj(this.i);
    }

    public final String toString() {
        return "ThreadProcessingContext(notificationTarget=" + this.a + ", timeout=" + this.b + ", traceInfo=" + this.c + ", localThreadState=" + this.d + ", muteNotification=" + this.e + ", forceNotification=" + this.f + ", refreshReason=" + this.g + ", applyTrayManagementInstructions=" + this.h + ", isLocalNotification=" + this.i + ')';
    }
}
