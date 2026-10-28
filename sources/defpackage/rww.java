package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rww {
    public static final /* synthetic */ int a = 0;
    private static final agke b;

    static {
        aihf aihfVarCreateBuilder = aitj.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aitj aitjVar = (aitj) aihfVarCreateBuilder.instance;
        aitjVar.b |= 2;
        aitjVar.d = 0.0f;
        aihfVarCreateBuilder.copyOnWrite();
        aitj aitjVar2 = (aitj) aihfVarCreateBuilder.instance;
        aitjVar2.c = 1;
        aitjVar2.b |= 1;
        b = agke.q((aitj) aihfVarCreateBuilder.build());
    }

    public static soi a(abnr abnrVar, alkd alkdVar) {
        int i = alkdVar.b;
        if (i == 133765738) {
            return g(abnrVar, (ajeq) alkdVar.c);
        }
        if (i == 156617590) {
            return h(abnrVar, (ajvx) alkdVar.c);
        }
        return i == 211734746 ? i(abnrVar, (akrv) alkdVar.c) : soi.a;
    }

    public static soi b(abnr abnrVar, apji apjiVar) {
        aihl aihlVar = ajer.a;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        apjiVar.c(aihlVarCheckIsLite);
        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            apjiVar.c(aihlVarCheckIsLite2);
            Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
            return g(abnrVar, (ajeq) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
        }
        aihl aihlVar2 = ajvz.a;
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
        apjiVar.c(aihlVarCheckIsLite3);
        if (apjiVar.j.n(aihlVarCheckIsLite3.d)) {
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
            apjiVar.c(aihlVarCheckIsLite4);
            Object objK2 = apjiVar.j.k(aihlVarCheckIsLite4.d);
            return h(abnrVar, (ajvx) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2)));
        }
        aihl aihlVar3 = akrw.a;
        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar3);
        apjiVar.c(aihlVarCheckIsLite5);
        if (!apjiVar.j.n(aihlVarCheckIsLite5.d)) {
            return soi.a;
        }
        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aihlVar3);
        apjiVar.c(aihlVarCheckIsLite6);
        Object objK3 = apjiVar.j.k(aihlVarCheckIsLite6.d);
        return i(abnrVar, (akrv) (objK3 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK3)));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    public static soi c(soi soiVar, long j) {
        soh sohVarA = soiVar.a();
        sohVarA.c(j);
        soi soiVarA = sohVarA.a();
        if (!k(soiVarA)) {
            return j(soiVarA);
        }
        agev agevVar = soiVarA.b;
        boolean z = (agevVar.g() && (agevVar.c() instanceof ajvx)) ? ((ajvx) agevVar.c()).i : false;
        if (soiVarA.h || z || soiVarA.k) {
            agke agkeVar = soiVarA.e;
            if (!agkeVar.isEmpty()) {
                int size = agkeVar.size();
                int i = 0;
                while (i < size) {
                    aitj aitjVar = (aitj) agkeVar.get(i);
                    i++;
                    if (j >= aitjVar.d) {
                        int i2 = soiVarA.l;
                        int i3 = aitjVar.c;
                        int iBc = a.bc(i3);
                        if (iBc == 0) {
                            iBc = 1;
                        }
                        if (i2 == iBc) {
                            return j(soiVarA);
                        }
                        int iBc2 = a.bc(i3);
                        boolean z2 = (iBc2 != 0 && iBc2 == 2) || i2 != 3;
                        soh sohVarA2 = soiVarA.a();
                        int iBc3 = a.bc(aitjVar.c);
                        if (iBc3 == 0) {
                            iBc3 = 1;
                        }
                        sohVarA2.l(iBc3);
                        sohVarA2.b(z2);
                        sohVarA2.j(true);
                        return sohVarA2.a();
                    }
                }
            } else if (soiVarA.l != 3) {
                soh sohVarA3 = soiVarA.a();
                sohVarA3.l(3);
                sohVarA3.b(false);
                sohVarA3.j(true);
                return sohVarA3.a();
            }
        } else if (soiVarA.l != 3) {
            soh sohVarA4 = soiVarA.a();
            sohVarA4.l(3);
            sohVarA4.b(false);
            sohVarA4.j(true);
            return sohVarA4.a();
        }
        return j(soiVarA);
    }

    public static soi d(soi soiVar, abnr abnrVar) {
        if (!k(soiVar)) {
            return j(soiVar);
        }
        boolean z = soiVar.h;
        boolean z2 = abnrVar == abnr.FULLSCREEN;
        if (z == z2) {
            return j(soiVar);
        }
        soh sohVarA = soiVar.a();
        sohVarA.d(z2);
        soi soiVarA = sohVarA.a();
        return c(soiVarA, soiVarA.f);
    }

    public static soi e(soi soiVar) {
        soh sohVarA = soiVar.a();
        sohVarA.g(true);
        return sohVarA.a();
    }

    public static boolean f(soi soiVar) {
        int i;
        return (soiVar.i || (i = soiVar.l) == 1 || i == 3 || soiVar.d.E()) ? false : true;
    }

    private static soi g(abnr abnrVar, ajeq ajeqVar) {
        soh sohVarB = soi.b();
        sohVarB.f(agev.i(ajeqVar));
        sohVarB.h(ajeqVar.d);
        sohVarB.k(agke.n(ajeqVar.c));
        sohVarB.d(abnrVar == abnr.FULLSCREEN);
        return sohVarB.a();
    }

    private static soi h(abnr abnrVar, ajvx ajvxVar) {
        soh sohVarB = soi.b();
        sohVarB.f(agev.i(ajvxVar));
        sohVarB.h(ajvxVar.f);
        sohVarB.k(agke.n(ajvxVar.e));
        sohVarB.d(abnrVar == abnr.FULLSCREEN);
        return sohVarB.a();
    }

    private static soi i(abnr abnrVar, akrv akrvVar) {
        soh sohVarB = soi.b();
        sohVarB.f(agev.i(akrvVar));
        sohVarB.h(akrvVar.b);
        sohVarB.k(b);
        sohVarB.d(abnrVar == abnr.FULLSCREEN);
        return sohVarB.a();
    }

    private static soi j(soi soiVar) {
        if (!soiVar.j) {
            return soiVar;
        }
        soh sohVarA = soiVar.a();
        sohVarA.j(false);
        return sohVarA.a();
    }

    private static boolean k(soi soiVar) {
        return soiVar.b.g();
    }
}
