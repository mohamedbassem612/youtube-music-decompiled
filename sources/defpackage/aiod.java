package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiod implements aiht {
    private final /* synthetic */ int $cid;
    public static final aiht u = new aiod(20);
    public static final aiht t = new aiod(19);
    public static final aiht s = new aiod(18);
    public static final aiht r = new aiod(17);
    public static final aiht q = new aiod(16);
    public static final aiht p = new aiod(15);
    public static final aiht o = new aiod(14);
    public static final aiht n = new aiod(13);
    public static final aiht m = new aiod(12);
    public static final aiht l = new aiod(11);
    public static final aiht k = new aiod(10);
    public static final aiht j = new aiod(9);
    public static final aiht i = new aiod(8);
    public static final aiht h = new aiod(7);
    public static final aiht g = new aiod(6);
    public static final aiht f = new aiod(5);
    public static final aiht e = new aiod(4);
    public static final aiht d = new aiod(3);
    static final aiht c = new aiod(2);
    static final aiht b = new aiod(1);
    static final aiht a = new aiod(0);

    private aiod(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        aioc aiocVar;
        switch (this.$cid) {
            case 0:
                return a.aV(i2) != 0;
            case 1:
                if (i2 == 0) {
                    aiocVar = aioc.BROADCAST_ACTION_UNSPECIFIED;
                } else if (i2 == 1) {
                    aiocVar = aioc.PURCHASES_UPDATED_ACTION;
                } else if (i2 == 2) {
                    aiocVar = aioc.LOCAL_PURCHASES_UPDATED_ACTION;
                } else if (i2 == 3) {
                    aiocVar = aioc.ALTERNATIVE_BILLING_ACTION;
                } else if (i2 != 4) {
                    aiocVar = i2 != 5 ? null : aioc.PLAY_BILLING_ACTIVITY_CREATED_ACTION;
                } else {
                    aiocVar = aioc.IN_APP_BILLING_RESULT_UPDATE_ACTION;
                }
                return aiocVar != null;
            case 2:
                return a.aU(i2) != 0;
            case 3:
                return a.bt(i2) != 0;
            case 4:
                return aiox.a(i2) != null;
            case 5:
                return aioy.a(i2) != null;
            case 6:
                return aipc.a(i2) != null;
            case 7:
                return a.aU(i2) != 0;
            case 8:
                return aipq.a(i2) != null;
            case 9:
                return a.aV(i2) != 0;
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
                    case 11:
                    case 12:
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
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                        return true;
                    case 13:
                    default:
                        return false;
                }
            case 11:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 4:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        return true;
                    case 3:
                    case 5:
                    default:
                        return false;
                }
            case 12:
                return a.be(i2) != 0;
            case 13:
                return airv.a(i2) != null;
            case 14:
                return a.bt(i2) != 0;
            case 15:
                return a.aV(i2) != 0;
            case 16:
                return aisb.a(i2) != null;
            case 17:
                return a.aV(i2) != 0;
            case 18:
                return a.bi(i2) != 0;
            case 19:
                return a.aS(i2) != 0;
            default:
                return a.bc(i2) != 0;
        }
    }
}
