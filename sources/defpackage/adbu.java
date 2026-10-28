package defpackage;

import android.text.TextUtils;
import java.util.EnumMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adbu implements awmd {
    private final vxu a;

    public adbu(vxu vxuVar) {
        this.a = vxuVar;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [adcj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [adci, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [adch, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [agex, java.lang.Object] */
    @Override // defpackage.awmd, defpackage.awmc
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final adce io() {
        agke agkeVar = adce.k;
        ajvu ajvuVarC = this.a.c();
        if (ajvuVarC == null) {
            return adce.v().a();
        }
        adca adcaVarV = adce.v();
        apjn apjnVar = ajvuVarC.k;
        if (apjnVar == null) {
            apjnVar = apjn.a;
        }
        String str = apjnVar.g;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                agke agkeVar2 = adce.l;
                int i = ((agpi) agkeVar2).d;
                for (int i2 = 0; i2 < i; i2++) {
                    abxv abxvVar = (abxv) agkeVar2.get(i2);
                    try {
                        abxvVar.O(jSONObject, adcaVarV, "");
                    } catch (adcg | JSONException e) {
                        zvp.b(zvn.b, zvm.x, "Error parsing ElementsLaunchConfig".concat((String) abxvVar.d), e);
                    }
                }
                EnumMap enumMap = new EnumMap(adcb.class);
                for (adcb adcbVar : adcb.values()) {
                    adcc adccVarA = adcd.a(adcbVar);
                    adce.w(adccVarA, jSONObject, null);
                    adce.w(adccVarA, jSONObject, adcbVar);
                    apjn apjnVar2 = ajvuVarC.k;
                    if (apjnVar2 == null) {
                        apjnVar2 = apjn.a;
                    }
                    if (apjnVar2.h) {
                        adccVarA.b(true);
                    }
                    adccVarA.c = adcbVar;
                    enumMap.put(adcbVar, adccVarA.a());
                }
                adcaVarV.b(enumMap);
            } catch (JSONException e2) {
                zvp.b(zvn.b, zvm.x, "Error parsing ElementsLaunchConfig", e2);
            }
        }
        apjn apjnVar3 = ajvuVarC.k;
        if (apjnVar3 == null) {
            apjnVar3 = apjn.a;
        }
        agke agkeVar3 = adce.k;
        int i3 = ((agpi) agkeVar3).d;
        for (int i4 = 0; i4 < i3; i4++) {
            axfd axfdVar = (axfd) agkeVar3.get(i4);
            try {
                if (axfdVar.c.a(apjnVar3)) {
                    Object objA = axfdVar.e.a(apjnVar3);
                    ?? r6 = axfdVar.d;
                    if (r6 != 0 && !r6.a(objA)) {
                        throw new adck("Value outside of constraint: ".concat(String.valueOf(String.valueOf(objA))));
                    }
                    axfdVar.a.a(adcaVarV, objA);
                }
            } catch (adck e3) {
                zvp.b(zvn.b, zvm.x, "Error parsing Mendel ElementsLaunchConfig", e3);
            }
        }
        return adcaVarV.a();
    }
}
