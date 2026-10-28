package defpackage;

import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ui {
    public final tl a;
    public final Set b;
    public final Set c;
    private final String d;
    private final Set e;
    private final Set f;

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    public ui(String str, tl tlVar, Set set, eol eolVar, dep depVar) {
        this.d = str;
        this.a = tlVar;
        azs.l(set);
        this.e = set;
        List listA = tlVar.a();
        if (listA.isEmpty()) {
            this.b = set;
        } else {
            this.b = new afx(0);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (listA.contains(ed.f(str2))) {
                    this.b.add(str2);
                }
            }
        }
        Set<String> set2 = this.b;
        List list = tlVar.c;
        list = list == null ? Collections.EMPTY_LIST : list;
        afx afxVar = new afx(0);
        for (String str3 : set2) {
            Set setW = eolVar.w(str3);
            if (setW != null) {
                if (list.isEmpty()) {
                    afxVar.addAll(setW);
                } else {
                    for (int i = 0; i < list.size(); i++) {
                        String strConcat = String.valueOf(str3).concat(String.valueOf((String) list.get(i)));
                        if (setW.contains(strConcat)) {
                            afxVar.add(strConcat);
                        }
                    }
                }
            }
        }
        this.f = afxVar;
        if (afxVar.isEmpty()) {
            this.c = new afx(0);
            return;
        }
        Set<String> set3 = this.b;
        List list2 = tlVar.b;
        list2 = list2 == null ? Collections.EMPTY_LIST : list2;
        afx afxVar2 = new afx(0);
        for (String str4 : set3) {
            Set setKeySet = depVar.g(str4).keySet();
            if (list2.isEmpty()) {
                afxVar2.addAll(setKeySet);
            } else {
                afx afxVar3 = new afx(0);
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    String strConcat2 = String.valueOf(str4).concat(String.valueOf((String) list2.get(i2)));
                    if (setKeySet.contains(strConcat2)) {
                        afxVar3.add(strConcat2);
                    }
                }
                azs.l(str4);
                Map map = (Map) depVar.c.get(str4);
                map = map == null ? Collections.EMPTY_MAP : map;
                afx afxVar4 = new afx(0);
                ArrayDeque arrayDeque = new ArrayDeque(afxVar3);
                while (!arrayDeque.isEmpty()) {
                    String str5 = (String) arrayDeque.poll();
                    str5.getClass();
                    if (!afxVar4.contains(str5)) {
                        afxVar4.add(str5);
                        List list3 = (List) map.get(str5);
                        if (list3 != null) {
                            arrayDeque.addAll(list3);
                        }
                    }
                }
                afxVar2.addAll(afxVar4);
            }
        }
        this.c = afxVar2;
    }

    public final boolean a() {
        return this.f.isEmpty() || this.c.isEmpty();
    }

    public final lvx b() {
        lxq lxqVarS = lvx.DEFAULT_INSTANCE.s();
        lxqVarS.s();
        lvx lvxVar = (lvx) lxqVarS.a;
        lvxVar.bitField0_ |= 1;
        lvxVar.query_ = this.d;
        lxqVarS.s();
        lvx lvxVar2 = (lvx) lxqVarS.a;
        lye lyeVar = lvxVar2.namespaceFilters_;
        if (!lyeVar.c()) {
            lvxVar2.namespaceFilters_ = lxt.A(lyeVar);
        }
        Set set = this.f;
        lwm.l(set, lvxVar2.namespaceFilters_);
        Set set2 = this.c;
        lxqVarS.s();
        lvx lvxVar3 = (lvx) lxqVarS.a;
        lye lyeVar2 = lvxVar3.schemaTypeFilters_;
        if (!lyeVar2.c()) {
            lvxVar3.schemaTypeFilters_ = lxt.A(lyeVar2);
        }
        lwm.l(set2, lvxVar3.schemaTypeFilters_);
        lxqVarS.s();
        lvx lvxVar4 = (lvx) lxqVarS.a;
        lvxVar4.bitField0_ |= 16;
        lvxVar4.useReadOnlySearch_ = true;
        tl tlVar = this.a;
        lxqVarS.s();
        lvx lvxVar5 = (lvx) lxqVarS.a;
        lye lyeVar3 = lvxVar5.queryParameterStrings_;
        if (!lyeVar3.c()) {
            lvxVar5.queryParameterStrings_ = lxt.A(lyeVar3);
        }
        lwm.l(tlVar.l, lvxVar5.queryParameterStrings_);
        lxqVarS.s();
        lvx lvxVar6 = (lvx) lxqVarS.a;
        lvxVar6.bitField0_ |= 64;
        lvxVar6.embeddingQueryNprobe_ = 10;
        List list = tlVar.j;
        for (int i = 0; i < list.size(); i++) {
            luy luyVarB = uh.b((sp) list.get(i));
            lxqVarS.s();
            lvx lvxVar7 = (lvx) lxqVarS.a;
            luyVarB.getClass();
            lye lyeVar4 = lvxVar7.embeddingQueryVectors_;
            if (!lyeVar4.c()) {
                lvxVar7.embeddingQueryVectors_ = lxt.A(lyeVar4);
            }
            lvxVar7.embeddingQueryVectors_.add(luyVarB);
        }
        Bundle bundle = tlVar.d;
        Set<String> setKeySet = bundle.keySet();
        afv afvVar = new afv(setKeySet.size());
        for (String str : setKeySet) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            azs.l(stringArrayList);
            afvVar.put(str, stringArrayList);
        }
        for (Map.Entry entry : afvVar.entrySet()) {
            if (((String) entry.getKey()).equals("*")) {
                lwj lwjVarB = lwk.b();
                lwjVarB.d("*");
                lwjVarB.a((Iterable) entry.getValue());
                lxqVarS.F((lwk) lwjVarB.o());
            } else {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    String strConcat = String.valueOf((String) it.next()).concat(String.valueOf((String) entry.getKey()));
                    if (set2.contains(strConcat)) {
                        lwj lwjVarB2 = lwk.b();
                        lwjVarB2.d(strConcat);
                        lwjVarB2.a((Iterable) entry.getValue());
                        lxqVarS.F((lwk) lwjVarB2.o());
                    }
                }
            }
        }
        List list2 = tlVar.m;
        if (!list2.isEmpty()) {
            afw afwVar = new afw((afx) set);
            while (afwVar.hasNext()) {
                String str2 = (String) afwVar.next();
                lxq lxqVarS2 = lup.DEFAULT_INSTANCE.s();
                lxqVarS2.s();
                lup lupVar = (lup) lxqVarS2.a;
                str2.getClass();
                lupVar.bitField0_ |= 1;
                lupVar.namespace_ = str2;
                lxqVarS2.s();
                lup lupVar2 = (lup) lxqVarS2.a;
                lye lyeVar5 = lupVar2.documentUris_;
                if (!lyeVar5.c()) {
                    lupVar2.documentUris_ = lxt.A(lyeVar5);
                }
                lwm.l(list2, lupVar2.documentUris_);
                lup lupVar3 = (lup) lxqVarS2.o();
                lxqVarS.s();
                lvx lvxVar8 = (lvx) lxqVarS.a;
                lupVar3.getClass();
                lye lyeVar6 = lvxVar8.documentUriFilters_;
                if (!lyeVar6.c()) {
                    lvxVar8.documentUriFilters_ = lxt.A(lyeVar6);
                }
                lvxVar8.documentUriFilters_.add(lupVar3);
            }
        }
        int i2 = tlVar.a;
        int iAV = a.aV(i2);
        if (iAV == 0 || iAV == 1) {
            throw new IllegalArgumentException(a.bR(i2, "Invalid term match type: "));
        }
        lxqVarS.s();
        lvx lvxVar9 = (lvx) lxqVarS.a;
        lvxVar9.termMatchType_ = iAV - 1;
        lvxVar9.bitField0_ |= 2;
        int iAV2 = a.aV(1);
        if (iAV2 == 0 || iAV2 == 1) {
            throw new IllegalArgumentException("Invalid embedding search metric type: 1");
        }
        lxqVarS.s();
        lvx lvxVar10 = (lvx) lxqVarS.a;
        lvxVar10.embeddingQueryMetricType_ = iAV2 - 1;
        lvxVar10.bitField0_ |= 32;
        List list3 = tlVar.i;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list3.size(); i3++) {
            String str3 = (String) list3.get(i3);
            if (!sq.a.contains(str3)) {
                arrayList.add(str3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            String str4 = (String) arrayList.get(i4);
            if (str4.equals("LIST_FILTER_HAS_PROPERTY_FUNCTION")) {
                arrayList2.add("HAS_PROPERTY_FUNCTION");
            } else if (str4.equals("LIST_FILTER_MATCH_SCORE_EXPRESSION_FUNCTION")) {
                arrayList2.add("MATCH_SCORE_EXPRESSION_FUNCTION");
            } else {
                arrayList2.add(str4);
            }
        }
        lxqVarS.s();
        lvx lvxVar11 = (lvx) lxqVarS.a;
        lye lyeVar7 = lvxVar11.enabledFeatures_;
        if (!lyeVar7.c()) {
            lvxVar11.enabledFeatures_ = lxt.A(lyeVar7);
        }
        lwm.l(arrayList2, lvxVar11.enabledFeatures_);
        return (lvx) lxqVarS.o();
    }
}
