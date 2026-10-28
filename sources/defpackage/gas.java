package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gas extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ gat a;

    public gas(gat gatVar) {
        this.a = gatVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (gat.class) {
            this.a.a = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (gat.class) {
            this.a.a = null;
        }
    }
}
