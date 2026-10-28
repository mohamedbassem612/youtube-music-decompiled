package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ksp {
    public static Executor a;
    private static final Object c = new Object();
    private static volatile ksp d;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    private ksp() {
    }

    public static ksp a() {
        if (d == null) {
            synchronized (c) {
                if (d == null) {
                    d = new ksp();
                }
            }
        }
        ksp kspVar = d;
        if (kspVar != null) {
            return kspVar;
        }
        throw new NullPointerException("null reference");
    }

    private static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private static final boolean f(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        if (executor == null) {
            executor = a;
        }
        return (!a.aL() || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
    }

    public final void b(Context context, ServiceConnection serviceConnection) {
        if (serviceConnection instanceof krb) {
            e(context, serviceConnection);
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        if (!concurrentHashMap.containsKey(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        try {
            e(context, (ServiceConnection) concurrentHashMap.get(serviceConnection));
        } finally {
            this.b.remove(serviceConnection);
        }
    }

    public final boolean c(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i, null);
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            try {
                if ((kte.a.a(context).f(component.getPackageName(), 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof krb) {
            return f(context, intent, serviceConnection, i, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.b.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zF = f(context, intent, serviceConnection, i, executor);
            if (zF) {
                return zF;
            }
            this.b.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            this.b.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }
}
