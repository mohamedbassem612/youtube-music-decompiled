package defpackage;

import android.os.Process;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class epy extends Thread {
    public final BlockingQueue a;
    private final BlockingQueue b;
    private volatile boolean c = false;
    private final eqx d;
    private final und e;
    private final elq f;

    static {
        String str = eqw.a;
    }

    public epy(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, und undVar, elq elqVar) {
        this.b = blockingQueue;
        this.a = blockingQueue2;
        this.e = undVar;
        this.f = elqVar;
        this.d = new eqx(this, blockingQueue2, elqVar);
    }

    private void b() {
        List arrayList;
        eqk eqkVar = (eqk) this.b.take();
        eqkVar.addMarker("cache-queue-take");
        eqkVar.sendEvent(1);
        try {
            if (eqkVar.isCanceled()) {
                eqkVar.finish("cache-discard-canceled");
            } else {
                und undVar = this.e;
                epx epxVarE = undVar.e(eqkVar.getCacheKey());
                if (epxVarE == null) {
                    eqkVar.addMarker("cache-miss");
                    if (!this.d.c(eqkVar)) {
                        this.a.put(eqkVar);
                    }
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (epxVarE.a(jCurrentTimeMillis)) {
                        eqkVar.addMarker("cache-hit-expired");
                        eqkVar.setCacheEntry(epxVarE);
                        if (!this.d.c(eqkVar)) {
                            this.a.put(eqkVar);
                        }
                    } else {
                        eqkVar.addMarker("cache-hit");
                        byte[] bArr = epxVarE.a;
                        Map map = epxVarE.g;
                        if (map == null) {
                            arrayList = null;
                        } else if (map.isEmpty()) {
                            arrayList = Collections.EMPTY_LIST;
                        } else {
                            arrayList = new ArrayList(map.size());
                            for (Map.Entry entry : map.entrySet()) {
                                arrayList.add(new eqc((String) entry.getKey(), (String) entry.getValue()));
                            }
                        }
                        eqq networkResponse = eqkVar.parseNetworkResponse(new eqf(bArr, map, arrayList, false));
                        eqkVar.addMarker("cache-hit-parsed");
                        if (!networkResponse.a()) {
                            eqkVar.addMarker("cache-parsing-failed");
                            undVar.n(eqkVar.getCacheKey());
                            eqkVar.setCacheEntry(null);
                            if (!this.d.c(eqkVar)) {
                                this.a.put(eqkVar);
                            }
                        } else if (epxVarE.f < jCurrentTimeMillis) {
                            eqkVar.addMarker("cache-hit-refresh-needed");
                            eqkVar.setCacheEntry(epxVarE);
                            networkResponse.b = true;
                            boolean zC = this.d.c(eqkVar);
                            elq elqVar = this.f;
                            if (zC) {
                                elqVar.e(eqkVar, networkResponse, null);
                            } else {
                                elqVar.e(eqkVar, networkResponse, new dhr(this, eqkVar, 15, (int[]) null));
                            }
                        } else {
                            this.f.e(eqkVar, networkResponse, null);
                        }
                    }
                }
            }
        } finally {
            eqkVar.sendEvent(2);
        }
    }

    public final void a() {
        this.c = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        this.e.h();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.c) {
                    Thread.currentThread().interrupt();
                    return;
                }
                eqw.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
