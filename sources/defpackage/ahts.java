package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ahts implements Runnable {
    private static final Object c = new Object();
    private static Boolean d;
    private static Boolean e;
    public final Context a;
    public final ahtq b;
    private final ahtf f;
    private final PowerManager.WakeLock g;
    private final long h;

    public ahts(ahtq ahtqVar, Context context, ahtf ahtfVar, long j) {
        this.b = ahtqVar;
        this.a = context;
        this.h = j;
        this.f = ahtfVar;
        this.g = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static boolean b(Context context) {
        boolean zBooleanValue;
        synchronized (c) {
            Boolean bool = d;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? c(context, "android.permission.WAKE_LOCK") : bool.booleanValue());
            d = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    private static boolean c(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public final synchronized boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        r3 = r2.b;
        r4 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        if (r4 == 83) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:
    
        if (r4 != 85) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
    
        if (r3.equals("U") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
    
        r3 = r2.a;
        r4 = r0.c;
        r5 = r4.b;
        r6 = ((defpackage.ahsa) defpackage.jij.v(r5.l())).a;
        ((com.google.firebase.messaging.FirebaseMessaging) r4.a).l();
        r4.w(r3, r6, (java.lang.String) defpackage.jij.v(r5.a()), "unsubscribe");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bc, code lost:
    
        if (r3.equals("S") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00be, code lost:
    
        r3 = r2.a;
        r4 = r0.c;
        r5 = r4.b;
        r6 = ((defpackage.ahsa) defpackage.jij.v(r5.l())).a;
        ((com.google.firebase.messaging.FirebaseMessaging) r4.a).l();
        r4.w(r3, r6, (java.lang.String) defpackage.jij.v(r5.a()), "subscribe");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
    
        r0.b.d(r2);
        r3 = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ed, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        r2 = r2.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f4, code lost:
    
        if (r3.containsKey(r2) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f6, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f9, code lost:
    
        r4 = (java.util.ArrayDeque) r3.get(r2);
        r5 = (defpackage.kjc) r4.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0105, code lost:
    
        if (r5 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0107, code lost:
    
        r5.v(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010f, code lost:
    
        if (r4.isEmpty() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0111, code lost:
    
        r3.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0114, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0118, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0119, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0126, code lost:
    
        if ("SERVICE_NOT_AVAILABLE".equals(r0.getMessage()) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0138, code lost:
    
        if (r0.getMessage() == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013a, code lost:
    
        android.util.Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0142, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0143, code lost:
    
        android.util.Log.e("FirebaseMessaging", "Topic operation failed: " + r0.getMessage() + ". Will retry Topic operation.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0162, code lost:
    
        r8.b.e(r8.h);
     */
    /* JADX WARN: Type inference failed for: r5v1, types: [ahrw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [ahrw, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahts.run():void");
    }
}
