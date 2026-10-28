package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.base.JniAndroid;
import org.chromium.net.ConnectivityManagerWrapper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axmr {
    static boolean a;
    public final Context b;
    public final axnk c;
    public final String[] d;
    public final Set e;
    public final Set f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public Handler j;
    public final Map k;
    public final Set l;
    public final AtomicReference m;
    public ConnectivityManagerWrapper n;
    public final JniAndroid o;

    public axmr(Context context, axnk axnkVar) {
        boolean zF;
        boolean zF2;
        JniAndroid jniAndroid = new JniAndroid();
        this.k = DesugarCollections.synchronizedMap(new HashMap());
        this.l = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new IdentityHashMap()));
        this.m = new AtomicReference(null);
        new axjt("CronetAdaptiveRequestContext#constructor", 0);
        this.b = context.getApplicationContext();
        this.c = axnkVar;
        this.o = jniAndroid;
        this.n = new ConnectivityManagerWrapper(context);
        Map mapD = axlp.a(context, false, axnm.b(context, axok.q)).d();
        if (mapD.containsKey("Cronet_enable_adaptive_network_hosts")) {
            this.d = ((axlq) mapD.get("Cronet_enable_adaptive_network_hosts")).d().trim().split(",");
        } else {
            this.d = new String[0];
        }
        this.e = new HashSet();
        if (mapD.containsKey("Cronet_enable_adaptive_network_paths")) {
            for (String str : ((axlq) mapD.get("Cronet_enable_adaptive_network_paths")).d().trim().split(",")) {
                if (!str.isEmpty()) {
                    this.e.add(str);
                }
            }
        }
        if (mapD.containsKey("Cronet_adaptive_failover_ms")) {
            this.g = ((axlq) mapD.get("Cronet_adaptive_failover_ms")).c();
        } else {
            this.g = 3000L;
        }
        if (mapD.containsKey("Cronet_enable_adaptive_network")) {
            zF = ((axlq) mapD.get("Cronet_enable_adaptive_network")).f();
            this.h = zF;
        } else {
            this.h = false;
            zF = false;
        }
        if (mapD.containsKey("Cronet_enable_adaptive_network_for_all")) {
            zF2 = ((axlq) mapD.get("Cronet_enable_adaptive_network_for_all")).f();
            this.i = zF2;
        } else {
            this.i = false;
            zF2 = false;
        }
        if (mapD.containsKey("Cronet_adaptive_network_dev_toast") && ((axlq) mapD.get("Cronet_adaptive_network_dev_toast")).f()) {
            this.j = new Handler(Looper.getMainLooper());
            if (!a) {
                a("CRONET[" + this.b.getPackageName() + "]: CANS enabled: " + (true != zF ? "N" : "Y") + ", for all: " + (true == zF2 ? "Y" : "N"));
                a = true;
            }
        }
        this.f = new HashSet();
        if (mapD.containsKey("Cronet_fast_idempotent_paths")) {
            for (String str2 : ((axlq) mapD.get("Cronet_fast_idempotent_paths")).d().trim().split(",")) {
                if (!str2.isEmpty()) {
                    this.f.add(str2);
                }
            }
        }
    }

    final void a(String str) {
        Handler handler = this.j;
        handler.getClass();
        handler.post(new aves((Object) this, (Object) str, 20, (byte[]) null));
    }

    final void b(axmo axmoVar) {
        if (!this.l.remove(axmoVar)) {
            throw new AssertionError("Stream is not registered as active.");
        }
    }
}
