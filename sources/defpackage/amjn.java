package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amjn implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new amjn(20);
    static final aiht t = new amjn(19);
    static final aiht s = new amjn(18);
    static final aiht r = new amjn(17);
    static final aiht q = new amjn(16);
    static final aiht p = new amjn(15);
    static final aiht o = new amjn(14);
    static final aiht n = new amjn(13);
    static final aiht m = new amjn(12);
    static final aiht l = new amjn(11);
    static final aiht k = new amjn(10);
    static final aiht j = new amjn(9);
    static final aiht i = new amjn(8);
    static final aiht h = new amjn(7);
    static final aiht g = new amjn(6);
    static final aiht f = new amjn(5);
    public static final aiht e = new amjn(4);
    static final aiht d = new amjn(3);
    static final aiht c = new amjn(2);
    static final aiht b = new amjn(1);
    static final aiht a = new amjn(0);

    private amjn(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        Enum r0 = null;
        switch (this.$cid) {
            case 0:
                return aext.s(i2) != 0;
            case 1:
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
                        return true;
                    default:
                        return false;
                }
            case 2:
                return CommonApis.h(i2) != 0;
            case 3:
                return a.aX(i2) != 0;
            case 4:
                return a.aS(i2) != 0;
            case 5:
                if (i2 == 0) {
                    r0 = amjp.LATENCY_PLAYER_PREFETCH_TYPE_UNKNOWN;
                } else if (i2 == 1) {
                    r0 = amjp.LATENCY_PLAYER_PREFETCH_TYPE_PROMOTE;
                } else if (i2 == 2) {
                    r0 = amjp.LATENCY_PLAYER_PREFETCH_TYPE_CACHE;
                }
                return r0 != null;
            case 6:
                return amjq.a(i2) != null;
            case 7:
                switch (i2) {
                    case 0:
                        r0 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_UNKNOWN;
                        break;
                    case 1:
                        r0 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_START;
                        break;
                    case 2:
                        r0 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOPLAY;
                        break;
                    case 3:
                        r0 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTONAV;
                        break;
                    case 4:
                        r0 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_NEXT;
                        break;
                    case 5:
                        r0 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_PREVIOUS;
                        break;
                    case 6:
                        r0 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_JUMP;
                        break;
                    case 7:
                        r0 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_URL;
                        break;
                    case 8:
                        r0 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_RETRY;
                        break;
                    case 9:
                        r0 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_SWIPE_NEXT;
                        break;
                    case 10:
                        r0 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_SWIPE_PREVIOUS;
                        break;
                    case 11:
                        r0 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_MUTED_AUTOPLAY;
                        break;
                    case 12:
                        r0 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_AUTOADV;
                        break;
                    case 13:
                        r0 = amjr.LATENCY_PLAYER_SET_OPERATION_TYPE_REPLAY;
                        break;
                }
                return r0 != null;
            case 8:
                return amjs.a(i2) != null;
            case 9:
                return a.aS(i2) != 0;
            case 10:
                return a.aV(i2) != 0;
            case 11:
                return a.bc(i2) != 0;
            case 12:
                return amjt.a(i2) != null;
            case 13:
                return a.aS(i2) != 0;
            case 14:
                return a.bt(i2) != 0;
            case 15:
                return a.aV(i2) != 0;
            case 16:
                return a.bg(i2) != 0;
            case 17:
                return amkp.a(i2) != null;
            case 18:
                return amlg.a(i2) != null;
            case 19:
                return a.aS(i2) != 0;
            default:
                return a.bc(i2) != 0;
        }
    }
}
