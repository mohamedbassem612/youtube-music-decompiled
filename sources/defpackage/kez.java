package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kez extends kfj {
    final /* synthetic */ kfm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kez(kfm kfmVar) {
        super(kfmVar, true);
        this.a = kfmVar;
    }

    @Override // defpackage.kfj
    public final void b() {
        khs khsVarC = c();
        JSONObject jSONObject = new JSONObject();
        khq khqVar = this.a.c;
        long jB = khqVar.b();
        try {
            jSONObject.put("requestId", jB);
            jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", khqVar.h());
        } catch (JSONException unused) {
        }
        khqVar.d(jSONObject.toString(), jB);
        khqVar.w.a(jB, khsVarC);
    }
}
