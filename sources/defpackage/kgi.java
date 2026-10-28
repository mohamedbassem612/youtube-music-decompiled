package defpackage;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kgi implements jzx {
    final /* synthetic */ kgj a;

    public kgi(kgj kgjVar) {
        this.a = kgjVar;
    }

    @Override // defpackage.jzx
    public final void a(String str) {
        kgp kgpVar = this.a.b;
        if (kgpVar != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getString("type").equals("CUSTOM_DATA")) {
                    kgpVar.a.e(jSONObject.optLong("requestId", -1L), 0, null);
                    jSONObject.getJSONObject("data");
                    qcb qcbVar = kgpVar.b;
                    if (qcbVar != null) {
                        Object obj = qcbVar.a;
                        if (((kgj) obj).b != null) {
                            if (!((kgj) obj).e()) {
                                kbp kbpVar = new kbp();
                                kbpVar.b = 2423;
                                ((kgj) obj).i(kbpVar.a(), false, false);
                                return;
                            }
                            ket ketVar = ((kgj) obj).f;
                            kgo kgoVar = kgo.a;
                            kyr kyrVar = ((kgk) ketVar).b;
                            Object obj2 = kyrVar.b;
                            Object obj3 = kyrVar.a;
                            khn.e();
                            xsc.au(kyrVar);
                            kgo kgoVar2 = ((kgk) ketVar).a;
                            synchronized (kgoVar2.i) {
                                Iterator it = kgoVar2.e.iterator();
                                while (it.hasNext()) {
                                    ((ket) it.next()).w(kyrVar);
                                }
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                kgpVar.c.d("Message is malformed (%s); ignoring: %s", e.getMessage(), str);
            }
        }
    }
}
