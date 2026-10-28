package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class axkp implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ axkr d;

    public axkp(axkr axkrVar, long j, int i, boolean z) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = axkrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.d.b;
        NetworkChangeNotifierAutoDetect.Observer observer = networkChangeNotifierAutoDetect.mObserver;
        long j = this.a;
        int i = this.b;
        observer.onNetworkConnect(j, i);
        if (this.c) {
            networkChangeNotifierAutoDetect.mObserver.onConnectionTypeChanged(i);
            networkChangeNotifierAutoDetect.mObserver.purgeActiveNetworkList(new long[]{j});
        }
    }
}
