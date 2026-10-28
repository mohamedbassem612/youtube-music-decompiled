package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import com.google.android.libraries.directboot.DirectBootHelperService;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mef {
    public static final /* synthetic */ int a = 0;
    private static UserManager b = null;
    private static volatile boolean c = false;
    private static boolean d = false;

    private mef() {
    }

    public static Context a(Context context) {
        return !context.isDeviceProtectedStorage() ? context.createDeviceProtectedStorageContext() : context;
    }

    public static ListenableFuture b(final Context context, ahcx ahcxVar, Executor executor) {
        if (i(context)) {
            return ahng.s(ahcxVar, executor);
        }
        final SettableFuture settableFutureCreate = SettableFuture.create();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final mee meeVar = new mee(atomicBoolean, context, settableFutureCreate, ahcxVar, executor);
        context.registerReceiver(meeVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (i(context) && atomicBoolean.compareAndSet(false, true)) {
            f(context, meeVar);
            settableFutureCreate.setFuture(ahng.s(ahcxVar, executor));
        } else {
            settableFutureCreate.addListener(new Runnable() { // from class: med
                @Override // java.lang.Runnable
                public final void run() {
                    int i = mef.a;
                    if (settableFutureCreate.isCancelled() && atomicBoolean.compareAndSet(false, true)) {
                        mef.f(context, meeVar);
                    }
                }
            }, MoreExecutors.directExecutor());
        }
        return settableFutureCreate;
    }

    public static ListenableFuture c(Context context, Callable callable, Executor executor) {
        return b(context, new iud(callable, 2), executor);
    }

    public static ListenableFuture d(Context context, Runnable runnable) {
        return c(context, Executors.callable(runnable, null), MoreExecutors.directExecutor());
    }

    public static ListenableFuture e(Context context, Runnable runnable, Executor executor) {
        return c(context, Executors.callable(runnable, null), executor);
    }

    public static void f(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
        }
    }

    public static synchronized void g() {
        d = true;
    }

    public static boolean h(Context context) {
        boolean zJ;
        if (c) {
            return true;
        }
        synchronized (mef.class) {
            if (c) {
                return true;
            }
            if (d) {
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setClassName(context, DirectBootHelperService.class.getName()), 268435968);
                zJ = false;
                if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
                    Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zJ = true;
                            break;
                        }
                        if (it.next().serviceInfo.directBootAware) {
                            Log.w("DirectBootUtils", "Falling back to user manager.");
                            d = false;
                            zJ = j(context);
                            break;
                        }
                    }
                }
            } else {
                zJ = j(context);
            }
            if (zJ) {
                c = true;
            }
            return zJ;
        }
    }

    public static boolean i(Context context) {
        return h(context);
    }

    private static boolean j(Context context) {
        boolean z = true;
        int i = 1;
        while (true) {
            if (i <= 2) {
                UserManager userManager = b;
                if (userManager == null) {
                    userManager = (UserManager) context.getSystemService(UserManager.class);
                    b = userManager;
                }
                if (userManager != null) {
                    try {
                        if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                            break;
                            break;
                        }
                        break;
                    } catch (NullPointerException e) {
                        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                        b = null;
                        i++;
                    }
                }
                return z;
            }
            z = false;
            break;
        }
        if (z) {
            b = null;
        }
        return z;
    }
}
