package com.google.android.apps.youtube.music.bluetooth;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.youtube.music.R;
import defpackage.agrc;
import defpackage.agrf;
import defpackage.ahno;
import defpackage.amzo;
import defpackage.anaf;
import defpackage.atr;
import defpackage.atv;
import defpackage.aunn;
import defpackage.fuc;
import defpackage.gmn;
import defpackage.hix;
import defpackage.hjy;
import defpackage.zmg;
import defpackage.zne;
import j$.util.Optional;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class BluetoothA2dpService extends gmn {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/bluetooth/BluetoothA2dpService");
    public static final anaf b = anaf.a;
    public static final hjy c;
    private static final zne l;
    public aunn d;
    public aunn e;
    public aunn f;
    public aunn g;
    public aunn h;
    public hix i;
    public boolean j;
    private Optional m = Optional.empty();
    public final AtomicBoolean k = new AtomicBoolean(false);

    static {
        zmg zmgVar = zmg.a;
        l = zmgVar;
        c = new hjy(zmgVar.b(), amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_UNKNOWN, zmgVar, "");
    }

    public final void a(BluetoothSocket bluetoothSocket, InputStream inputStream, OutputStream outputStream) {
        ((agrc) ((agrc) a.c()).k("com/google/android/apps/youtube/music/bluetooth/BluetoothA2dpService", "shutDownService", 362, "BluetoothA2dpService.java")).t("Disconnected from bluetooth. Shutting down bluetooth service.");
        this.j = false;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception e) {
                ((agrc) ((agrc) ((agrc) a.c()).j(e)).k("com/google/android/apps/youtube/music/bluetooth/BluetoothA2dpService", "closeBluetoothSocketResources", (char) 335, "BluetoothA2dpService.java")).t("Error closing Bluetooth input stream");
            }
        }
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception e2) {
                ((agrc) ((agrc) ((agrc) a.c()).j(e2)).k("com/google/android/apps/youtube/music/bluetooth/BluetoothA2dpService", "closeBluetoothSocketResources", (char) 344, "BluetoothA2dpService.java")).t("Error closing Bluetooth output stream");
            }
        }
        if (bluetoothSocket != null) {
            try {
                bluetoothSocket.close();
                this.k.set(false);
            } catch (Exception e3) {
                ((agrc) ((agrc) ((agrc) a.c()).j(e3)).k("com/google/android/apps/youtube/music/bluetooth/BluetoothA2dpService", "closeBluetoothSocketResources", (char) 354, "BluetoothA2dpService.java")).t("Error closing Bluetooth socket");
            }
        }
        stopSelf();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // android.app.Service
    public final void onDestroy() {
        Optional optional = this.m;
        if (true == optional.isPresent()) {
            optional.get().cancel(false);
        }
        this.j = false;
        this.k.set(false);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3 = 2;
        if (intent == null) {
            stopSelf();
            return 2;
        }
        BluetoothDevice bluetoothDevice = (BluetoothDevice) atv.b(intent, "android.bluetooth.device.extra.DEVICE", BluetoothDevice.class);
        if (bluetoothDevice == null) {
            stopSelf();
            return 2;
        }
        if (!this.k.compareAndSet(false, true)) {
            return 2;
        }
        this.m = Optional.of(ahno.ao(new fuc(this, bluetoothDevice, i3), (Executor) this.g.io()));
        ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel("BluetoothA2DPServiceChannel", getApplicationContext().getString(R.string.bluetooth_connections_channel_name), 2));
        atr atrVar = new atr(this, "BluetoothA2DPServiceChannel");
        atrVar.l(getApplicationContext().getString(R.string.bluetooth_connections_channel_name));
        atrVar.k(getApplicationContext().getString(R.string.connected_to_bluetooth, bluetoothDevice.getName()));
        atrVar.q(android.R.drawable.stat_sys_headset);
        startForeground(18, atrVar.a());
        return 1;
    }
}
