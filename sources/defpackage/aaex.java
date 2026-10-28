package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aaex {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/database/OfflineDbHelperWithoutCache");
    private static final aohx b = aohx.SD;
    public final aalf c;
    public final aafw d;
    public final aafj e;
    protected final aafy f;
    protected final aaem g;
    protected final mbc h;
    protected final abxu i;
    public final afip j;
    public final axfd k;

    protected aaex(aalf aalfVar, aafw aafwVar, axfd axfdVar, afip afipVar, aafj aafjVar, abxu abxuVar, aafy aafyVar, aaem aaemVar, mbc mbcVar) {
        this.c = aalfVar;
        this.d = aafwVar;
        this.k = axfdVar;
        this.j = afipVar;
        this.e = aafjVar;
        this.i = abxuVar;
        this.f = aafyVar;
        this.g = aaemVar;
        this.h = mbcVar;
    }

    public final int ad(String str) {
        typ.f(str);
        return this.e.a(str);
    }

    public final long ae(String str) {
        typ.f(str);
        Cursor cursorQuery = this.j.aa().query("videosV2", new String[]{"metadata_timestamp"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            return cursorQuery.moveToNext() ? cursorQuery.getLong(0) : -1L;
        } finally {
            cursorQuery.close();
        }
    }

    public final long af(String str) {
        typ.f(str);
        return this.e.c(str);
    }

    public final long ag(String str) {
        return this.j.J(str);
    }

    public final synchronized aamg ah(String str) {
        typ.f(str);
        try {
        } catch (SQLException e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineDbHelperWithoutCache", "getMediaStatus", (char) 290, "OfflineDbHelperWithoutCache.java")).t("Error updating media status");
            return null;
        }
        return this.j.M(str);
    }

    public final aamh ai(String str) {
        typ.f(str);
        return this.e.f(str);
    }

    public final aamo aj(String str) {
        typ.f(str);
        return this.j.N(str);
    }

    public final aodp ak(String str) {
        aodp aodpVarA;
        typ.f(str);
        Cursor cursorQuery = this.e.p().query("playlistsV13", new String[]{gzj.OFFLINE_AUDIO_QUALITY}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (!cursorQuery.moveToNext() || (aodpVarA = aodp.a(cursorQuery.getInt(0))) == null) {
                aodpVarA = aodp.OFFLINE_AUDIO_QUALITY_UNKNOWN;
            }
            return aodpVarA;
        } finally {
            cursorQuery.close();
        }
    }

    public final aogf al(String str) {
        typ.f(str);
        return this.e.g(str);
    }

    public final aohx am(String str) {
        typ.f(str);
        aohx aohxVarC = aaus.c(this.e.b(str));
        return aohxVarC == aohx.UNKNOWN_FORMAT_TYPE ? b : aohxVarC;
    }

    public final aohx an(String str) {
        typ.f(str);
        Cursor cursorQuery = this.j.aa().query("videosV2", new String[]{"preferred_stream_quality"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            int i = cursorQuery.moveToNext() ? cursorQuery.getInt(0) : -1;
            cursorQuery.close();
            aohx aohxVarC = aaus.c(i);
            return aohxVarC == aohx.UNKNOWN_FORMAT_TYPE ? b : aohxVarC;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    public final List ao() {
        afip afipVar = this.j;
        Cursor cursorRawQuery = afipVar.aa().rawQuery(a.bT(tbd.c("videosV2", aagi.a), "SELECT ", " FROM videosV2 ORDER BY videosV2.saved_timestamp DESC"), null);
        try {
            try {
                aalf aalfVar = (aalf) afipVar.f.io();
                Object obj = afipVar.d;
                cursorRawQuery.getClass();
                aalfVar.getClass();
                List listB = aafz.b(cursorRawQuery, aalfVar, (axfd) obj, cursorRawQuery.getColumnIndexOrThrow("id"), cursorRawQuery.getColumnIndexOrThrow("offline_video_data_proto"), cursorRawQuery.getColumnIndexOrThrow("deleted"), cursorRawQuery.getColumnIndexOrThrow("channel_id"), cursorRawQuery.getColumnIndex("video_id"));
                cursorRawQuery.close();
                return listB;
            } catch (SQLiteException e) {
                zvp.b(zvn.b, zvm.C, "Issue with video store", e);
                throw e;
            }
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public final List ap() {
        return this.e.i();
    }

    public final List aq(String str) {
        typ.f(str);
        Cursor cursorQuery = this.f.b().query("subtitles_v5", aafy.a, "video_id = ?", new String[]{str}, null, null, null, null);
        try {
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("video_id");
            int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("language_code");
            int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("subtitles_path");
            int columnIndex = cursorQuery.getColumnIndex("track_vss_id");
            int columnIndex2 = cursorQuery.getColumnIndex("user_visible_track_name");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(columnIndexOrThrow2);
                String string2 = cursorQuery.getString(columnIndexOrThrow);
                String string3 = cursorQuery.getString(columnIndexOrThrow3);
                String string4 = cursorQuery.getString(columnIndex);
                String string5 = cursorQuery.getString(columnIndex2);
                string2.getClass();
                string3.getClass();
                acbz acbzVarA = acca.a();
                acbzVarA.i(string);
                acbzVarA.n(string2);
                acbzVarA.o(string4);
                acbzVarA.e("");
                acbzVarA.m("");
                acbzVarA.c = string5;
                acbzVarA.j("");
                acbzVarA.l("");
                acbzVarA.d(0);
                acbzVarA.k("");
                acbzVarA.f(true);
                acbzVarA.b = string3;
                arrayList.add(acbzVarA.a());
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    public final List ar(String str) {
        typ.f(str);
        return this.e.k(str);
    }

    public final boolean as(String str) {
        typ.f(str);
        return tbd.a(this.j.aa(), "videosV2", "id = ? AND media_status = ?", new String[]{str, Integer.toString(aamg.DELETED.p)}) > 0;
    }

    public final byte[] at(String str) {
        typ.f(str);
        Cursor cursorQuery = this.e.p().query("playlistsV13", new String[]{"player_response_tracking_params"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            return cursorQuery.moveToNext() ? cursorQuery.getBlob(0) : null;
        } finally {
            cursorQuery.close();
        }
    }

    public final byte[] au(String str) {
        typ.f(str);
        Cursor cursorQuery = this.j.aa().query("videosV2", new String[]{"player_response_tracking_params"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            return cursorQuery.moveToNext() ? cursorQuery.getBlob(0) : null;
        } finally {
            cursorQuery.close();
        }
    }

    public final aaok av(String str) {
        typ.f(str);
        return this.k.v(str);
    }

    public List k(String str) {
        throw null;
    }
}
