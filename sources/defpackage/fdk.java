package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdk extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ kjx a;

    public fdk(kjx kjxVar) {
        this.a = kjxVar;
    }

    private final void a(boolean z) {
        ffs.d().post(new frz(this, z, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        a(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        a(false);
    }
}
