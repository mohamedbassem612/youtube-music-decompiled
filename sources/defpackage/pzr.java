package defpackage;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pzr {
    public final Bundle a;
    public final int b;
    private final List c;

    public pzr(int i, List list, Bundle bundle) {
        this.b = i;
        this.c = list;
        this.a = bundle;
    }

    public final agke a() {
        List list = this.c;
        if (list != null) {
            return aguu.T(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pzr) {
            pzr pzrVar = (pzr) obj;
            if (this.b == pzrVar.b && awrc.c(this.c, pzrVar.c) && awrc.c(this.a, pzrVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.c;
        int iHashCode = list == null ? 0 : list.hashCode();
        int i = this.b;
        Bundle bundle = this.a;
        return (((i * 31) + iHashCode) * 31) + (bundle != null ? bundle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickBehavior(behaviorType=");
        sb.append((Object) (this.b != 1 ? "BACKGROUND" : "APP_ACTIVITY"));
        sb.append(", activityIntents=");
        sb.append(this.c);
        sb.append(", appProvidedData=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
