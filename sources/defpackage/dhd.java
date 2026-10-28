package defpackage;

import android.media.RoutingSessionInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dhd {
    public final dhk b;
    public final int c;
    public boolean e;
    public RoutingSessionInfo f;
    String g;
    String h;
    final /* synthetic */ dhe i;
    private final long j;
    public final Map a = new afv();
    private boolean k = false;
    public final WeakReference d = new WeakReference(null);

    public dhd(dhe dheVar, dhk dhkVar, long j, int i) {
        this.i = dheVar;
        this.b = dhkVar;
        this.j = j;
        this.c = i;
    }

    final dhn a(String str) {
        dhs dhsVar = (dhs) this.d.get();
        return dhsVar != null ? (dhn) dhsVar.a.get(str) : (dhn) this.a.get(str);
    }

    public final void b(String str, RoutingSessionInfo routingSessionInfo, RoutingSessionInfo routingSessionInfo2, dho dhoVar) {
        dhn dhnVar;
        List<String> selectedRoutes = routingSessionInfo == null ? Collections.EMPTY_LIST : routingSessionInfo.getSelectedRoutes();
        List<String> selectedRoutes2 = routingSessionInfo2 == null ? Collections.EMPTY_LIST : routingSessionInfo2.getSelectedRoutes();
        for (String str2 : selectedRoutes2) {
            if (a(str2) == null) {
                Map map = this.a;
                dhn dhnVarGx = (dhn) map.get(str2);
                if (dhnVarGx == null) {
                    dhe dheVar = this.i;
                    dhnVarGx = str == null ? dheVar.c().gx(str2, dhoVar) : dheVar.c().gy(str2, str);
                    if (dhnVarGx != null) {
                        map.put(str2, dhnVarGx);
                    }
                }
                if (dhnVarGx != null) {
                    dhnVarGx.p();
                }
            }
        }
        for (String str3 : selectedRoutes) {
            if (!selectedRoutes2.contains(str3) && (dhnVar = (dhn) this.a.remove(str3)) != null) {
                dhnVar.q(0);
                dhnVar.b();
            }
        }
    }

    public final void c(dhg dhgVar, Collection collection) {
        RoutingSessionInfo routingSessionInfo = this.f;
        if (routingSessionInfo == null) {
            Log.w("AxMR2ProvdrSrvcAdapter", "updateSessionInfo: mSessionInfo is null. This shouldn't happen.");
            return;
        }
        if (dhgVar != null && !dhgVar.w()) {
            this.i.onReleaseSession(0L, this.g);
            return;
        }
        RoutingSessionInfo.Builder builder = new RoutingSessionInfo.Builder(routingSessionInfo);
        if (dhgVar != null) {
            this.h = dhgVar.p();
            builder.setName(dhgVar.q()).setVolume(dhgVar.h()).setVolumeMax(dhgVar.j()).setVolumeHandling(dhgVar.i());
            builder.clearSelectedRoutes();
            if (dhgVar.s().isEmpty()) {
                builder.addSelectedRoute(this.h);
            } else {
                Iterator it = dhgVar.s().iterator();
                while (it.hasNext()) {
                    builder.addSelectedRoute((String) it.next());
                }
            }
            Bundle controlHints = routingSessionInfo.getControlHints();
            if (controlHints == null) {
                Log.w("AxMR2ProvdrSrvcAdapter", "updateSessionInfo: controlHints is null. This shouldn't happen.");
                controlHints = new Bundle();
            }
            controlHints.putString("androidx.mediarouter.media.KEY_SESSION_NAME", dhgVar.q());
            controlHints.putBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE", dhgVar.a);
            builder.setControlHints(controlHints);
        }
        this.f = builder.build();
        if (collection != null && !collection.isEmpty()) {
            builder.clearSelectedRoutes();
            builder.clearSelectableRoutes();
            builder.clearDeselectableRoutes();
            builder.clearTransferableRoutes();
            afx afxVar = new afx(0);
            Iterator it2 = collection.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                dhi dhiVar = (dhi) it2.next();
                String strP = dhiVar.a.p();
                if (!afxVar.add(strP)) {
                    Log.w("AxMR2ProvdrSrvcAdapter", "Found duplicate route ID in dynamic routes: ".concat(String.valueOf(strP)));
                }
                int i = dhiVar.b;
                if (i == 2 || i == 3) {
                    builder.addSelectedRoute(strP);
                    z = true;
                }
                if (dhiVar.d) {
                    builder.addSelectableRoute(strP);
                }
                if (dhiVar.c) {
                    builder.addDeselectableRoute(strP);
                }
                if (dhiVar.e) {
                    builder.addTransferableRoute(strP);
                }
            }
            if (z) {
                this.f = builder.build();
            }
        }
        int i2 = dhe.e;
        if ((this.c & 5) == 5 && dhgVar != null) {
            b(dhgVar.p(), routingSessionInfo, this.f, dho.a);
        }
        dhe dheVar = this.i;
        dhq dhqVar = dheVar.d;
        List list = dhqVar != null ? dhqVar.b : Collections.EMPTY_LIST;
        afx afxVar2 = new afx(0);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            afxVar2.add(((dhg) it3.next()).p());
        }
        dhe.d(afxVar2, this.f);
        if (this.k) {
            dheVar.notifySessionUpdated(this.f);
        } else {
            this.k = true;
            dheVar.notifySessionCreated(this.j, this.f);
        }
    }
}
