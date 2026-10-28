package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axko extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ NetworkChangeNotifierAutoDetect a;

    public axko(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.a = networkChangeNotifierAutoDetect;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.a;
        if (networkChangeNotifierAutoDetect.mRegistered) {
            networkChangeNotifierAutoDetect.connectionTypeChanged();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        onAvailable(null);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        onAvailable(null);
    }
}
