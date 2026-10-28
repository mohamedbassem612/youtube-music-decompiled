package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aeqz extends BroadcastReceiver {
    final /* synthetic */ aera a;

    public aeqz(aera aeraVar) {
        this.a = aeraVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        aera aeraVar = this.a;
        synchronized (aeraVar) {
            if (!aeraVar.a || intent == null || (action = intent.getAction()) == null) {
                return;
            }
            if (action.equals("android.intent.action.SCREEN_ON")) {
                ((aepv) aeraVar.d.io()).a = true;
            } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                ((aepv) aeraVar.d.io()).a = false;
            } else if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                ((aepv) aeraVar.d.io()).a(intent);
                tqj tqjVar = aeraVar.g;
                int i = tqr.a;
                if (tqjVar.k(1073814207)) {
                    aehn aehnVar = (aehn) aeraVar.j.io();
                    float intExtra = intent.getIntExtra("level", -1);
                    float intExtra2 = intent.getIntExtra("scale", -1);
                    float f = -1.0f;
                    if (intExtra >= 0.0f && intExtra2 > 0.0f) {
                        f = intExtra / intExtra2;
                    }
                    aehnVar.a = new tyb(f, intent.getIntExtra("plugged", 0) != 0);
                }
                aerb aerbVar = (aerb) aeraVar.e.io();
                synchronized (aerbVar.a) {
                    try {
                        for (aepp aeppVar : aerbVar.e.values()) {
                            if (aeppVar.f()) {
                                aeppVar.a();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
