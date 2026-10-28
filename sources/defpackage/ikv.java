package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ikv extends awpk implements awqk {
    Object a;
    int b;
    int c;
    int d;
    /* synthetic */ Object e;
    final /* synthetic */ iky f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikv(iky ikyVar, awoq awoqVar) {
        super(2, awoqVar);
        this.f = ikyVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        ikv ikvVar = new ikv(this.f, awoqVar);
        ikvVar.e = obj;
        return ikvVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ikv) create((ild) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x02a1 A[Catch: Exception -> 0x02c5, CancellationException -> 0x02f0, all -> 0x0304, Merged into TryCatch #1 {all -> 0x0304, CancellationException -> 0x02f0, blocks: (B:5:0x0015, B:76:0x0232, B:78:0x0238, B:80:0x023c, B:82:0x0240, B:84:0x0247, B:87:0x0250, B:89:0x0254, B:91:0x025c, B:93:0x0263, B:96:0x026c, B:98:0x0270, B:100:0x0274, B:102:0x0278, B:104:0x027c, B:106:0x0280, B:107:0x0289, B:109:0x028f, B:111:0x029d, B:113:0x02a3, B:116:0x02ab, B:118:0x02b2, B:125:0x02c1, B:94:0x0268, B:85:0x024c, B:112:0x02a1, B:131:0x02ca, B:133:0x02f0, B:61:0x012f, B:62:0x014d, B:64:0x0153, B:66:0x016f, B:68:0x018c, B:69:0x019b, B:70:0x01ac, B:72:0x01ec, B:73:0x01f2), top: B:139:0x0009 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v25 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object ileVar;
        String str2;
        int i;
        List list;
        List list2;
        Object objAd;
        int i2;
        ?? r6;
        List arrayList;
        aiie aiieVar;
        almg almgVar;
        aiie aiieVar2;
        Object ilhVar = awox.a;
        String str3 = "PlaylistFilterSearchDataService.kt";
        try {
            try {
                if (this.d == 0) {
                    atqp.j(obj);
                    ild ildVar = (ild) this.e;
                    str2 = ildVar.a;
                    List list3 = ildVar.b;
                    String str4 = ildVar.c;
                    int i3 = ildVar.d;
                    boolean z = ildVar.e;
                    i = i3 == 0 ? 1 : 0;
                    if (!z) {
                        return ilf.a;
                    }
                    if (i == 0) {
                        this.f.j.d(Boolean.TRUE);
                    }
                    iky ikyVar = this.f;
                    if (list3.isEmpty()) {
                        list = (List) ikyVar.e.c();
                    } else {
                        Iterable iterable = (Iterable) ikyVar.e.c();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : iterable) {
                            List list4 = ((ilk) obj2).b;
                            if (list3.isEmpty()) {
                                list2 = list3;
                                arrayList2.add(obj2);
                            } else {
                                Iterator it = list3.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        String str5 = (String) it.next();
                                        if (!list4.isEmpty()) {
                                            Iterator it2 = list4.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    List list5 = list3;
                                                    if (awrc.n((String) it2.next(), str5, false)) {
                                                        list3 = list5;
                                                    } else {
                                                        list3 = list5;
                                                    }
                                                }
                                            }
                                        }
                                        list2 = list3;
                                    } else {
                                        list2 = list3;
                                        arrayList2.add(obj2);
                                    }
                                }
                            }
                            list3 = list2;
                        }
                        list = arrayList2;
                    }
                    ArrayList arrayList3 = new ArrayList(atqq.N(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((ilk) it3.next()).a);
                    }
                    if (arrayList3.isEmpty()) {
                        ikyVar.j.d(Boolean.FALSE);
                        return new ilh(str2);
                    }
                    int i4 = i3 * 20;
                    int iMin = Math.min(i4 + 20, arrayList3.size());
                    List listSubList = i4 < arrayList3.size() ? arrayList3.subList(i4, iMin) : awno.a;
                    if (listSubList.isEmpty()) {
                        ikyVar.j.d(Boolean.FALSE);
                        return i != 0 ? new ilh(str2) : (hmy) ikyVar.l.c();
                    }
                    listSubList.getClass();
                    wom womVar = ikyVar.b;
                    woo wooVarL = womVar.l();
                    wooVarL.J("FEplaylist_filter_search");
                    wooVarL.m();
                    ArrayList arrayList4 = new ArrayList(atqq.N(listSubList, 10));
                    Iterator it4 = listSubList.iterator();
                    while (it4.hasNext()) {
                        ill illVar = (ill) it4.next();
                        aihf aihfVarCreateBuilder = aoto.a.createBuilder();
                        aihfVarCreateBuilder.getClass();
                        String str6 = illVar.a;
                        aihfVarCreateBuilder.copyOnWrite();
                        Iterator it5 = it4;
                        aoto aotoVar = (aoto) aihfVarCreateBuilder.instance;
                        str = str3;
                        try {
                            aotoVar.b |= 1;
                            aotoVar.c = str6;
                            String str7 = illVar.b;
                            aihfVarCreateBuilder.copyOnWrite();
                            aoto aotoVar2 = (aoto) aihfVarCreateBuilder.instance;
                            aotoVar2.b |= 2;
                            aotoVar2.d = str7;
                            String str8 = illVar.c;
                            if (str8 != null) {
                                aihfVarCreateBuilder.copyOnWrite();
                                aoto aotoVar3 = (aoto) aihfVarCreateBuilder.instance;
                                aotoVar3.b |= 4;
                                aotoVar3.e = str8;
                            }
                            aihn aihnVarBuild = aihfVarCreateBuilder.build();
                            aihnVarBuild.getClass();
                            arrayList4.add((aoto) aihnVarBuild);
                            it4 = it5;
                            str3 = str;
                        } catch (Exception e) {
                            e = e;
                            ((agrc) ((agrc) iky.a.b()).j(e).k("com/google/android/apps/youtube/music/playlistfiltersearch/PlaylistFilterSearchDataService", "searchState$<anonymous>", 195, str)).t("Failed to send browse request");
                            ileVar = new ile(e);
                            ilhVar = ileVar;
                            return ilhVar;
                        }
                    }
                    aihf aihfVarCreateBuilder2 = ajmm.a.createBuilder();
                    aihfVarCreateBuilder2.getClass();
                    aihf aihfVarCreateBuilder3 = aotq.a.createBuilder();
                    aihfVarCreateBuilder3.getClass();
                    aihfVarCreateBuilder3.copyOnWrite();
                    aotq aotqVar = (aotq) aihfVarCreateBuilder3.instance;
                    aotqVar.b |= 1;
                    aotqVar.c = str4;
                    List listUnmodifiableList = DesugarCollections.unmodifiableList(aotqVar.d);
                    listUnmodifiableList.getClass();
                    new aikl(listUnmodifiableList);
                    aihfVarCreateBuilder3.copyOnWrite();
                    aotq aotqVar2 = (aotq) aihfVarCreateBuilder3.instance;
                    aiie aiieVar3 = aotqVar2.d;
                    if (!aiieVar3.c()) {
                        aotqVar2.d = aihn.mutableCopy(aiieVar3);
                    }
                    aifs.addAll(arrayList4, aotqVar2.d);
                    aihn aihnVarBuild2 = aihfVarCreateBuilder3.build();
                    aihnVarBuild2.getClass();
                    aihfVarCreateBuilder2.copyOnWrite();
                    ajmm ajmmVar = (ajmm) aihfVarCreateBuilder2.instance;
                    ajmmVar.c = (aotq) aihnVarBuild2;
                    ajmmVar.b = 12;
                    aihn aihnVarBuild3 = aihfVarCreateBuilder2.build();
                    aihnVarBuild3.getClass();
                    wooVarL.d = (ajmm) aihnVarBuild3;
                    ListenableFuture listenableFutureH = womVar.h(wooVarL, ikyVar.c);
                    this.e = str2;
                    this.a = arrayList3;
                    this.b = i;
                    this.c = iMin;
                    this.d = 1;
                    objAd = awrc.ad(listenableFutureH, this);
                    if (objAd != ilhVar) {
                        i2 = iMin;
                        r6 = arrayList3;
                    }
                    return ilhVar;
                }
                i2 = this.c;
                int i5 = this.b;
                Object obj3 = this.a;
                str2 = (String) this.e;
                atqp.j(obj);
                i = i5;
                objAd = obj;
                r6 = obj3;
                almd almdVar = ((wfy) objAd).a;
                if (almdVar == null) {
                    arrayList = awno.a;
                } else {
                    alme almeVar = almdVar.f;
                    if (almeVar == null) {
                        almeVar = alme.a;
                    }
                    if (almeVar == null) {
                        arrayList = awno.a;
                    } else {
                        almj almjVar = almeVar.b == 58173949 ? (almj) almeVar.c : almj.a;
                        if (almjVar == null || (aiieVar = almjVar.b) == null || (almgVar = (almg) atqq.Z(aiieVar)) == null) {
                            arrayList = awno.a;
                        } else {
                            aqjj aqjjVar = almgVar.b == 58174010 ? (aqjj) almgVar.c : aqjj.a;
                            if (aqjjVar == null) {
                                arrayList = awno.a;
                            } else {
                                aqjg aqjgVar = aqjjVar.i;
                                if (aqjgVar == null) {
                                    aqjgVar = aqjg.a;
                                }
                                if (aqjgVar == null) {
                                    arrayList = awno.a;
                                } else {
                                    apoq apoqVar = aqjgVar.c;
                                    if (apoqVar == null) {
                                        apoqVar = apoq.a;
                                    }
                                    if (apoqVar == null || (aiieVar2 = apoqVar.f) == null) {
                                        arrayList = awno.a;
                                    } else {
                                        arrayList = new ArrayList();
                                        for (Object obj4 : aiieVar2) {
                                            if ((((apox) obj4).c & 536870912) != 0) {
                                                arrayList.add(obj4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    if (i != 0) {
                        ilhVar = new ilh(str2);
                    } else {
                        i = 0;
                    }
                    return ilhVar;
                }
                ileVar = new ili(arrayList, 1 == i, i2 < r6.size());
            } catch (CancellationException unused) {
                ilhVar = (hmy) this.f.l.c();
            } finally {
                this.f.j.d(Boolean.FALSE);
            }
        } catch (Exception e2) {
            e = e2;
            str = "PlaylistFilterSearchDataService.kt";
        }
        ilhVar = ileVar;
        return ilhVar;
    }
}
