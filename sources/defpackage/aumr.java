package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class aumr extends BroadcastReceiver {
    final /* synthetic */ aumt a;

    public aumr(aumt aumtVar) {
        this.a = aumtVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null) {
            if (Objects.equals(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                if (intExtra == 10 || intExtra == 13) {
                    this.a.setVisibility(8);
                    return;
                }
                return;
            }
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            String.format("Bluetooth connection state changed: %s, %s", bluetoothDevice.getName(), intent.getAction());
            String action = intent.getAction();
            int iHashCode = action.hashCode();
            if (iHashCode != -1492944353) {
                if (iHashCode == -301431627) {
                    if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                        this.a.i(bluetoothDevice, aumt.k(bluetoothDevice));
                        return;
                    }
                    return;
                } else if (iHashCode != 1821585647 || !action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                    return;
                }
            } else if (!action.equals("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED")) {
                return;
            }
            aumt aumtVar = this.a;
            if (aumt.k(bluetoothDevice)) {
                aumtVar.setVisibility(8);
            }
            aumtVar.c();
        }
    }
}
