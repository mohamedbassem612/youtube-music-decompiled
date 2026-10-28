package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adfb extends BroadcastReceiver {
    final /* synthetic */ adfc a;
    private final adfc b;

    public adfb(adfc adfcVar, adfc adfcVar2) {
        this.a = adfcVar;
        this.b = adfcVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            adfc adfcVar = this.a;
            adfcVar.n = true;
            adfc adfcVar2 = this.b;
            if (adfcVar2 != null && adfcVar2.getParent() != null) {
                adfcVar2.getParent().requestDisallowInterceptTouchEvent(false);
            }
            adfcVar.c(adfcVar2);
        }
    }
}
