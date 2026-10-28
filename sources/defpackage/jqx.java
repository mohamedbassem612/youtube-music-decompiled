package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum jqx implements aihr {
    ENCRYPTED_ONESIE_PLAYER_RESPONSE(0),
    ENCRYPTED_MEDIA(1),
    MEDIA_DECRYPTION_KEY(2),
    CLEAR_MEDIA(3),
    CLEAR_INIT_SEGMENT(4),
    ACK(5),
    MEDIA_STREAMER_HOSTNAME(6),
    MEDIA_SIZE_HINT_DEPRECATED(7),
    UNKNOWN(8),
    PLAYER_SERVICE_RESPONSE_PUSH_URL_DEPRECATED(9),
    LAST_HIGH_PRIORITY_HINT_DEPRECATED(10),
    SERVER_TIMING_INFO(11),
    AUDIO_CACHE_MISS_DEPRECATED(12),
    VIDEO_CACHE_MISS_DEPRECATED(13),
    RESTRICTED_FORMATS_HINT(14),
    STREAM_NOTICE(15),
    STREAM_METADATA(16),
    VIDEO_METADATA(17),
    LIVE_METADATA(18),
    HOSTNAME_CHANGE_HINT_DEPRECATED(19),
    LIVE_METADATA_PROMISE(20),
    LIVE_METADATA_PROMISE_CANCELLATION(21),
    VIDEO_AND_FORMAT_METADATA(22),
    MEDIA_PROMISE(23),
    MEDIA_PROMISE_CANCELLATION(24),
    STREAMING_WATCH(25),
    MAX_AGE(26),
    FORMAT_INITIALIZATION_METADATA(27),
    FORMAT_SELECTION_CONFIG(28),
    NEXT_REQUEST_POLICY(29),
    PLAYBACK_START_POLICY(30),
    LAWNMOWER_POLICY(31);

    private final int H;

    jqx(int i) {
        this.H = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.H;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.H);
    }
}
