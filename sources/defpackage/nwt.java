package defpackage;

import android.service.notification.StatusBarNotification;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nwt {
    public static final void a(Map map, StatusBarNotification statusBarNotification, pcu pcuVar, pot potVar) {
        pkc pkcVar;
        pjx pjxVar = pjx.a;
        pkc pkcVar2 = (pkc) map.get(pjx.k(statusBarNotification));
        if (pkcVar2 != null) {
            pkcVar = new pkc(pkcVar2.a, pkcVar2.b, pcuVar, potVar);
        } else {
            pkcVar = null;
        }
        if (pkcVar != null) {
            map.put(pjx.k(statusBarNotification), pkcVar);
        }
    }

    public static final void b(Map map, pcu pcuVar, String str, pbg pbgVar) {
        if (!map.containsKey(pcuVar)) {
            map.put(pcuVar, new LinkedHashMap());
        }
        Map map2 = (Map) map.get(pcuVar);
        if (map2 != null) {
        }
    }

    public static final pka c(pkc pkcVar) {
        pka pkaVar = null;
        if (pkcVar.b == null) {
            pkcVar = null;
        }
        if (pkcVar != null) {
            StatusBarNotification statusBarNotification = pkcVar.b;
            if (statusBarNotification == null) {
                throw new IllegalStateException("Required value was null.");
            }
            pkaVar = new pka(pkcVar.a, statusBarNotification, pkcVar.c, pkcVar.d);
        }
        return pkaVar;
    }

    public static final void d(Map map, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pkc pkcVar = (pkc) it.next();
            StatusBarNotification statusBarNotification = pkcVar.b;
            if (statusBarNotification != null) {
                a(map, statusBarNotification, pkcVar.c, pkcVar.d);
            }
        }
    }
}
