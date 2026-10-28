package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xwo {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/pairing/RealScreenAvailabilityRetriever");
    private final tft b;
    private final axfd c;

    public xwo(tft tftVar, axfd axfdVar) {
        this.b = tftVar;
        this.c = axfdVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xla] */
    public final Set a(Collection collection, tok tokVar) {
        tgf tgfVarA;
        String str;
        if (collection == null || collection.isEmpty()) {
            return agpr.a;
        }
        HashMap map = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            xve xveVar = (xve) it.next();
            xvh xvhVarA = xveVar.a();
            if (xvhVarA != null) {
                map.put(xvhVarA, xveVar);
            }
        }
        taq.c();
        axfd axfdVar = this.c;
        if (axfdVar.a.au()) {
            tge tgeVarB = tgf.b(String.valueOf(axfdVar.B()).concat("get_screen_availability"));
            try {
                JSONArray jSONArray = new JSONArray();
                for (xvh xvhVar : map.keySet()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("loungeToken", xvhVar.b);
                    switch (xvhVar.a) {
                        case 1:
                            str = "UNKNOWN";
                            break;
                        case 2:
                            str = "CAST_SCREEN_ID";
                            break;
                        case 3:
                            str = "CAST_LOUNGE_TOKEN";
                            break;
                        case 4:
                            str = "DIAL_PAIRING_CODE";
                            break;
                        case 5:
                            str = "DIAL_LOCAL_STORAGE";
                            break;
                        case 6:
                            str = "DIAL_ADDITIONAL_DATA_SCREEN_ID";
                            break;
                        case 7:
                            str = "DIAL_ADDITIONAL_DATA_LOUNGE_TOKEN";
                            break;
                        case 8:
                            str = "MANUAL_PAIRING_CODE";
                            break;
                        default:
                            str = "MANUAL_PAIRING_LOCAL_STORAGE";
                            break;
                    }
                    jSONObject.put("loungeTokenSource", str);
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("screens", jSONArray);
                Object obj = axfdVar.e;
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) obj).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.getState() != null) {
                    jSONObject2.put("networkStatus", activeNetworkInfo.getState().toString());
                }
                boolean zT = twm.t((Context) obj);
                String strB = txz.b((Context) obj);
                Object obj2 = axfdVar.d;
                jSONObject2.put("appName", yno.cM(zT, strB));
                tgeVarB.d = tgd.e(jSONObject2.toString().getBytes(StandardCharsets.UTF_8), "application/json");
            } catch (JSONException unused) {
            }
            if (((vxz) axfdVar.c).m(14, 45627566L)) {
                tgeVarB.d(tokVar);
            }
            tgfVarA = tgeVarB.a();
        } else {
            tgfVarA = axfdVar.A(map.keySet());
        }
        xwn xwnVar = new xwn(tgfVarA.a, map.keySet());
        yno.cL(this.b, tgfVarA, xwnVar);
        Set set = xwnVar.a;
        HashSet hashSet = new HashSet();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            xve xveVar2 = (xve) it2.next();
            xvh xvhVarA2 = xveVar2.a();
            if (xvhVarA2 != null && set.contains(xvhVarA2)) {
                hashSet.add(xveVar2);
            }
        }
        return hashSet;
    }

    public final boolean b(xvh xvhVar) {
        afx afxVar = new afx(0);
        afxVar.add(xvhVar);
        taq.c();
        tgf tgfVarA = this.c.A(afxVar);
        xwn xwnVar = new xwn(tgfVarA.a, afxVar);
        yno.cL(this.b, tgfVarA, xwnVar);
        Set set = xwnVar.a;
        if (set.isEmpty()) {
            return false;
        }
        return set.contains(xvhVar);
    }
}
