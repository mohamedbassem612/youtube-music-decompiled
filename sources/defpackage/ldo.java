package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ldo extends lfo implements lbs {
    private static final ahub n = afyd.s();
    public final Map a;
    final Map b;
    final Map c;
    final Map d;
    final Map e;
    public final Map f;
    public final Map g;
    final agm h;
    public final Map i;
    public final Map j;
    public final qcb k;
    private final Map m;

    public ldo(lfv lfvVar) {
        super(lfvVar);
        this.a = new afv();
        this.b = new afv();
        this.c = new afv();
        this.d = new afv();
        this.e = new afv();
        this.f = new afv();
        this.m = new afv();
        this.i = new afv();
        this.j = new afv();
        this.g = new afv();
        this.h = new ldn(this);
        this.k = new qcb(this);
    }

    private static final Map A(lie lieVar) {
        afv afvVar = new afv();
        if (lieVar != null) {
            for (lif lifVar : lieVar.e) {
                afvVar.put(lifVar.c, lifVar.d);
            }
        }
        return afvVar;
    }

    private final void B(String str, aihf aihfVar) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        afv afvVar = new afv();
        afv afvVar2 = new afv();
        afv afvVar3 = new afv();
        if (aihfVar != null) {
            Iterator it = DesugarCollections.unmodifiableList(((lie) aihfVar.instance).i).iterator();
            while (it.hasNext()) {
                hashSet.add(((lic) it.next()).b);
            }
            arrayList.addAll(DesugarCollections.unmodifiableList(((lie) aihfVar.instance).m));
            for (int i = 0; i < ((lie) aihfVar.instance).f.size(); i++) {
                aihf builder = ((lid) ((lie) aihfVar.instance).f.get(i)).toBuilder();
                if (((lid) builder.instance).c.isEmpty()) {
                    aT().f.a("EventConfig contained null event name");
                } else {
                    String str2 = ((lid) builder.instance).c;
                    String strB = lec.b(str2);
                    if (!TextUtils.isEmpty(strB)) {
                        builder.copyOnWrite();
                        lid lidVar = (lid) builder.instance;
                        strB.getClass();
                        lidVar.b |= 1;
                        lidVar.c = strB;
                        aihfVar.copyOnWrite();
                        lie lieVar = (lie) aihfVar.instance;
                        lid lidVar2 = (lid) builder.build();
                        lidVar2.getClass();
                        aiie aiieVar = lieVar.f;
                        if (!aiieVar.c()) {
                            lieVar.f = aihn.mutableCopy(aiieVar);
                        }
                        lieVar.f.set(i, lidVar2);
                    }
                    lid lidVar3 = (lid) builder.instance;
                    if ((lidVar3.b & 2) != 0 && lidVar3.d) {
                        afvVar.put(str2, Boolean.TRUE);
                    }
                    lid lidVar4 = (lid) builder.instance;
                    if ((lidVar4.b & 4) != 0 && lidVar4.e) {
                        afvVar2.put(lidVar4.c, Boolean.TRUE);
                    }
                    lid lidVar5 = (lid) builder.instance;
                    if ((lidVar5.b & 8) != 0) {
                        int i2 = lidVar5.f;
                        if (i2 < 2 || i2 > 65535) {
                            lcx lcxVar = aT().f;
                            lid lidVar6 = (lid) builder.instance;
                            lcxVar.c("Invalid sampling rate. Event name, sample rate", lidVar6.c, Integer.valueOf(lidVar6.f));
                        } else {
                            afvVar3.put(lidVar5.c, Integer.valueOf(i2));
                        }
                    }
                }
            }
        }
        this.b.put(str, hashSet);
        this.e.put(str, arrayList);
        this.c.put(str, afvVar);
        this.d.put(str, afvVar2);
        this.g.put(str, afvVar3);
    }

    @Override // defpackage.lbs
    public final String a(String str, String str2) {
        o();
        h(str);
        Map map = (Map) this.a.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    final lge c(String str, lgg lggVar) {
        o();
        h(str);
        lib libVarD = d(str);
        if (libVarD == null) {
            return lge.UNINITIALIZED;
        }
        for (lhy lhyVar : libVarD.g) {
            int iBc = a.bc(lhyVar.b);
            if (iBc == 0) {
                iBc = 1;
            }
            if (r(iBc) == lggVar) {
                int iAS = a.aS(lhyVar.c);
                if (iAS == 0) {
                    iAS = 1;
                }
                int i = iAS - 1;
                if (i != 1) {
                    return i != 2 ? lge.UNINITIALIZED : lge.DENIED;
                }
                return lge.GRANTED;
            }
        }
        return lge.UNINITIALIZED;
    }

    final lib d(String str) {
        o();
        h(str);
        lie lieVarE = e(str);
        if (lieVarE == null || (lieVarE.b & SemanticState.Focused) == 0) {
            return null;
        }
        lib libVar = lieVarE.k;
        return libVar == null ? lib.a : libVar;
    }

    protected final lie e(String str) {
        w();
        o();
        kro.i(str);
        h(str);
        return (lie) this.f.get(str);
    }

    public final lie f(String str, byte[] bArr) {
        if (bArr == null) {
            return lie.a;
        }
        try {
            aihf aihfVar = (aihf) lfx.l(lie.a.createBuilder(), bArr);
            if (G().F(null, lcl.bd)) {
                for (int i = 0; i < ((lie) aihfVar.instance).e.size(); i++) {
                    lif lifVar = (lif) ((lie) aihfVar.instance).e.get(i);
                    aihf builder = lifVar.toBuilder();
                    ahub ahubVar = n;
                    String str2 = (String) ahubVar.h(lifVar.c);
                    builder.copyOnWrite();
                    lif lifVar2 = (lif) builder.instance;
                    str2.getClass();
                    lifVar2.b |= 1;
                    lifVar2.c = str2;
                    String str3 = (String) ahubVar.h(lifVar.d);
                    builder.copyOnWrite();
                    lif lifVar3 = (lif) builder.instance;
                    str3.getClass();
                    lifVar3.b |= 2;
                    lifVar3.d = str3;
                    lif lifVar4 = (lif) builder.build();
                    aihfVar.copyOnWrite();
                    lie lieVar = (lie) aihfVar.instance;
                    lifVar4.getClass();
                    aiie aiieVar = lieVar.e;
                    if (!aiieVar.c()) {
                        lieVar.e = aihn.mutableCopy(aiieVar);
                    }
                    lieVar.e.set(i, lifVar4);
                }
            }
            lie lieVar2 = (lie) aihfVar.build();
            aT().k.c("Parsed config. version, gmp_app_id", (lieVar2.b & 1) != 0 ? Long.valueOf(lieVar2.c) : null, (lieVar2.b & 2) != 0 ? lieVar2.d : null);
            return lieVar2;
        } catch (aiik e) {
            aT().f.c("Unable to merge remote config. appId", lcz.a(str), e);
            return lie.a;
        } catch (RuntimeException e2) {
            aT().f.c("Unable to merge remote config. appId", lcz.a(str), e2);
            return lie.a;
        }
    }

    final String g(String str) {
        o();
        h(str);
        return (String) this.m.get(str);
    }

    public final void h(String str) {
        w();
        o();
        kro.i(str);
        Map map = this.f;
        if (map.get(str) == null) {
            xsc xscVarAr = v().ar(str);
            if (xscVarAr == null) {
                this.a.put(str, null);
                this.c.put(str, null);
                this.b.put(str, null);
                this.d.put(str, null);
                this.e.put(str, null);
                map.put(str, null);
                this.m.put(str, null);
                this.i.put(str, null);
                this.j.put(str, null);
                this.g.put(str, null);
                return;
            }
            aihf builder = f(str, (byte[]) xscVarAr.b).toBuilder();
            B(str, builder);
            lie lieVar = (lie) builder.build();
            this.a.put(str, A(lieVar));
            i(str, lieVar);
            builder.copyOnWrite();
            ((lie) builder.instance).h = lie.emptyProtobufList();
            map.put(str, (lie) builder.build());
            this.m.put(str, ((lie) builder.instance).j);
            this.i.put(str, xscVarAr.c);
            this.j.put(str, xscVarAr.a);
        }
    }

    public final void i(String str, lie lieVar) {
        fys fysVar;
        if (lieVar.h.size() == 0) {
            this.h.d(str);
            return;
        }
        aT().k.b("EES programs found", Integer.valueOf(lieVar.h.size()));
        lja ljaVar = (lja) lieVar.h.get(0);
        try {
            fxw.a = ((Boolean) lcl.be.b(null)).booleanValue();
            giy giyVar = new giy();
            giyVar.a("internal.remoteConfig", new jkb(this, str, 3));
            giyVar.a("internal.appMetadata", new jkb(this, str, 4));
            giyVar.a("internal.logger", new iug(this, 13));
            try {
                Object obj = giyVar.a;
                giyVar.b = ((kwq) obj).G();
                if (((kwq) obj).H((kwq) giyVar.b, (ljb[]) ljaVar.b.toArray(new ljb[0])) instanceof fyq) {
                    throw new IllegalStateException("Program loading failed");
                }
                liy liyVar = ljaVar.c;
                if (liyVar == null) {
                    liyVar = liy.a;
                }
                for (liz lizVar : liyVar.b) {
                    aiie aiieVar = lizVar.c;
                    String str2 = lizVar.b;
                    Iterator it = aiieVar.iterator();
                    while (it.hasNext()) {
                        fyy fyyVarH = ((kwq) obj).H((kwq) giyVar.b, (ljb) it.next());
                        if (!(fyyVarH instanceof fyv)) {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                        Object obj2 = giyVar.b;
                        if (((kwq) obj2).B(str2)) {
                            fyy fyyVarX = ((kwq) obj2).x(str2);
                            if (!(fyyVarX instanceof fys)) {
                                throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(str2)));
                            }
                            fysVar = (fys) fyyVarX;
                        } else {
                            fysVar = null;
                        }
                        if (fysVar == null) {
                            throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(str2)));
                        }
                        fysVar.a((kwq) giyVar.b, Collections.singletonList(fyyVarH));
                    }
                }
                this.h.c(str, giyVar);
                lcx lcxVar = aT().k;
                liy liyVar2 = ljaVar.c;
                if (liyVar2 == null) {
                    liyVar2 = liy.a;
                }
                lcxVar.c("EES program loaded for appId, activities", str, Integer.valueOf(liyVar2.b.size()));
                liy liyVar3 = ljaVar.c;
                if (liyVar3 == null) {
                    liyVar3 = liy.a;
                }
                Iterator it2 = liyVar3.b.iterator();
                while (it2.hasNext()) {
                    aT().k.b("EES program activity", ((liz) it2.next()).b);
                }
            } catch (Throwable th) {
                throw new fxu(th);
            }
        } catch (fxu unused) {
            aT().c.b("Failed to load EES program. appId", str);
        }
    }

    final boolean j(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    final boolean k(String str, lgg lggVar) {
        o();
        h(str);
        lib libVarD = d(str);
        if (libVarD == null) {
            return false;
        }
        for (lhy lhyVar : libVarD.c) {
            int iBc = a.bc(lhyVar.b);
            if (iBc == 0) {
                iBc = 1;
            }
            if (lggVar == r(iBc)) {
                int iAS = a.aS(lhyVar.c);
                return iAS != 0 && iAS == 2;
            }
        }
        return false;
    }

    final boolean l(String str) {
        o();
        h(str);
        lib libVarD = d(str);
        return libVarD == null || (libVarD.b & 1) == 0 || libVarD.f;
    }

    final boolean m(String str, String str2) {
        Boolean bool;
        o();
        h(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.d.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean n(String str, String str2) {
        Boolean bool;
        o();
        h(str);
        if (j(str) && lga.am(str2)) {
            return true;
        }
        if (p(str) && lga.an(str2)) {
            return true;
        }
        Map map = (Map) this.c.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean p(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    protected final boolean q(String str, byte[] bArr, String str2, String str3) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        byte[] byteArray;
        Iterator it;
        ArrayList arrayList;
        int i;
        boolean z;
        w();
        o();
        kro.i(str);
        aihf builder = f(str, bArr).toBuilder();
        if (builder == null) {
            return false;
        }
        B(str, builder);
        i(str, (lie) builder.build());
        this.f.put(str, (lie) builder.build());
        this.m.put(str, ((lie) builder.instance).j);
        this.i.put(str, str2);
        this.j.put(str, str3);
        this.a.put(str, A((lie) builder.build()));
        lgp lgpVarV = v();
        ArrayList<lhs> arrayList2 = new ArrayList(DesugarCollections.unmodifiableList(((lie) builder.instance).g));
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            aihf builder2 = ((lhs) arrayList2.get(i2)).toBuilder();
            if (((lhs) builder2.instance).e.size() != 0) {
                for (int i3 = 0; i3 < ((lhs) builder2.instance).e.size(); i3++) {
                    aihf builder3 = ((lht) ((lhs) builder2.instance).e.get(i3)).toBuilder();
                    aihf aihfVarMo53clone = builder3.mo53clone();
                    String strB = lec.b(((lht) builder3.instance).d);
                    if (strB != null) {
                        aihfVarMo53clone.copyOnWrite();
                        lht lhtVar = (lht) aihfVarMo53clone.instance;
                        lhtVar.b |= 2;
                        lhtVar.d = strB;
                        z = true;
                    } else {
                        z = false;
                    }
                    int i4 = 0;
                    while (i4 < ((lht) builder3.instance).e.size()) {
                        lhu lhuVar = (lhu) ((lht) builder3.instance).e.get(i4);
                        boolean z2 = z;
                        aihf aihfVar = builder3;
                        String strT = mda.t(lhuVar.f, led.a, led.b);
                        if (strT != null) {
                            aihf builder4 = lhuVar.toBuilder();
                            builder4.copyOnWrite();
                            lhu lhuVar2 = (lhu) builder4.instance;
                            lhuVar2.b |= 8;
                            lhuVar2.f = strT;
                            lhu lhuVar3 = (lhu) builder4.build();
                            aihfVarMo53clone.copyOnWrite();
                            lht lhtVar2 = (lht) aihfVarMo53clone.instance;
                            lhuVar3.getClass();
                            aiie aiieVar = lhtVar2.e;
                            if (!aiieVar.c()) {
                                lhtVar2.e = aihn.mutableCopy(aiieVar);
                            }
                            lhtVar2.e.set(i4, lhuVar3);
                            z = true;
                        } else {
                            z = z2;
                        }
                        i4++;
                        builder3 = aihfVar;
                    }
                    if (z) {
                        builder2.copyOnWrite();
                        lhs lhsVar = (lhs) builder2.instance;
                        lht lhtVar3 = (lht) aihfVarMo53clone.build();
                        lhtVar3.getClass();
                        aiie aiieVar2 = lhsVar.e;
                        if (!aiieVar2.c()) {
                            lhsVar.e = aihn.mutableCopy(aiieVar2);
                        }
                        lhsVar.e.set(i3, lhtVar3);
                        arrayList2.set(i2, (lhs) builder2.build());
                    }
                }
            }
            if (((lhs) builder2.instance).d.size() != 0) {
                for (int i5 = 0; i5 < ((lhs) builder2.instance).d.size(); i5++) {
                    lhw lhwVar = (lhw) ((lhs) builder2.instance).d.get(i5);
                    String strT2 = mda.t(lhwVar.d, lee.a, lee.b);
                    if (strT2 != null) {
                        aihf builder5 = lhwVar.toBuilder();
                        builder5.copyOnWrite();
                        lhw lhwVar2 = (lhw) builder5.instance;
                        lhwVar2.b |= 2;
                        lhwVar2.d = strT2;
                        builder2.copyOnWrite();
                        lhs lhsVar2 = (lhs) builder2.instance;
                        lhw lhwVar3 = (lhw) builder5.build();
                        lhwVar3.getClass();
                        aiie aiieVar3 = lhsVar2.d;
                        if (!aiieVar3.c()) {
                            lhsVar2.d = aihn.mutableCopy(aiieVar3);
                        }
                        lhsVar2.d.set(i5, lhwVar3);
                        arrayList2.set(i2, (lhs) builder2.build());
                    }
                }
            }
        }
        lgpVarV.w();
        lgpVarV.o();
        kro.i(str);
        SQLiteDatabase sQLiteDatabaseE = lgpVarV.e();
        sQLiteDatabaseE.beginTransaction();
        try {
            lgpVarV.w();
            lgpVarV.o();
            kro.i(str);
            SQLiteDatabase sQLiteDatabaseE2 = lgpVarV.e();
            sQLiteDatabaseE2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseE2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                lhs lhsVar3 = (lhs) it2.next();
                lgpVarV.w();
                lgpVarV.o();
                kro.i(str);
                kro.l(lhsVar3);
                if ((lhsVar3.b & 1) != 0) {
                    int i6 = lhsVar3.c;
                    Iterator it3 = lhsVar3.e.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if ((((lht) it3.next()).b & 1) == 0) {
                                lgpVarV.aT().f.c("Event filter with no ID. Audience definition ignored. appId, audienceId", lcz.a(str), Integer.valueOf(i6));
                                break;
                            }
                        } else {
                            Iterator it4 = lhsVar3.d.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    Iterator it5 = lhsVar3.e.iterator();
                                    while (true) {
                                        sQLiteDatabase = sQLiteDatabaseE;
                                        it = it2;
                                        if (!it5.hasNext()) {
                                            i = i6;
                                            arrayList = arrayList2;
                                            Iterator it6 = lhsVar3.d.iterator();
                                            while (it6.hasNext()) {
                                                lhw lhwVar4 = (lhw) it6.next();
                                                lgpVarV.w();
                                                lgpVarV.o();
                                                kro.i(str);
                                                kro.l(lhwVar4);
                                                if (lhwVar4.d.isEmpty()) {
                                                    lgpVarV.aT().f.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", lcz.a(str), Integer.valueOf(i), String.valueOf((lhwVar4.b & 1) != 0 ? Integer.valueOf(lhwVar4.c) : null));
                                                } else {
                                                    byte[] byteArray2 = lhwVar4.toByteArray();
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put("app_id", str);
                                                    contentValues.put("audience_id", Integer.valueOf(i));
                                                    contentValues.put("filter_id", (lhwVar4.b & 1) != 0 ? Integer.valueOf(lhwVar4.c) : null);
                                                    Iterator it7 = it6;
                                                    contentValues.put("property_name", lhwVar4.d);
                                                    contentValues.put("session_scoped", (lhwVar4.b & 32) != 0 ? Boolean.valueOf(lhwVar4.h) : null);
                                                    contentValues.put("data", byteArray2);
                                                    try {
                                                        if (lgpVarV.e().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            lgpVarV.aT().c.b("Failed to insert property filter (got -1). appId", lcz.a(str));
                                                        } else {
                                                            it6 = it7;
                                                        }
                                                    } catch (SQLiteException e) {
                                                        lgpVarV.aT().c.c("Error storing property filter. appId", lcz.a(str), e);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        try {
                                            lht lhtVar4 = (lht) it5.next();
                                            lgpVarV.w();
                                            lgpVarV.o();
                                            kro.i(str);
                                            kro.l(lhtVar4);
                                            i = i6;
                                            if (lhtVar4.d.isEmpty()) {
                                                lgpVarV.aT().f.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", lcz.a(str), Integer.valueOf(i), String.valueOf((lhtVar4.b & 1) != 0 ? Integer.valueOf(lhtVar4.c) : null));
                                                arrayList = arrayList2;
                                            } else {
                                                byte[] byteArray3 = lhtVar4.toByteArray();
                                                arrayList = arrayList2;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", Integer.valueOf(i));
                                                contentValues2.put("filter_id", (lhtVar4.b & 1) != 0 ? Integer.valueOf(lhtVar4.c) : null);
                                                contentValues2.put("event_name", lhtVar4.d);
                                                contentValues2.put("session_scoped", (lhtVar4.b & 64) != 0 ? Boolean.valueOf(lhtVar4.i) : null);
                                                contentValues2.put("data", byteArray3);
                                                try {
                                                    if (lgpVarV.e().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        lgpVarV.aT().c.b("Failed to insert event filter (got -1). appId", lcz.a(str));
                                                    }
                                                    sQLiteDatabaseE = sQLiteDatabase;
                                                    it2 = it;
                                                    i6 = i;
                                                    arrayList2 = arrayList;
                                                } catch (SQLiteException e2) {
                                                    lgpVarV.aT().c.c("Error storing event filter. appId", lcz.a(str), e2);
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                        lgpVarV.w();
                                        lgpVarV.o();
                                        kro.i(str);
                                        SQLiteDatabase sQLiteDatabaseE3 = lgpVarV.e();
                                        sQLiteDatabaseE3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
                                        sQLiteDatabaseE3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
                                        break;
                                    }
                                }
                                if ((((lhw) it4.next()).b & 1) == 0) {
                                    lgpVarV.aT().f.c("Property filter with no ID. Audience definition ignored. appId, audienceId", lcz.a(str), Integer.valueOf(i6));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    sQLiteDatabase = sQLiteDatabaseE;
                    it = it2;
                    arrayList = arrayList2;
                    lgpVarV.aT().f.b("Audience with no ID. appId", lcz.a(str));
                }
                sQLiteDatabaseE = sQLiteDatabase;
                it2 = it;
                arrayList2 = arrayList;
            }
            sQLiteDatabase = sQLiteDatabaseE;
            ArrayList arrayList3 = new ArrayList();
            for (lhs lhsVar4 : arrayList2) {
                arrayList3.add((lhsVar4.b & 1) != 0 ? Integer.valueOf(lhsVar4.c) : null);
            }
            kro.i(str);
            lgpVarV.w();
            lgpVarV.o();
            SQLiteDatabase sQLiteDatabaseE4 = lgpVarV.e();
            try {
                long jC = lgpVarV.c("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, lgpVarV.G().C(str, lcl.af)));
                if (jC > iMax) {
                    ArrayList arrayList4 = new ArrayList();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList3.size()) {
                            sQLiteDatabaseE4.delete("audience_filter_values", a.bT('(' + TextUtils.join(",", arrayList4) + ')', "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList3.get(i7);
                        if (num == null) {
                            break;
                        }
                        arrayList4.add(Integer.toString(num.intValue()));
                        i7++;
                    }
                }
            } catch (SQLiteException e3) {
                lgpVarV.aT().c.c("Database error querying filters. appId", lcz.a(str), e3);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                builder.copyOnWrite();
                ((lie) builder.instance).g = lie.emptyProtobufList();
                byteArray = ((lie) builder.build()).toByteArray();
            } catch (RuntimeException e4) {
                aT().f.c("Unable to serialize reduced-size config. Storing full config instead. appId", lcz.a(str), e4);
                byteArray = bArr;
            }
            lgp lgpVarV2 = v();
            kro.i(str);
            lgpVarV2.o();
            lgpVarV2.w();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", byteArray);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (lgpVarV2.e().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    lgpVarV2.aT().c.b("Failed to update remote config (got 0). appId", lcz.a(str));
                }
            } catch (SQLiteException e5) {
                lgpVarV2.aT().c.c("Error storing remote config. appId", lcz.a(str), e5);
            }
            builder.copyOnWrite();
            ((lie) builder.instance).h = lie.emptyProtobufList();
            this.f.put(str, (lie) builder.build());
            return true;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabaseE;
        }
    }

    public final lgg r(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return lgg.AD_STORAGE;
        }
        if (i2 == 2) {
            return lgg.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return lgg.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return lgg.AD_PERSONALIZATION;
    }

    @Override // defpackage.lfo
    protected final void b() {
    }
}
