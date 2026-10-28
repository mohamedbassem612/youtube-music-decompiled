package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jmq extends BroadcastReceiver {
    final /* synthetic */ jmr a;

    public jmq(jmr jmrVar) {
        this.a = jmrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            this.a.a();
            return;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 86) {
            this.a.a();
        }
    }
}
