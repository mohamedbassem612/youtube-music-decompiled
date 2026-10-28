package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xwn implements yeb {
    public Set a = agpr.a;
    private final String b;
    private final Set c;

    public xwn(String str, Set set) {
        this.b = str;
        this.c = set;
    }

    @Override // defpackage.yeb
    public final void a(IOException iOException) {
        ((agrc) ((agrc) ((agrc) xwo.a.b()).j(iOException)).k("com/google/android/libraries/youtube/mdx/pairing/RealScreenAvailabilityRetriever$AvailabilityHttpResponseHandler", "handleException", 205, "RealScreenAvailabilityRetriever.java")).w("Error loading screen status from %s", this.b);
    }

    @Override // defpackage.yeb
    public final void b(tgo tgoVar) {
        Set set;
        xvh xvhVar;
        int i = tgoVar.a;
        if (i != 200) {
            ((agrc) ((agrc) xwo.a.c()).k("com/google/android/libraries/youtube/mdx/pairing/RealScreenAvailabilityRetriever$AvailabilityHttpResponseHandler", "handleResponse", 187, "RealScreenAvailabilityRetriever.java")).A("POST %s failed. Status code is: %d", this.b, i);
            return;
        }
        tgn tgnVar = tgoVar.d;
        if (tgnVar == null) {
            ((agrc) ((agrc) xwo.a.b()).k("com/google/android/libraries/youtube/mdx/pairing/RealScreenAvailabilityRetriever$AvailabilityHttpResponseHandler", "handleResponse", 192, "RealScreenAvailabilityRetriever.java")).w("Response body from %s is null", this.b);
            return;
        }
        try {
            String strD = tgnVar.d();
            agkj agkjVar = (agkj) Collection.EL.stream(this.c).collect(aghu.a(new xjh(13), new xjh(14)));
            try {
                JSONArray jSONArrayOptJSONArray = new JSONObject(strD).optJSONArray("screens");
                if (jSONArrayOptJSONArray == null) {
                    set = agpr.a;
                } else {
                    HashSet hashSet = new HashSet();
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        try {
                            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                            String strOptString = jSONObject.optString("status", "");
                            String strOptString2 = jSONObject.optString("loungeToken", "");
                            if (strOptString.equals("online") && !TextUtils.isEmpty(strOptString2) && (xvhVar = (xvh) agkjVar.get(strOptString2)) != null) {
                                hashSet.add(xvhVar);
                            }
                        } catch (JSONException unused) {
                            ((agrc) ((agrc) xwo.a.c()).k("com/google/android/libraries/youtube/mdx/pairing/RealScreenAvailabilityRetriever$ScreenStatusParser", "parse", 89, "RealScreenAvailabilityRetriever.java")).u("Error parsing screen %d", i2);
                        }
                    }
                    set = hashSet;
                }
            } catch (JSONException e) {
                ((agrc) ((agrc) ((agrc) xwo.a.b()).j(e)).k("com/google/android/libraries/youtube/mdx/pairing/RealScreenAvailabilityRetriever$ScreenStatusParser", "parse", '^', "RealScreenAvailabilityRetriever.java")).t("Error parsing screen status ");
                set = agpr.a;
            }
            this.a = set;
        } catch (IOException e2) {
            ((agrc) ((agrc) ((agrc) xwo.a.b()).j(e2)).k("com/google/android/libraries/youtube/mdx/pairing/RealScreenAvailabilityRetriever$AvailabilityHttpResponseHandler", "handleResponse", 199, "RealScreenAvailabilityRetriever.java")).w("Error loading screen status from %s", this.b);
        }
    }
}
