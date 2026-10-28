package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avbw {
    public static final Logger a = Logger.getLogger(avbw.class.getName());
    private static avbw b;
    private String c = "unknown";
    private final LinkedHashSet d = new LinkedHashSet();
    private agkj e = agpn.b;

    public static synchronized avbw b() {
        if (b == null) {
            avbu.class.getClassLoader();
            List<avbu> listQ = avjt.q(avbu.class, Collections.singletonList(avez.class.getDeclaredConstructor(null).newInstance(null)).iterator(), new ytj(20), new avbv(0));
            if (listQ.isEmpty()) {
                a.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
            }
            b = new avbw();
            for (avbu avbuVar : listQ) {
                a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(avbuVar))));
                b.f(avbuVar);
            }
            b.g();
        }
        return b;
    }

    private final synchronized void f(avbu avbuVar) {
        avbuVar.f();
        this.d.add(avbuVar);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032 A[Catch: all -> 0x0050, TryCatch #0 {, blocks: (B:3:0x0001, B:4:0x0010, B:6:0x0016, B:8:0x0028, B:11:0x0035, B:13:0x003b, B:10:0x0032, B:14:0x0044), top: B:21:0x0001 }] */
    private final synchronized void g() {
        HashMap map = new HashMap();
        String strC = "unknown";
        int iD = Integer.MIN_VALUE;
        for (avbu avbuVar : this.d) {
            String strC2 = avbuVar.c();
            avbu avbuVar2 = (avbu) map.get(strC2);
            if (avbuVar2 != null) {
                if (avbuVar2.d() < avbuVar.d()) {
                    map.put(strC2, avbuVar);
                }
            } else {
                map.put(strC2, avbuVar);
            }
            if (iD < avbuVar.d()) {
                iD = avbuVar.d();
                strC = avbuVar.c();
            }
        }
        this.e = agkj.h(map);
        this.c = strC;
    }

    public final avbu a(String str) {
        if (str == null) {
            return null;
        }
        return (avbu) d().get(str.toLowerCase(Locale.US));
    }

    public final synchronized String c() {
        return this.c;
    }

    final synchronized Map d() {
        return this.e;
    }

    public final synchronized void e(avbu avbuVar) {
        f(avbuVar);
        g();
    }
}
