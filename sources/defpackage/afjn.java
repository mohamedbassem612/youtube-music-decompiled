package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afjn {
    public static final agrf a = agrf.h("com/google/apps/tiktok/concurrent/AndroidFutures");
    public final Context b;
    public final Map c;
    public final Map d;
    private final PowerManager e;
    private final ahex f;
    private final ahey g;
    private final ahey h;
    private boolean i;
    private final omr j;

    public afjn(Context context, PowerManager powerManager, ahex ahexVar, Map map, Map map2, ahey aheyVar, ahey aheyVar2, omr omrVar) {
        aguu.al(new aeru(this, 3));
        aguu.al(new aeru(this, 4));
        this.i = false;
        this.b = context;
        this.e = powerManager;
        this.f = ahexVar;
        this.g = aheyVar;
        this.h = aheyVar2;
        this.c = map;
        this.d = map2;
        this.j = omrVar;
    }

    public static void d(final int i, final ListenableFuture listenableFuture, final String str, final Object... objArr) {
        listenableFuture.addListener(afwl.i(new Runnable() { // from class: afjm
            @Override // java.lang.Runnable
            public final void run() {
                afjn.e(listenableFuture, i, str, objArr);
            }
        }), MoreExecutors.directExecutor());
    }

    static /* synthetic */ void e(ListenableFuture listenableFuture, int i, String str, Object[] objArr) {
        try {
            ahno.R(listenableFuture.isDone(), "Future was expected to be done: %s", listenableFuture);
            a.i(listenableFuture);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e.getCause())).k("B", "a", i, null)).I(str, objArr);
        }
    }

    public final String a() {
        omr omrVar = this.j;
        String strL = qnl.l(this.b);
        return omrVar.m() ? "main_process_service_key" : strL.substring(strL.lastIndexOf(":") + 1);
    }

    public final void b(ListenableFuture listenableFuture, String str) {
        if (listenableFuture.isDone()) {
            return;
        }
        try {
            PowerManager.WakeLock wakeLockNewWakeLock = this.e.newWakeLock(1, str);
            wakeLockNewWakeLock.acquire();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ListenableFuture listenableFutureO = ahng.o(listenableFuture);
            ahey aheyVar = this.g;
            int i = afwq.a;
            afvl afvlVar = ((afvh) afty.d.get()).c;
            ListenableFuture listenableFutureO2 = ahng.o(listenableFutureO);
            ListenableFuture listenableFutureU = ahng.u(listenableFutureO2, 45L, timeUnit, aheyVar);
            afgt afgtVar = new afgt(listenableFutureO, listenableFutureU, afvlVar, listenableFutureO2, 2);
            Executor executorDirectExecutor = MoreExecutors.directExecutor();
            int i2 = ahbz.d;
            ahbx ahbxVar = new ahbx(listenableFutureU, TimeoutException.class, afgtVar);
            listenableFutureU.addListener(ahbxVar, MoreExecutors.c(executorDirectExecutor, ahbxVar));
            tzd tzdVar = new tzd(str, 5);
            long j = afwl.a;
            ahbxVar.addListener(new ahei(ahbxVar, new afwj(afty.c(false), tzdVar, 0)), MoreExecutors.directExecutor());
            ListenableFuture listenableFutureU2 = ahng.u(ahng.o(listenableFuture), 3600L, TimeUnit.SECONDS, this.h);
            wakeLockNewWakeLock.getClass();
            listenableFutureU2.addListener(new acem(wakeLockNewWakeLock, 10), MoreExecutors.directExecutor());
        } catch (SecurityException e) {
            if (this.i) {
                return;
            }
            try {
                Context context = this.b;
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), SemanticState.Obscured);
                if (packageInfo.requestedPermissions == null) {
                    throw e;
                }
                for (String str2 : packageInfo.requestedPermissions) {
                    if ("android.permission.WAKE_LOCK".equals(str2)) {
                        this.i = true;
                        ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/apps/tiktok/concurrent/AndroidFutures", "checkPermissionRequested", 189, "AndroidFutures.java")).t("Failed to acquire wakelock");
                        return;
                    }
                }
                throw e;
            } catch (PackageManager.NameNotFoundException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    public final void c(final ListenableFuture listenableFuture, final long j, final TimeUnit timeUnit) {
        listenableFuture.addListener(afwl.i(new afii(this.g.schedule(afwl.i(new Runnable() { // from class: afjl
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFuture listenableFuture2 = listenableFuture;
                if (listenableFuture2.isDone()) {
                    return;
                }
                ((agrc) ((agrc) ((agrc) afjn.a.b()).j(afwq.a())).k("com/google/apps/tiktok/concurrent/AndroidFutures", "crashApplicationOnFailure", 382, "AndroidFutures.java")).E("Timeout exceeded waiting on crashApplicationOnFailure future. Waited %s %s. Allowing future %s to continue anyway.", Long.valueOf(j), timeUnit, listenableFuture2);
            }
        }), j, timeUnit), listenableFuture, 3)), this.f);
    }
}
