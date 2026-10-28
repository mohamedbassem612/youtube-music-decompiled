package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class khw extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ khy a;

    public khw(khy khyVar) {
        this.a = khyVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.a.a(network, linkProperties);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        khy khyVar = this.a;
        synchronized (khyVar.g) {
            khn.e();
            if (khyVar.d.remove(network)) {
                khyVar.c.remove(network);
            }
        }
        khyVar.b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        khy khyVar = this.a;
        synchronized (khyVar.g) {
            khn.e();
            khyVar.c.clear();
            khyVar.d.clear();
        }
        khyVar.b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
    }
}
