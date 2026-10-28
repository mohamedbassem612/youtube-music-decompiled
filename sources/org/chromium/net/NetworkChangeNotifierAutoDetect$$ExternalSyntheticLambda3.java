package org.chromium.net;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda3 implements Runnable {
    public /* synthetic */ NetworkChangeNotifierAutoDetect f$0;
    public /* synthetic */ ConnectivityManagerWrapper f$1;

    public /* synthetic */ NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda3(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect, ConnectivityManagerWrapper connectivityManagerWrapper) {
        this.f$0 = networkChangeNotifierAutoDetect;
        this.f$1 = connectivityManagerWrapper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$setConnectivityManagerWrapperForTests$0(this.f$1);
    }
}
