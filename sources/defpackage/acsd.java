package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acsd {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final acca f;
    public final int g;

    public acsd(boolean z, boolean z2, String str, int i, boolean z3, boolean z4, acca accaVar) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.g = i;
        this.d = z3;
        this.e = z4;
        this.f = accaVar;
    }

    public static /* synthetic */ acsd a(acsd acsdVar, boolean z, boolean z2, String str, int i, boolean z3, boolean z4, acca accaVar, int i2) {
        if ((i2 & 1) != 0) {
            z = acsdVar.a;
        }
        if ((i2 & 2) != 0) {
            z2 = acsdVar.b;
        }
        if ((i2 & 4) != 0) {
            str = acsdVar.c;
        }
        if ((i2 & 8) != 0) {
            i = acsdVar.g;
        }
        if ((i2 & 16) != 0) {
            z3 = acsdVar.d;
        }
        if ((i2 & 32) != 0) {
            z4 = acsdVar.e;
        }
        if ((i2 & 64) != 0) {
            accaVar = acsdVar.f;
        }
        if (i != 0) {
            return new acsd(z, z2, str, i, z3, z4, accaVar);
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acsd) {
            acsd acsdVar = (acsd) obj;
            if (this.a == acsdVar.a && this.b == acsdVar.b && awrc.c(this.c, acsdVar.c) && this.g == acsdVar.g && this.d == acsdVar.d && this.e == acsdVar.e && awrc.c(this.f, acsdVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = str == null ? 0 : str.hashCode();
        boolean z = this.b;
        boolean z2 = this.a;
        int i = this.g;
        boolean z3 = this.d;
        boolean z4 = this.e;
        acca accaVar = this.f;
        return (((((((((((a.aj(z2) * 31) + a.aj(z)) * 31) + iHashCode) * 31) + i) * 31) + a.aj(z3)) * 31) + a.aj(z4)) * 31) + (accaVar != null ? accaVar.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CaptionMuteState(isMuted=");
        sb.append(this.a);
        sb.append(", captionEnabledByMute=");
        sb.append(this.b);
        sb.append(", cpn=");
        sb.append(this.c);
        sb.append(", autoCaptionState=");
        int i = this.g;
        if (i != 1) {
            str = i != 2 ? "USER_OVERRIDDEN" : "EVALUATED";
        } else {
            str = "PENDING";
        }
        sb.append((Object) str);
        sb.append(", triggerCaptionSelect=");
        sb.append(this.d);
        sb.append(", triggerCaptionReset=");
        sb.append(this.e);
        sb.append(", currentTrack=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }

    public acsd() {
        this(false, false, null, 1, false, false, null);
    }
}
