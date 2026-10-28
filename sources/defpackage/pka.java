package defpackage;

import android.service.notification.StatusBarNotification;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pka {
    public final pjw a;
    public final StatusBarNotification b;
    public final pcu c;
    public final pot d;

    public pka(pjw pjwVar, StatusBarNotification statusBarNotification, pcu pcuVar, pot potVar) {
        this.a = pjwVar;
        this.b = statusBarNotification;
        this.c = pcuVar;
        this.d = potVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pka) {
            pka pkaVar = (pka) obj;
            if (awrc.c(this.a, pkaVar.a) && awrc.c(this.b, pkaVar.b) && awrc.c(this.c, pkaVar.c) && awrc.c(this.d, pkaVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        pcu pcuVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (pcuVar == null ? 0 : pcuVar.hashCode())) * 31;
        pot potVar = this.d;
        return iHashCode2 + (potVar != null ? potVar.hashCode() : 0);
    }

    public final String toString() {
        return "TrayNotificationData(trayIdentifier=" + this.a + ", notification=" + this.b + ", notificationTarget=" + this.c + ", thread=" + this.d + ')';
    }
}
