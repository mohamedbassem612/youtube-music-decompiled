package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bpo {
    public final Map a = new LinkedHashMap();

    public final void a() {
        Map map = this.a;
        Map mapD = atqq.D(map);
        map.clear();
        Iterator it = mapD.values().iterator();
        while (it.hasNext()) {
            ((bpi) it.next()).t();
        }
    }

    public final String toString() {
        int i = awrn.a;
        String strC = new awqv(getClass()).c();
        if (strC == null) {
            strC = "ViewModelStore";
        }
        String string = Integer.toString(hashCode(), 16);
        string.getClass();
        return strC + '@' + string + "(keys=" + atqq.aw(this.a.keySet()) + ')';
    }
}
