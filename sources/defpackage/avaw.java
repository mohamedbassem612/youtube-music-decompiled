package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avaw {
    public static final Logger a = Logger.getLogger(avaw.class.getName());
    private static avaw b;
    private final LinkedHashSet c = new LinkedHashSet();
    private final LinkedHashMap d = new LinkedHashMap();

    public static synchronized avaw b() {
        if (b == null) {
            avav.class.getClassLoader();
            List<avav> listQ = avjt.q(avav.class, Collections.singletonList(avij.class.getDeclaredConstructor(null).newInstance(null)).iterator(), new ytj(19), new avbv(1));
            b = new avaw();
            for (avav avavVar : listQ) {
                a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(avavVar))));
                b.c(avavVar);
            }
            b.d();
        }
        return b;
    }

    private final synchronized void c(avav avavVar) {
        avavVar.d();
        this.c.add(avavVar);
    }

    private final synchronized void d() {
        LinkedHashMap linkedHashMap = this.d;
        linkedHashMap.clear();
        for (avav avavVar : this.c) {
            String strC = avavVar.c();
            if (((avav) linkedHashMap.get(strC)) != null) {
                avavVar.e();
            } else {
                linkedHashMap.put(strC, avavVar);
            }
        }
    }

    public final synchronized avav a(String str) {
        return (avav) this.d.get(str);
    }
}
