package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import org.chromium.net.ConnectivityManagerWrapper;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axkn extends ConnectivityManager.NetworkCallback {
    LinkProperties a;
    axkl b;
    final /* synthetic */ NetworkChangeNotifierAutoDetect c;

    public axkn(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.c = networkChangeNotifierAutoDetect;
    }

    private final ConnectivityManagerWrapper.NetworkState a(Network network) {
        int i;
        int i2;
        NetworkInfo networkInfo;
        int i3;
        int subtype = -1;
        if (!this.b.c(1) && !this.b.c(5)) {
            int type = 0;
            if (!this.b.c(0)) {
                if (!this.b.c(3)) {
                    if (this.b.c(2)) {
                        i3 = 7;
                    } else if (this.b.c(4)) {
                        type = 17;
                        if (!ConnectivityManagerWrapper.getDeriveConnectionTypeFromCapabilities() && (networkInfo = this.c.mConnectivityManagerWrapper.getNetworkInfo(network)) != null) {
                            type = networkInfo.getType();
                        }
                    } else {
                        i = -1;
                        i2 = -1;
                    }
                    return new ConnectivityManagerWrapper.NetworkState(true, i, i2, !this.b.b(11), String.valueOf(ConnectivityManagerWrapper.networkToNetId(network)), this.a.isPrivateDnsActive(), this.a.getPrivateDnsServerName());
                }
                i3 = 9;
                i = i3;
            } else if (ConnectivityManagerWrapper.getDeriveConnectionTypeFromCapabilities()) {
                subtype = ConnectivityManagerWrapper.cellularSubtypeFromKbps(this.b.a());
            } else {
                NetworkInfo rawNetworkInfo = this.c.mConnectivityManagerWrapper.getRawNetworkInfo(network);
                if (rawNetworkInfo != null) {
                    subtype = rawNetworkInfo.getSubtype();
                }
            }
            i2 = subtype;
            i = type;
            return new ConnectivityManagerWrapper.NetworkState(true, i, i2, !this.b.b(11), String.valueOf(ConnectivityManagerWrapper.networkToNetId(network)), this.a.isPrivateDnsActive(), this.a.getPrivateDnsServerName());
        }
        i = 1;
        i2 = -1;
        return new ConnectivityManagerWrapper.NetworkState(true, i, i2, !this.b.b(11), String.valueOf(ConnectivityManagerWrapper.networkToNetId(network)), this.a.isPrivateDnsActive(), this.a.getPrivateDnsServerName());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a = null;
        this.b = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        this.b = new axkl(networkCapabilities);
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.c;
        if (!networkChangeNotifierAutoDetect.mRegistered || this.a == null || this.b == null) {
            return;
        }
        networkChangeNotifierAutoDetect.connectionTypeChangedTo(a(network));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.a = linkProperties;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.c;
        if (!networkChangeNotifierAutoDetect.mRegistered || this.a == null || this.b == null) {
            return;
        }
        networkChangeNotifierAutoDetect.connectionTypeChangedTo(a(network));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.a = null;
        this.b = null;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.c;
        if (networkChangeNotifierAutoDetect.mRegistered) {
            networkChangeNotifierAutoDetect.connectionTypeChangedTo(new ConnectivityManagerWrapper.NetworkState(false, -1, -1, false, null, false, ""));
        }
    }
}
