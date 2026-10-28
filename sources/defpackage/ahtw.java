package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ahtw implements ServiceConnection {
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;
    private final Queue d;
    private ahtu e;
    private boolean f;

    public ahtw(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ktb("Firebase-FirebaseInstanceIdServiceConnection", 0));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    private final void b() {
        while (true) {
            Queue queue = this.d;
            if (queue.isEmpty()) {
                return;
            } else {
                ((ahtv) queue.poll()).b();
            }
        }
    }

    private final synchronized void c() {
        while (true) {
            Queue queue = this.d;
            if (queue.isEmpty()) {
                break;
            }
            ahtu ahtuVar = this.e;
            if (ahtuVar != null && ahtuVar.isBinderAlive()) {
                ahtv ahtvVar = (ahtv) queue.poll();
                ahtu ahtuVar2 = this.e;
                if (Binder.getCallingUid() != Process.myUid()) {
                    throw new SecurityException("Binding only allowed within app");
                }
                ((ahsr) ahtuVar2.a.a).d((Intent) ahtvVar.a).l(new cte(16), new kbr(ahtvVar, 10));
            } else {
                if (this.f) {
                    break;
                }
                this.f = true;
                try {
                    if (ksp.a().c(this.a, this.b, this, 65)) {
                        break;
                    }
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f = false;
                    b();
                    return;
                } catch (SecurityException e) {
                    Log.e("FirebaseMessaging", "Exception while binding the service", e);
                }
            }
        }
    }

    final synchronized lpa a(Intent intent) {
        ahtv ahtvVar;
        ahtvVar = new ahtv(intent);
        afjc afjcVar = new afjc(ahtvVar, 11);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ScheduledExecutorService scheduledExecutorService = this.c;
        ahtvVar.a().l(scheduledExecutorService, new kbr(scheduledExecutorService.schedule(afjcVar, 20L, timeUnit), 11));
        this.d.add(ahtvVar);
        c();
        return ahtvVar.a();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f = false;
        if (iBinder instanceof ahtu) {
            this.e = (ahtu) iBinder;
            c();
        } else {
            Log.e("FirebaseMessaging", "Invalid service connection: ".concat(String.valueOf(String.valueOf(iBinder))));
            b();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c();
    }
}
