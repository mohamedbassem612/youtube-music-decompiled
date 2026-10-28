package defpackage;

import android.os.Looper;
import internal.J.N;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.chromium.base.ApplicationStatus;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class aeia implements Runnable {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aeia(int i) {
        this.$cid = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 10:
                return;
            case 7:
                Throwable th = new Throwable();
                th.fillInStackTrace();
                ((agrc) ((agrc) ((agrc) afkl.a.b()).j(th)).k("com/google/apps/tiktok/concurrent/futuresmixin/FuturesMixinImpl$1", "run", (char) 225, "FuturesMixinImpl.java")).t("b/66999648 detected");
                return;
            case 9:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
            case 11:
                Map map = awjf.d;
                ArrayList arrayList = new ArrayList(map.keySet());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) arrayList.get(i);
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        map.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                return;
            case 12:
                if (ApplicationStatus.b == null) {
                    ApplicationStatus.b = new axjb();
                    ApplicationStatus.a(ApplicationStatus.b);
                    return;
                }
                return;
            default:
                boolean zMnfJQqTB = N.MnfJQqTB();
                if (axjr.a == null) {
                    if (zMnfJQqTB) {
                        axjr.a = new axjr();
                        Looper.myQueue().addIdleHandler(axjr.a);
                        return;
                    }
                    return;
                }
                if (zMnfJQqTB) {
                    return;
                }
                Looper.myQueue().removeIdleHandler(axjr.a);
                axjr.a = null;
                return;
        }
    }
}
