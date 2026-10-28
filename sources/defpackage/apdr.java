package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class apdr implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new apdr(20);
    static final aiht t = new apdr(19);
    static final aiht s = new apdr(18);
    static final aiht r = new apdr(17);
    static final aiht q = new apdr(16);
    static final aiht p = new apdr(15);
    static final aiht o = new apdr(14);
    static final aiht n = new apdr(13);
    static final aiht m = new apdr(12);
    static final aiht l = new apdr(11);
    static final aiht k = new apdr(10);
    static final aiht j = new apdr(9);
    static final aiht i = new apdr(8);
    static final aiht h = new apdr(7);
    static final aiht g = new apdr(6);
    static final aiht f = new apdr(5);
    static final aiht e = new apdr(4);
    static final aiht d = new apdr(3);
    static final aiht c = new apdr(2);
    static final aiht b = new apdr(1);
    static final aiht a = new apdr(0);

    private apdr(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        Enum r0 = null;
        switch (this.$cid) {
            case 0:
                if (a.bt(i2) == 0) {
                    return false;
                }
                break;
            case 1:
                if (a.bt(i2) == 0) {
                    return false;
                }
                break;
            case 2:
                if (apdw.a(i2) == null) {
                    return false;
                }
                break;
            case 3:
                if (a.aU(i2) == 0) {
                    return false;
                }
                break;
            case 4:
                if (atqp.H(i2) == 0) {
                    return false;
                }
                break;
            case 5:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 6:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 7:
                if (CommonApis.f(i2) == 0) {
                    return false;
                }
                break;
            case 8:
                if (apft.a(i2) == null) {
                    return false;
                }
                break;
            case 9:
                if (a.be(i2) == 0) {
                    return false;
                }
                break;
            case 10:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 11:
                if (a.bt(i2) == 0) {
                    return false;
                }
                break;
            case 12:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 13:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 14:
                if (aprv.a(i2) == null) {
                    return false;
                }
                break;
            case 15:
                if (CommonApis.e(i2) == 0) {
                    return false;
                }
                break;
            case 16:
                if (aqii.a(i2) == null) {
                    return false;
                }
                break;
            case 17:
                if (i2 == 0) {
                    r0 = aqij.LOW_POWER_MODE_UNKNOWN;
                } else if (i2 == 1) {
                    r0 = aqij.LOW_POWER_MODE_ENABLED;
                } else if (i2 == 2) {
                    r0 = aqij.LOW_POWER_MODE_DISABLED;
                }
                if (r0 == null) {
                    return false;
                }
                break;
            case 18:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 19:
                switch (i2) {
                    case 0:
                        r0 = aqlg.ANDROID_THERMAL_STATUS_UNKNOWN;
                        break;
                    case 1:
                        r0 = aqlg.ANDROID_THERMAL_STATUS_NONE;
                        break;
                    case 2:
                        r0 = aqlg.ANDROID_THERMAL_STATUS_LIGHT;
                        break;
                    case 3:
                        r0 = aqlg.ANDROID_THERMAL_STATUS_MODERATE;
                        break;
                    case 4:
                        r0 = aqlg.ANDROID_THERMAL_STATUS_SEVERE;
                        break;
                    case 5:
                        r0 = aqlg.ANDROID_THERMAL_STATUS_CRITICAL;
                        break;
                    case 6:
                        r0 = aqlg.ANDROID_THERMAL_STATUS_EMERGENCY;
                        break;
                    case 7:
                        r0 = aqlg.ANDROID_THERMAL_STATUS_SHUTDOWN;
                        break;
                }
                if (r0 == null) {
                    return false;
                }
                break;
            default:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
        }
        return true;
    }
}
