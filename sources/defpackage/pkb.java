package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pkb {
    public final Map a;
    public final pjw b;
    public final pkc c;
    public final List d;

    public pkb(Map map, pjw pjwVar, pkc pkcVar, List list) {
        map.getClass();
        this.a = map;
        this.b = pjwVar;
        this.c = pkcVar;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pkb) {
            pkb pkbVar = (pkb) obj;
            if (awrc.c(this.a, pkbVar.a) && awrc.c(this.b, pkbVar.b) && awrc.c(this.c, pkbVar.c) && awrc.c(this.d, pkbVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        pjw pjwVar = this.b;
        int iHashCode2 = (iHashCode + (pjwVar == null ? 0 : pjwVar.hashCode())) * 31;
        pkc pkcVar = this.c;
        int iHashCode3 = (iHashCode2 + (pkcVar == null ? 0 : pkcVar.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationSlotResult(trayModel=" + this.a + ", addedNotificationTrayId=" + this.b + ", replacedNotificationTrayModelData=" + this.c + ", dismissedNotificationsTrayModelData=" + this.d + ')';
    }
}
