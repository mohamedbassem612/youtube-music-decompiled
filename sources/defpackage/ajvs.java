package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ajvs implements aihr {
    CODEC_INIT_REASON_UNKNOWN(0),
    CODEC_INIT_REASON_ROTATION_DEGREE(1),
    CODEC_INIT_REASON_COLOR_INFO(2),
    CODEC_INIT_REASON_MIME_TYPE(3),
    CODEC_INIT_REASON_DIMENSIONS(4),
    CODEC_INIT_REASON_CODEC_OPERATING_RATE(5),
    CODEC_INIT_REASON_MAX_WIDTH(6),
    CODEC_INIT_REASON_MAX_HEIGHT(7),
    CODEC_INIT_REASON_FORMAT_MAX_INPUT_SIZE(31),
    CODEC_INIT_REASON_FIRST_PLAYBACK(9),
    CODEC_INIT_REASON_ABRUPT_SPLICING(10),
    CODEC_INIT_REASON_BACKGROUND(11),
    CODEC_INIT_REASON_PREWARM(12),
    CODEC_INIT_REASON_TRACK_RENDERER_TYPE_SWITCH(13),
    CODEC_INIT_REASON_RESELECT_STREAMS(14),
    CODEC_INIT_REASON_DETACH_MEDIA_VIEW(15),
    CODEC_INIT_REASON_NULL_MEDIA_VIEW_SWITCH(16),
    CODEC_INIT_REASON_PLAYER_SWITCH(17),
    CODEC_INIT_REASON_PLAYER_RESET(18),
    CODEC_INIT_REASON_EXOPLAYER_OVERRIDE(19),
    CODEC_INIT_REASON_DRM_HD(20),
    CODEC_INIT_REASON_DRM_STOPPED(21),
    CODEC_INIT_REASON_STOP(22),
    CODEC_INIT_REASON_CODEC_NAME(23),
    CODEC_INIT_REASON_REUSE_DISABLED(24),
    CODEC_INIT_REASON_CONFIGURE_FAILED(25),
    CODEC_INIT_REASON_SET_OUTPUT_SURFACE_FAILED(26),
    CODEC_INIT_REASON_INITIALIZATION_DATA(27),
    CODEC_INIT_REASON_HDR(28),
    CODEC_INIT_REASON_COLOR_TRANSFER(29),
    CODEC_INIT_REASON_SURFACE(30),
    CODEC_INIT_REASON_REUSE_INIT_WHILE_ON_BACKGROUND(33),
    UNRECOGNIZED(-1);

    private final int I;

    ajvs(int i) {
        this.I = i;
    }

    public static ajvs a(int i) {
        switch (i) {
            case 0:
                return CODEC_INIT_REASON_UNKNOWN;
            case 1:
                return CODEC_INIT_REASON_ROTATION_DEGREE;
            case 2:
                return CODEC_INIT_REASON_COLOR_INFO;
            case 3:
                return CODEC_INIT_REASON_MIME_TYPE;
            case 4:
                return CODEC_INIT_REASON_DIMENSIONS;
            case 5:
                return CODEC_INIT_REASON_CODEC_OPERATING_RATE;
            case 6:
                return CODEC_INIT_REASON_MAX_WIDTH;
            case 7:
                return CODEC_INIT_REASON_MAX_HEIGHT;
            case 8:
            case 32:
            default:
                return null;
            case 9:
                return CODEC_INIT_REASON_FIRST_PLAYBACK;
            case 10:
                return CODEC_INIT_REASON_ABRUPT_SPLICING;
            case 11:
                return CODEC_INIT_REASON_BACKGROUND;
            case 12:
                return CODEC_INIT_REASON_PREWARM;
            case 13:
                return CODEC_INIT_REASON_TRACK_RENDERER_TYPE_SWITCH;
            case 14:
                return CODEC_INIT_REASON_RESELECT_STREAMS;
            case 15:
                return CODEC_INIT_REASON_DETACH_MEDIA_VIEW;
            case 16:
                return CODEC_INIT_REASON_NULL_MEDIA_VIEW_SWITCH;
            case 17:
                return CODEC_INIT_REASON_PLAYER_SWITCH;
            case 18:
                return CODEC_INIT_REASON_PLAYER_RESET;
            case 19:
                return CODEC_INIT_REASON_EXOPLAYER_OVERRIDE;
            case 20:
                return CODEC_INIT_REASON_DRM_HD;
            case 21:
                return CODEC_INIT_REASON_DRM_STOPPED;
            case 22:
                return CODEC_INIT_REASON_STOP;
            case 23:
                return CODEC_INIT_REASON_CODEC_NAME;
            case 24:
                return CODEC_INIT_REASON_REUSE_DISABLED;
            case 25:
                return CODEC_INIT_REASON_CONFIGURE_FAILED;
            case 26:
                return CODEC_INIT_REASON_SET_OUTPUT_SURFACE_FAILED;
            case 27:
                return CODEC_INIT_REASON_INITIALIZATION_DATA;
            case 28:
                return CODEC_INIT_REASON_HDR;
            case 29:
                return CODEC_INIT_REASON_COLOR_TRANSFER;
            case 30:
                return CODEC_INIT_REASON_SURFACE;
            case 31:
                return CODEC_INIT_REASON_FORMAT_MAX_INPUT_SIZE;
            case 33:
                return CODEC_INIT_REASON_REUSE_INIT_WHILE_ON_BACKGROUND;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this == UNRECOGNIZED ? aiif.a() : this.I;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.I);
    }
}
