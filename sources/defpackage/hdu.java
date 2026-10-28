package defpackage;

import android.text.TextUtils;
import j$.util.stream.Stream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hdu {
    public static final agke a = agke.z("FEmusic_explore", "FEmusic_new_releases", "FEmusic_new_releases_albums", "FEmusic_new_releases_videos", "FEmusic_moods_and_genres", "FEmusic_moods_and_genres_category", "FEmusic_charts", "FEmusic_non_music_audio", "FEmusic_top_non_music_audio_episodes", "FEmusic_top_non_music_audio_shows");
    public static final agke b = agke.s("FEmusic_hashtag", "FEmusic_hashtag_playlists", "FEmusic_hashtag_videos");
    public static final agke c;
    public static final agkz d;
    public static final agkz e;
    public static final agkz f;
    public static final agkz g;
    public static final agkz h;

    static {
        agke agkeVarU = agke.u("FEmusic_offline", "FEmusic_offline_songs", "FEmusic_offline_playlists", "FEmusic_offline_releases", "FEmusic_offline_nma");
        c = agkeVarU;
        agkz agkzVarR = agkz.r("FEmusic_library_landing", "FEmusic_library_corpus_artists", "FEmusic_library_non_music_audio_list");
        d = agkzVarR;
        agkz agkzVarS = agkz.s("FEmusic_library_sideloaded_tracks", "FEmusic_library_sideloaded_playlists", "FEmusic_library_sideloaded_releases", "FEmusic_library_sideloaded_artists");
        e = agkzVarS;
        agkz agkzVarS2 = agkz.s("FEmusic_library_privately_owned_landing", "FEmusic_library_privately_owned_tracks", "FEmusic_library_privately_owned_releases", "FEmusic_library_privately_owned_artists");
        f = agkzVarS2;
        g = agkz.s("FEmusic_library_landing", "FEmusic_offline", "FEmusic_library_privately_owned_landing", "FEmusic_library_sideloaded_tracks");
        h = (agkz) Stream.CC.of((Object[]) new agjw[]{agkzVarR, agkzVarS2, agkeVarU, agkzVarS}).flatMap(new hds(0)).collect(aghu.b);
    }

    public static String a(String str) {
        return String.valueOf(str).concat("__INNER");
    }

    public static boolean b(String str) {
        return TextUtils.equals(str, "FEconnections_inbox") || TextUtils.equals(str, "FEconnections_conversation");
    }

    public static boolean c(String str) {
        return TextUtils.equals(str, hdt.MUSIC_SEARCH_DOWNLOADS.g);
    }
}
