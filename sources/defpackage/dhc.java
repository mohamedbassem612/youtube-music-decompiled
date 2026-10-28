package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dhc extends Handler {
    private final dhe a;
    private final String b;

    public dhc(dhe dheVar, String str) {
        super(Looper.myLooper());
        this.a = dheVar;
        this.b = str;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Messenger messenger = message.replyTo;
        int i = message.what;
        int i2 = message.arg1;
        Object obj = message.obj;
        Bundle data = message.getData();
        if (i == 7) {
            int i3 = data.getInt("volume", -1);
            String string = data.getString("routeId");
            if (i3 < 0 || string == null) {
                return;
            }
            dhn dhnVarB = this.a.b(string);
            if (dhnVarB == null) {
                Log.w("AxMR2ProvdrSrvcAdapter", "setRouteVolume: Couldn't find a controller for routeId=".concat(string));
                return;
            } else {
                dhnVarB.d(i3);
                return;
            }
        }
        if (i == 8) {
            int i4 = data.getInt("volume", 0);
            String string2 = data.getString("routeId");
            if (i4 == 0 || string2 == null) {
                return;
            }
            dhn dhnVarB2 = this.a.b(string2);
            if (dhnVarB2 == null) {
                Log.w("AxMR2ProvdrSrvcAdapter", "updateRouteVolume: Couldn't find a controller for routeId=".concat(string2));
                return;
            } else {
                dhnVarB2.f(i4);
                return;
            }
        }
        if (i == 9 && (obj instanceof Intent)) {
            dhe dheVar = this.a;
            String str = this.b;
            Intent intent = (Intent) obj;
            if (dheVar.getSessionInfo(str) == null) {
                Log.w("AxMR2ProvdrSrvcAdapter", "onCustomCommand: Couldn't find a session");
                return;
            }
            dhk dhkVarA = dheVar.a(str);
            if (dhkVarA != null) {
                dhkVarA.i(intent, new dha(messenger, i2));
            } else {
                Log.w("AxMR2ProvdrSrvcAdapter", "onControlRequest: Couldn't find a controller");
                dheVar.notifyRequestFailed(i2, 3);
            }
        }
    }
}
