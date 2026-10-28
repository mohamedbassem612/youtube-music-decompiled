package defpackage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kfa extends kfj {
    final /* synthetic */ int[] a;
    final /* synthetic */ kfm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfa(kfm kfmVar, int[] iArr) {
        super(kfmVar, true);
        this.a = iArr;
        this.b = kfmVar;
    }

    @Override // defpackage.kfj
    public final void b() {
        khs khsVarC = c();
        JSONObject jSONObject = new JSONObject();
        int[] iArr = this.a;
        khq khqVar = this.b.c;
        long jB = khqVar.b();
        try {
            jSONObject.put("requestId", jB);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", khqVar.h());
            JSONArray jSONArray = new JSONArray();
            for (int i : iArr) {
                jSONArray.put(i);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        khqVar.d(jSONObject.toString(), jB);
        khqVar.x.a(jB, khsVarC);
    }
}
