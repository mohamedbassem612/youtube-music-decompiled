package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum zhy {
    TRANSITIONED_TO_NEXT("ttn"),
    TRANSITIONING("tst"),
    NULL_LOAD_VIDEO_PARAMS_ON_ERROR("nloe"),
    NULL_LOAD_VIDEO_PARAMS_ON_RETRY("nlor"),
    STALE_PLAYER_EVENTS_ON_ERROR("speoe"),
    STALE_PLAYER_EVENTS_ON_RETRY("speor"),
    ALREADY_RETRYING("ar"),
    QUEUED_VIDEO_ERROR("qve"),
    PREVIOUS_VIDEO_ERROR("pve"),
    REPEATED_ERROR("re"),
    LOAD_NEXT_VIDEO("lnv");

    public final String l;

    zhy(String str) {
        this.l = str;
    }
}
