package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aafo implements tbh {
    private final /* synthetic */ int $cid;

    public aafo(int i) {
        this.$cid = i;
    }

    @Override // defpackage.tbh
    public final void a(SQLiteDatabase sQLiteDatabase) {
        switch (this.$cid) {
            case 0:
                sQLiteDatabase.execSQL("ALTER TABLE drm ADD COLUMN drm_params TEXT ");
                break;
            case 1:
                sQLiteDatabase.execSQL("CREATE TABLE subscriptionsV31 (id TEXT PRIMARY KEY,display_state INTEGER DEFAULT 0,should_sync_to_server BOOLEAN,client_modified_timestamp INTEGER,click_tracking_params BLOB DEFAULT NULL)");
                break;
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN last_playback_position_timestamp INTEGER DEFAULT 0");
                break;
            case 3:
                sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN ytb_uri TEXT DEFAULT NULL");
                break;
            case 4:
                sQLiteDatabase.execSQL("ALTER TABLE playlistsV13 ADD COLUMN playlist_client_last_invalidation_timestamp INTEGER DEFAULT 0");
                break;
            case 5:
                sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN audio_track_id TEXT DEFAULT NULL");
                break;
            case 6:
                sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN last_playback_position_updated_timestamp INTEGER DEFAULT 0");
                break;
            case 7:
                sQLiteDatabase.execSQL("ALTER TABLE videos ADD COLUMN preferred_stream_quality INTEGER NOT NULL DEFAULT 360");
                sQLiteDatabase.execSQL("ALTER TABLE playlists ADD COLUMN preferred_stream_quality INTEGER NOT NULL DEFAULT 360");
                break;
            case 8:
                sQLiteDatabase.execSQL("ALTER TABLE playlists ADD COLUMN placeholder INTEGER NOT NULL DEFAULT 0");
                break;
            case 9:
                sQLiteDatabase.execSQL("CREATE TABLE subtitles_v5 (video_id STRING,language_code STRING,subtitles_path STRING,track_vss_id STRING,user_visible_track_name STRING)");
                sQLiteDatabase.execSQL("CREATE INDEX idx_subtitles_video_id_v5 ON subtitles_v5 (video_id ASC)");
                sQLiteDatabase.execSQL("INSERT INTO subtitles_v5(video_id,language_code,subtitles_path,track_vss_id,user_visible_track_name) SELECT video_id,language_code,subtitles_path,track_vss_id, (language_name || ' - ' || track_name) FROM subtitles WHERE (track_name IS NOT NULL AND track_name <> '' AND track_name != language_name)");
                sQLiteDatabase.execSQL("INSERT INTO subtitles_v5(video_id,language_code,subtitles_path,track_vss_id,user_visible_track_name) SELECT video_id,language_code,subtitles_path,track_vss_id,language_name FROM subtitles WHERE NOT (track_name IS NOT NULL AND track_name <> '' AND track_name != language_name)");
                sQLiteDatabase.execSQL("DROP TABLE subtitles");
                break;
            case 10:
                sQLiteDatabase.execSQL("CREATE TABLE drm (video_id TEXT,key_set_id BLOB,mimetype STRING,pssh_data BLOB,license_server_url STRING,last_updated_timestamp INTEGER,last_update_gls_authorized_formats STRING,last_update_sdk_version INTEGER,last_update_attempt_timestamp INTEGER,last_update_attempt_http_code INTEGER,last_update_attempt_gls_code INTEGER, PRIMARY KEY (video_id))");
                sQLiteDatabase.execSQL("CREATE INDEX idx_drm_video_id ON drm (video_id)");
                break;
            default:
                sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN player_response_tracking_params BLOB DEFAULT NULL");
                sQLiteDatabase.execSQL("ALTER TABLE playlistsV2 ADD COLUMN player_response_tracking_params BLOB DEFAULT NULL");
                break;
        }
    }
}
