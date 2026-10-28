package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aadu implements aaqq {
    static final long a;
    private static final agrf i = agrf.h("com/google/android/libraries/youtube/offline/client/DefaultOfflineVideoListStore");
    public final awmd b;
    public final awmd c;
    public final awmd d;
    public final mbc e;
    public final aadt f;
    public final aado g;
    public final abxv h;
    private final awmd j;
    private final awmd k;
    private final awmd l;
    private final awmd m;
    private final vyo n;
    private final awmd o;
    private final vxz p;
    private final abfv q;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        a = 120000L;
    }

    public aadu(awmd awmdVar, aado aadoVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, vyo vyoVar, abfv abfvVar, abxv abxvVar, mbc mbcVar, awmd awmdVar8, vxz vxzVar, aauk aaukVar) {
        this.j = awmdVar;
        this.g = aadoVar;
        this.b = awmdVar2;
        this.k = awmdVar3;
        this.l = awmdVar4;
        this.m = awmdVar5;
        this.c = awmdVar6;
        this.d = awmdVar7;
        this.n = vyoVar;
        this.q = abfvVar;
        this.h = abxvVar;
        this.e = mbcVar;
        this.o = awmdVar8;
        this.p = vxzVar;
        aaukVar.A();
        this.f = new aadt(this);
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.List] */
    private final synchronized void k(String str, aoen aoenVar) {
        SQLiteDatabase sQLiteDatabaseV;
        try {
            typ.f(str);
            sQLiteDatabaseV = ((aagg) this.d.io()).v();
            sQLiteDatabaseV.beginTransaction();
            try {
                abxu abxuVar = (abxu) this.c.io();
                long jDelete = abxuVar.o().delete("video_listsV13", "id = ?", new String[]{str});
                if (jDelete != 1) {
                    throw new SQLException(a.cf(jDelete, "Delete video list affected ", " rows"));
                }
                List listG = abxuVar.g(str);
                abxuVar.o().delete("video_list_videos", "video_list_id = ?", new String[]{str});
                Iterator it = abxuVar.c.iterator();
                while (it.hasNext()) {
                    ((aagb) it.next()).b(listG, aoenVar);
                }
                sQLiteDatabaseV.setTransactionSuccessful();
                if (!this.p.l(18, 45631007L, false)) {
                    this.g.y(new aaib(str));
                }
                sQLiteDatabaseV.endTransaction();
            } catch (SQLException e) {
                ((agrc) ((agrc) ((agrc) i.b()).j(e)).k("com/google/android/libraries/youtube/offline/client/DefaultOfflineVideoListStore", "deleteVideoList", 673, "DefaultOfflineVideoListStore.java")).w("Error deleting video list %s from database", str);
            }
        } catch (Throwable th) {
            sQLiteDatabaseV.endTransaction();
            throw th;
        }
    }

    private final synchronized boolean l(aamq aamqVar, List list) {
        boolean z;
        SQLiteDatabase sQLiteDatabaseV = ((aagg) this.d.io()).v();
        sQLiteDatabaseV.beginTransaction();
        try {
            ((abxu) this.c.io()).i(aamqVar, list);
            sQLiteDatabaseV.setTransactionSuccessful();
            z = true;
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) i.b()).j(e)).k("com/google/android/libraries/youtube/offline/client/DefaultOfflineVideoListStore", "updateFinalVideoListVideos", 1078, "DefaultOfflineVideoListStore.java")).t("Error syncing final video list videos");
            z = false;
        } finally {
            sQLiteDatabaseV.endTransaction();
        }
        return z;
    }

    private final synchronized boolean m(aamq aamqVar, List list, aamg aamgVar, aohx aohxVar, int i2, byte[] bArr) {
        boolean z;
        SQLiteDatabase sQLiteDatabaseV = ((aagg) this.d.io()).v();
        sQLiteDatabaseV.beginTransaction();
        try {
            abxu abxuVar = (abxu) this.c.io();
            abxuVar.k(aamqVar, list, aamgVar, aohxVar, ((aaqg) this.j.io()).d(aohxVar), i2, bArr);
            abxuVar.j(aamqVar);
            sQLiteDatabaseV.setTransactionSuccessful();
            z = true;
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) i.b()).j(e)).k("com/google/android/libraries/youtube/offline/client/DefaultOfflineVideoListStore", "updateVideoListVideos", 1022, "DefaultOfflineVideoListStore.java")).t("Error syncing playlist");
            z = false;
        } finally {
            sQLiteDatabaseV.endTransaction();
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, mbc] */
    private final void n(aamq aamqVar, aogf aogfVar) {
        this.q.q(true);
        try {
            abxu abxuVar = (abxu) this.c.io();
            ?? r1 = abxuVar.d;
            ContentValues contentValues = new ContentValues();
            long epochMilli = r1.f().toEpochMilli();
            contentValues.put("id", aamqVar.b);
            contentValues.put("type", Integer.valueOf(aamqVar.d));
            contentValues.put("size", Integer.valueOf(aamqVar.c));
            Long lValueOf = Long.valueOf(epochMilli);
            contentValues.put("last_update_timestamp", lValueOf);
            contentValues.put("saved_timestamp", lValueOf);
            contentValues.put("video_list_offline_request_source", Integer.valueOf(aogfVar.e));
            abxuVar.o().insertOrThrow("video_listsV13", null, contentValues);
            ((aagg) this.d.io()).j(aamqVar, Collections.EMPTY_LIST, null, aogfVar);
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) i.b()).j(e)).k("com/google/android/libraries/youtube/offline/client/DefaultOfflineVideoListStore", "insertVideoListInternal", (char) 389, "DefaultOfflineVideoListStore.java")).t("Error inserting offline video list.");
        }
    }

    @Override // defpackage.aaqq
    public final aamq a(String str) {
        taq.c();
        if (this.g.C()) {
            return ((abxu) this.c.io()).b(str);
        }
        return null;
    }

    @Override // defpackage.aaqq
    public final Collection b() {
        if (!this.g.C()) {
            return agpi.a;
        }
        aagn aagnVarA = ((aagg) this.d.io()).a();
        LinkedList linkedList = new LinkedList();
        if (aagnVarA.l) {
            Iterator it = aagnVarA.d.values().iterator();
            while (it.hasNext()) {
                linkedList.add(((aagm) it.next()).a());
            }
            return linkedList;
        }
        synchronized (aagnVarA.k) {
            Iterator it2 = aagnVarA.d.values().iterator();
            while (it2.hasNext()) {
                linkedList.add(((aagm) it2.next()).a());
            }
        }
        return linkedList;
    }

    @Override // defpackage.aaqq
    public final Set c(String str) {
        agkz agkzVarQ;
        HashSet hashSet;
        if (!this.g.C()) {
            return agpr.a;
        }
        aagn aagnVarA = ((aagg) this.d.io()).a();
        if (aagnVarA.l) {
            typ.f(str);
            synchronized (aagnVarA.k) {
                agkzVarQ = tym.Q(aagnVarA.i, str);
            }
            if (agkzVarQ.isEmpty()) {
                return new HashSet();
            }
            HashSet hashSet2 = new HashSet();
            Iterator it = agkzVarQ.iterator();
            while (it.hasNext()) {
                aagl aaglVar = (aagl) aagnVarA.b.get((String) it.next());
                if (aaglVar != null) {
                    hashSet2.add(aaglVar.e());
                }
            }
            return hashSet2;
        }
        synchronized (aagnVarA.k) {
            typ.f(str);
            hashSet = new HashSet();
            Set setV = tym.V(aagnVarA.i, str);
            if (setV != null && !setV.isEmpty()) {
                Iterator it2 = setV.iterator();
                while (it2.hasNext()) {
                    aagl aaglVar2 = (aagl) aagnVarA.b.get((String) it2.next());
                    if (aaglVar2 != null) {
                        aaglVar2.e();
                        hashSet.add(aaglVar2.e());
                    }
                }
            }
        }
        return hashSet;
    }

    @Override // defpackage.aaqq
    public final void d(String str, aoen aoenVar) {
        this.g.u(new yag((Object) this, (Object) str, (Object) aoenVar, 19, (char[]) null));
    }

    public final void e(String str, aoen aoenVar) {
        taq.c();
        if (((abxu) this.c.io()).b(str) != null) {
            k(str, aoenVar);
        }
    }

    @Override // defpackage.aaqq
    public final List f() {
        taq.c();
        if (!this.g.C()) {
            return agpi.a;
        }
        Cursor cursorQuery = ((abxu) this.c.io()).o().query("video_listsV13", aagd.a, "type = ?", new String[]{"1"}, null, null, "saved_timestamp DESC", null);
        try {
            return zik.aZ(cursorQuery, cursorQuery.getColumnIndexOrThrow("id"), cursorQuery.getColumnIndexOrThrow("size"), cursorQuery.getColumnIndexOrThrow("type"));
        } finally {
            cursorQuery.close();
        }
    }

    @Override // defpackage.aaqq
    public final void g(aamq aamqVar, aogf aogfVar) {
        taq.c();
        if (this.g.C()) {
            n(aamqVar, aogfVar);
        }
    }

    @Override // defpackage.aaqq
    public final void h(String str, List list) {
        this.g.u(new aads(this, str, list, aohm.OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_ALL_DEDUPE, ((aaqg) this.j.io()).e(), aamn.OFFLINE_IMMEDIATELY, vzh.b, 0));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:98:0x02b9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v30, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [aazo] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v33, types: [aazo] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, java.util.List] */
    public final void i(String str, List list, aohm aohmVar, long j, boolean z, aohx aohxVar, aamn aamnVar, int i2, byte[] bArr) {
        boolean z2;
        boolean z3;
        boolean z4;
        aaqp aaqpVarO;
        boolean zM;
        long j2;
        ?? r20;
        taq.c();
        aohm aohmVar2 = aohm.OFFLINE_VIDEO_SELECTION_STRATEGY_INTERLEAVING_REMOVE_ADD_IN_ORDER_DEDUPE;
        aohm aohmVar3 = aohmVar;
        if (aohmVar3 == aohmVar2) {
            aoev aoevVar = this.n.b().i;
            if (aoevVar == null) {
                aoevVar = aoev.a;
            }
            if (!z && !aoevVar.g) {
                aohmVar3 = aohm.OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_ALL_DEDUPE;
            }
        }
        aohm aohmVar4 = aohmVar3;
        aaok aaokVarJ = j(str);
        if (aaokVarJ != null) {
            aodp aodpVarD = ((aaqg) this.j.io()).d(aohxVar);
            abxu abxuVar = (abxu) this.c.io();
            ?? r5 = abxuVar.d;
            Object aamqVar = aaokVarJ.b;
            aamq aamqVar2 = (aamq) aamqVar;
            long jUpdate = abxuVar.o().update("video_listsV13", abxu.n(aamqVar2, r5, aohmVar4), "id = ?", new String[]{aamqVar2.b});
            if (jUpdate != 1) {
                throw new SQLException(a.cf(jUpdate, "Update video list affected ", " rows"));
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("format_type", Integer.valueOf(aohxVar.l));
            long jUpdate2 = abxuVar.o().update("video_listsV13", contentValues, "id = ?", new String[]{str});
            if (jUpdate2 != 1) {
                throw new SQLException(a.cf(jUpdate2, "Update video list affected ", " rows"));
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put(gzj.OFFLINE_AUDIO_QUALITY, Integer.valueOf(aodpVarD.e));
            long jUpdate3 = abxuVar.o().update("video_listsV13", contentValues2, "id = ?", new String[]{str});
            if (jUpdate3 != 1) {
                throw new SQLException(a.cf(jUpdate3, "Update video list affected ", " rows"));
            }
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("stream_transfer_condition", Integer.valueOf(aamnVar.h));
            long jUpdate4 = abxuVar.o().update("video_listsV13", contentValues3, "id = ?", new String[]{str});
            if (jUpdate4 != 1) {
                throw new SQLException(a.cf(jUpdate4, "Update video list affected ", " rows"));
            }
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("source_ve_type", Integer.valueOf(i2));
            long jUpdate5 = abxuVar.o().update("video_listsV13", contentValues4, "id = ?", new String[]{str});
            if (jUpdate5 != 1) {
                throw new SQLException(a.cf(jUpdate5, "Update video list affected ", " rows"));
            }
            ContentValues contentValues5 = new ContentValues();
            contentValues5.put("tracking_params", bArr);
            long jUpdate6 = abxuVar.o().update("video_listsV13", contentValues5, "id = ?", new String[]{str});
            if (jUpdate6 != 1) {
                throw new SQLException(a.cf(jUpdate6, "Update video list affected ", " rows"));
            }
            awmd awmdVar = this.b;
            if (z) {
                ?? r2 = (aazo) awmdVar.io();
                ?? r7 = aaokVarJ.a;
                ahno.F(str != null);
                String str2 = true != ahno.aa(null) ? null : str;
                str2.getClass();
                HashSet hashSet = new HashSet();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (aohmVar4 == aohmVar2) {
                    str.getClass();
                    aaok aaokVarAa = ((aaew) r2.a.io()).aa(str);
                    if (aaokVarAa != null) {
                        ?? r11 = aaokVarAa.d;
                        r11.getClass();
                        long j3 = true != r2.n(r11) ? j : Long.MIN_VALUE;
                        long j4 = 0;
                        for (String str3 : r7) {
                            if (j3 >= 0) {
                                break;
                            }
                            if (!r11.contains(str3)) {
                                long jM = r2.m(str3, null, str);
                                j3 += jM;
                                j4 -= jM;
                                hashSet.add(str3);
                            }
                        }
                        for (String str4 : r7) {
                            if (!hashSet.contains(str4)) {
                                arrayList2.add(str4);
                            }
                        }
                        r20 = r11;
                        j2 = j4;
                    } else {
                        j2 = 0;
                        r20 = arrayList;
                    }
                } else {
                    j2 = 0;
                    r20 = arrayList;
                }
                aaqpVarO = arrayList2.isEmpty() ? new aaqp(str2, hashSet, linkedHashSet, r20, null, j2) : new aaqp(str2, hashSet, linkedHashSet, r20, arrayList2, j2);
                z4 = true;
            } else {
                ?? r1 = (aazo) awmdVar.io();
                ?? r4 = aaokVarJ.a;
                if (aamnVar == aamn.DEFER_FOR_DISCOUNTED_DATA) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                z4 = z2;
                aaqpVarO = r1.o(null, str, r4, list, aohmVar4, bArr, z3, j, aohxVar, aodpVarD);
            }
            aaqp aaqpVar = aaqpVarO;
            HashMap map = new HashMap();
            for (String str5 : aaokVarJ.a) {
                aamt aamtVarB = ((aady) this.m.io()).b(str5, z4);
                if (aamtVarB != null) {
                    map.put(str5, aamtVarB.a);
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aamo aamoVar = (aamo) it.next();
                map.put(aamoVar.d(), aamoVar);
            }
            List listC = aaqpVar.c(str);
            if (listC != null) {
                if (listC.size() != aamqVar2.c) {
                    aamqVar = new aamq(aamqVar2, listC.size());
                }
                ArrayList arrayList3 = new ArrayList();
                aamq aamqVar3 = (aamq) aamqVar;
                String str6 = aamqVar3.b;
                List<String> listC2 = aaqpVar.c(str6);
                if (listC2 != null) {
                    for (String str7 : listC2) {
                        if (map.containsKey(str7)) {
                            arrayList3.add((aamo) map.get(str7));
                        } else {
                            ((agrc) ((agrc) i.b()).k("com/google/android/libraries/youtube/offline/client/DefaultOfflineVideoListStore", "updateVideoListAndFinalVideoListInDb", 982, "DefaultOfflineVideoListStore.java")).w("UpdateVideoList: no video model found for %s", str7);
                        }
                    }
                    if (m(aamqVar3, arrayList3, aamg.ACTIVE, aohxVar, i2, bArr) && l(aamqVar3, aaqpVar.b(str6))) {
                        zM = true;
                    } else {
                        zM = false;
                    }
                } else {
                    zM = false;
                }
            } else {
                List listB = aaqpVar.b(str);
                if (listB.size() != aamqVar2.c) {
                    aamqVar = new aamq(aamqVar2, listB.size());
                }
                ArrayList arrayList4 = new ArrayList();
                aamq aamqVar4 = (aamq) aamqVar;
                for (String str8 : aaqpVar.b(aamqVar4.b)) {
                    if (map.containsKey(str8)) {
                        arrayList4.add((aamo) map.get(str8));
                    } else {
                        ((agrc) ((agrc) i.b()).k("com/google/android/libraries/youtube/offline/client/DefaultOfflineVideoListStore", "updateVideoListInDb", 952, "DefaultOfflineVideoListStore.java")).w("UpdateVideoList: no video model found for %s", str8);
                    }
                }
                zM = m(aamqVar4, arrayList4, aamg.ACTIVE, aohxVar, i2, bArr);
            }
            if (!zM) {
                ((agrc) ((agrc) i.b()).k("com/google/android/libraries/youtube/offline/client/DefaultOfflineVideoListStore", "updateVideoListInBackground", 825, "DefaultOfflineVideoListStore.java")).w("Failed syncing video list %s to database", str);
                return;
            }
            if (!this.p.l(18, 45631007L, false)) {
                this.g.y(new aaic(str));
            }
            HashSet hashSet2 = new HashSet();
            Iterator it2 = aaqpVar.a(str).iterator();
            while (it2.hasNext()) {
                hashSet2.add(((aamo) it2.next()).d());
            }
            aady aadyVar = (aady) this.m.io();
            aaqx aaqxVar = (aaqx) this.o.io();
            aaqxVar.f(aadyVar.s().size());
            aaqz aaqzVarB = aaqxVar.b();
            aaqzVarB.c(hashSet2);
            aadyVar.o(aaqzVarB.a());
            ((elr) this.l.io()).o(list);
            aerj aerjVar = (aerj) this.k.io();
            Iterator it3 = aaqpVar.a(str).iterator();
            while (it3.hasNext()) {
                aodp aodpVar = aodpVarD;
                aerjVar.j(((aamo) it3.next()).d(), null, str, aohxVar, null, aodpVar, aamnVar, 1, true, false, false, false, 1);
                String str9 = str;
                aodpVarD = aodpVar;
            }
        }
    }

    public final aaok j(String str) {
        aagm aagmVarT;
        if (!this.g.C() || TextUtils.isEmpty(str) || (aagmVarT = ((aagg) this.d.io()).t(str)) == null) {
            return null;
        }
        return aagmVarT.a();
    }
}
