package defpackage;

import com.google.cardboard.sdk.R;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xwp implements yeb {
    public xve a = null;
    private final String b;
    private final int c;

    public xwp(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.yeb
    public final void a(IOException iOException) {
        ((agrc) ((agrc) ((agrc) xwq.a.b()).j(iOException)).k("com/google/android/libraries/youtube/mdx/pairing/RealScreenInfoRetriever$ScreenInfoHttpResponseHandler", "handleException", 100, "RealScreenInfoRetriever.java")).w("Failed getting response from %s", this.b);
    }

    @Override // defpackage.yeb
    public final void b(tgo tgoVar) {
        JSONArray jSONArray;
        int i;
        int i2 = tgoVar.a;
        if (i2 != 200) {
            ((agrc) ((agrc) xwq.a.b()).k("com/google/android/libraries/youtube/mdx/pairing/RealScreenInfoRetriever$ScreenInfoHttpResponseHandler", "handleResponse", 73, "RealScreenInfoRetriever.java")).y("Got status of %d from %s", i2, this.b);
            return;
        }
        tgn tgnVar = tgoVar.d;
        if (tgnVar == null) {
            ((agrc) ((agrc) xwq.a.b()).k("com/google/android/libraries/youtube/mdx/pairing/RealScreenInfoRetriever$ScreenInfoHttpResponseHandler", "handleResponse", 79, "RealScreenInfoRetriever.java")).t("Body from response is null");
            return;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(tgnVar.d()).getJSONObject("screen");
                int i3 = this.c;
                xve xveVarA = null;
                if (jSONObject != null) {
                    try {
                        if (!jSONObject.has("accessType")) {
                            ((agrc) ((agrc) xwr.a.b()).k("com/google/android/libraries/youtube/mdx/pairing/ScreenInfoParser", "parse", 87, "ScreenInfoParser.java")).w("We don't have an access type for MDx screen: %s", jSONObject);
                        } else if (jSONObject.has("screenId") && jSONObject.has("deviceId")) {
                            String string = jSONObject.getString("name");
                            xvz xvzVar = new xvz(jSONObject.getString("screenId"));
                            xvg xvgVar = new xvg(jSONObject.getString("deviceId"));
                            xvh xvhVar = jSONObject.has("loungeToken") ? new xvh(jSONObject.getString("loungeToken"), i3) : null;
                            String strOptString = jSONObject.optString("clientName");
                            xwc xwcVar = !strOptString.isEmpty() ? new xwc(strOptString) : null;
                            agjz agjzVar = new agjz(4);
                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("mdxDiscoveryIds");
                            if (jSONArrayOptJSONArray != null) {
                                int i4 = 0;
                                while (i4 < jSONArrayOptJSONArray.length()) {
                                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i4);
                                    if (jSONObjectOptJSONObject != null) {
                                        jSONArray = jSONArrayOptJSONArray;
                                        String strOptString2 = jSONObjectOptJSONObject.optString("type");
                                        i = i4;
                                        String strOptString3 = jSONObjectOptJSONObject.optString("value");
                                        if (!strOptString2.isEmpty() && !strOptString3.isEmpty()) {
                                            xvo xvoVarA = xvo.a(strOptString2, strOptString3);
                                            if (xvoVarA != null) {
                                                agjzVar.h(xvoVarA);
                                            } else {
                                                ((agrc) ((agrc) xwr.a.b()).k("com/google/android/libraries/youtube/mdx/pairing/ScreenInfoParser", "parse", R.styleable.AppCompatTheme_windowMinWidthMajor, "ScreenInfoParser.java")).w("Invalid MdxDiscoveryIdType: %s", strOptString2);
                                            }
                                        }
                                    } else {
                                        jSONArray = jSONArrayOptJSONArray;
                                        i = i4;
                                    }
                                    i4 = i + 1;
                                    jSONArrayOptJSONArray = jSONArray;
                                }
                            }
                            agke agkeVarG = agjzVar.g();
                            int i5 = xve.i;
                            xvb xvbVar = new xvb();
                            xvbVar.e(new xvv(1, false));
                            xvbVar.f(xvzVar);
                            xvbVar.g(string);
                            xvbVar.c(xvhVar);
                            xvbVar.b(xvgVar);
                            xvbVar.d(agkeVarG);
                            if (xwcVar != null) {
                                xvbVar.b = xwcVar;
                                xvbVar.a = (byte) (xvbVar.a | 32);
                            }
                            xveVarA = xvbVar.a();
                        } else {
                            ((agrc) ((agrc) xwr.a.b()).k("com/google/android/libraries/youtube/mdx/pairing/ScreenInfoParser", "parse", 92, "ScreenInfoParser.java")).w("We got a permanent screen without a screen id: %s", jSONObject);
                        }
                    } catch (JSONException e) {
                        ((agrc) ((agrc) ((agrc) xwr.a.b()).j(e)).k("com/google/android/libraries/youtube/mdx/pairing/ScreenInfoParser", "parse", (char) 145, "ScreenInfoParser.java")).t("Error parsing screen ");
                    }
                }
                this.a = xveVarA;
            } catch (JSONException e2) {
                ((agrc) ((agrc) ((agrc) xwq.a.b()).j(e2)).k("com/google/android/libraries/youtube/mdx/pairing/RealScreenInfoRetriever$ScreenInfoHttpResponseHandler", "handleResponse", 94, "RealScreenInfoRetriever.java")).w("Error loading screen info from %s", this.b);
            }
        } catch (IOException | JSONException e3) {
            ((agrc) ((agrc) ((agrc) xwq.a.b()).j(e3)).k("com/google/android/libraries/youtube/mdx/pairing/RealScreenInfoRetriever$ScreenInfoHttpResponseHandler", "handleResponse", 87, "RealScreenInfoRetriever.java")).w("Error loading from %s", this.b);
        }
    }
}
