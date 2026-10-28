package defpackage;

import android.content.Context;
import android.media.MediaRoute2ProviderService;
import android.media.RouteDiscoveryPreference;
import android.media.RoutingSessionInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dhe extends MediaRoute2ProviderService {
    public static final /* synthetic */ int e = 0;
    final dht b;
    public volatile dhq d;
    public final Object a = new Object();
    final Map c = new afv();

    public dhe(dht dhtVar) {
        this.b = dhtVar;
    }

    public static void d(Set set, RoutingSessionInfo routingSessionInfo) {
        String id = routingSessionInfo.getId();
        f(id, "selected", set, routingSessionInfo.getSelectedRoutes());
        f(id, "selectable", set, routingSessionInfo.getSelectableRoutes());
        f(id, "deselectable", set, routingSessionInfo.getDeselectableRoutes());
        f(id, "transferable", set, routingSessionInfo.getTransferableRoutes());
    }

    private final dhg e(String str, String str2) {
        if (c() == null || this.d == null) {
            Log.w("AxMR2ProvdrSrvcAdapter", str2.concat(": no provider info"));
            return null;
        }
        for (dhg dhgVar : this.d.b) {
            if (TextUtils.equals(dhgVar.p(), str)) {
                return dhgVar;
            }
        }
        Log.w("AxMR2ProvdrSrvcAdapter", a.cd(str, str2, ": Couldn't find a route : "));
        return null;
    }

    private static void f(String str, String str2, Set set, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!set.contains(str3)) {
                Log.w("AxMR2ProvdrSrvcAdapter", String.format(Locale.ROOT, "Session with id: '%s' contains invalid %s route id: '%s'.", str, str2, str3));
            }
        }
    }

    public final dhk a(String str) {
        dhk dhkVar;
        synchronized (this.a) {
            dhd dhdVar = (dhd) this.c.get(str);
            dhkVar = dhdVar == null ? null : dhdVar.b;
        }
        return dhkVar;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final dhn b(String str) {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.c.values());
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            dhn dhnVarA = ((dhd) arrayList.get(i)).a(str);
            i++;
            if (dhnVarA != null) {
                return dhnVarA;
            }
        }
        return null;
    }

    final dhp c() {
        dic dicVar = this.b.d;
        if (dicVar == null) {
            return null;
        }
        return dicVar.c;
    }

    public final void onCreateSession(long j, String str, String str2, Bundle bundle) {
        int i;
        dhk dhbVar;
        String string;
        Map map;
        dhp dhpVarC = c();
        dhg dhgVarE = e(str2, "onCreateSession");
        if (dhgVarE == null) {
            notifyRequestFailed(j, 3);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("controlHints", bundle);
        bundle2.putString("clientPackageName", str);
        dho dhoVar = new dho(bundle2);
        if (this.d.c) {
            dhk dhkVarGw = dhpVarC.gw(str2, dhoVar);
            if (dhkVarGw == null) {
                Log.w("AxMR2ProvdrSrvcAdapter", "onCreateSession: Couldn't create a dynamic controller");
                notifyRequestFailed(j, 1);
                return;
            } else {
                i = 7;
                dhbVar = dhkVarGw;
            }
        } else {
            dhn dhnVarGx = dhpVarC.gx(str2, dhoVar);
            if (dhnVarGx == null) {
                Log.w("AxMR2ProvdrSrvcAdapter", "onCreateSession: Couldn't create a controller");
                notifyRequestFailed(j, 1);
                return;
            } else {
                i = true == dhgVarE.s().isEmpty() ? 1 : 3;
                dhbVar = new dhb(str2, dhnVarGx);
            }
        }
        int i2 = i;
        dhbVar.p();
        dhd dhdVar = new dhd(this, dhbVar, j, i2);
        synchronized (this.a) {
            do {
                string = UUID.randomUUID().toString();
                map = this.c;
            } while (map.containsKey(string));
            dhdVar.g = string;
            map.put(string, dhdVar);
        }
        RoutingSessionInfo.Builder volumeMax = new RoutingSessionInfo.Builder(string, str).setName(dhgVarE.q()).setVolumeHandling(dhgVarE.i()).setVolume(dhgVarE.h()).setVolumeMax(dhgVarE.j());
        if (dhgVarE.s().isEmpty()) {
            volumeMax.addSelectedRoute(str2);
        } else {
            Iterator it = dhgVarE.s().iterator();
            while (it.hasNext()) {
                volumeMax.addSelectedRoute((String) it.next());
            }
        }
        RoutingSessionInfo routingSessionInfoBuild = volumeMax.build();
        if (dhdVar.f != null) {
            Log.w("AxMR2ProvdrSrvcAdapter", "setSessionInfo: This shouldn't be called after sessionInfo is set");
        } else {
            Messenger messenger = new Messenger(new dhc(dhdVar.i, dhdVar.g));
            RoutingSessionInfo.Builder builder = new RoutingSessionInfo.Builder(routingSessionInfoBuild);
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("androidx.mediarouter.media.KEY_MESSENGER", messenger);
            bundle3.putString("androidx.mediarouter.media.KEY_SESSION_NAME", routingSessionInfoBuild.getName() != null ? routingSessionInfoBuild.getName().toString() : null);
            dhdVar.f = builder.setControlHints(bundle3).build();
        }
        if ((i2 & 4) == 0) {
            if ((i2 & 2) != 0) {
                dhdVar.b(str2, null, routingSessionInfoBuild, dhoVar);
            } else {
                dhdVar.a.put(str2, dhdVar.b);
            }
        }
        dht dhtVar = this.b;
        dhbVar.s(avg.e(dhtVar.d.getApplicationContext()), dhtVar.b);
    }

    public final void onDeselectRoute(long j, String str, String str2) {
        if (getSessionInfo(str) == null) {
            Log.w("AxMR2ProvdrSrvcAdapter", "onDeselectRoute: Couldn't find a session");
            notifyRequestFailed(j, 4);
        } else {
            if (e(str2, "onDeselectRoute") == null) {
                notifyRequestFailed(j, 3);
                return;
            }
            dhk dhkVarA = a(str);
            if (dhkVarA != null) {
                dhkVarA.c(str2);
            } else {
                Log.w("AxMR2ProvdrSrvcAdapter", "onDeselectRoute: Couldn't find a controller");
                notifyRequestFailed(j, 3);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void onDiscoveryPreferenceChanged(RouteDiscoveryPreference routeDiscoveryPreference) {
        boolean zShouldPerformActiveScan = routeDiscoveryPreference.shouldPerformActiveScan();
        ArrayList arrayList = new ArrayList();
        for (String str : routeDiscoveryPreference.getPreferredFeatures()) {
            switch (str.hashCode()) {
                case -1282314761:
                    if (str.equals("android.media.route.feature.REMOTE_AUDIO_PLAYBACK")) {
                        str = "android.media.intent.category.REMOTE_AUDIO_PLAYBACK";
                    }
                    break;
                case -1190404366:
                    if (str.equals("android.media.route.feature.REMOTE_VIDEO_PLAYBACK")) {
                        str = "android.media.intent.category.REMOTE_VIDEO_PLAYBACK";
                    }
                    break;
                case 94496206:
                    if (str.equals("android.media.route.feature.REMOTE_PLAYBACK")) {
                        str = "android.media.intent.category.REMOTE_PLAYBACK";
                    }
                    break;
                case 1328964233:
                    if (str.equals("android.media.route.feature.LIVE_AUDIO")) {
                        str = "android.media.intent.category.LIVE_AUDIO";
                    }
                    break;
                case 1348000558:
                    if (str.equals("android.media.route.feature.LIVE_VIDEO")) {
                        str = "android.media.intent.category.LIVE_VIDEO";
                    }
                    break;
            }
            arrayList.add(str);
        }
        dht dhtVar = this.b;
        heg hegVar = new heg((char[]) null);
        hegVar.l(arrayList);
        dhh dhhVar = new dhh(hegVar.k(), routeDiscoveryPreference.shouldPerformActiveScan(), zShouldPerformActiveScan);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!Objects.equals(dhtVar.g, dhhVar) || dhhVar.b()) {
            dhtVar.g = dhhVar;
            dhtVar.h = jElapsedRealtime;
            dhtVar.j();
        }
    }

    public final void onReleaseSession(long j, String str) {
        dhd dhdVar;
        dhs dhsVar;
        if (getSessionInfo(str) == null) {
            Log.w("AxMR2ProvdrSrvcAdapter", "onReleaseSession: Ignored with unrecognized sessionId = ".concat(String.valueOf(str)));
            return;
        }
        synchronized (this.a) {
            dhdVar = (dhd) this.c.remove(str);
        }
        if (dhdVar == null) {
            Log.w("AxMR2ProvdrSrvcAdapter", "onReleaseSession: Couldn't find a session");
            notifyRequestFailed(j, 4);
            return;
        }
        if (dhdVar.e) {
            return;
        }
        int i = dhdVar.c;
        if ((i & 3) == 3) {
            dhdVar.b(null, dhdVar.f, null, dho.a);
        }
        dhn dhnVar = dhdVar.b;
        dhnVar.q(2);
        dhnVar.b();
        if ((i & 1) == 0 && (dhsVar = (dhs) dhdVar.d.get()) != null) {
            if (dhnVar instanceof dhb) {
                dhnVar = ((dhb) dhnVar).b;
            }
            String str2 = dhdVar.h;
            SparseArray sparseArray = dhsVar.j;
            int iIndexOfValue = sparseArray.indexOfValue(dhnVar);
            int iKeyAt = iIndexOfValue < 0 ? -1 : sparseArray.keyAt(iIndexOfValue);
            dhsVar.f(iKeyAt);
            if (dhsVar.f < 4) {
                dhsVar.c.put(str2, Integer.valueOf(iKeyAt));
                dhsVar.b.postDelayed(new dhr(dhsVar, str2, 0), 5000L);
                dhsVar.d();
            } else if (iKeyAt < 0) {
                Log.w("MediaRouteProviderSrv", "releaseControllerByProvider: Can't find the controller. route ID=".concat(String.valueOf(str2)));
            } else {
                dic.f(dhsVar.e, 8, 0, iKeyAt, null, null);
            }
        }
        dhdVar.e = true;
        dhdVar.i.notifySessionReleased(dhdVar.g);
    }

    public final void onSelectRoute(long j, String str, String str2) {
        if (getSessionInfo(str) == null) {
            Log.w("AxMR2ProvdrSrvcAdapter", "onSelectRoute: Couldn't find a session");
            notifyRequestFailed(j, 4);
        } else {
            if (e(str2, "onSelectRoute") == null) {
                notifyRequestFailed(j, 3);
                return;
            }
            dhk dhkVarA = a(str);
            if (dhkVarA != null) {
                dhkVarA.a(str2);
            } else {
                Log.w("AxMR2ProvdrSrvcAdapter", "onSelectRoute: Couldn't find a controller");
                notifyRequestFailed(j, 3);
            }
        }
    }

    public final void onSetRouteVolume(long j, String str, int i) {
        dhn dhnVarB = b(str);
        if (dhnVarB != null) {
            dhnVarB.d(i);
        } else {
            Log.w("AxMR2ProvdrSrvcAdapter", "onSetRouteVolume: Couldn't find a controller for routeId=".concat(String.valueOf(str)));
            notifyRequestFailed(j, 3);
        }
    }

    public final void onSetSessionVolume(long j, String str, int i) {
        if (getSessionInfo(str) == null) {
            Log.w("AxMR2ProvdrSrvcAdapter", "onSetSessionVolume: Couldn't find a session");
            notifyRequestFailed(j, 4);
            return;
        }
        dhk dhkVarA = a(str);
        if (dhkVarA != null) {
            dhkVarA.d(i);
        } else {
            Log.w("AxMR2ProvdrSrvcAdapter", "onSetSessionVolume: Couldn't find a controller");
            notifyRequestFailed(j, 3);
        }
    }

    public final void onTransferToRoute(long j, String str, String str2) {
        if (getSessionInfo(str) == null) {
            Log.w("AxMR2ProvdrSrvcAdapter", "onTransferToRoute: Couldn't find a session");
            notifyRequestFailed(j, 4);
        } else {
            if (e(str2, "onTransferToRoute") == null) {
                notifyRequestFailed(j, 3);
                return;
            }
            dhk dhkVarA = a(str);
            if (dhkVarA != null) {
                dhkVarA.e(Collections.singletonList(str2));
            } else {
                Log.w("AxMR2ProvdrSrvcAdapter", "onTransferToRoute: Couldn't find a controller");
                notifyRequestFailed(j, 3);
            }
        }
    }
}
