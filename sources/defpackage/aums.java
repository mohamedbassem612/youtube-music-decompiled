package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class aums implements BluetoothProfile.ServiceListener {
    final /* synthetic */ aumt a;

    public aums(aumt aumtVar) {
        this.a = aumtVar;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        for (BluetoothDevice bluetoothDevice : bluetoothProfile.getConnectedDevices()) {
            if (this.a.i(bluetoothDevice, aumt.k(bluetoothDevice))) {
                break;
            }
        }
        BluetoothAdapter.getDefaultAdapter().closeProfileProxy(i, bluetoothProfile);
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
    }
}
