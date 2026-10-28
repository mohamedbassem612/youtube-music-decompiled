package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ahtl extends BroadcastReceiver {
    public ahtm a;
    public Context b;

    public ahtl(ahtm ahtmVar) {
        this.a = ahtmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ahtm ahtmVar = this.a;
        if (ahtmVar == null || !ahtmVar.b()) {
            return;
        }
        ahtm ahtmVar2 = this.a;
        FirebaseMessaging firebaseMessaging = ahtmVar2.a;
        FirebaseMessaging.m(ahtmVar2, 0L);
        Context context2 = this.b;
        if (context2 != null) {
            context2.unregisterReceiver(this);
        }
        this.a = null;
    }
}
