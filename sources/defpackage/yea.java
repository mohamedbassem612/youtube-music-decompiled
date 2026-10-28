package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yea {
    public final awkv a;
    public final avlh b;
    private final ConnectivityManager c;
    private final ConnectivityManager.NetworkCallback d;
    private int e;

    public yea(ConnectivityManager connectivityManager) {
        this.c = connectivityManager;
        awku awkuVarAC = awku.aC(yee.a);
        this.a = awkuVarAC;
        this.b = awkuVarAC.p().P();
        this.e = 0;
        this.d = new ydz(this);
    }

    public final synchronized void a() {
        if (this.e == 0) {
            this.c.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addTransportType(1).build(), this.d);
        }
        this.e++;
    }

    public final synchronized void b() {
        int i = this.e;
        if (i > 0) {
            int i2 = i - 1;
            this.e = i2;
            if (i2 == 0) {
                this.c.unregisterNetworkCallback(this.d);
            }
        }
    }
}
