package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class edp extends edl {
    public final ConnectivityManager e;
    public final Object f;
    public volatile boolean g;
    private final edo h;

    public edp(Context context, axfd axfdVar) {
        super(context, axfdVar);
        Object systemService = this.a.getSystemService("connectivity");
        systemService.getClass();
        this.e = (ConnectivityManager) systemService;
        this.f = new Object();
        this.h = new edo(this);
    }

    @Override // defpackage.edl
    public final /* bridge */ /* synthetic */ Object b() {
        return edn.a(this.e, this.g);
    }

    @Override // defpackage.edl
    public final void d() {
        try {
            dzf.b();
            String str = edn.a;
            ConnectivityManager connectivityManager = this.e;
            edo edoVar = this.h;
            edoVar.getClass();
            connectivityManager.registerDefaultNetworkCallback(edoVar);
        } catch (IllegalArgumentException e) {
            dzf.b();
            Log.e(edn.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            dzf.b();
            Log.e(edn.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.edl
    public final void e() {
        try {
            dzf.b();
            String str = edn.a;
            this.e.unregisterNetworkCallback(this.h);
        } catch (IllegalArgumentException e) {
            dzf.b();
            Log.e(edn.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            dzf.b();
            Log.e(edn.a, "Received exception while unregistering network callback", e2);
        }
    }
}
