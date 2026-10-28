package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdl {
    private static volatile fdl d;
    public boolean a;
    public final Object b;
    public final Object c;

    public fdl(awmd awmdVar, hwz hwzVar) {
        this.b = new awku();
        this.c = hwzVar;
        hxh hxhVar = new hxh(this);
        int i = 15;
        ((abvn) awmdVar.io()).P().i(new abwr(1)).al(new hwd(hxhVar, i), new hpw(i));
    }

    static fdl a(Context context) {
        if (d == null) {
            synchronized (fdl.class) {
                if (d == null) {
                    d = new fdl(context.getApplicationContext());
                }
            }
        }
        return d;
    }

    public static ibh d(akxs akxsVar) {
        return akxsVar == akxs.FEATURE_AVAILABILITY_BLOCKED ? ibh.OMV_PREFERRED : ibh.ATV_PREFERRED;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ffm, java.lang.Object] */
    final synchronized void b(fcr fcrVar) {
        ?? r0 = this.b;
        r0.add(fcrVar);
        if (this.a || r0.isEmpty()) {
            return;
        }
        Object obj = this.c;
        ?? r1 = ((kjx) obj).d;
        boolean z = true;
        ((kjx) obj).b = ((ConnectivityManager) r1.a()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) r1.a()).registerDefaultNetworkCallback((ConnectivityManager.NetworkCallback) ((kjx) obj).a);
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
            z = false;
        }
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ffm, java.lang.Object] */
    final synchronized void c(fcr fcrVar) {
        ?? r0 = this.b;
        r0.remove(fcrVar);
        if (this.a && r0.isEmpty()) {
            Object obj = this.c;
            ((ConnectivityManager) ((kjx) obj).d.a()).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) ((kjx) obj).a);
            this.a = false;
        }
    }

    public final avlh e() {
        return ((avlh) this.b).P().p();
    }

    public final void f() {
        this.a = false;
        ((awku) this.b).kk(akxs.FEATURE_AVAILABILITY_UNKNOWN);
    }

    public final boolean g() {
        return ((awku) this.b).aD() == akxs.FEATURE_AVAILABILITY_BLOCKED;
    }

    private fdl(Context context) {
        this.b = new HashSet();
        this.c = new kjx(new ffl(new fdi(context)), new fdj(this));
    }
}
