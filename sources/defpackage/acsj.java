package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acsj {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;

    public acsj(abvk abvkVar, abvn abvnVar, avmb avmbVar) {
        abvkVar.getClass();
        abvnVar.getClass();
        avmbVar.getClass();
        this.a = abvkVar;
        this.b = abvnVar;
        this.c = avmbVar;
        this.d = new avmm();
        this.e = new awkx();
        this.f = new acsd(false, false, null, 1, false, false, null);
    }

    public static final boolean a(acca accaVar) {
        return (accaVar == null || accaVar.g() || accaVar.q) ? false : true;
    }

    public static final String g(zwa zwaVar) {
        if (zwaVar == null || zwaVar.h()) {
            return "ANONYMOUS";
        }
        String strI = zwaVar.i();
        return strI.length() == 0 ? zwaVar.k() : strI;
    }

    public static boolean h(apef apefVar) {
        if ((apefVar.c & 1) != 0) {
            apji apjiVar = apefVar.d;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVar = apei.a;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = apefVar.d;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                apeh apehVar = (apeh) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                if ((apehVar.b & 16) != 0) {
                    apji apjiVar3 = apehVar.f;
                    if (apjiVar3 == null) {
                        apjiVar3 = apji.a;
                    }
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(akrs.a);
                    apjiVar3.c(aihlVarCheckIsLite3);
                    if (apjiVar3.j.n(aihlVarCheckIsLite3.d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    private final LinkedHashMap i(String str) {
        ?? r1 = this.d;
        Object linkedHashMap = r1.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            r1.put(str, linkedHashMap);
        }
        return (LinkedHashMap) linkedHashMap;
    }

    private final void j(LinkedHashMap linkedHashMap) {
        int iB = b();
        if (iB <= 0) {
            linkedHashMap.clear();
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (linkedHashMap.size() > iB && it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    private static final void k(LinkedHashMap linkedHashMap, String str) {
        acpw acpwVar = (acpw) linkedHashMap.remove(str);
        if (acpwVar == null) {
            acpwVar = new acpw(str, false, 0L);
        }
        linkedHashMap.put(str, acpwVar);
    }

    private static final void l(LinkedHashMap linkedHashMap, alqj alqjVar) {
        if ((alqjVar.b & 1) != 0) {
            ajwo ajwoVar = alqjVar.c;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            apfp apfpVarAa = aecm.aa(ajwoVar);
            if (apfpVarAa != null) {
                String str = apfpVarAa.o;
                str.getClass();
                if (str.length() > 0) {
                    String str2 = apfpVarAa.o;
                    str2.getClass();
                    k(linkedHashMap, str2);
                }
            }
        }
    }

    public final int b() {
        return (int) ((vxz) ((hno) this.b).m).c(2, 45813109L, 100L);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    public final Optional c(String str) {
        LinkedHashMap linkedHashMap;
        Optional optionalEmpty;
        synchronized (this.c) {
            if (b() <= 0 || (linkedHashMap = (LinkedHashMap) this.d.get(str)) == null || linkedHashMap.isEmpty()) {
                optionalEmpty = Optional.empty();
            } else {
                aihf aihfVarCreateBuilder = alqg.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                for (Object obj : linkedHashMap.values()) {
                    obj.getClass();
                    acpw acpwVar = (acpw) obj;
                    List listUnmodifiableList = DesugarCollections.unmodifiableList(((alqg) aihfVarCreateBuilder.instance).b);
                    listUnmodifiableList.getClass();
                    new aikl(listUnmodifiableList);
                    aihf aihfVarCreateBuilder2 = alqh.a.createBuilder();
                    aihfVarCreateBuilder2.getClass();
                    String str2 = acpwVar.a;
                    aihfVarCreateBuilder2.copyOnWrite();
                    alqh alqhVar = (alqh) aihfVarCreateBuilder2.instance;
                    alqhVar.b |= 1;
                    alqhVar.c = str2;
                    boolean z = acpwVar.b;
                    aihfVarCreateBuilder2.copyOnWrite();
                    alqh alqhVar2 = (alqh) aihfVarCreateBuilder2.instance;
                    alqhVar2.b |= 2;
                    alqhVar2.d = z;
                    long j = acpwVar.c;
                    aihfVarCreateBuilder2.copyOnWrite();
                    alqh alqhVar3 = (alqh) aihfVarCreateBuilder2.instance;
                    alqhVar3.b |= 4;
                    alqhVar3.e = j;
                    aihn aihnVarBuild = aihfVarCreateBuilder2.build();
                    aihnVarBuild.getClass();
                    alqh alqhVar4 = (alqh) aihnVarBuild;
                    aihfVarCreateBuilder.copyOnWrite();
                    alqg alqgVar = (alqg) aihfVarCreateBuilder.instance;
                    aiie aiieVar = alqgVar.b;
                    if (!aiieVar.c()) {
                        alqgVar.b = aihn.mutableCopy(aiieVar);
                    }
                    alqgVar.b.add(alqhVar4);
                }
                aihn aihnVarBuild2 = aihfVarCreateBuilder.build();
                aihnVarBuild2.getClass();
                optionalEmpty = Optional.of((alqg) aihnVarBuild2);
            }
        }
        return optionalEmpty;
    }

    public final void d(zwa zwaVar, String str, apfu apfuVar) {
        if (str == null || str.length() == 0 || b() <= 0) {
            return;
        }
        if (apfuVar == null || hno.bi(apfuVar)) {
            synchronized (this.c) {
                LinkedHashMap linkedHashMapI = i(g(zwaVar));
                k(linkedHashMapI, str);
                j(linkedHashMapI);
            }
        }
    }

    public final void e(zwa zwaVar, alql alqlVar) {
        synchronized (this.c) {
            LinkedHashMap linkedHashMapI = i(g(zwaVar));
            linkedHashMapI.size();
            for (alqj alqjVar : alqlVar.l) {
                alqjVar.getClass();
                l(linkedHashMapI, alqjVar);
            }
            for (alqj alqjVar2 : alqlVar.m) {
                alqjVar2.getClass();
                l(linkedHashMapI, alqjVar2);
            }
            linkedHashMapI.size();
            j(linkedHashMapI);
            linkedHashMapI.size();
        }
    }

    public final void f(zwa zwaVar, String str, long j) {
        synchronized (this.c) {
            LinkedHashMap linkedHashMapI = i(g(zwaVar));
            acpw acpwVar = (acpw) linkedHashMapI.get(str);
            if (acpwVar != null) {
                acpwVar.b = true;
                acpwVar.c = j;
            } else {
                linkedHashMapI.put(str, new acpw(str, true, j));
            }
            j(linkedHashMapI);
        }
    }

    public acsj(awut awutVar, hno hnoVar, mbc mbcVar) {
        awutVar.getClass();
        hnoVar.getClass();
        mbcVar.getClass();
        this.e = awutVar;
        this.b = hnoVar;
        this.a = mbcVar;
        this.c = new Object();
        this.d = new LinkedHashMap();
    }

    public acsj(awmd awmdVar, acyx acyxVar, xgm xgmVar, Context context, adif adifVar) {
        this.b = (acxt) awmdVar.io();
        this.c = acyxVar;
        this.e = xgmVar;
        this.d = context;
        this.f = Optional.empty();
        this.a = adifVar;
    }
}
