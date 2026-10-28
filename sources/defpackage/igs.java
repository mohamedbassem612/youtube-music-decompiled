package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class igs {
    private static final agkz b = agkz.q(anzw.MUSIC_VIDEO_TYPE_ATV, anzw.MUSIC_VIDEO_TYPE_PRIVATELY_OWNED_TRACK);
    public static final agkz a = agkz.s(anzw.MUSIC_VIDEO_TYPE_ATV, anzw.MUSIC_VIDEO_TYPE_UGC, anzw.MUSIC_VIDEO_TYPE_OMV, anzw.MUSIC_VIDEO_TYPE_UNKNOWN);

    public static boolean a(anzw anzwVar) {
        return b.contains(anzwVar);
    }

    public static boolean b(anzw anzwVar) {
        return anzwVar == anzw.MUSIC_VIDEO_TYPE_PRIVATELY_OWNED_TRACK;
    }

    public static boolean c(anzw anzwVar) {
        return anzwVar == anzw.MUSIC_VIDEO_TYPE_PODCAST_EPISODE;
    }
}
