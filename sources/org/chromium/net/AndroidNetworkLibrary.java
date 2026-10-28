package org.chromium.net;

import android.app.privatecompute.PccSandboxManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.StatsEvent;
import android.util.StatsLog;
import defpackage.aun$$ExternalSyntheticApiModelOutline0;
import defpackage.axju;
import defpackage.axkd;
import defpackage.axnh;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URLConnection;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.base.JniAndroid;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidNetworkLibrary {
    private static Boolean a;
    private static Boolean b;

    AndroidNetworkLibrary() {
    }

    public static WifiInfo a() {
        TransportInfo transportInfo;
        if (!r()) {
            Intent intentRegisterReceiver = JniAndroid.a.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"), null, null, 0);
            if (intentRegisterReceiver != null) {
                return (WifiInfo) intentRegisterReceiver.getParcelableExtra("wifiInfo");
            }
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return ((WifiManager) JniAndroid.a.getSystemService("wifi")).getConnectionInfo();
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) JniAndroid.a.getSystemService("connectivity");
            for (Network network : connectivityManager.getAllNetworks()) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(1) && (transportInfo = networkCapabilities.getTransportInfo()) != null && (transportInfo instanceof WifiInfo)) {
                    return (WifiInfo) transportInfo;
                }
            }
        }
        return null;
    }

    public static void addTestRootCertificate(byte[] bArr) {
        X509Util.addTestRootCertificate(bArr);
    }

    public static DnsStatus b(Network network) {
        ConnectivityManager connectivityManager;
        boolean z;
        Boolean boolValueOf = a;
        if (boolValueOf == null) {
            try {
                z = JniAndroid.a.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
            } catch (RuntimeException unused) {
            }
            boolValueOf = Boolean.valueOf(z);
            a = boolValueOf;
        }
        if (boolValueOf.booleanValue() && (connectivityManager = (ConnectivityManager) JniAndroid.a.getSystemService("connectivity")) != null) {
            if (network == null) {
                network = connectivityManager.getActiveNetwork();
            }
            if (network != null) {
                try {
                    LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
                    if (linkProperties != null) {
                        List<InetAddress> dnsServers = linkProperties.getDnsServers();
                        String domains = linkProperties.getDomains();
                        return Build.VERSION.SDK_INT >= 28 ? new DnsStatus(dnsServers, linkProperties.isPrivateDnsActive(), linkProperties.getPrivateDnsServerName(), domains) : new DnsStatus(dnsServers, false, "", domains);
                    }
                } catch (RuntimeException unused2) {
                }
            }
        }
        return null;
    }

    public static void c(String str, boolean z) {
        axju.a.u(str, z ? 1 : 0);
    }

    public static void clearTestRootCertificates() {
        X509Util.clearTestRootCertificates();
    }

    public static void d(String str, int i) {
        axju.a.u(str, i);
    }

    public static long e(Map map) {
        long length = 0;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    length += (long) str.length();
                }
                if (entry.getValue() != null) {
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        length += (long) ((String) it.next()).length();
                    }
                }
            }
        }
        return length;
    }

    public static int f(int i) {
        if (i != 0) {
            return i != 1 ? 3 : 2;
        }
        return 1;
    }

    public static final PccSandboxManager g() {
        return aun$$ExternalSyntheticApiModelOutline0.m(JniAndroid.a.getSystemService(aun$$ExternalSyntheticApiModelOutline0.m()));
    }

    public static DnsStatus getCurrentDnsStatus() {
        return b(null);
    }

    public static DnsStatus getDnsStatusForNetwork(long j) {
        try {
            return b(Network.fromNetworkHandle(j));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    static int getEchMode(String str) {
        try {
            return NetworkSecurityPolicyProxy.getInstance().getDomainEncryptionMode(str) == 1 ? 0 : 1;
        } catch (IllegalArgumentException unused) {
            return 1;
        }
    }

    private static boolean getIsCaptivePortal() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) JniAndroid.a.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(17)) ? false : true;
    }

    private static boolean getIsRoaming() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) JniAndroid.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isRoaming();
    }

    public static String getMimeTypeFromExtension(String str) {
        return URLConnection.guessContentTypeFromName("foo.".concat(String.valueOf(str)));
    }

    private static String getNetworkOperator() {
        TelephonyManager telephonyManager = (TelephonyManager) JniAndroid.a.getSystemService("phone");
        return telephonyManager == null ? "" : telephonyManager.getNetworkOperator();
    }

    public static byte[][] getUserAddedRoots() {
        return X509Util.getUserAddedRoots();
    }

    public static String getWifiSSID() {
        String ssid;
        WifiInfo wifiInfoA = a();
        return (wifiInfoA == null || (ssid = wifiInfoA.getSSID()) == null || ssid.equals("<unknown ssid>")) ? "" : ssid;
    }

    public static int getWifiSignalLevel(int i) {
        int intExtra;
        int iCalculateSignalLevel;
        Context context = JniAndroid.a;
        if (context != null && context.getContentResolver() != null) {
            if (r()) {
                WifiInfo wifiInfoA = a();
                if (wifiInfoA != null) {
                    intExtra = wifiInfoA.getRssi();
                    if (intExtra == Integer.MIN_VALUE && (iCalculateSignalLevel = WifiManager.calculateSignalLevel(intExtra, i)) >= 0 && iCalculateSignalLevel < i) {
                        return iCalculateSignalLevel;
                    }
                }
            } else {
                try {
                    Intent intentRegisterReceiver = JniAndroid.a.registerReceiver(null, new IntentFilter("android.net.wifi.RSSI_CHANGED"), null, null, 0);
                    if (intentRegisterReceiver != null) {
                        intExtra = intentRegisterReceiver.getIntExtra("newRssi", Integer.MIN_VALUE);
                        if (intExtra == Integer.MIN_VALUE) {
                        }
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return -1;
    }

    public static boolean h(double d, int i, int i2) {
        return d >= ((double) i) && d < ((double) i2);
    }

    public static boolean haveOnlyLoopbackAddresses() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                try {
                    if (networkInterfaceNextElement.isUp() && !networkInterfaceNextElement.isLoopback()) {
                        return false;
                    }
                } catch (SocketException unused) {
                }
            }
            return true;
        } catch (Exception e) {
            Log.w("cn_AndroidNetworkLibrary", "could not get network interfaces: ".concat(e.toString()));
            return false;
        }
    }

    public static int i(Boolean bool) {
        if (bool == null) {
            return 1;
        }
        return bool.booleanValue() ? 2 : 3;
    }

    private static boolean isCleartextPermitted(String str) {
        try {
            return NetworkSecurityPolicyProxy.getInstance().isCleartextTrafficPermitted(str);
        } catch (IllegalArgumentException unused) {
            return NetworkSecurityPolicyProxy.getInstance().isCleartextTrafficPermitted();
        }
    }

    public static /* synthetic */ int j(axnh axnhVar) {
        axnh axnhVar2 = axnh.CRONET_SOURCE_UNSPECIFIED;
        int iOrdinal = axnhVar.ordinal();
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 2;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? 0 : 4;
        }
        return 3;
    }

    public static void k(int i, int i2, int i3, int i4, int i5) {
        StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
        builderNewBuilder.setAtomId(215001);
        builderNewBuilder.writeInt(i);
        builderNewBuilder.addBooleanAnnotation((byte) 1, true);
        builderNewBuilder.writeInt(i2);
        builderNewBuilder.writeInt(i3);
        builderNewBuilder.writeInt(i4);
        builderNewBuilder.writeInt(i5);
        builderNewBuilder.usePooledBuffer();
        StatsLog.write(builderNewBuilder.build());
    }

    public static void l(int i, int i2, long j, int i3) {
        StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
        builderNewBuilder.setAtomId(215002);
        builderNewBuilder.writeInt(i);
        builderNewBuilder.addBooleanAnnotation((byte) 1, true);
        builderNewBuilder.writeInt(i2);
        builderNewBuilder.writeLong(j);
        builderNewBuilder.writeInt(i3);
        builderNewBuilder.usePooledBuffer();
        StatsLog.write(builderNewBuilder.build());
    }

    public static void m(int i, int i2, long j, boolean z, boolean z2) {
        StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
        builderNewBuilder.setAtomId(215000);
        builderNewBuilder.writeInt(i);
        builderNewBuilder.addBooleanAnnotation((byte) 1, true);
        builderNewBuilder.writeInt(i2);
        builderNewBuilder.writeLong(j);
        builderNewBuilder.writeBoolean(z);
        builderNewBuilder.writeBoolean(z2);
        builderNewBuilder.usePooledBuffer();
        StatsLog.write(builderNewBuilder.build());
    }

    public static void n(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
        builderNewBuilder.setAtomId(762);
        builderNewBuilder.writeLong(j);
        builderNewBuilder.writeInt(i);
        builderNewBuilder.writeInt(i2);
        builderNewBuilder.writeInt(i3);
        builderNewBuilder.writeInt(i4);
        builderNewBuilder.writeInt(i5);
        builderNewBuilder.writeInt(i6);
        builderNewBuilder.writeInt(i7);
        builderNewBuilder.writeInt(i8);
        builderNewBuilder.writeInt(i9);
        builderNewBuilder.writeInt(i10);
        builderNewBuilder.writeInt(i11);
        builderNewBuilder.writeInt(i12);
        builderNewBuilder.writeInt(i13);
        builderNewBuilder.addBooleanAnnotation((byte) 1, true);
        builderNewBuilder.usePooledBuffer();
        StatsLog.write(builderNewBuilder.build());
    }

    public static void o(long j, int i, int i2, int i3, int i4, int i5, long j2, int i6, int i7, boolean z, boolean z2, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i22, int i23) {
        StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
        builderNewBuilder.setAtomId(704);
        builderNewBuilder.writeLong(j);
        builderNewBuilder.writeInt(i);
        builderNewBuilder.writeInt(i2);
        builderNewBuilder.writeInt(i3);
        builderNewBuilder.writeInt(i4);
        builderNewBuilder.writeInt(i5);
        builderNewBuilder.writeLong(j2);
        builderNewBuilder.writeInt(i6);
        builderNewBuilder.writeInt(i7);
        builderNewBuilder.writeBoolean(z);
        builderNewBuilder.writeBoolean(z2);
        builderNewBuilder.writeInt(i8);
        builderNewBuilder.writeInt(i9);
        builderNewBuilder.writeInt(i10);
        builderNewBuilder.writeLong(-1L);
        builderNewBuilder.writeLong(-1L);
        builderNewBuilder.writeInt(i11);
        builderNewBuilder.writeInt(i12);
        builderNewBuilder.writeInt(i13);
        builderNewBuilder.writeInt(i14);
        builderNewBuilder.writeInt(i15);
        builderNewBuilder.addBooleanAnnotation((byte) 1, true);
        builderNewBuilder.writeInt(i16);
        builderNewBuilder.writeInt(i17);
        builderNewBuilder.writeInt(i18);
        builderNewBuilder.writeInt(i19);
        builderNewBuilder.writeInt(i20);
        builderNewBuilder.writeString("156.0.8078.25");
        builderNewBuilder.writeInt(i21);
        builderNewBuilder.writeLong(j3);
        builderNewBuilder.writeLong(j4);
        builderNewBuilder.writeLong(j5);
        builderNewBuilder.writeLong(j6);
        builderNewBuilder.writeLong(j7);
        builderNewBuilder.writeLong(j8);
        builderNewBuilder.writeLong(j9);
        builderNewBuilder.writeLong(j10);
        builderNewBuilder.writeLong(j11);
        builderNewBuilder.writeInt(i22);
        builderNewBuilder.writeInt(i23);
        builderNewBuilder.usePooledBuffer();
        StatsLog.write(builderNewBuilder.build());
    }

    public static void p(long j, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, int i6, boolean z3, boolean z4, boolean z5, String str, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, long j2, int i28) {
        StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
        builderNewBuilder.setAtomId(703);
        builderNewBuilder.writeLong(j);
        builderNewBuilder.writeInt(i);
        builderNewBuilder.writeInt(i2);
        builderNewBuilder.writeInt(i3);
        builderNewBuilder.writeInt(i4);
        builderNewBuilder.writeInt(i5);
        builderNewBuilder.writeBoolean(z);
        builderNewBuilder.writeBoolean(z2);
        builderNewBuilder.writeInt(i6);
        builderNewBuilder.writeBoolean(z3);
        builderNewBuilder.writeBoolean(z4);
        builderNewBuilder.writeBoolean(z5);
        builderNewBuilder.writeInt(0);
        builderNewBuilder.writeString(str);
        builderNewBuilder.writeInt(i7);
        builderNewBuilder.writeInt(i8);
        builderNewBuilder.writeInt(i9);
        builderNewBuilder.writeInt(i10);
        builderNewBuilder.writeInt(i11);
        builderNewBuilder.writeInt(i12);
        builderNewBuilder.writeInt(i13);
        builderNewBuilder.writeInt(i14);
        builderNewBuilder.writeInt(i15);
        builderNewBuilder.writeInt(i16);
        builderNewBuilder.writeInt(i17);
        builderNewBuilder.writeInt(i18);
        builderNewBuilder.writeInt(i19);
        builderNewBuilder.writeInt(i20);
        builderNewBuilder.writeInt(i21);
        builderNewBuilder.writeInt(i22);
        builderNewBuilder.writeInt(i23);
        builderNewBuilder.writeInt(i24);
        builderNewBuilder.writeInt(i25);
        builderNewBuilder.writeInt(i26);
        builderNewBuilder.writeInt(i27);
        builderNewBuilder.writeLong(j2);
        builderNewBuilder.writeInt(i28);
        builderNewBuilder.addBooleanAnnotation((byte) 1, true);
        builderNewBuilder.usePooledBuffer();
        StatsLog.write(builderNewBuilder.build());
    }

    public static void q(long j, int i, int i2, long[] jArr, long[] jArr2, String str, int i3, int i4) {
        StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
        builderNewBuilder.setAtomId(764);
        builderNewBuilder.writeLong(j);
        builderNewBuilder.writeInt(i);
        builderNewBuilder.writeInt(i2);
        builderNewBuilder.writeInt(-1);
        builderNewBuilder.writeInt(0);
        builderNewBuilder.writeLongArray(jArr);
        builderNewBuilder.writeLongArray(jArr2);
        builderNewBuilder.writeString(str);
        builderNewBuilder.writeInt(i3);
        builderNewBuilder.writeInt(i4);
        builderNewBuilder.addBooleanAnnotation((byte) 1, true);
        builderNewBuilder.usePooledBuffer();
        StatsLog.write(builderNewBuilder.build());
    }

    private static boolean r() {
        Boolean boolValueOf = b;
        if (boolValueOf == null) {
            boolean z = false;
            try {
                if (JniAndroid.a.checkPermission("android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0) {
                    z = true;
                }
            } catch (RuntimeException unused) {
            }
            boolValueOf = Boolean.valueOf(z);
            b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static void registerQuicConnectionClosePayload(int i, byte[] bArr) {
    }

    private static boolean reportBadDefaultNetwork() {
        ConnectivityManager connectivityManager = (ConnectivityManager) JniAndroid.a.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        connectivityManager.reportNetworkConnectivity(null, false);
        return true;
    }

    private static void tagSocket(int i, int i2, int i3) throws IOException {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(i3);
        }
        if (i2 != -1) {
            ThreadStatsUid.set(i2);
        }
        ParcelFileDescriptor parcelFileDescriptorAdoptFd = ParcelFileDescriptor.adoptFd(i);
        axkd axkdVar = new axkd(parcelFileDescriptorAdoptFd.getFileDescriptor());
        TrafficStats.tagSocket(axkdVar);
        axkdVar.close();
        if (parcelFileDescriptorAdoptFd != null) {
            parcelFileDescriptorAdoptFd.detachFd();
        }
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i2 != -1) {
            ThreadStatsUid.clear();
        }
    }

    public static void unregisterQuicConnectionClosePayload(int i) {
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2, byte[] bArr2, byte[] bArr3) {
        try {
            return X509Util.verifyServerCertificates(bArr, str, str2, bArr2, bArr3);
        } catch (IllegalArgumentException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return new AndroidCertVerifyResult(-1);
        }
    }

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes5.dex */
    public class NetworkSecurityPolicyProxy {
        private static NetworkSecurityPolicyProxy sInstance = new NetworkSecurityPolicyProxy();

        public static NetworkSecurityPolicyProxy getInstance() {
            return sInstance;
        }

        public static void setInstanceForTesting(NetworkSecurityPolicyProxy networkSecurityPolicyProxy) {
            sInstance = networkSecurityPolicyProxy;
        }

        public int getDomainEncryptionMode(String str) {
            if (Build.VERSION.SDK_INT < 37) {
                return 0;
            }
            return NetworkSecurityPolicy.getInstance().getDomainEncryptionMode(str);
        }

        public boolean isCleartextTrafficPermitted() {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }

        public boolean isCleartextTrafficPermitted(String str) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
    }
}
