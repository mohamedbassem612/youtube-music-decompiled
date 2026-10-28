package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class aujq implements Runnable {
    final /* synthetic */ Activity a;
    final /* synthetic */ PendingIntent b;
    final /* synthetic */ int c;

    public aujq(Activity activity, PendingIntent pendingIntent, int i) {
        this.a = activity;
        this.b = pendingIntent;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.startIntentSenderForResult(this.b.getIntentSender(), this.c, null, 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            Log.e("DaydreamApi", "Exception while starting next VR activity: ".concat(e.toString()));
        }
    }
}
