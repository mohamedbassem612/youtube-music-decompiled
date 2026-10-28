package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahxv implements aiht {
    private final /* synthetic */ int $cid;
    public static final aiht u = new ahxv(20);
    public static final aiht t = new ahxv(19);
    public static final aiht s = new ahxv(18);
    public static final aiht r = new ahxv(17);
    public static final aiht q = new ahxv(16);
    public static final aiht p = new ahxv(15);
    public static final aiht o = new ahxv(14);
    public static final aiht n = new ahxv(13);
    public static final aiht m = new ahxv(12);
    public static final aiht l = new ahxv(11);
    public static final aiht k = new ahxv(10);
    public static final aiht j = new ahxv(9);
    public static final aiht i = new ahxv(8);
    public static final aiht h = new ahxv(7);
    public static final aiht g = new ahxv(6);
    public static final aiht f = new ahxv(5);
    public static final aiht e = new ahxv(4);
    public static final aiht d = new ahxv(3);
    public static final aiht c = new ahxv(2);
    public static final aiht b = new ahxv(1);
    public static final aiht a = new ahxv(0);

    private ahxv(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        Enum r1 = null;
        switch (this.$cid) {
            case 0:
                return ahxw.a(i2) != null;
            case 1:
                return a.aV(i2) != 0;
            case 2:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                    case 10:
                    case 11:
                    case 12:
                        return true;
                    case 4:
                    case 8:
                    case 9:
                    default:
                        return false;
                }
            case 3:
                return a.aZ(i2) != 0;
            case 4:
                return a.bt(i2) != 0;
            case 5:
                if (i2 == 0) {
                    r1 = ahxz.CHANNEL_GROUP_STATE_UNKNOWN;
                } else if (i2 == 1) {
                    r1 = ahxz.ALLOWED;
                } else if (i2 == 2) {
                    r1 = ahxz.BANNED;
                }
                return r1 != null;
            case 6:
                if (i2 == 0) {
                    r1 = ahyb.UNSPECIFIED;
                } else if (i2 == 1) {
                    r1 = ahyb.TRUE;
                } else if (i2 == 2) {
                    r1 = ahyb.FALSE;
                }
                return r1 != null;
            case 7:
                switch (i2) {
                    case 0:
                        r1 = ahyc.IMPORTANCE_UNSPECIFIED;
                        break;
                    case 1:
                        r1 = ahyc.IMPORTANCE_NONE;
                        break;
                    case 2:
                        r1 = ahyc.IMPORTANCE_DEFAULT;
                        break;
                    case 3:
                        r1 = ahyc.IMPORTANCE_HIGH;
                        break;
                    case 4:
                        r1 = ahyc.IMPORTANCE_LOW;
                        break;
                    case 5:
                        r1 = ahyc.IMPORTANCE_MAX;
                        break;
                    case 6:
                        r1 = ahyc.IMPORTANCE_MIN;
                        break;
                }
                return r1 != null;
            case 8:
                return a.bc(i2) != 0;
            case 9:
                switch (i2) {
                    case 0:
                        r1 = ahyi.IMAGE_TYPE_UNSPECIFIED;
                        break;
                    case 1:
                        r1 = ahyi.COLLAPSED_ICON;
                        break;
                    case 2:
                        r1 = ahyi.EXPANDED_ICON;
                        break;
                    case 3:
                        r1 = ahyi.BIG_PICTURE;
                        break;
                    case 4:
                        r1 = ahyi.ANDROID_MESSAGING_STYLE_AVATAR;
                        break;
                    case 5:
                        r1 = ahyi.ANDROID_MESSAGING_STYLE_IMAGES;
                        break;
                    case 6:
                        r1 = ahyi.IOS_COMMUNICATION_NOTIFICATION_AVATAR;
                        break;
                    case 7:
                        r1 = ahyi.ANDROID_MESSAGING_STYLE_SHORTCUT_ICON;
                        break;
                }
                return r1 != null;
            case 10:
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
                    case 12:
                    case 13:
                    case 14:
                        return true;
                    case 11:
                    default:
                        return false;
                }
            case 11:
                return a.aV(i2) != 0;
            case 12:
                return a.aX(i2) != 0;
            case 13:
                return a.bc(i2) != 0;
            case 14:
                return a.aS(i2) != 0;
            case 15:
                return a.aX(i2) != 0;
            case 16:
                if (i2 == 1000 || i2 == 1001 || i2 == 10001 || i2 == 10002) {
                    return true;
                }
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
                        return true;
                    default:
                        return false;
                }
            case 17:
                return a.aX(i2) != 0;
            case 18:
                return a.aS(i2) != 0;
            case 19:
                return ahza.a(i2) != null;
            default:
                if (i2 == 0) {
                    r1 = ahzb.APP_BLOCK_STATE_UNKNOWN;
                } else if (i2 == 1) {
                    r1 = ahzb.ALLOWED;
                } else if (i2 == 2) {
                    r1 = ahzb.BANNED;
                }
                return r1 != null;
        }
    }
}
