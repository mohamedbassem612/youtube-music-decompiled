package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.URL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lev extends lea {
    public static final byte[] a = new byte[0];

    public final boolean a() {
        m();
        ConnectivityManager connectivityManager = (ConnectivityManager) aS().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void c(String str, URL url, let letVar) {
        m();
        aU().i(new leu(this, str, url, null, null, letVar));
    }

    @Override // defpackage.lea
    protected final boolean e() {
        return false;
    }
}
