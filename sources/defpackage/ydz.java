package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ydz extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ yea a;

    public ydz(yea yeaVar) {
        this.a = yeaVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        super.onAvailable(network);
        this.a.a.kk(yee.b);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        super.onLost(network);
        this.a.a.kk(yee.c);
    }
}
