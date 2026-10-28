package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class acej extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        fg fgVar = ((aceq) aceq.class.cast(tym.N(tym.L(context)))).aS().a;
        if (fgVar == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null) {
            return;
        }
        ((fg) fgVar.a).q(keyEvent);
    }
}
