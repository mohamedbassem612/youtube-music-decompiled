package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class edn {
    public static final String a = dzf.a("NetworkStateTracker");

    /* JADX WARN: Code duplicated, block: B:11:0x001b A[Catch: SecurityException -> 0x0023, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x0023, blocks: (B:9:0x0011, B:11:0x001b), top: B:35:0x0011, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:8:0x0010  */
    public static final ecn a(ConnectivityManager connectivityManager, boolean z) {
        boolean z2;
        SecurityException securityException;
        boolean z3;
        boolean zHasCapability;
        boolean z4;
        NetworkCapabilities networkCapabilities;
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                z3 = false;
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    zHasCapability = networkCapabilities.hasCapability(16);
                } else {
                    zHasCapability = false;
                }
                boolean zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                return new ecn(z3, zHasCapability, zIsActiveNetworkMetered, z4, z);
            }
            try {
                if (activeNetworkInfo.isConnected()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                try {
                    networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                    if (networkCapabilities != null) {
                        zHasCapability = networkCapabilities.hasCapability(16);
                    } else {
                        zHasCapability = false;
                    }
                } catch (SecurityException e) {
                    dzf.b();
                    Log.e(a, "Unable to validate active network", e);
                }
                boolean zIsActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                try {
                    return new ecn(z3, zHasCapability, zIsActiveNetworkMetered2, z4, z);
                } catch (SecurityException e2) {
                    e = e2;
                    z2 = z;
                    securityException = e;
                    dzf.b();
                    Log.e(a, "Unable to get active network state", securityException);
                    return new ecn(false, false, false, true, z2);
                }
            } catch (SecurityException e3) {
                securityException = e3;
                z2 = z;
            }
        } catch (SecurityException e4) {
            e = e4;
            z2 = z;
            securityException = e;
            dzf.b();
            Log.e(a, "Unable to get active network state", securityException);
            return new ecn(false, false, false, true, z2);
        }
        dzf.b();
        Log.e(a, "Unable to get active network state", securityException);
        return new ecn(false, false, false, true, z2);
    }
}
