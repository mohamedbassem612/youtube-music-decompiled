package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import j$.util.DesugarCollections;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tof {
    private static final agrf n = agrf.h("com/google/android/libraries/youtube/common/network/internal/DefaultNetworkProvider");
    public final ConnectivityManager a;
    public volatile NetworkInfo b;
    public volatile boolean c;
    public volatile boolean d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile boolean g;
    public volatile List h;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public volatile Network l;
    public final Object m = new Object();
    private final WifiManager o;
    private volatile WifiInfo p;
    private volatile boolean q;
    private volatile NetworkInfo r;
    private volatile boolean s;
    private final wmy t;

    public tof(ConnectivityManager connectivityManager, WifiManager wifiManager, wmy wmyVar) {
        this.t = wmyVar;
        this.a = connectivityManager;
        this.o = wifiManager;
        f();
    }

    public static final List e() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                networkInterfaceNextElement.getClass();
                arrayList.add(new tgt(networkInterfaceNextElement));
            }
        } catch (SocketException e) {
            ((agrc) ((agrc) ((agrc) n.c()).j(e)).k("com/google/android/libraries/youtube/common/network/internal/DefaultNetworkProvider", "internalGetNetworkInterfaces", (char) 431, "DefaultNetworkProvider.java")).t("error getting the network interfaces");
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private final void f() {
        this.q = true;
        this.s = true;
        this.c = true;
        this.e = true;
        this.i = true;
        this.k = true;
        this.g = true;
    }

    private final void g() {
        if (this.s) {
            Network network = this.l;
            this.r = this.a.getActiveNetworkInfo();
            this.s = false;
        }
    }

    public final NetworkInfo a() {
        if (d()) {
            Network network = this.l;
            return this.a.getActiveNetworkInfo();
        }
        g();
        return this.r;
    }

    public final WifiInfo b() {
        if (d()) {
            return this.o.getConnectionInfo();
        }
        if (this.q) {
            this.p = this.o.getConnectionInfo();
            this.q = false;
        }
        return this.p;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    public final void c() {
        NetworkCapabilities networkCapabilities;
        boolean z;
        Network network = this.l;
        f();
        Network network2 = this.l;
        ConnectivityManager connectivityManager = this.a;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null) {
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            } catch (SecurityException unused) {
                networkCapabilities = null;
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        synchronized (this.m) {
            Network network3 = this.l;
            this.f = z;
            this.g = false;
        }
    }

    public final boolean d() {
        if (!this.t.a) {
            return true;
        }
        g();
        return (this.r == null || this.r.isConnectedOrConnecting()) ? false : true;
    }
}
