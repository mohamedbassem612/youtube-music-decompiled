package defpackage;

import android.content.UriMatcher;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ish {
    public static final aigw a = apzf.b;
    public static final aigw b;
    public static final aigw c;
    public static final aigw d;
    public static final aigw e;
    public static final String[] f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public static final String[] j;
    public static final String[] k;
    public static final String[] l;
    public static final String[] m;
    public static final String[] n;
    public static final agke o;
    public static final agjt p;
    public static final UriMatcher q;

    static {
        apyo apyoVar = apyo.a;
        apyr apyrVar = apyr.a;
        apys apysVar = apys.a;
        b = apzb.b;
        apzc apzcVar = apzc.a;
        c = apzd.b;
        d = apyp.b;
        e = apyt.b;
        f = new String[]{"_id", "title", "artist", "duration", "track", "album_id"};
        g = new String[]{"_id", "audio_id", "title", "artist", "duration", "track", "album_id"};
        h = new String[]{"audio_id", "title", "artist", "duration", "_data"};
        i = new String[]{"_id", "album", "artist", "numsongs", "maxyear", "album_art"};
        agjz agjzVar = new agjz(4);
        agjzVar.i("title_key", "instance_id", "compilation", "disc_number", "duration", "is_ringtone", "album_artist", "resolution", "orientation", "artist", "author", "inferred_date", "height", "is_drm", "bucket_display_name", "owner_package_name", "volume_name", "date_modified", "writer", "date_expires", "composer", "bits_per_sample", "_display_name", "datetaken", "mime_type", "is_notification", "bitrate", "cd_track_number", "_id", "xmp", "year", "oem_metadata", "_data", "_size", "album", "is_alarm", "title", "track", "width", "is_music", "samplerate", "album_key", "is_favorite", "is_trashed", "document_id", "artist_id", "generation_added", "artist_key", "is_download", "generation_modified", "is_pending", "date_added", "is_podcast", "capture_framerate", "album_id", "num_tracks", "original_document_id", "bucket_id", "bookmark", "relative_path");
        if (Build.VERSION.SDK_INT >= 29) {
            agjzVar.h("is_audiobook");
        }
        if (Build.VERSION.SDK_INT >= 30) {
            agjzVar.h("title_resource_uri");
            agjzVar.h("genre");
            agjzVar.h("genre_key");
            agjzVar.h("genre_id");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            agjzVar.h("is_recording");
        }
        agjz agjzVar2 = new agjz(4);
        agjzVar2.i("numsongs", "artist", "numsongs_by_artist", "_id", "album", "album_art", "album_key", "maxyear", "minyear", "album_id");
        if (Build.VERSION.SDK_INT >= 29) {
            agjzVar2.h("artist_id");
        }
        if (Build.VERSION.SDK_INT >= 30) {
            agjzVar2.h("artist_key");
        }
        j = new String[]{"_id", "album_art"};
        k = new String[]{"_id", "name"};
        l = new String[]{"_id", "artist", "number_of_tracks"};
        m = new String[]{"_id"};
        n = new String[]{"_id"};
        o = agke.t("FEmusic_library_sideloaded_releases", "FEmusic_library_sideloaded_artists", "FEmusic_library_sideloaded_playlists", "FEmusic_library_sideloaded_tracks");
        agjr agjrVar = new agjr();
        agjrVar.c(apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_TRACKS, "FEmusic_library_sideloaded_tracks");
        agjrVar.c(apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_ALBUMS, "FEmusic_library_sideloaded_releases");
        agjrVar.c(apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_PLAYLISTS, "FEmusic_library_sideloaded_playlists");
        agjrVar.c(apyu.SIDELOADED_LIBRARY_RELOAD_CONTINUATION_TOKEN_ARTISTS, "FEmusic_library_sideloaded_artists");
        p = agjrVar.b();
        UriMatcher uriMatcher = new UriMatcher(-1);
        q = uriMatcher;
        uriMatcher.addURI("media", "*/audio/media/#", 1);
        uriMatcher.addURI("media", "*/audio/albums/#", 2);
        uriMatcher.addURI("media", "*/audio/playlists/#", 3);
        uriMatcher.addURI("media", "*/audio/artists/#", 4);
        uriMatcher.addURI("music.youtube.com", "sideloaded/play", 5);
        uriMatcher.addURI("music.youtube.com", "sideloaded/internal/playlists/#", 6);
    }
}
