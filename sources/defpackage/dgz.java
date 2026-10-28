package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.MediaRouter2$TransferCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dgz extends dhp {
    final MediaRouter2 a;
    final Map b;
    public boolean c;
    public String d;
    final hhb e;
    private final MediaRouter2$RouteCallback m;
    private final MediaRouter2$TransferCallback n;
    private final MediaRouter2$ControllerCallback o;
    private final Handler p;
    private final Executor q;
    private List r;
    private final Map s;

    public dgz(Context context, hhb hhbVar) {
        super(context, null);
        this.b = new ArrayMap();
        this.n = new dgy(this);
        this.o = new dgs(this);
        this.r = new ArrayList();
        this.s = new ArrayMap();
        this.a = MediaRouter2.getInstance(context);
        this.e = hhbVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.p = handler;
        this.q = new ege(handler, 1);
        if (Build.VERSION.SDK_INT >= 34) {
            this.m = new dgx(this);
        } else {
            this.m = new dgw(this);
        }
    }

    final MediaRoute2Info a(String str) {
        if (str == null) {
            return null;
        }
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM28m = aaj$$ExternalSyntheticApiModelOutline0.m28m(it.next());
            if (TextUtils.equals(mediaRoute2InfoM28m.getId(), str)) {
                return mediaRoute2InfoM28m;
            }
        }
        return null;
    }

    @Override // defpackage.dhp
    public final dhn c(String str) {
        return new dgv((String) this.s.get(str), null);
    }

    @Override // defpackage.dhp
    public final void e(dhh dhhVar) {
        RouteDiscoveryPreference routeDiscoveryPreferenceBuild;
        if (dij.a == null || dij.a().x <= 0) {
            MediaRouter2 mediaRouter2 = this.a;
            mediaRouter2.unregisterRouteCallback(this.m);
            mediaRouter2.unregisterTransferCallback(this.n);
            mediaRouter2.unregisterControllerCallback(this.o);
            return;
        }
        boolean zT = dij.a().t();
        if (dhhVar == null) {
            dhhVar = new dhh(did.a, false, false);
        }
        List listB = dhhVar.a().b();
        if (!zT) {
            listB.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!listB.contains("android.media.intent.category.LIVE_AUDIO")) {
            listB.add("android.media.intent.category.LIVE_AUDIO");
        }
        heg hegVar = new heg((char[]) null);
        hegVar.l(listB);
        dhh dhhVar2 = new dhh(hegVar.k(), dhhVar.b(), false);
        MediaRouter2 mediaRouter3 = this.a;
        Executor executor = this.q;
        MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.m;
        if (dhhVar2.c()) {
            boolean zB = dhhVar2.b();
            ArrayList arrayList = new ArrayList();
            Iterator it = dhhVar2.a().b().iterator();
            while (it.hasNext()) {
                arrayList.add(azt.i((String) it.next()));
            }
            routeDiscoveryPreferenceBuild = new RouteDiscoveryPreference.Builder(arrayList, zB).build();
        } else {
            routeDiscoveryPreferenceBuild = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        }
        mediaRouter3.registerRouteCallback(executor, mediaRouter2$RouteCallback, routeDiscoveryPreferenceBuild);
        mediaRouter3.registerTransferCallback(executor, this.n);
        mediaRouter3.registerControllerCallback(executor, this.o);
    }

    protected final void f() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        Iterator it = this.a.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM28m = aaj$$ExternalSyntheticApiModelOutline0.m28m(it.next());
            if (mediaRoute2InfoM28m != null && !arraySet.contains(mediaRoute2InfoM28m) && !mediaRoute2InfoM28m.isSystemRoute() && (!this.c || mediaRoute2InfoM28m.getId().startsWith(String.valueOf(this.f.getPackageName()).concat("/")))) {
                arraySet.add(mediaRoute2InfoM28m);
                arrayList.add(mediaRoute2InfoM28m);
            }
        }
        if (arrayList.equals(this.r)) {
            return;
        }
        this.r = arrayList;
        Map map = this.s;
        map.clear();
        Iterator it2 = this.r.iterator();
        while (it2.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM28m2 = aaj$$ExternalSyntheticApiModelOutline0.m28m(it2.next());
            Bundle extras = mediaRoute2InfoM28m2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Objects.toString(mediaRoute2InfoM28m2);
                Log.w("MR2Provider", "Cannot find the original route Id. route=".concat(String.valueOf(mediaRoute2InfoM28m2)));
            } else {
                map.put(mediaRoute2InfoM28m2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = this.r.iterator();
        while (it3.hasNext()) {
            dhg dhgVarH = azt.h(aaj$$ExternalSyntheticApiModelOutline0.m28m(it3.next()));
            if (dhgVarH != null) {
                arrayList2.add(dhgVarH);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                azs.C((dhg) it4.next(), arrayList3);
            }
        }
        gz(new dhq(arrayList3, true));
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.List] */
    final void g(MediaRouter2.RoutingController routingController) {
        dhf dhfVar;
        dgu dguVar = (dgu) this.b.get(routingController);
        if (dguVar == null) {
            Objects.toString(routingController);
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=".concat(String.valueOf(routingController)));
            return;
        }
        List selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Objects.toString(routingController);
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=".concat(String.valueOf(routingController)));
            return;
        }
        List listJ = azt.j(selectedRoutes);
        dhg dhgVarH = azt.h(aaj$$ExternalSyntheticApiModelOutline0.m28m(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.f.getString(R.string.mr_dialog_default_group_name);
        dhg dhgVarN = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (true != TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    dhgVarN = dhg.n(bundle);
                }
            } catch (Exception e) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e);
            }
        }
        if (dhgVarN == null) {
            dhfVar = new dhf(routingController.getId(), string);
            dhfVar.e(2);
            dhfVar.j(1);
        } else {
            dhfVar = new dhf(dhgVarN);
        }
        dhfVar.e = routingController.getId();
        dhfVar.l(routingController.getVolume());
        dhfVar.n(routingController.getVolumeMax());
        dhfVar.m(routingController.getVolumeHandling());
        dhfVar.d.clear();
        dhfVar.c(dhgVarH.r());
        dhfVar.c.clear();
        dhfVar.d(listJ);
        dhg dhgVarA = dhfVar.a();
        List listJ2 = azt.j(routingController.getSelectableRoutes());
        List listJ3 = azt.j(routingController.getDeselectableRoutes());
        dhq dhqVar = this.j;
        if (dhqVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<dhg> list = dhqVar.b;
        if (!list.isEmpty()) {
            for (dhg dhgVar : list) {
                String strP = dhgVar.p();
                if (dhgVar == null) {
                    throw new NullPointerException("descriptor must not be null");
                }
                arrayList.add(new dhi(dhgVar, true != listJ.contains(strP) ? 1 : 3, listJ3.contains(strP), listJ2.contains(strP), true));
            }
        }
        dguVar.i = dhgVarA;
        dguVar.r(dhgVarA, arrayList);
    }

    @Override // defpackage.dhp
    public final dhk gw(String str, dho dhoVar) {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            dgu dguVar = (dgu) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, dguVar.a)) {
                return dguVar;
            }
        }
        return null;
    }

    @Override // defpackage.dhp
    public final dhn gy(String str, String str2) {
        String str3 = (String) this.s.get(str);
        for (dgu dguVar : this.b.values()) {
            dhg dhgVar = dguVar.i;
            if (TextUtils.equals(str2, dhgVar != null ? dhgVar.p() : dguVar.b.getId())) {
                return new dgv(str3, dguVar);
            }
        }
        Log.w("MR2Provider", a.ca(str2, str, "Could not find the matching GroupRouteController. routeId=", ", routeGroupId="));
        return new dgv(str3, null);
    }
}
