package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lbo extends lfo {
    private String a;
    private Set b;
    private Map c;
    private Long d;
    private Long e;

    private final lbj c(Integer num) {
        if (this.c.containsKey(num)) {
            return (lbj) this.c.get(num);
        }
        lbj lbjVar = new lbj(this, this.a);
        this.c.put(num, lbjVar);
        return lbjVar;
    }

    private final boolean d(int i, int i2) {
        lbj lbjVar = (lbj) this.c.get(Integer.valueOf(i));
        if (lbjVar == null) {
            return false;
        }
        return lbjVar.c.get(i2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0235  */
    /* JADX WARN: Code duplicated, block: B:103:0x023d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0248  */
    /* JADX WARN: Code duplicated, block: B:111:0x0274  */
    /* JADX WARN: Code duplicated, block: B:114:0x0285 A[Catch: SQLiteException -> 0x02ac, all -> 0x03e3, TryCatch #1 {all -> 0x03e3, blocks: (B:109:0x026e, B:112:0x0275, B:114:0x0285, B:116:0x0290, B:121:0x02a7, B:133:0x02b8), top: B:469:0x0262 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x028e  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02a7 A[Catch: SQLiteException -> 0x02ac, all -> 0x03e3, TRY_LEAVE, TryCatch #1 {all -> 0x03e3, blocks: (B:109:0x026e, B:112:0x0275, B:114:0x0285, B:116:0x0290, B:121:0x02a7, B:133:0x02b8), top: B:469:0x0262 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x02cb A[PHI: r0 r2
      0x02cb: PHI (r0v154 java.util.Map) = (r0v140 java.util.Map), (r0v156 java.util.Map), (r0v134 java.util.Map) binds: [B:134:0x02c9, B:122:0x02a9, B:119:0x02a4] A[DONT_GENERATE, DONT_INLINE]
      0x02cb: PHI (r2v39 android.database.Cursor) = (r2v37 android.database.Cursor), (r2v41 android.database.Cursor), (r2v41 android.database.Cursor) binds: [B:134:0x02c9, B:122:0x02a9, B:119:0x02a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:138:0x02df  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:143:0x0304  */
    /* JADX WARN: Code duplicated, block: B:170:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:174:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:176:0x041a  */
    /* JADX WARN: Code duplicated, block: B:181:0x042e  */
    /* JADX WARN: Code duplicated, block: B:185:0x044e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0455  */
    /* JADX WARN: Code duplicated, block: B:191:0x046e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0482  */
    /* JADX WARN: Code duplicated, block: B:202:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:205:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:207:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:209:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:210:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:215:0x0506 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x057e  */
    /* JADX WARN: Code duplicated, block: B:244:0x0592  */
    /* JADX WARN: Code duplicated, block: B:247:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:251:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:252:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:312:0x074b  */
    /* JADX WARN: Code duplicated, block: B:323:0x0773  */
    /* JADX WARN: Code duplicated, block: B:329:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:331:0x07d2 A[LOOP:5: B:327:0x079b->B:331:0x07d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:335:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:340:0x0820 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:393:0x090f  */
    /* JADX WARN: Code duplicated, block: B:517:0x05b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x0646 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:0x05a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x05a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x078f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:0x0785 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x07ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:0x07e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x03d5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:570:0x055f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x0460 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x043e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x016d  */
    /* JADX WARN: Code duplicated, block: B:583:0x0490 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:0x047c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x01f7 A[EDGE_INSN: B:596:0x01f7->B:80:0x01f7 BREAK  A[LOOP:20: B:69:0x01b2->B:83:0x01fe], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x01a1 A[Catch: SQLiteException -> 0x0208, all -> 0x057a, TRY_LEAVE, TryCatch #17 {all -> 0x057a, blocks: (B:62:0x019b, B:64:0x01a1, B:68:0x01ad, B:69:0x01b2, B:70:0x01bb, B:71:0x01cd, B:78:0x01f1, B:73:0x01da, B:77:0x01e6, B:95:0x0218), top: B:487:0x0185 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ad A[Catch: SQLiteException -> 0x0208, all -> 0x057a, TRY_ENTER, TryCatch #17 {all -> 0x057a, blocks: (B:62:0x019b, B:64:0x01a1, B:68:0x01ad, B:69:0x01b2, B:70:0x01bb, B:71:0x01cd, B:78:0x01f1, B:73:0x01da, B:77:0x01e6, B:95:0x0218), top: B:487:0x0185 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fe A[LOOP:20: B:69:0x01b2->B:83:0x01fe, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v44, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    final List a(String str, List list, List list2, Long l, Long l2, boolean z) throws Throwable {
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        int i3;
        int i4;
        String string;
        Cursor cursor;
        Cursor cursor2;
        lbk lbkVar;
        Iterator it;
        lin linVar;
        lin linVarA;
        lgp lgpVarV;
        String str5;
        String str6;
        lca lcaVarJ;
        lca lcaVar;
        Iterator it2;
        lin linVar2;
        String str7;
        int iIntValue;
        Iterator it3;
        boolean zD;
        Map map;
        String str8;
        afv afvVar;
        lca lcaVar2;
        long j;
        lbl lblVar;
        Cursor cursor3;
        Cursor cursor4;
        List arrayList;
        boolean z2;
        Object obj;
        Map map2;
        Object obj2;
        lgp lgpVarV2;
        String str9;
        ?? r8;
        boolean z3;
        Cursor cursorQuery;
        Map map3;
        boolean z4;
        Map map4;
        lit litVar;
        BitSet bitSet;
        BitSet bitSet2;
        afv afvVar2;
        List<lht> list3;
        int i5;
        String str10;
        Iterator it4;
        liu liuVar;
        Iterator it5;
        lim limVar;
        Long lValueOf;
        lgp lgpVarV3;
        String str11;
        Map afvVar3;
        ?? r9;
        Cursor cursorRawQuery;
        afv afvVar4;
        Iterator it6;
        Integer num;
        lit litVar2;
        List list4;
        Map map5;
        Integer numValueOf;
        List list5;
        List arrayList2;
        afv afvVar5;
        int i6;
        String str12;
        Cursor cursorQuery2;
        List arrayList3;
        kro.i(str);
        kro.l(list);
        kro.l(list2);
        this.a = str;
        this.b = new HashSet();
        this.c = new afv();
        this.d = l;
        this.e = l2;
        ?? r10 = 0;
        String[] strArr = null;
        String str13 = "Failed to merge filter. appId";
        String str14 = "current_results";
        String str15 = "Database error querying filters. appId";
        int i7 = 0;
        int i8 = 1;
        if (G().F(null, lcl.bp)) {
            str2 = "Failed to merge filter. appId";
            str3 = "current_results";
            str4 = "Database error querying filters. appId";
            i = 2;
        } else {
            Iterator it7 = list.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    z2 = false;
                    break;
                }
                if ("_s".equals(((lin) it7.next()).d)) {
                    z2 = true;
                    break;
                }
            }
            ausi.c();
            boolean zF = G().F(this.a, lcl.aD);
            ausi.c();
            lbt lbtVarG = G();
            String str16 = this.a;
            adam adamVar = lcl.aC;
            boolean zF2 = lbtVarG.F(str16, adamVar);
            if (z2) {
                lgp lgpVarV4 = v();
                String str17 = this.a;
                lgpVarV4.w();
                lgpVarV4.o();
                kro.i(str17);
                ContentValues contentValues = new ContentValues();
                i = 2;
                contentValues.put("current_session_count", (Integer) 0);
                try {
                    strArr = new String[]{str17};
                    lgpVarV4.e().update("events", contentValues, "app_id = ?", strArr);
                    obj = str17;
                    r10 = strArr;
                } catch (SQLiteException e) {
                    lcx lcxVar = lgpVarV4.aT().c;
                    Object objA = lcz.a(str17);
                    lcxVar.c("Error resetting session-scoped event counts. appId", objA, e);
                    obj = objA;
                    r10 = strArr;
                }
            } else {
                i = 2;
                obj = adamVar;
            }
            Map map6 = Collections.EMPTY_MAP;
            Object obj3 = obj;
            obj3 = obj;
            if (zF2 && zF) {
                lgp lgpVarV5 = v();
                str12 = this.a;
                kro.i(str12);
                afv afvVar6 = new afv();
                try {
                    try {
                        cursorQuery2 = lgpVarV5.e().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str12}, null, null, null);
                        try {
                            if (cursorQuery2.moveToFirst()) {
                                while (true) {
                                    try {
                                        lht lhtVar = (lht) ((aihf) lfx.l(lht.a.createBuilder(), cursorQuery2.getBlob(i8))).build();
                                        if ((lhtVar.b & 8) != 0) {
                                            Integer numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                            List list6 = (List) afvVar6.get(numValueOf2);
                                            if (list6 == null) {
                                                arrayList3 = new ArrayList();
                                                afvVar6.put(numValueOf2, arrayList3);
                                            } else {
                                                arrayList3 = list6;
                                            }
                                            arrayList3.add(lhtVar);
                                        }
                                    } catch (IOException e2) {
                                        lgpVarV5.aT().c.c("Failed to merge filter. appId", lcz.a(str12), e2);
                                    }
                                    if (!cursorQuery2.moveToNext()) {
                                        break;
                                    }
                                    i8 = 1;
                                }
                                if (cursorQuery2 != null) {
                                    cursorQuery2.close();
                                }
                                map2 = afvVar6;
                                obj2 = str12;
                            } else {
                                map6 = Collections.EMPTY_MAP;
                                if (cursorQuery2 != null) {
                                    obj3 = str12;
                                    cursorQuery2.close();
                                    obj3 = str12;
                                }
                                obj3 = str12;
                                map2 = map6;
                                obj2 = obj3;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            lgpVarV5.aT().c.c("Database error querying filters. appId", lcz.a(str12), e);
                            map6 = Collections.EMPTY_MAP;
                            obj3 = str12;
                            if (cursorQuery2 != null) {
                            }
                            obj3 = str12;
                            map2 = map6;
                            obj2 = obj3;
                            lgpVarV2 = v();
                            str9 = this.a;
                            lgpVarV2.w();
                            lgpVarV2.o();
                            kro.i(str9);
                            try {
                                cursorQuery = lgpVarV2.e().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str9}, null, null, null);
                                try {
                                    if (cursorQuery.moveToFirst()) {
                                        afvVar5 = new afv();
                                        z3 = z2;
                                        while (true) {
                                            i6 = cursorQuery.getInt(i7);
                                            try {
                                                afvVar5.put(Integer.valueOf(i6), (lit) ((aihf) lfx.l(lit.a.createBuilder(), cursorQuery.getBlob(1))).build());
                                            } catch (IOException e4) {
                                                lgpVarV2.aT().c.d("Failed to merge filter results. appId, audienceId, error", lcz.a(str9), Integer.valueOf(i6), e4);
                                            }
                                            try {
                                                if (!cursorQuery.moveToNext()) {
                                                    break;
                                                }
                                                lgpVarV2 = lgpVarV2;
                                                z3 = z3 ? 1 : 0;
                                                i7 = 0;
                                            } catch (SQLiteException e5) {
                                                e = e5;
                                                lgpVarV2.aT().c.c("Database error querying filter results. appId", lcz.a(str9), e);
                                                Map map7 = Collections.EMPTY_MAP;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                map3 = map7;
                                                z4 = z3;
                                            }
                                        }
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        map3 = afvVar5;
                                        z4 = z3;
                                    } else {
                                        Map map8 = Collections.EMPTY_MAP;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        map3 = map8;
                                        z4 = z2 ? 1 : 0;
                                    }
                                } catch (SQLiteException e6) {
                                    e = e6;
                                    lgpVarV2 = lgpVarV2;
                                    z3 = z2 ? 1 : 0;
                                }
                                if (map3.isEmpty()) {
                                    str2 = "Failed to merge filter. appId";
                                    str3 = "current_results";
                                } else {
                                    HashSet<Integer> hashSet = new HashSet(map3.keySet());
                                    if (z4) {
                                        String str18 = this.a;
                                        lgpVarV3 = v();
                                        str11 = this.a;
                                        lgpVarV3.w();
                                        lgpVarV3.o();
                                        kro.i(str11);
                                        afvVar3 = new afv();
                                        try {
                                            try {
                                                cursorRawQuery = lgpVarV3.e().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str11, str11});
                                                try {
                                                    if (cursorRawQuery.moveToFirst()) {
                                                        do {
                                                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                            list5 = (List) afvVar3.get(numValueOf);
                                                            if (list5 == null) {
                                                                arrayList2 = new ArrayList();
                                                                afvVar3.put(numValueOf, arrayList2);
                                                            } else {
                                                                arrayList2 = list5;
                                                            }
                                                            arrayList2.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                        } while (cursorRawQuery.moveToNext());
                                                        if (cursorRawQuery != null) {
                                                            cursorRawQuery.close();
                                                        }
                                                    } else {
                                                        afvVar3 = Collections.EMPTY_MAP;
                                                        if (cursorRawQuery != null) {
                                                            cursorRawQuery.close();
                                                        }
                                                    }
                                                } catch (SQLiteException e7) {
                                                    e = e7;
                                                    lgpVarV3.aT().c.c("Database error querying scoped filters. appId", lcz.a(str11), e);
                                                    afvVar3 = Collections.EMPTY_MAP;
                                                    if (cursorRawQuery != null) {
                                                    }
                                                    kro.i(str18);
                                                    kro.l(map3);
                                                    afvVar4 = new afv();
                                                    if (!map3.isEmpty()) {
                                                        it6 = map3.keySet().iterator();
                                                        while (it6.hasNext()) {
                                                            num = (Integer) it6.next();
                                                            num.intValue();
                                                            litVar2 = (lit) map3.get(num);
                                                            list4 = (List) afvVar3.get(num);
                                                            if (list4 != null) {
                                                            }
                                                            map5 = afvVar3;
                                                            afvVar4.put(num, litVar2);
                                                            afvVar3 = map5;
                                                            it6 = it6;
                                                            str14 = str14;
                                                        }
                                                    }
                                                    str3 = str14;
                                                    map4 = afvVar4;
                                                    for (Integer num2 : hashSet) {
                                                        num2.intValue();
                                                        litVar = (lit) map4.get(num2);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        afvVar2 = new afv();
                                                        if (litVar != null) {
                                                            it5 = litVar.d.iterator();
                                                            while (it5.hasNext()) {
                                                                limVar = (lim) it5.next();
                                                                it5 = it5;
                                                                if ((limVar.b & 1) != 0) {
                                                                    Integer numValueOf3 = Integer.valueOf(limVar.c);
                                                                    Map map9 = map4;
                                                                    String str19 = str15;
                                                                    if ((limVar.b & 2) != 0) {
                                                                        lValueOf = Long.valueOf(limVar.d);
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    afvVar2.put(numValueOf3, lValueOf);
                                                                    map4 = map9;
                                                                    str15 = str19;
                                                                }
                                                            }
                                                        }
                                                        Map map10 = map4;
                                                        String str20 = str15;
                                                        afv afvVar7 = new afv();
                                                        if (litVar != null) {
                                                            it4 = litVar.e.iterator();
                                                            while (it4.hasNext()) {
                                                                liuVar = (liu) it4.next();
                                                                if ((liuVar.b & 1) == 0) {
                                                                }
                                                            }
                                                        }
                                                        if (litVar != null) {
                                                            i5 = 0;
                                                            while (i5 < (litVar.b.size() << 6)) {
                                                                if (lfx.E(litVar.b, i5)) {
                                                                    str10 = str13;
                                                                    aT().k.c("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i5));
                                                                    bitSet2.set(i5);
                                                                    if (lfx.E(litVar.c, i5)) {
                                                                        bitSet.set(i5);
                                                                    }
                                                                    i5++;
                                                                    str13 = str10;
                                                                } else {
                                                                    str10 = str13;
                                                                }
                                                                afvVar2.remove(Integer.valueOf(i5));
                                                                i5++;
                                                                str13 = str10;
                                                            }
                                                        }
                                                        String str21 = str13;
                                                        lit litVar3 = (lit) map3.get(num2);
                                                        if (!zF2) {
                                                        }
                                                        this.c.put(num2, new lbj(this, this.a, litVar3, bitSet, bitSet2, afvVar2, afvVar7));
                                                        str13 = str21;
                                                        map4 = map10;
                                                        str15 = str20;
                                                    }
                                                    str2 = str13;
                                                    str4 = str15;
                                                    String str22 = "Skipping failed audience ID";
                                                    if (!list.isEmpty()) {
                                                        lbkVar = new lbk(this);
                                                        afv afvVar8 = new afv();
                                                        it = list.iterator();
                                                        while (it.hasNext()) {
                                                            linVar = (lin) it.next();
                                                            linVarA = lbkVar.a(this.a, linVar);
                                                            if (linVarA != null) {
                                                                lgpVarV = v();
                                                                str5 = this.a;
                                                                str6 = linVarA.d;
                                                                lcaVarJ = lgpVarV.j("events", str5, linVar.d);
                                                                if (lcaVarJ == null) {
                                                                    lgpVarV.aT().f.c("Event aggregate wasn't created during raw event logging. appId, event", lcz.a(str5), lgpVarV.I().c(str6));
                                                                    lcaVar = new lca(str5, linVar.d, 1L, 1L, 1L, linVar.e, 0L, null, null, null, null);
                                                                } else {
                                                                    lcaVar = new lca(lcaVarJ.a, lcaVarJ.b, lcaVarJ.c + 1, lcaVarJ.d + 1, lcaVarJ.e + 1, lcaVarJ.f, lcaVarJ.g, lcaVarJ.h, lcaVarJ.i, lcaVarJ.j, lcaVarJ.k);
                                                                }
                                                                lca lcaVar3 = lcaVar;
                                                                v().aa("events", lcaVar3);
                                                                if (G().F(null, lcl.bp)) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    String str23 = str4;
                                                    if (G().F(null, lcl.bp)) {
                                                    }
                                                    return new ArrayList();
                                                }
                                            } catch (SQLiteException e8) {
                                                e = e8;
                                                cursorRawQuery = null;
                                            } catch (Throwable th) {
                                                th = th;
                                                r9 = 0;
                                                if (r9 != 0) {
                                                    r9.close();
                                                }
                                                throw th;
                                            }
                                            kro.i(str18);
                                            kro.l(map3);
                                            afvVar4 = new afv();
                                            if (!map3.isEmpty()) {
                                                it6 = map3.keySet().iterator();
                                                while (it6.hasNext()) {
                                                    num = (Integer) it6.next();
                                                    num.intValue();
                                                    litVar2 = (lit) map3.get(num);
                                                    list4 = (List) afvVar3.get(num);
                                                    if (list4 != null) {
                                                    }
                                                    map5 = afvVar3;
                                                    afvVar4.put(num, litVar2);
                                                    afvVar3 = map5;
                                                    it6 = it6;
                                                    str14 = str14;
                                                }
                                            }
                                            str3 = str14;
                                            map4 = afvVar4;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r9 = hashSet;
                                        }
                                    } else {
                                        str3 = "current_results";
                                        map4 = map3;
                                    }
                                    while (r18.hasNext()) {
                                        num2.intValue();
                                        litVar = (lit) map4.get(num2);
                                        bitSet = new BitSet();
                                        bitSet2 = new BitSet();
                                        afvVar2 = new afv();
                                        if (litVar != null) {
                                            it5 = litVar.d.iterator();
                                            while (it5.hasNext()) {
                                                limVar = (lim) it5.next();
                                                it5 = it5;
                                                if ((limVar.b & 1) != 0) {
                                                    Integer numValueOf4 = Integer.valueOf(limVar.c);
                                                    Map map11 = map4;
                                                    String str110 = str15;
                                                    if ((limVar.b & 2) != 0) {
                                                        lValueOf = Long.valueOf(limVar.d);
                                                    } else {
                                                        lValueOf = null;
                                                    }
                                                    afvVar2.put(numValueOf4, lValueOf);
                                                    map4 = map11;
                                                    str15 = str110;
                                                }
                                            }
                                        }
                                        Map map12 = map4;
                                        String str24 = str15;
                                        afv afvVar9 = new afv();
                                        if (litVar != null) {
                                            it4 = litVar.e.iterator();
                                            while (it4.hasNext()) {
                                                liuVar = (liu) it4.next();
                                                if ((liuVar.b & 1) == 0) {
                                                }
                                            }
                                        }
                                        if (litVar != null) {
                                            i5 = 0;
                                            while (i5 < (litVar.b.size() << 6)) {
                                                if (lfx.E(litVar.b, i5)) {
                                                    str10 = str13;
                                                    aT().k.c("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i5));
                                                    bitSet2.set(i5);
                                                    if (lfx.E(litVar.c, i5)) {
                                                        bitSet.set(i5);
                                                    }
                                                    i5++;
                                                    str13 = str10;
                                                } else {
                                                    str10 = str13;
                                                }
                                                afvVar2.remove(Integer.valueOf(i5));
                                                i5++;
                                                str13 = str10;
                                            }
                                        }
                                        String str25 = str13;
                                        lit litVar4 = (lit) map3.get(num2);
                                        if (!zF2) {
                                        }
                                        this.c.put(num2, new lbj(this, this.a, litVar4, bitSet, bitSet2, afvVar2, afvVar9));
                                        str13 = str25;
                                        map4 = map12;
                                        str15 = str24;
                                    }
                                    str2 = str13;
                                }
                                str4 = str15;
                                String str26 = "Skipping failed audience ID";
                                if (!list.isEmpty()) {
                                    lbkVar = new lbk(this);
                                    afv afvVar10 = new afv();
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        linVar = (lin) it.next();
                                        linVarA = lbkVar.a(this.a, linVar);
                                        if (linVarA != null) {
                                            lgpVarV = v();
                                            str5 = this.a;
                                            str6 = linVarA.d;
                                            lcaVarJ = lgpVarV.j("events", str5, linVar.d);
                                            if (lcaVarJ == null) {
                                                lgpVarV.aT().f.c("Event aggregate wasn't created during raw event logging. appId, event", lcz.a(str5), lgpVarV.I().c(str6));
                                                lcaVar = new lca(str5, linVar.d, 1L, 1L, 1L, linVar.e, 0L, null, null, null, null);
                                            } else {
                                                lcaVar = new lca(lcaVarJ.a, lcaVarJ.b, lcaVarJ.c + 1, lcaVarJ.d + 1, lcaVarJ.e + 1, lcaVarJ.f, lcaVarJ.g, lcaVarJ.h, lcaVarJ.i, lcaVarJ.j, lcaVarJ.k);
                                            }
                                            lca lcaVar4 = lcaVar;
                                            v().aa("events", lcaVar4);
                                            if (G().F(null, lcl.bp)) {
                                            }
                                        }
                                    }
                                }
                                String str27 = str4;
                                if (G().F(null, lcl.bp)) {
                                }
                                return new ArrayList();
                            } catch (Throwable th3) {
                                th = th3;
                                r8 = obj2;
                                if (r8 != 0) {
                                    r8.close();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        if (r10 != 0) {
                            r10.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e9) {
                    e = e9;
                    cursorQuery2 = null;
                } catch (Throwable th5) {
                    th = th5;
                    r10 = 0;
                    if (r10 != 0) {
                        r10.close();
                    }
                    throw th;
                }
            } else {
                obj3 = str12;
                map2 = map6;
                obj2 = obj3;
            }
            lgpVarV2 = v();
            str9 = this.a;
            lgpVarV2.w();
            lgpVarV2.o();
            kro.i(str9);
            try {
                cursorQuery = lgpVarV2.e().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str9}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    Map map13 = Collections.EMPTY_MAP;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    map3 = map13;
                    z4 = z2 ? 1 : 0;
                } else {
                    afvVar5 = new afv();
                    z3 = z2;
                    while (true) {
                        i6 = cursorQuery.getInt(i7);
                        afvVar5.put(Integer.valueOf(i6), (lit) ((aihf) lfx.l(lit.a.createBuilder(), cursorQuery.getBlob(1))).build());
                        if (!cursorQuery.moveToNext()) {
                            break;
                            break;
                        }
                        lgpVarV2 = lgpVarV2;
                        z3 = z3 ? 1 : 0;
                        i7 = 0;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    map3 = afvVar5;
                    z4 = z3;
                }
            } catch (SQLiteException e10) {
                e = e10;
                lgpVarV2 = lgpVarV2;
                z3 = z2 ? 1 : 0;
                cursorQuery = null;
            } catch (Throwable th6) {
                th = th6;
                r8 = 0;
                if (r8 != 0) {
                    r8.close();
                }
                throw th;
            }
            if (map3.isEmpty()) {
                str2 = "Failed to merge filter. appId";
                str3 = "current_results";
            } else {
                HashSet<Integer> hashSet2 = new HashSet(map3.keySet());
                if (z4) {
                    String str111 = this.a;
                    lgpVarV3 = v();
                    str11 = this.a;
                    lgpVarV3.w();
                    lgpVarV3.o();
                    kro.i(str11);
                    afvVar3 = new afv();
                    cursorRawQuery = lgpVarV3.e().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str11, str11});
                    if (cursorRawQuery.moveToFirst()) {
                        do {
                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                            list5 = (List) afvVar3.get(numValueOf);
                            if (list5 == null) {
                                arrayList2 = new ArrayList();
                                afvVar3.put(numValueOf, arrayList2);
                            } else {
                                arrayList2 = list5;
                            }
                            arrayList2.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                        } while (cursorRawQuery.moveToNext());
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    } else {
                        afvVar3 = Collections.EMPTY_MAP;
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    }
                    kro.i(str111);
                    kro.l(map3);
                    afvVar4 = new afv();
                    if (!map3.isEmpty()) {
                        it6 = map3.keySet().iterator();
                        while (it6.hasNext()) {
                            num = (Integer) it6.next();
                            num.intValue();
                            litVar2 = (lit) map3.get(num);
                            list4 = (List) afvVar3.get(num);
                            if (list4 != null || list4.isEmpty()) {
                                map5 = afvVar3;
                                afvVar4.put(num, litVar2);
                                afvVar3 = map5;
                                it6 = it6;
                                str14 = str14;
                            } else {
                                map5 = afvVar3;
                                List listP = u().p(litVar2.c, list4);
                                if (listP.isEmpty()) {
                                    afvVar3 = map5;
                                } else {
                                    aihf builder = litVar2.toBuilder();
                                    builder.copyOnWrite();
                                    ((lit) builder.instance).c = lit.emptyLongList();
                                    builder.P(listP);
                                    List listP2 = u().p(litVar2.b, list4);
                                    builder.copyOnWrite();
                                    ((lit) builder.instance).b = lit.emptyLongList();
                                    builder.R(listP2);
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it8 = litVar2.d.iterator();
                                    while (it8.hasNext()) {
                                        lim limVar2 = (lim) it8.next();
                                        Iterator it9 = it8;
                                        if (!list4.contains(Integer.valueOf(limVar2.c))) {
                                            arrayList4.add(limVar2);
                                        }
                                        it8 = it9;
                                    }
                                    builder.copyOnWrite();
                                    ((lit) builder.instance).d = lit.emptyProtobufList();
                                    builder.O(arrayList4);
                                    ArrayList arrayList5 = new ArrayList();
                                    for (liu liuVar2 : litVar2.e) {
                                        if (!list4.contains(Integer.valueOf(liuVar2.c))) {
                                            arrayList5.add(liuVar2);
                                        }
                                    }
                                    builder.copyOnWrite();
                                    ((lit) builder.instance).e = lit.emptyProtobufList();
                                    builder.Q(arrayList5);
                                    afvVar4.put(num, (lit) builder.build());
                                    afvVar3 = map5;
                                    it6 = it6;
                                    str14 = str14;
                                }
                            }
                        }
                    }
                    str3 = str14;
                    map4 = afvVar4;
                } else {
                    str3 = "current_results";
                    map4 = map3;
                }
                while (r18.hasNext()) {
                    num2.intValue();
                    litVar = (lit) map4.get(num2);
                    bitSet = new BitSet();
                    bitSet2 = new BitSet();
                    afvVar2 = new afv();
                    if (litVar != null && litVar.d.size() != 0) {
                        it5 = litVar.d.iterator();
                        while (it5.hasNext()) {
                            limVar = (lim) it5.next();
                            it5 = it5;
                            if ((limVar.b & 1) != 0) {
                                Integer numValueOf5 = Integer.valueOf(limVar.c);
                                Map map14 = map4;
                                String str112 = str15;
                                if ((limVar.b & 2) != 0) {
                                    lValueOf = Long.valueOf(limVar.d);
                                } else {
                                    lValueOf = null;
                                }
                                afvVar2.put(numValueOf5, lValueOf);
                                map4 = map14;
                                str15 = str112;
                            }
                        }
                    }
                    Map map15 = map4;
                    String str28 = str15;
                    afv afvVar11 = new afv();
                    if (litVar != null && litVar.e.size() != 0) {
                        it4 = litVar.e.iterator();
                        while (it4.hasNext()) {
                            liuVar = (liu) it4.next();
                            if ((liuVar.b & 1) == 0 && liuVar.d.size() > 0) {
                                afvVar11.put(Integer.valueOf(liuVar.c), Long.valueOf(liuVar.d.a(liuVar.d.size() - 1)));
                                it4 = it4;
                            }
                        }
                    }
                    if (litVar != null) {
                        i5 = 0;
                        while (i5 < (litVar.b.size() << 6)) {
                            if (lfx.E(litVar.b, i5)) {
                                str10 = str13;
                                aT().k.c("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i5));
                                bitSet2.set(i5);
                                if (lfx.E(litVar.c, i5)) {
                                    bitSet.set(i5);
                                }
                                i5++;
                                str13 = str10;
                            } else {
                                str10 = str13;
                            }
                            afvVar2.remove(Integer.valueOf(i5));
                            i5++;
                            str13 = str10;
                        }
                    }
                    String str29 = str13;
                    lit litVar5 = (lit) map3.get(num2);
                    if (!zF2 && zF && (list3 = (List) map2.get(num2)) != null && this.e != null && this.d != null) {
                        for (lht lhtVar2 : list3) {
                            int i9 = lhtVar2.c;
                            long jLongValue = this.e.longValue() / 1000;
                            if (lhtVar2.h) {
                                jLongValue = this.d.longValue() / 1000;
                            }
                            Integer numValueOf6 = Integer.valueOf(i9);
                            if (afvVar2.containsKey(numValueOf6)) {
                                afvVar2.put(numValueOf6, Long.valueOf(jLongValue));
                            }
                            if (afvVar11.containsKey(numValueOf6)) {
                                afvVar11.put(numValueOf6, Long.valueOf(jLongValue));
                            }
                        }
                    }
                    this.c.put(num2, new lbj(this, this.a, litVar5, bitSet, bitSet2, afvVar2, afvVar11));
                    str13 = str29;
                    map4 = map15;
                    str15 = str28;
                }
                str2 = str13;
            }
            str4 = str15;
        }
        String str210 = "Skipping failed audience ID";
        if (!list.isEmpty()) {
            lbkVar = new lbk(this);
            afv afvVar12 = new afv();
            it = list.iterator();
            while (it.hasNext()) {
                linVar = (lin) it.next();
                linVarA = lbkVar.a(this.a, linVar);
                if (linVarA != null) {
                    lgpVarV = v();
                    str5 = this.a;
                    str6 = linVarA.d;
                    lcaVarJ = lgpVarV.j("events", str5, linVar.d);
                    if (lcaVarJ == null) {
                        lgpVarV.aT().f.c("Event aggregate wasn't created during raw event logging. appId, event", lcz.a(str5), lgpVarV.I().c(str6));
                        lcaVar = new lca(str5, linVar.d, 1L, 1L, 1L, linVar.e, 0L, null, null, null, null);
                    } else {
                        lcaVar = new lca(lcaVarJ.a, lcaVarJ.b, lcaVarJ.c + 1, lcaVarJ.d + 1, lcaVarJ.e + 1, lcaVarJ.f, lcaVarJ.g, lcaVarJ.h, lcaVarJ.i, lcaVarJ.j, lcaVarJ.k);
                    }
                    lca lcaVar5 = lcaVar;
                    v().aa("events", lcaVar5);
                    if (G().F(null, lcl.bp) && !z) {
                        long j2 = lcaVar5.c;
                        String str30 = linVarA.d;
                        Map map16 = (Map) afvVar12.get(str30);
                        if (map16 == null) {
                            lgp lgpVarV6 = v();
                            String str31 = this.a;
                            lgpVarV6.w();
                            lgpVarV6.o();
                            kro.i(str31);
                            kro.i(str30);
                            afv afvVar13 = new afv();
                            try {
                                try {
                                    it2 = it;
                                    try {
                                        Cursor cursorQuery3 = lgpVarV6.e().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str31, str30}, null, null, null);
                                        try {
                                            try {
                                                if (cursorQuery3.moveToFirst()) {
                                                    linVar2 = linVarA;
                                                    while (true) {
                                                        try {
                                                            try {
                                                                try {
                                                                    lht lhtVar3 = (lht) ((aihf) lfx.l(lht.a.createBuilder(), cursorQuery3.getBlob(1))).build();
                                                                    Integer numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                    List list7 = (List) afvVar13.get(numValueOf7);
                                                                    if (list7 == null) {
                                                                        cursor4 = cursorQuery3;
                                                                        try {
                                                                            try {
                                                                                arrayList = new ArrayList();
                                                                                afvVar13.put(numValueOf7, arrayList);
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                                cursor3 = cursor4;
                                                                                if (cursor3 != null) {
                                                                                    cursor3.close();
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } catch (SQLiteException e11) {
                                                                            e = e11;
                                                                            str2 = str2;
                                                                            str7 = str4;
                                                                            lgpVarV6.aT().c.c(str7, lcz.a(str31), e);
                                                                            map16 = Collections.EMPTY_MAP;
                                                                            if (cursor4 != null) {
                                                                                cursor4.close();
                                                                            }
                                                                            afvVar12.put(str30, map16);
                                                                            for (Integer num3 : map16.keySet()) {
                                                                                iIntValue = num3.intValue();
                                                                                if (this.b.contains(num3)) {
                                                                                    aT().k.b("Skipping failed audience ID", num3);
                                                                                } else {
                                                                                    it3 = ((List) map16.get(num3)).iterator();
                                                                                    zD = true;
                                                                                    while (true) {
                                                                                        if (!it3.hasNext()) {
                                                                                            map = map16;
                                                                                            str8 = str2;
                                                                                            afvVar = afvVar12;
                                                                                            lcaVar2 = lcaVar5;
                                                                                            j = j2;
                                                                                            break;
                                                                                        }
                                                                                        map = map16;
                                                                                        lht lhtVar4 = (lht) it3.next();
                                                                                        str8 = str2;
                                                                                        afvVar = afvVar12;
                                                                                        lblVar = new lbl(this, this.a, iIntValue, lhtVar4);
                                                                                        lcaVar2 = lcaVar5;
                                                                                        j = j2;
                                                                                        zD = lblVar.d(this.d, this.e, linVar2, j, lcaVar2, d(iIntValue, lhtVar4.c));
                                                                                        if (!zD) {
                                                                                            this.b.add(num3);
                                                                                            break;
                                                                                        }
                                                                                        c(num3).c(lblVar);
                                                                                        map16 = map;
                                                                                        str2 = str8;
                                                                                        afvVar12 = afvVar;
                                                                                        j2 = j;
                                                                                        lcaVar5 = lcaVar2;
                                                                                    }
                                                                                    if (!zD) {
                                                                                        this.b.add(num3);
                                                                                    }
                                                                                    map16 = map;
                                                                                    str2 = str8;
                                                                                    afvVar12 = afvVar;
                                                                                    j2 = j;
                                                                                    lcaVar5 = lcaVar2;
                                                                                }
                                                                            }
                                                                            it = it2;
                                                                            str2 = str2;
                                                                            str4 = str7;
                                                                            lbkVar = lbkVar;
                                                                        }
                                                                    } else {
                                                                        cursor4 = cursorQuery3;
                                                                        arrayList = list7;
                                                                    }
                                                                    arrayList.add(lhtVar3);
                                                                    str2 = str2;
                                                                } catch (IOException e12) {
                                                                    cursor4 = cursorQuery3;
                                                                    str2 = str2;
                                                                    lgpVarV6.aT().c.c(str2, lcz.a(str31), e12);
                                                                }
                                                                try {
                                                                    if (!cursor4.moveToNext()) {
                                                                        break;
                                                                    }
                                                                    str2 = str2;
                                                                    afvVar13 = afvVar13;
                                                                    cursorQuery3 = cursor4;
                                                                } catch (SQLiteException e13) {
                                                                    e = e13;
                                                                    str7 = str4;
                                                                    lgpVarV6.aT().c.c(str7, lcz.a(str31), e);
                                                                    map16 = Collections.EMPTY_MAP;
                                                                    if (cursor4 != null) {
                                                                        cursor4.close();
                                                                    }
                                                                }
                                                            } catch (SQLiteException e14) {
                                                                e = e14;
                                                                cursor4 = cursorQuery3;
                                                            }
                                                        } catch (SQLiteException e15) {
                                                            e = e15;
                                                            str2 = str2;
                                                            cursor4 = cursorQuery3;
                                                        }
                                                    }
                                                    if (cursor4 != null) {
                                                        cursor4.close();
                                                    }
                                                    map16 = afvVar13;
                                                } else {
                                                    str2 = str2;
                                                    linVar2 = linVarA;
                                                    map16 = Collections.EMPTY_MAP;
                                                    if (cursorQuery3 != null) {
                                                        cursorQuery3.close();
                                                    }
                                                }
                                                str7 = str4;
                                            } catch (SQLiteException e16) {
                                                e = e16;
                                                str2 = str2;
                                                cursor4 = cursorQuery3;
                                                linVar2 = linVarA;
                                            }
                                            afvVar12.put(str30, map16);
                                        } catch (Throwable th8) {
                                            th = th8;
                                            cursor4 = cursorQuery3;
                                        }
                                    } catch (SQLiteException e17) {
                                        e = e17;
                                        linVar2 = linVarA;
                                        cursor4 = null;
                                        str7 = str4;
                                        lgpVarV6.aT().c.c(str7, lcz.a(str31), e);
                                        map16 = Collections.EMPTY_MAP;
                                        if (cursor4 != null) {
                                            cursor4.close();
                                        }
                                        afvVar12.put(str30, map16);
                                        while (r5.hasNext()) {
                                            iIntValue = num3.intValue();
                                            if (this.b.contains(num3)) {
                                                aT().k.b("Skipping failed audience ID", num3);
                                            } else {
                                                it3 = ((List) map16.get(num3)).iterator();
                                                zD = true;
                                                while (true) {
                                                    if (!it3.hasNext()) {
                                                        map = map16;
                                                        str8 = str2;
                                                        afvVar = afvVar12;
                                                        lcaVar2 = lcaVar5;
                                                        j = j2;
                                                        break;
                                                    }
                                                    map = map16;
                                                    lht lhtVar5 = (lht) it3.next();
                                                    str8 = str2;
                                                    afvVar = afvVar12;
                                                    lblVar = new lbl(this, this.a, iIntValue, lhtVar5);
                                                    lcaVar2 = lcaVar5;
                                                    j = j2;
                                                    zD = lblVar.d(this.d, this.e, linVar2, j, lcaVar2, d(iIntValue, lhtVar5.c));
                                                    if (!zD) {
                                                        this.b.add(num3);
                                                        break;
                                                    }
                                                    c(num3).c(lblVar);
                                                    map16 = map;
                                                    str2 = str8;
                                                    afvVar12 = afvVar;
                                                    j2 = j;
                                                    lcaVar5 = lcaVar2;
                                                }
                                                if (!zD) {
                                                    this.b.add(num3);
                                                }
                                                map16 = map;
                                                str2 = str8;
                                                afvVar12 = afvVar;
                                                j2 = j;
                                                lcaVar5 = lcaVar2;
                                            }
                                        }
                                        it = it2;
                                        str2 = str2;
                                        str4 = str7;
                                        lbkVar = lbkVar;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    cursor3 = null;
                                }
                            } catch (SQLiteException e18) {
                                e = e18;
                                it2 = it;
                            }
                        } else {
                            it2 = it;
                            linVar2 = linVarA;
                            str7 = str4;
                            str2 = str2;
                        }
                        while (r5.hasNext()) {
                            iIntValue = num3.intValue();
                            if (this.b.contains(num3)) {
                                aT().k.b("Skipping failed audience ID", num3);
                            } else {
                                it3 = ((List) map16.get(num3)).iterator();
                                zD = true;
                                while (true) {
                                    if (!it3.hasNext()) {
                                        map = map16;
                                        str8 = str2;
                                        afvVar = afvVar12;
                                        lcaVar2 = lcaVar5;
                                        j = j2;
                                        break;
                                    }
                                    map = map16;
                                    lht lhtVar6 = (lht) it3.next();
                                    str8 = str2;
                                    afvVar = afvVar12;
                                    lblVar = new lbl(this, this.a, iIntValue, lhtVar6);
                                    lcaVar2 = lcaVar5;
                                    j = j2;
                                    zD = lblVar.d(this.d, this.e, linVar2, j, lcaVar2, d(iIntValue, lhtVar6.c));
                                    if (!zD) {
                                        this.b.add(num3);
                                        break;
                                    }
                                    c(num3).c(lblVar);
                                    map16 = map;
                                    str2 = str8;
                                    afvVar12 = afvVar;
                                    j2 = j;
                                    lcaVar5 = lcaVar2;
                                }
                                if (!zD) {
                                    this.b.add(num3);
                                }
                                map16 = map;
                                str2 = str8;
                                afvVar12 = afvVar;
                                j2 = j;
                                lcaVar5 = lcaVar2;
                            }
                        }
                        it = it2;
                        str2 = str2;
                        str4 = str7;
                        lbkVar = lbkVar;
                    }
                }
            }
        }
        String str211 = str4;
        if (!G().F(null, lcl.bp) || z) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            afv afvVar14 = new afv();
            Iterator it10 = list2.iterator();
            while (it10.hasNext()) {
                lix lixVar = (lix) it10.next();
                String str32 = lixVar.d;
                Map map17 = (Map) afvVar14.get(str32);
                if (map17 == null) {
                    lgp lgpVarV7 = v();
                    String str33 = this.a;
                    lgpVarV7.w();
                    lgpVarV7.o();
                    kro.i(str33);
                    kro.i(str32);
                    afv afvVar15 = new afv();
                    try {
                        Cursor cursorQuery4 = lgpVarV7.e().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str33, str32}, null, null, null);
                        try {
                            try {
                                if (cursorQuery4.moveToFirst()) {
                                    while (true) {
                                        try {
                                            lhw lhwVar = (lhw) ((aihf) lfx.l(lhw.a.createBuilder(), cursorQuery4.getBlob(1))).build();
                                            Integer numValueOf8 = Integer.valueOf(cursorQuery4.getInt(0));
                                            List arrayList6 = (List) afvVar15.get(numValueOf8);
                                            if (arrayList6 == null) {
                                                arrayList6 = new ArrayList();
                                                afvVar15.put(numValueOf8, arrayList6);
                                            }
                                            arrayList6.add(lhwVar);
                                        } catch (IOException e19) {
                                            lgpVarV7.aT().c.c("Failed to merge filter", lcz.a(str33), e19);
                                        }
                                        try {
                                            if (!cursorQuery4.moveToNext()) {
                                                break;
                                            }
                                            it10 = it10;
                                        } catch (SQLiteException e20) {
                                            e = e20;
                                            cursor2 = cursorQuery4;
                                            try {
                                                lgpVarV7.aT().c.c(str211, lcz.a(str33), e);
                                                map17 = Collections.EMPTY_MAP;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
                                                cursor = cursor2;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                    if (cursorQuery4 != null) {
                                        cursorQuery4.close();
                                    }
                                    map17 = afvVar15;
                                } else {
                                    it10 = it10;
                                    map17 = Collections.EMPTY_MAP;
                                    if (cursorQuery4 != null) {
                                        cursorQuery4.close();
                                    }
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                cursor = cursorQuery4;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e21) {
                            e = e21;
                            it10 = it10;
                        }
                    } catch (SQLiteException e22) {
                        e = e22;
                        it10 = it10;
                        cursor2 = null;
                    } catch (Throwable th12) {
                        th = th12;
                        cursor = null;
                    }
                    afvVar14.put(str32, map17);
                } else {
                    it10 = it10;
                }
                Iterator it11 = map17.keySet().iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        i = 2;
                        break;
                    }
                    Integer num4 = (Integer) it11.next();
                    int iIntValue2 = num4.intValue();
                    if (this.b.contains(num4)) {
                        aT().k.b(str210, num4);
                        break;
                    }
                    Iterator it12 = ((List) map17.get(num4)).iterator();
                    boolean zD2 = true;
                    while (true) {
                        if (it12.hasNext()) {
                            lhw lhwVar2 = (lhw) it12.next();
                            if (aT().i(i)) {
                                aT().k.d("Evaluating filter. audience, filter, property", num4, (lhwVar2.b & 1) != 0 ? Integer.valueOf(lhwVar2.c) : null, I().e(lhwVar2.d));
                                lcx lcxVar2 = aT().k;
                                lfx lfxVarU = u();
                                if (lhwVar2 == null) {
                                    string = "null";
                                    str210 = str210;
                                    afvVar14 = afvVar14;
                                    i2 = 1;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("\nproperty_filter {\n");
                                    if ((lhwVar2.b & 1) != 0) {
                                        i4 = 0;
                                        lfx.aa(sb, 0, "filter_id", Integer.valueOf(lhwVar2.c));
                                    } else {
                                        i4 = 0;
                                    }
                                    lfx.aa(sb, i4, "property_name", lfxVarU.I().e(lhwVar2.d));
                                    String strS = lfx.S(lhwVar2.f, lhwVar2.g, lhwVar2.h);
                                    if (!strS.isEmpty()) {
                                        lfx.aa(sb, 0, "filter_type", strS);
                                    }
                                    lhu lhuVar = lhwVar2.e;
                                    if (lhuVar == null) {
                                        lhuVar = lhu.a;
                                    }
                                    i2 = 1;
                                    lfxVarU.A(sb, 1, lhuVar);
                                    sb.append("}\n");
                                    string = sb.toString();
                                }
                                lcxVar2.b("Filter definition", string);
                            } else {
                                str210 = str210;
                                afvVar14 = afvVar14;
                                i2 = 1;
                            }
                            if ((lhwVar2.b & i2) == 0 || (i3 = lhwVar2.c) > 256) {
                                aT().f.c("Invalid property filter ID. appId, id", lcz.a(this.a), String.valueOf((lhwVar2.b & 1) != 0 ? Integer.valueOf(lhwVar2.c) : null));
                                this.b.add(num4);
                                map17 = map17;
                                str210 = str210;
                                afvVar14 = afvVar14;
                                i = 2;
                            } else {
                                lbn lbnVar = new lbn(this, this.a, iIntValue2, lhwVar2);
                                zD2 = lbnVar.d(this.d, this.e, lixVar, d(iIntValue2, i3));
                                if (zD2) {
                                    c(num4).c(lbnVar);
                                    map17 = map17;
                                    str210 = str210;
                                    afvVar14 = afvVar14;
                                    i = 2;
                                } else {
                                    this.b.add(num4);
                                }
                            }
                        } else {
                            map17 = map17;
                            str210 = str210;
                            afvVar14 = afvVar14;
                        }
                        if (!zD2) {
                            this.b.add(num4);
                        }
                        map17 = map17;
                        str210 = str210;
                        afvVar14 = afvVar14;
                        i = 2;
                    }
                }
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Set<Integer> setKeySet = this.c.keySet();
        setKeySet.removeAll(this.b);
        for (Integer num5 : setKeySet) {
            int iIntValue3 = num5.intValue();
            lbj lbjVar = (lbj) this.c.get(num5);
            kro.l(lbjVar);
            aihf aihfVarCreateBuilder = lij.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            lij lijVar = (lij) aihfVarCreateBuilder.instance;
            lijVar.b |= 1;
            lijVar.c = iIntValue3;
            boolean z5 = lbjVar.a;
            aihfVarCreateBuilder.copyOnWrite();
            lij lijVar2 = (lij) aihfVarCreateBuilder.instance;
            lijVar2.b |= 8;
            lijVar2.f = z5;
            lit litVar6 = lbjVar.b;
            if (litVar6 != null) {
                aihfVarCreateBuilder.copyOnWrite();
                lij lijVar3 = (lij) aihfVarCreateBuilder.instance;
                lijVar3.e = litVar6;
                lijVar3.b |= 4;
            }
            lit litVar7 = lit.a;
            aihf aihfVarCreateBuilder2 = litVar7.createBuilder();
            aihfVarCreateBuilder2.P(lfx.q(lbjVar.c));
            aihfVarCreateBuilder2.R(lfx.q(lbjVar.d));
            List listA = lbjVar.a();
            if (listA != null) {
                aihfVarCreateBuilder2.O(listA);
            }
            aihfVarCreateBuilder2.Q(lbjVar.b());
            aihfVarCreateBuilder.copyOnWrite();
            lij lijVar4 = (lij) aihfVarCreateBuilder.instance;
            lit litVar8 = (lit) aihfVarCreateBuilder2.build();
            litVar8.getClass();
            lijVar4.d = litVar8;
            lijVar4.b |= 2;
            lij lijVar5 = (lij) aihfVarCreateBuilder.build();
            arrayList7.add(lijVar5);
            lgp lgpVarV8 = v();
            String str34 = this.a;
            lit litVar9 = lijVar5.d;
            if (litVar9 != null) {
                litVar7 = litVar9;
            }
            lgpVarV8.w();
            lgpVarV8.o();
            kro.i(str34);
            kro.l(litVar7);
            byte[] byteArray = litVar7.toByteArray();
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str34);
            contentValues2.put("audience_id", num5);
            String str35 = str3;
            contentValues2.put(str35, byteArray);
            try {
                if (lgpVarV8.e().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                    lgpVarV8.aT().c.b("Failed to insert filter results (got -1). appId", lcz.a(str34));
                }
            } catch (SQLiteException e23) {
                lgpVarV8.aT().c.c("Error storing filter results. appId", lcz.a(str34), e23);
            }
            str3 = str35;
        }
        return arrayList7;
    }

    @Override // defpackage.lfo
    protected final void b() {
    }
}
