package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class abrs extends BroadcastReceiver {
    final /* synthetic */ abrt a;

    public abrs(abrt abrtVar) {
        this.a = abrtVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || Objects.equals(action, "noop")) {
            return;
        }
        if (Objects.equals(action, "com.google.android.libraries.youtube.player.action.controller_notification_delete")) {
            this.a.a.b();
        } else if (Objects.equals(action, "android.intent.action.MAIN")) {
            this.a.b.d();
        }
        abrt abrtVar = this.a;
        for (abrn abrnVar : abrtVar.d) {
            if (abrnVar.i(action)) {
                abrtVar.b.b(abrnVar);
            }
        }
    }
}
