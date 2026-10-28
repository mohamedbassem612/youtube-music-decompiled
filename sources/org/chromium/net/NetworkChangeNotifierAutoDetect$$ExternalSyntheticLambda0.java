package org.chromium.net;

import defpackage.axks;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda0 implements Runnable {
    public /* synthetic */ NetworkChangeNotifierAutoDetect f$0;
    public /* synthetic */ axks f$1;

    public /* synthetic */ NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda0(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect, axks axksVar) {
        this.f$0 = networkChangeNotifierAutoDetect;
        this.f$1 = axksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$setWifiManagerDelegateForTests$0(this.f$1);
    }
}
