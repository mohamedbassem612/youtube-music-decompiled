package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxi implements aiht {
    private final /* synthetic */ int $cid;
    public static final aiht u = new fxi(20);
    public static final aiht t = new fxi(19);
    public static final aiht s = new fxi(18);
    public static final aiht r = new fxi(17);
    public static final aiht q = new fxi(16);
    public static final aiht p = new fxi(15);
    public static final aiht o = new fxi(14);
    public static final aiht n = new fxi(13);
    public static final aiht m = new fxi(12);
    public static final aiht l = new fxi(11);
    public static final aiht k = new fxi(10);
    public static final aiht j = new fxi(9);
    public static final aiht i = new fxi(8);
    public static final aiht h = new fxi(7);
    public static final aiht g = new fxi(6);
    public static final aiht f = new fxi(5);
    static final aiht e = new fxi(4);
    static final aiht d = new fxi(3);
    static final aiht c = new fxi(2);
    public static final aiht b = new fxi(1);
    static final aiht a = new fxi(0);

    private fxi(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        aibn aibnVar;
        switch (this.$cid) {
            case 0:
                return CommonApis.h(i2) != 0;
            case 1:
                return a.aS(i2) != 0;
            case 2:
                return a.aX(i2) != 0;
            case 3:
                return kro.aX(i2) != 0;
            case 4:
                return a.bc(i2) != 0;
            case 5:
                return jrj.a(i2) != null;
            case 6:
                return a.bi(i2) != 0;
            case 7:
                return a.aS(i2) != 0;
            case 8:
                return a.bc(i2) != 0;
            case 9:
                return a.aV(i2) != 0;
            case 10:
                return a.aS(i2) != 0;
            case 11:
                return a.bt(i2) != 0;
            case 12:
                return a.aS(i2) != 0;
            case 13:
                return a.aS(i2) != 0;
            case 14:
                return ahnm.a(i2) != null;
            case 15:
                return a.aS(i2) != 0;
            case 16:
                return a.aV(i2) != 0;
            case 17:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 10:
                    case 11:
                    case 12:
                        return true;
                    case 4:
                    case 9:
                    default:
                        return false;
                }
            case 18:
                switch (i2) {
                    case 0:
                        aibnVar = aibn.DEFAULT;
                        break;
                    case 1:
                        aibnVar = aibn.TV;
                        break;
                    case 2:
                        aibnVar = aibn.WEARABLE;
                        break;
                    case 3:
                        aibnVar = aibn.AUTOMOTIVE;
                        break;
                    case 4:
                        aibnVar = aibn.BATTLESTAR;
                        break;
                    case 5:
                        aibnVar = aibn.CHROME_OS;
                        break;
                    case 6:
                        aibnVar = aibn.DESKTOP_ANDROID;
                        break;
                    case 7:
                        aibnVar = aibn.XR;
                        break;
                    case 8:
                        aibnVar = aibn.XR_PERIPHERAL;
                        break;
                    default:
                        aibnVar = null;
                        break;
                }
                return aibnVar != null;
            case 19:
                return aibo.a(i2) != null;
            default:
                return aibp.a(i2) != null;
        }
    }
}
