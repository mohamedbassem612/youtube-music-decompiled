package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import com.google.android.libraries.notifications.platform.executor.impl.GnpExecutorApiService;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pnk implements pni {
    public static final agsn a = agsn.h("GnpSdk");
    private static final AtomicInteger e = new AtomicInteger();
    final Context b;
    final ahex c;
    final ScheduledExecutorService d;

    public pnk(Context context, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.b = context;
        this.c = MoreExecutors.a(executorService);
        this.d = scheduledExecutorService;
    }

    @Override // defpackage.pni
    public final void a(Runnable runnable) {
        this.c.execute(runnable);
    }

    @Override // defpackage.pni
    public final void b(BroadcastReceiver.PendingResult pendingResult, boolean z, Runnable runnable, plb plbVar) {
        int iIncrementAndGet = e.incrementAndGet();
        pnh pnhVar = new pnh(pendingResult, z, iIncrementAndGet);
        if (!plbVar.f()) {
            new Handler(Looper.getMainLooper()).postDelayed(new ooz(pnhVar, 19), plbVar.a());
        }
        Context context = this.b;
        try {
            this.c.execute(new cdf(iIncrementAndGet, ((PowerManager) context.getSystemService("power")).newWakeLock(1, "ChimeExecutorApi::".concat(String.valueOf(context.getPackageName()))), plbVar, runnable, pnhVar, 2));
        } catch (RuntimeException e2) {
            ((agsj) ((agsj) ((agsj) a.c()).j(e2)).k("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiImpl", "executeInBroadcast", 143, "GnpExecutorApiImpl.java")).t("Failed to execute in broadcast.");
        }
    }

    @Override // defpackage.pni
    public final void c(Runnable runnable) {
        agsn agsnVar = GnpExecutorApiService.a;
        qpj.e(new plj(runnable, this.b, 2));
    }

    @Override // defpackage.pni
    public final void d(Runnable runnable, plb plbVar) {
        if (plbVar.f()) {
            a(runnable);
            return;
        }
        ahex ahexVar = this.c;
        ahng.x(ahng.u(ahexVar.submit(runnable), plbVar.a(), TimeUnit.MILLISECONDS, this.d), new pnj(), ahexVar);
    }
}
