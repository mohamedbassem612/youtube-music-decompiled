package defpackage;

import android.app.Notification;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pzq {
    public final atr a;
    public final auu b;
    public final pzp c;
    public final Bitmap d;
    private final Notification e;

    public pzq(atr atrVar, auu auuVar, Notification notification, pzp pzpVar, Bitmap bitmap) {
        atrVar.getClass();
        this.a = atrVar;
        this.b = auuVar;
        this.e = notification;
        this.c = pzpVar;
        this.d = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pzq) {
            pzq pzqVar = (pzq) obj;
            if (awrc.c(this.a, pzqVar.a) && awrc.c(this.b, pzqVar.b) && awrc.c(this.e, pzqVar.e) && awrc.c(this.c, pzqVar.c) && awrc.c(this.d, pzqVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        auu auuVar = this.b;
        int iHashCode2 = (iHashCode + (auuVar == null ? 0 : auuVar.hashCode())) * 31;
        Notification notification = this.e;
        int iHashCode3 = (iHashCode2 + (notification == null ? 0 : notification.hashCode())) * 31;
        pzp pzpVar = this.c;
        int iHashCode4 = (iHashCode3 + (pzpVar == null ? 0 : pzpVar.hashCode())) * 31;
        Bitmap bitmap = this.d;
        return iHashCode4 + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationBuilderAndComponents(notificationBuilder=" + this.a + ", style=" + this.b + ", publicVersion=" + this.e + ", imageLoadingOutcome=" + this.c + ", enlargedImageBitmap=" + this.d + ')';
    }
}
