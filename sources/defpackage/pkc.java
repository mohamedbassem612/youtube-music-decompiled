package defpackage;

import android.service.notification.StatusBarNotification;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pkc {
    public final pjw a;
    public final StatusBarNotification b;
    public final pcu c;
    public final pot d;

    public pkc(pjw pjwVar, StatusBarNotification statusBarNotification, pcu pcuVar, pot potVar) {
        this.a = pjwVar;
        this.b = statusBarNotification;
        this.c = pcuVar;
        this.d = potVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pkc) {
            pkc pkcVar = (pkc) obj;
            if (awrc.c(this.a, pkcVar.a) && awrc.c(this.b, pkcVar.b) && awrc.c(this.c, pkcVar.c) && awrc.c(this.d, pkcVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        StatusBarNotification statusBarNotification = this.b;
        int iHashCode2 = (iHashCode + (statusBarNotification == null ? 0 : statusBarNotification.hashCode())) * 31;
        pcu pcuVar = this.c;
        int iHashCode3 = (iHashCode2 + (pcuVar == null ? 0 : pcuVar.hashCode())) * 31;
        pot potVar = this.d;
        return iHashCode3 + (potVar != null ? potVar.hashCode() : 0);
    }

    public final String toString() {
        return "TrayModelDataItem(trayIdentifier=" + this.a + ", notification=" + this.b + ", notificationTarget=" + this.c + ", thread=" + this.d + ')';
    }
}
