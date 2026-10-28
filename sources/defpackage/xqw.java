package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xqw {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/mediaroute/MdxMediaRouteFilter");
    public static final int[] h = {1, 2, 3, 4, 5, 6, 8, 7};
    public final xro b;
    public final boolean c;
    public final String d;
    public final Executor e;
    public final xrx f;
    public final yar g;
    public final vxz i;
    private final ycp j;

    public xqw(yar yarVar, ycp ycpVar, boolean z, xro xroVar, String str, Executor executor, xrx xrxVar, dov dovVar, vxz vxzVar) {
        dovVar.getClass();
        yarVar.getClass();
        this.g = yarVar;
        this.j = ycpVar;
        this.c = z;
        this.b = xroVar;
        this.d = str;
        this.e = executor;
        this.f = xrxVar;
        this.i = vxzVar;
    }

    public static boolean k(xzc xzcVar, Collection collection) {
        xvr xvrVarJ = xzcVar.j();
        return (xvrVarJ == null || Collections.disjoint(xvrVarJ.v(), collection)) ? false : true;
    }

    public static boolean l(xzc xzcVar, String str) {
        xve xveVarI = xzcVar.i();
        if (xveVarI != null) {
            String str2 = xveVarI.e.b;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final String p(dii diiVar, CastDevice castDevice) {
        String str = castDevice.a;
        if (TextUtils.isEmpty(str)) {
            ((agrc) ((agrc) a.c().i(agso.a, "MDX.MediaRouteFilter")).k("com/google/android/libraries/youtube/mdx/mediaroute/MdxMediaRouteFilter", "createCleanCastId", 967, "MdxMediaRouteFilter.java")).t("empty cast device Id, fallback to parsing route Id");
            str = diiVar.d;
        }
        String strReplace = str.replace("-", "");
        return strReplace.substring(strReplace.lastIndexOf(":") + 1);
    }

    public static final boolean q(dii diiVar, Set set) {
        CastDevice castDeviceK = xrx.k(diiVar);
        if (castDeviceK == null) {
            return false;
        }
        String strP = p(diiVar, castDeviceK);
        return strP.length() >= 16 && set.contains(strP);
    }

    public static final boolean r(dii diiVar) {
        return xrx.k(diiVar) != null;
    }

    public static final agkj s(List list) {
        agkh agkhVar = new agkh(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dii diiVar = (dii) it.next();
            if (xrx.k(diiVar) != null) {
                CastDevice castDeviceK = xrx.k(diiVar);
                agkhVar.e(p(diiVar, castDeviceK), castDeviceK);
            }
        }
        return agkhVar.d(false);
    }

    private final boolean t(dii diiVar, Set set) {
        return !Collections.disjoint(b(diiVar), set);
    }

    private static final String u(xvn xvnVar) {
        return xvnVar.n.b.replace("-", "").replace("uuid:", "");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    private static final String v(dii diiVar) {
        Bundle bundle;
        String string;
        Bundle bundle2;
        if (xrx.n(diiVar)) {
            CastDevice castDeviceK = xrx.k(diiVar);
            if (castDeviceK != null) {
                string = castDeviceK.n;
            } else {
                string = "";
            }
        } else if (xrx.h(diiVar) && (bundle2 = diiVar.s) != null) {
            string = bundle2.getString("lounge_device_id");
        } else if (!xrx.j(diiVar) || (bundle = diiVar.s) == null) {
            string = "";
        } else {
            string = bundle.getString("mdxDiscoveryId");
        }
        return typ.c(string);
    }

    public final agkz a(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xvq xvqVar = (xvq) it.next();
            dii diiVar = xvqVar.a;
            if (!xrx.j(diiVar) && !xvqVar.k()) {
                agkz agkzVarB = b(diiVar);
                if (xvqVar.m()) {
                    hashSet2.addAll(agkzVarB);
                } else {
                    hashSet.addAll(agkzVarB);
                }
            }
        }
        return ahng.ae(hashSet, hashSet2).f();
    }

    public final agkz b(dii diiVar) {
        Bundle bundle;
        Bundle bundle2;
        agkx agkxVar = new agkx();
        if (!this.i.l(198, 45738303L, false)) {
            String strV = v(diiVar);
            if (!TextUtils.isEmpty(strV)) {
                agkxVar.c(new xvo(amyn.MDX_DISCOVERY_ID_TYPE_LOUNGE_DEVICE_ID, strV));
                agkxVar.c(new xvo(amyn.MDX_DISCOVERY_ID_TYPE_CAST_CLOUD_DEVICE_ID, strV));
            }
            return agkxVar.g();
        }
        if (xrx.n(diiVar)) {
            CastDevice castDeviceK = xrx.k(diiVar);
            if (castDeviceK != null) {
                String str = castDeviceK.n;
                if (!TextUtils.isEmpty(str)) {
                    agkxVar.c(new xvo(amyn.MDX_DISCOVERY_ID_TYPE_CAST_CLOUD_DEVICE_ID, str));
                }
            }
        } else if (xrx.h(diiVar) && (bundle2 = diiVar.s) != null) {
            String string = bundle2.getString("lounge_device_id");
            if (!TextUtils.isEmpty(string)) {
                agkxVar.c(new xvo(amyn.MDX_DISCOVERY_ID_TYPE_LOUNGE_DEVICE_ID, string));
            }
        } else if (xrx.j(diiVar) && (bundle = diiVar.s) != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("mdxDiscoveryIdCastList");
            if (stringArrayList != null) {
                int size = stringArrayList.size();
                for (int i = 0; i < size; i++) {
                    agkxVar.c(new xvo(amyn.MDX_DISCOVERY_ID_TYPE_CAST_CLOUD_DEVICE_ID, stringArrayList.get(i)));
                }
            }
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("mdxDiscoveryIdDialList");
            if (stringArrayList2 != null) {
                int size2 = stringArrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    agkxVar.c(new xvo(amyn.MDX_DISCOVERY_ID_TYPE_LOUNGE_DEVICE_ID, stringArrayList2.get(i2)));
                }
            }
            agkz agkzVarG = agkxVar.g();
            if (agkzVarG.isEmpty()) {
                String string2 = bundle.getString("mdxDiscoveryId");
                if (!TextUtils.isEmpty(string2)) {
                    agkxVar.c(new xvo(amyn.MDX_DISCOVERY_ID_TYPE_LOUNGE_DEVICE_ID, string2));
                    agkxVar.c(new xvo(amyn.MDX_DISCOVERY_ID_TYPE_CAST_CLOUD_DEVICE_ID, string2));
                    return agkxVar.g();
                }
            }
            return agkzVarG;
        }
        return agkxVar.g();
    }

    public final Optional c(xvq xvqVar, List list, boolean z) {
        dii diiVar = xvqVar.a;
        if (xrx.j(diiVar) == z) {
            return Optional.empty();
        }
        agkz agkzVarB = b(diiVar);
        if (agkzVarB.isEmpty()) {
            return Optional.empty();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xvq xvqVar2 = (xvq) it.next();
            dii diiVar2 = xvqVar2.a;
            if (xrx.j(diiVar2) == z && !Collections.disjoint(agkzVarB, b(diiVar2))) {
                return Optional.of(xvqVar2);
            }
        }
        return Optional.empty();
    }

    public final Optional d(dii diiVar, agkj agkjVar) {
        xvn xvnVar = (xvn) this.g.c(diiVar.s);
        if (xvnVar == null || xvnVar.n == null) {
            return Optional.empty();
        }
        String strU = u(xvnVar);
        return (strU.length() < 16 || !agkjVar.containsKey(strU)) ? Optional.empty() : Optional.of((CastDevice) agkjVar.get(strU));
    }

    public final Set e() {
        agkx agkxVar = new agkx();
        Iterator it = this.g.c.iterator();
        while (it.hasNext()) {
            agkxVar.c(u((xvn) it.next()));
        }
        return agkxVar.g();
    }

    public final Set f(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dii diiVar = (dii) it.next();
            if (xrx.j(diiVar)) {
                hashSet.addAll(b(diiVar));
            }
        }
        return hashSet;
    }

    public final void g(List list, boolean z, boolean z2) {
        vxz vxzVar = this.i;
        agkj agkjVarS = s(list);
        Set setF = f(list);
        Set setA = vxzVar.l(255, 45837246L, false) ? a((agke) j$.util.Collection.EL.stream(list).map(new xjh(7)).collect(aghu.a)) : agpr.a;
        Set setE = e();
        agrx agrxVar = agso.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dii diiVar = (dii) it.next();
            String str = this.d;
            if (ahno.aa(str) || Arrays.asList(str.split(",")).contains(diiVar.e)) {
                xqw xqwVar = this;
                boolean z3 = z;
                boolean z4 = z2;
                if (xqwVar.m(diiVar, agkjVarS, setF, setA, setE, z3, z4)) {
                    it.remove();
                }
                this = xqwVar;
                z = z3;
                z2 = z4;
            } else {
                it.remove();
            }
        }
    }

    public final boolean h(dii diiVar) {
        xvr xvrVarC = this.g.c(diiVar.s);
        if (xvrVarC != null) {
            return TextUtils.isEmpty(((xvn) xvrVarC).e);
        }
        ((agrc) ((agrc) xsa.a.c().i(agso.a, "MDX.RouteUtil")).k("com/google/android/libraries/youtube/mdx/mediaroute/RouteUtil", "doesRouteHaveUnknownManufacturer", 108, "RouteUtil.java")).t("Route was not found in screen monitor");
        return false;
    }

    public final boolean i(dii diiVar) {
        if (!xsa.g(diiVar)) {
            return false;
        }
        xvr xvrVarC = this.g.c(diiVar.s);
        if (xvrVarC != null) {
            return ((xvn) xvrVarC).s();
        }
        ((agrc) ((agrc) xsa.a.c().i(agso.a, "MDX.RouteUtil")).k("com/google/android/libraries/youtube/mdx/mediaroute/RouteUtil", "isWakeOnLanDialRoute", 92, "RouteUtil.java")).t("Route was not found in screen monitor");
        return false;
    }

    public final boolean j(dii diiVar) {
        yco ycoVar;
        ycp ycpVar = this.j;
        if (ycpVar == null) {
            return false;
        }
        int i = ycpVar.b;
        if ((i != 1 && i != 0) || (ycoVar = ycpVar.e) == null) {
            return false;
        }
        if (!k(ycoVar, b(diiVar)) && !l(ycoVar, v(diiVar))) {
            xvr xvrVarJ = ycoVar.j();
            if (!(xvrVarJ instanceof xvj)) {
                return false;
            }
            xvj xvjVar = (xvj) xvrVarJ;
            if (!xrx.n(diiVar)) {
                return false;
            }
            CastDevice castDevice = xvjVar.a;
            CastDevice castDeviceK = xrx.k(diiVar);
            if (castDeviceK == null || !castDevice.a.equals(castDeviceK.a)) {
                return false;
            }
        }
        return true;
    }

    public final boolean m(dii diiVar, agkj agkjVar, Set set, Set set2, Set set3, boolean z, boolean z2) {
        Bundle bundle;
        Optional optionalEmpty = Optional.empty();
        if (xsa.g(diiVar)) {
            optionalEmpty = d(diiVar, agkjVar);
        }
        boolean zQ = xrx.k(diiVar) != null ? q(diiVar, set3) : false;
        if (this.b.a(diiVar) && ((!optionalEmpty.isPresent() || o((CastDevice) optionalEmpty.get())) && ((!xrx.m(diiVar) || this.c) && ((!i(diiVar) || !h(diiVar)) && ((!z || !xsa.h(diiVar) || ((bundle = diiVar.s) != null && bundle.getBoolean("displayInAvailableList", true))) && (!z2 || !j(diiVar))))))) {
            vxz vxzVar = this.i;
            if ((!vxzVar.l(165, 45676577L, false) || z2 || !j(diiVar) || diiVar.o()) && ((!vxzVar.l(165, 45676577L, false) || xrx.j(diiVar) || j(diiVar) || diiVar.o() || !t(diiVar, set) || (vxzVar.l(255, 45837246L, false) && t(diiVar, set2))) && ((!vxzVar.l(165, 45676577L, false) || !vxzVar.l(255, 45837246L, false) || !xrx.j(diiVar) || j(diiVar) || diiVar.o() || !t(diiVar, set2)) && (!zQ || !n(diiVar))))) {
                return false;
            }
        }
        return true;
    }

    public final boolean n(dii diiVar) {
        CastDevice castDeviceK = xrx.k(diiVar);
        return castDeviceK != null && castDeviceK.f() && this.i.l(179, 45704443L, false);
    }

    public final boolean o(CastDevice castDevice) {
        return castDevice.f() && this.i.l(179, 45704443L, false);
    }
}
