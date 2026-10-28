package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class oyx extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ ozc a;

    public oyx(ozc ozcVar) {
        this.a = ozcVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a.f();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        this.a.f();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.a.f();
    }
}
