package org.chromium.net;

import android.net.ConnectivityManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda2 implements Runnable {
    public /* synthetic */ NetworkChangeNotifierAutoDetect f$0;
    public /* synthetic */ ConnectivityManager.NetworkCallback f$1;

    public /* synthetic */ NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda2(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect, ConnectivityManager.NetworkCallback networkCallback) {
        this.f$0 = networkChangeNotifierAutoDetect;
        this.f$1 = networkCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$simulatePreAndroid28ForTesting$0(this.f$1);
    }
}
