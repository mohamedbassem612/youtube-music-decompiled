package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahtt {
    public static final long a;
    public static final Object b;
    public static lom c;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        a = 60000L;
        b = new Object();
    }

    public static void a(Context context) {
        if (c == null) {
            lom lomVar = new lom(context);
            c = lomVar;
            synchronized (lomVar.a) {
                lomVar.c = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (b) {
            if (c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                lom lomVar = c;
                if (lomVar.f.decrementAndGet() < 0) {
                    lqd lqdVar = lom.h;
                    Log.w("WakeLock", String.format("%s release without a matched acquire!", lomVar.d));
                }
                synchronized (lomVar.a) {
                    try {
                        lomVar.d();
                        Map map = lomVar.e;
                        if (map.containsKey(null)) {
                            abh abhVar = (abh) map.get(null);
                            if (abhVar != null) {
                                int i = abhVar.a - 1;
                                abhVar.a = i;
                                if (i == 0) {
                                    map.remove(null);
                                }
                            }
                        } else {
                            Log.w("WakeLock", lomVar.d + " counter does not exist");
                        }
                        lomVar.e();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
