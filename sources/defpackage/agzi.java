package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agzi implements aiht {
    private final /* synthetic */ int $cid;
    public static final aiht u = new agzi(20);
    public static final aiht t = new agzi(19);
    public static final aiht s = new agzi(18);
    public static final aiht r = new agzi(17);
    public static final aiht q = new agzi(16);
    public static final aiht p = new agzi(15);
    public static final aiht o = new agzi(14);
    public static final aiht n = new agzi(13);
    public static final aiht m = new agzi(12);
    public static final aiht l = new agzi(11);
    public static final aiht k = new agzi(10);
    public static final aiht j = new agzi(9);
    public static final aiht i = new agzi(8);
    public static final aiht h = new agzi(7);
    public static final aiht g = new agzi(6);
    public static final aiht f = new agzi(5);
    public static final aiht e = new agzi(4);
    public static final aiht d = new agzi(3);
    public static final aiht c = new agzi(2);
    public static final aiht b = new agzi(1);
    static final aiht a = new agzi(0);

    private agzi(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        ahba ahbaVar;
        switch (this.$cid) {
            case 0:
                return a.aV(i2) != 0;
            case 1:
                return CommonApis.e(i2) != 0;
            case 2:
                return a.bt(i2) != 0;
            case 3:
                return CommonApis.b(i2) != 0;
            case 4:
                return CommonApis.d(i2) != 0;
            case 5:
                return a.bt(i2) != 0;
            case 6:
                return CommonApis.b(i2) != 0;
            case 7:
                return a.bc(i2) != 0;
            case 8:
                return agzl.a(i2) != null;
            case 9:
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
                        return true;
                    default:
                        return false;
                }
            case 10:
                return ahng.Z(i2) != 0;
            case 11:
                return aext.e(i2) != 0;
            case 12:
                return a.aW(i2) != 0;
            case 13:
                return ahng.Z(i2) != 0;
            case 14:
                return a.aW(i2) != 0;
            case 15:
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
                        return true;
                    default:
                        return false;
                }
            case 16:
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
                        return true;
                    default:
                        return false;
                }
            case 17:
                return a.aW(i2) != 0;
            case 18:
                switch (i2) {
                    case 0:
                        ahbaVar = ahba.UNKNOWN;
                        break;
                    case 1:
                        ahbaVar = ahba.GROUP_NOT_FOUND;
                        break;
                    case 2:
                        ahbaVar = ahba.NEW_BUILD_ID;
                        break;
                    case 3:
                        ahbaVar = ahba.NEW_VARIANT_ID;
                        break;
                    case 4:
                        ahbaVar = ahba.NEW_VERSION_NUMBER;
                        break;
                    case 5:
                        ahbaVar = ahba.DIFFERENT_FILES;
                        break;
                    case 6:
                        ahbaVar = ahba.DIFFERENT_STALE_LIFETIME;
                        break;
                    case 7:
                        ahbaVar = ahba.DIFFERENT_EXPIRATION_DATE;
                        break;
                    case 8:
                        ahbaVar = ahba.DIFFERENT_DOWNLOAD_CONDITIONS;
                        break;
                    case 9:
                        ahbaVar = ahba.DIFFERENT_ALLOWED_READERS;
                        break;
                    case 10:
                        ahbaVar = ahba.DIFFERENT_DOWNLOAD_POLICY;
                        break;
                    case 11:
                        ahbaVar = ahba.DIFFERENT_EXPERIMENT_INFO;
                        break;
                    case 12:
                        ahbaVar = ahba.DIFFERENT_CUSTOM_METADATA;
                        break;
                    default:
                        ahbaVar = null;
                        break;
                }
                return ahbaVar != null;
            case 19:
                return a.aV(i2) != 0;
            default:
                return a.aV(i2) != 0;
        }
    }
}
