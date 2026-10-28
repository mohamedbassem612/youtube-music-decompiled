package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aafq implements tbh {
    private final HashMap a = new HashMap();

    @Override // defpackage.tbh
    public final void a(SQLiteDatabase sQLiteDatabase) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        String str7 = "refresh_token";
        String str8 = "player_response_proto";
        String str9 = "media_status";
        String str10 = "last_refresh_timestamp";
        String str11 = "last_playback_timestamp";
        String str12 = "size";
        String str13 = "placeholder";
        String str14 = "owner";
        String str15 = "author";
        sQLiteDatabase2.execSQL("CREATE TABLE playlistsV2 (id TEXT KEY,offline_playlist_data_proto BLOB,placeholder INTEGER,channel_id TEXT,size INTEGER,preferred_stream_quality INTEGER,saved_timestamp INTEGER)");
        String str16 = "SELECT ";
        Cursor cursorRawQuery = sQLiteDatabase2.rawQuery(a.bT(tbd.c("playlists", aaez.a), "SELECT ", " FROM playlists"), null);
        while (true) {
            try {
                str = "title";
                str7 = str7;
                str8 = str8;
                if (!cursorRawQuery.moveToNext()) {
                    break;
                }
                str9 = str9;
                ContentValues contentValues = new ContentValues();
                str10 = str10;
                String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("id"));
                str11 = str11;
                String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex(str15));
                str14 = str14;
                String strF = tbd.f(cursorRawQuery, cursorRawQuery.getColumnIndex(str15));
                str15 = str15;
                aihf aihfVarCreateBuilder = aodv.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                str16 = str16;
                aodv aodvVar = (aodv) aihfVarCreateBuilder.instance;
                strF.getClass();
                aodvVar.b |= 1;
                aodvVar.c = strF;
                aihfVarCreateBuilder.copyOnWrite();
                aodv aodvVar2 = (aodv) aihfVarCreateBuilder.instance;
                strF.getClass();
                aodvVar2.b |= 4;
                aodvVar2.e = strF;
                aqmh aqmhVar = aqmh.a;
                aihfVarCreateBuilder.copyOnWrite();
                aodv aodvVar3 = (aodv) aihfVarCreateBuilder.instance;
                aqmhVar.getClass();
                aodvVar3.d = aqmhVar;
                aodvVar3.b |= 2;
                aodv aodvVar4 = (aodv) aihfVarCreateBuilder.build();
                aihf aihfVarCreateBuilder2 = aofu.a.createBuilder();
                String str17 = str12;
                String strF2 = tbd.f(cursorRawQuery, cursorRawQuery.getColumnIndex("id"));
                aihfVarCreateBuilder2.copyOnWrite();
                aofu aofuVar = (aofu) aihfVarCreateBuilder2.instance;
                strF2.getClass();
                aofuVar.b |= 1;
                aofuVar.c = strF2;
                String strF3 = tbd.f(cursorRawQuery, cursorRawQuery.getColumnIndex("title"));
                aihfVarCreateBuilder2.copyOnWrite();
                aofu aofuVar2 = (aofu) aihfVarCreateBuilder2.instance;
                strF3.getClass();
                aofuVar2.b |= 32;
                aofuVar2.g = strF3;
                long j = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("updated_date"));
                str13 = str13;
                aihfVarCreateBuilder2.copyOnWrite();
                aofu aofuVar3 = (aofu) aihfVarCreateBuilder2.instance;
                aofuVar3.b |= SemanticState.Focused;
                aofuVar3.i = j / 1000;
                aihfVarCreateBuilder2.copyOnWrite();
                aofu aofuVar4 = (aofu) aihfVarCreateBuilder2.instance;
                aqmhVar.getClass();
                aofuVar4.d = aqmhVar;
                aofuVar4.b |= 4;
                String strF4 = tbd.f(cursorRawQuery, cursorRawQuery.getColumnIndex("content_uri"));
                aihfVarCreateBuilder2.copyOnWrite();
                aofu aofuVar5 = (aofu) aihfVarCreateBuilder2.instance;
                strF4.getClass();
                aofuVar5.b |= 64;
                aofuVar5.h = strF4;
                aodw aodwVar = aodw.a;
                aihf aihfVarCreateBuilder3 = aodwVar.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                aodw aodwVar2 = (aodw) aihfVarCreateBuilder3.instance;
                aodvVar4.getClass();
                aodwVar2.c = aodvVar4;
                aodwVar2.b |= 1;
                aihfVarCreateBuilder2.copyOnWrite();
                aofu aofuVar6 = (aofu) aihfVarCreateBuilder2.instance;
                aodw aodwVar3 = (aodw) aihfVarCreateBuilder3.build();
                aodwVar3.getClass();
                aofuVar6.e = aodwVar3;
                aofuVar6.b |= 16;
                aofu aofuVar7 = (aofu) aihfVarCreateBuilder2.build();
                HashMap map = this.a;
                aodw aodwVar4 = aofuVar7.e;
                if (aodwVar4 != null) {
                    aodwVar = aodwVar4;
                }
                map.put(strF, aodwVar);
                if (string == null || string2 == null || aofuVar7 == null) {
                    str12 = str17;
                    contentValues = null;
                } else {
                    contentValues.put("id", string);
                    contentValues.put("channel_id", string2);
                    contentValues.put("offline_playlist_data_proto", aofuVar7.toByteArray());
                    contentValues.put(str13, Boolean.valueOf(tbd.e(cursorRawQuery, cursorRawQuery.getColumnIndex(str13), false)));
                    contentValues.put("saved_timestamp", Long.valueOf(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("saved_timestamp"))));
                    contentValues.put("preferred_stream_quality", Integer.valueOf(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("preferred_stream_quality"))));
                    str12 = str17;
                    contentValues.put(str12, Integer.valueOf(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(str12))));
                }
                if (contentValues != null) {
                    sQLiteDatabase.insertOrThrow("playlistsV2", null, contentValues);
                    sQLiteDatabase2 = sQLiteDatabase;
                } else {
                    sQLiteDatabase2 = sQLiteDatabase;
                }
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }
        String str18 = str9;
        String str19 = str10;
        String str20 = str11;
        String str21 = str14;
        SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase2;
        cursorRawQuery.close();
        sQLiteDatabase3.execSQL("DROP TABLE playlists");
        sQLiteDatabase3.execSQL("CREATE TABLE videosV2 (id TEXT PRIMARY KEY,offline_video_data_proto BLOB,deleted INTEGER,channel_id TEXT,refresh_token TEXT,saved_timestamp INTEGER,last_refresh_timestamp INTEGER,last_playback_timestamp INTEGER,media_status INTEGER,preferred_stream_quality INTEGER,player_response_proto BLOB)");
        Cursor cursorRawQuery2 = sQLiteDatabase3.rawQuery(str16 + tbd.c("videos", aafc.a) + " FROM videos", null);
        while (cursorRawQuery2.moveToNext()) {
            try {
                ContentValues contentValues2 = new ContentValues();
                String string3 = cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("id"));
                String str22 = str21;
                String string4 = cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex(str22));
                aihf aihfVarCreateBuilder4 = aohb.a.createBuilder();
                String strF5 = tbd.f(cursorRawQuery2, cursorRawQuery2.getColumnIndex("id"));
                aihfVarCreateBuilder4.copyOnWrite();
                aohb aohbVar = (aohb) aihfVarCreateBuilder4.instance;
                strF5.getClass();
                aohbVar.b |= 1;
                aohbVar.c = strF5;
                String strF6 = tbd.f(cursorRawQuery2, cursorRawQuery2.getColumnIndex(str));
                aihfVarCreateBuilder4.copyOnWrite();
                aohb aohbVar2 = (aohb) aihfVarCreateBuilder4.instance;
                strF6.getClass();
                aohbVar2.b |= 8;
                aohbVar2.f = strF6;
                alay alayVarC = ackj.c(tbd.f(cursorRawQuery2, cursorRawQuery2.getColumnIndex("description")));
                aihfVarCreateBuilder4.copyOnWrite();
                aohb aohbVar3 = (aohb) aihfVarCreateBuilder4.instance;
                alayVarC.getClass();
                aohbVar3.k = alayVarC;
                aohbVar3.b |= SemanticState.Obscured;
                String strI = typ.i(cursorRawQuery2.getInt(cursorRawQuery2.getColumnIndex("duration")), 3);
                aihfVarCreateBuilder4.copyOnWrite();
                aohb aohbVar4 = (aohb) aihfVarCreateBuilder4.instance;
                strI.getClass();
                aohbVar4.b |= 16;
                aohbVar4.g = strI;
                String strValueOf = String.valueOf(cursorRawQuery2.getLong(cursorRawQuery2.getColumnIndex("likes_count")));
                aihfVarCreateBuilder4.copyOnWrite();
                aohb aohbVar5 = (aohb) aihfVarCreateBuilder4.instance;
                strValueOf.getClass();
                aohbVar5.b |= 16384;
                aohbVar5.m = strValueOf;
                String strValueOf2 = String.valueOf(cursorRawQuery2.getLong(cursorRawQuery2.getColumnIndex("dislikes_count")));
                aihfVarCreateBuilder4.copyOnWrite();
                aohb aohbVar6 = (aohb) aihfVarCreateBuilder4.instance;
                strValueOf2.getClass();
                aohbVar6.b |= 32768;
                aohbVar6.n = strValueOf2;
                long j2 = cursorRawQuery2.getLong(cursorRawQuery2.getColumnIndex("upload_date")) / 1000;
                aihfVarCreateBuilder4.copyOnWrite();
                aohb aohbVar7 = (aohb) aihfVarCreateBuilder4.instance;
                String str23 = str;
                aohbVar7.b |= 32;
                aohbVar7.h = j2;
                aqmh aqmhVar2 = aqmh.a;
                aihfVarCreateBuilder4.copyOnWrite();
                aohb aohbVar8 = (aohb) aihfVarCreateBuilder4.instance;
                aqmhVar2.getClass();
                aohbVar8.d = aqmhVar2;
                aohbVar8.b |= 2;
                String strF7 = tbd.f(cursorRawQuery2, cursorRawQuery2.getColumnIndex("watch_uri"));
                aihfVarCreateBuilder4.copyOnWrite();
                aohb aohbVar9 = (aohb) aihfVarCreateBuilder4.instance;
                strF7.getClass();
                aohbVar9.b |= SemanticState.Modal;
                aohbVar9.j = strF7;
                aodv aodvVar5 = aodv.a;
                aihf aihfVarCreateBuilder5 = aodvVar5.createBuilder();
                String strF8 = tbd.f(cursorRawQuery2, cursorRawQuery2.getColumnIndex(str22));
                aihfVarCreateBuilder5.copyOnWrite();
                aodv aodvVar6 = (aodv) aihfVarCreateBuilder5.instance;
                strF8.getClass();
                aodvVar6.b |= 1;
                aodvVar6.c = strF8;
                String strF9 = tbd.f(cursorRawQuery2, cursorRawQuery2.getColumnIndex("owner_display_name"));
                aihfVarCreateBuilder5.copyOnWrite();
                aodv aodvVar7 = (aodv) aihfVarCreateBuilder5.instance;
                strF9.getClass();
                aodvVar7.b |= 4;
                aodvVar7.e = strF9;
                aihfVarCreateBuilder5.copyOnWrite();
                aodv aodvVar8 = (aodv) aihfVarCreateBuilder5.instance;
                aqmhVar2.getClass();
                aodvVar8.d = aqmhVar2;
                aodvVar8.b |= 2;
                aodv aodvVar9 = (aodv) aihfVarCreateBuilder5.build();
                aodw aodwVar5 = aodw.a;
                aihf aihfVarCreateBuilder6 = aodwVar5.createBuilder();
                aihfVarCreateBuilder6.copyOnWrite();
                aodw aodwVar6 = (aodw) aihfVarCreateBuilder6.instance;
                aodvVar9.getClass();
                aodwVar6.c = aodvVar9;
                aodwVar6.b |= 1;
                aihfVarCreateBuilder4.copyOnWrite();
                aohb aohbVar10 = (aohb) aihfVarCreateBuilder4.instance;
                aodw aodwVar7 = (aodw) aihfVarCreateBuilder6.build();
                aodwVar7.getClass();
                aohbVar10.e = aodwVar7;
                aohbVar10.b |= 4;
                HashMap map2 = this.a;
                aodw aodwVar8 = ((aohb) aihfVarCreateBuilder4.instance).e;
                if (aodwVar8 != null) {
                    aodwVar5 = aodwVar8;
                }
                aodv aodvVar10 = aodwVar5.c;
                if (aodvVar10 == null) {
                    aodvVar10 = aodvVar5;
                }
                map2.put(aodvVar10.c, aodwVar5);
                long j3 = cursorRawQuery2.getLong(cursorRawQuery2.getColumnIndex("view_count"));
                aihfVarCreateBuilder4.copyOnWrite();
                aohb aohbVar11 = (aohb) aihfVarCreateBuilder4.instance;
                aohbVar11.b |= SemanticState.Hidden;
                aohbVar11.i = j3;
                String strValueOf3 = String.valueOf(j3);
                aihfVarCreateBuilder4.copyOnWrite();
                aohb aohbVar12 = (aohb) aihfVarCreateBuilder4.instance;
                strValueOf3.getClass();
                aohbVar12.b |= SemanticState.Multiline;
                aohbVar12.l = strValueOf3;
                aohb aohbVar13 = (aohb) aihfVarCreateBuilder4.build();
                if (string3 == null || string4 == null || aohbVar13 == null) {
                    str2 = str18;
                    str3 = str7;
                    str4 = str8;
                    str5 = str19;
                    str6 = str20;
                    contentValues2 = null;
                } else {
                    contentValues2.put("id", string3);
                    contentValues2.put("channel_id", string4);
                    contentValues2.put("offline_video_data_proto", aohbVar13.toByteArray());
                    contentValues2.put("deleted", Boolean.valueOf(TextUtils.equals(cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("state")), "OFFLINE_DELETED")));
                    str6 = str20;
                    contentValues2.put(str6, Long.valueOf(cursorRawQuery2.getLong(cursorRawQuery2.getColumnIndex(str6))));
                    contentValues2.put("saved_timestamp", Long.valueOf(cursorRawQuery2.getLong(cursorRawQuery2.getColumnIndex("saved_timestamp"))));
                    str5 = str19;
                    contentValues2.put(str5, Long.valueOf(cursorRawQuery2.getLong(cursorRawQuery2.getColumnIndex(str5))));
                    str2 = str18;
                    contentValues2.put(str2, Integer.valueOf(cursorRawQuery2.getInt(cursorRawQuery2.getColumnIndex(str2))));
                    contentValues2.put("preferred_stream_quality", Integer.valueOf(cursorRawQuery2.getInt(cursorRawQuery2.getColumnIndex("preferred_stream_quality"))));
                    str4 = str8;
                    contentValues2.put(str4, cursorRawQuery2.getBlob(cursorRawQuery2.getColumnIndex(str4)));
                    str3 = str7;
                    contentValues2.put(str3, cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex(str3)));
                }
                if (contentValues2 != null) {
                    sQLiteDatabase3.insertOrThrow("videosV2", null, contentValues2);
                }
                str20 = str6;
                str19 = str5;
                str18 = str2;
                str8 = str4;
                str7 = str3;
                str = str23;
                str21 = str22;
            } catch (Throwable th2) {
                cursorRawQuery2.close();
                throw th2;
            }
        }
        cursorRawQuery2.close();
        sQLiteDatabase3.execSQL("DROP TABLE videos");
        sQLiteDatabase3.execSQL("CREATE TABLE channels (id TEXT KEY,offline_channel_data_proto BLOB)");
        for (Map.Entry entry : this.a.entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("id", (String) entry.getKey());
            contentValues3.put("offline_channel_data_proto", ((aodw) entry.getValue()).toByteArray());
            sQLiteDatabase3.insertOrThrow("channels", null, contentValues3);
        }
    }
}
