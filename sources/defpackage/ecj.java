package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ecj extends ConnectivityManager.NetworkCallback {
    private final awqg a;

    public ecj(awqg awqgVar) {
        this.a = awqgVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        dzf.b();
        String str = ecu.a;
        this.a.invoke(ech.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        dzf.b();
        String str = ecu.a;
        this.a.invoke(new eci(7));
    }
}
