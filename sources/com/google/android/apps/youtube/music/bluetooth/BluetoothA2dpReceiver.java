package com.google.android.apps.youtube.music.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.ParcelUuid;
import android.text.TextUtils;
import defpackage.atv;
import defpackage.avg;
import defpackage.gmm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class BluetoothA2dpReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ParcelUuid[] uuids;
        if (intent == null || !TextUtils.equals(intent.getAction(), "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED")) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            if (avg.c(context, "android.permission.BLUETOOTH_CONNECT") != 0) {
                return;
            }
        } else if (avg.c(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            return;
        }
        BluetoothDevice bluetoothDevice = (BluetoothDevice) atv.b(intent, "android.bluetooth.device.extra.DEVICE", BluetoothDevice.class);
        if (intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0) != 2 || bluetoothDevice == null || (uuids = bluetoothDevice.getUuids()) == null) {
            return;
        }
        for (ParcelUuid parcelUuid : uuids) {
            if (parcelUuid.getUuid().equals(gmm.a)) {
                Intent intent2 = new Intent(context, (Class<?>) BluetoothA2dpService.class);
                intent2.putExtra("android.bluetooth.device.extra.DEVICE", bluetoothDevice);
                context.startForegroundService(intent2);
                return;
            }
        }
    }
}
