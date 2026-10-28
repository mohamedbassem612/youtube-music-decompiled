package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class glq extends BroadcastReceiver {
    final /* synthetic */ gls a;

    public glq(gls glsVar) {
        this.a = glsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            return;
        }
        gls glsVar = this.a;
        glsVar.g();
        glsVar.t = false;
    }
}
