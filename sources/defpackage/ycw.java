package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ycw {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/transport/JsonUtils");

    public static JSONObject a(xvy xvyVar) {
        JSONObject jSONObject = new JSONObject();
        xvw xvwVar = new xvw(xvyVar);
        while (xvwVar.hasNext()) {
            xvx next = xvwVar.next();
            try {
                jSONObject.put(next.a, next.b);
            } catch (JSONException e) {
                ((agrc) ((agrc) ((agrc) a.c().i(agso.a, "MDX.com.google.android.libraries.youtube.mdx.transport.JsonUtils")).j(e)).k("com/google/android/libraries/youtube/mdx/transport/JsonUtils", "paramsToJson", ' ', "JsonUtils.java")).w("Error converting %s to JSON ", xvyVar);
            }
        }
        return jSONObject;
    }
}
