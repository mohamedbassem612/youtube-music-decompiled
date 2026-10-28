package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class khy {
    public final ConnectivityManager b;
    public boolean e;
    public final Context f;
    public final boolean h;
    public final BroadcastReceiver i;
    public final Set j;
    private final ahex k;
    public final ConnectivityManager.NetworkCallback a = new khw(this);
    public final Map c = new HashMap();
    public final List d = new ArrayList();
    public final Object g = new Object();

    static {
        new khn("ConnectivityMonitor", (String) null);
    }

    public khy(Context context, ahex ahexVar) {
        this.h = Build.VERSION.SDK_INT >= 31;
        this.i = new khx(this);
        this.j = new HashSet();
        this.k = ahexVar;
        this.f = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void a(Network network, LinkProperties linkProperties) {
        synchronized (this.g) {
            Build.TYPE.equals("user");
            Map map = this.c;
            if (map.containsKey(network)) {
                this.d.remove(network);
            }
            map.put(network, linkProperties);
            this.d.add(network);
        }
        b();
    }

    public final void b() {
        ahex ahexVar = this.k;
        if (ahexVar != null) {
            Set<khv> set = this.j;
            synchronized (set) {
                for (khv khvVar : set) {
                    if (!ahexVar.isShutdown()) {
                        ahexVar.execute(new jmi(this, khvVar, 9, (char[]) null));
                    }
                }
            }
        }
    }
}
