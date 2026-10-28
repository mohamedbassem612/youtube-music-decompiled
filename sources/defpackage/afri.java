package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.os.Process;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class afri implements afrh {
    private final /* synthetic */ int $cid;
    private final Object a;

    public afri(Context context, ConnectivityManager connectivityManager, int i) {
        this.$cid = i;
        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) == 0) {
            ahno.P(context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0, "An app using the NETWORK_CONNECTED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.a = connectivityManager;
    }

    @Override // defpackage.afrh
    public final boolean a() {
        int i = this.$cid;
        if (i != 0) {
            Object obj = this.a;
            if (i == 1) {
                return ((BatteryManager) obj).isCharging();
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) obj;
            boolean zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (zIsActiveNetworkMetered || activeNetworkInfo == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getDetailedState() == NetworkInfo.DetailedState.BLOCKED) {
                return false;
            }
        } else {
            NetworkInfo activeNetworkInfo2 = ((ConnectivityManager) this.a).getActiveNetworkInfo();
            if (activeNetworkInfo2 == null || !activeNetworkInfo2.isConnected() || activeNetworkInfo2.getDetailedState() == NetworkInfo.DetailedState.BLOCKED) {
                return false;
            }
        }
        return true;
    }

    public afri(Context context, int i) {
        this.$cid = i;
        this.a = (BatteryManager) context.getSystemService("batterymanager");
    }

    public afri(Context context, ConnectivityManager connectivityManager, int i, byte[] bArr) {
        this.$cid = i;
        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) == 0) {
            ahno.P(context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0, "An app using the NETWORK_UNMETERED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.a = connectivityManager;
    }
}
