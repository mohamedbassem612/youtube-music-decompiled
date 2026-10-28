package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eum {
    private static final eui a = new euk();
    private final Map b = new HashMap();

    public final synchronized euj a(Object obj) {
        eui euiVar;
        try {
            if (obj == null) {
                throw new NullPointerException("Argument must not be null");
            }
            Map map = this.b;
            euiVar = (eui) map.get(obj.getClass());
            if (euiVar == null) {
                for (eui euiVar2 : map.values()) {
                    if (euiVar2.b().isAssignableFrom(obj.getClass())) {
                        euiVar = euiVar2;
                        break;
                    }
                }
            }
            if (euiVar == null) {
                euiVar = a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return euiVar.a(obj);
    }

    public final synchronized void b(eui euiVar) {
        this.b.put(euiVar.b(), euiVar);
    }
}
