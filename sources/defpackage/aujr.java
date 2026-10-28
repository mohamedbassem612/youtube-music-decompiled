package defpackage;

import android.app.Activity;
import android.app.PendingIntent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aujr extends aukg {
    final /* synthetic */ Activity a;
    final /* synthetic */ PendingIntent b;
    final /* synthetic */ int c;

    public aujr(Activity activity, PendingIntent pendingIntent, int i) {
        this.a = activity;
        this.b = pendingIntent;
        this.c = i;
    }

    @Override // defpackage.aukh
    public final void b() {
        Activity activity = this.a;
        activity.runOnUiThread(new aujq(activity, this.b, this.c));
    }
}
