package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.TrafficStats;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ozc {
    public static final String a = "ozc";
    private static final Consumer d = new oyv(1);
    private static final Consumer e = new oyv(0);
    private static final Consumer f = new oyv(2);
    protected final List b;
    public final yr c;
    private final Context g;
    private final Executor h;
    private final ConnectivityManager i;
    private final Map j;
    private final Map k;
    private final Queue l;
    private boolean m;
    private final BroadcastReceiver n;
    private final grj o;

    public ozc(grj grjVar, Context context, Executor executor) {
        yr yrVar = new yr();
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = new ConcurrentLinkedQueue();
        this.b = new ArrayList();
        this.m = false;
        this.n = new oyw(this);
        new oyx(this);
        this.g = context;
        this.o = grjVar;
        this.h = executor;
        this.c = yrVar;
        this.i = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static String a(File file, String str) {
        return file.getAbsolutePath() + '/' + str;
    }

    public static void i(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (IllegalStateException | NullPointerException unused) {
            }
        }
    }

    private static boolean n(Context context, String str) {
        return avg.c(context, str) == 0;
    }

    private static final void o(List list, Consumer consumer) {
        agqs agqsVarListIterator = ((agke) list).listIterator(0);
        while (agqsVarListIterator.hasNext()) {
            consumer.accept((oyz) agqsVarListIterator.next());
        }
    }

    public final synchronized HttpURLConnection b(String str, String str2) {
        HttpURLConnection httpURLConnection;
        if (!n(this.g, "android.permission.INTERNET")) {
            throw new IllegalStateException("Missing INTERNET permission, can't start download");
        }
        ahno.O(!((oyu) this.j.get(str)).e());
        URLConnection uRLConnectionOpenConnection = ((CronetEngine) ((qcb) this.o.a).a).openConnection(new URL(str2));
        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
            throw new IOException("Cronet connection is not an HttpURLConnection");
        }
        httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        Object obj = this.c.b;
        this.k.put(str, httpURLConnection);
        return httpURLConnection;
    }

    protected final synchronized List c() {
        agjz agjzVar;
        agjzVar = new agjz(4);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            oyz oyzVar = (oyz) ((WeakReference) it.next()).get();
            if (oyzVar == null) {
                it.remove();
            } else {
                agjzVar.h(oyzVar);
            }
        }
        return agjzVar.g();
    }

    public final synchronized void d(File file, String str) {
        Map map = this.j;
        String strA = a(file, str);
        oyu oyuVar = (oyu) map.get(strA);
        if (oyuVar != null) {
            oyuVar.d();
        }
        i((HttpURLConnection) this.k.get(strA));
        if (oyuVar != null) {
            f();
        }
    }

    public final void e(oyu oyuVar) {
        List listC;
        oyuVar.c();
        synchronized (this) {
            Queue queue = this.l;
            boolean zIsEmpty = queue.isEmpty();
            queue.add(oyuVar);
            if (zIsEmpty) {
                this.g.registerReceiver(this.n, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.m = true;
                f();
            }
            listC = queue.containsAll(this.j.values()) ? c() : null;
        }
        if (listC != null) {
            o(listC, d);
        }
    }

    public final synchronized void f() {
        Queue queue = this.l;
        queue.size();
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            oyu oyuVar = (oyu) it.next();
            if (oyuVar.e() || j(oyuVar.a())) {
                it.remove();
                oyuVar.b();
                h(oyuVar);
            }
        }
        if (queue.isEmpty() && this.m) {
            this.g.unregisterReceiver(this.n);
            this.m = false;
        }
    }

    public final synchronized void g(oyz oyzVar) {
        this.b.add(new WeakReference(oyzVar));
    }

    public final void h(oyu oyuVar) {
        o(c(), e);
        this.h.execute(new oyy(this, oyuVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0097, code lost:
    
        if (r2.getType() != 17) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean j(defpackage.oyt r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            oyt r0 = defpackage.oyt.c     // Catch: java.lang.Throwable -> La8
            r1 = 1
            if (r8 != r0) goto L8
            monitor-exit(r7)
            return r1
        L8:
            android.content.Context r0 = r7.g     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = n(r0, r2)     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L9e
            android.net.ConnectivityManager r0 = r7.i     // Catch: java.lang.Throwable -> La8
            android.net.NetworkInfo r2 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> La8
            r3 = 0
            if (r2 == 0) goto L9b
            boolean r4 = r2.isAvailable()     // Catch: java.lang.Throwable -> La8
            if (r4 == 0) goto L9b
            boolean r4 = r2.isConnected()     // Catch: java.lang.Throwable -> La8
            if (r4 != 0) goto L2a
            monitor-exit(r7)
            goto L9c
        L2a:
            int r4 = r8.ordinal()     // Catch: java.lang.Throwable -> La8
            r5 = 17
            r6 = 9
            if (r4 == 0) goto L81
            if (r4 == r1) goto L4a
            java.lang.String r0 = defpackage.ozc.a     // Catch: java.lang.Throwable -> La8
            java.lang.String r8 = r8.name()     // Catch: java.lang.Throwable -> La8
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "Unknown connectivity type checked: "
            java.lang.String r8 = r2.concat(r8)     // Catch: java.lang.Throwable -> La8
            android.util.Log.e(r0, r8)     // Catch: java.lang.Throwable -> La8
            goto L99
        L4a:
            int r8 = r2.getType()     // Catch: java.lang.Throwable -> La8
            if (r8 == 0) goto L99
            int r8 = r2.getType()     // Catch: java.lang.Throwable -> La8
            r0 = 4
            if (r8 == r0) goto L99
            int r8 = r2.getType()     // Catch: java.lang.Throwable -> La8
            r0 = 6
            if (r8 == r0) goto L99
            int r8 = r2.getType()     // Catch: java.lang.Throwable -> La8
            r0 = 7
            if (r8 == r0) goto L99
            int r8 = r2.getType()     // Catch: java.lang.Throwable -> La8
            if (r8 == r1) goto L99
            int r8 = r2.getType()     // Catch: java.lang.Throwable -> La8
            if (r8 == r6) goto L99
            int r8 = r2.getType()     // Catch: java.lang.Throwable -> La8
            r0 = 16
            if (r8 == r0) goto L99
            int r8 = r2.getType()     // Catch: java.lang.Throwable -> La8
            if (r8 == r5) goto L99
            monitor-exit(r7)
            goto L9c
        L81:
            boolean r8 = r0.isActiveNetworkMetered()     // Catch: java.lang.Throwable -> La8
            if (r8 == 0) goto L99
            int r8 = r2.getType()     // Catch: java.lang.Throwable -> La8
            if (r8 == r1) goto L99
            int r8 = r2.getType()     // Catch: java.lang.Throwable -> La8
            if (r8 == r6) goto L99
            int r8 = r2.getType()     // Catch: java.lang.Throwable -> La8
            if (r8 != r5) goto L9b
        L99:
            monitor-exit(r7)
            goto L9d
        L9b:
            monitor-exit(r7)
        L9c:
            r1 = r3
        L9d:
            return r1
        L9e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La8
            java.lang.String r0 = "Attempting to determine connectivity without the ACCESS_NETWORK_STATE permission."
            r8.<init>(r0)     // Catch: java.lang.Throwable -> La8
            throw r8     // Catch: java.lang.Throwable -> La8
        La6:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> La8
            throw r8
        La8:
            r8 = move-exception
            goto La6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozc.j(oyt):boolean");
    }

    public final synchronized boolean k(oyu oyuVar) {
        File file = oyuVar.b;
        String str = oyuVar.c;
        Map map = this.j;
        String strA = a(file, str);
        if (map.containsKey(strA)) {
            return false;
        }
        map.put(strA, oyuVar);
        h(oyuVar);
        return true;
    }

    public final synchronized void l(HttpURLConnection httpURLConnection, int i) {
        if (i != -1) {
            if (httpURLConnection instanceof axsg) {
                ((axsg) httpURLConnection).b(i);
                return;
            }
            TrafficStats.setThreadStatsTag(i);
        }
    }

    public final void m(File file, String str, elr elrVar, oys oysVar, File file2) {
        List listC;
        List listC2;
        oif oifVar;
        String str2;
        String strA = a(file, str);
        synchronized (this) {
            Map map = this.j;
            map.remove(strA);
            this.k.remove(strA);
            if (map.isEmpty()) {
                listC = c();
                listC2 = null;
            } else if (this.l.containsAll(map.values())) {
                listC2 = c();
                listC = null;
            } else {
                listC = null;
                listC2 = null;
            }
        }
        if (oysVar == null) {
            file2.getName();
            int i = onb.a;
            ((aqi) elrVar.a).b(null);
        } else {
            file2.getName();
            int i2 = onb.a;
            int i3 = oysVar.c;
            acb acbVarA = oig.a();
            if (i3 == 0) {
                throw null;
            }
            switch (i3 - 1) {
                case 0:
                    oifVar = oif.ANDROID_DOWNLOADER_UNKNOWN;
                    break;
                case 1:
                    oifVar = oif.ANDROID_DOWNLOADER_CANCELED;
                    break;
                case 2:
                    oifVar = oif.ANDROID_DOWNLOADER_INVALID_REQUEST;
                    break;
                case 3:
                    oifVar = oif.ANDROID_DOWNLOADER_HTTP_ERROR;
                    break;
                case 4:
                    oifVar = oif.ANDROID_DOWNLOADER_REQUEST_ERROR;
                    break;
                case 5:
                    oifVar = oif.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR;
                    break;
                case 6:
                    oifVar = oif.ANDROID_DOWNLOADER_RESPONSE_CLOSE_ERROR;
                    break;
                case 7:
                    oifVar = oif.ANDROID_DOWNLOADER_NETWORK_IO_ERROR;
                    break;
                case 8:
                    oifVar = oif.ANDROID_DOWNLOADER_DISK_IO_ERROR;
                    break;
                case 9:
                    oifVar = oif.ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR;
                    break;
                case 10:
                    oifVar = oif.ANDROID_DOWNLOADER_UNKNOWN_IO_ERROR;
                    break;
                default:
                    throw new RuntimeException(null, null);
            }
            acbVarA.b = oifVar;
            switch (i3) {
                case 1:
                    str2 = "UNKNOWN";
                    break;
                case 2:
                    str2 = "CANCELED";
                    break;
                case 3:
                    str2 = "INVALID_REQUEST";
                    break;
                case 4:
                    str2 = "HTTP_ERROR";
                    break;
                case 5:
                    str2 = "REQUEST_ERROR";
                    break;
                case 6:
                    str2 = "RESPONSE_OPEN_ERROR";
                    break;
                case 7:
                    str2 = "RESPONSE_CLOSE_ERROR";
                    break;
                case 8:
                    str2 = "NETWORK_IO_ERROR";
                    break;
                case 9:
                    str2 = "DISK_IO_ERROR";
                    break;
                case 10:
                    str2 = "FILE_SYSTEM_ERROR";
                    break;
                default:
                    str2 = "UNKNOWN_IO_ERROR";
                    break;
            }
            int i4 = oysVar.a;
            String strBT = a.bT(str2, "ANDROID_DOWNLOADER_", "; ");
            if (i4 >= 0) {
                strBT = strBT + "HttpCode: " + i4 + "; ";
            }
            Object obj = oysVar.d;
            if (obj != null) {
                strBT = strBT + "Message: " + ((String) obj) + "; ";
            }
            Object obj2 = oysVar.e;
            acbVarA.c = strBT;
            if (obj2 != null) {
                acbVarA.d = obj2;
            }
            ((aqi) elrVar.a).d(acbVarA.a());
        }
        if (listC != null) {
            o(listC, f);
        } else if (listC2 != null) {
            o(listC2, d);
        }
    }
}
