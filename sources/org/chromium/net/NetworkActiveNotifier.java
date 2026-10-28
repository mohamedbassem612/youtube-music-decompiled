package org.chromium.net;

import android.net.ConnectivityManager;
import internal.J.N;
import org.chromium.base.JniAndroid;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class NetworkActiveNotifier implements ConnectivityManager.OnNetworkActiveListener {
    private boolean mAreNotificationsEnabled;
    private final ConnectivityManager mConnectivityManager = (ConnectivityManager) JniAndroid.a.getSystemService("connectivity");
    private final long mNativeNetworkActiveObserver;

    private NetworkActiveNotifier(long j) {
        this.mNativeNetworkActiveObserver = j;
    }

    public static NetworkActiveNotifier build(long j) {
        return new NetworkActiveNotifier(j);
    }

    public void disableNotifications() {
        this.mAreNotificationsEnabled = false;
        this.mConnectivityManager.removeDefaultNetworkActiveListener(this);
    }

    public void enableNotifications() {
        this.mAreNotificationsEnabled = true;
        this.mConnectivityManager.addDefaultNetworkActiveListener(this);
    }

    public void fakeDefaultNetworkActive() {
        if (this.mAreNotificationsEnabled) {
            onNetworkActive();
        }
    }

    public boolean isDefaultNetworkActive() {
        return this.mConnectivityManager.isDefaultNetworkActive();
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public void onNetworkActive() {
        N.MSZPA7qE(this.mNativeNetworkActiveObserver);
    }
}
