package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum akwl implements aihr {
    EXO_PLAYER_CONFIG_FEATURES_UNSPECIFIED(0),
    EXO_PLAYER_CONFIG_FEATURES_SORT_LIVE_FORMATS_BY_BANDWIDTH(3),
    EXO_PLAYER_CONFIG_FEATURES_VERTICAL_TRANSCODE_BUGFIX(4),
    EXO_PLAYER_CONFIG_FEATURES_DROPPED_FRAMES_CTMP_LOGGING(16),
    EXO_PLAYER_CONFIG_FEATURES_RETRY_NET_NOCONTENT_WITH_DELAY(23),
    EXO_PLAYER_CONFIG_FEATURES_REMOVE_EARLY_FETCH_FROM_PLAYER(33),
    EXO_PLAYER_CONFIG_FEATURES_LOG_HTTP_HEADER_DECREASED(40),
    EXO_PLAYER_CONFIG_FEATURES_USE_BUFFERED_DURATION_TO_DETECT_FULL_BUFFER(42),
    EXO_PLAYER_CONFIG_FEATURES_USE_NEW_EXOPLAYER_PREPARE_API(43),
    EXO_PLAYER_CONFIG_FEATURES_DEBUG_LOGGING_FOR_PACING(49),
    UNRECOGNIZED(-1);

    private final int m;

    akwl(int i) {
        this.m = i;
    }

    public static akwl a(int i) {
        if (i == 0) {
            return EXO_PLAYER_CONFIG_FEATURES_UNSPECIFIED;
        }
        if (i == 16) {
            return EXO_PLAYER_CONFIG_FEATURES_DROPPED_FRAMES_CTMP_LOGGING;
        }
        if (i == 23) {
            return EXO_PLAYER_CONFIG_FEATURES_RETRY_NET_NOCONTENT_WITH_DELAY;
        }
        if (i == 33) {
            return EXO_PLAYER_CONFIG_FEATURES_REMOVE_EARLY_FETCH_FROM_PLAYER;
        }
        if (i == 40) {
            return EXO_PLAYER_CONFIG_FEATURES_LOG_HTTP_HEADER_DECREASED;
        }
        if (i == 49) {
            return EXO_PLAYER_CONFIG_FEATURES_DEBUG_LOGGING_FOR_PACING;
        }
        if (i == 3) {
            return EXO_PLAYER_CONFIG_FEATURES_SORT_LIVE_FORMATS_BY_BANDWIDTH;
        }
        if (i == 4) {
            return EXO_PLAYER_CONFIG_FEATURES_VERTICAL_TRANSCODE_BUGFIX;
        }
        if (i == 42) {
            return EXO_PLAYER_CONFIG_FEATURES_USE_BUFFERED_DURATION_TO_DETECT_FULL_BUFFER;
        }
        if (i != 43) {
            return null;
        }
        return EXO_PLAYER_CONFIG_FEATURES_USE_NEW_EXOPLAYER_PREPARE_API;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this == UNRECOGNIZED ? aiif.a() : this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
