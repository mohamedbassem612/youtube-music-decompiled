package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vfw {
    public static final vfi a = new vfi();

    public static aigu a(aigu aiguVar, aigu aiguVar2) {
        return ahng.au(ahng.aw(aiguVar2).minus(ahng.aw(aiguVar)));
    }

    public static Optional b(Long l, Long l2, aufd aufdVar) {
        if (aufdVar.c != 3) {
            return Optional.empty();
        }
        aihf aihfVarCreateBuilder = aqpj.a.createBuilder();
        apsr apsrVar = aufdVar.g;
        if (apsrVar == null) {
            apsrVar = apsr.a;
        }
        String str = (apsrVar.b == 4 ? (apse) apsrVar.c : apse.a).c;
        aihfVarCreateBuilder.copyOnWrite();
        aqpj aqpjVar = (aqpj) aihfVarCreateBuilder.instance;
        str.getClass();
        aqpjVar.b |= 4;
        aqpjVar.d = str;
        aufh aufhVar = aufdVar.h;
        if (aufhVar == null) {
            aufhVar = aufh.a;
        }
        aigu aiguVar = aufhVar.d;
        if (aiguVar == null) {
            aiguVar = aigu.a;
        }
        aufh aufhVar2 = aufdVar.h;
        if (aufhVar2 == null) {
            aufhVar2 = aufh.a;
        }
        aigu aiguVar2 = aufhVar2.e;
        if (aiguVar2 == null) {
            aiguVar2 = aigu.a;
        }
        aigu aiguVarA = a(aiguVar, aiguVar2);
        aihfVarCreateBuilder.copyOnWrite();
        aqpj aqpjVar2 = (aqpj) aihfVarCreateBuilder.instance;
        aiguVarA.getClass();
        aqpjVar2.c = aiguVarA;
        aqpjVar2.b |= 2;
        if (l != null) {
            String string = l.toString();
            aihfVarCreateBuilder.copyOnWrite();
            aqpj aqpjVar3 = (aqpj) aihfVarCreateBuilder.instance;
            aqpjVar3.b |= 32;
            aqpjVar3.e = string;
        }
        if (l2 != null) {
            String string2 = l2.toString();
            aihfVarCreateBuilder.copyOnWrite();
            aqpj aqpjVar4 = (aqpj) aihfVarCreateBuilder.instance;
            aqpjVar4.b |= 64;
            aqpjVar4.f = string2;
        }
        return Optional.of((aqpj) aihfVarCreateBuilder.build());
    }
}
