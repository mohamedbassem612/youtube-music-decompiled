package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anbz implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new anbz(20);
    static final aiht t = new anbz(19);
    static final aiht s = new anbz(18);
    static final aiht r = new anbz(17);
    static final aiht q = new anbz(16);
    static final aiht p = new anbz(15);
    static final aiht o = new anbz(14);
    public static final aiht n = new anbz(13);
    static final aiht m = new anbz(12);
    static final aiht l = new anbz(11);
    static final aiht k = new anbz(10);
    public static final aiht j = new anbz(9);
    static final aiht i = new anbz(8);
    static final aiht h = new anbz(7);
    static final aiht g = new anbz(6);
    static final aiht f = new anbz(5);
    static final aiht e = new anbz(4);
    static final aiht d = new anbz(3);
    static final aiht c = new anbz(2);
    static final aiht b = new anbz(1);
    static final aiht a = new anbz(0);

    private anbz(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        Enum r3 = null;
        switch (this.$cid) {
            case 0:
                switch (i2) {
                    case 0:
                        r3 = anca.MDE_COLOR_PRIMARIES_UNSPECIFIED;
                        break;
                    case 1:
                        r3 = anca.MDE_COLOR_PRIMARIES_BT709;
                        break;
                    case 2:
                        r3 = anca.MDE_COLOR_PRIMARIES_BT601_PAL;
                        break;
                    case 3:
                        r3 = anca.MDE_COLOR_PRIMARIES_BT601_NTSC;
                        break;
                    case 4:
                        r3 = anca.MDE_COLOR_PRIMARIES_DISPLAY_P3;
                        break;
                    case 5:
                        r3 = anca.MDE_COLOR_PRIMARIES_BT2020;
                        break;
                    case 6:
                        r3 = anca.MDE_COLOR_PRIMARIES_DCI_P3;
                        break;
                }
                if (r3 == null) {
                    return false;
                }
                break;
            case 1:
                if (i2 == 0) {
                    r3 = anby.MDE_ANDROID_BITRATE_MODE_UNKNOWN;
                } else if (i2 == 1) {
                    r3 = anby.MDE_ANDROID_BITRATE_MODE_CQ;
                } else if (i2 == 2) {
                    r3 = anby.MDE_ANDROID_BITRATE_MODE_VBR;
                } else if (i2 == 3) {
                    r3 = anby.MDE_ANDROID_BITRATE_MODE_CBR;
                } else if (i2 == 4) {
                    r3 = anby.MDE_ANDROID_BITRATE_MODE_CBR_FD;
                }
                if (r3 == null) {
                    return false;
                }
                break;
            case 2:
                if (i2 == 0) {
                    r3 = ancb.MDE_COLOR_RANGE_UNSPECIFIED;
                } else if (i2 == 1) {
                    r3 = ancb.MDE_COLOR_RANGE_LIMITED;
                } else if (i2 == 2) {
                    r3 = ancb.MDE_COLOR_RANGE_FULL;
                }
                if (r3 == null) {
                    return false;
                }
                break;
            case 3:
                switch (i2) {
                    case 0:
                        r3 = ancc.MDE_COLOR_TRANSFER_UNSPECIFIED;
                        break;
                    case 1:
                        r3 = ancc.MDE_COLOR_TRANSFER_LINEAR;
                        break;
                    case 2:
                        r3 = ancc.MDE_COLOR_TRANSFER_SDR;
                        break;
                    case 3:
                        r3 = ancc.MDE_COLOR_TRANSFER_ST2084;
                        break;
                    case 4:
                        r3 = ancc.MDE_COLOR_TRANSFER_HLG;
                        break;
                    case 5:
                        r3 = ancc.MDE_COLOR_TRANSFER_GAMMA22;
                        break;
                    case 6:
                        r3 = ancc.MDE_COLOR_TRANSFER_SMPTE240M;
                        break;
                    case 7:
                        r3 = ancc.MDE_COLOR_TRANSFER_SRGB;
                        break;
                }
                if (r3 == null) {
                    return false;
                }
                break;
            case 4:
                if (i2 == 0) {
                    r3 = ancd.MDE_Y_CB_CR_MATRIX_UNSPECIFIED;
                } else if (i2 == 1) {
                    r3 = ancd.MDE_Y_CB_CR_MATRIX_BT709;
                } else if (i2 == 2) {
                    r3 = ancd.MDE_Y_CB_CR_MATRIX_BT601;
                } else if (i2 == 3) {
                    r3 = ancd.MDE_Y_CB_CR_MATRIX_BT2020;
                } else if (i2 == 4) {
                    r3 = ancd.MDE_Y_CB_CR_MATRIX_SMPTE240M;
                }
                if (r3 == null) {
                    return false;
                }
                break;
            case 5:
                if (i2 == 0) {
                    r3 = ance.MEDIA_ENGINE_AUDIO_MIME_TYPE_UNKNOWN;
                } else if (i2 == 1) {
                    r3 = ance.MEDIA_ENGINE_AUDIO_MIME_TYPE_NONE;
                } else if (i2 == 2) {
                    r3 = ance.MEDIA_ENGINE_AUDIO_MIME_TYPE_MP4;
                } else if (i2 == 3) {
                    r3 = ance.MEDIA_ENGINE_AUDIO_MIME_TYPE_AAC;
                }
                if (r3 == null) {
                    return false;
                }
                break;
            case 6:
                switch (i2) {
                    case 0:
                        r3 = anch.MEDIA_ENGINE_EXPORTER_STATE_UNKNOWN;
                        break;
                    case 1:
                        r3 = anch.MEDIA_ENGINE_EXPORTER_STATE_IDLE;
                        break;
                    case 2:
                        r3 = anch.MEDIA_ENGINE_EXPORTER_STATE_PAUSED;
                        break;
                    case 3:
                        r3 = anch.MEDIA_ENGINE_EXPORTER_STATE_RUNNING;
                        break;
                    case 4:
                        r3 = anch.MEDIA_ENGINE_EXPORTER_STATE_CANCELLED;
                        break;
                    case 5:
                        r3 = anch.MEDIA_ENGINE_EXPORTER_STATE_INITIATING_RETRY;
                        break;
                    case 6:
                        r3 = anch.MEDIA_ENGINE_EXPORTER_STATE_FAILED;
                        break;
                }
                if (r3 == null) {
                    return false;
                }
                break;
            case 7:
                if (i2 == 0) {
                    r3 = anci.MEDIA_ENGINE_PLAYER_STATE_UNKNOWN;
                } else if (i2 == 1) {
                    r3 = anci.MEDIA_ENGINE_PLAYER_STATE_IDLE;
                } else if (i2 == 2) {
                    r3 = anci.MEDIA_ENGINE_PLAYER_STATE_READY;
                } else if (i2 == 3) {
                    r3 = anci.MEDIA_ENGINE_PLAYER_STATE_BUFFERING;
                } else if (i2 == 4) {
                    r3 = anci.MEDIA_ENGINE_PLAYER_STATE_ENDED;
                } else if (i2 == 5) {
                    r3 = anci.MEDIA_ENGINE_PLAYER_STATE_ASLEEP;
                }
                if (r3 == null) {
                    return false;
                }
                break;
            case 8:
                switch (i2) {
                    case 0:
                        r3 = ancj.MEDIA_ENGINE_SEGMENT_TYPE_UNKNOWN;
                        break;
                    case 1:
                        r3 = ancj.MEDIA_ENGINE_SEGMENT_TYPE_AUDIO;
                        break;
                    case 2:
                        r3 = ancj.MEDIA_ENGINE_SEGMENT_TYPE_IMAGE;
                        break;
                    case 3:
                        r3 = ancj.MEDIA_ENGINE_SEGMENT_TYPE_GRAPHICAL;
                        break;
                    case 4:
                        r3 = ancj.MEDIA_ENGINE_SEGMENT_TYPE_SHAPE;
                        break;
                    case 5:
                        r3 = ancj.MEDIA_ENGINE_SEGMENT_TYPE_SKOTTIE;
                        break;
                    case 6:
                        r3 = ancj.MEDIA_ENGINE_SEGMENT_TYPE_TEXT;
                        break;
                    case 7:
                        r3 = ancj.MEDIA_ENGINE_SEGMENT_TYPE_VIDEO;
                        break;
                    case 8:
                        r3 = ancj.MEDIA_ENGINE_SEGMENT_TYPE_EMPTY;
                        break;
                }
                if (r3 == null) {
                    return false;
                }
                break;
            case 9:
                if (anck.a(i2) == null) {
                    return false;
                }
                break;
            case 10:
                if (i2 == 0) {
                    r3 = ancl.MEDIA_ENGINE_TRANSMUXING_DECISION_UNSPECIFIED;
                } else if (i2 == 1) {
                    r3 = ancl.MEDIA_ENGINE_TRANSMUXING_DECISION_NOT_ENCODE;
                } else if (i2 == 2) {
                    r3 = ancl.MEDIA_ENGINE_TRANSMUXING_DECISION_TRANSCODE;
                } else if (i2 == 3) {
                    r3 = ancl.MEDIA_ENGINE_TRANSMUXING_DECISION_TRANSMUX;
                }
                if (r3 == null) {
                    return false;
                }
                break;
            case 11:
                switch (i2) {
                    case 0:
                        r3 = ancm.MEDIA_ENGINE_VIDEO_MIME_TYPE_UNKNOWN;
                        break;
                    case 1:
                        r3 = ancm.MEDIA_ENGINE_VIDEO_MIME_TYPE_NONE;
                        break;
                    case 2:
                        r3 = ancm.MEDIA_ENGINE_VIDEO_MIME_TYPE_H263;
                        break;
                    case 3:
                        r3 = ancm.MEDIA_ENGINE_VIDEO_MIME_TYPE_H264;
                        break;
                    case 4:
                        r3 = ancm.MEDIA_ENGINE_VIDEO_MIME_TYPE_H265;
                        break;
                    case 5:
                        r3 = ancm.MEDIA_ENGINE_VIDEO_MIME_TYPE_VP9;
                        break;
                    case 6:
                        r3 = ancm.MEDIA_ENGINE_VIDEO_MIME_TYPE_AV1;
                        break;
                }
                if (r3 == null) {
                    return false;
                }
                break;
            case 12:
                if (a.bh(i2) == 0) {
                    return false;
                }
                break;
            case 13:
                if (agvp.S(i2) == 0) {
                    return false;
                }
                break;
            case 14:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 15:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 16:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 17:
                if (aext.p(i2) == 0) {
                    return false;
                }
                break;
            case 18:
                if (a.bh(i2) == 0) {
                    return false;
                }
                break;
            case 19:
                if (ankf.a(i2) == null) {
                    return false;
                }
                break;
            default:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
        }
        return true;
    }
}
