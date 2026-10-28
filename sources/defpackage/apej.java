package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apej implements aihw {
    private final /* synthetic */ int $cid;

    public apej(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aihw
    public final /* synthetic */ Object a(int i) {
        augf augfVar;
        switch (this.$cid) {
            case 0:
                arbd arbdVarA = arbd.a(i);
                return arbdVarA == null ? arbd.USER_INTERFACE_ORIENTATION_UNKNOWN : arbdVarA;
            case 1:
                aqdh aqdhVarA = aqdh.a(i);
                return aqdhVarA == null ? aqdh.STOREFRONT_MOOD_TYPE_UNSPECIFIED : aqdhVarA;
            case 2:
                aoff aoffVarA = aoff.a(i);
                return aoffVarA == null ? aoff.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_UNKNOWN : aoffVarA;
            case 3:
                aqmv aqmvVarA = aqmv.a(i);
                return aqmvVarA == null ? aqmv.TIME_SENSITIVITY_UNKNOWN : aqmvVarA;
            case 4:
                akvr akvrVarA = akvr.a(i);
                return akvrVarA == null ? akvr.DRM_TRACK_TYPE_UNSPECIFIED : akvrVarA;
            case 5:
                aqpd aqpdVarA = aqpd.a(i);
                return aqpdVarA == null ? aqpd.TRANSFER_STATUS_REASON_UNKNOWN : aqpdVarA;
            case 6:
                amse amseVarA = amse.a(i);
                return amseVarA == null ? amse.LIVE_PLAYER_STATE_UNKNOWN : amseVarA;
            case 7:
                aptd aptdVarA = aptd.a(i);
                return aptdVarA == null ? aptd.SHARE_CLIENT_PARAMS_TYPE_UNSPECIFIED : aptdVarA;
            case 8:
                ardk ardkVarA = ardk.a(i);
                return ardkVarA == null ? ardk.EFFECTS_FEATURE_UNKNOWN : ardkVarA;
            case 9:
                arki arkiVarA = arki.a(i);
                return arkiVarA == null ? arki.WEB_VIEW_PERMISSION_UNSPECIFIED : arkiVarA;
            case 10:
                asgh asghVarA = asgh.a(i);
                return asghVarA == null ? asgh.CUE_RANGE_EVENT_TYPE_UNKNOWN : asghVarA;
            case 11:
                aucv aucvVarA = aucv.a(i);
                return aucvVarA == null ? aucv.MDE_ANDROID_BITRATE_MODE_UNKNOWN : aucvVarA;
            default:
                switch (i) {
                    case 0:
                        augfVar = augf.SEGMENT_TAG_UNSPECIFIED;
                        break;
                    case 1:
                        augfVar = augf.INVALID_SOURCE;
                        break;
                    case 2:
                        augfVar = augf.NOT_FOR_UPLOAD;
                        break;
                    case 3:
                        augfVar = augf.SKIPPED_TRANSCODE_SOURCE;
                        break;
                    case 4:
                        augfVar = augf.NOT_SHOW_IN_TIMELINE;
                        break;
                    case 5:
                        augfVar = augf.INVALID_SOURCE_UNSUPPORTED;
                        break;
                    case 6:
                        augfVar = augf.UNFILLED_SOURCE;
                        break;
                    default:
                        augfVar = null;
                        break;
                }
                return augfVar == null ? augf.UNRECOGNIZED : augfVar;
        }
    }
}
