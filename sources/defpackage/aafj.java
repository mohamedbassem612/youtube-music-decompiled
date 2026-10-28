package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aafj {
    private static final agrf e = agrf.h("com/google/android/libraries/youtube/offline/database/OfflinePlaylistsHelper");
    public final mbc a;
    public final aauk b;
    public final List c = new ArrayList();
    public final afip d;
    private final aaev f;
    private final awmd g;
    private final axfd h;

    public aafj(aaev aaevVar, awmd awmdVar, mbc mbcVar, axfd axfdVar, afip afipVar, aauk aaukVar) {
        this.f = aaevVar;
        this.g = awmdVar;
        this.a = mbcVar;
        this.h = axfdVar;
        this.d = afipVar;
        this.b = aaukVar;
    }

    static ContentValues e(aamh aamhVar, mbc mbcVar) {
        ContentValues contentValues = new ContentValues();
        aofu aofuVar = aamhVar.h;
        if (aofuVar != null) {
            aqmh aqmhVar = aofuVar.d;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            if (aqmhVar.c.size() > 1) {
                aihf builder = aofuVar.toBuilder();
                aqmh aqmhVar2 = aofuVar.d;
                if (aqmhVar2 == null) {
                    aqmhVar2 = aqmh.a;
                }
                aqmh aqmhVarF = aajg.f(aqmhVar2, agke.q(480));
                builder.copyOnWrite();
                aofu aofuVar2 = (aofu) builder.instance;
                aqmhVarF.getClass();
                aofuVar2.d = aqmhVarF;
                aofuVar2.b |= 4;
                aofuVar = (aofu) builder.build();
            }
        }
        contentValues.put("id", aamhVar.a);
        contentValues.put("offline_playlist_data_proto", aofuVar != null ? aofuVar.toByteArray() : aofu.a.toByteArray());
        contentValues.put("size", Integer.valueOf(aamhVar.d));
        contentValues.put("saved_timestamp", Long.valueOf(mbcVar.f().toEpochMilli()));
        contentValues.put("placeholder", Boolean.valueOf(aamhVar.e));
        aaok aaokVar = aamhVar.l;
        if (aaokVar != null) {
            contentValues.put("channel_id", (String) aaokVar.b);
        }
        return contentValues;
    }

    public final int a(String str) {
        Cursor cursorQuery = p().query("playlistsV13", new String[]{"offline_source_ve_type"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            return cursorQuery.moveToNext() ? cursorQuery.getInt(0) : -1;
        } finally {
            cursorQuery.close();
        }
    }

    public final int b(String str) {
        Cursor cursorQuery = p().query("playlistsV13", new String[]{"preferred_stream_quality"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            return cursorQuery.moveToNext() ? cursorQuery.getInt(0) : -1;
        } finally {
            cursorQuery.close();
        }
    }

    public final long c(String str) {
        Cursor cursorQuery = p().query("playlistsV13", new String[]{"playlist_added_timestamp_millis"}, "id = ?", new String[]{str}, null, null, null);
        try {
            return cursorQuery.moveToNext() ? cursorQuery.getLong(0) : 0L;
        } finally {
            cursorQuery.close();
        }
    }

    public final long d(String str) {
        Cursor cursorRawQuery = p().rawQuery("SELECT saved_timestamp FROM playlistsV13 WHERE id=?", new String[]{str});
        try {
            return cursorRawQuery.moveToNext() ? cursorRawQuery.getLong(0) : 0L;
        } finally {
            cursorRawQuery.close();
        }
    }

    public final aamh f(String str) {
        Cursor cursorQuery = p().query("playlistsV13", aafi.a, "id = ?", new String[]{str}, null, null, null, null);
        aamh aamhVarA = null;
        try {
            try {
                if (cursorQuery.moveToNext()) {
                    aamhVarA = aaff.a(cursorQuery, (aalf) this.g.io(), this.h, cursorQuery.getColumnIndexOrThrow("id"), cursorQuery.getColumnIndexOrThrow("offline_playlist_data_proto"), cursorQuery.getColumnIndexOrThrow("placeholder"), cursorQuery.getColumnIndexOrThrow("size"), cursorQuery.getColumnIndexOrThrow("channel_id"));
                }
            } catch (SQLiteException e2) {
                ((agrc) ((agrc) ((agrc) e.b()).j(e2)).k("com/google/android/libraries/youtube/offline/database/OfflinePlaylistsHelper", "getPlaylist", 462, "OfflinePlaylistsHelper.java")).t("Issue with playlists store");
                zvp.b(zvn.b, zvm.C, "Issue with playlists store", e2);
            }
            return aamhVarA;
        } finally {
            cursorQuery.close();
        }
    }

    public final aogf g(String str) {
        Cursor cursorQuery = p().query("playlistsV13", new String[]{"playlist_offline_request_source"}, "id = ?", new String[]{str}, null, null, null);
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

    public final Collection h(String str, List list) {
        return aabq.i(k(str), list);
    }

    public final List i() {
        List listB;
        Cursor cursorQuery = p().query("playlistsV13", aafi.a, null, null, null, null, "saved_timestamp DESC", null);
        try {
            try {
                listB = aaff.b(cursorQuery, (aalf) this.g.io(), this.h, cursorQuery.getColumnIndexOrThrow("id"), cursorQuery.getColumnIndexOrThrow("offline_playlist_data_proto"), cursorQuery.getColumnIndexOrThrow("placeholder"), cursorQuery.getColumnIndexOrThrow("size"), cursorQuery.getColumnIndexOrThrow("channel_id"));
            } catch (SQLiteException e2) {
                ((agrc) ((agrc) ((agrc) e.b()).j(e2)).k("com/google/android/libraries/youtube/offline/database/OfflinePlaylistsHelper", "getPlaylists", 316, "OfflinePlaylistsHelper.java")).t("Issue with playlists store");
                zvp.b(zvn.b, zvm.C, "Issue with playlists store", e2);
                listB = agpi.a;
            }
            return listB;
        } finally {
            cursorQuery.close();
        }
    }

    public final List j() {
        Cursor cursorRawQuery = p().rawQuery(a.bT(tbd.c("videosV2", aagi.a), "SELECT ", " FROM videosV2 INNER JOIN playlist_video ON videosV2.id = playlist_video.video_id WHERE playlist_video.playlist_id IS NULL ORDER BY playlist_video.saved_timestamp DESC"), null);
        try {
            aalf aalfVar = (aalf) this.g.io();
            axfd axfdVar = this.h;
            cursorRawQuery.getClass();
            aalfVar.getClass();
            return aafz.b(cursorRawQuery, aalfVar, axfdVar, cursorRawQuery.getColumnIndexOrThrow("id"), cursorRawQuery.getColumnIndexOrThrow("offline_video_data_proto"), cursorRawQuery.getColumnIndexOrThrow("deleted"), cursorRawQuery.getColumnIndexOrThrow("channel_id"), cursorRawQuery.getColumnIndex("video_id"));
        } finally {
            cursorRawQuery.close();
        }
    }

    public final List k(String str) {
        Cursor cursorRawQuery = p().rawQuery(a.bT(tbd.c("videosV2", aagi.a), "SELECT playlist_video.video_id,", " FROM playlist_video LEFT OUTER JOIN videosV2 ON playlist_video.video_id = videosV2.id WHERE playlist_video.playlist_id = ? ORDER BY playlist_video.index_in_playlist ASC"), new String[]{str});
        try {
            aalf aalfVar = (aalf) this.g.io();
            axfd axfdVar = this.h;
            cursorRawQuery.getClass();
            aalfVar.getClass();
            return aafz.b(cursorRawQuery, aalfVar, axfdVar, cursorRawQuery.getColumnIndexOrThrow("id"), cursorRawQuery.getColumnIndexOrThrow("offline_video_data_proto"), cursorRawQuery.getColumnIndexOrThrow("deleted"), cursorRawQuery.getColumnIndexOrThrow("channel_id"), cursorRawQuery.getColumnIndex("video_id"));
        } finally {
            cursorRawQuery.close();
        }
    }

    public final void l(aafg aafgVar) {
        this.c.add(aafgVar);
    }

    final void m(String str) {
        p().delete("playlist_video", "playlist_id IS NULL AND video_id = ?", new String[]{str});
    }

    public final boolean n(String str) {
        return tbd.a(p(), "playlist_video", "playlist_id IS NULL AND video_id = ?", new String[]{str}) > 0;
    }

    public final boolean o(String str) {
        return tbd.a(p(), "playlist_video", "playlist_id IS NOT NULL AND video_id = ?", new String[]{str}) > 0;
    }

    public final SQLiteDatabase p() {
        return this.f.d();
    }
}
