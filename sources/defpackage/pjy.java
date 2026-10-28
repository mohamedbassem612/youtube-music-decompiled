package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pjy {
    public final pjw a;
    public final pka b;
    public final List c;
    public final Map d;
    public final Boolean e;

    public pjy(pjw pjwVar, pka pkaVar, List list, Map map, Boolean bool) {
        this.a = pjwVar;
        this.b = pkaVar;
        this.c = list;
        this.d = map;
        this.e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pjy) {
            pjy pjyVar = (pjy) obj;
            if (awrc.c(this.a, pjyVar.a) && awrc.c(this.b, pjyVar.b) && awrc.c(this.c, pjyVar.c) && awrc.c(this.d, pjyVar.d) && awrc.c(this.e, pjyVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        pjw pjwVar = this.a;
        int iHashCode = pjwVar == null ? 0 : pjwVar.hashCode();
        pka pkaVar = this.b;
        int iHashCode2 = pkaVar == null ? 0 : pkaVar.hashCode();
        int i = iHashCode * 31;
        List list = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.d;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "TrayInstructionsResult(addedNotificationTrayId=" + this.a + ", replacedNotification=" + this.b + ", dismissedNotifications=" + this.c + ", targetToReachedLimitInfoMultimap=" + this.d + ", shouldAddedThreadAlertOnReplace=" + this.e + ')';
    }
}
