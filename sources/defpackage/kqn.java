package defpackage;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kqn extends kqo {
    final /* synthetic */ kou a;
    final /* synthetic */ PendingIntent b;

    public kqn(kou kouVar, PendingIntent pendingIntent) {
        this.a = kouVar;
        this.b = pendingIntent;
    }

    @Override // defpackage.kqo
    public final void a() {
        try {
            this.a.startIntentSenderForResult(this.b.getIntentSender(), 2, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent sender.", e);
        }
    }
}
