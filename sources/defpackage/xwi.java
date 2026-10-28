package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xwi implements yeb {
    public Map a = Collections.EMPTY_MAP;
    private final String b;
    private final int c;

    public xwi(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.yeb
    public final void a(IOException iOException) {
        ((agrc) ((agrc) ((agrc) xwj.a.b()).j(iOException)).k("com/google/android/libraries/youtube/mdx/pairing/LoungeTokenBatchRetriever$PairingHttpResponseHandler", "handleException", 171, "LoungeTokenBatchRetriever.java")).w("Error posting to %s", this.b);
    }

    @Override // defpackage.yeb
    public final void b(tgo tgoVar) {
        Map map;
        JSONArray jSONArray;
        int i = tgoVar.a;
        tgn tgnVar = tgoVar.d;
        if (i != 200) {
            agrf agrfVar = xwj.a;
            ((agrc) ((agrc) agrfVar.c()).k("com/google/android/libraries/youtube/mdx/pairing/LoungeTokenBatchRetriever$PairingHttpResponseHandler", "handleResponse", 144, "LoungeTokenBatchRetriever.java")).A("POST %s failed. Response code is: %d", this.b, i);
            if (tgnVar == null) {
                ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/youtube/mdx/pairing/LoungeTokenBatchRetriever$PairingHttpResponseHandler", "handleResponse", 147, "LoungeTokenBatchRetriever.java")).t("Response body is null");
                return;
            }
            try {
                ((agrc) ((agrc) agrfVar.b()).k("com/google/android/libraries/youtube/mdx/pairing/LoungeTokenBatchRetriever$PairingHttpResponseHandler", "handleResponse", 152, "LoungeTokenBatchRetriever.java")).w("Error from server: %s", tgnVar.f());
                return;
            } catch (IOException e) {
                ((agrc) ((agrc) ((agrc) xwj.a.b()).j(e)).k("com/google/android/libraries/youtube/mdx/pairing/LoungeTokenBatchRetriever$PairingHttpResponseHandler", "handleResponse", 154, "LoungeTokenBatchRetriever.java")).w("Error posting to %s", this.b);
                return;
            }
        }
        if (tgnVar == null) {
            ((agrc) ((agrc) xwj.a.b()).k("com/google/android/libraries/youtube/mdx/pairing/LoungeTokenBatchRetriever$PairingHttpResponseHandler", "handleResponse", 159, "LoungeTokenBatchRetriever.java")).w("Response body is null from %s", this.b);
            return;
        }
        try {
            String strD = tgnVar.d();
            int i2 = this.c;
            try {
                JSONObject jSONObject = new JSONObject(strD);
                if (jSONObject.has("screens") && (jSONArray = jSONObject.getJSONArray("screens")) != null) {
                    HashMap map2 = new HashMap();
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                            if (jSONObject2.has("screenId") && jSONObject2.has("loungeToken")) {
                                map2.put(new xvz(jSONObject2.getString("screenId")), new xvh(jSONObject2.getString("loungeToken"), i2));
                            }
                        } catch (JSONException unused) {
                            ((agrc) ((agrc) xwj.a.c()).k("com/google/android/libraries/youtube/mdx/pairing/LoungeTokenBatchRetriever$LoungeTokensParser", "parse", 77, "LoungeTokenBatchRetriever.java")).u("Error parsing screen %d", i3);
                        }
                    }
                    map = map2;
                } else {
                    map = Collections.EMPTY_MAP;
                }
            } catch (JSONException e2) {
                ((agrc) ((agrc) ((agrc) xwj.a.b()).j(e2)).k("com/google/android/libraries/youtube/mdx/pairing/LoungeTokenBatchRetriever$LoungeTokensParser", "parse", 'R', "LoungeTokenBatchRetriever.java")).t("Error parsing screen status ");
                map = Collections.EMPTY_MAP;
            }
            this.a = map;
        } catch (IOException e3) {
            ((agrc) ((agrc) ((agrc) xwj.a.b()).j(e3)).k("com/google/android/libraries/youtube/mdx/pairing/LoungeTokenBatchRetriever$PairingHttpResponseHandler", "handleResponse", 165, "LoungeTokenBatchRetriever.java")).w("Error posting to %s", this.b);
        }
    }
}
