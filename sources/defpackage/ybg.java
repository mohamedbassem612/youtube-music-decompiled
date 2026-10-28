package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ybg implements awzd {
    final /* synthetic */ awzd a;
    final /* synthetic */ awtr b;

    public ybg(awzd awzdVar, awtr awtrVar) {
        this.a = awzdVar;
        this.b = awtrVar;
    }

    @Override // defpackage.awzd
    public final /* bridge */ /* synthetic */ Object emit(Object obj, awoq awoqVar) {
        Duration durationC;
        alpn alpnVar = (alpn) obj;
        akeh akehVar = alpnVar.e;
        if (akehVar == null) {
            akehVar = akeh.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apho.b);
        akehVar.c(aihlVarCheckIsLite);
        Object objK = akehVar.j.k(aihlVarCheckIsLite.d);
        Object objC = objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
        if (1 != (((apho) objC).c & 1)) {
            objC = null;
        }
        apho aphoVar = (apho) objC;
        String str = aphoVar != null ? aphoVar.d : null;
        if ((alpnVar.b & 32) != 0) {
            aqmx aqmxVar = alpnVar.f;
            if (aqmxVar == null) {
                aqmxVar = aqmx.a;
            }
            durationC = ahng.C(aqmxVar.c);
        } else {
            durationC = ybi.c;
        }
        this.b.c(new ybd(str, null, durationC));
        Object objEmit = this.a.emit(alpnVar, awoqVar);
        return objEmit != awox.a ? awmy.a : objEmit;
    }
}
