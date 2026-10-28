package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum acjc {
    UNKNOWN(0),
    TIMELINE_UPDATE(1),
    SEEK(2),
    SKIP(3),
    TIMELINE_QUEUE_REMAINING_SEGMENTS_AFTER_PLAYBACK_START(4),
    UPDATE_ON_AUDIO_ROUTE(5),
    INITIAL_LOAD(6),
    RESUME_INTERRUPTED_PLAYBACK(7),
    QUEUE_SEGMENTS(8),
    REMOVE_QUEUED_SEGMENTS(9),
    PLAYER_SETTING_QUEUE_FLUSH(10),
    REPOSITION_CHILD_PLAYBACK(11);

    public final int m;

    acjc(int i) {
        this.m = i;
    }
}
