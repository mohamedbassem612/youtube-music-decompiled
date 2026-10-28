package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class eqx implements eqi {
    private final Map a = new HashMap();
    private final epy b;
    private final BlockingQueue c;
    private final elq d;

    public eqx(epy epyVar, BlockingQueue blockingQueue, elq elqVar) {
        this.d = elqVar;
        this.b = epyVar;
        this.c = blockingQueue;
    }

    @Override // defpackage.eqi
    public final synchronized void a(eqk eqkVar) {
        Map map = this.a;
        String cacheKey = eqkVar.getCacheKey();
        List list = (List) map.remove(cacheKey);
        if (list != null && !list.isEmpty()) {
            String str = eqw.a;
            eqk eqkVar2 = (eqk) list.remove(0);
            map.put(cacheKey, list);
            eqkVar2.setNetworkRequestCompleteListener(this);
            try {
                this.c.put(eqkVar2);
            } catch (InterruptedException e) {
                eqw.b("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.b.a();
            }
        }
    }

    @Override // defpackage.eqi
    public final void b(eqk eqkVar, eqq eqqVar) {
        List list;
        Object obj = eqqVar.c;
        if (obj != null) {
            if (!((epx) obj).a(System.currentTimeMillis())) {
                String cacheKey = eqkVar.getCacheKey();
                synchronized (this) {
                    list = (List) this.a.remove(cacheKey);
                }
                if (list != null) {
                    String str = eqw.a;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        this.d.e((eqk) it.next(), eqqVar, null);
                    }
                    return;
                }
                return;
            }
        }
        a(eqkVar);
    }

    final synchronized boolean c(eqk eqkVar) {
        Map map = this.a;
        String cacheKey = eqkVar.getCacheKey();
        if (!map.containsKey(cacheKey)) {
            map.put(cacheKey, null);
            eqkVar.setNetworkRequestCompleteListener(this);
            String str = eqw.a;
            return false;
        }
        List arrayList = (List) map.get(cacheKey);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        eqkVar.addMarker("waiting-for-response");
        arrayList.add(eqkVar);
        map.put(cacheKey, arrayList);
        String str2 = eqw.a;
        return true;
    }
}
