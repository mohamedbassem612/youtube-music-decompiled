package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cfi extends BroadcastReceiver {
    final /* synthetic */ cfj a;

    public cfi(cfj cfjVar) {
        this.a = cfjVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        cfj cfjVar = this.a;
        cfjVar.b(cff.c(context, intent, cfjVar.h, cfjVar.g, cfjVar.a()));
    }
}
