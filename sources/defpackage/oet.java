package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oet extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ oeu a;

    public oet(oeu oeuVar) {
        this.a = oeuVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        oeu oeuVar = this.a;
        synchronized (oeuVar) {
            oeuVar.c = network;
            oeuVar.b = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        oeu oeuVar = this.a;
        synchronized (oeuVar) {
            if (network.equals(oeuVar.c)) {
                oeuVar.c = null;
                oeuVar.b = null;
            }
        }
    }
}
