package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import org.chromium.base.TraceEvent;
import org.chromium.net.ConnectivityManagerWrapper;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axkr extends ConnectivityManager.NetworkCallback {
    public Network a;
    public final /* synthetic */ NetworkChangeNotifierAutoDetect b;

    public axkr(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.b = networkChangeNotifierAutoDetect;
    }

    private final boolean a(Network network, axkl axklVar) {
        return b(network) || axklVar == null || (axklVar.c(4) && !this.b.mConnectivityManagerWrapper.vpnAccessible(network));
    }

    private final boolean b(Network network) {
        Network network2 = this.a;
        return (network2 == null || network2.equals(network)) ? false : true;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Network network2;
        TraceEvent traceEventC = TraceEvent.c("NetworkChangeNotifierCallback::onAvailable");
        try {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.b;
            axkl networkCapabilities = networkChangeNotifierAutoDetect.mConnectivityManagerWrapper.getNetworkCapabilities(network);
            if (!a(network, networkCapabilities)) {
                boolean z = networkCapabilities.c(4) && ((network2 = this.a) == null || !network.equals(network2));
                if (z) {
                    this.a = network;
                }
                networkChangeNotifierAutoDetect.runOnThread(new axkp(this, ConnectivityManagerWrapper.networkToNetId(network), ConnectivityManagerWrapper.getDeriveConnectionTypeFromCapabilities() ? ConnectivityManagerWrapper.getConnectionTypeFromCapabilities(networkCapabilities) : networkChangeNotifierAutoDetect.mConnectivityManagerWrapper.getConnectionType(network), z));
            }
            if (traceEventC != null) {
                TraceEvent.b(0L);
            }
        } catch (Throwable th) {
            if (traceEventC == null) {
                throw th;
            }
            try {
                TraceEvent.b(0L);
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        TraceEvent traceEventC = TraceEvent.c("NetworkChangeNotifierCallback::onCapabilitiesChanged");
        try {
            axkl axklVar = new axkl(networkCapabilities);
            if (!a(network, axklVar)) {
                this.b.runOnThread(new axkq(this, ConnectivityManagerWrapper.networkToNetId(network), ConnectivityManagerWrapper.getDeriveConnectionTypeFromCapabilities() ? ConnectivityManagerWrapper.getConnectionTypeFromCapabilities(axklVar) : this.b.mConnectivityManagerWrapper.getConnectionType(network)));
            }
            if (traceEventC != null) {
                TraceEvent.b(0L);
            }
        } catch (Throwable th) {
            if (traceEventC != null) {
                try {
                    TraceEvent.b(0L);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        TraceEvent traceEventC = TraceEvent.c("NetworkChangeNotifierCallback::onLosing");
        try {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.b;
            if (!a(network, networkChangeNotifierAutoDetect.mConnectivityManagerWrapper.getNetworkCapabilities(network))) {
                networkChangeNotifierAutoDetect.runOnThread(new acgm(this, ConnectivityManagerWrapper.networkToNetId(network), 3));
            }
            if (traceEventC != null) {
                TraceEvent.b(0L);
            }
        } catch (Throwable th) {
            if (traceEventC != null) {
                try {
                    TraceEvent.b(0L);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        TraceEvent traceEventC = TraceEvent.c("NetworkChangeNotifierCallback::onLost");
        try {
            if (!b(network)) {
                NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.b;
                networkChangeNotifierAutoDetect.runOnThread(new aves(this, network, 18));
                if (this.a != null) {
                    this.a = null;
                    for (Network network2 : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(networkChangeNotifierAutoDetect.mConnectivityManagerWrapper, network)) {
                        onAvailable(network2);
                    }
                    networkChangeNotifierAutoDetect.updateCurrentNetworkState();
                    networkChangeNotifierAutoDetect.runOnThread(new aesl(this, networkChangeNotifierAutoDetect.getCurrentNetworkState().getConnectionType(), 5, null));
                }
            }
            if (traceEventC != null) {
                TraceEvent.b(0L);
            }
        } catch (Throwable th) {
            if (traceEventC != null) {
                try {
                    TraceEvent.b(0L);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
