package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pxj {
    public final Set a;
    public final String b;

    public pxj(Set set, String str) {
        this.a = set;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pxj) {
            pxj pxjVar = (pxj) obj;
            if (awrc.c(this.a, pxjVar.a) && awrc.c(this.b, pxjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AccountRegistrationInfo(notificationChannels=" + this.a + ", delegateGaiaActualAccountName=" + this.b + ')';
    }
}
