package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ahtr extends BroadcastReceiver {
    final /* synthetic */ ahts a;
    private ahts b;

    public ahtr(ahts ahtsVar, ahts ahtsVar2) {
        this.a = ahtsVar;
        this.b = ahtsVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        ahts ahtsVar = this.b;
        if (ahtsVar == null || !ahtsVar.a()) {
            return;
        }
        ahts ahtsVar2 = this.b;
        ahtsVar2.b.b(ahtsVar2, 0L);
        context.unregisterReceiver(this);
        this.b = null;
    }
}
