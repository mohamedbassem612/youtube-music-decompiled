package defpackage;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uzv implements val {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/effects/selection/EditorMultiEffectApplicationDelegate");
    public van b;
    private final aunn c;
    private final uys d;
    private final aunn e;
    private final aunn f;
    private avmn g;
    private final AtomicLong h = new AtomicLong(1);
    private final aaok i;

    public uzv(aunn aunnVar, uys uysVar, aunn aunnVar2, aaok aaokVar, aunn aunnVar3) {
        this.c = aunnVar;
        this.d = uysVar;
        this.e = aunnVar2;
        this.i = aaokVar;
        this.f = aunnVar3;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:49:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2  */
    private final List f(auhs auhsVar, List list, Map map) {
        Object next;
        String str;
        aiie<aufd> aiieVar = auhsVar.g;
        aiieVar.getClass();
        if (!aiieVar.isEmpty()) {
            for (aufd aufdVar : aiieVar) {
                aufdVar.getClass();
                if (yno.go(aufdVar, auhsVar)) {
                    break;
                }
            }
        }
        aaok aaokVar = this.i;
        if (aaokVar.N()) {
            j();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            aiie aiieVar2 = auhsVar.g;
            aiieVar2.getClass();
            Iterator<E> it2 = aiieVar2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                aufd aufdVar2 = (aufd) next;
                apsr apsrVar = aufdVar2.g;
                if (apsrVar == null) {
                    apsrVar = apsr.a;
                }
                if (apsrVar.b == 4) {
                    apsr apsrVar2 = aufdVar2.g;
                    if (apsrVar2 == null) {
                        apsrVar2 = apsr.a;
                    }
                    if (awrc.c((apsrVar2.b == 4 ? (apse) apsrVar2.c : apse.a).c, str2)) {
                        break;
                    }
                }
            }
            aufd aufdVar3 = (aufd) next;
            uzz uzzVar = (uzz) map.get(str2);
            if (aufdVar3 == null) {
                if (uzzVar != null) {
                    str = uzzVar.b;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
            } else {
                apsr apsrVar3 = aufdVar3.g;
                if (apsrVar3 == null) {
                    apsrVar3 = apsr.a;
                }
                if (apsrVar3 == null) {
                    if (uzzVar != null) {
                        str = uzzVar.b;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                } else {
                    apse apseVar = apsrVar3.b == 4 ? (apse) apsrVar3.c : apse.a;
                    if (apseVar == null || (str = apseVar.d) == null) {
                        if (uzzVar != null) {
                            str = uzzVar.b;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                    }
                }
            }
            uyr uyrVarA = this.d.a(str2);
            qvk qvkVarFs = uyrVarA != null ? yno.fs(uyrVarA.a, str2, str, uyrVarA.b) : null;
            if (aufdVar3 != null) {
                arrayList.add(new ury(h(aufdVar3, uyrVarA), qvkVarFs));
            } else if (uzzVar != null) {
                str2.getClass();
                aihf aihfVarCreateBuilder = ajfy.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                ajfy ajfyVar = (ajfy) aihfVarCreateBuilder.instance;
                ajfyVar.b |= 1;
                ajfyVar.c = str2;
                String str3 = uzzVar.b;
                str3.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                ajfy ajfyVar2 = (ajfy) aihfVarCreateBuilder.instance;
                ajfyVar2.b |= 2;
                ajfyVar2.d = str3;
                String str4 = uzzVar.c;
                str4.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                ajfy ajfyVar3 = (ajfy) aihfVarCreateBuilder.instance;
                ajfyVar3.b |= 8;
                ajfyVar3.e = str4;
                List listUnmodifiableList = DesugarCollections.unmodifiableList(ajfyVar3.g);
                listUnmodifiableList.getClass();
                new aikl(listUnmodifiableList);
                agke agkeVar = uzzVar.e;
                agkeVar.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                ajfy ajfyVar4 = (ajfy) aihfVarCreateBuilder.instance;
                aiie aiieVar3 = ajfyVar4.g;
                if (!aiieVar3.c()) {
                    ajfyVar4.g = aihn.mutableCopy(aiieVar3);
                }
                aifs.addAll(agkeVar, ajfyVar4.g);
                apvy apvyVar = uzzVar.g;
                if (apvyVar != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    ajfy ajfyVar5 = (ajfy) aihfVarCreateBuilder.instance;
                    ajfyVar5.f = apvyVar;
                    ajfyVar5.b |= 32;
                }
                aihn aihnVarBuild = aihfVarCreateBuilder.build();
                aihnVarBuild.getClass();
                ajfy ajfyVar6 = (ajfy) aihnVarBuild;
                aihf aihfVarCreateBuilder2 = ajfz.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                List listUnmodifiableList2 = DesugarCollections.unmodifiableList(((ajfz) aihfVarCreateBuilder2.instance).d);
                listUnmodifiableList2.getClass();
                new aikl(listUnmodifiableList2);
                aihfVarCreateBuilder2.copyOnWrite();
                ajfz ajfzVar = (ajfz) aihfVarCreateBuilder2.instance;
                aiie aiieVar4 = ajfzVar.d;
                if (!aiieVar4.c()) {
                    ajfzVar.d = aihn.mutableCopy(aiieVar4);
                }
                ajfzVar.d.add(ajfyVar6);
                String str5 = uzzVar.f;
                if (str5 != null) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    ajfz ajfzVar2 = (ajfz) aihfVarCreateBuilder2.instance;
                    ajfzVar2.c |= 1;
                    ajfzVar2.f = str5;
                }
                aihn aihnVarBuild2 = aihfVarCreateBuilder2.build();
                aihnVarBuild2.getClass();
                aihh aihhVar = (aihh) ajwo.a.createBuilder();
                aihhVar.getClass();
                aihl aihlVar = ajfz.b;
                aihlVar.getClass();
                aihhVar.e(aihlVar, (ajfz) aihnVarBuild2);
                ajwo ajwoVarW = atqp.W(aihhVar);
                if (aaokVar.N()) {
                    j();
                }
                aihf aihfVarCreateBuilder3 = aufd.a.createBuilder();
                aihfVarCreateBuilder3.getClass();
                usd usdVarB = ((ukp) this.c.io()).b();
                long jA = usdVarB != null ? usdVarB.a() : this.h.getAndIncrement();
                aihfVarCreateBuilder3.copyOnWrite();
                aufd aufdVar4 = (aufd) aihfVarCreateBuilder3.instance;
                aufdVar4.b |= 4;
                aufdVar4.i = jA;
                aihf aihfVarCreateBuilder4 = apsr.a.createBuilder();
                aihfVarCreateBuilder4.getClass();
                aihf aihfVarCreateBuilder5 = apse.a.createBuilder();
                aihfVarCreateBuilder5.getClass();
                aihfVarCreateBuilder5.copyOnWrite();
                apse apseVar2 = (apse) aihfVarCreateBuilder5.instance;
                apseVar2.b |= 1;
                apseVar2.c = str2;
                str3.getClass();
                aihfVarCreateBuilder5.copyOnWrite();
                apse apseVar3 = (apse) aihfVarCreateBuilder5.instance;
                apseVar3.b |= 2;
                apseVar3.d = str3;
                aihn aihnVarBuild3 = aihfVarCreateBuilder5.build();
                aihnVarBuild3.getClass();
                aihfVarCreateBuilder4.copyOnWrite();
                apsr apsrVar4 = (apsr) aihfVarCreateBuilder4.instance;
                apsrVar4.c = (apse) aihnVarBuild3;
                apsrVar4.b = 4;
                aihn aihnVarBuild4 = aihfVarCreateBuilder4.build();
                aihnVarBuild4.getClass();
                aihfVarCreateBuilder3.copyOnWrite();
                aufd aufdVar5 = (aufd) aihfVarCreateBuilder3.instance;
                aufdVar5.g = (apsr) aihnVarBuild4;
                aufdVar5.b |= 1;
                aihf aihfVarCreateBuilder6 = auff.a.createBuilder();
                aihfVarCreateBuilder6.getClass();
                aihfVarCreateBuilder6.copyOnWrite();
                auff auffVar = (auff) aihfVarCreateBuilder6.instance;
                auffVar.c = ajwoVarW;
                auffVar.b |= 1;
                aihn aihnVarBuild5 = aihfVarCreateBuilder6.build();
                aihnVarBuild5.getClass();
                aihfVarCreateBuilder3.copyOnWrite();
                aufd aufdVar6 = (aufd) aihfVarCreateBuilder3.instance;
                aufdVar6.f = (auff) aihnVarBuild5;
                aufdVar6.e = 1000;
                aihn aihnVarBuild6 = aihfVarCreateBuilder3.build();
                aihnVarBuild6.getClass();
                arrayList.add(new ury(h((aufd) aihnVarBuild6, uyrVarA), qvkVarFs));
            }
        }
        return arrayList;
    }

    private static final aufd h(aufd aufdVar, uyr uyrVar) {
        if (uyrVar == null || aufdVar.c == 2) {
            return aufdVar;
        }
        aihf aihfVarCreateBuilder = aufe.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        atte atteVar = uyrVar.e;
        if (atteVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aufe aufeVar = (aufe) aihfVarCreateBuilder.instance;
            aufeVar.c = atteVar;
            aufeVar.b |= 1;
        }
        ajhv ajhvVar = uyrVar.b;
        if (ajhvVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aufe aufeVar2 = (aufe) aihfVarCreateBuilder.instance;
            aufeVar2.d = ajhvVar;
            aufeVar2.b |= 2;
        }
        aihf builder = aufdVar.toBuilder();
        aufe aufeVar3 = (aufe) aihfVarCreateBuilder.build();
        builder.copyOnWrite();
        aufd aufdVar2 = (aufd) builder.instance;
        aufeVar3.getClass();
        aufdVar2.d = aufeVar3;
        aufdVar2.c = 2;
        aihn aihnVarBuild = builder.build();
        aihnVarBuild.getClass();
        return (aufd) aihnVarBuild;
    }

    private final void i(List list) {
        usd usdVarB;
        aunn aunnVar = this.c;
        auhs auhsVarC = ((ukp) aunnVar.io()).c();
        if (auhsVarC == null || (usdVarB = ((ukp) aunnVar.io()).b()) == null) {
            return;
        }
        try {
            utv utvVarA = new uug(aguu.T(list), 0).a(auhsVarC);
            if (!this.i.K()) {
                usdVarB.i(utvVarA);
                return;
            }
            Object objIo = this.e.io();
            objIo.getClass();
            urt urtVar = (urt) objIo;
            uug uugVar = new uug(utvVarA, 1);
            usd usdVarB2 = urtVar.b.b();
            if (usdVarB2 == null) {
                throw new IllegalStateException("Composition manager is not initialized.");
            }
            if (usdVarB2.k(uugVar)) {
                urtVar.m(null);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    private final void j() {
        boolean zN = this.i.N();
        aunn aunnVar = this.f;
        if (zN) {
        }
    }

    @Override // defpackage.val
    public final void a(String str, List list, Map map, Function0 function0) {
        auhs auhsVarC = ((ukp) this.c.io()).c();
        if (auhsVarC != null) {
            i(f(auhsVarC, list, map));
        }
    }

    @Override // defpackage.val
    public final void b(uzz uzzVar, List list, Map map, Function0 function0) {
        auhs auhsVarC = ((ukp) this.c.io()).c();
        if (auhsVarC != null) {
            i(f(auhsVarC, list, map));
        }
    }

    @Override // defpackage.val
    public final void c(Function0 function0) {
        agke agkeVar = agpi.a;
        agkeVar.getClass();
        i(agkeVar);
    }

    @Override // defpackage.val
    public final void d(String str, List list, Map map, Function0 function0) {
        auhs auhsVarC = ((ukp) this.c.io()).c();
        if (auhsVarC != null) {
            i(f(auhsVarC, list, map));
        }
    }

    @Override // defpackage.val
    public final void e() {
        Object obj = this.g;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
        }
    }

    @Override // defpackage.val
    public final void g(van vanVar) {
        this.b = vanVar;
        Object obj = this.g;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
        }
        this.g = ((ukp) this.c.io()).e().ag(new usn(new awqg() { // from class: uzu
            /* JADX WARN: Code duplicated, block: B:107:0x01d7 A[EDGE_INSN: B:107:0x01d7->B:108:0x01d8 BREAK  A[LOOP:1: B:82:0x0159->B:132:0x0159]] */
            @Override // defpackage.awqg
            public final Object invoke(Object obj2) {
                boolean z;
                String str;
                String str2;
                String str3;
                Optional optional = (Optional) obj2;
                optional.getClass();
                if (optional.isPresent()) {
                    uzv uzvVar = this.a;
                    if (uzvVar.b != null) {
                        aiie aiieVar = ((auhs) optional.get()).g;
                        aiieVar.getClass();
                        ArrayList arrayList = new ArrayList();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it = aiieVar.iterator();
                        while (true) {
                            z = true;
                            if (!it.hasNext()) {
                                break;
                            }
                            aufd aufdVar = (aufd) it.next();
                            apsr apsrVar = aufdVar.g;
                            if (apsrVar == null) {
                                apsrVar = apsr.a;
                            }
                            if (apsrVar.b == 4) {
                                apsr apsrVar2 = aufdVar.g;
                                if (apsrVar2 == null) {
                                    apsrVar2 = apsr.a;
                                }
                                String str4 = (apsrVar2.b == 4 ? (apse) apsrVar2.c : apse.a).c;
                                str4.getClass();
                                arrayList.add(str4);
                                aufdVar.getClass();
                                int i = aufdVar.e;
                                uzz uzzVarA = null;
                                if (i == 1000) {
                                    if (((i == 1000 ? (auff) aufdVar.f : auff.a).b & 1) != 0) {
                                        ajwo ajwoVar = (aufdVar.e == 1000 ? (auff) aufdVar.f : auff.a).c;
                                        if (ajwoVar == null) {
                                            ajwoVar = ajwo.a;
                                        }
                                        ajwoVar.getClass();
                                        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajfz.b);
                                        ajwoVar.c(aihlVarCheckIsLite);
                                        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                                            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajfz.b);
                                            ajwoVar.c(aihlVarCheckIsLite2);
                                            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                                            Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                                            objC.getClass();
                                            ajfz ajfzVar = (ajfz) objC;
                                            uzy uzyVarA = uzz.a();
                                            uzyVarA.b(str4);
                                            String str5 = ajfzVar.f;
                                            str5.getClass();
                                            if (!TextUtils.isEmpty(str5)) {
                                                uzyVarA.c = str5;
                                            }
                                            apsr apsrVar3 = aufdVar.g;
                                            if ((apsrVar3 == null ? apsr.a : apsrVar3).b == 4) {
                                                if (apsrVar3 == null) {
                                                    apsrVar3 = apsr.a;
                                                }
                                                str3 = (apsrVar3.b == 4 ? (apse) apsrVar3.c : apse.a).d;
                                                str3.getClass();
                                            } else {
                                                str3 = "";
                                            }
                                            if (!TextUtils.isEmpty(str3)) {
                                                uzyVarA.c(str3);
                                            }
                                            if (ajfzVar.d.size() > 0) {
                                                ajfy ajfyVar = (ajfy) ajfzVar.d.get(0);
                                                ajfyVar.getClass();
                                                uzyVarA.e(ajfyVar.g);
                                                if ((ajfyVar.b & 32) != 0) {
                                                    apvy apvyVar = ajfyVar.f;
                                                    if (apvyVar == null) {
                                                        apvyVar = apvy.a;
                                                    }
                                                    uzyVarA.d = apvyVar;
                                                }
                                                if ((ajfyVar.b & 8) != 0) {
                                                    uzyVarA.d(ajfyVar.e);
                                                }
                                            }
                                            uzzVarA = uzyVarA.a();
                                        }
                                    }
                                }
                                if (uzzVarA != null) {
                                    linkedHashMap.put(str4, uzzVarA);
                                }
                            }
                        }
                        van vanVar2 = uzvVar.b;
                        if (vanVar2 != null) {
                            if (vanVar2.c.a() != vbd.c) {
                                z = false;
                                break;
                            }
                            agke agkeVarM = vanVar2.g.M(vbd.b);
                            agkeVarM.getClass();
                            if (arrayList.isEmpty()) {
                                z = false;
                                break;
                            }
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z = false;
                                    break;
                                }
                                uzz uzzVar = (uzz) linkedHashMap.get((String) it2.next());
                                if (uzzVar != null && (str = uzzVar.f) != null && atqq.ay(agkeVarM, str)) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj3 : arrayList) {
                                        uzz uzzVar2 = (uzz) linkedHashMap.get((String) obj3);
                                        if (uzzVar2 == null || (str2 = uzzVar2.f) == null || !atqq.ay(agkeVarM, str2)) {
                                            arrayList2.add(obj3);
                                        }
                                    }
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        if (arrayList2.contains((String) entry.getKey())) {
                                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    linkedHashMap = linkedHashMap2;
                                    arrayList = arrayList2;
                                    break;
                                }
                            }
                            synchronized (vanVar2.d) {
                                ArrayList arrayList3 = vanVar2.e;
                                arrayList3.clear();
                                arrayList3.addAll(arrayList);
                                HashMap map = vanVar2.f;
                                map.clear();
                                map.putAll(linkedHashMap);
                                vanVar2.l(arrayList3);
                            }
                            if (z) {
                                vanVar2.b.d("", arrayList, linkedHashMap, new aoh(14));
                            }
                        }
                    }
                }
                return awmy.a;
            }
        }, 14), new usn(new uhd(4), 15));
    }
}
