package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaso implements aasb {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/transfer/executor/ExecutorServiceTransfersRunner");
    public final PowerManager.WakeLock b;
    public final aauk c;
    private final ScheduledExecutorService d;

    public aaso(Context context, ScheduledExecutorService scheduledExecutorService, aauk aaukVar) {
        this.d = scheduledExecutorService;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        powerManager.getClass();
        this.b = powerManager.newWakeLock(1, getClass().getName());
        this.c = aaukVar;
    }

    @Override // defpackage.aasb
    public final void a(aarw aarwVar) {
        aadw aadwVar = new aadw(this, aarwVar, 5, (byte[]) null);
        ScheduledExecutorService scheduledExecutorService = this.d;
        ahng.q(aadwVar, scheduledExecutorService).addListener(new aadm(this, 12), scheduledExecutorService);
    }

    public final void b() {
        try {
            this.b.release();
        } catch (RuntimeException unused) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/offline/transfer/executor/ExecutorServiceTransfersRunner", "releaseWakeLock", 97, "ExecutorServiceTransfersRunner.java")).t("[Offline] Wakelock already released.");
        }
    }
}
