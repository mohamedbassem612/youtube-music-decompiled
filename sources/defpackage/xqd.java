package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xqd extends BroadcastReceiver {
    final /* synthetic */ xqe a;

    public xqd(xqe xqeVar) {
        this.a = xqeVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        xqe xqeVar = this.a;
        xqeVar.d();
        xqeVar.c();
    }
}
