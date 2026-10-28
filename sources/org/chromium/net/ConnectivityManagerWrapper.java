package org.chromium.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import defpackage.axjm;
import defpackage.axjn;
import defpackage.axkl;
import defpackage.axks;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.TraceEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ConnectivityManagerWrapper {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ConnectivityManagerW";
    private static final AtomicBoolean sDeriveConnectionTypeFromCapabilities = new AtomicBoolean(true);
    private final ConnectivityManager mConnectivityManager;

    /* JADX INFO: compiled from: PG */
    public class NetworkState {
        private final boolean mConnected;
        private final boolean mIsMetered;
        private final boolean mIsPrivateDnsActive;
        private final String mNetworkIdentifier;
        private final String mPrivateDnsServerName;
        private final int mSubtype;
        private final int mType;

        public NetworkState(boolean z, int i, int i2, boolean z2, String str, boolean z3, String str2) {
            this.mConnected = z;
            this.mType = i;
            this.mSubtype = i2;
            this.mIsMetered = z2;
            this.mNetworkIdentifier = str == null ? "" : str;
            this.mIsPrivateDnsActive = z3;
            this.mPrivateDnsServerName = str2 == null ? "" : str2;
        }

        public int getConnectionCost() {
            return isMetered() ? 2 : 1;
        }

        public int getConnectionSubtype() {
            if (!isConnected()) {
                return 1;
            }
            int networkType = getNetworkType();
            if (networkType == 0 || networkType == 4 || networkType == 5) {
                switch (getNetworkSubType()) {
                    case 1:
                        return 7;
                    case 2:
                        return 8;
                    case 3:
                        return 9;
                    case 4:
                        return 5;
                    case 5:
                        return 10;
                    case 6:
                        return 11;
                    case 7:
                        return 6;
                    case 8:
                        return 14;
                    case 9:
                        return 15;
                    case 10:
                        return 12;
                    case 11:
                        return 4;
                    case 12:
                        return 13;
                    case 13:
                        return 18;
                    case 14:
                        return 16;
                    case 15:
                        return 17;
                }
            }
            return 0;
        }

        public int getConnectionType() {
            if (isConnected()) {
                return ConnectivityManagerWrapper.convertToConnectionType(getNetworkType(), getNetworkSubType());
            }
            return 6;
        }

        public String getNetworkIdentifier() {
            return this.mNetworkIdentifier;
        }

        public int getNetworkSubType() {
            return this.mSubtype;
        }

        public int getNetworkType() {
            return this.mType;
        }

        public String getPrivateDnsServerName() {
            return this.mPrivateDnsServerName;
        }

        public boolean isConnected() {
            return this.mConnected;
        }

        public boolean isMetered() {
            return this.mIsMetered;
        }

        public boolean isPrivateDnsActive() {
            return this.mIsPrivateDnsActive;
        }
    }

    public ConnectivityManagerWrapper(Context context) {
        this.mConnectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static int cellularSubtypeFromKbps(int i) {
        if (i <= 0) {
            return 13;
        }
        if (i < 100) {
            return 1;
        }
        if (i < 20000) {
            return 3;
        }
        return i >= 40000 ? 20 : 13;
    }

    static int connectivityTypeFromCapabilities(axkl axklVar) {
        if (axklVar.c(1) || axklVar.c(5)) {
            return 1;
        }
        if (axklVar.c(0)) {
            return 0;
        }
        if (axklVar.c(3)) {
            return 9;
        }
        if (axklVar.c(2)) {
            return 7;
        }
        return axklVar.c(4) ? 17 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0020  */
    /* JADX WARN: Code duplicated, block: B:22:0x0026  */
    /* JADX WARN: Code duplicated, block: B:23:0x0028 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x002a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    static int convertToConnectionType(int i, int i2) {
        if (i == 0) {
            if (i2 != 20) {
                return 8;
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 3;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return 4;
                case 13:
                    break;
                default:
                    return 0;
            }
        } else {
            if (i == 1) {
                return 2;
            }
            if (i == 4 || i == 5) {
                if (i2 != 20) {
                    return 8;
                }
                switch (i2) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 3;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return 4;
                    case 13:
                        break;
                    default:
                        return 0;
                }
            } else if (i != 6) {
                if (i != 7) {
                    return i == 9 ? 1 : 0;
                }
                return 7;
            }
        }
        return 5;
    }

    public static int getConnectionTypeFromCapabilities(axkl axklVar) {
        int iConnectivityTypeFromCapabilities = connectivityTypeFromCapabilities(axklVar);
        int iCellularSubtypeFromKbps = 0;
        if (iConnectivityTypeFromCapabilities == 0) {
            iConnectivityTypeFromCapabilities = 0;
            iCellularSubtypeFromKbps = cellularSubtypeFromKbps(axklVar.a());
        }
        return convertToConnectionType(iConnectivityTypeFromCapabilities, iCellularSubtypeFromKbps);
    }

    public static boolean getDeriveConnectionTypeFromCapabilities() {
        return sDeriveConnectionTypeFromCapabilities.get();
    }

    private NetworkState getNetworkStateFromCapabilities(Network network) {
        axkl networkCapabilities;
        int i;
        int iCellularSubtypeFromKbps;
        if (network == null || (networkCapabilities = getNetworkCapabilities(network)) == null) {
            return null;
        }
        int iConnectivityTypeFromCapabilities = connectivityTypeFromCapabilities(networkCapabilities);
        if (iConnectivityTypeFromCapabilities == 0) {
            iCellularSubtypeFromKbps = cellularSubtypeFromKbps(networkCapabilities.a());
            i = 0;
        } else {
            i = iConnectivityTypeFromCapabilities;
            iCellularSubtypeFromKbps = 0;
        }
        boolean z = !networkCapabilities.b(11);
        DnsStatus dnsStatusB = AndroidNetworkLibrary.b(network);
        return new NetworkState(networkCapabilities.b(12), i, iCellularSubtypeFromKbps, z, String.valueOf(networkToNetId(network)), dnsStatusB != null && dnsStatusB.getPrivateDnsActive(), dnsStatusB == null ? "" : dnsStatusB.getPrivateDnsServerName());
    }

    public static long networkToNetId(Network network) {
        return network.getNetworkHandle();
    }

    private NetworkInfo processActiveNetworkInfo(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                return networkInfo;
            }
            if (networkInfo.getDetailedState() == NetworkInfo.DetailedState.BLOCKED) {
                ApplicationStatus.getStateForApplication();
            }
        }
        return null;
    }

    static void setDeriveConnectionTypeFromCapabilities(boolean z) {
        sDeriveConnectionTypeFromCapabilities.set(z);
    }

    public static void setDeriveConnectionTypeFromCapabilitiesForTesting(boolean z) {
        sDeriveConnectionTypeFromCapabilities.set(z);
    }

    public Network[] getAllNetworks(Network network) {
        return NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(this, network);
    }

    protected Network[] getAllNetworksUnfiltered() {
        Network[] allNetworks = this.mConnectivityManager.getAllNetworks();
        return allNetworks == null ? new Network[0] : allNetworks;
    }

    public int getConnectionType(Network network) {
        NetworkInfo networkInfo = getNetworkInfo(network);
        if (networkInfo == null || !networkInfo.isConnected()) {
            return 6;
        }
        return convertToConnectionType(networkInfo.getType(), networkInfo.getSubtype());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    public Network getDefaultNetwork() {
        Network activeNetwork = this.mConnectivityManager.getActiveNetwork();
        if (activeNetwork != null) {
            return activeNetwork;
        }
        NetworkInfo activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        for (Network network : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(this, null)) {
            NetworkInfo rawNetworkInfo = getRawNetworkInfo(network);
            if (rawNetworkInfo != null && (rawNetworkInfo.getType() == activeNetworkInfo.getType() || rawNetworkInfo.getType() == 17)) {
                if (activeNetwork == null || Build.VERSION.SDK_INT < 29) {
                    if (activeNetwork != null) {
                        Log.e("cn_ConnectivityManagerW", "There should not be multiple connected networks of the same type. At least as of Android Marshmallow this is not supported. If this becomes supported this assertion may trigger.");
                    }
                    activeNetwork = network;
                } else if (rawNetworkInfo.getDetailedState() != NetworkInfo.DetailedState.CONNECTING) {
                    NetworkInfo rawNetworkInfo2 = getRawNetworkInfo(activeNetwork);
                    if (rawNetworkInfo2 != null && rawNetworkInfo2.getDetailedState() == NetworkInfo.DetailedState.CONNECTING) {
                        activeNetwork = null;
                    }
                    if (activeNetwork != null) {
                        Log.e("cn_ConnectivityManagerW", "There should not be multiple connected networks of the same type. At least as of Android Marshmallow this is not supported. If this becomes supported this assertion may trigger.");
                    }
                    activeNetwork = network;
                }
            }
        }
        return activeNetwork;
    }

    public axkl getNetworkCapabilities(Network network) {
        for (int i = 0; i < 2; i++) {
            try {
                return new axkl(this.mConnectivityManager.getNetworkCapabilities(network));
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public NetworkInfo getNetworkInfo(Network network) {
        NetworkInfo rawNetworkInfo = getRawNetworkInfo(network);
        return (rawNetworkInfo == null || rawNetworkInfo.getType() != 17) ? rawNetworkInfo : this.mConnectivityManager.getActiveNetworkInfo();
    }

    public NetworkState getNetworkState(axks axksVar) {
        NetworkInfo networkInfo;
        NetworkState networkState;
        Network defaultNetwork = getDefaultNetwork();
        if (getDeriveConnectionTypeFromCapabilities()) {
            NetworkState networkStateFromCapabilities = getNetworkStateFromCapabilities(defaultNetwork);
            if (networkStateFromCapabilities != null) {
                return networkStateFromCapabilities;
            }
            networkInfo = null;
        } else {
            networkInfo = getNetworkInfo(defaultNetwork);
        }
        NetworkInfo networkInfoProcessActiveNetworkInfo = processActiveNetworkInfo(networkInfo);
        if (networkInfoProcessActiveNetworkInfo == null) {
            return new NetworkState(false, -1, -1, false, null, false, "");
        }
        if (defaultNetwork != null) {
            axkl networkCapabilities = getNetworkCapabilities(defaultNetwork);
            boolean z = (networkCapabilities == null || networkCapabilities.b(11)) ? false : true;
            DnsStatus dnsStatusB = AndroidNetworkLibrary.b(defaultNetwork);
            networkState = dnsStatusB == null ? new NetworkState(true, networkInfoProcessActiveNetworkInfo.getType(), networkInfoProcessActiveNetworkInfo.getSubtype(), z, String.valueOf(networkToNetId(defaultNetwork)), false, "") : new NetworkState(true, networkInfoProcessActiveNetworkInfo.getType(), networkInfoProcessActiveNetworkInfo.getSubtype(), z, String.valueOf(networkToNetId(defaultNetwork)), dnsStatusB.getPrivateDnsActive(), dnsStatusB.getPrivateDnsServerName());
        } else if (networkInfoProcessActiveNetworkInfo.getType() != 1) {
            networkState = new NetworkState(true, networkInfoProcessActiveNetworkInfo.getType(), networkInfoProcessActiveNetworkInfo.getSubtype(), false, null, false, "");
        } else {
            if (networkInfoProcessActiveNetworkInfo.getExtraInfo() == null || "".equals(networkInfoProcessActiveNetworkInfo.getExtraInfo())) {
                networkInfoProcessActiveNetworkInfo.getType();
                networkInfoProcessActiveNetworkInfo.getSubtype();
                synchronized (axksVar.b) {
                    try {
                        boolean z2 = axksVar.c;
                        Context context = axksVar.a;
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            networkState = new NetworkState(true, networkInfoProcessActiveNetworkInfo.getType(), networkInfoProcessActiveNetworkInfo.getSubtype(), false, networkInfoProcessActiveNetworkInfo.getExtraInfo(), false, "");
        }
        return networkState;
    }

    public NetworkInfo getRawNetworkInfo(Network network) {
        try {
            try {
                return this.mConnectivityManager.getNetworkInfo(network);
            } catch (NullPointerException unused) {
                return null;
            }
        } catch (NullPointerException unused2) {
            return this.mConnectivityManager.getNetworkInfo(network);
        }
    }

    public void registerDefaultNetworkCallback(ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
        this.mConnectivityManager.registerDefaultNetworkCallback(networkCallback, handler);
    }

    public void registerNetworkCallback(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
        axjn axjnVarA = axjn.a();
        try {
            this.mConnectivityManager.registerNetworkCallback(networkRequest, networkCallback, handler);
            axjnVarA.close();
        } catch (Throwable th) {
            try {
                axjnVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void unregisterNetworkCallback(ConnectivityManager.NetworkCallback networkCallback) {
        this.mConnectivityManager.unregisterNetworkCallback(networkCallback);
    }

    public boolean vpnAccessible(Network network) {
        boolean z;
        Socket socket = new Socket();
        try {
            TraceEvent traceEventC = TraceEvent.c("StrictModeContext.allowAllVmPolicies");
            try {
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                axjm axjmVar = new axjm(null, vmPolicy);
                if (traceEventC != null) {
                    TraceEvent.b(0L);
                }
                try {
                    network.bindSocket(socket);
                    axjmVar.close();
                    z = true;
                } catch (Throwable th) {
                    try {
                        axjmVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (traceEventC != null) {
                    try {
                        TraceEvent.b(0L);
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (IOException unused) {
            z = false;
        } catch (Throwable th5) {
            try {
                socket.close();
            } catch (IOException unused2) {
            }
            throw th5;
        }
        try {
            socket.close();
        } catch (IOException unused3) {
        }
        return z;
    }

    public ConnectivityManagerWrapper() {
        this.mConnectivityManager = null;
    }
}
