package defpackage;

import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kfd extends kfj {
    final /* synthetic */ kaw a;
    final /* synthetic */ kfm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfd(kfm kfmVar, kaw kawVar) {
        super(kfmVar, false);
        this.a = kawVar;
        this.b = kfmVar;
    }

    @Override // defpackage.kfj
    public final void b() {
        khs khsVarC = c();
        JSONObject jSONObject = new JSONObject();
        long j = this.a.a;
        khq khqVar = this.b.c;
        long jB = khqVar.b();
        try {
            jSONObject.put("requestId", jB);
            jSONObject.put("type", "SEEK");
            jSONObject.put("mediaSessionId", khqVar.h());
            Pattern pattern = khe.a;
            jSONObject.put("currentTime", j / 1000.0d);
        } catch (JSONException unused) {
        }
        khqVar.d(jSONObject.toString(), jB);
        khqVar.g = Long.valueOf(j);
        khqVar.m.a(jB, new kho(khqVar, khsVarC, 1));
    }
}
