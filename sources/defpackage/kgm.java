package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kgm extends BroadcastReceiver {
    final /* synthetic */ kgo a;

    public kgm(kgo kgoVar) {
        this.a = kgoVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            if (action.equals("android.intent.action.SCREEN_ON")) {
                this.a.c();
            } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                this.a.e();
            }
        }
    }
}
