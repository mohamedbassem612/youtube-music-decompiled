package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class edo extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ edp a;

    public edo(edp edpVar) {
        this.a = edpVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        edp edpVar = this.a;
        if (awrc.c(network, edpVar.e.getActiveNetwork())) {
            dzf.b();
            String str = edn.a;
            Object objB = edpVar.d;
            if (objB == null) {
                objB = edpVar.b();
            }
            ecn ecnVar = (ecn) objB;
            synchronized (edpVar.f) {
                if (edpVar.g != z) {
                    edpVar.g = z;
                    this.a.f(new ecn(ecnVar.a, ecnVar.b, ecnVar.c, ecnVar.d, z));
                }
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        dzf.b();
        String str = edn.a;
        Objects.toString(networkCapabilities);
        networkCapabilities.toString();
        edp edpVar = this.a;
        edpVar.f(edn.a(edpVar.e, edpVar.g));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        dzf.b();
        String str = edn.a;
        this.a.f(new ecn(false, false, false, false, false));
    }
}
