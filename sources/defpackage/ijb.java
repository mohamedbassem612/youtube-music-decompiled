package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ijb {
    private static final HashMap b = new HashMap();
    public final Map a = new HashMap();

    private ijb() {
    }

    public static synchronized ijb a(String str) {
        ijb ijbVar;
        HashMap map = b;
        str.getClass();
        ijbVar = (ijb) map.get(str);
        if (ijbVar == null) {
            ijbVar = new ijb();
            map.put(str, ijbVar);
        }
        return ijbVar;
    }
}
