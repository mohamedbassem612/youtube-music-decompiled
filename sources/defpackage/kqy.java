package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kqy {
    public static final Object a = new Object();
    static HandlerThread b = null;
    public static boolean c = false;
    public static kqy i;
    public final HashMap d = new HashMap();
    public final Context e;
    public volatile Handler f;
    public final ksp g;
    public final long h;
    public final bwd j;
    private final long k;
    private volatile Executor l;

    public kqy(Context context, Looper looper) {
        bwd bwdVar = new bwd(this, 3);
        this.j = bwdVar;
        this.e = context.getApplicationContext();
        this.f = new afkg(looper, bwdVar);
        this.g = ksp.a();
        this.k = 5000L;
        this.h = 300000L;
        this.l = null;
    }

    public static HandlerThread a() {
        HandlerThread handlerThread;
        synchronized (a) {
            HandlerThread handlerThread2 = b;
            if (handlerThread2 == null || !handlerThread2.isAlive()) {
                HandlerThread handlerThread3 = new HandlerThread("GoogleApiHandler", 9);
                b = handlerThread3;
                handlerThread3.start();
                handlerThread = b;
            } else {
                handlerThread = b;
            }
        }
        return handlerThread;
    }

    public static kqy b(Context context) {
        kqy kqyVar;
        synchronized (a) {
            kqyVar = i;
            if (kqyVar == null) {
                if (!c) {
                    c = kqw.a(context.getPackageName());
                }
                kqyVar = new kqy(context.getApplicationContext(), c ? a().getLooper() : context.getMainLooper());
                i = kqyVar;
            }
        }
        return kqyVar;
    }

    public final klo c(kqx kqxVar, ServiceConnection serviceConnection, String str, Executor executor) {
        HashMap map = this.d;
        synchronized (map) {
            kra kraVar = (kra) map.get(kqxVar);
            klo kloVarA = null;
            if (executor == null) {
                Executor executor2 = this.l;
                executor = null;
            }
            if (kraVar == null) {
                kraVar = new kra(this, kqxVar);
                kraVar.e(serviceConnection, serviceConnection);
                kloVarA = kraVar.a(str, executor);
                map.put(kqxVar, kraVar);
            } else {
                this.f.removeMessages(0, kqxVar);
                if (kraVar.c(serviceConnection)) {
                    throw new IllegalStateException(a.co(kqxVar, "Trying to bind a GmsServiceConnection that was already connected before.  config="));
                }
                kraVar.e(serviceConnection, serviceConnection);
                int i2 = kraVar.c;
                if (i2 == 1) {
                    serviceConnection.onServiceConnected(kraVar.f, kraVar.e);
                } else if (i2 == 2) {
                    kloVarA = kraVar.a(str, executor);
                }
            }
            if (kraVar.d) {
                return klo.a;
            }
            if (kloVarA == null) {
                kloVarA = new klo(1, -1, null, null, null, null);
            }
            return kloVarA;
        }
    }

    public final void d(kra kraVar) {
        if (kraVar.h != null) {
            this.f.removeMessages(1, kraVar.h);
            kraVar.h = null;
        }
    }

    public final void e(ComponentName componentName, ServiceConnection serviceConnection) {
        f(new kqx(componentName), serviceConnection);
    }

    protected final void f(kqx kqxVar, ServiceConnection serviceConnection) {
        HashMap map = this.d;
        synchronized (map) {
            kra kraVar = (kra) map.get(kqxVar);
            if (kraVar == null) {
                throw new IllegalStateException(a.co(kqxVar, "Nonexistent connection status for service config: "));
            }
            if (!kraVar.c(serviceConnection)) {
                throw new IllegalStateException(a.co(kqxVar, "Trying to unbind a GmsServiceConnection  that was not bound before.  config="));
            }
            kraVar.a.remove(serviceConnection);
            if (kraVar.d()) {
                this.f.sendMessageDelayed(this.f.obtainMessage(0, kqxVar), this.k);
            }
        }
    }
}
