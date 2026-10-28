package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ecp extends ConnectivityManager.NetworkCallback {
    public static final ecp a = new ecp();
    public static final Object b = new Object();
    public static final Map c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;
    public static Boolean f;

    private static final void b() {
        ArrayList<awml> arrayList = new ArrayList();
        synchronized (b) {
            if (!e || f == null) {
                dzf.b();
                String str = ecu.a;
                return;
            }
            for (Map.Entry entry : c.entrySet()) {
                arrayList.add(new awml((awqg) entry.getKey(), a.a((NetworkRequest) entry.getValue(), d) ? ech.a : new eci(7)));
            }
            for (awml awmlVar : arrayList) {
                ((awqg) awmlVar.a).invoke((bou) awmlVar.b);
            }
        }
    }

    public final boolean a(NetworkRequest networkRequest, NetworkCapabilities networkCapabilities) {
        Boolean bool = f;
        bool.getClass();
        return !bool.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        dzf.b();
        String str = ecu.a;
        synchronized (b) {
            Boolean bool = f;
            Boolean boolValueOf = Boolean.valueOf(z);
            if (awrc.c(bool, boolValueOf)) {
                return;
            }
            f = boolValueOf;
            b();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        dzf.b();
        String str = ecu.a;
        synchronized (b) {
            d = networkCapabilities;
            e = true;
        }
        b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        dzf.b();
        String str = ecu.a;
        synchronized (b) {
            d = null;
            Iterator it = c.keySet().iterator();
            while (it.hasNext()) {
                ((awqg) it.next()).invoke(new eci(7));
            }
        }
    }
}
