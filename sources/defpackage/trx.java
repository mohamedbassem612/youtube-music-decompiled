package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v6 trx[], still in use, count: 1, list:
  (r1v6 trx[]) from 0x0125: INVOKE (r1v6 trx[]) STATIC call: internal.org.jni_zero.JniZero.m(java.lang.Enum[]):awpl A[MD:(java.lang.Enum[]):awpl (m)] (LINE:294)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class trx implements trz {
    PLATYPUS_INIT_PLAYBACK_CONTROLLER("Player.PlatypusInitPlaybackController", 0),
    ONESIE_NETWORK_EXECUTE("Player.OnesieNetExecute", 1),
    PLATYPUS_GET_ABR_STATE("Player.PlatypusGetAbrState", 2),
    MEDIA_FETCH_LOAD_VIDEO("Player.MediaFetchLoadVideo", 3),
    MEDIA_FETCH_QUEUE_VIDEO("Player.MediaFetchQueueVideo", 4),
    MEDIA_FETCH_INIT_AND_QUEUE_CLIP("Player.MediaFetchInitAndQueueClip", 5),
    PLATYPUS_CACHE_READ_ONLINE("Player.PlatypusCacheReadOnline", 6),
    PLATYPUS_GET_CACHED_BUFFERED_RANGES_ONLINE("Player.PlatypusGetCachedBufferedRangesOnline", 7),
    PLATYPUS_CACHE_READ_OFFLINE("Player.PlatypusCacheReadOffline", 8),
    PLATYPUS_GET_CACHED_BUFFERED_RANGES_OFFLINE("Player.PlatypusGetCachedBufferedRangesOffline", 9),
    EXOPLAYER_MEDIA_SOURCE_SETUP("Player.ExoplayerMediaSourceSetup", 10),
    QOE_VIDEO_TIME_EVENT("Player.QoeVideoTimeEvent", 11),
    QOE_PLAYBACK_CONTEXT_CREATED("Player.QoePlaybackContextCreated", 12),
    QOE_YOUTUBE_PLAYER_STATE_EVENT("Player.QoeYouTubePlayerStateEvent", 13),
    QOE_STRING_KEY_VALUE_EVENT("Player.QoeStringKeyValueEvent", 14),
    QOE_VIDEO_STAGE_EVENT("Player.QoeVideoStageEvent", 15),
    QOE_PLAYBACK_CONTEXT_DESTROYED("Player.QoePlaybackContextDestroyed", 16);

    private final String s;
    private final int t;
    private final qci u;

    static {
        JniZero.m(trxVarArr);
    }

    private trx(String str, int i) {
        super(str, i);
        this.s = str;
        this.t = i;
        str.getClass();
        this.u = new qci(str);
    }

    public static trx[] values() {
        return (trx[]) r.clone();
    }

    @Override // defpackage.trz
    public final int a() {
        return this.t;
    }

    @Override // defpackage.trz
    public final qci b() {
        return this.u;
    }

    @Override // defpackage.trz
    public final boolean c() {
        int i = tqr.a;
        return tym.ac(1077958784, this);
    }
}
