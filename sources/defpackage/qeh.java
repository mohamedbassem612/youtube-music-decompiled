package defpackage;

import android.app.Activity;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qeh extends qei {
    final /* synthetic */ qej a;

    public qeh(qej qejVar) {
        this.a = qejVar;
    }

    @Override // defpackage.qei, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        qej qejVar = this.a;
        int i = qejVar.b - 1;
        qejVar.b = i;
        if (i == 0) {
            qejVar.h = qci.c(activity.getClass());
            Handler handler = qejVar.e;
            aguu.ak(handler);
            Runnable runnable = qejVar.f;
            aguu.ak(runnable);
            handler.postDelayed(runnable, 700L);
        }
    }

    @Override // defpackage.qei, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        qej qejVar = this.a;
        int i = qejVar.b + 1;
        qejVar.b = i;
        if (i == 1) {
            if (qejVar.c) {
                Iterator it = qejVar.g.iterator();
                while (it.hasNext()) {
                    ((qdx) it.next()).l(new qci(activity.getClass().getSimpleName()));
                }
                qejVar.c = false;
                return;
            }
            Handler handler = qejVar.e;
            aguu.ak(handler);
            Runnable runnable = qejVar.f;
            aguu.ak(runnable);
            handler.removeCallbacks(runnable);
        }
    }

    @Override // defpackage.qei, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        qej qejVar = this.a;
        int i = qejVar.a + 1;
        qejVar.a = i;
        if (i == 1 && qejVar.d) {
            for (qdx qdxVar : qejVar.g) {
                activity.getClass().getSimpleName();
            }
            qejVar.d = false;
        }
    }

    @Override // defpackage.qei, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        qej qejVar = this.a;
        qejVar.a--;
        qci.c(activity.getClass());
        qejVar.a();
    }
}
