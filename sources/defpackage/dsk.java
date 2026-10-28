package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dsk {
    public View b;
    public final Map a = new HashMap();
    final ArrayList c = new ArrayList();

    public dsk(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dsk) {
            dsk dskVar = (dsk) obj;
            if (this.b == dskVar.b && this.a.equals(dskVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        String strConcat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + '\n').concat("    values:");
        Map map = this.a;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + '\n';
        }
        return strConcat;
    }

    @Deprecated
    public dsk() {
    }
}
