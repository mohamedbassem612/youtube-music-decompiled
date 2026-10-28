package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiwd implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new aiwd(20);
    static final aiht t = new aiwd(19);
    static final aiht s = new aiwd(18);
    static final aiht r = new aiwd(17);
    static final aiht q = new aiwd(16);
    static final aiht p = new aiwd(15);
    static final aiht o = new aiwd(14);
    static final aiht n = new aiwd(13);
    static final aiht m = new aiwd(12);
    static final aiht l = new aiwd(11);
    static final aiht k = new aiwd(10);
    static final aiht j = new aiwd(9);
    static final aiht i = new aiwd(8);
    static final aiht h = new aiwd(7);
    static final aiht g = new aiwd(6);
    static final aiht f = new aiwd(5);
    static final aiht e = new aiwd(4);
    static final aiht d = new aiwd(3);
    public static final aiht c = new aiwd(2);
    static final aiht b = new aiwd(1);
    static final aiht a = new aiwd(0);

    private aiwd(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        Enum r4 = null;
        switch (this.$cid) {
            case 0:
                return a.aS(i2) != 0;
            case 1:
                return a.aV(i2) != 0;
            case 2:
                return a.bh(i2) != 0;
            case 3:
                return aiwh.a(i2) != null;
            case 4:
                return a.aS(i2) != 0;
            case 5:
                return a.aS(i2) != 0;
            case 6:
                return CommonApis.g(i2) != 0;
            case 7:
                return a.bc(i2) != 0;
            case 8:
                if (i2 == 0) {
                    r4 = aixf.CONTROL_FLOW_MANAGER_LAYER_UNSPECIFIED;
                } else if (i2 == 1) {
                    r4 = aixf.CONTROL_FLOW_MANAGER_LAYER_CORE;
                } else if (i2 == 2) {
                    r4 = aixf.CONTROL_FLOW_MANAGER_LAYER_ADAPTER;
                } else if (i2 == 3) {
                    r4 = aixf.CONTROL_FLOW_MANAGER_LAYER_SURFACE;
                } else if (i2 == 4) {
                    r4 = aixf.CONTROL_FLOW_MANAGER_LAYER_EXTERNAL;
                }
                return r4 != null;
            case 9:
                return a.bg(i2) != 0;
            case 10:
                return aixg.a(i2) != null;
            case 11:
                return a.aV(i2) != 0;
            case 12:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        return true;
                    default:
                        return false;
                }
            case 13:
                if (i2 == 0) {
                    r4 = aixj.PHASE_AD_ACTIVE_PLAYBACK_EVENT_UNSPECIFIED;
                } else if (i2 == 1) {
                    r4 = aixj.PHASE_AD_ACTIVE_PLAYBACK_EVENT_AD_PLAYBACK_STARTED;
                } else if (i2 == 2) {
                    r4 = aixj.PHASE_AD_ACTIVE_PLAYBACK_EVENT_NON_VIDEO_AD_ACTIVE;
                } else if (i2 == 3) {
                    r4 = aixj.PHASE_AD_ACTIVE_PLAYBACK_EVENT_PROGRESS_PERCENT25;
                } else if (i2 == 4) {
                    r4 = aixj.PHASE_AD_ACTIVE_PLAYBACK_EVENT_PROGRESS_PERCENT50;
                } else if (i2 == 5) {
                    r4 = aixj.PHASE_AD_ACTIVE_PLAYBACK_EVENT_PROGRESS_PERCENT75;
                }
                return r4 != null;
            case 14:
                switch (i2) {
                    case 0:
                        r4 = aixk.PHASE_AD_PLAYBACK_SCHEDULING_EVENT_UNSPECIFIED;
                        break;
                    case 1:
                        r4 = aixk.PHASE_AD_PLAYBACK_SCHEDULING_EVENT_READY_TO_SCHEDULE;
                        break;
                    case 2:
                        r4 = aixk.PHASE_AD_PLAYBACK_SCHEDULING_EVENT_SUCCESS;
                        break;
                    case 3:
                        r4 = aixk.PHASE_AD_PLAYBACK_SCHEDULING_EVENT_FAILED;
                        break;
                    case 4:
                        r4 = aixk.PHASE_AD_PLAYBACK_SCHEDULING_EVENT_PLAYBACK_DEFERRAL_HANDLE_ATTACHED;
                        break;
                    case 5:
                        r4 = aixk.PHASE_AD_PLAYBACK_SCHEDULING_EVENT_PLAYBACK_DEFERRAL_HANDLE_COMPLETED_WITH_SUCCESS;
                        break;
                    case 6:
                        r4 = aixk.PHASE_AD_PLAYBACK_SCHEDULING_EVENT_PLAYBACK_DEFERRAL_HANDLE_COMPLETED_WITH_SCHEDULING_FAILURE;
                        break;
                }
                return r4 != null;
            case 15:
                if (i2 == 0) {
                    r4 = aixl.PHASE_AD_PLAYBACK_TERMINATION_EVENT_UNSPECIFIED;
                } else if (i2 == 1) {
                    r4 = aixl.PHASE_AD_PLAYBACK_TERMINATION_EVENT_AD_PLAYBACK_ATTEMPT_ERROR;
                } else if (i2 == 2) {
                    r4 = aixl.PHASE_AD_PLAYBACK_TERMINATION_EVENT_AD_PLAYBACK_ENDED_NORMAL;
                } else if (i2 == 3) {
                    r4 = aixl.PHASE_AD_PLAYBACK_TERMINATION_EVENT_AD_PLAYBACK_ENDED_ERROR;
                } else if (i2 == 4) {
                    r4 = aixl.PHASE_AD_PLAYBACK_TERMINATION_EVENT_AD_PLAYBACK_ENDED_ABANDONED;
                } else if (i2 == 5) {
                    r4 = aixl.PHASE_AD_PLAYBACK_TERMINATION_EVENT_AD_PLAYBACK_ENDED_SKIP;
                }
                return r4 != null;
            case 16:
                return a.aS(i2) != 0;
            case 17:
                return a.aS(i2) != 0;
            case 18:
                return aixm.a(i2) != null;
            case 19:
                return aixn.a(i2) != null;
            default:
                return a.bf(i2) != 0;
        }
    }
}
