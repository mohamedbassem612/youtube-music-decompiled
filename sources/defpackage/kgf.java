package defpackage;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kgf extends hna {
    public final /* synthetic */ kgj a;

    public kgf(kgj kgjVar) {
        this.a = kgjVar;
    }

    @Override // defpackage.hna
    public final void I() {
        khn khnVar = kgj.a;
        kgj kgjVar = this.a;
        kyr kyrVar = kgjVar.d;
        Object obj = kyrVar.b;
        Object obj2 = kyrVar.a;
        khn.e();
        int iF = kgjVar.f();
        jzz jzzVarA = kgjVar.a();
        if (jzzVarA != null) {
            final boolean z = iF == 2;
            kao kaoVar = new kao(0);
            kaoVar.a = 2;
            lpa lpaVarA = jzzVarA.a((String) obj2, null, kaoVar);
            lpaVarA.q(new low() { // from class: kge
                @Override // defpackage.low
                public final void e(Object obj3) {
                    kgf kgfVar = this.a;
                    kgj kgjVar2 = kgfVar.a;
                    kgjVar2.g(4);
                    if (z) {
                        ket ketVar = kgjVar2.f;
                        kgo kgoVar = kgo.a;
                        kgk kgkVar = (kgk) ketVar;
                        kyr kyrVar2 = kgkVar.b;
                        Object obj4 = kyrVar2.a;
                        Object obj5 = kyrVar2.b;
                        khn.e();
                        xsc.at(kyrVar2);
                        kgo kgoVar2 = kgkVar.a;
                        synchronized (kgoVar2.i) {
                            Iterator it = kgoVar2.e.iterator();
                            while (it.hasNext()) {
                                ((ket) it.next()).r(kyrVar2);
                            }
                        }
                    } else {
                        kgfVar.a.f.E();
                    }
                    kgj kgjVar3 = kgfVar.a;
                    JSONObject jSONObject = new JSONObject();
                    kgp kgpVar = kgjVar3.b;
                    long jB = kgpVar.b();
                    try {
                        jSONObject.put("requestId", jB);
                        jSONObject.put("type", "CUSTOM_DATA");
                        try {
                            kgpVar.d(jSONObject.toString(), jB);
                            kgpVar.a.a(jB, kgjVar3.c);
                        } catch (IllegalStateException e) {
                            kgpVar.c.d("Failed to send custom data request. %s", e.getMessage());
                        }
                    } catch (JSONException e2) {
                        kgpVar.c.d("Failed to create default custom data request message. %s", e2.getMessage());
                    }
                }
            });
            lpaVarA.p(new kea(this, 3));
        }
    }

    @Override // defpackage.hna
    public final void J(int i) {
        this.a.c(false, true, i);
    }

    @Override // defpackage.hna
    public final void K(int i) {
        khn khnVar = kgj.a;
        kyr kyrVar = this.a.d;
        Object obj = kyrVar.b;
        Object obj2 = kyrVar.a;
        khn.e();
    }

    @Override // defpackage.hna
    public final void L(int i) {
        kgj kgjVar = this.a;
        kgjVar.c(false, kgjVar.f() != 4, i);
    }
}
