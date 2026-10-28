package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tfp extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ ScheduledExecutorService a;
    final /* synthetic */ tfq b;
    final /* synthetic */ tof c;

    public tfp(tfq tfqVar, ScheduledExecutorService scheduledExecutorService, tof tofVar) {
        this.a = scheduledExecutorService;
        this.c = tofVar;
        this.b = tfqVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        super.onBlockedStatusChanged(network, z);
        tfq tfqVar = this.b;
        if (tfqVar.b.isDone()) {
            ScheduledExecutorService scheduledExecutorService = this.a;
            tof tofVar = this.c;
            tofVar.getClass();
            tfqVar.b = scheduledExecutorService.schedule(new syd(tofVar, 5), 25L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        if (Build.VERSION.SDK_INT >= 30) {
            tfq tfqVar = this.b;
            tof tofVar = tfqVar.c;
            Network network2 = tofVar.l;
            if (Build.VERSION.SDK_INT >= 30) {
                tofVar.j = networkCapabilities.hasCapability(25);
                tofVar.k = false;
            }
            boolean z = networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
            synchronized (tofVar.m) {
                Network network3 = tofVar.l;
                tofVar.f = z;
                tofVar.g = false;
            }
            tfqVar.f();
        }
    }
}
