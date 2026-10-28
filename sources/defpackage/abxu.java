package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abxu {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public abxu(avlh avlhVar, avlh avlhVar2, awmd awmdVar, awmd awmdVar2, abmt abmtVar) {
        avlhVar.getClass();
        avlhVar2.getClass();
        abmtVar.getClass();
        this.a = avlhVar;
        this.b = avlhVar2;
        this.f = awmdVar;
        this.c = awmdVar2;
        this.d = abmtVar;
        avmm avmmVar = new avmm();
        this.e = avmmVar;
        if (abmtVar.aF()) {
            int i = 17;
            int i2 = 7;
            int i3 = 1;
            int i4 = 20;
            int i5 = 18;
            avmmVar.c(avlhVar.i(new abwr(i3)).ac(avlhVar2.H(new abqe(new yta(i), i2)), new vnc(new akm(i2), 5)).al(new absp(new abxt(this), i4), new absp(new yta(i5), i)));
            int i6 = 19;
            avmmVar.c(avlhVar2.p().W(new vvb(new abzr(i3), i2)).x(new wsh(new yta(i6), 14)).H(new abqe(new yta(i4), 6)).i(new abwr(i3)).al(new absp(new hho((Object) this, 15, (short[][][]) null), i5), new absp(new achf(i3), i6)));
        }
    }

    public static ContentValues n(aamq aamqVar, mbc mbcVar, aohm aohmVar) {
        ContentValues contentValues = new ContentValues();
        long epochMilli = mbcVar.f().toEpochMilli();
        contentValues.put("id", aamqVar.b);
        contentValues.put("type", Integer.valueOf(aamqVar.d));
        contentValues.put("size", Integer.valueOf(aamqVar.c));
        contentValues.put("selection_strategy", Integer.valueOf(aohmVar.e));
        contentValues.put("last_update_timestamp", Long.valueOf(epochMilli));
        return contentValues;
    }

    public final int a(String str) {
        Cursor cursorQuery = o().query("video_listsV13", new String[]{"source_ve_type"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            return cursorQuery.moveToNext() ? cursorQuery.getInt(0) : -1;
        } finally {
            cursorQuery.close();
        }
    }

    public final aamq b(String str) {
        Cursor cursorQuery = o().query("video_listsV13", aagd.a, "id = ?", new String[]{str}, null, null, null, null);
        try {
            return cursorQuery.moveToNext() ? zik.aY(cursorQuery, cursorQuery.getColumnIndexOrThrow("id"), cursorQuery.getColumnIndexOrThrow("size"), cursorQuery.getColumnIndexOrThrow("type")) : null;
        } finally {
            cursorQuery.close();
        }
    }

    public final aogf c(String str) {
        Cursor cursorQuery = o().query("video_listsV13", new String[]{"video_list_offline_request_source"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            aogf aogfVarA = cursorQuery.moveToNext() ? aogf.a(cursorQuery.getInt(0)) : null;
            if (aogfVarA == null) {
                aogfVarA = aogf.OFFLINE_REQUEST_SOURCE_UNKNOWN;
            }
            return aogfVarA;
        } finally {
            cursorQuery.close();
        }
    }

    public final aohm d(String str) {
        aohm aohmVar;
        Cursor cursorQuery = o().query("video_listsV13", new String[]{"selection_strategy"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (cursorQuery.moveToNext()) {
                int i = cursorQuery.getInt(0);
                if (i == 0) {
                    aohmVar = aohm.OFFLINE_VIDEO_SELECTION_STRATEGY_UNKNOWN;
                } else if (i == 1) {
                    aohmVar = aohm.OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_ALL_DEDUPE;
                } else if (i != 2) {
                    aohmVar = i != 3 ? null : aohm.OFFLINE_VIDEO_SELECTION_STRATEGY_INTERLEAVING_REMOVE_ADD_IN_ORDER_DEDUPE;
                } else {
                    aohmVar = aohm.OFFLINE_VIDEO_SELECTION_STRATEGY_REMOVE_ALL_ADD_IN_ORDER_DEDUPE;
                }
                if (aohmVar == null) {
                    aohmVar = aohm.OFFLINE_VIDEO_SELECTION_STRATEGY_UNKNOWN;
                }
            } else {
                aohmVar = aohm.OFFLINE_VIDEO_SELECTION_STRATEGY_UNKNOWN;
            }
            return aohmVar;
        } finally {
            cursorQuery.close();
        }
    }

    public final aohx e(String str) {
        Cursor cursorQuery = o().query("video_listsV13", new String[]{"format_type"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            return cursorQuery.moveToNext() ? aohx.a(cursorQuery.getInt(0)) : aohx.UNKNOWN_FORMAT_TYPE;
        } finally {
            cursorQuery.close();
        }
    }

    public final List f() {
        Cursor cursorQuery = o().query("video_listsV13", aagd.a, null, null, null, null, "saved_timestamp DESC", null);
        try {
            return zik.aZ(cursorQuery, cursorQuery.getColumnIndexOrThrow("id"), cursorQuery.getColumnIndexOrThrow("size"), cursorQuery.getColumnIndexOrThrow("type"));
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [awmd, java.lang.Object] */
    public final List g(String str) {
        Cursor cursorRawQuery = o().rawQuery(a.bT(tbd.c("videosV2", aagi.a), "SELECT video_list_videos.video_id,", " FROM video_list_videos LEFT OUTER JOIN videosV2 ON video_list_videos.video_id = videosV2.id WHERE video_list_videos.video_list_id = ? ORDER BY video_list_videos.index_in_video_list ASC"), new String[]{str});
        try {
            aalf aalfVar = (aalf) this.f.io();
            Object obj = this.b;
            cursorRawQuery.getClass();
            aalfVar.getClass();
            return aafz.b(cursorRawQuery, aalfVar, (axfd) obj, cursorRawQuery.getColumnIndexOrThrow("id"), cursorRawQuery.getColumnIndexOrThrow("offline_video_data_proto"), cursorRawQuery.getColumnIndexOrThrow("deleted"), cursorRawQuery.getColumnIndexOrThrow("channel_id"), cursorRawQuery.getColumnIndex("video_id"));
        } finally {
            cursorRawQuery.close();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void h(aagb aagbVar) {
        this.c.add(aagbVar);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public final void i(aamq aamqVar, List list) {
        SQLiteDatabase sQLiteDatabaseO = o();
        String str = aamqVar.b;
        sQLiteDatabaseO.delete("final_video_list_video_ids", "video_list_id = ?", new String[]{str});
        for (int i = 0; i < list.size(); i++) {
            String str2 = (String) list.get(i);
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_list_id", str);
            contentValues.put("video_id", str2);
            contentValues.put("index_in_video_list", Integer.valueOf(i));
            contentValues.put("saved_timestamp", Long.valueOf(this.d.f().toEpochMilli()));
            o().insertOrThrow("final_video_list_video_ids", null, contentValues);
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((aagb) it.next()).a(aamqVar, list);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, mbc] */
    public final void j(aamq aamqVar) {
        String str = aamqVar.b;
        long jUpdate = o().update("video_listsV13", n(aamqVar, this.d, d(str)), "id = ?", new String[]{str});
        if (jUpdate != 1) {
            throw new SQLException(a.cf(jUpdate, "Update video list affected ", " rows"));
        }
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public final void k(aamq aamqVar, List list, aamg aamgVar, aohx aohxVar, aodp aodpVar, int i, byte[] bArr) {
        abxu abxuVar = this;
        List list2 = list;
        aamq aamqVar2 = aamqVar;
        String str = aamqVar2.b;
        Collection collectionI = aabq.i(abxuVar.g(str), list2);
        abxuVar.o().delete("video_list_videos", "video_list_id = ?", new String[]{str});
        ?? r5 = abxuVar.c;
        for (aagb aagbVar : r5) {
            aihf aihfVarCreateBuilder = aoen.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aoen aoenVar = (aoen) aihfVarCreateBuilder.instance;
            aoenVar.b |= 2;
            aoenVar.d = str;
            aihfVarCreateBuilder.copyOnWrite();
            aoen aoenVar2 = (aoen) aihfVarCreateBuilder.instance;
            aoenVar2.e = 5;
            aoenVar2.b |= 4;
            aagbVar.b(collectionI, (aoen) aihfVarCreateBuilder.build());
        }
        HashSet hashSet = new HashSet();
        aohx aohxVar2 = aohxVar;
        int iA = aaus.a(aohxVar2, 360);
        int i2 = 0;
        while (i2 < list2.size()) {
            aamo aamoVar = (aamo) list2.get(i2);
            String strD = aamoVar.d();
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_list_id", str);
            contentValues.put("video_id", strD);
            contentValues.put("index_in_video_list", Integer.valueOf(i2));
            ?? r12 = abxuVar.d;
            contentValues.put("saved_timestamp", Long.valueOf(r12.f().toEpochMilli()));
            abxuVar.o().insertOrThrow("video_list_videos", null, contentValues);
            afip afipVar = (afip) abxuVar.e;
            if (!afipVar.X(strD)) {
                afipVar.Z(aamoVar, aamgVar, aamn.OFFLINE_IMMEDIATELY, iA, aodpVar, i, r12.f().toEpochMilli(), bArr);
                hashSet.add(strD);
            }
            i2++;
            abxuVar = this;
        }
        Iterator it = r5.iterator();
        while (it.hasNext()) {
            HashSet hashSet2 = hashSet;
            ((aagb) it.next()).c(aamqVar2, list2, hashSet2, aohxVar2, i, bArr, aamgVar, aamn.OFFLINE_IMMEDIATELY);
            aamqVar2 = aamqVar;
            list2 = list;
            aohxVar2 = aohxVar;
            hashSet = hashSet2;
        }
    }

    public final boolean l(String str) {
        boolean zStartsWith;
        Cursor cursorQuery = o().query("video_list_videos", new String[]{"video_list_id"}, "video_id = ?", new String[]{str}, null, null, null);
        do {
            try {
                zStartsWith = false;
                if (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    if (!TextUtils.isEmpty(string)) {
                        zStartsWith = string.startsWith("offline_candidate_video_list_");
                    }
                }
                return zStartsWith;
            } finally {
                cursorQuery.close();
            }
        } while (!zStartsWith);
        zStartsWith = true;
        return zStartsWith;
    }

    public final byte[] m(String str) {
        Cursor cursorQuery = o().query("video_listsV13", new String[]{"tracking_params"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            return cursorQuery.moveToNext() ? cursorQuery.getBlob(0) : null;
        } finally {
            cursorQuery.close();
        }
    }

    public final SQLiteDatabase o() {
        return ((aaev) this.a).d();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [awmd, java.lang.Object] */
    public final adfs p(xgn xgnVar) {
        Context context = (Context) this.c.io();
        context.getClass();
        Optional optional = (Optional) this.e.io();
        optional.getClass();
        xgnVar.getClass();
        vxz vxzVar = (vxz) this.d.io();
        vxzVar.getClass();
        tqj tqjVar = (tqj) this.b.io();
        tqjVar.getClass();
        vxz vxzVar2 = (vxz) this.a.io();
        vxzVar2.getClass();
        return new adfs(context, optional, vxzVar, tqjVar, vxzVar2, (vxz) this.f.io(), xgnVar, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [awmd, java.lang.Object] */
    public final vph q(wnf wnfVar, xgn xgnVar, vnb vnbVar) {
        jaz jazVar = (jaz) this.a.io();
        jazVar.getClass();
        srq srqVar = (srq) this.c.io();
        ((tbt) this.d.io()).getClass();
        ((ttm) this.f.io()).getClass();
        ((vxu) this.b.io()).getClass();
        xgnVar.getClass();
        return new vph(jazVar, srqVar, wnfVar, xgnVar, vnbVar);
    }

    public final Object r(int i) {
        if (i == 1) {
            return this.a;
        }
        if (i == 2) {
            return this.f;
        }
        if (i != 3) {
            return i != 4 ? this.d : this.e;
        }
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tqj] */
    public final ahex s() {
        int i = tqr.a;
        int iA = this.b.a(1073945405);
        if (iA <= 0 || iA > 5) {
            iA = 3;
        }
        return (ahex) r(iA);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final abxu t() {
        return (abxu) this.b.io();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final abxu u() {
        return (abxu) this.c.io();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final abxu v() {
        return (abxu) this.e.io();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final abxu w() {
        return (abxu) this.f.io();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final abxu x() {
        return (abxu) this.a.io();
    }

    public abxu(tqj tqjVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.b = tqjVar;
        this.a = obj;
        this.f = obj2;
        this.c = obj3;
        this.e = obj4;
        this.d = obj5;
    }

    public abxu(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.a = awmdVar;
        this.c = awmdVar2;
        this.e = awmdVar3;
        awmdVar4.getClass();
        this.d = awmdVar4;
        this.f = awmdVar5;
        awmdVar6.getClass();
        this.b = awmdVar6;
    }

    public abxu(tqj tqjVar, avmb avmbVar, avmb avmbVar2, avmb avmbVar3, avmb avmbVar4, avmb avmbVar5) {
        this(tqjVar, (Object) avmbVar, (Object) avmbVar2, (Object) avmbVar3, (Object) avmbVar4, (Object) avmbVar5);
        avmb avmbVar6 = awlg.a;
        int i = awir.d;
    }

    public abxu(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, byte[] bArr) {
        awmdVar.getClass();
        this.f = awmdVar;
        awmdVar2.getClass();
        this.d = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.b = awmdVar5;
        awmdVar6.getClass();
        this.e = awmdVar6;
    }

    public abxu(aaev aaevVar, awmd awmdVar, axfd axfdVar, afip afipVar, mbc mbcVar) {
        this.a = aaevVar;
        this.f = awmdVar;
        this.b = axfdVar;
        this.e = afipVar;
        this.d = mbcVar;
        this.c = new ArrayList();
    }

    public abxu(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, char[] cArr) {
        this.c = awmdVar;
        this.b = awmdVar2;
        this.d = awmdVar3;
        this.e = awmdVar4;
        this.f = awmdVar5;
        this.a = awmdVar6;
    }

    public abxu(abmt abmtVar, aunn aunnVar, acjs acjsVar, aunn aunnVar2, avlh avlhVar) {
        abmtVar.getClass();
        aunnVar.getClass();
        aunnVar2.getClass();
        avlhVar.getClass();
        this.b = abmtVar;
        this.e = aunnVar;
        this.c = acjsVar;
        this.d = aunnVar2;
        this.a = avlhVar;
        this.f = new ConcurrentHashMap();
        avlhVar.ak(new acae(new rri(this, 11), 14));
    }

    public abxu(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.e = awmdVar2;
        this.d = awmdVar3;
        awmdVar4.getClass();
        this.b = awmdVar4;
        awmdVar5.getClass();
        this.a = awmdVar5;
        awmdVar6.getClass();
        this.f = awmdVar6;
    }
}
