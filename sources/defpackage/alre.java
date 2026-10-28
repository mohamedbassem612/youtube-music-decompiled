package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alre implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new alre(20);
    static final aiht t = new alre(19);
    static final aiht s = new alre(18);
    static final aiht r = new alre(17);
    static final aiht q = new alre(16);
    public static final aiht p = new alre(15);
    static final aiht o = new alre(14);
    static final aiht n = new alre(13);
    static final aiht m = new alre(12);
    static final aiht l = new alre(11);
    static final aiht k = new alre(10);
    static final aiht j = new alre(9);
    static final aiht i = new alre(8);
    static final aiht h = new alre(7);
    static final aiht g = new alre(6);
    static final aiht f = new alre(5);
    static final aiht e = new alre(4);
    static final aiht d = new alre(3);
    static final aiht c = new alre(2);
    static final aiht b = new alre(1);
    static final aiht a = new alre(0);

    private alre(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        alxs alxsVar;
        switch (this.$cid) {
            case 0:
                return a.bh(i2) != 0;
            case 1:
                return a.bi(i2) != 0;
            case 2:
                return CommonApis.e(i2) != 0;
            case 3:
                return a.aU(i2) != 0;
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 3 || i2 == 4 || i2 == 5;
            case 5:
                return a.bc(i2) != 0;
            case 6:
                return a.aV(i2) != 0;
            case 7:
                switch (i2) {
                    case 0:
                        alxsVar = alxs.INPUT_METHOD_UNKNOWN;
                        break;
                    case 1:
                        alxsVar = alxs.KEYBOARD;
                        break;
                    case 2:
                        alxsVar = alxs.PASTE;
                        break;
                    case 3:
                        alxsVar = alxs.ON_SCREEN_KEYBOARD;
                        break;
                    case 4:
                        alxsVar = alxs.IME;
                        break;
                    case 5:
                        alxsVar = alxs.QUERY_BUILDER;
                        break;
                    case 6:
                        alxsVar = alxs.SPEECH;
                        break;
                    case 7:
                        alxsVar = alxs.HANDWRITING;
                        break;
                    case 8:
                        alxsVar = alxs.TAB;
                        break;
                    case 9:
                        alxsVar = alxs.GESTURE_DECODING_DYM_QUERY_BUILDER;
                        break;
                    case 10:
                        alxsVar = alxs.LENS_CAMERA;
                        break;
                    default:
                        alxsVar = null;
                        break;
                }
                return alxsVar != null;
            case 8:
                return a.aV(i2) != 0;
            case 9:
                if (i2 == 23 || i2 == 27 || i2 == 28) {
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
                        return true;
                    default:
                        switch (i2) {
                            case 35:
                            case 36:
                            case 37:
                                return true;
                            default:
                                return false;
                        }
                }
            case 10:
                if (i2 == 18 || i2 == 22) {
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
                        return true;
                    default:
                        return false;
                }
            case 11:
                return a.bc(i2) != 0;
            case 12:
                return a.bf(i2) != 0;
            case 13:
                return afyd.C(i2) != 0;
            case 14:
                return a.aS(i2) != 0;
            case 15:
                return afyd.B(i2) != 0;
            case 16:
                return ambm.a(i2) != null;
            case 17:
                return a.aS(i2) != 0;
            case 18:
                return a.bh(i2) != 0;
            case 19:
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
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                        return true;
                    default:
                        return false;
                }
            default:
                return a.aS(i2) != 0;
        }
    }
}
