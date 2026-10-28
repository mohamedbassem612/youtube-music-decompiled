package defpackage;

import android.text.TextUtils;
import com.google.protobuf.MessageLite;
import j$.util.DesugarCollections;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xwf implements qro {
    @Override // defpackage.qro
    public final MessageLite a(tld tldVar, MessageLite messageLite) {
        String str = "wifi";
        String str2 = "";
        String strS = tldVar.s("youtube.mdx:dial_devices", "[]");
        aihf builder = ((atpa) messageLite).toBuilder();
        try {
            JSONArray jSONArray = new JSONArray(strS);
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has(str) && jSONObjectOptJSONObject.optLong("ts", 0L) > 0) {
                    String string = jSONObjectOptJSONObject.getString(str);
                    JSONArray jSONArray2 = jSONObjectOptJSONObject.getJSONArray("devices");
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        JSONObject jSONObject = jSONArray2.getJSONObject(i2);
                        String strOptString = jSONObject.optString("id", str2);
                        String strOptString2 = jSONObject.optString("manufacturer", str2);
                        String strOptString3 = jSONObject.optString("model_name", str2);
                        String strOptString4 = jSONObject.optString("name", str2);
                        String strOptString5 = jSONObject.optString("ssid", str2);
                        String strOptString6 = jSONObject.optString("mac", str2);
                        String str3 = str;
                        String str4 = str2;
                        int iOptInt = jSONObject.optInt("timeout", 0);
                        boolean zOptBoolean = jSONObject.optBoolean("wol");
                        JSONArray jSONArray3 = jSONArray;
                        int i3 = i;
                        String str5 = string;
                        int i4 = i2;
                        long jOptLong = jSONObject.optLong("ts", 0L);
                        atoy atoyVar = atoy.a;
                        strOptString.getClass();
                        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((atpa) builder.instance).b);
                        atoz atozVar = (mapUnmodifiableMap.containsKey(strOptString) ? (atoy) mapUnmodifiableMap.get(strOptString) : atoyVar).d;
                        if (atozVar == null) {
                            atozVar = atoz.a;
                        }
                        atpc atpcVar = atozVar.i;
                        if (atpcVar == null) {
                            atpcVar = atpc.a;
                        }
                        if (atpcVar.f <= jOptLong) {
                            if (!zOptBoolean || TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(str5) || TextUtils.isEmpty(strOptString6) || jOptLong <= 0) {
                                strOptString.getClass();
                                builder.copyOnWrite();
                                ((atpa) builder.instance).a().remove(strOptString);
                            } else {
                                aihf aihfVarCreateBuilder = atoyVar.createBuilder();
                                aihfVarCreateBuilder.copyOnWrite();
                                atoy atoyVar2 = (atoy) aihfVarCreateBuilder.instance;
                                strOptString.getClass();
                                atoyVar2.b |= 1;
                                atoyVar2.c = strOptString;
                                aihf aihfVarCreateBuilder2 = atoz.a.createBuilder();
                                aihfVarCreateBuilder2.copyOnWrite();
                                atoz atozVar2 = (atoz) aihfVarCreateBuilder2.instance;
                                strOptString2.getClass();
                                atozVar2.b |= 1;
                                atozVar2.c = strOptString2;
                                aihfVarCreateBuilder2.copyOnWrite();
                                atoz atozVar3 = (atoz) aihfVarCreateBuilder2.instance;
                                strOptString3.getClass();
                                atozVar3.b |= 2;
                                atozVar3.d = strOptString3;
                                aihfVarCreateBuilder2.copyOnWrite();
                                atoz atozVar4 = (atoz) aihfVarCreateBuilder2.instance;
                                strOptString4.getClass();
                                atozVar4.b |= 4;
                                atozVar4.e = strOptString4;
                                aihfVarCreateBuilder2.copyOnWrite();
                                atoz atozVar5 = (atoz) aihfVarCreateBuilder2.instance;
                                strOptString4.getClass();
                                atozVar5.b |= 8;
                                atozVar5.f = strOptString4;
                                aihf aihfVarCreateBuilder3 = atpc.a.createBuilder();
                                aihfVarCreateBuilder3.copyOnWrite();
                                atpc atpcVar2 = (atpc) aihfVarCreateBuilder3.instance;
                                strOptString5.getClass();
                                atpcVar2.b |= 1;
                                atpcVar2.c = strOptString5;
                                aihfVarCreateBuilder3.copyOnWrite();
                                atpc atpcVar3 = (atpc) aihfVarCreateBuilder3.instance;
                                strOptString6.getClass();
                                atpcVar3.b |= 2;
                                atpcVar3.d = strOptString6;
                                long j = iOptInt;
                                aihfVarCreateBuilder3.copyOnWrite();
                                atpc atpcVar4 = (atpc) aihfVarCreateBuilder3.instance;
                                atpcVar4.b |= 4;
                                atpcVar4.e = j;
                                aihfVarCreateBuilder3.copyOnWrite();
                                atpc atpcVar5 = (atpc) aihfVarCreateBuilder3.instance;
                                atpcVar5.b |= 8;
                                atpcVar5.f = jOptLong;
                                atpc atpcVar6 = (atpc) aihfVarCreateBuilder3.build();
                                aihfVarCreateBuilder2.copyOnWrite();
                                atoz atozVar6 = (atoz) aihfVarCreateBuilder2.instance;
                                atpcVar6.getClass();
                                atozVar6.i = atpcVar6;
                                atozVar6.b |= 64;
                                aihfVarCreateBuilder2.copyOnWrite();
                                atoz atozVar7 = (atoz) aihfVarCreateBuilder2.instance;
                                atozVar7.g = 2;
                                atozVar7.b |= 16;
                                atoz atozVar8 = (atoz) aihfVarCreateBuilder2.build();
                                aihfVarCreateBuilder.copyOnWrite();
                                atoy atoyVar3 = (atoy) aihfVarCreateBuilder.instance;
                                atozVar8.getClass();
                                atoyVar3.d = atozVar8;
                                atoyVar3.b |= 2;
                                builder.cI(strOptString, (atoy) aihfVarCreateBuilder.build());
                            }
                        }
                        i2 = i4 + 1;
                        str = str3;
                        str2 = str4;
                        jSONArray = jSONArray3;
                        i = i3;
                        string = str5;
                    }
                }
                i++;
                str = str;
                str2 = str2;
                jSONArray = jSONArray;
            }
        } catch (JSONException e) {
            e.printStackTrace();
            builder.clear();
        }
        return (atpa) builder.build();
    }
}
