package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aafm implements tbh {
    @Override // defpackage.tbh
    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str = "type";
        String str2 = "preferred_stream_quality";
        String str3 = "offline_channel_data_proto";
        String str4 = "last_update_timestamp";
        sQLiteDatabase.execSQL("CREATE TABLE playlistsV13 (id TEXT PRIMARY KEY,offline_playlist_data_proto BLOB,placeholder INTEGER,channel_id TEXT,size INTEGER,preferred_stream_quality INTEGER,saved_timestamp INTEGER,player_response_tracking_params BLOB DEFAULT NULL)");
        HashMap map = new HashMap();
        String str5 = "SELECT ";
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(a.bT(tbd.c("playlistsV2", aafa.b), "SELECT ", " FROM playlistsV2"), null);
        String str6 = "OfflineSQLiteOpenHelper.java";
        while (cursorRawQuery.moveToNext()) {
            try {
                String str7 = str;
                int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow("id");
                String str8 = str4;
                int columnIndexOrThrow2 = cursorRawQuery.getColumnIndexOrThrow("channel_id");
                String str9 = str3;
                int columnIndexOrThrow3 = cursorRawQuery.getColumnIndexOrThrow("offline_playlist_data_proto");
                String str10 = str5;
                int columnIndexOrThrow4 = cursorRawQuery.getColumnIndexOrThrow("placeholder");
                int columnIndexOrThrow5 = cursorRawQuery.getColumnIndexOrThrow("player_response_tracking_params");
                String str11 = str6;
                int columnIndexOrThrow6 = cursorRawQuery.getColumnIndexOrThrow("size");
                HashMap map2 = map;
                int columnIndexOrThrow7 = cursorRawQuery.getColumnIndexOrThrow("saved_timestamp");
                int columnIndexOrThrow8 = cursorRawQuery.getColumnIndexOrThrow(str2);
                String str12 = str2;
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", cursorRawQuery.getString(columnIndexOrThrow));
                contentValues.put("channel_id", cursorRawQuery.getString(columnIndexOrThrow2));
                contentValues.put("offline_playlist_data_proto", cursorRawQuery.getBlob(columnIndexOrThrow3));
                contentValues.put("placeholder", Integer.valueOf(cursorRawQuery.getInt(columnIndexOrThrow4)));
                contentValues.put("player_response_tracking_params", cursorRawQuery.getBlob(columnIndexOrThrow5));
                contentValues.put("size", Integer.valueOf(cursorRawQuery.getInt(columnIndexOrThrow6)));
                contentValues.put("saved_timestamp", Long.valueOf(cursorRawQuery.getLong(columnIndexOrThrow7)));
                contentValues.put(str12, Integer.valueOf(cursorRawQuery.getInt(columnIndexOrThrow8)));
                String asString = contentValues.getAsString("id");
                if (map2.containsKey(asString)) {
                    try {
                        aihf builder = ((aofu) aihn.parseFrom(aofu.a, contentValues.getAsByteArray("offline_playlist_data_proto"), ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
                        builder.copyOnWrite();
                        aofu aofuVar = (aofu) builder.instance;
                        aofuVar.b |= SemanticState.Focused;
                        aofuVar.i = 0L;
                        contentValues.put("offline_playlist_data_proto", ((aofu) builder.build()).toByteArray());
                        str6 = str11;
                    } catch (aiik e) {
                        str6 = str11;
                        ((agrc) ((agrc) ((agrc) aafs.a.b()).j(e)).k("com/google/android/libraries/youtube/offline/database/OfflineSQLiteOpenHelper$OfflineSchemaMigrationV13", "migratePlaylistsData", 1220, str6)).w("OfflineSchemaMigration13 duplicated playlist has invalid proto: %s", e);
                    }
                } else {
                    str6 = str11;
                }
                map2.put(asString, contentValues);
                str2 = str12;
                map = map2;
                str = str7;
                str4 = str8;
                str3 = str9;
                str5 = str10;
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }
        String str13 = str;
        String str14 = str3;
        String str15 = str4;
        String str16 = str5;
        cursorRawQuery.close();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            sQLiteDatabase.insertOrThrow("playlistsV13", null, (ContentValues) it.next());
        }
        sQLiteDatabase.execSQL("DROP TABLE playlistsV2");
        sQLiteDatabase.execSQL("CREATE TABLE channelsV13 (id TEXT PRIMARY KEY,offline_channel_data_proto BLOB)");
        HashMap map3 = new HashMap();
        Cursor cursorRawQuery2 = sQLiteDatabase.rawQuery(str16 + tbd.c("channels", aaey.a) + " FROM channels", null);
        while (cursorRawQuery2.moveToNext()) {
            try {
                int columnIndexOrThrow9 = cursorRawQuery2.getColumnIndexOrThrow("id");
                String str17 = str14;
                int columnIndexOrThrow10 = cursorRawQuery2.getColumnIndexOrThrow(str17);
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("id", cursorRawQuery2.getString(columnIndexOrThrow9));
                contentValues2.put(str17, cursorRawQuery2.getBlob(columnIndexOrThrow10));
                String asString2 = contentValues2.getAsString("id");
                if (!map3.containsKey(asString2)) {
                    map3.put(asString2, contentValues2);
                }
                str14 = str17;
            } catch (Throwable th2) {
                cursorRawQuery2.close();
                throw th2;
            }
        }
        cursorRawQuery2.close();
        Iterator it2 = map3.values().iterator();
        while (it2.hasNext()) {
            sQLiteDatabase.insertOrThrow("channelsV13", null, (ContentValues) it2.next());
        }
        sQLiteDatabase.execSQL("DROP TABLE channels");
        sQLiteDatabase.execSQL("CREATE TABLE video_listsV13 (id TEXT PRIMARY KEY,size INTEGER,type INTEGER,saved_timestamp INTEGER,last_update_timestamp INTEGER)");
        HashMap map4 = new HashMap();
        Cursor cursorRawQuery3 = sQLiteDatabase.rawQuery(str16 + tbd.c("video_lists", aafb.a) + " FROM video_lists", null);
        while (cursorRawQuery3.moveToNext()) {
            try {
                int columnIndexOrThrow11 = cursorRawQuery3.getColumnIndexOrThrow("id");
                String str18 = str15;
                int columnIndexOrThrow12 = cursorRawQuery3.getColumnIndexOrThrow(str18);
                int columnIndexOrThrow13 = cursorRawQuery3.getColumnIndexOrThrow("size");
                String str19 = str13;
                int columnIndexOrThrow14 = cursorRawQuery3.getColumnIndexOrThrow(str19);
                int columnIndexOrThrow15 = cursorRawQuery3.getColumnIndexOrThrow("saved_timestamp");
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("id", cursorRawQuery3.getString(columnIndexOrThrow11));
                contentValues3.put(str18, Long.valueOf(cursorRawQuery3.getLong(columnIndexOrThrow12)));
                contentValues3.put("size", Integer.valueOf(cursorRawQuery3.getInt(columnIndexOrThrow13)));
                contentValues3.put(str19, Integer.valueOf(cursorRawQuery3.getInt(columnIndexOrThrow14)));
                contentValues3.put("saved_timestamp", Long.valueOf(cursorRawQuery3.getLong(columnIndexOrThrow15)));
                String asString3 = contentValues3.getAsString("id");
                if (map4.containsKey(asString3)) {
                    contentValues3.put(str18, (Integer) 0);
                }
                map4.put(asString3, contentValues3);
                str15 = str18;
                str13 = str19;
            } catch (Throwable th3) {
                cursorRawQuery3.close();
                throw th3;
            }
        }
        cursorRawQuery3.close();
        Iterator it3 = map4.values().iterator();
        while (it3.hasNext()) {
            sQLiteDatabase.insertOrThrow("video_listsV13", null, (ContentValues) it3.next());
        }
        sQLiteDatabase.execSQL("DROP TABLE video_lists");
    }
}
