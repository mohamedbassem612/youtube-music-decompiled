package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tfo extends BroadcastReceiver {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/common/network/DefaultConnectivityReceiver");
    private final Application b;
    private final awmd c;
    private final tcr d;
    private final tcq e;
    private final wmy f;

    public tfo(Context context, awmd awmdVar, wmy wmyVar) {
        context.getClass();
        Application application = (Application) context.getApplicationContext();
        this.b = application;
        this.c = awmdVar;
        int i = 1;
        twd twdVar = new twd(awmdVar, i);
        this.d = twdVar;
        twc twcVar = new twc(awmdVar, i);
        this.e = twcVar;
        wmyVar.getClass();
        this.f = wmyVar;
        wmyVar.a(twdVar);
        wmyVar.a(twcVar);
        avg.f(application, this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, 4);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/common/network/DefaultConnectivityReceiver", "onReceive", 88, "DefaultConnectivityReceiver.java")).w("Unexpected intent. Received action does not match CONNECTIVITY_ACTION: %s", intent);
            return;
        }
        ((awkv) ((tfm) this.c.io()).b).kk(Boolean.TRUE);
    }
}
