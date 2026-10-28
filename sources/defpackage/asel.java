package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asel implements aiht {
    private final /* synthetic */ int $cid;
    public static final aiht u = new asel(20);
    public static final aiht t = new asel(19);
    public static final aiht s = new asel(18);
    public static final aiht r = new asel(17);
    public static final aiht q = new asel(16);
    public static final aiht p = new asel(15);
    public static final aiht o = new asel(14);
    public static final aiht n = new asel(13);
    public static final aiht m = new asel(12);
    public static final aiht l = new asel(11);
    public static final aiht k = new asel(10);
    public static final aiht j = new asel(9);
    public static final aiht i = new asel(8);
    public static final aiht h = new asel(7);
    public static final aiht g = new asel(6);
    public static final aiht f = new asel(5);
    public static final aiht e = new asel(4);
    public static final aiht d = new asel(3);
    public static final aiht c = new asel(2);
    static final aiht b = new asel(1);
    static final aiht a = new asel(0);

    private asel(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        Enum r0 = null;
        switch (this.$cid) {
            case 0:
                if (a.aX(i2) == 0) {
                    return false;
                }
                break;
            case 1:
                if (a.bi(i2) == 0) {
                    return false;
                }
                break;
            case 2:
                if (a.aU(i2) == 0) {
                    return false;
                }
                break;
            case 3:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 4:
                if (a.aU(i2) == 0) {
                    return false;
                }
                break;
            case 5:
                if (asgh.a(i2) == null) {
                    return false;
                }
                break;
            case 6:
                if (a.bt(i2) == 0) {
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
                    case 0:
                        r0 = ashl.PLAYER_VISIBILITY_DEFAULT;
                        break;
                    case 1:
                        r0 = ashl.PLAYER_VISIBILITY_MINIMIZED;
                        break;
                    case 2:
                        r0 = ashl.PLAYER_VISIBILITY_FULLSCREEN;
                        break;
                    case 3:
                        r0 = ashl.PLAYER_VISIBILITY_BACKGROUND;
                        break;
                    case 4:
                        r0 = ashl.PLAYER_VISIBILITY_REMOTE;
                        break;
                    case 5:
                        r0 = ashl.PLAYER_VISIBILITY_INLINE;
                        break;
                    case 6:
                        r0 = ashl.PLAYER_VISIBILITY_VR;
                        break;
                    case 7:
                        r0 = ashl.PLAYER_VISIBILITY_PICTURE_IN_PICTURE;
                        break;
                    case 8:
                        r0 = ashl.PLAYER_VISIBILITY_IMMERSIVE_PREVIEW;
                        break;
                    case 9:
                        r0 = ashl.PLAYER_VISIBILITY_SQUEEZEBACK;
                        break;
                    case 10:
                        r0 = ashl.PLAYER_VISIBILITY_THEATER;
                        break;
                }
                if (r0 == null) {
                    return false;
                }
                break;
            case 9:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 10:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 11:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 12:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 13:
                if (a.bi(i2) == 0) {
                    return false;
                }
                break;
            case 14:
                if (a.bb(i2) == 0) {
                    return false;
                }
                break;
            case 15:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 16:
                if (a.bt(i2) == 0) {
                    return false;
                }
                break;
            case 17:
                if (a.bt(i2) == 0) {
                    return false;
                }
                break;
            case 18:
                if (i2 == 0) {
                    r0 = aslg.DEBUG_COUNTER_TYPE_UNKNOWN;
                } else if (i2 == 1) {
                    r0 = aslg.DEBUG_COUNTER_TYPE_JS_CONTROLLER_CREATE_DISPOSE_COUNT;
                } else if (i2 == 2) {
                    r0 = aslg.DEBUG_COUNTER_TYPE_DJINNI_JNI_GLOBAL_REF_COUNT;
                } else if (i2 == 3) {
                    r0 = aslg.DEBUG_COUNTER_TYPE_JS_CONTROLLER_CREATE_COUNT;
                } else if (i2 == 4) {
                    r0 = aslg.DEBUG_COUNTER_TYPE_JS_CONTROLLER_DISPOSE_COUNT;
                }
                if (r0 == null) {
                    return false;
                }
                break;
            case 19:
                if (i2 != 120) {
                    return false;
                }
                break;
            default:
                if (a.aU(i2) == 0) {
                    return false;
                }
                break;
        }
        return true;
    }
}
