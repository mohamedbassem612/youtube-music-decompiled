package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ldh {
    final /* synthetic */ ldl a;
    private final String b;
    private final Bundle c;
    private Bundle d;

    public ldh(ldl ldlVar, String str) {
        this.a = ldlVar;
        kro.i(str);
        this.b = str;
        this.c = new Bundle();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d6 A[Catch: NumberFormatException | JSONException -> 0x00e2, NumberFormatException | JSONException -> 0x00e2, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x00e2, blocks: (B:9:0x0025, B:22:0x0057, B:22:0x0057, B:24:0x0069, B:24:0x0069, B:25:0x0072, B:25:0x0072, B:45:0x00d6, B:45:0x00d6, B:29:0x007f, B:29:0x007f, B:31:0x0091, B:31:0x0091, B:32:0x009a, B:32:0x009a, B:36:0x00a6, B:36:0x00a6, B:40:0x00b6, B:40:0x00b6, B:44:0x00ca, B:44:0x00ca), top: B:61:0x0025, outer: #1 }] */
    public final Bundle a() {
        if (this.d == null) {
            ldl ldlVar = this.a;
            String string = ldlVar.b().getString(this.b, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                int length = jSONArray2.length();
                                                long[] jArr = new long[length];
                                                for (int i2 = 0; i2 < length; i2++) {
                                                    jArr[i2] = jSONArray2.optLong(i2);
                                                }
                                                bundle.putLongArray(string2, jArr);
                                            } else {
                                                ldlVar.aT().c.b("Unrecognized persisted bundle type. Type", string3);
                                            }
                                        } else if (string3.equals("ia")) {
                                            JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                            int length2 = jSONArray3.length();
                                            int[] iArr = new int[length2];
                                            for (int i3 = 0; i3 < length2; i3++) {
                                                iArr[i3] = jSONArray3.optInt(i3);
                                            }
                                            bundle.putIntArray(string2, iArr);
                                        } else {
                                            ldlVar.aT().c.b("Unrecognized persisted bundle type. Type", string3);
                                        }
                                    } else if (string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        ldlVar.aT().c.b("Unrecognized persisted bundle type. Type", string3);
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    ldlVar.aT().c.b("Unrecognized persisted bundle type. Type", string3);
                                }
                            } else if (string3.equals("d")) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                ldlVar.aT().c.b("Unrecognized persisted bundle type. Type", string3);
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.a.aT().c.a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.d = bundle;
                } catch (JSONException unused2) {
                    this.a.aT().c.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.d == null) {
                this.d = this.c;
            }
        }
        Bundle bundle2 = this.d;
        if (bundle2 != null) {
            return new Bundle(bundle2);
        }
        throw new NullPointerException("null reference");
    }

    public final void b(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        ldl ldlVar = this.a;
        SharedPreferences.Editor editorEdit = ldlVar.b().edit();
        int size = bundle2.size();
        String str = this.b;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        if (obj instanceof String) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "d");
                        } else {
                            ldlVar.aT().c.b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.a.aT().c.b("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.d = bundle2;
    }
}
