package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import android.util.SparseArray;
import com.youtube.android.libraries.elements.StatusOr;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaew extends aaex {
    private static final agrf l = agrf.h("com/google/android/libraries/youtube/offline/database/OfflineDbHelper");
    public final List a;
    public final aagg b;
    private final aauk m;
    private final wjb n;
    private final tqj o;
    private final boolean p;
    private final isi q;

    public aaew(aalf aalfVar, aafw aafwVar, axfd axfdVar, afip afipVar, aafj aafjVar, abxu abxuVar, aafy aafyVar, aaem aaemVar, aagg aaggVar, mbc mbcVar, wjb wjbVar, aauk aaukVar, isi isiVar, tqj tqjVar) {
        super(aalfVar, aafwVar, axfdVar, afipVar, aafjVar, abxuVar, aafyVar, aaemVar, mbcVar);
        this.b = aaggVar;
        this.p = aaukVar.H();
        this.a = new ArrayList();
        this.n = wjbVar;
        this.m = aaukVar;
        this.q = isiVar;
        this.o = tqjVar;
    }

    private final void aw(aamo aamoVar) {
        if (aamoVar.a) {
            return;
        }
        try {
            this.f.a(aamoVar.d());
            this.j.R(aamoVar);
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "deleteVideoMetadata", (char) 1709, "OfflineDbHelper.java")).t("Error cleaning up video");
        }
    }

    private final synchronized void ax(aamo aamoVar) {
        if (!aamoVar.a) {
            this.e.p().delete("playlist_video", "video_id = ?", new String[]{aamoVar.d()});
            ay(aamoVar);
            afip afipVar = this.j;
            if (afipVar.X(aamoVar.d())) {
                K(aamoVar.d());
                afipVar.R(aamoVar);
            }
        }
    }

    private final synchronized void ay(aamo aamoVar) {
        aodp aodpVarA;
        try {
            if (!aamoVar.a) {
                aagg aaggVar = this.b;
                for (String str : aaggVar.d(aamoVar.d())) {
                    abxu abxuVar = this.i;
                    List listG = abxuVar.g(str);
                    Iterator it = listG.iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        if (((aamo) it.next()).d().equals(aamoVar.d())) {
                            it.remove();
                            z = true;
                        }
                    }
                    if (z) {
                        Cursor cursorQuery = abxuVar.o().query("final_video_list_video_ids", aaga.a, "video_list_id = ?", new String[]{str}, null, null, "index_in_video_list ASC", null);
                        try {
                            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                            while (cursorQuery.moveToNext()) {
                                arrayList.add(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("video_id")));
                            }
                            cursorQuery.close();
                            aamq aamqVarB = abxuVar.b(str);
                            if (aamqVarB == null) {
                                continue;
                            } else {
                                boolean z2 = aamqVarB.d == 2;
                                aamq aamqVar = new aamq(aamqVarB, listG.size());
                                abxuVar.j(aamqVar);
                                aamg aamgVar = z2 ? aamg.METADATA_ONLY : aamg.ACTIVE;
                                aohx aohxVarE = abxuVar.e(str);
                                Cursor cursorQuery2 = abxuVar.o().query("video_listsV13", new String[]{gzj.OFFLINE_AUDIO_QUALITY}, "id = ?", new String[]{str}, null, null, null, null);
                                try {
                                    if (!cursorQuery2.moveToNext() || (aodpVarA = aodp.a(cursorQuery2.getInt(0))) == null) {
                                        aodpVarA = aodp.OFFLINE_AUDIO_QUALITY_UNKNOWN;
                                    }
                                    cursorQuery2.close();
                                    abxuVar.k(aamqVar, listG, aamgVar, aohxVarE, aodpVarA, abxuVar.a(str), abxuVar.m(str));
                                    if (!arrayList.isEmpty()) {
                                        arrayList.removeAll(Collections.singleton(aamoVar.d()));
                                        abxuVar.i(aamqVar, arrayList);
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it2 = listG.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(((aamo) it2.next()).d());
                                    }
                                    aogf aogfVarC = abxuVar.c(str);
                                    if (true == z2) {
                                        arrayList = null;
                                    }
                                    aaggVar.j(aamqVar, arrayList2, arrayList, aogfVarC);
                                } catch (Throwable th) {
                                    cursorQuery2.close();
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            cursorQuery.close();
                            throw th2;
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private final SQLiteDatabase az() {
        aagg aaggVar = this.b;
        aaggVar.o();
        return aaggVar.d.d();
    }

    public final synchronized boolean A(String str, boolean z, aoen aoenVar) {
        boolean z2;
        typ.f(str);
        aafj aafjVar = this.e;
        aamo aamoVarN = aafjVar.d.N(str);
        if (aamoVarN == null) {
            z2 = false;
        } else {
            aafjVar.m(str);
            if (z) {
                if (aoenVar == null) {
                    aihf aihfVarCreateBuilder = aoen.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    aoen aoenVar2 = (aoen) aihfVarCreateBuilder.instance;
                    str.getClass();
                    aoenVar2.b |= 1;
                    aoenVar2.c = str;
                    aoenVar = (aoen) aihfVarCreateBuilder.build();
                }
                Iterator it = aafjVar.c.iterator();
                while (it.hasNext()) {
                    ((aafg) it.next()).b(agke.q(aamoVarN), aoenVar);
                }
            }
            z2 = true;
        }
        aagg aaggVar = this.b;
        aaggVar.a().i(str);
        for (hzo hzoVar : aaggVar.g) {
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r4v14, types: [aunn, java.lang.Object] */
    public final synchronized boolean B(String str, wjf wjfVar, long j, boolean z, wjb wjbVar) {
        wjf wjfVarAk;
        long jA;
        long j2;
        byte[] bArr;
        wjfVar.getClass();
        aagl aaglVarS = this.b.s(str);
        if (aaglVarS == null) {
            return false;
        }
        try {
            isi isiVar = this.q;
            if (((aauk) isiVar.a).b.l(91, 45461011L, false)) {
                ?? r4 = isiVar.b;
                if (((Optional) r4.io()).isEmpty()) {
                    wjfVarAk = wjfVar;
                } else {
                    StatusOr statusOrRehydrateResponse = ((adak) ((Optional) r4.io()).get()).b().rehydrateResponse(wjfVar.ac());
                    if (!statusOrRehydrateResponse.hasValue || (bArr = (byte[]) statusOrRehydrateResponse.value) == null) {
                        wjfVarAk = wjfVar;
                    } else {
                        ?? r2 = isiVar.c;
                        int i = tqr.a;
                        wjfVarAk = r2.k(1073828980) ? wji.ak(bArr, wjfVar.e()) : wji.aj(bArr, wjfVar.e());
                        if (wjfVarAk == null) {
                            wjfVarAk = wjfVar;
                        }
                    }
                }
            } else {
                wjfVarAk = wjfVar;
            }
            aihh aihhVar = (aihh) wjfVarAk.u().toBuilder();
            aihhVar.copyOnWrite();
            ((alvt) aihhVar.instance).m = alvt.emptyProtobufList();
            wjf wjiVar = new wji((alvt) aihhVar.build(), wjfVarAk.e(), wjbVar);
            afip afipVar = this.j;
            afipVar.P(wjiVar);
            if (z) {
                jA = j;
                j2 = jA;
            } else {
                jA = aaglVarS.a();
                j2 = j;
            }
            afipVar.W(str, wjiVar, jA, j2);
            aauk aaukVar = this.m;
            if (aaukVar.o()) {
                wjiVar = isi.J(wjiVar, wjbVar);
            }
            if (aaukVar.x()) {
                wjiVar = isi.H(wjiVar, wjbVar);
            }
            wjf wjfVar2 = wjiVar;
            aaglVarS.l(wjfVar2, jA, j);
            for (hxh hxhVar : this.a) {
                aogq aogqVarV = wjfVar2.v();
                if (aogqVarV != null) {
                    long j3 = aogqVarV.f;
                    Object obj = hxhVar.a;
                    aaqg aaqgVar = (aaqg) ((aado) obj).f.io();
                    String str2 = ((aado) obj).b;
                    long jQ = aaqgVar.q(str2);
                    if (j3 > 0 && (jQ == 0 || j3 < jQ)) {
                        ((aado) obj).g.f(str2, j3);
                    }
                    ((aalt) ((aado) obj).m.io()).a();
                }
            }
            return true;
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "updatePlayerResponse", (char) 1068, "OfflineDbHelper.java")).t("Error inserting player response");
            return false;
        }
    }

    public final boolean C(String str, aogf aogfVar) {
        typ.f(str);
        aagj aagjVarQ = this.b.q(str);
        if (aagjVarQ == null) {
            return false;
        }
        try {
            aafj aafjVar = this.e;
            ContentValues contentValues = new ContentValues();
            contentValues.put("playlist_offline_request_source", Integer.valueOf(aogfVar.e));
            long jUpdate = aafjVar.p().update("playlistsV13", contentValues, "id = ?", new String[]{str});
            if (jUpdate != 1) {
                throw new SQLException(a.cf(jUpdate, "Update playlist offline request source ", " rows"));
            }
            synchronized (aagjVarQ.c.k) {
                try {
                    aagjVarQ.b = aogfVar;
                    aagjVarQ.c();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "updatePlaylistOfflineRequestSource", (char) 347, "OfflineDbHelper.java")).t("Error updating playlist offline request source");
            return false;
        }
    }

    public final boolean D(aamh aamhVar, List list, aohx aohxVar, aodp aodpVar, Set set, aamn aamnVar, int i, byte[] bArr, boolean z) {
        String str;
        List list2 = list;
        Set set2 = set;
        aamhVar.getClass();
        list2.getClass();
        SQLiteDatabase sQLiteDatabaseAz = az();
        sQLiteDatabaseAz.beginTransaction();
        boolean z2 = false;
        try {
            try {
                aafj aafjVar = this.e;
                String str2 = aamhVar.a;
                Collection collectionH = aafjVar.h(str2, list2);
                aafjVar.p().delete("playlist_video", "playlist_id = ?", new String[]{str2});
                if (z) {
                    for (aafg aafgVar : aafjVar.c) {
                        aihf aihfVarCreateBuilder = aoen.a.createBuilder();
                        aihfVarCreateBuilder.copyOnWrite();
                        aoen aoenVar = (aoen) aihfVarCreateBuilder.instance;
                        aoenVar.b |= 2;
                        aoenVar.d = str2;
                        aihfVarCreateBuilder.copyOnWrite();
                        aoen aoenVar2 = (aoen) aihfVarCreateBuilder.instance;
                        aoenVar2.e = 5;
                        aoenVar2.b |= 4;
                        aafgVar.b(collectionH, (aoen) aihfVarCreateBuilder.build());
                    }
                }
                String str3 = "OfflineDbHelper.java";
                try {
                    HashSet hashSet = new HashSet();
                    int i2 = 0;
                    while (i2 < list2.size()) {
                        aamo aamoVar = (aamo) list2.get(i2);
                        String strD = aamoVar.d();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("playlist_id", str2);
                        contentValues.put("video_id", strD);
                        contentValues.put("index_in_playlist", Integer.valueOf(i2));
                        contentValues.put("saved_timestamp", Long.valueOf(aafjVar.a.f().toEpochMilli()));
                        aafjVar.p().insertOrThrow("playlist_video", null, contentValues);
                        int i3 = i2;
                        afip afipVar = aafjVar.d;
                        if (afipVar.Y(strD, set2.contains(strD))) {
                            hashSet.add(strD);
                        }
                        if (z) {
                            afipVar.S(aamoVar, aamnVar, aohxVar, aodpVar, i, bArr, set2.contains(strD) ? aamg.ACTIVE : aamg.STREAM_DOWNLOAD_PENDING);
                        }
                        i2 = i3 + 1;
                    }
                    Iterator it = aafjVar.c.iterator();
                    while (it.hasNext()) {
                        aafj aafjVar2 = aafjVar;
                        String str4 = str2;
                        str = str3;
                        try {
                            ((aafg) it.next()).c(aamhVar, list2, hashSet, aohxVar, i, bArr, set2, aamnVar, z);
                            list2 = list;
                            set2 = set;
                            str3 = str;
                            aafjVar = aafjVar2;
                            str2 = str4;
                        } catch (SQLException e) {
                            e = e;
                            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "updatePlaylistVideos", 911, str)).t("Error syncing playlist");
                            sQLiteDatabaseAz.endTransaction();
                            return z2;
                        }
                    }
                    aafj aafjVar3 = aafjVar;
                    String str5 = str2;
                    int iA = aaus.a(aohxVar, 360);
                    ContentValues contentValuesE = aafj.e(aamhVar, aafjVar3.a);
                    contentValuesE.put("preferred_stream_quality", Integer.valueOf(iA));
                    contentValuesE.put("offline_source_ve_type", Integer.valueOf(i));
                    if (bArr != null) {
                        contentValuesE.put("player_response_tracking_params", bArr);
                    }
                    long jUpdate = aafjVar3.p().update("playlistsV13", contentValuesE, "id = ?", new String[]{str5});
                    if (jUpdate != 1) {
                        throw new SQLException(a.cf(jUpdate, "Update playlist affected ", " rows"));
                    }
                    sQLiteDatabaseAz.setTransactionSuccessful();
                    z2 = true;
                    sQLiteDatabaseAz.endTransaction();
                    return z2;
                } catch (SQLException e2) {
                    e = e2;
                    str = str3;
                }
            } catch (SQLException e3) {
                e = e3;
                str = "OfflineDbHelper.java";
            }
        } catch (Throwable th) {
            sQLiteDatabaseAz.endTransaction();
            throw th;
        }
    }

    public final synchronized boolean E(aaml aamlVar) {
        try {
            aafw aafwVar = this.d;
            long jUpdate = aafwVar.d().update("streams", aafwVar.a(aamlVar), "video_id = ? AND itag = ?", new String[]{aamlVar.g(), Integer.toString(aamlVar.a())});
            if (jUpdate != 1) {
                throw new SQLException(a.cf(jUpdate, "Update stream bytes_transferred affected ", " rows"));
            }
            aagg aaggVar = this.b;
            aagk aagkVarM = aaggVar.a().m(aamlVar.g());
            if (aagkVarM == null) {
                ((agrc) ((agrc) aagg.a.c()).k("com/google/android/libraries/youtube/offline/database/OfflineVideosDatabaseCache", "updateSingleStream", 264, "OfflineVideosDatabaseCache.java")).t("Stream to be updated was missing from cache. Inserting instead.");
                aaggVar.i(aamlVar);
            } else {
                for (hzo hzoVar : aaggVar.g) {
                    aagkVarM.d();
                }
                aagkVarM.g(aamlVar);
                aaggVar.a().j(aamlVar);
            }
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "updateStream", (char) 1255, "OfflineDbHelper.java")).t("Error updating stream");
            return false;
        }
        return true;
    }

    public final synchronized boolean F(String str, int i, long j) {
        aaml aamlVarB;
        typ.f(str);
        aagk aagkVarR = this.b.r(str);
        if (aagkVarR == null || (aamlVarB = aagkVarR.b(i)) == null || j < aamlVarB.e) {
            return false;
        }
        aamk aamkVarD = aamlVarB.d();
        aamkVarD.c(j);
        return E(aamkVarD.a());
    }

    public final boolean G(aamo aamoVar) {
        try {
            this.j.V(aamoVar);
            aagn aagnVarA = this.b.a();
            synchronized (aagnVarA.k) {
                try {
                    aagl aaglVar = (aagl) aagnVarA.b.get(aamoVar.d());
                    if (aaglVar != null) {
                        aaglVar.n(aamoVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "updateVideoMetadata", (char) 802, "OfflineDbHelper.java")).t("Error updating single video");
            return false;
        }
    }

    public final synchronized boolean H(String str, wgi wgiVar) {
        typ.f(str);
        try {
            afip afipVar = this.j;
            ContentValues contentValues = new ContentValues();
            contentValues.put("watch_next_proto", wgiVar.a.toByteArray());
            int iUpdate = afipVar.aa().update("videosV2", contentValues, "id = ?", new String[]{str});
            if (iUpdate != 1) {
                throw new SQLException(a.bP(iUpdate, "Update video watch next affected ", " rows"));
            }
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "updateWatchNextResponse", (char) 1083, "OfflineDbHelper.java")).t("Error inserting watch next response");
            return false;
        }
        return true;
    }

    public final void I(String str) {
        typ.f(str);
        try {
            afip afipVar = this.j;
            ContentValues contentValues = new ContentValues();
            contentValues.putNull("player_response_proto");
            contentValues.putNull("refresh_token");
            contentValues.putNull("last_refresh_timestamp");
            contentValues.putNull("streams_timestamp");
            long jUpdate = afipVar.aa().update("videosV2", contentValues, "id = ?", new String[]{str});
            if (jUpdate != 1) {
                throw new SQLException(a.cf(jUpdate, "Update video affected ", " rows"));
            }
            this.b.f(str);
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "clearPlayerResponse", (char) 842, "OfflineDbHelper.java")).t("Error updating single video");
        }
    }

    public final synchronized void J(String str, aoen aoenVar) {
        typ.f(str);
        try {
            this.d.c(str, aoenVar);
            this.b.m(str);
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "deleteStreams", (char) 1311, "OfflineDbHelper.java")).t("Error deleting streams");
        }
    }

    public final void K(String str) {
        str.getClass();
        try {
            this.f.a(str);
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "deleteSubtitleTracks", (char) 1861, "OfflineDbHelper.java")).t("Error deleting subtitle tracks");
        }
    }

    public final synchronized boolean L(String str) {
        typ.f(str);
        aagg aaggVar = this.b;
        aagl aaglVarS = aaggVar.s(str);
        if (aaglVarS == null || aaggVar.a().k(str) || aaglVarS.b() == aamg.DELETED) {
            return false;
        }
        try {
            aaggVar.e(str);
            return true;
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "insertExistingVideoAsSingleVideo", (char) 1013, "OfflineDbHelper.java")).t("Error inserting existing video as single video");
            return false;
        }
    }

    public final synchronized boolean M(aamo aamoVar, aohx aohxVar, aodp aodpVar, aamn aamnVar, byte[] bArr, aamg aamgVar) {
        boolean z;
        aamoVar.getClass();
        SQLiteDatabase sQLiteDatabaseAz = az();
        sQLiteDatabaseAz.beginTransaction();
        long epochMilli = this.h.f().toEpochMilli();
        try {
            try {
                this.j.Z(aamoVar, aamgVar, aamnVar, aaus.a(aohxVar, 360), aodpVar, -1, epochMilli, bArr);
                sQLiteDatabaseAz.setTransactionSuccessful();
                sQLiteDatabaseAz.endTransaction();
                aagg aaggVar = this.b;
                aaggVar.w(aamoVar, aohxVar, -1, bArr, aamgVar, aamnVar, epochMilli);
                aaggVar.e(aamoVar.d());
            } catch (SQLException e) {
                ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "insertSingleVideo", 665, "OfflineDbHelper.java")).t("Error inserting single video or playlist video into database");
                sQLiteDatabaseAz.endTransaction();
                z = false;
            }
        } catch (Throwable th) {
            sQLiteDatabaseAz.endTransaction();
            throw th;
        }
        z = true;
        return z;
    }

    public final void N(acca accaVar) {
        try {
            SQLiteDatabase sQLiteDatabaseB = this.f.b();
            String str = accaVar.j;
            typ.f(str);
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_id", accaVar.d);
            contentValues.put("language_code", accaVar.a);
            contentValues.put("subtitles_path", str);
            contentValues.put("track_vss_id", accaVar.k);
            contentValues.put("user_visible_track_name", accaVar.toString());
            if (sQLiteDatabaseB.insert("subtitles_v5", null, contentValues) == -1) {
                throw new SQLException("Error inserting subtitle track");
            }
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "insertSubtitleTrack", (char) 1845, "OfflineDbHelper.java")).t("Error inserting subtitle tracks");
        }
    }

    public final synchronized boolean O(aamo aamoVar, aamn aamnVar, aohx aohxVar, aodp aodpVar, byte[] bArr, aamg aamgVar, String str) {
        boolean z;
        aamoVar.getClass();
        SQLiteDatabase sQLiteDatabaseAz = az();
        sQLiteDatabaseAz.beginTransaction();
        String strD = aamoVar.d();
        z = true;
        boolean z2 = aamgVar == aamg.ACTIVE;
        afip afipVar = this.j;
        boolean zY = afipVar.Y(strD, z2);
        try {
            try {
                afipVar.S(aamoVar, aamnVar, aohxVar, aodpVar, -1, bArr, aamgVar);
                sQLiteDatabaseAz.setTransactionSuccessful();
                sQLiteDatabaseAz.endTransaction();
                this.b.k(aamoVar, str, aohxVar, -1, bArr, aamnVar, zY, aamgVar);
            } catch (SQLException e) {
                ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "insertVideoForPlaylist", 580, "OfflineDbHelper.java")).t("Error inserting playlist video");
                sQLiteDatabaseAz.endTransaction();
                z = false;
            }
        } catch (Throwable th) {
            sQLiteDatabaseAz.endTransaction();
            throw th;
        }
        return z;
    }

    public final synchronized boolean P(String str, aamg aamgVar, aohx aohxVar, byte[] bArr) {
        typ.f(str);
        aagg aaggVar = this.b;
        if (aaggVar.s(str) != null) {
            return false;
        }
        aamo aamoVarAj = aj(str);
        if (aamoVarAj == null) {
            return false;
        }
        try {
            afip afipVar = this.j;
            afipVar.U(str, aamgVar);
            int iA = aaus.a(aohxVar, 360);
            ContentValues contentValues = new ContentValues();
            contentValues.put("preferred_stream_quality", Integer.valueOf(iA));
            long jUpdate = afipVar.aa().update("videosV2", contentValues, "id = ?", new String[]{str});
            if (jUpdate != 1) {
                throw new SQLException(a.cf(jUpdate, "Update video preferred_stream_quality affected ", " rows"));
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("audio_track_id", (String) null);
            long jUpdate2 = afipVar.aa().update("videosV2", contentValues2, "id = ?", new String[]{str});
            if (jUpdate2 != 1) {
                throw new SQLException(a.cf(jUpdate2, "Update audio track id affected ", " rows"));
            }
            long J = afipVar.J(str);
            if (J == 0) {
                J = this.h.f().toEpochMilli();
                afipVar.T(str, J);
            }
            aaggVar.w(aamoVarAj, aohxVar, -1, bArr, aamgVar, aamn.OFFLINE_IMMEDIATELY, J);
            return true;
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "undeleteVideo", (char) 1829, "OfflineDbHelper.java")).t("Error undeleting video");
            return false;
        }
    }

    public final synchronized void Q(String str, long j) {
        Z(str, j, this.h.f());
    }

    public final synchronized void R(String str, long j) {
        typ.f(str);
        aagl aaglVarS = this.b.s(str);
        if (aaglVarS == null) {
            return;
        }
        try {
            afip afipVar = this.j;
            ContentValues contentValues = new ContentValues();
            contentValues.put("last_playback_timestamp", Long.valueOf(j));
            long jUpdate = afipVar.aa().update("videosV2", contentValues, "id = ?", new String[]{str});
            if (jUpdate != 1) {
                throw new SQLException(a.cf(jUpdate, "Update video last_playback_timestamp affected ", " rows"));
            }
            aaglVarS.j(j);
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "updateLastPlaybackTimestamp", (char) 1349, "OfflineDbHelper.java")).t("Error updating last playback timestamp");
        }
    }

    public final synchronized void S(String str, aamg aamgVar) {
        typ.f(str);
        aamgVar.getClass();
        aagg aaggVar = this.b;
        aagl aaglVarS = aaggVar.s(str);
        if (aaglVarS == null || aaglVarS.b() == aamgVar) {
            return;
        }
        try {
            this.j.U(str, aamgVar);
            aaglVarS.k(aamgVar);
            if (aamgVar == aamg.COMPLETE) {
                aagl aaglVarN = aaggVar.a().n(str);
                if (aaglVarN != null) {
                    aaggVar.u(aaglVarN, aaggVar.c.i());
                }
                if (this.p) {
                    aaglVarS.m(null);
                }
            }
            aaggVar.a().h(str);
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "updateMediaStatus", (char) 1134, "OfflineDbHelper.java")).t("Error updating media status");
        }
    }

    public final void T(String str) {
        typ.f(str);
        aagj aagjVarQ = this.b.q(str);
        if (aagjVarQ != null) {
            try {
                aafj aafjVar = this.e;
                ContentValues contentValues = new ContentValues();
                contentValues.put("playlist_client_last_invalidation_timestamp", (Long) 0L);
                long jUpdate = aafjVar.p().update("playlistsV13", contentValues, "id = ?", new String[]{str});
                if (jUpdate != 1) {
                    throw new SQLException(a.cf(jUpdate, "Update playlist client invalidation timestamp ", " rows"));
                }
                synchronized (aagjVarQ.c.k) {
                    try {
                        aagjVarQ.c();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (SQLException e) {
                ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "updatePlaylistInvalidationTimestamp", (char) 365, "OfflineDbHelper.java")).t("Error updating playlist client invalidation timestamp");
            }
        }
    }

    public final synchronized void U(String str, int i, String str2) {
        aaml aamlVarB;
        typ.f(str);
        aagk aagkVarR = this.b.r(str);
        if (aagkVarR == null || (aamlVarB = aagkVarR.b(i)) == null) {
            return;
        }
        aamk aamkVarD = aamlVarB.d();
        aamkVarD.e = str2;
        E(aamkVarD.a());
    }

    public final void V(String str, long j) {
        typ.f(str);
        aagl aaglVarS = this.b.s(str);
        if (aaglVarS != null) {
            try {
                this.j.T(str, j);
                synchronized (aaglVarS.e.k) {
                    try {
                        aaglVarS.c = j;
                        aaglVarS.d = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (SQLException e) {
                ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "updateVideoAddedTimestamp", (char) 1407, "OfflineDbHelper.java")).t("Error updating video added timestamp");
            }
        }
    }

    public final void W(String str, long j) {
        typ.f(str);
        aagl aaglVarS = this.b.s(str);
        if (aaglVarS != null) {
            try {
                afip afipVar = this.j;
                ContentValues contentValues = new ContentValues();
                contentValues.put("streams_timestamp", Long.valueOf(j));
                long jUpdate = afipVar.aa().update("videosV2", contentValues, "id = ?", new String[]{str});
                if (jUpdate != 1) {
                    throw new SQLException(a.cf(jUpdate, "Update video streams_timestamp affected ", " rows"));
                }
                aaglVarS.o(j);
            } catch (SQLException e) {
                ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "updateVideoStreamsTimestamp", (char) 1427, "OfflineDbHelper.java")).t("Error updating video streams timestamp");
            }
        }
    }

    public final synchronized void X(String str, aamw aamwVar) {
        typ.f(str);
        aagl aaglVarS = this.b.s(str);
        if (aaglVarS == null) {
            return;
        }
        if (this.p && aamwVar != null && aamwVar.d()) {
            aamwVar = null;
        }
        aaglVarS.m(aamwVar);
    }

    public final synchronized boolean Y(aamh aamhVar, aohx aohxVar, aodp aodpVar, byte[] bArr, long j, aogf aogfVar) {
        try {
            aafj aafjVar = this.e;
            int iA = aaus.a(aohxVar, 360);
            ContentValues contentValuesE = aafj.e(aamhVar, aafjVar.a);
            contentValuesE.put("preferred_stream_quality", Integer.valueOf(iA));
            contentValuesE.put(gzj.OFFLINE_AUDIO_QUALITY, Integer.valueOf(aodpVar.e));
            contentValuesE.put("offline_source_ve_type", (Integer) (-1));
            contentValuesE.put("player_response_tracking_params", bArr);
            contentValuesE.put("playlist_added_timestamp_millis", Long.valueOf(j));
            contentValuesE.put("playlist_offline_request_source", Integer.valueOf(aogfVar.e));
            contentValuesE.put("playlist_client_last_invalidation_timestamp", (Long) 0L);
            aafjVar.p().insertOrThrow("playlistsV13", null, contentValuesE);
            aagg aaggVar = this.b;
            int size = aaggVar.b().size();
            aaggVar.h(aamhVar, new ArrayList(), aohxVar, -1, j, aafjVar.d(aamhVar.a), aogfVar);
            if (size == 0 && aaggVar.b().size() == 1) {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    Object obj = ((hxh) it.next()).a;
                    ((aado) obj).h.e(((aado) obj).b);
                }
            }
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "insertPlaylist", (char) 749, "OfflineDbHelper.java")).t("Error inserting playlist");
            return false;
        }
        return true;
    }

    public final synchronized void Z(String str, long j, Instant instant) {
        typ.f(str);
        aagl aaglVarS = this.b.s(str);
        if (aaglVarS != null) {
            try {
                afip afipVar = this.j;
                ContentValues contentValues = new ContentValues();
                contentValues.put("last_playback_position_timestamp", Long.valueOf(j));
                if (((aauk) afipVar.c).u()) {
                    contentValues.put("last_playback_position_updated_timestamp", Long.valueOf(instant.toEpochMilli()));
                }
                long jUpdate = afipVar.aa().update("videosV2", contentValues, "id = ?", new String[]{str});
                if (jUpdate != 1) {
                    throw new SQLException(a.cf(jUpdate, "Update video last_playback_position_in_seconds affected ", " rows"));
                }
                aaglVarS.h(j);
                if (this.m.u()) {
                    aaglVarS.i(instant);
                }
            } catch (SQLException e) {
                ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "updateLastPlaybackPosition", (char) 1387, "OfflineDbHelper.java")).t("Error updating last playback position timestamp");
            }
        }
    }

    public final int a(String str) {
        typ.f(str);
        aamj aamjVarE = e(str);
        if (aamjVarE == null) {
            return 0;
        }
        return aamjVarE.e;
    }

    public final aaok aa(String str) {
        typ.f(str);
        aagm aagmVarT = this.b.t(str);
        if (aagmVarT != null) {
            return aagmVarT.a();
        }
        return null;
    }

    public final void ab(aaok aaokVar) {
        try {
            this.k.w(aaokVar);
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "insertChannel", (char) 761, "OfflineDbHelper.java")).t("Error inserting channel");
        }
    }

    public final void ac(aaok aaokVar) {
        try {
            this.k.x(aaokVar);
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "updateChannel", (char) 1439, "OfflineDbHelper.java")).t("Error updating channel");
        }
    }

    public final Pair b(String str) {
        SQLiteDatabase sQLiteDatabaseAz = az();
        sQLiteDatabaseAz.beginTransaction();
        Pair pair = null;
        try {
            aamh aamhVarAi = ai(str);
            if (aamhVarAi != null) {
                List listAr = ar(str);
                sQLiteDatabaseAz.setTransactionSuccessful();
                pair = new Pair(aamhVarAi, listAr);
            }
        } catch (SQLException unused) {
        } finally {
            sQLiteDatabaseAz.endTransaction();
        }
        return pair;
    }

    public final wjf c(String str) {
        wjf wjfVar;
        typ.f(str);
        aagl aaglVarS = this.b.s(str);
        if (aaglVarS == null) {
            return null;
        }
        synchronized (aaglVarS.e.k) {
            wjfVar = aaglVarS.a;
        }
        return wjfVar;
    }

    public final wjf d(String str) {
        return this.j.L(str);
    }

    public final aamj e(String str) {
        typ.f(str);
        aagj aagjVarQ = this.b.q(str);
        if (aagjVarQ != null) {
            return aagjVarQ.b();
        }
        return null;
    }

    public final aamt f(String str) {
        typ.f(str);
        aagl aaglVarS = this.b.s(str);
        if (aaglVarS == null) {
            return null;
        }
        return aaglVarS.e();
    }

    public final String g(String str) {
        wjf wjfVarC = c(str);
        aogq aogqVarV = wjfVarC != null ? wjfVarC.v() : null;
        if (aogqVarV != null) {
            return aogqVarV.e;
        }
        return null;
    }

    public final Collection h(String str, List list) {
        return this.e.h(str, list);
    }

    public final synchronized List i(String str, boolean z, aoen aoenVar) {
        SQLiteDatabase sQLiteDatabaseAz;
        List list;
        try {
            typ.f(str);
            sQLiteDatabaseAz = az();
            sQLiteDatabaseAz.beginTransaction();
            try {
                aafj aafjVar = this.e;
                aamh aamhVarF = aafjVar.f(str);
                long jDelete = aafjVar.p().delete("playlistsV13", "id = ?", new String[]{str});
                if (jDelete != 1) {
                    throw new SQLException(a.cf(jDelete, "Delete playlist affected ", " rows"));
                }
                if (aamhVarF == null) {
                    list = agpi.a;
                } else {
                    List list2 = aafjVar.c;
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        ((aafg) it.next()).a(aamhVarF);
                    }
                    String str2 = aamhVarF.a;
                    List listK = aafjVar.k(str2);
                    aafjVar.p().delete("playlist_video", "playlist_id = ?", new String[]{str2});
                    if (aafjVar.b.a.m(10, 45358566L)) {
                        Collections.reverse(listK);
                    }
                    if (z) {
                        if (aoenVar == null) {
                            aihf aihfVarCreateBuilder = aoen.a.createBuilder();
                            aihfVarCreateBuilder.copyOnWrite();
                            aoen aoenVar2 = (aoen) aihfVarCreateBuilder.instance;
                            aoenVar2.b |= 2;
                            aoenVar2.d = str2;
                            aoenVar = (aoen) aihfVarCreateBuilder.build();
                        }
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            ((aafg) it2.next()).b(listK, aoenVar);
                        }
                    }
                    list = listK;
                }
                sQLiteDatabaseAz.setTransactionSuccessful();
                sQLiteDatabaseAz.endTransaction();
            } catch (SQLException e) {
                ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "deletePlaylist", 1660, "OfflineDbHelper.java")).t("Error deleting playlist");
                list = null;
            }
        } catch (Throwable th) {
            sQLiteDatabaseAz.endTransaction();
            throw th;
        }
        return list;
    }

    public final List j() {
        aagn aagnVarA = this.b.a();
        LinkedList linkedList = new LinkedList();
        if (aagnVarA.l) {
            Iterator it = aagnVarA.c.values().iterator();
            while (it.hasNext()) {
                linkedList.add(((aagj) it.next()).b());
            }
        } else {
            synchronized (aagnVarA.k) {
                Iterator it2 = aagnVarA.c.values().iterator();
                while (it2.hasNext()) {
                    linkedList.add(((aagj) it2.next()).b());
                }
            }
        }
        return linkedList;
    }

    @Override // defpackage.aaex
    public final List k(String str) {
        try {
            Cursor cursorRawQuery = this.e.p().rawQuery("SELECT video_id FROM playlist_video WHERE playlist_id = ? ORDER BY index_in_playlist ASC", new String[]{str});
            try {
                ArrayList arrayList = new ArrayList();
                while (cursorRawQuery.moveToNext()) {
                    arrayList.add(cursorRawQuery.getString(0));
                }
                cursorRawQuery.close();
                return arrayList;
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        } catch (SQLException unused) {
            return agpi.a;
        }
    }

    public final List l() {
        return this.b.c();
    }

    public final Set m(String str) {
        typ.f(str);
        return this.b.a().b(str);
    }

    public final void n(String str) {
        t(agpr.a, str);
    }

    public final synchronized void o(String str, aoen aoenVar) {
        A(str, true, aoenVar);
    }

    public final void p(StringBuilder sb, String str, String[] strArr) {
        sb.append(a.bU((byte) 10, str, "Table: "));
        Cursor cursorQuery = az().query(str, strArr, null, null, null, null, null);
        try {
            DatabaseUtils.dumpCursor(cursorQuery, sb);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            sb.append('\n');
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void q(String str) {
        aagg aaggVar = this.b;
        aagl aaglVarS = aaggVar.s(str);
        if (aaglVarS != null) {
            aamo aamoVarAj = aj(str);
            if (aamoVarAj != null) {
                aaglVarS.n(aamoVarAj);
            } else {
                aaggVar.n(str);
            }
        }
    }

    public final void r() {
        aagg aaggVar = this.b;
        aaggVar.b.execute(afwl.i(new yas(aaggVar, 12, null)));
    }

    public final synchronized void s(String str) {
        long j;
        typ.f(str);
        aagg aaggVar = this.b;
        aagl aaglVarS = aaggVar.s(str);
        if (aaglVarS != null) {
            afip afipVar = this.j;
            wjf wjfVarL = afipVar.L(str);
            if (wjfVarL != null) {
                aagn aagnVar = aaglVarS.e;
                long jA = aaglVarS.a();
                synchronized (aagnVar.k) {
                    try {
                        j = aaglVarS.b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                afipVar.P(wjfVarL);
                afipVar.W(str, wjfVarL, jA, j);
                aauk aaukVar = this.m;
                if (aaukVar.o()) {
                    wjfVarL = isi.J(wjfVarL, this.n);
                }
                if (aaukVar.x()) {
                    wjfVarL = isi.H(wjfVarL, this.n);
                }
                aaglVarS.l(wjfVarL, jA, j);
                return;
            }
            tqj tqjVar = this.o;
            int i = tqr.a;
            if (tqjVar.k(1073828980)) {
                aaggVar.f(str);
            }
        }
    }

    public final void t(Set set, String str) {
        Set<String> hashSet;
        int i;
        Cursor cursorQuery = this.g.a().query("ads", new String[]{"ad_video_id"}, "original_video_id=? AND ad_video_id IS NOT NULL AND ad_break_id LIKE ?", new String[]{str, ".CONTENT_INTERSTITIAL.%"}, null, null, null, null);
        try {
            if (cursorQuery.getCount() <= 0) {
                hashSet = Collections.EMPTY_SET;
            } else {
                hashSet = new HashSet();
                while (cursorQuery.moveToNext()) {
                    hashSet.add(cursorQuery.getString(0));
                }
            }
            cursorQuery.close();
            HashSet<String> hashSet2 = new HashSet(set);
            hashSet2.removeAll(hashSet);
            hashSet.removeAll(set);
            SQLiteDatabase sQLiteDatabaseAz = az();
            sQLiteDatabaseAz.beginTransaction();
            try {
                for (String str2 : hashSet) {
                    aaem aaemVar = this.g;
                    aaemVar.a().delete("ads", "original_video_id=? AND ad_video_id=? AND ad_break_id LIKE ?", new String[]{str, str2, ".CONTENT_INTERSTITIAL.%"});
                    Cursor cursorRawQuery = aaemVar.a().rawQuery("SELECT COUNT(DISTINCT original_video_id) FROM ads WHERE ad_video_id=?", new String[]{str2});
                    try {
                        if (cursorRawQuery.getCount() <= 0) {
                            cursorRawQuery.close();
                            i = 0;
                        } else {
                            cursorRawQuery.moveToNext();
                            i = cursorRawQuery.getInt(0);
                            cursorRawQuery.close();
                        }
                        if (i == 0) {
                            typ.f(str2);
                            if (tbd.a(this.j.aa(), "videosV2", "id = ? AND media_status != ?", new String[]{str2, Integer.toString(aamg.DELETED.p)}) <= 0) {
                                J(str2, null);
                            }
                        }
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                for (String str3 : hashSet2) {
                    aaem aaemVar2 = this.g;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("original_video_id", str);
                    contentValues.put("ad_break_id", ".CONTENT_INTERSTITIAL.".concat(String.valueOf(str3)));
                    contentValues.put("ad_video_id", str3);
                    aaemVar2.a().insert("ads", null, contentValues);
                }
                sQLiteDatabaseAz.setTransactionSuccessful();
                sQLiteDatabaseAz.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseAz.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            cursorQuery.close();
            throw th3;
        }
    }

    public final synchronized boolean u(String str) {
        boolean z;
        SQLiteDatabase sQLiteDatabaseAz = az();
        sQLiteDatabaseAz.beginTransaction();
        try {
            try {
                aafj aafjVar = this.e;
                Cursor cursorRawQuery = aafjVar.p().rawQuery("SELECT video_id FROM playlist_video WHERE playlist_id IS NULL AND video_id =?", new String[]{str});
                try {
                    if (cursorRawQuery.getCount() > 0) {
                        cursorRawQuery.close();
                    } else {
                        cursorRawQuery.close();
                        ContentValues contentValues = new ContentValues();
                        contentValues.putNull("playlist_id");
                        contentValues.put("video_id", str);
                        contentValues.put("saved_timestamp", Long.valueOf(aafjVar.a.f().toEpochMilli()));
                        aafjVar.p().insertOrThrow("playlist_video", null, contentValues);
                    }
                    sQLiteDatabaseAz.setTransactionSuccessful();
                    z = true;
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            } catch (Throwable th2) {
                sQLiteDatabaseAz.endTransaction();
                throw th2;
            }
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "addVideoIdToSingleVideoPlaylist", 700, "OfflineDbHelper.java")).t("Error adding single video or playlist video into database");
            z = false;
        }
        sQLiteDatabaseAz.endTransaction();
        return z;
    }

    public final synchronized boolean v(String str, aoen aoenVar) {
        return i(str, true, aoenVar) != null;
    }

    public final synchronized boolean w(String str, int i) {
        typ.f(str);
        aauk aaukVar = this.m;
        aagg aaggVar = this.b;
        aagk aagkVarR = aaggVar.r(str);
        try {
            if (aaukVar.b.l(247, 45857839L, false)) {
                if (aagkVarR == null || aagkVarR.b(i) == null) {
                }
                return true;
            }
            if (aagkVarR == null) {
                return false;
            }
            aafw aafwVar = this.d;
            long jDelete = aafwVar.d().delete("streams", "video_id = ? AND itag = ?", new String[]{str, Integer.toString(i)});
            if (jDelete != 1) {
                throw new SQLException(a.cf(jDelete, "Delete stream affected ", " rows"));
            }
            aafwVar.c.a().delete("hashes", "video_id = ? AND itag = ?", new String[]{str, String.valueOf(i)});
            synchronized (aagkVarR.e.k) {
                try {
                    SparseArray sparseArray = aagkVarR.a;
                    if (sparseArray.get(i) != null) {
                        aagkVarR.e();
                        aagkVarR.f(aagkVarR.b);
                    }
                    sparseArray.remove(i);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (aagkVarR.c() == null && aagkVarR.a() == null) {
                aaggVar.m(str);
            }
            return true;
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "deleteStream", (char) 1286, "OfflineDbHelper.java")).t("Error deleting stream");
            return false;
        }
    }

    public final synchronized boolean x(String str, int i, aoen aoenVar) {
        boolean z;
        aamg aamgVar;
        typ.f(str);
        SQLiteDatabase sQLiteDatabaseAz = az();
        sQLiteDatabaseAz.beginTransaction();
        try {
            try {
                boolean zL = this.i.l(str);
                afip afipVar = this.j;
                aamo aamoVarN = afipVar.N(str);
                z = true;
                if (aamoVarN != null) {
                    if (i != 1) {
                        aafj aafjVar = this.e;
                        aafjVar.m(str);
                        if (!zL) {
                            ay(aamoVarN);
                        }
                        if (aafjVar.o(str)) {
                            aamgVar = aamg.DELETED;
                        } else {
                            aamgVar = zL ? aamg.METADATA_ONLY : null;
                        }
                        if (aamgVar != null) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("media_status", Integer.valueOf(aamgVar.p));
                            contentValues.putNull("player_response_proto");
                            contentValues.putNull("refresh_token");
                            contentValues.putNull("saved_timestamp");
                            contentValues.putNull("streams_timestamp");
                            contentValues.putNull("last_refresh_timestamp");
                            contentValues.putNull("last_playback_timestamp");
                            contentValues.putNull("video_added_timestamp");
                            long jUpdate = afipVar.aa().update("videosV2", contentValues, "id = ?", new String[]{str});
                            if (jUpdate != 1) {
                                throw new SQLException(a.cf(jUpdate, "Update video offline_playability_state affected ", " rows"));
                            }
                            afipVar.Q(str);
                        } else {
                            ax(aamoVarN);
                        }
                    } else {
                        ax(aamoVarN);
                    }
                }
                J(str, aoenVar);
                if (!this.e.n(str)) {
                    aagg aaggVar = this.b;
                    if (zL) {
                        aagn aagnVarA = aaggVar.a();
                        synchronized (aagnVarA.k) {
                            try {
                                str.getClass();
                                aagnVarA.i(str);
                                aagl aaglVar = (aagl) aagnVarA.b.get(str);
                                if (aaglVar != null) {
                                    aaglVar.k(aamg.METADATA_ONLY);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        aaggVar.n(str);
                    }
                }
                if (this.b.c().isEmpty()) {
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        Object obj = ((hxh) it.next()).a;
                        ((aado) obj).g.a(((aado) obj).b);
                    }
                }
                sQLiteDatabaseAz.setTransactionSuccessful();
            } catch (Throwable th2) {
                sQLiteDatabaseAz.endTransaction();
                throw th2;
            }
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "deleteVideo", 1550, "OfflineDbHelper.java")).t("Error deleting video");
            z = false;
        }
        sQLiteDatabaseAz.endTransaction();
        return z;
    }

    public final synchronized boolean y(aaml aamlVar) {
        boolean zE;
        try {
            try {
                aafw aafwVar = this.d;
                aafwVar.d().insertOrThrow("streams", null, aafwVar.a(aamlVar));
                this.b.i(aamlVar);
            } catch (SQLiteConstraintException unused) {
                ((agrc) ((agrc) l.b()).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "insertOfflineStream", 1180, "OfflineDbHelper.java")).t("Failed insert due to constraint failure, attempting update");
                zE = E(aamlVar);
            }
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelper", "insertOfflineStream", (char) 1183, "OfflineDbHelper.java")).t("Error inserting stream");
            zE = false;
        }
        zE = true;
        return zE;
    }

    public final boolean z(aamo aamoVar, aoen aoenVar) {
        aamoVar.getClass();
        aafj aafjVar = this.e;
        String strD = aamoVar.d();
        if (!aafjVar.n(strD) && !aafjVar.o(strD)) {
            abxu abxuVar = this.i;
            if (tbd.a(abxuVar.o(), "video_list_videos", "video_list_id IS NOT NULL AND video_id = ?", new String[]{strD}) <= 0 || abxuVar.l(strD)) {
                aw(aamoVar);
                this.d.c(strD, aoenVar);
                return true;
            }
        }
        return false;
    }
}
