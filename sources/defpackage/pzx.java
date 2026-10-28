package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pzx {
    public final Bundle a;
    public final Map b;

    public pzx(Bundle bundle, Map map) {
        this.a = bundle;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pzx) {
            pzx pzxVar = (pzx) obj;
            if (awrc.c(this.a, pzxVar.a) && awrc.c(this.b, pzxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Bundle bundle = this.a;
        int iHashCode = bundle == null ? 0 : bundle.hashCode();
        Map map = this.b;
        return (iHashCode * 31) + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationRemovedInfo(appProvidedData=" + this.a + ", threadIdToReachedLimit=" + this.b + ')';
    }
}
