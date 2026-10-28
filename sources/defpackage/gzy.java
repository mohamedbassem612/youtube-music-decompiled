package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gzy extends iwp {
    final /* synthetic */ qkb a;

    public gzy(qkb qkbVar) {
        this.a = qkbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.os.MessageQueue$IdleHandler, java.lang.Object] */
    @Override // defpackage.iwp, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        qkb qkbVar = this.a;
        if (qkbVar.b) {
            return;
        }
        Looper.getMainLooper().getQueue().removeIdleHandler(qkbVar.c);
        qkbVar.b = true;
    }
}
