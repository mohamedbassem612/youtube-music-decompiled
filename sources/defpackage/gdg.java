package defpackage;

import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gdg {
    public final gdi a;
    public final Executor b;
    public final BlockingQueue c;
    public final String d;
    public final boolean g;
    private final String j;
    private final LinkedHashMap i = new LinkedHashMap();
    public int f = 1;
    private final String k = "3";
    public final int e = 16;
    public kro h = new kro();

    public gdg(String str, String str2, String str3, gdi gdiVar, Executor executor) {
        this.d = str;
        this.j = str2;
        this.a = gdiVar;
        b("v", "3");
        b("s", str2);
        this.c = new ArrayBlockingQueue(16);
        if (executor != null) {
            this.g = true;
            this.b = executor;
        } else {
            this.g = false;
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new gdf());
            this.b = executorServiceNewSingleThreadExecutor;
            executorServiceNewSingleThreadExecutor.execute(new dxk(this, 11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3 A[DONT_INVERT, PHI: r5
      0x00e3: PHI (r5v6 java.util.Map) = (r5v2 java.util.Map), (r5v7 java.util.Map) binds: [B:33:0x00de, B:35:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e5 A[Catch: gdd -> 0x0148, TryCatch #1 {gdd -> 0x0148, blocks: (B:46:0x0115, B:23:0x00b7, B:31:0x00d6, B:32:0x00dd, B:27:0x00c4, B:29:0x00ca, B:39:0x00eb, B:40:0x00f2, B:37:0x00e5, B:41:0x00f3, B:43:0x00f9, B:45:0x0109, B:47:0x011f, B:48:0x0126, B:51:0x0129, B:52:0x0136, B:53:0x0137), top: B:65:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f9 A[Catch: gdd -> 0x0148, TryCatch #1 {gdd -> 0x0148, blocks: (B:46:0x0115, B:23:0x00b7, B:31:0x00d6, B:32:0x00dd, B:27:0x00c4, B:29:0x00ca, B:39:0x00eb, B:40:0x00f2, B:37:0x00e5, B:41:0x00f3, B:43:0x00f9, B:45:0x0109, B:47:0x011f, B:48:0x0126, B:51:0x0129, B:52:0x0136, B:53:0x0137), top: B:65:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0109 A[Catch: gdd -> 0x0148, TryCatch #1 {gdd -> 0x0148, blocks: (B:46:0x0115, B:23:0x00b7, B:31:0x00d6, B:32:0x00dd, B:27:0x00c4, B:29:0x00ca, B:39:0x00eb, B:40:0x00f2, B:37:0x00e5, B:41:0x00f3, B:43:0x00f9, B:45:0x0109, B:47:0x011f, B:48:0x0126, B:51:0x0129, B:52:0x0136, B:53:0x0137), top: B:65:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x011f A[SYNTHETIC] */
    public final Map a(List list) {
        LinkedHashMap linkedHashMap;
        Iterator it;
        List list2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (true) {
            int i = 1;
            if (!it2.hasNext()) {
                break;
            }
            gdk gdkVar = (gdk) it2.next();
            ((List) j$.util.Map.EL.computeIfAbsent(linkedHashMap3, gdkVar.b, new hds(i))).add(gdkVar);
        }
        Iterator it3 = linkedHashMap3.keySet().iterator();
        while (it3.hasNext()) {
            String str = (String) it3.next();
            List list3 = (List) linkedHashMap3.get(str);
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(this.i);
            try {
                kro kroVar = this.h;
                boolean z = false;
                gdk[] gdkVarArr = (gdk[]) list3.toArray(new gdk[0]);
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                int i2 = 0;
                Map mapB = null;
                String str2 = null;
                while (i2 < gdkVarArr.length) {
                    Map mapF = gdkVarArr[i2].f(kroVar);
                    if (mapF == null) {
                        throw new gdd("The report items get from ticker is null.");
                    }
                    linkedHashMap = linkedHashMap3;
                    it = it3;
                    if (i2 == 0) {
                        try {
                            String str3 = (String) mapF.get("action");
                            mapB = gdkVarArr[0].b();
                            if (mapF.containsKey("irt")) {
                                sb2.append((String) mapF.get("irt"));
                                sb2.append(',');
                                z = true;
                            }
                            sb.append((String) mapF.get("it"));
                            sb.append(',');
                            str2 = str3;
                            list2 = list3;
                        } catch (gdd e) {
                            e = e;
                            list2 = list3;
                        }
                    } else {
                        list2 = list3;
                        Map mapB2 = gdkVarArr[i2].b();
                        if (!mapF.containsKey("action")) {
                            if (str2 == null) {
                                str2 = null;
                                if (!mapF.containsKey("action")) {
                                }
                                if (mapB2 != null) {
                                    if (mapB == null) {
                                        mapB = null;
                                        if (mapB2 == null) {
                                        }
                                        if (mapF.containsKey("irt") == z) {
                                            throw new gdd("Can not get merged report items for the tickers with different latency variables.");
                                        }
                                        sb.append((String) mapF.get("it"));
                                        sb.append(',');
                                        if (z) {
                                            sb2.append((String) mapF.get("irt"));
                                            sb2.append(',');
                                        }
                                    }
                                    throw new gdd("Can not get merged report items for the tickers with different customized parameter-value pairs.");
                                }
                                if (mapB2 == null) {
                                }
                                if (mapF.containsKey("irt") == z) {
                                    throw new gdd("Can not get merged report items for the tickers with different latency variables.");
                                }
                                sb.append((String) mapF.get("it"));
                                sb.append(',');
                                if (z) {
                                    sb2.append((String) mapF.get("irt"));
                                    sb2.append(',');
                                }
                            }
                            throw new gdd("Can not get merged report items for the tickers with different action names.");
                        }
                        if (!mapF.containsKey("action") && !((String) mapF.get("action")).equals(str2)) {
                            throw new gdd("Can not get merged report items for the tickers with different action names.");
                        }
                        if (mapB2 != null) {
                            if (mapB == null) {
                                mapB = null;
                                if (mapB2 == null) {
                                }
                                if (mapF.containsKey("irt") == z) {
                                    throw new gdd("Can not get merged report items for the tickers with different latency variables.");
                                }
                                sb.append((String) mapF.get("it"));
                                sb.append(',');
                                if (z) {
                                    sb2.append((String) mapF.get("irt"));
                                    sb2.append(',');
                                }
                            }
                            throw new gdd("Can not get merged report items for the tickers with different customized parameter-value pairs.");
                        }
                        if (mapB2 == null && !mapB2.equals(mapB)) {
                            throw new gdd("Can not get merged report items for the tickers with different customized parameter-value pairs.");
                        }
                        if (mapF.containsKey("irt") == z) {
                            throw new gdd("Can not get merged report items for the tickers with different latency variables.");
                        }
                        sb.append((String) mapF.get("it"));
                        sb.append(',');
                        if (z) {
                            sb2.append((String) mapF.get("irt"));
                            sb2.append(',');
                        }
                        Log.w("ReporterDefault", "failed to merge tickers:".concat(String.valueOf(String.valueOf(list2))), e);
                        linkedHashMap3 = linkedHashMap;
                        it3 = it;
                    }
                    try {
                        i2++;
                        linkedHashMap3 = linkedHashMap;
                        it3 = it;
                        list3 = list2;
                    } catch (gdd e2) {
                        e = e2;
                    }
                }
                linkedHashMap = linkedHashMap3;
                it = it3;
                linkedHashMap4.putAll(gdk.a(str2, mapB, sb, sb2));
                linkedHashMap2.put(str, linkedHashMap4);
            } catch (gdd e3) {
                e = e3;
                linkedHashMap = linkedHashMap3;
                it = it3;
            }
            linkedHashMap3 = linkedHashMap;
            it3 = it;
        }
        return linkedHashMap2;
    }

    public final void b(String str, String str2) {
        this.i.put(str, str2);
    }
}
