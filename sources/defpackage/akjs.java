package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class akjs implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new akjs(20);
    static final aiht t = new akjs(19);
    static final aiht s = new akjs(18);
    static final aiht r = new akjs(17);
    static final aiht q = new akjs(16);
    static final aiht p = new akjs(15);
    static final aiht o = new akjs(14);
    static final aiht n = new akjs(13);
    static final aiht m = new akjs(12);
    static final aiht l = new akjs(11);
    static final aiht k = new akjs(10);
    static final aiht j = new akjs(9);
    static final aiht i = new akjs(8);
    static final aiht h = new akjs(7);
    static final aiht g = new akjs(6);
    static final aiht f = new akjs(5);
    static final aiht e = new akjs(4);
    static final aiht d = new akjs(3);
    static final aiht c = new akjs(2);
    static final aiht b = new akjs(1);
    static final aiht a = new akjs(0);

    private akjs(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        akmm akmmVar;
        switch (this.$cid) {
            case 0:
                if (a.bi(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                if (a.aV(i2) != 0) {
                    return true;
                }
                break;
            case 2:
                if (CommonApis.h(i2) != 0) {
                    return true;
                }
                break;
            case 3:
                if (a.aS(i2) != 0) {
                    return true;
                }
                break;
            case 4:
                if (a.bc(i2) != 0) {
                    return true;
                }
                break;
            case 5:
                if (a.aX(i2) != 0) {
                    return true;
                }
                break;
            case 6:
                switch (i2) {
                    case 0:
                        akmmVar = akmm.SPAN_ID_UNKNOWN;
                        break;
                    case 1:
                        akmmVar = akmm.SPAN_ID_ANDROID_MAIN_COLD_HOME_START;
                        break;
                    case 2:
                        akmmVar = akmm.SPAN_ID_ANDROID_MAIN_HOME_PAGE_SCROLL;
                        break;
                    case 3:
                        akmmVar = akmm.SPAN_ID_ANDROID_MAIN_HOME_SCROLL_JANK;
                        break;
                    case 4:
                        akmmVar = akmm.SPAN_ID_ANDROID_MAIN_WATCH_NEXT_SCROLL_JANK;
                        break;
                    case 5:
                        akmmVar = akmm.SPAN_ID_ANDROID_MAIN_HOME_FRAGMENT_JANK;
                        break;
                    case 6:
                        akmmVar = akmm.SPAN_ID_ANDROID_MAIN_WATCH_PAGE_PORTRAIT_JANK;
                        break;
                    case 7:
                        akmmVar = akmm.SPAN_ID_ANDROID_MAIN_WATCH_MINIMIZE_MAXIMIZE_JANK;
                        break;
                    case 8:
                        akmmVar = akmm.SPAN_ID_ANDROID_MAIN_SEARCH_RESULTS_FRAGMENT_JANK;
                        break;
                    case 9:
                        akmmVar = akmm.SPAN_ID_ANDROID_MAIN_SEARCH_SCROLL_JANK;
                        break;
                    case 10:
                        akmmVar = akmm.SPAN_ID_ANDROID_COMMON_UNKNOWN_EVENT_JANK;
                        break;
                    case 11:
                        akmmVar = akmm.SPAN_ID_ANDROID_COMMON_SHORTS_SCROLL_JANK;
                        break;
                    case 12:
                        akmmVar = akmm.SPAN_ID_ANDROID_COMMON_SHORTS_FRAGMENT_JANK;
                        break;
                    case 13:
                        akmmVar = akmm.SPAN_ID_ANDROID_COMMON_ENGAGEMENT_PANEL_JANK;
                        break;
                    case 14:
                        akmmVar = akmm.SPAN_ID_ANDROID_COMMON_SHORT_TO_SHORT_JANK;
                        break;
                    case 15:
                        akmmVar = akmm.SPAN_ID_ANDROID_COMMON_GENERIC_SCROLL_JANK;
                        break;
                    case 16:
                        akmmVar = akmm.SPAN_ID_ANDROID_MAIN_PAGE_TRANSITION_ANIMATION_JANK;
                        break;
                    case 17:
                        akmmVar = akmm.SPAN_ID_ANDROID_CREATOR_UPLOAD_FRAGMENT_JANK;
                        break;
                    case 18:
                        akmmVar = akmm.SPAN_ID_ANDROID_CREATOR_BROWSE_FRAGMENT_JANK;
                        break;
                    default:
                        akmmVar = null;
                        break;
                }
                if (akmmVar != null) {
                    return true;
                }
                break;
            case 7:
                if (a.aV(i2) != 0) {
                    return true;
                }
                break;
            case 8:
                if (akmx.a(i2) != null) {
                    return true;
                }
                break;
            case 9:
                if (a.aU(i2) != 0) {
                    return true;
                }
                break;
            case 10:
                if (akmy.a(i2) != null) {
                    return true;
                }
                break;
            case 11:
                if (akmz.a(i2) != null) {
                    return true;
                }
                break;
            case 12:
                if (a.bc(i2) != 0) {
                    return true;
                }
                break;
            case 13:
                if (a.bi(i2) != 0) {
                    return true;
                }
                break;
            case 14:
                if (a.aS(i2) != 0) {
                    return true;
                }
                break;
            case 15:
                if (a.aS(i2) != 0) {
                    return true;
                }
                break;
            case 16:
                if (a.bi(i2) != 0) {
                    return true;
                }
                break;
            case 17:
                if (a.aU(i2) != 0) {
                    return true;
                }
                break;
            case 18:
                if (akub.a(i2) != null) {
                    return true;
                }
                break;
            case 19:
                if (a.aS(i2) != 0) {
                    return true;
                }
                break;
            default:
                if (akur.a(i2) != null) {
                    return true;
                }
                break;
        }
        return false;
    }
}
