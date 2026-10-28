package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akvb implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new akvb(20);
    public static final aiht t = new akvb(19);
    static final aiht s = new akvb(18);
    static final aiht r = new akvb(17);
    static final aiht q = new akvb(16);
    static final aiht p = new akvb(15);
    static final aiht o = new akvb(14);
    public static final aiht n = new akvb(13);
    static final aiht m = new akvb(12);
    static final aiht l = new akvb(11);
    static final aiht k = new akvb(10);
    static final aiht j = new akvb(9);
    static final aiht i = new akvb(8);
    static final aiht h = new akvb(7);
    static final aiht g = new akvb(6);
    static final aiht f = new akvb(5);
    static final aiht e = new akvb(4);
    static final aiht d = new akvb(3);
    static final aiht c = new akvb(2);
    static final aiht b = new akvb(1);
    static final aiht a = new akvb(0);

    private akvb(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        algp algpVar;
        switch (this.$cid) {
            case 0:
                if (a.aU(i2) == 0) {
                    return false;
                }
                break;
            case 1:
                if (akuc.a(i2) == null) {
                    return false;
                }
                break;
            case 2:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 3:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 4:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 5:
                if (atqp.Q(i2) == 0) {
                    return false;
                }
                break;
            case 6:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 7:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 8:
                if (akwl.a(i2) == null) {
                    return false;
                }
                break;
            case 9:
                if (atqp.P(i2) == 0) {
                    return false;
                }
                break;
            case 10:
                if (atqp.O(i2) == 0) {
                    return false;
                }
                break;
            case 11:
                if (atqp.N(i2) == 0) {
                    return false;
                }
                break;
            case 12:
                if (alai.a(i2) == null) {
                    return false;
                }
                break;
            case 13:
                if (atqp.M(i2) == 0) {
                    return false;
                }
                break;
            case 14:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 15:
                if (a.be(i2) == 0) {
                    return false;
                }
                break;
            case 16:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 17:
                if (i2 != 0 && i2 != 1 && i2 != 5 && i2 != 6 && i2 != 7) {
                    return false;
                }
                break;
            case 18:
                switch (i2) {
                    case 0:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_UNKNOWN;
                        break;
                    case 1:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_YTV_LR_PURCHASE;
                        break;
                    case 2:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_YTC_LR_PURCHASE;
                        break;
                    case 3:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_ALC_TWO_FACTOR_LOCATION;
                        break;
                    case 4:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_CALL_TO_ACTION;
                        break;
                    case 5:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_LR_AUTOCONNECT;
                        break;
                    case 6:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_OTT_TWOFACTOR_LOCATION;
                        break;
                    case 7:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_YTV_LR_FAMILY_SHARING;
                        break;
                    case 8:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_YTV_LR_REFER_FRIENDS;
                        break;
                    case 9:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_LR_COMMENTS;
                        break;
                    case 10:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_LR_ALWAYS_AUTOCONNECT;
                        break;
                    case 11:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_LR_SEARCH;
                        break;
                    case 12:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_LR_LIVE_CHAT;
                        break;
                    case 13:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_YTV_LR_AUTOCONNECT;
                        break;
                    case 14:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_WATCH_PARTY;
                        break;
                    case 15:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_CONTENT_RECOMMENDATION_NOTIFICATION;
                        break;
                    case 16:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_LR_SIGN_IN;
                        break;
                    case 17:
                    default:
                        algpVar = null;
                        break;
                    case 18:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_ANTI_SCRAPING_PHONE_VERIFICATION;
                        break;
                    case 19:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_NITRATE_LR_MUSIC_VIA_MAIN;
                        break;
                    case 20:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_NITRATE_LR_MUSIC_VIA_MUSIC;
                        break;
                    case 21:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_YT_HOME_LOCATION;
                        break;
                    case 22:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_LR_MOBILE_KEY;
                        break;
                    case 23:
                        algpVar = algp.HANDOFF_FEATURE_TYPE_LR_GPAY_MOBILE_KEY;
                        break;
                }
                if (algpVar == null) {
                    return false;
                }
                break;
            case 19:
                if (a.bg(i2) == 0) {
                    return false;
                }
                break;
            default:
                if (aliz.a(i2) == null) {
                    return false;
                }
                break;
        }
        return true;
    }
}
