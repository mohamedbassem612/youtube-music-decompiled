package defpackage;

import app.rive.semantics.SemanticState;
import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class allf implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new allf(20);
    static final aiht t = new allf(19);
    static final aiht s = new allf(18);
    static final aiht r = new allf(17);
    static final aiht q = new allf(16);
    static final aiht p = new allf(15);
    static final aiht o = new allf(14);
    static final aiht n = new allf(13);
    static final aiht m = new allf(12);
    static final aiht l = new allf(11);
    static final aiht k = new allf(10);
    static final aiht j = new allf(9);
    static final aiht i = new allf(8);
    static final aiht h = new allf(7);
    static final aiht g = new allf(6);
    static final aiht f = new allf(5);
    static final aiht e = new allf(4);
    public static final aiht d = new allf(3);
    public static final aiht c = new allf(2);
    static final aiht b = new allf(1);
    static final aiht a = new allf(0);

    private allf(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        Enum r1 = null;
        switch (this.$cid) {
            case 0:
                if (a.bg(i2) == 0) {
                    return false;
                }
                break;
            case 1:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 2:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 3:
                if (i2 == 0) {
                    r1 = aloj.UNKNOWN_FORM_FACTOR;
                } else if (i2 == 1) {
                    r1 = aloj.SMALL_FORM_FACTOR;
                } else if (i2 == 2) {
                    r1 = aloj.LARGE_FORM_FACTOR;
                } else if (i2 == 3) {
                    r1 = aloj.AUTOMOTIVE_FORM_FACTOR;
                } else if (i2 == 4) {
                    r1 = aloj.WEARABLE_FORM_FACTOR;
                }
                if (r1 == null) {
                    return false;
                }
                break;
            case 4:
                if (a.bh(i2) == 0) {
                    return false;
                }
                break;
            case 5:
                if (alxq.a(i2) == null) {
                    return false;
                }
                break;
            case 6:
                if (alxr.a(i2) == null) {
                    return false;
                }
                break;
            case 7:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 8:
                switch (i2) {
                    case 1:
                        r1 = amac.WATCH_WHILE;
                        break;
                    case 2:
                        r1 = amac.WATCH_NEXT_TYPE_MUSIC_QUEUE_ADD_OPERATION;
                        break;
                    case 3:
                        r1 = amac.WATCH_NEXT_TYPE_SKIP_VIDEO;
                        break;
                    case 4:
                        r1 = amac.WATCH_NEXT_TYPE_GET_QUEUE;
                        break;
                    case 5:
                        r1 = amac.WATCH_NEXT_TYPE_MUSIC_SHUFFLE;
                        break;
                    case 6:
                        r1 = amac.WATCH_NEXT_TYPE_MUSIC_UNSHUFFLE;
                        break;
                    case 7:
                        r1 = amac.WATCH_NEXT_TYPE_QUEUE_ONLY;
                        break;
                }
                if (r1 == null) {
                    return false;
                }
                break;
            case 9:
                if (i2 == 0) {
                    r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_UNKNOWN;
                } else if (i2 == 1) {
                    r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_AUTOMATED;
                } else if (i2 != 2) {
                    switch (i2) {
                        case 4:
                            r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_HOVER;
                            break;
                        case 8:
                            r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_PINCH;
                            break;
                        case 16:
                            r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_INPUT_TEXT;
                            break;
                        case 32:
                            r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_INPUT_VOICE;
                            break;
                        case 64:
                            r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_SWIPE;
                            break;
                        case SemanticState.Focused /* 128 */:
                            r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_SHAKE;
                            break;
                        case SemanticState.Hidden /* 256 */:
                            r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_DOUBLE_CLICK;
                            break;
                        case SemanticState.LiveRegion /* 512 */:
                            r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_FORCE_TOUCH;
                            break;
                        case SemanticState.ReadOnly /* 1024 */:
                            r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_LONG_PRESS;
                            break;
                        case SemanticState.Modal /* 2048 */:
                            r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_DRAG_DROP;
                            break;
                        case SemanticState.Obscured /* 4096 */:
                            r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_FORWARD_SWIPE;
                            break;
                        case SemanticState.Multiline /* 8192 */:
                            r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_BACK_SWIPE;
                            break;
                        case 16384:
                            r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_KEY_PRESS;
                            break;
                        case 32768:
                            r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_ROTATE;
                            break;
                        case 65536:
                            r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_PAN;
                            break;
                        case 131072:
                            r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_SCROLL_BEGAN_DRAGGING;
                            break;
                        case 262144:
                            r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_SCROLL_DID_STOP;
                            break;
                    }
                } else {
                    r1 = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
                }
                if (r1 == null) {
                    return false;
                }
                break;
            case 10:
                if (amec.a(i2) == null) {
                    return false;
                }
                break;
            case 11:
                if (a.aX(i2) == 0) {
                    return false;
                }
                break;
            case 12:
                if (a.aU(i2) == 0) {
                    return false;
                }
                break;
            case 13:
                if (atqp.K(i2) == 0) {
                    return false;
                }
                break;
            case 14:
                if (amjo.a(i2) == null) {
                    return false;
                }
                break;
            case 15:
                if (CommonApis.h(i2) == 0) {
                    return false;
                }
                break;
            case 16:
                if (amsb.a(i2) == null) {
                    return false;
                }
                break;
            case 17:
                if (amuk.a(i2) == null) {
                    return false;
                }
                break;
            case 18:
                if (amum.a(i2) == null) {
                    return false;
                }
                break;
            case 19:
                if (amyg.a(i2) == null) {
                    return false;
                }
                break;
            default:
                if (amyh.a(i2) == null) {
                    return false;
                }
                break;
        }
        return true;
    }
}
