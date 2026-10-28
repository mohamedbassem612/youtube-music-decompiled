package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xhf {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/logging/interaction/debug/InteractionLoggingDebugger");
    private static final Random c = new Random();
    public final Map a;
    private final vyo d;
    private agfr e;

    public xhf(zrv zrvVar, SharedPreferences sharedPreferences, tpq tpqVar, xeu xeuVar, vyo vyoVar, vxz vxzVar) {
        sharedPreferences.getClass();
        tpqVar.getClass();
        xeuVar.getClass();
        zrvVar.getClass();
        this.a = new HashMap();
        this.d = vyoVar;
        new HashSet();
        if (vxzVar.l(30, 45381279L, false)) {
            this.e = aguu.al(new tar(this, 10));
        }
    }

    public static int a(argn argnVar) {
        jrf jrfVar;
        if (argnVar == null) {
            return 0;
        }
        if (argnVar.c.d() <= 0) {
            return argnVar.d;
        }
        try {
            jrfVar = (jrf) aihn.parseFrom(jrf.a, argnVar.c, ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik unused) {
            ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/logging/interaction/debug/InteractionLoggingDebugger", "getVeType", 598, "InteractionLoggingDebugger.java")).t("Failed to parse tracking params");
            jrfVar = jrf.a;
        }
        return jrfVar.c;
    }

    public static String i(argn argnVar) {
        if (argnVar == null) {
            return null;
        }
        return k(a(argnVar), argnVar.f);
    }

    public static void j(String str, String str2) {
        new ager(" ").g(str, str2, "\nSee go/yt-il-debug-mode on how to address this issue.");
    }

    static String k(int i, int i2) {
        return "VE (" + i + ':' + i2 + ')';
    }

    public static String l(xhc xhcVar) {
        return k(xhcVar.a, 0);
    }

    private static final String p(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(i((argn) it.next()));
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public final boolean b(amby ambyVar) {
        return ((ambyVar.b & 2) == 0 || ambyVar.d.isEmpty()) ? false : true;
    }

    public final boolean c() {
        agfr agfrVar = this.e;
        return agfrVar != null ? ((Boolean) agfrVar.io()).booleanValue() : d();
    }

    public final boolean d() {
        float fNextFloat = c.nextFloat() * 100.0f;
        amuh amuhVar = this.d.b().n;
        if (amuhVar == null) {
            amuhVar = amuh.a;
        }
        amdz amdzVar = amuhVar.d;
        if (amdzVar == null) {
            amdzVar = amdz.a;
        }
        return fNextFloat >= amdzVar.h;
    }

    public final void e(argn argnVar, argn argnVar2, String str, xie xieVar) {
        if (c()) {
            return;
        }
        List<argn> listAsList = Arrays.asList(argnVar);
        HashMap map = new HashMap();
        map.put("client.params.parentVe", i(argnVar2));
        map.put("client.params.childVe", p(listAsList));
        if (TextUtils.isEmpty(str)) {
            j("INTERACTIONLOGGINGBUG->ATTACH_CHILD_MISSING_CSN", "parent_ve: " + i(argnVar2) + "child_ves: " + p(listAsList) + " event_context: " + xieVar.toString());
            f("INTERACTIONLOGGINGBUG->ATTACH_CHILD_MISSING_CSN", map);
            return;
        }
        Map map2 = this.a;
        if (map2.containsKey(str)) {
            xsc xscVar = (xsc) map2.get(str);
            map.put("client.params.pageVe", l((xhc) xscVar.b));
            if (!xscVar.g(argnVar2, "PARENT_VE_IN_ATTACH")) {
                zvp.c(zvn.b, zvm.m, xsc.e("PARENT_VE_IN_ATTACH"), map);
                return;
            }
            for (argn argnVar3 : listAsList) {
                if (!((xsc) map2.get(str)).f(argnVar3)) {
                    zvp.c(zvn.b, zvm.m, "INTERACTIONLOGGINGBUG->MULTIPLE_ATTACH", map);
                    a(argnVar3);
                }
            }
            return;
        }
        j("INTERACTIONLOGGINGBUG->ATTACH_CHILD_UNRESOLVED_CSN", "parent_ve: " + i(argnVar2) + "child_ves: " + p(listAsList) + " event_context: " + xieVar.toString());
        f("INTERACTIONLOGGINGBUG->ATTACH_CHILD_UNRESOLVED_CSN", map);
    }

    public final void f(String str, Map map) {
        zvp.c(zvn.b, zvm.m, str, map);
    }

    public final void g(amcc amccVar, xie xieVar) {
        if (c()) {
            return;
        }
        amec amecVarA = amec.a(amccVar.f);
        if (amecVarA == null) {
            amecVarA = amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_UNKNOWN;
        }
        amecVarA.ordinal();
        HashMap map = new HashMap();
        argn argnVar = amccVar.d;
        if (argnVar == null) {
            argnVar = argn.a;
        }
        map.put("client.params.ve", i(argnVar));
        if ((amccVar.b & 1) == 0 || amccVar.c.isEmpty()) {
            argn argnVar2 = amccVar.d;
            if (argnVar2 == null) {
                argnVar2 = argn.a;
            }
            j("INTERACTIONLOGGINGBUG->HIDE_MISSING_CSN", "ve: " + i(argnVar2) + " event_context: " + String.valueOf(xieVar));
            f("INTERACTIONLOGGINGBUG->HIDE_MISSING_CSN", map);
            return;
        }
        Map map2 = this.a;
        if (map2.containsKey(amccVar.c)) {
            xsc xscVar = (xsc) map2.get(amccVar.c);
            argn argnVar3 = amccVar.d;
            if (argnVar3 == null) {
                argnVar3 = argn.a;
            }
            o("HIDDEN", xscVar, argnVar3, map);
            return;
        }
        argn argnVar4 = amccVar.d;
        if (argnVar4 == null) {
            argnVar4 = argn.a;
        }
        j("INTERACTIONLOGGINGBUG->HIDE_UNRESOLVED_CSN", "ve: " + i(argnVar4) + " event_context: " + String.valueOf(xieVar));
        f("INTERACTIONLOGGINGBUG->HIDE_UNRESOLVED_CSN", map);
    }

    public final void h(amcd amcdVar, xie xieVar) {
        if (c()) {
            return;
        }
        amec amecVarA = amec.a(amcdVar.f);
        if (amecVarA == null) {
            amecVarA = amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_UNKNOWN;
        }
        amecVarA.ordinal();
        HashMap map = new HashMap();
        argn argnVar = amcdVar.d;
        if (argnVar == null) {
            argnVar = argn.a;
        }
        map.put("client.params.ve", i(argnVar));
        if ((amcdVar.b & 1) == 0 || amcdVar.c.isEmpty()) {
            argn argnVar2 = amcdVar.d;
            if (argnVar2 == null) {
                argnVar2 = argn.a;
            }
            j("INTERACTIONLOGGINGBUG->SHOW_MISSING_CSN", "ve: " + i(argnVar2) + " event_context: " + String.valueOf(xieVar));
            f("INTERACTIONLOGGINGBUG->SHOW_MISSING_CSN", map);
            return;
        }
        Map map2 = this.a;
        if (map2.containsKey(amcdVar.c)) {
            xsc xscVar = (xsc) map2.get(amcdVar.c);
            argn argnVar3 = amcdVar.d;
            if (argnVar3 == null) {
                argnVar3 = argn.a;
            }
            o("SHOWN", xscVar, argnVar3, map);
            return;
        }
        argn argnVar4 = amcdVar.d;
        if (argnVar4 == null) {
            argnVar4 = argn.a;
        }
        j("INTERACTIONLOGGINGBUG->SHOW_UNRESOLVED_CSN", "ve: " + i(argnVar4) + " event_context: " + String.valueOf(xieVar));
        f("INTERACTIONLOGGINGBUG->SHOW_UNRESOLVED_CSN", map);
    }

    public final void m(xhc xhcVar, argn argnVar) {
        k(xhcVar.a, 0);
        i(argnVar);
    }

    public final boolean n(String str, xsc xscVar, argn argnVar) {
        if (xscVar.g(argnVar, str)) {
            return false;
        }
        Object obj = xscVar.b;
        a(argnVar);
        return true;
    }

    public final void o(String str, xsc xscVar, argn argnVar, Map map) {
        if (n(str, xscVar, argnVar)) {
            String strE = xsc.e(str);
            xsc.e(str);
            m((xhc) xscVar.b, argnVar);
            f(strE, map);
        }
    }
}
