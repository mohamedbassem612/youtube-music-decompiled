package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.vr.audio.DeviceInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auiv extends BroadcastReceiver {
    final /* synthetic */ DeviceInfo a;

    public auiv(DeviceInfo deviceInfo) {
        this.a = deviceInfo;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.HEADSET_PLUG")) {
            int intExtra = intent.getIntExtra("state", -1);
            if (intExtra == 0) {
                DeviceInfo deviceInfo = this.a;
                deviceInfo.nativeUpdateHeadphoneStateChange(deviceInfo.a, 2);
                return;
            }
            DeviceInfo deviceInfo2 = this.a;
            if (intExtra != 1) {
                deviceInfo2.nativeUpdateHeadphoneStateChange(deviceInfo2.a, 0);
            } else {
                deviceInfo2.nativeUpdateHeadphoneStateChange(deviceInfo2.a, 1);
            }
        }
    }
}
