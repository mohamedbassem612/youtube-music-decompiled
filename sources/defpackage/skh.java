package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class skh {
    public static final skh a = c("", null, false);
    public final slz b;
    public final sgu c;

    public skh(slz slzVar, sgu sguVar) {
        this.b = slzVar;
        this.c = sguVar;
    }

    public static skh a(String str, wjf wjfVar) {
        return new skh(d(str, wjfVar, false), new sgu(""));
    }

    public static skh b(String str, wjf wjfVar, String str2) {
        slz slzVarD = d(str, wjfVar, false);
        if (true == TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return new skh(slzVarD, new sgu(str2));
    }

    public static skh c(String str, wjf wjfVar, boolean z) {
        return new skh(d(str, wjfVar, z), new sgu(""));
    }

    private static slz d(String str, wjf wjfVar, boolean z) {
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        return new slz(true == TextUtils.isEmpty(str) ? "" : str, wjfVar != null && wjfVar.V(), wjfVar != null && wjfVar.P(), wjfVar != null && wjfVar.R(), z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof skh) {
            skh skhVar = (skh) obj;
            if (this.b.equals(skhVar.b) && this.c.equals(skhVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        sgu sguVar = this.c;
        return "ExternalContextModel{organicPlaybackContext=" + String.valueOf(this.b) + ", adVideoPlaybackContext=" + sguVar.toString() + '}';
    }

    public skh() {
        throw null;
    }
}
