package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class afmn implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ afmn(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afmr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        int i;
        int i2 = this.$cid;
        if (i2 == 0) {
            return this.b.a((abhh) ((jij) this.a).a);
        }
        if (i2 == 1) {
            ThreadLocal threadLocal = ((afmc) this.b).a;
            Object objCall = this.a.call();
            Throwable th = (Throwable) threadLocal.get();
            threadLocal.remove();
            if (th != null) {
                throw th;
            }
            return objCall;
        }
        ComponentName componentNameStartService = null;
        if (i2 == 2) {
            Object obj = this.b;
            Object obj2 = ((afry) obj).h;
            ?? r6 = this.a;
            synchronized (obj2) {
                Iterator it = r6.keySet().iterator();
                while (it.hasNext()) {
                }
            }
            return null;
        }
        ahtj ahtjVarA = ahtj.a();
        ahtjVarA.c.offer(this.a);
        Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
        Object obj3 = this.b;
        Context context = (Context) obj3;
        intent.setPackage(context.getPackageName());
        String strB = ahtjVarA.b(context, intent);
        if (strB != null) {
            intent.setClassName(context.getPackageName(), strB);
        }
        try {
            if (ahtjVarA.c((Context) obj3)) {
                synchronized (ahtt.b) {
                    ahtt.a((Context) obj3);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    ComponentName componentNameStartService2 = ((Context) obj3).startService(intent);
                    if (componentNameStartService2 != null) {
                        if (!booleanExtra) {
                            ahtt.c.a(ahtt.a);
                        }
                        componentNameStartService = componentNameStartService2;
                    }
                }
            } else {
                componentNameStartService = ((Context) obj3).startService(intent);
            }
            if (componentNameStartService == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                i = 404;
            } else {
                i = -1;
            }
        } catch (IllegalStateException e) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: ".concat(e.toString()));
            i = 402;
        } catch (SecurityException e2) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
            i = 401;
        }
        return Integer.valueOf(i);
    }

    public /* synthetic */ afmn(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
