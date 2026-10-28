package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amys implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new amys(20);
    static final aiht t = new amys(19);
    static final aiht s = new amys(18);
    static final aiht r = new amys(17);
    static final aiht q = new amys(16);
    static final aiht p = new amys(15);
    static final aiht o = new amys(14);
    static final aiht n = new amys(13);
    static final aiht m = new amys(12);
    static final aiht l = new amys(11);
    static final aiht k = new amys(10);
    static final aiht j = new amys(9);
    static final aiht i = new amys(8);
    static final aiht h = new amys(7);
    static final aiht g = new amys(6);
    static final aiht f = new amys(5);
    static final aiht e = new amys(4);
    public static final aiht d = new amys(3);
    static final aiht c = new amys(2);
    static final aiht b = new amys(1);
    static final aiht a = new amys(0);

    private amys(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        amzo amzoVar;
        switch (this.$cid) {
            case 0:
                if (a.aV(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                if (a.aV(i2) != 0) {
                    return true;
                }
                break;
            case 2:
                if (a.aS(i2) != 0) {
                    return true;
                }
                break;
            case 3:
                if (amyt.a(i2) != null) {
                    return true;
                }
                break;
            case 4:
                if (a.bg(i2) != 0) {
                    return true;
                }
                break;
            case 5:
                if (a.bf(i2) != 0) {
                    return true;
                }
                break;
            case 6:
                if (amyu.a(i2) != null) {
                    return true;
                }
                break;
            case 7:
                if (amyv.a(i2) != null) {
                    return true;
                }
                break;
            case 8:
                if (a.bt(i2) != 0) {
                    return true;
                }
                break;
            case 9:
                if (a.aS(i2) != 0) {
                    return true;
                }
                break;
            case 10:
                if (a.aV(i2) != 0) {
                    return true;
                }
                break;
            case 11:
                if (a.aV(i2) != 0) {
                    return true;
                }
                break;
            case 12:
                if (a.aS(i2) != 0) {
                    return true;
                }
                break;
            case 13:
                if (CommonApis.e(i2) != 0) {
                    return true;
                }
                break;
            case 14:
                if (a.bc(i2) != 0) {
                    return true;
                }
                break;
            case 15:
                if (a.aS(i2) != 0) {
                    return true;
                }
                break;
            case 16:
                switch (i2) {
                    case 0:
                        amzoVar = amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_UNKNOWN;
                        break;
                    case 1:
                        amzoVar = amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_NONE;
                        break;
                    case 2:
                        amzoVar = amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_BUNDLE;
                        break;
                    case 3:
                        amzoVar = amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_MEDIA_ID;
                        break;
                    case 4:
                        amzoVar = amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_CALLBACK_ARGUMENT;
                        break;
                    case 5:
                        amzoVar = amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_CURRENT_CONTROLLER_INFO;
                        break;
                    case 6:
                        amzoVar = amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_CURRENT_BROWSER_INFO;
                        break;
                    case 7:
                        amzoVar = amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_GET_CALLING_PACKAGE;
                        break;
                    case 8:
                        amzoVar = amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_LAST_CONNECTED_CLIENT;
                        break;
                    case 9:
                        amzoVar = amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_LAST_CONNECTED_BROWSE_CLIENT;
                        break;
                    case 10:
                        amzoVar = amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_ROOT_MEDIA_ID;
                        break;
                    default:
                        amzoVar = null;
                        break;
                }
                if (amzoVar != null) {
                    return true;
                }
                break;
            case 17:
                if (aext.r(i2) != 0) {
                    return true;
                }
                break;
            case 18:
                if (amzp.a(i2) != null) {
                    return true;
                }
                break;
            case 19:
                if (amzw.a(i2) != null) {
                    return true;
                }
                break;
            default:
                if (agvp.T(i2) != 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}
